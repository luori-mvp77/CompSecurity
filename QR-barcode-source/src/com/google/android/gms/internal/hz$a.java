// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            hz

private static abstract class CN
    implements Result
{

    private final Status CM;
    protected final Object CN;

    public Status getStatus()
    {
        return CM;
    }

    public tus(Status status, Object obj)
    {
        CM = status;
        CN = obj;
    }
}
