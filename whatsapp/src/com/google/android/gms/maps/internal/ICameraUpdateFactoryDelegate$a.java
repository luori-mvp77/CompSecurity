// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.maps.internal:
//            ICameraUpdateFactoryDelegate

public abstract class a extends Binder
    implements ICameraUpdateFactoryDelegate
{

    public static ICameraUpdateFactoryDelegate aQ(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        class a
            implements ICameraUpdateFactoryDelegate
        {

            private IBinder le;

            public IBinder asBinder()
            {
                return le;
            }

            public d newCameraPosition(CameraPosition cameraposition)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (cameraposition == null)
                {
                    break MISSING_BLOCK_LABEL_35;
                }
                parcel.writeInt(1);
                cameraposition.writeToParcel(parcel, 0);
                if (m.a.a == 0)
                {
                    break MISSING_BLOCK_LABEL_40;
                }
                parcel.writeInt(0);
                le.transact(7, parcel, parcel1, 0);
                parcel1.readException();
                cameraposition = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return cameraposition;
                cameraposition;
                parcel1.recycle();
                parcel.recycle();
                throw cameraposition;
            }

            public d newLatLng(LatLng latlng)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (latlng == null)
                {
                    break MISSING_BLOCK_LABEL_35;
                }
                parcel.writeInt(1);
                latlng.writeToParcel(parcel, 0);
                if (m.a.a == 0)
                {
                    break MISSING_BLOCK_LABEL_40;
                }
                parcel.writeInt(0);
                le.transact(8, parcel, parcel1, 0);
                parcel1.readException();
                latlng = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return latlng;
                latlng;
                parcel1.recycle();
                parcel.recycle();
                throw latlng;
            }

            public d newLatLngBounds(LatLngBounds latlngbounds, int i)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                if (latlngbounds == null)
                {
                    break MISSING_BLOCK_LABEL_36;
                }
                parcel.writeInt(1);
                latlngbounds.writeToParcel(parcel, 0);
                if (m.a.a == 0)
                {
                    break MISSING_BLOCK_LABEL_41;
                }
                parcel.writeInt(0);
                parcel.writeInt(i);
                le.transact(10, parcel, parcel1, 0);
                parcel1.readException();
                latlngbounds = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return latlngbounds;
                latlngbounds;
                parcel1.recycle();
                parcel.recycle();
                throw latlngbounds;
            }

            public d zoomBy(float f)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                d d;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                parcel.writeFloat(f);
                le.transact(5, parcel, parcel1, 0);
                parcel1.readException();
                d = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return d;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            public d zoomTo(float f)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                d d;
                parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
                parcel.writeFloat(f);
                le.transact(4, parcel, parcel1, 0);
                parcel1.readException();
                d = com.google.android.gms.dynamic.d.a.ap(parcel1.readStrongBinder());
                parcel1.recycle();
                parcel.recycle();
                return d;
                Exception exception;
                exception;
                parcel1.recycle();
                parcel.recycle();
                throw exception;
            }

            a(IBinder ibinder)
            {
                le = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof ICameraUpdateFactoryDelegate))
        {
            return (ICameraUpdateFactoryDelegate)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }
}
