// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.facebook.orca.f.b;
import com.facebook.orca.threads.ThreadSummary;
import com.google.common.base.Predicate;

// Referenced classes of package com.facebook.orca.threadlist:
//            af

class ag
    implements Predicate
{

    final af a;

    ag(af af1)
    {
        a = af1;
        super();
    }

    public boolean a(ThreadSummary threadsummary)
    {
        return af.a(a).a(threadsummary.a());
    }

    public boolean apply(Object obj)
    {
        return a((ThreadSummary)obj);
    }
}
