// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

class c
    implements Parcelable
{

    public static final android.os.p.FullSpanItem.c CREATOR = new android.os.Parcelable.Creator() {

        public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem a(Parcel parcel)
        {
            return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(parcel);
        }

        public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] a(int i)
        {
            return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    int a;
    int b;
    int c[];
    boolean d;

    int a(int i)
    {
        if (c == null)
        {
            return 0;
        } else
        {
            return c[i];
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("FullSpanItem{mPosition=").append(a).append(", mGapDir=").append(b).append(", mHasUnwantedGapAfter=").append(d).append(", mGapPerSpan=").append(Arrays.toString(c)).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        if (d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (c != null && c.length > 0)
        {
            parcel.writeInt(c.length);
            parcel.writeIntArray(c);
            return;
        } else
        {
            parcel.writeInt(0);
            return;
        }
    }


    public _cls1()
    {
    }

    public _cls1(Parcel parcel)
    {
        boolean flag = true;
        super();
        a = parcel.readInt();
        b = parcel.readInt();
        int i;
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        d = flag;
        i = parcel.readInt();
        if (i > 0)
        {
            c = new int[i];
            parcel.readIntArray(c);
        }
    }
}
