// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eun
{

    private dfe a;
    private dff b;
    private eqg c;
    private dph d;
    private dfp e;

    private eun()
    {
    }

    eun(byte byte0)
    {
        this();
    }

    static dfp a(eun eun1)
    {
        return eun1.e;
    }

    static dff b(eun eun1)
    {
        return eun1.b;
    }

    static dfe c(eun eun1)
    {
        return eun1.a;
    }

    static dph d(eun eun1)
    {
        return eun1.d;
    }

    public final eun a(dfe dfe)
    {
        a = dfe;
        return this;
    }

    public final eun a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            e = dfp;
            return this;
        }
    }

    public final eun a(eqg eqg1)
    {
        c = eqg1;
        return this;
    }

    public final eus a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderActivityModule must be set");
        }
        if (b == null)
        {
            b = new dff();
        }
        if (c == null)
        {
            c = new eqg();
        }
        if (d == null)
        {
            d = new dph();
        }
        if (e == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new eum(this, (byte)0);
        }
    }
}
