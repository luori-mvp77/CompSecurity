// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.now;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.now:
//            INowAuthService

public abstract class Proxy extends Binder
    implements INowAuthService
{

    public static INowAuthService a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.now.INowAuthService");
        class Proxy
            implements INowAuthService
        {

            private IBinder a;

            public Bundle a(String s, String s1)
            {
                Parcel parcel;
                Parcel parcel1;
                parcel = Parcel.obtain();
                parcel1 = Parcel.obtain();
                parcel.writeInterfaceToken("com.google.android.now.INowAuthService");
                parcel.writeString(s);
                parcel.writeString(s1);
                a.transact(2, parcel, parcel1, 0);
                parcel1.readException();
                if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
                s = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
                parcel1.recycle();
                parcel.recycle();
                return s;
_L2:
                s = null;
                if (true) goto _L4; else goto _L3
_L3:
                s;
                parcel1.recycle();
                parcel.recycle();
                throw s;
            }

            public IBinder asBinder()
            {
                return a;
            }

            Proxy(IBinder ibinder)
            {
                a = ibinder;
            }
        }

        if (iinterface != null && (iinterface instanceof INowAuthService))
        {
            return (INowAuthService)iinterface;
        } else
        {
            return new Proxy(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.now.INowAuthService");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.now.INowAuthService");
            parcel = a(parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            break;
        }
        if (parcel != null)
        {
            parcel1.writeInt(1);
            parcel.writeToParcel(parcel1, 1);
            return true;
        } else
        {
            parcel1.writeInt(0);
            return true;
        }
    }
}
