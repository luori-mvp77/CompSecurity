// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final egs a;
    final egr b;

    private gqu b()
    {
        gqu gqu = egs.a(a).aH();
        if (gqu == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return gqu;
        }
    }

    public final Object a()
    {
        return b();
    }

    (egr egr1, egs egs1)
    {
        b = egr1;
        a = egs1;
        super();
    }
}
