// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            rq, ho, hs

final class hq
    implements rq
{

    final ho a;

    hq(ho ho1)
    {
        a = ho1;
        super();
    }

    public final void a(Object obj)
    {
        zzb.v("Releasing engine reference.");
        ho.a(a).b();
    }
}
