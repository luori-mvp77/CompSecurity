// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.internal.a;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IMapViewDelegate, IStreetViewPanoramaViewDelegate, IMapFragmentDelegate, IStreetViewPanoramaFragmentDelegate, 
//            ICameraUpdateFactoryDelegate

public interface c
    extends IInterface
{
    public static abstract class a extends Binder
        implements c
    {

        public static c aP(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
            if (iinterface != null && (iinterface instanceof c))
            {
                return (c)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int l, Parcel parcel, Parcel parcel1, int i1)
            throws RemoteException
        {
            Object obj = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj1 = null;
            Object obj5 = null;
            Object obj2 = null;
            switch (l)
            {
            default:
                return super.onTransact(l, parcel, parcel1, i1);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.ICreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                i(com.google.android.gms.dynamic.d.a.am(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj = j(com.google.android.gms.dynamic.d.a.am(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = obj2;
                if (obj != null)
                {
                    parcel = ((IMapFragmentDelegate) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj1 = com.google.android.gms.dynamic.d.a.am(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    parcel = GoogleMapOptions.CREATOR.cG(parcel);
                } else
                {
                    parcel = null;
                }
                obj1 = a(((d) (obj1)), parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (obj1 != null)
                {
                    parcel = ((IMapViewDelegate) (obj1)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj = mI();
                parcel1.writeNoException();
                parcel = obj3;
                if (obj != null)
                {
                    parcel = ((ICameraUpdateFactoryDelegate) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj = mJ();
                parcel1.writeNoException();
                parcel = obj4;
                if (obj != null)
                {
                    parcel = ((com.google.android.gms.maps.model.internal.a) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                a(com.google.android.gms.dynamic.d.a.am(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj = com.google.android.gms.dynamic.d.a.am(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    parcel = StreetViewPanoramaOptions.CREATOR.cH(parcel);
                } else
                {
                    parcel = null;
                }
                obj = a(((d) (obj)), parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj1));
                if (obj != null)
                {
                    parcel = ((IStreetViewPanoramaViewDelegate) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
                obj = k(com.google.android.gms.dynamic.d.a.am(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = obj5;
                break;
            }
            if (obj != null)
            {
                parcel = ((IStreetViewPanoramaFragmentDelegate) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static class a.a
        implements c
    {

        private IBinder lb;

        public IMapViewDelegate a(d d1, GoogleMapOptions googlemapoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (d1 == null) goto _L2; else goto _L1
_L1:
            d1 = d1.asBinder();
_L5:
            parcel.writeStrongBinder(d1);
            if (googlemapoptions == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            googlemapoptions.writeToParcel(parcel, 0);
_L6:
            lb.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            d1 = IMapViewDelegate.a.aU(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
_L2:
            d1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
              goto _L5
        }

        public IStreetViewPanoramaViewDelegate a(d d1, StreetViewPanoramaOptions streetviewpanoramaoptions)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (d1 == null) goto _L2; else goto _L1
_L1:
            d1 = d1.asBinder();
_L5:
            parcel.writeStrongBinder(d1);
            if (streetviewpanoramaoptions == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            streetviewpanoramaoptions.writeToParcel(parcel, 0);
_L6:
            lb.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            d1 = IStreetViewPanoramaViewDelegate.a.bn(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
_L2:
            d1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
              goto _L5
        }

        public void a(d d1, int l)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            d1 = d1.asBinder();
_L1:
            parcel.writeStrongBinder(d1);
            parcel.writeInt(l);
            lb.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            d1 = null;
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public IBinder asBinder()
        {
            return lb;
        }

        public void i(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            d1 = d1.asBinder();
_L1:
            parcel.writeStrongBinder(d1);
            lb.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            d1 = null;
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public IMapFragmentDelegate j(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            d1 = d1.asBinder();
_L1:
            parcel.writeStrongBinder(d1);
            lb.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            d1 = IMapFragmentDelegate.a.aT(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            d1 = null;
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public IStreetViewPanoramaFragmentDelegate k(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            d1 = d1.asBinder();
_L1:
            parcel.writeStrongBinder(d1);
            lb.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            d1 = IStreetViewPanoramaFragmentDelegate.a.bm(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            d1 = null;
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public ICameraUpdateFactoryDelegate mI()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            ICameraUpdateFactoryDelegate icameraupdatefactorydelegate;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            lb.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            icameraupdatefactorydelegate = ICameraUpdateFactoryDelegate.a.aN(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return icameraupdatefactorydelegate;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public com.google.android.gms.maps.model.internal.a mJ()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            com.google.android.gms.maps.model.internal.a a1;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
            lb.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            a1 = com.google.android.gms.maps.model.internal.a.a.bp(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return a1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        a.a(IBinder ibinder)
        {
            lb = ibinder;
        }
    }


    public abstract IMapViewDelegate a(d d, GoogleMapOptions googlemapoptions)
        throws RemoteException;

    public abstract IStreetViewPanoramaViewDelegate a(d d, StreetViewPanoramaOptions streetviewpanoramaoptions)
        throws RemoteException;

    public abstract void a(d d, int l)
        throws RemoteException;

    public abstract void i(d d)
        throws RemoteException;

    public abstract IMapFragmentDelegate j(d d)
        throws RemoteException;

    public abstract IStreetViewPanoramaFragmentDelegate k(d d)
        throws RemoteException;

    public abstract ICameraUpdateFactoryDelegate mI()
        throws RemoteException;

    public abstract com.google.android.gms.maps.model.internal.a mJ()
        throws RemoteException;
}
