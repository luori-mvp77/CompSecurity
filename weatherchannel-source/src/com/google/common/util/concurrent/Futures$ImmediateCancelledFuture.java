// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;

// Referenced classes of package com.google.common.util.concurrent:
//            Futures, AbstractFuture

private static class  extends 
{

    private final CancellationException thrown = new CancellationException("Immediate cancelled future.");

    public Object get()
    {
        throw AbstractFuture.cancellationExceptionWithCause("Task was cancelled.", thrown);
    }

    public boolean isCancelled()
    {
        return true;
    }

    ()
    {
        super(null);
    }
}
