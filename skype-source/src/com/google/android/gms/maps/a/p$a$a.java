// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.b.c;
import com.google.android.gms.maps.model.a.f;

// Referenced classes of package com.google.android.gms.maps.a:
//            p

private static final class a
    implements p
{

    private IBinder a;

    public final c a(f f1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        f1 = f1.asBinder();
_L1:
        parcel.writeStrongBinder(f1);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        f1 = com.google.android.gms.b.(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return f1;
        f1 = null;
          goto _L1
        f1;
        parcel1.recycle();
        parcel.recycle();
        throw f1;
    }

    public final IBinder asBinder()
    {
        return a;
    }

    public final c b(f f1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        f1 = f1.asBinder();
_L1:
        parcel.writeStrongBinder(f1);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        f1 = com.google.android.gms.b.(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return f1;
        f1 = null;
          goto _L1
        f1;
        parcel1.recycle();
        parcel.recycle();
        throw f1;
    }

    f(IBinder ibinder)
    {
        a = ibinder;
    }
}
