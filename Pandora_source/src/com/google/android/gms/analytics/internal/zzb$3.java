// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzb, e

class b
    implements Runnable
{

    final String a;
    final Runnable b;
    final zzb c;

    public void run()
    {
        zzb.zza(c).a(a);
        if (b != null)
        {
            b.run();
        }
    }

    (zzb zzb1, String s, Runnable runnable)
    {
        c = zzb1;
        a = s;
        b = runnable;
        super();
    }
}
