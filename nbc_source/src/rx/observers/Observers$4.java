// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.observers;

import rx.Observer;
import rx.functions.Action0;
import rx.functions.Action1;

// Referenced classes of package rx.observers:
//            Observers

static final class val.onNext
    implements Observer
{

    final Action0 val$onComplete;
    final Action1 val$onError;
    final Action1 val$onNext;

    public final void onCompleted()
    {
        val$onComplete.call();
    }

    public final void onError(Throwable throwable)
    {
        val$onError.call(throwable);
    }

    public final void onNext(Object obj)
    {
        val$onNext.call(obj);
    }

    (Action0 action0, Action1 action1, Action1 action1_1)
    {
        val$onComplete = action0;
        val$onError = action1;
        val$onNext = action1_1;
        super();
    }
}
