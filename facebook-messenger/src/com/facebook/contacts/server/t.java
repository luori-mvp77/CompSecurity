// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.server;

import android.os.Parcel;

// Referenced classes of package com.facebook.contacts.server:
//            FetchMobileAppDataResult

final class t
    implements android.os.Parcelable.Creator
{

    t()
    {
    }

    public FetchMobileAppDataResult a(Parcel parcel)
    {
        return new FetchMobileAppDataResult(parcel, null);
    }

    public FetchMobileAppDataResult[] a(int i)
    {
        return new FetchMobileAppDataResult[i];
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
