// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.b.a.b;


// Referenced classes of package com.nuance.a.a.a.c.b.a.b:
//            e

public final class d extends e
{

    private String a;

    public d(String s)
    {
        super((short)22);
        a = s;
    }

    public d(byte abyte0[])
    {
        super((short)22);
        a = new String(abyte0);
    }

    public final String a()
    {
        return a;
    }

    public final byte[] b()
    {
        return super.b(a.getBytes());
    }
}
