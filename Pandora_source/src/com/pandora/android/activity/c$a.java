// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import com.pandora.radio.util.b;

// Referenced classes of package com.pandora.android.activity:
//            c

public static class  extends b
{

    private static volatile c a;

    public static c a()
    {
        if (a == null)
        {
            a = new c(null);
        }
        return a;
    }
}
