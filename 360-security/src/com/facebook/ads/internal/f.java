// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.content.Context;
import android.os.Looper;
import com.facebook.ads.internal.util.h;
import com.facebook.ads.internal.util.t;

public class f
{

    private final String a;
    private final boolean b;

    private f(String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    public static f a(Context context, com.facebook.ads.internal.util.h.a a1)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot get advertising info on main thread.");
        }
        if (a1 != null && !t.a(a1.b))
        {
            return new f(a1.b, a1.c);
        }
        a1 = h.a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[] {
            android/content/Context
        });
        if (a1 == null)
        {
            return null;
        }
        a1 = ((com.facebook.ads.internal.util.h.a) (h.a(null, a1, new Object[] {
            context
        })));
        if (a1 == null || ((Integer)a1).intValue() != 0)
        {
            return null;
        }
        a1 = h.a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[] {
            android/content/Context
        });
        if (a1 == null)
        {
            return null;
        }
        context = ((Context) (h.a(null, a1, new Object[] {
            context
        })));
        if (context == null)
        {
            return null;
        }
        a1 = h.a(context.getClass(), "getId", new Class[0]);
        java.lang.reflect.Method method = h.a(context.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
        if (a1 == null || method == null)
        {
            return null;
        } else
        {
            return new f((String)h.a(context, a1, new Object[0]), ((Boolean)h.a(context, method, new Object[0])).booleanValue());
        }
    }

    public String a()
    {
        return a;
    }

    public boolean b()
    {
        return b;
    }
}
