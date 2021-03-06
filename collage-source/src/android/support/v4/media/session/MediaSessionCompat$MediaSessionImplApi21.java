// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.VolumeProviderCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompat, MediaSessionCompatApi21, PlaybackStateCompat, MediaSessionCompatApi22

static class mSessionObj
    implements mSessionObj
{

    private PendingIntent mMediaButtonIntent;
    private final Object mSessionObj;
    private final mSessionObj mToken;

    public Object getMediaSession()
    {
        return mSessionObj;
    }

    public Object getRemoteControlClient()
    {
        return null;
    }

    public mSessionObj getSessionToken()
    {
        return mToken;
    }

    public boolean isActive()
    {
        return MediaSessionCompatApi21.isActive(mSessionObj);
    }

    public void release()
    {
        MediaSessionCompatApi21.release(mSessionObj);
    }

    public void sendSessionEvent(String s, Bundle bundle)
    {
        MediaSessionCompatApi21.sendSessionEvent(mSessionObj, s, bundle);
    }

    public void setActive(boolean flag)
    {
        MediaSessionCompatApi21.setActive(mSessionObj, flag);
    }

    public void setCallback(mSessionObj msessionobj, Handler handler)
    {
        Object obj = mSessionObj;
        if (msessionobj == null)
        {
            msessionobj = null;
        } else
        {
            msessionobj = ((mSessionObj) (msessionobj.mSessionObj));
        }
        MediaSessionCompatApi21.setCallback(obj, msessionobj, handler);
    }

    public void setExtras(Bundle bundle)
    {
        MediaSessionCompatApi21.setExtras(mSessionObj, bundle);
    }

    public void setFlags(int i)
    {
        MediaSessionCompatApi21.setFlags(mSessionObj, i);
    }

    public void setMediaButtonReceiver(PendingIntent pendingintent)
    {
        mMediaButtonIntent = pendingintent;
        MediaSessionCompatApi21.setMediaButtonReceiver(mSessionObj, pendingintent);
    }

    public void setMetadata(MediaMetadataCompat mediametadatacompat)
    {
        Object obj = mSessionObj;
        if (mediametadatacompat == null)
        {
            mediametadatacompat = null;
        } else
        {
            mediametadatacompat = ((MediaMetadataCompat) (mediametadatacompat.getMediaMetadata()));
        }
        MediaSessionCompatApi21.setMetadata(obj, mediametadatacompat);
    }

    public void setPlaybackState(PlaybackStateCompat playbackstatecompat)
    {
        Object obj = mSessionObj;
        if (playbackstatecompat == null)
        {
            playbackstatecompat = null;
        } else
        {
            playbackstatecompat = ((PlaybackStateCompat) (playbackstatecompat.getPlaybackState()));
        }
        MediaSessionCompatApi21.setPlaybackState(obj, playbackstatecompat);
    }

    public void setPlaybackToLocal(int i)
    {
        MediaSessionCompatApi21.setPlaybackToLocal(mSessionObj, i);
    }

    public void setPlaybackToRemote(VolumeProviderCompat volumeprovidercompat)
    {
        MediaSessionCompatApi21.setPlaybackToRemote(mSessionObj, volumeprovidercompat.getVolumeProvider());
    }

    public void setQueue(List list)
    {
        ArrayList arraylist = null;
        if (list != null)
        {
            arraylist = new ArrayList();
            for (list = list.iterator(); list.hasNext(); arraylist.add(((mSessionObj)list.next()).())) { }
        }
        MediaSessionCompatApi21.setQueue(mSessionObj, arraylist);
    }

    public void setQueueTitle(CharSequence charsequence)
    {
        MediaSessionCompatApi21.setQueueTitle(mSessionObj, charsequence);
    }

    public void setRatingType(int i)
    {
        if (android.os.MediaSessionImplApi21 < 22)
        {
            return;
        } else
        {
            MediaSessionCompatApi22.setRatingType(mSessionObj, i);
            return;
        }
    }

    public void setSessionActivity(PendingIntent pendingintent)
    {
        MediaSessionCompatApi21.setSessionActivity(mSessionObj, pendingintent);
    }

    public (Context context, String s)
    {
        mSessionObj = MediaSessionCompatApi21.createSession(context, s);
        mToken = new mToken(MediaSessionCompatApi21.getSessionToken(mSessionObj));
    }

    public mSessionObj(Object obj)
    {
        mSessionObj = MediaSessionCompatApi21.verifySession(obj);
        mToken = new mToken(MediaSessionCompatApi21.getSessionToken(mSessionObj));
    }
}
