// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Parcel;

// Referenced classes of package com.whatsapp.messaging:
//            a0

final class ae
    implements android.os.Parcelable.Creator
{

    ae()
    {
    }

    public a0 a(Parcel parcel)
    {
        return new a0(parcel, null);
    }

    public a0[] a(int i)
    {
        return new a0[i];
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
