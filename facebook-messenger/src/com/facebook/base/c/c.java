// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.content.Context;
import com.facebook.base.broadcast.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            a, b

class c extends d
{

    final com.facebook.base.c.a a;

    private c(com.facebook.base.c.a a1)
    {
        a = a1;
        super();
    }

    c(com.facebook.base.c.a a1, b b1)
    {
        this(a1);
    }

    public a a()
    {
        return new a((Context)e().a(android/content/Context));
    }

    public Object b()
    {
        return a();
    }
}
