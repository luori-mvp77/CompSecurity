// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final fhr a;
    final fhq b;

    private dkc b()
    {
        dkc dkc = fhr.a(a).P();
        if (dkc == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dkc;
        }
    }

    public final Object a()
    {
        return b();
    }

    (fhq fhq1, fhr fhr1)
    {
        b = fhq1;
        a = fhr1;
        super();
    }
}
