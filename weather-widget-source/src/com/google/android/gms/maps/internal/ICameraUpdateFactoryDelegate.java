// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.zze;

public interface ICameraUpdateFactoryDelegate
    extends IInterface
{
    public static abstract class zza extends Binder
        implements ICameraUpdateFactoryDelegate
    {

        public static ICameraUpdateFactoryDelegate zzci(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (iinterface != null && (iinterface instanceof ICameraUpdateFactoryDelegate))
            {
                return (ICameraUpdateFactoryDelegate)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj = null;
            zzd zzd1 = null;
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                obj = zoomIn();
                parcel1.writeNoException();
                parcel = obj4;
                if (obj != null)
                {
                    parcel = ((zzd) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                obj = zoomOut();
                parcel1.writeNoException();
                parcel = obj5;
                if (obj != null)
                {
                    parcel = ((zzd) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                obj = scrollBy(parcel.readFloat(), parcel.readFloat());
                parcel1.writeNoException();
                parcel = obj6;
                if (obj != null)
                {
                    parcel = ((zzd) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                obj = zoomTo(parcel.readFloat());
                parcel1.writeNoException();
                parcel = obj7;
                if (obj != null)
                {
                    parcel = ((zzd) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                obj = zoomBy(parcel.readFloat());
                parcel1.writeNoException();
                parcel = obj8;
                if (obj != null)
                {
                    parcel = ((zzd) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                obj = zoomByWithFocus(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                parcel = obj9;
                if (obj != null)
                {
                    parcel = ((zzd) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (parcel.readInt() != 0)
                {
                    parcel = CameraPosition.CREATOR.zzeW(parcel);
                } else
                {
                    parcel = null;
                }
                zzd1 = newCameraPosition(parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (zzd1 != null)
                {
                    parcel = zzd1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (parcel.readInt() != 0)
                {
                    parcel = LatLng.CREATOR.zzfa(parcel);
                } else
                {
                    parcel = null;
                }
                obj = newLatLng(parcel);
                parcel1.writeNoException();
                parcel = zzd1;
                if (obj != null)
                {
                    parcel = ((zzd) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (parcel.readInt() != 0)
                {
                    obj = LatLng.CREATOR.zzfa(parcel);
                } else
                {
                    obj = null;
                }
                obj = newLatLngZoom(((LatLng) (obj)), parcel.readFloat());
                parcel1.writeNoException();
                parcel = obj1;
                if (obj != null)
                {
                    parcel = ((zzd) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (parcel.readInt() != 0)
                {
                    obj = LatLngBounds.CREATOR.zzeZ(parcel);
                } else
                {
                    obj = null;
                }
                obj = newLatLngBounds(((LatLngBounds) (obj)), parcel.readInt());
                parcel1.writeNoException();
                parcel = obj2;
                if (obj != null)
                {
                    parcel = ((zzd) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = LatLngBounds.CREATOR.zzeZ(parcel);
            } else
            {
                obj = null;
            }
            obj = newLatLngBoundsWithSize(((LatLngBounds) (obj)), parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            parcel = obj3;
            if (obj != null)
            {
                parcel = ((zzd) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static class zza.zza
        implements ICameraUpdateFactoryDelegate
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public zzd newCameraPosition(CameraPosition cameraposition)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (cameraposition == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            cameraposition.writeToParcel(parcel, 0);
_L1:
            zznI.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            cameraposition = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return cameraposition;
            parcel.writeInt(0);
              goto _L1
            cameraposition;
            parcel1.recycle();
            parcel.recycle();
            throw cameraposition;
        }

        public zzd newLatLng(LatLng latlng)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latlng == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L1:
            zznI.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            latlng = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return latlng;
            parcel.writeInt(0);
              goto _L1
            latlng;
            parcel1.recycle();
            parcel.recycle();
            throw latlng;
        }

        public zzd newLatLngBounds(LatLngBounds latlngbounds, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latlngbounds == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            parcel.writeInt(1);
            latlngbounds.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(i);
            zznI.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            latlngbounds = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return latlngbounds;
            parcel.writeInt(0);
              goto _L1
            latlngbounds;
            parcel1.recycle();
            parcel.recycle();
            throw latlngbounds;
        }

        public zzd newLatLngBoundsWithSize(LatLngBounds latlngbounds, int i, int j, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latlngbounds == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            parcel.writeInt(1);
            latlngbounds.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(i);
            parcel.writeInt(j);
            parcel.writeInt(k);
            zznI.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            latlngbounds = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return latlngbounds;
            parcel.writeInt(0);
              goto _L1
            latlngbounds;
            parcel1.recycle();
            parcel.recycle();
            throw latlngbounds;
        }

        public zzd newLatLngZoom(LatLng latlng, float f)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (latlng == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            parcel.writeInt(1);
            latlng.writeToParcel(parcel, 0);
_L1:
            parcel.writeFloat(f);
            zznI.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            latlng = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return latlng;
            parcel.writeInt(0);
              goto _L1
            latlng;
            parcel1.recycle();
            parcel.recycle();
            throw latlng;
        }

        public zzd scrollBy(float f, float f1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzd zzd;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            parcel.writeFloat(f);
            parcel.writeFloat(f1);
            zznI.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            zzd = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public zzd zoomBy(float f)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzd zzd;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            parcel.writeFloat(f);
            zznI.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            zzd = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public zzd zoomByWithFocus(float f, int i, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzd zzd;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            parcel.writeFloat(f);
            parcel.writeInt(i);
            parcel.writeInt(j);
            zznI.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            zzd = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public zzd zoomIn()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzd zzd;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzd = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public zzd zoomOut()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzd zzd;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            zznI.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            zzd = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public zzd zoomTo(float f)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            zzd zzd;
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            parcel.writeFloat(f);
            zznI.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            zzd = com.google.android.gms.dynamic.zzd.zza.zzbk(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzd;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract zzd newCameraPosition(CameraPosition cameraposition)
        throws RemoteException;

    public abstract zzd newLatLng(LatLng latlng)
        throws RemoteException;

    public abstract zzd newLatLngBounds(LatLngBounds latlngbounds, int i)
        throws RemoteException;

    public abstract zzd newLatLngBoundsWithSize(LatLngBounds latlngbounds, int i, int j, int k)
        throws RemoteException;

    public abstract zzd newLatLngZoom(LatLng latlng, float f)
        throws RemoteException;

    public abstract zzd scrollBy(float f, float f1)
        throws RemoteException;

    public abstract zzd zoomBy(float f)
        throws RemoteException;

    public abstract zzd zoomByWithFocus(float f, int i, int j)
        throws RemoteException;

    public abstract zzd zoomIn()
        throws RemoteException;

    public abstract zzd zoomOut()
        throws RemoteException;

    public abstract zzd zoomTo(float f)
        throws RemoteException;
}
