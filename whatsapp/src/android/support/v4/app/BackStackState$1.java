// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;

// Referenced classes of package android.support.v4.app:
//            BackStackState

final class 
    implements android.os.r
{

    public BackStackState createFromParcel(Parcel parcel)
    {
        return new BackStackState(parcel);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public BackStackState[] newArray(int i)
    {
        return new BackStackState[i];
    }

    public Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
