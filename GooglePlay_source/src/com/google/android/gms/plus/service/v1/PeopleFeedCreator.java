// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.service.v1:
//            PeopleFeed

public final class PeopleFeedCreator
    implements android.os.Parcelable.Creator
{

    public PeopleFeedCreator()
    {
    }

    static void writeToParcel$628e586(PeopleFeed peoplefeed, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = peoplefeed.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, peoplefeed.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeString(parcel, 2, peoplefeed.mEtag, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            SafeParcelWriter.writeTypedList(parcel, 3, peoplefeed.mItems, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, peoplefeed.mNextPageToken, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeString(parcel, 6, peoplefeed.mSelfLink, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeString(parcel, 7, peoplefeed.mTitle, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            SafeParcelWriter.writeInt(parcel, 8, peoplefeed.mTotalItems);
        }
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        String s1 = null;
        String s2 = null;
        java.util.ArrayList arraylist = null;
        String s3 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 4: // '\004'
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s3 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    arraylist = SafeParcelReader.createTypedList(parcel, l, PersonEntity.CREATOR);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 5: // '\005'
                    s2 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s1 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    i = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(8));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != k)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
                }
                return new PeopleFeed(hashset, j, s3, arraylist, s2, s1, s, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PeopleFeed[i];
    }
}
