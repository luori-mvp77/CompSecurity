// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.ci;

// Referenced classes of package com.whatsapp:
//            DeleteAccount

class kj
    implements ci
{

    final DeleteAccount a;

    kj(DeleteAccount deleteaccount)
    {
        a = deleteaccount;
        super();
    }

    public void a(int i)
    {
        DeleteAccount.a(a).sendEmptyMessage(3);
    }
}
