// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            Conversation

class auw
    implements android.content.DialogInterface.OnClickListener
{

    final Conversation a;

    auw(Conversation conversation)
    {
        a = conversation;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(10);
        Conversation.a(a, a, a.aD, false);
    }
}
