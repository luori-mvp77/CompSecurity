// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class oix extends android.view.View.BaseSavedState
{

    public static final android.os.Parcelable.Creator CREATOR = new oiy();
    public final boolean a;
    public final int b;
    public final int c;

    oix(Parcel parcel)
    {
        boolean flag = true;
        super(parcel);
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        a = flag;
        b = parcel.readInt();
        c = parcel.readInt();
    }

    public oix(Parcelable parcelable, boolean flag, int i, int j)
    {
        super(parcelable);
        a = flag;
        b = i;
        c = j;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeInt(b);
        parcel.writeInt(c);
    }

}
