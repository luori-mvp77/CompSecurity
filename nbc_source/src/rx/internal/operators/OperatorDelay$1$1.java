// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.Subscriber;
import rx.functions.Action0;

// Referenced classes of package rx.internal.operators:
//            OperatorDelay

class this._cls1
    implements Action0
{

    final l.child this$1;

    public void call()
    {
        if (!ne)
        {
            ne = true;
            child.onCompleted();
        }
    }

    l.child()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class rx/internal/operators/OperatorDelay$1

/* anonymous class */
    class OperatorDelay._cls1 extends Subscriber
    {

        boolean done;
        final OperatorDelay this$0;
        final Subscriber val$child;
        final rx.Scheduler.Worker val$worker;

        public void onCompleted()
        {
            worker.schedule(new OperatorDelay._cls1._cls1(), delay, unit);
        }

        public void onError(final Throwable e)
        {
            worker.schedule(new OperatorDelay._cls1._cls2());
        }

        public void onNext(final Object t)
        {
            worker.schedule(new OperatorDelay._cls1._cls3(), delay, unit);
        }

            
            {
                this$0 = final_operatordelay;
                worker = rx.Scheduler.Worker.this;
                child = subscriber1;
                super(final_subscriber);
            }

        // Unreferenced inner class rx/internal/operators/OperatorDelay$1$2

/* anonymous class */
        class OperatorDelay._cls1._cls2
            implements Action0
        {

            final OperatorDelay._cls1 this$1;
            final Throwable val$e;

            public void call()
            {
                if (!done)
                {
                    done = true;
                    child.onError(e);
                    worker.unsubscribe();
                }
            }

                    
                    {
                        this$1 = OperatorDelay._cls1.this;
                        e = throwable;
                        super();
                    }
        }


        // Unreferenced inner class rx/internal/operators/OperatorDelay$1$3

/* anonymous class */
        class OperatorDelay._cls1._cls3
            implements Action0
        {

            final OperatorDelay._cls1 this$1;
            final Object val$t;

            public void call()
            {
                if (!done)
                {
                    child.onNext(t);
                }
            }

                    
                    {
                        this$1 = OperatorDelay._cls1.this;
                        t = obj;
                        super();
                    }
        }

    }

}
