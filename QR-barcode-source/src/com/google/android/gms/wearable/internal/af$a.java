// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            af, b, aq, ad

public static abstract class a.lb extends Binder
    implements af
{
    private static class a
        implements af
    {

        private IBinder lb;

        public void a(ad ad1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            lb.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        public void a(ad ad1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null) goto _L2; else goto _L1
_L1:
            ad1 = ad1.asBinder();
_L5:
            parcel.writeStrongBinder(ad1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            lb.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ad1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
              goto _L5
        }

        public void a(ad ad1, Asset asset)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null) goto _L2; else goto _L1
_L1:
            ad1 = ad1.asBinder();
_L5:
            parcel.writeStrongBinder(ad1);
            if (asset == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            asset.writeToParcel(parcel, 0);
_L6:
            lb.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ad1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
              goto _L5
        }

        public void a(ad ad1, PutDataRequest putdatarequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null) goto _L2; else goto _L1
_L1:
            ad1 = ad1.asBinder();
_L5:
            parcel.writeStrongBinder(ad1);
            if (putdatarequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            putdatarequest.writeToParcel(parcel, 0);
_L6:
            lb.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ad1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
              goto _L5
        }

        public void a(ad ad1, c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null) goto _L2; else goto _L1
_L1:
            ad1 = ad1.asBinder();
_L5:
            parcel.writeStrongBinder(ad1);
            if (c1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            c1.writeToParcel(parcel, 0);
_L6:
            lb.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ad1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
              goto _L5
        }

        public void a(ad ad1, aq aq1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null) goto _L2; else goto _L1
_L1:
            ad1 = ad1.asBinder();
_L5:
            parcel.writeStrongBinder(ad1);
            if (aq1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            aq1.writeToParcel(parcel, 0);
_L6:
            lb.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ad1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
              goto _L5
        }

        public void a(ad ad1, b b1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null) goto _L2; else goto _L1
_L1:
            ad1 = ad1.asBinder();
_L5:
            parcel.writeStrongBinder(ad1);
            if (b1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            b1.writeToParcel(parcel, 0);
_L6:
            lb.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ad1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
              goto _L5
        }

        public void a(ad ad1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            parcel.writeString(s);
            lb.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        public void a(ad ad1, String s, String s1, byte abyte0[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeByteArray(abyte0);
            lb.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        public IBinder asBinder()
        {
            return lb;
        }

        public void b(ad ad1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            lb.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        public void b(ad ad1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null) goto _L2; else goto _L1
_L1:
            ad1 = ad1.asBinder();
_L5:
            parcel.writeStrongBinder(ad1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            lb.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ad1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
              goto _L5
        }

        public void b(ad ad1, c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null) goto _L2; else goto _L1
_L1:
            ad1 = ad1.asBinder();
_L5:
            parcel.writeStrongBinder(ad1);
            if (c1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            c1.writeToParcel(parcel, 0);
_L6:
            lb.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ad1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
              goto _L5
        }

        public void b(ad ad1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            parcel.writeString(s);
            lb.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        public void c(ad ad1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            lb.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        public void c(ad ad1, Uri uri)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null) goto _L2; else goto _L1
_L1:
            ad1 = ad1.asBinder();
_L5:
            parcel.writeStrongBinder(ad1);
            if (uri == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            uri.writeToParcel(parcel, 0);
_L6:
            lb.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            ad1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
              goto _L5
        }

        public void c(ad ad1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            parcel.writeString(s);
            lb.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        public void d(ad ad1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            lb.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        public void e(ad ad1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            lb.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        public void f(ad ad1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            lb.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        public void g(ad ad1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            lb.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        public void h(ad ad1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            lb.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        public void i(ad ad1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            ad1 = ad1.asBinder();
_L1:
            parcel.writeStrongBinder(ad1);
            lb.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ad1 = null;
              goto _L1
            ad1;
            parcel1.recycle();
            parcel.recycle();
            throw ad1;
        }

        a(IBinder ibinder)
        {
            lb = ibinder;
        }
    }


    public static af bT(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (iinterface != null && (iinterface instanceof af))
        {
            return (af)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        ad ad = null;
        ad ad8 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        c c1 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wearable.internal.IWearableService");
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            ad = bR(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                c1 = (c)c.CREATOR.createFromParcel(parcel);
            }
            a(ad, c1);
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(bR(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(bR(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(bR(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            c(bR(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            ad8 = bR(parcel.readStrongBinder());
            Object obj = ad;
            if (parcel.readInt() != 0)
            {
                obj = (PutDataRequest)PutDataRequest.CREATOR.createFromParcel(parcel);
            }
            a(ad8, ((PutDataRequest) (obj)));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            ad ad1 = bR(parcel.readStrongBinder());
            Object obj1 = ad8;
            if (parcel.readInt() != 0)
            {
                obj1 = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            a(ad1, ((Uri) (obj1)));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(bR(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            ad ad2 = bR(parcel.readStrongBinder());
            Uri uri = obj2;
            if (parcel.readInt() != 0)
            {
                uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            b(ad2, uri);
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            ad ad3 = bR(parcel.readStrongBinder());
            Uri uri1 = obj3;
            if (parcel.readInt() != 0)
            {
                uri1 = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            c(ad3, uri1);
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(bR(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray());
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            ad ad4 = bR(parcel.readStrongBinder());
            Asset asset = obj4;
            if (parcel.readInt() != 0)
            {
                asset = (Asset)Asset.CREATOR.createFromParcel(parcel);
            }
            a(ad4, asset);
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            c(bR(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            d(bR(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            ad ad5 = bR(parcel.readStrongBinder());
            b b1 = obj5;
            if (parcel.readInt() != 0)
            {
                b1 = (b)b.CREATOR.createFromParcel(parcel);
            }
            a(ad5, b1);
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            ad ad6 = bR(parcel.readStrongBinder());
            aq aq1 = obj6;
            if (parcel.readInt() != 0)
            {
                aq1 = (aq)aq.CREATOR.createFromParcel(parcel);
            }
            a(ad6, aq1);
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e(bR(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            f(bR(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            ad ad7 = bR(parcel.readStrongBinder());
            c c2 = obj7;
            if (parcel.readInt() != 0)
            {
                c2 = (c)c.CREATOR.createFromParcel(parcel);
            }
            b(ad7, c2);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            g(bR(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            h(bR(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            i(bR(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
