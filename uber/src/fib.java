// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.share.ShareActivity;

public final class fib
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;
    private final hzb f;
    private final hzb g;
    private final hzb h;

    private fib(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6)
    {
        if (!a && hsr1 == null)
        {
            throw new AssertionError();
        }
        b = hsr1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        }
        e = hzb3;
        if (!a && hzb4 == null)
        {
            throw new AssertionError();
        }
        f = hzb4;
        if (!a && hzb5 == null)
        {
            throw new AssertionError();
        }
        g = hzb5;
        if (!a && hzb6 == null)
        {
            throw new AssertionError();
        } else
        {
            h = hzb6;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3, hzb hzb4, hzb hzb5, hzb hzb6)
    {
        return new fib(hsr1, hzb1, hzb2, hzb3, hzb4, hzb5, hzb6);
    }

    private void a(ShareActivity shareactivity)
    {
        if (shareactivity == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(shareactivity);
            shareactivity.h = (chp)c.a();
            shareactivity.i = (cev)d.a();
            shareactivity.j = (czf)e.a();
            shareactivity.k = (gmg)f.a();
            shareactivity.l = (czq)g.a();
            shareactivity.m = (dal)h.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((ShareActivity)obj);
    }

    static 
    {
        boolean flag;
        if (!fib.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
