// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            ia, ib, jx

private static final class ementation.b extends ia
{

    private final com.google.android.gms.common.api.mplementation.b Ea;

    public void e(int i, int j)
    {
        Status status = new Status(i);
        Ea.b(new <init>(status, j));
    }

    public ementation.b(com.google.android.gms.common.api.mplementation.b b)
    {
        Ea = (com.google.android.gms.common.api.mplementation.b)jx.b(b, "Result holder must not be null");
    }
}
