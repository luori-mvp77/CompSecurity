// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fkv
{

    private djb a;
    private dfp b;

    private fkv()
    {
    }

    fkv(byte byte0)
    {
        this();
    }

    static dfp a(fkv fkv1)
    {
        return fkv1.b;
    }

    static djb b(fkv fkv1)
    {
        return fkv1.a;
    }

    public final fkv a(dfp dfp)
    {
        if (dfp == null)
        {
            throw new NullPointerException("riderApplicationComponent");
        } else
        {
            b = dfp;
            return this;
        }
    }

    public final fkv a(djb djb)
    {
        a = djb;
        return this;
    }

    public final fmk a()
    {
        if (a == null)
        {
            throw new IllegalStateException("riderFragmentModule must be set");
        }
        if (b == null)
        {
            throw new IllegalStateException("riderApplicationComponent must be set");
        } else
        {
            return new fku(this, (byte)0);
        }
    }
}
