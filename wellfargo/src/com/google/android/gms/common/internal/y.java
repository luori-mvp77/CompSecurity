// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;

// Referenced classes of package com.google.android.gms.common.internal:
//            z

public abstract class y
{

    private static final Object a = new Object();
    private static y b;

    public y()
    {
    }

    public static y a(Context context)
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new z(context.getApplicationContext());
            }
        }
        return b;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public abstract boolean a(String s, ServiceConnection serviceconnection, String s1);

    public abstract void b(String s, ServiceConnection serviceconnection, String s1);

}
