// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cdb extends ccu
{

    public cdb(long l)
    {
        super(l);
    }

    protected final boolean a(int i, int j, cnt cnt1, cnt cnt2)
    {
        return i > 0 && i < j && (cnt1 == cnt.c || cnt2 == cnt.c) && cnt2 != cnt.d;
    }
}
