// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.a;


// Referenced classes of package com.actionbarsherlock.internal.a:
//            a, b

class d
    implements Runnable
{

    final a a;

    private d(a a1)
    {
        a = a1;
        super();
    }

    d(a a1, b b)
    {
        this(a1);
    }

    public void run()
    {
        a.c();
    }
}
