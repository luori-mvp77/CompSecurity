// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            SmsDefaultAppWarning

class a9c
    implements android.content.DialogInterface.OnCancelListener
{

    final SmsDefaultAppWarning a;

    a9c(SmsDefaultAppWarning smsdefaultappwarning)
    {
        a = smsdefaultappwarning;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.finish();
    }
}
