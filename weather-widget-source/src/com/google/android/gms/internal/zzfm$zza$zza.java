// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzfm, zzfl

private static class zznI
    implements zzfm
{

    private IBinder zznI;

    public IBinder asBinder()
    {
        return zznI;
    }

    public void zza(zzfl zzfl1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (zzfl1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        zzfl1 = zzfl1.asBinder();
_L1:
        parcel.writeStrongBinder(zzfl1);
        zznI.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        zzfl1 = null;
          goto _L1
        zzfl1;
        parcel1.recycle();
        parcel.recycle();
        throw zzfl1;
    }

    (IBinder ibinder)
    {
        zznI = ibinder;
    }
}
