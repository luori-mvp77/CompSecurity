// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzf;

public interface zzd
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzd
    {

        public static zzd zzcm(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            if (iinterface != null && (iinterface instanceof zzd))
            {
                return (zzd)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            com.google.android.gms.dynamic.zzd zzd2 = null;
            com.google.android.gms.dynamic.zzd zzd1 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                zzd2 = zzf(com.google.android.gms.maps.model.internal.zzf.zza.zzcT(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = zzd1;
                if (zzd2 != null)
                {
                    parcel = zzd2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
                zzd1 = zzg(com.google.android.gms.maps.model.internal.zzf.zza.zzcT(parcel.readStrongBinder()));
                parcel1.writeNoException();
                parcel = zzd2;
                break;
            }
            if (zzd1 != null)
            {
                parcel = zzd1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.maps.internal.IInfoWindowAdapter");
        }
    }

    private static class zza.zza
        implements zzd
    {

        private IBinder zznI;

        public IBinder asBinder()
        {
            return zznI;
        }

        public com.google.android.gms.dynamic.zzd zzf(zzf zzf1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            if (zzf1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            zzf1 = zzf1.asBinder();
_L1:
            parcel.writeStrongBinder(zzf1);
            zznI.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            zzf1 = com.google.android.gms.dynamic.zza.zzbk(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzf1;
            zzf1 = null;
              goto _L1
            zzf1;
            parcel1.recycle();
            parcel.recycle();
            throw zzf1;
        }

        public com.google.android.gms.dynamic.zzd zzg(zzf zzf1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            if (zzf1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            zzf1 = zzf1.asBinder();
_L1:
            parcel.writeStrongBinder(zzf1);
            zznI.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            zzf1 = com.google.android.gms.dynamic.zza.zzbk(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return zzf1;
            zzf1 = null;
              goto _L1
            zzf1;
            parcel1.recycle();
            parcel.recycle();
            throw zzf1;
        }

        zza.zza(IBinder ibinder)
        {
            zznI = ibinder;
        }
    }


    public abstract com.google.android.gms.dynamic.zzd zzf(zzf zzf1)
        throws RemoteException;

    public abstract com.google.android.gms.dynamic.zzd zzg(zzf zzf1)
        throws RemoteException;
}
