// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            bg, bi

public abstract class bh extends Binder
    implements bg
{

    public bh()
    {
        attachInterface(this, "com.google.android.apps.youtube.api.service.jar.ISurveyOverlayService");
    }

    public static bg a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.apps.youtube.api.service.jar.ISurveyOverlayService");
        if (iinterface != null && (iinterface instanceof bg))
        {
            return (bg)iinterface;
        } else
        {
            return new bi(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.apps.youtube.api.service.jar.ISurveyOverlayService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.ISurveyOverlayService");
            a(parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.apps.youtube.api.service.jar.ISurveyOverlayService");
            a(parcel.createIntArray());
            parcel1.writeNoException();
            return true;
        }
    }
}
