// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fnv
{

    private dff a;
    private dfe b;
    private dph c;
    private dfp d;

    private fnv()
    {
    }

    fnv(byte byte0)
    {
        this();
    }

    static dfp a(fnv fnv1)
    {
        return fnv1.d;
    }

    static dff b(fnv fnv1)
    {
        return fnv1.a;
    }

    static dfe c(fnv fnv1)
    {
        return fnv1.b;
    }

    static dph d(fnv fnv1)
    {
        return fnv1.c;
    }

    public final fnv a(dfe dfe)
    {
        b = dfe;
        return this;
    }

    public final fnv a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            d = dfp;
            return this;
        }
    }

    public final foc a()
    {
        if (a == null)
        {
            a = new dff();
        }
        if (b == null)
        {
            throw new IllegalStateException("riderActivityModule must be set");
        }
        if (c == null)
        {
            c = new dph();
        }
        if (d == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new fnu(this, (byte)0);
        }
    }
}
