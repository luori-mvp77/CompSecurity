// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c;

import android.os.Parcel;

// Referenced classes of package android.support.v4.c:
//            e

class f
    implements android.os.Parcelable.ClassLoaderCreator
{

    private final e a;

    public f(e e1)
    {
        a = e1;
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a.createFromParcel(parcel, null);
    }

    public Object createFromParcel(Parcel parcel, ClassLoader classloader)
    {
        return a.createFromParcel(parcel, classloader);
    }

    public Object[] newArray(int i)
    {
        return a.newArray(i);
    }
}
