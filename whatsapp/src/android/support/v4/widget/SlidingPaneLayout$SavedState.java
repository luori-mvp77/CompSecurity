// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;

class <init> extends android.view.t.SavedState
{

    public static final android.os.out.SavedState._cls1 CREATOR = new _cls1();
    boolean isOpen;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.rcel(parcel, i);
        if (isOpen)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }


    private _cls1(Parcel parcel)
    {
        super(parcel);
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isOpen = flag;
    }

    isOpen(Parcel parcel, isOpen isopen)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public SlidingPaneLayout.SavedState createFromParcel(Parcel parcel)
        {
            return new SlidingPaneLayout.SavedState(parcel, null);
        }

        public Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public SlidingPaneLayout.SavedState[] newArray(int i)
        {
            return new SlidingPaneLayout.SavedState[i];
        }

        public Object[] newArray(int i)
        {
            return newArray(i);
        }

            _cls1()
            {
            }
    }

}
