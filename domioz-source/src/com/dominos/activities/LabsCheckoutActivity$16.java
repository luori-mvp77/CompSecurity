// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.fragments.checkout.IDominosFormFragment;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class lback extends com.dominos.utils.onCallback
{

    final LabsCheckoutActivity this$0;

    public void onAlertDismissed()
    {
        LabsCheckoutActivity.access$1400(LabsCheckoutActivity.this).clearFields();
        restartActivity();
    }

    ment()
    {
        this$0 = LabsCheckoutActivity.this;
        super();
    }
}
