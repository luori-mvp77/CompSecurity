// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import b.a.a.a.d;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package b.a.a.a.a.b:
//            i

final class s extends i
{

    final String a;
    final ExecutorService b;
    final long c = 2L;
    final TimeUnit d;

    s(String s1, ExecutorService executorservice, TimeUnit timeunit)
    {
        a = s1;
        b = executorservice;
        d = timeunit;
        super();
    }

    public final void a()
    {
        try
        {
            b.a.a.a.d.c();
            (new StringBuilder("Executing shutdown hook for ")).append(a);
            b.shutdown();
            if (!b.awaitTermination(c, d))
            {
                b.a.a.a.d.c();
                (new StringBuilder()).append(a).append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                b.shutdownNow();
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            b.a.a.a.d.c();
        }
        String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] {
            a
        });
        b.shutdownNow();
    }
}
