// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final ehq a;
    final ehp b;

    private cgh b()
    {
        cgh cgh = ehq.a(a).Z();
        if (cgh == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return cgh;
        }
    }

    public final Object a()
    {
        return b();
    }

    (ehp ehp1, ehq ehq1)
    {
        b = ehp1;
        a = ehq1;
        super();
    }
}
