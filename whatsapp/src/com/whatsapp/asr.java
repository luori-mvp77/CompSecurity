// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            VerifySms

class asr
    implements android.content.DialogInterface.OnDismissListener
{

    final VerifySms a;

    asr(VerifySms verifysms)
    {
        a = verifysms;
        super();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        VerifySms.e(a);
    }
}
