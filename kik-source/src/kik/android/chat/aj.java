// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import a.a;
import com.kik.android.c.f;
import com.kik.cache.ad;
import javax.inject.Provider;
import kik.a.c.c;
import kik.android.chat.b.d;
import kik.android.util.bj;
import kik.android.util.ck;

// Referenced classes of package kik.android.chat:
//            KikApplication

public final class aj
    implements a
{

    static final boolean a;
    private final a b;
    private final Provider c;
    private final Provider d;
    private final Provider e;
    private final Provider f;
    private final Provider g;
    private final Provider h;
    private final Provider i;
    private final Provider j;

    private aj(a a1, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, 
            Provider provider6, Provider provider7)
    {
        if (!a && a1 == null)
        {
            throw new AssertionError();
        }
        b = a1;
        if (!a && provider == null)
        {
            throw new AssertionError();
        }
        c = provider;
        if (!a && provider1 == null)
        {
            throw new AssertionError();
        }
        d = provider1;
        if (!a && provider2 == null)
        {
            throw new AssertionError();
        }
        e = provider2;
        if (!a && provider3 == null)
        {
            throw new AssertionError();
        }
        f = provider3;
        if (!a && provider4 == null)
        {
            throw new AssertionError();
        }
        g = provider4;
        if (!a && provider5 == null)
        {
            throw new AssertionError();
        }
        h = provider5;
        if (!a && provider6 == null)
        {
            throw new AssertionError();
        }
        i = provider6;
        if (!a && provider7 == null)
        {
            throw new AssertionError();
        } else
        {
            j = provider7;
            return;
        }
    }

    public static a a(a a1, Provider provider, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, 
            Provider provider7)
    {
        return new aj(a1, provider, provider1, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public final void a(Object obj)
    {
        obj = (KikApplication)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.a(obj);
            obj.b = (com.kik.android.a)c.get();
            obj.c = (f)d.get();
            obj.d = (d)e.get();
            obj.e = (ck)f.get();
            obj.f = (ad)g.get();
            obj.g = (bj)h.get();
            obj.h = (c)i.get();
            obj.i = (kik.a.a.c)j.get();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/android/chat/aj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
