// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package b.a:
//            fm, gs, gk, gw, 
//            cv, gx, cx, cy, 
//            fz, ga, gn, gv, 
//            gu, fk

public class ct
    implements fm, Serializable, Cloneable
{

    public static final Map c;
    private static final gs d = new gs("Latent");
    private static final gk e = new gk("latency", (byte)8, (short)1);
    private static final gk f = new gk("interval", (byte)10, (short)2);
    private static final Map g;
    public int a;
    public long b;
    private byte h;

    public ct()
    {
        h = 0;
    }

    public ct(int i, long l)
    {
        this();
        a = i;
        b();
        b = l;
        d();
    }

    public static void e()
    {
    }

    static gs f()
    {
        return d;
    }

    static gk g()
    {
        return e;
    }

    static gk h()
    {
        return f;
    }

    public final void a(gn gn1)
    {
        ((gv)g.get(gn1.s())).a().b(gn1, this);
    }

    public final boolean a()
    {
        return fk.a(h, 0);
    }

    public final void b()
    {
        h = (byte)(h | 1);
    }

    public final void b(gn gn1)
    {
        ((gv)g.get(gn1.s())).a().a(gn1, this);
    }

    public final boolean c()
    {
        return fk.a(h, 1);
    }

    public final void d()
    {
        h = (byte)(h | 2);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Latent(");
        stringbuilder.append("latency:");
        stringbuilder.append(a);
        stringbuilder.append(", ");
        stringbuilder.append("interval:");
        stringbuilder.append(b);
        stringbuilder.append(")");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj = new HashMap();
        g = ((Map) (obj));
        ((Map) (obj)).put(b/a/gw, new cv((byte)0));
        g.put(b/a/gx, new cx((byte)0));
        obj = new EnumMap(b/a/cy);
        ((Map) (obj)).put(cy.a, new fz("latency", (byte)1, new ga((byte)8)));
        ((Map) (obj)).put(cy.b, new fz("interval", (byte)1, new ga((byte)10)));
        c = Collections.unmodifiableMap(((Map) (obj)));
        fz.a(b/a/ct, c);
    }
}
