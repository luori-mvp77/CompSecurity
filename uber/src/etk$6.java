// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final etl a;
    final etk b;

    private dki b()
    {
        dki dki = etl.a(a).W();
        if (dki == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dki;
        }
    }

    public final Object a()
    {
        return b();
    }

    (etk etk1, etl etl1)
    {
        b = etk1;
        a = etl1;
        super();
    }
}
