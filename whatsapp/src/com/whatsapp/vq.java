// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            BroadcastDetails

class vq
    implements android.content.DialogInterface.OnCancelListener
{

    final BroadcastDetails a;

    vq(BroadcastDetails broadcastdetails)
    {
        a = broadcastdetails;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.removeDialog(3);
    }
}
