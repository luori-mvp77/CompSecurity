// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import com.ford.syncV4.e.b.b;
import com.ford.syncV4.e.c.ae;

// Referenced classes of package com.ford.syncV4.e:
//            j

final class bg
    implements Runnable
{

    final ae a;
    final j b;

    bg(j j1, ae ae)
    {
        b = j1;
        a = ae;
        super();
    }

    public final void run()
    {
        j.e(b).onOnButtonPress(a);
    }
}
