// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.zze;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            bd

public class zzw
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bd();
    public final int a;
    public final int b;
    public final zze c[];

    zzw(int i, int j, zze azze[])
    {
        a = i;
        b = j;
        c = azze;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bd.a(this, parcel, i);
    }

}
