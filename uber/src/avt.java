// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;

public abstract class avt extends Binder
    implements avs
{

    public avt()
    {
        attachInterface(this, "com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    public static avs a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
        if (iinterface != null && (iinterface instanceof avs))
        {
            return (avs)iinterface;
        } else
        {
            return new avu(ibinder);
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
            parcel1.writeString("com.google.android.gms.maps.internal.IOnCameraChangeListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnCameraChangeListener");
            break;
        }
        if (parcel.readInt() != 0)
        {
            azj azj1 = CameraPosition.CREATOR;
            parcel = azj.a(parcel);
        } else
        {
            parcel = null;
        }
        a(parcel);
        parcel1.writeNoException();
        return true;
    }
}
