// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            l, GAServiceProxy

final class x
    implements l
{

    final GAServiceProxy a;

    x(GAServiceProxy gaserviceproxy)
    {
        a = gaserviceproxy;
        super();
    }

    public final long a()
    {
        return System.currentTimeMillis();
    }
}
