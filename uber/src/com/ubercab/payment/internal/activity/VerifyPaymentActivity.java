// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.activity;

import android.content.Intent;
import android.os.Bundle;
import com.ubercab.payment.model.PaymentProfile;
import gjz;
import gtu;

// Referenced classes of package com.ubercab.payment.internal.activity:
//            PaymentActivity

public class VerifyPaymentActivity extends PaymentActivity
{

    private PaymentProfile a;
    private String b;

    public VerifyPaymentActivity()
    {
    }

    public final void a(PaymentProfile paymentprofile)
    {
        Intent intent = new Intent();
        intent.putExtra("payment_profile", paymentprofile);
        setResult(-1, intent);
        finish();
    }

    public final PaymentProfile c()
    {
        return a;
    }

    public final String d()
    {
        return b;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        a = gtu.a(bundle);
        b = gtu.h(bundle);
        gjz.a(a);
    }
}
