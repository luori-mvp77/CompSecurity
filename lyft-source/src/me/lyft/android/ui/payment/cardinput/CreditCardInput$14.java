// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import android.view.View;
import android.widget.ImageView;

// Referenced classes of package me.lyft.android.ui.payment.cardinput:
//            CreditCardInput

class CInputFocusListener extends CInputFocusListener
{

    final CreditCardInput this$0;

    public void onFocusChange(View view, boolean flag)
    {
        super.onFocusChange(view, flag);
        if (flag)
        {
            cardTypeImage.setImageResource(0x7f020068);
        }
    }

    CInputFocusListener(CreditCardInput creditcardinput1)
    {
        this$0 = CreditCardInput.this;
        super(creditcardinput1);
    }
}
