// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ehp
{

    public static final String a = ehq.getName();
    private static eho b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new eho();
        }
        olm1.a(ehq, new ehq(context));
    }

}
