// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.reward.mediation.client:
//            zzc

public final class RewardItemParcel
    implements SafeParcelable
{

    public static final zzc CREATOR = new zzc();
    public final String type;
    public final int versionCode;
    public final int zzFk;

    public RewardItemParcel(int i, String s, int j)
    {
        versionCode = i;
        type = s;
        zzFk = j;
    }

    public RewardItemParcel(RewardItem rewarditem)
    {
        this(1, rewarditem.getType(), rewarditem.getAmount());
    }

    public RewardItemParcel(String s, int i)
    {
        this(1, s, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

}
