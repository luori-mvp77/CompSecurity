// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.Intent;
import com.facebook.c.b;
import com.facebook.c.c;

// Referenced classes of package com.facebook.orca.chatheads:
//            ChatHeadService

class q
    implements b
{

    final ChatHeadService a;

    q(ChatHeadService chatheadservice)
    {
        a = chatheadservice;
        super();
    }

    public void a(Context context, Intent intent, c c)
    {
        ChatHeadService.a(a, intent.getStringExtra("reason"));
    }
}
