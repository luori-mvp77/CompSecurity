// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzd, LoyaltyWalletObject, OfferWalletObject, GiftCardWalletObject

public final class CreateWalletObjectsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    LoyaltyWalletObject zzaHW;
    OfferWalletObject zzaHX;
    GiftCardWalletObject zzaHY;
    private final int zzzH;

    CreateWalletObjectsRequest()
    {
        zzzH = 3;
    }

    CreateWalletObjectsRequest(int i, LoyaltyWalletObject loyaltywalletobject, OfferWalletObject offerwalletobject, GiftCardWalletObject giftcardwalletobject)
    {
        zzzH = i;
        zzaHW = loyaltywalletobject;
        zzaHX = offerwalletobject;
        zzaHY = giftcardwalletobject;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

}
