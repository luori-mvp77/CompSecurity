// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.protocol;

import android.os.Parcel;

// Referenced classes of package com.facebook.zero.protocol:
//            CarrierAndSimMccMnc

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public CarrierAndSimMccMnc a(Parcel parcel)
    {
        return new CarrierAndSimMccMnc(parcel, null);
    }

    public CarrierAndSimMccMnc[] a(int i)
    {
        return new CarrierAndSimMccMnc[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
