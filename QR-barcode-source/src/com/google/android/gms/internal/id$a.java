// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            id, ic

public static abstract class a.lb extends Binder
    implements id
{
    private static class a
        implements id
    {

        private IBinder lb;

        public void a(ic ic1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ic1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            ic1 = ic1.asBinder();
_L1:
            parcel.writeStrongBinder(ic1);
            lb.transact(5005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ic1 = null;
              goto _L1
            ic1;
            parcel1.recycle();
            parcel.recycle();
            throw ic1;
        }

        public void a(ic ic1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ic1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            ic1 = ic1.asBinder();
_L1:
            parcel.writeStrongBinder(ic1);
            parcel.writeInt(i);
            lb.transact(5004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ic1 = null;
              goto _L1
            ic1;
            parcel1.recycle();
            parcel.recycle();
            throw ic1;
        }

        public void a(ic ic1, int i, String s, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ic1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            ic1 = ic1.asBinder();
_L1:
            parcel.writeStrongBinder(ic1);
            parcel.writeInt(i);
            parcel.writeString(s);
            parcel.writeByteArray(abyte0);
            lb.transact(5006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ic1 = null;
              goto _L1
            ic1;
            parcel1.recycle();
            parcel.recycle();
            throw ic1;
        }

        public void a(ic ic1, int i, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ic1 == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            ic1 = ic1.asBinder();
_L1:
            parcel.writeStrongBinder(ic1);
            parcel.writeInt(i);
            parcel.writeByteArray(abyte0);
            lb.transact(5003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ic1 = null;
              goto _L1
            ic1;
            parcel1.recycle();
            parcel.recycle();
            throw ic1;
        }

        public IBinder asBinder()
        {
            return lb;
        }

        public void b(ic ic1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ic1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            ic1 = ic1.asBinder();
_L1:
            parcel.writeStrongBinder(ic1);
            lb.transact(5008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ic1 = null;
              goto _L1
            ic1;
            parcel1.recycle();
            parcel.recycle();
            throw ic1;
        }

        public void b(ic ic1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ic1 == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            ic1 = ic1.asBinder();
_L1:
            parcel.writeStrongBinder(ic1);
            parcel.writeInt(i);
            lb.transact(5007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ic1 = null;
              goto _L1
            ic1;
            parcel1.recycle();
            parcel.recycle();
            throw ic1;
        }

        public void c(ic ic1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            if (ic1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            ic1 = ic1.asBinder();
_L1:
            parcel.writeStrongBinder(ic1);
            lb.transact(5009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ic1 = null;
              goto _L1
            ic1;
            parcel1.recycle();
            parcel.recycle();
            throw ic1;
        }

        public int fq()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            lb.transact(5001, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public int fr()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
            lb.transact(5002, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            parcel1.recycle();
            parcel.recycle();
            return i;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        a(IBinder ibinder)
        {
            lb = ibinder;
        }
    }


    public static id K(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateService");
        if (iinterface != null && (iinterface instanceof id))
        {
            return (id)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.appstate.internal.IAppStateService");
            return true;

        case 5001: 
            parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
            i = fq();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 5002: 
            parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
            i = fr();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 5003: 
            parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
            a(J(parcel.readStrongBinder()), parcel.readInt(), parcel.createByteArray());
            parcel1.writeNoException();
            return true;

        case 5004: 
            parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
            a(J(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5005: 
            parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
            a(J(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5006: 
            parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
            a(J(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.createByteArray());
            parcel1.writeNoException();
            return true;

        case 5007: 
            parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
            b(J(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5008: 
            parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
            b(J(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5009: 
            parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateService");
            c(J(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
