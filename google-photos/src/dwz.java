// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dwz
{

    public static final String a = duh.getName();
    public static final String b = onc.getName();
    private static dwy c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new dwy();
        }
        olm1.a(duh, new dwx(context));
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new dwy();
        }
        olm1.a(onc, null);
    }

}
