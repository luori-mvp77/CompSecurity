// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics:
//            d, y

public static class b extends b
{

    public b a(long l)
    {
        a("&ev", Long.toString(l));
        return this;
    }

    public a a(String s)
    {
        a("&ec", s);
        return this;
    }

    public volatile Map a()
    {
        return super.a();
    }

    public a b(String s)
    {
        a("&ea", s);
        return this;
    }

    public a c(String s)
    {
        a("&el", s);
        return this;
    }

    public ()
    {
        y.a().a(Y);
        a("&t", "event");
    }

    public a(String s, String s1)
    {
        this();
        a(s);
        b(s1);
    }
}
