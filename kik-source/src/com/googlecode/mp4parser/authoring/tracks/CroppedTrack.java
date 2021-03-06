// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CroppedTrack extends AbstractTrack
{

    static final boolean $assertionsDisabled;
    private int fromSample;
    Track origTrack;
    private int toSample;

    public CroppedTrack(Track track, long l, long l1)
    {
        super((new StringBuilder("crop(")).append(track.getName()).append(")").toString());
        origTrack = track;
        if (!$assertionsDisabled && l > 0x7fffffffL)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && l1 > 0x7fffffffL)
        {
            throw new AssertionError();
        } else
        {
            fromSample = (int)l;
            toSample = (int)l1;
            return;
        }
    }

    static List getCompositionTimeEntries(List list, long l, long l1)
    {
        if (list != null && !list.isEmpty())
        {
            ListIterator listiterator = list.listIterator();
            ArrayList arraylist = new ArrayList();
            long l2 = 0L;
            do
            {
                list = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry)listiterator.next();
                if ((long)list.getCount() + l2 > l)
                {
                    if ((long)list.getCount() + l2 >= l1)
                    {
                        arraylist.add(new com.coremedia.iso.boxes.CompositionTimeToSample.Entry((int)(l1 - l), list.getOffset()));
                        return arraylist;
                    }
                    break;
                }
                l2 = (long)list.getCount() + l2;
            } while (true);
            arraylist.add(new com.coremedia.iso.boxes.CompositionTimeToSample.Entry((int)(((long)list.getCount() + l2) - l), list.getOffset()));
            l = l2 + (long)list.getCount();
            do
            {
label0:
                {
                    if (listiterator.hasNext())
                    {
                        list = (com.coremedia.iso.boxes.CompositionTimeToSample.Entry)listiterator.next();
                        if ((long)list.getCount() + l < l1)
                        {
                            break label0;
                        }
                    }
                    arraylist.add(new com.coremedia.iso.boxes.CompositionTimeToSample.Entry((int)(l1 - l), list.getOffset()));
                    return arraylist;
                }
                arraylist.add(list);
                l += list.getCount();
            } while (true);
        } else
        {
            return null;
        }
    }

    static List getDecodingTimeEntries(List list, long l, long l1)
    {
        if (list != null && !list.isEmpty())
        {
            ListIterator listiterator = list.listIterator();
            LinkedList linkedlist = new LinkedList();
            long l2 = 0L;
            do
            {
                list = (com.coremedia.iso.boxes.TimeToSampleBox.Entry)listiterator.next();
                if (list.getCount() + l2 > l)
                {
                    if (list.getCount() + l2 >= l1)
                    {
                        linkedlist.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(l1 - l, list.getDelta()));
                        return linkedlist;
                    }
                    break;
                }
                l2 = list.getCount() + l2;
            } while (true);
            linkedlist.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry((list.getCount() + l2) - l, list.getDelta()));
            l = l2 + list.getCount();
            do
            {
label0:
                {
                    if (listiterator.hasNext())
                    {
                        list = (com.coremedia.iso.boxes.TimeToSampleBox.Entry)listiterator.next();
                        if (list.getCount() + l < l1)
                        {
                            break label0;
                        }
                    }
                    linkedlist.add(new com.coremedia.iso.boxes.TimeToSampleBox.Entry(l1 - l, list.getDelta()));
                    return linkedlist;
                }
                linkedlist.add(list);
                l += list.getCount();
            } while (true);
        } else
        {
            return null;
        }
    }

    public void close()
    {
        origTrack.close();
    }

    public List getCompositionTimeEntries()
    {
        return getCompositionTimeEntries(origTrack.getCompositionTimeEntries(), fromSample, toSample);
    }

    public String getHandler()
    {
        return origTrack.getHandler();
    }

    public List getSampleDependencies()
    {
        if (origTrack.getSampleDependencies() != null && !origTrack.getSampleDependencies().isEmpty())
        {
            return origTrack.getSampleDependencies().subList(fromSample, toSample);
        } else
        {
            return null;
        }
    }

    public SampleDescriptionBox getSampleDescriptionBox()
    {
        return origTrack.getSampleDescriptionBox();
    }

    public long[] getSampleDurations()
    {
        this;
        JVM INSTR monitorenter ;
        long al[];
        al = new long[toSample - fromSample];
        System.arraycopy(origTrack.getSampleDurations(), fromSample, al, 0, al.length);
        this;
        JVM INSTR monitorexit ;
        return al;
        Exception exception;
        exception;
        throw exception;
    }

    public List getSamples()
    {
        return origTrack.getSamples().subList(fromSample, toSample);
    }

    public SubSampleInformationBox getSubsampleInformationBox()
    {
        return origTrack.getSubsampleInformationBox();
    }

    public long[] getSyncSamples()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (origTrack.getSyncSamples() == null) goto _L2; else goto _L1
_L1:
        long al[];
        int k;
        al = origTrack.getSyncSamples();
        k = al.length;
        int i = 0;
_L14:
        int j = k;
        if (i >= al.length) goto _L4; else goto _L3
_L3:
        if (al[i] < (long)fromSample) goto _L6; else goto _L5
_L5:
        j = k;
_L4:
        if (j <= 0) goto _L8; else goto _L7
_L7:
        if ((long)toSample < al[j - 1]) goto _L9; else goto _L8
_L8:
        al = Arrays.copyOfRange(origTrack.getSyncSamples(), i, j);
        i = ((flag) ? 1 : 0);
_L12:
        j = al.length;
        if (i < j) goto _L11; else goto _L10
_L10:
        this;
        JVM INSTR monitorexit ;
        return al;
_L6:
        i++;
        continue; /* Loop/switch isn't completed */
_L9:
        j--;
          goto _L4
_L11:
        al[i] = al[i] - (long)fromSample;
        i++;
          goto _L12
_L2:
        al = null;
          goto _L10
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public TrackMetaData getTrackMetaData()
    {
        return origTrack.getTrackMetaData();
    }

    static 
    {
        boolean flag;
        if (!com/googlecode/mp4parser/authoring/tracks/CroppedTrack.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
