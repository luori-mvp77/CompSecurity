// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.managers.ac;
import com.tinder.managers.d;
import com.tinder.managers.e;
import com.tinder.managers.i;
import com.tinder.managers.z;
import dagger.a;
import de.greenrobot.event.c;

// Referenced classes of package com.tinder.fragments:
//            af

public final class ax
    implements a
{

    static final boolean a;
    private final a b;
    private final a.a.a c;
    private final a.a.a d;
    private final a.a.a e;
    private final a.a.a f;
    private final a.a.a g;
    private final a.a.a h;
    private final a.a.a i;

    private ax(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6, a.a.a a7, 
            a.a.a a8)
    {
        if (!a && a1 == null)
        {
            throw new AssertionError();
        }
        b = a1;
        if (!a && a2 == null)
        {
            throw new AssertionError();
        }
        c = a2;
        if (!a && a3 == null)
        {
            throw new AssertionError();
        }
        d = a3;
        if (!a && a4 == null)
        {
            throw new AssertionError();
        }
        e = a4;
        if (!a && a5 == null)
        {
            throw new AssertionError();
        }
        f = a5;
        if (!a && a6 == null)
        {
            throw new AssertionError();
        }
        g = a6;
        if (!a && a7 == null)
        {
            throw new AssertionError();
        }
        h = a7;
        if (!a && a8 == null)
        {
            throw new AssertionError();
        } else
        {
            i = a8;
            return;
        }
    }

    public static a a(a a1, a.a.a a2, a.a.a a3, a.a.a a4, a.a.a a5, a.a.a a6, a.a.a a7, a.a.a a8)
    {
        return new ax(a1, a2, a3, a4, a5, a6, a7, a8);
    }

    public final void injectMembers(Object obj)
    {
        obj = (af)obj;
        if (obj == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(obj);
            obj.c = (i)c.a();
            obj.d = (z)d.a();
            obj.e = (d)e.a();
            obj.f = (ac)f.a();
            obj.g = (com.tinder.d.a)g.a();
            obj.h = (c)h.a();
            obj.i = (e)i.a();
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/fragments/ax.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
