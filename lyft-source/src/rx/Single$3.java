// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;


// Referenced classes of package rx:
//            Single, SingleSubscriber

final class ject
    implements Subscribe
{

    final Throwable val$exception;

    public volatile void call(Object obj)
    {
        call((SingleSubscriber)obj);
    }

    public void call(SingleSubscriber singlesubscriber)
    {
        singlesubscriber.onError(val$exception);
    }

    rowable()
    {
        val$exception = throwable;
        super();
    }
}
