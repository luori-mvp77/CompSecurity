// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import com.fitbit.e.a;
import com.htc.lib2.activeservice.TransportModeListener;
import com.htc.lib2.activeservice.TransportModeRecord;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fitbit.pedometer:
//            HtcPedometerAdapter, e, h, g

class a
    implements TransportModeListener
{

    final HtcPedometerAdapter a;

    public void onTransportModeChanged(TransportModeRecord transportmoderecord)
    {
        com.fitbit.e.a.d("HtcPedometerAdapter", (new StringBuilder()).append("Received record from HtcActiveManager: ").append(transportmoderecord).toString(), new Object[0]);
        com.fitbit.pedometer.e.a(new Runnable(transportmoderecord) {

            final TransportModeRecord a;
            final HtcPedometerAdapter._cls1 b;

            public void run()
            {
                boolean flag1 = true;
                Object obj = new ArrayList();
                ((ArrayList) (obj)).add(a);
                com.fitbit.pedometer.h.a().b(((List) (obj)));
                obj = com.fitbit.pedometer.HtcPedometerAdapter.a(b.a, new TransportModeRecord[] {
                    a
                });
                if (obj != null && !((List) (obj)).isEmpty() && com.fitbit.pedometer.HtcPedometerAdapter.a(b.a) != null && b.a.a != null)
                {
                    com.fitbit.e.a.d("HtcPedometerAdapter", "Storing Pedometer units in LiveDataCollector...", new Object[0]);
                    com.fitbit.pedometer.HtcPedometerAdapter.a(b.a).a(((List) (obj)));
                    b.a.a.a(com.fitbit.pedometer.HtcPedometerAdapter.a(b.a).a(), com.fitbit.pedometer.HtcPedometerAdapter.a(b.a).b(), com.fitbit.pedometer.HtcPedometerAdapter.a(b.a).c());
                    return;
                }
                obj = (new StringBuilder()).append("Unable to store Pedometer units in LiveDataCollector: collector is null = ");
                boolean flag;
                if (com.fitbit.pedometer.HtcPedometerAdapter.a(b.a) == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj = ((StringBuilder) (obj)).append(flag).append(", listener is null = ");
                if (b.a.a == null)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                com.fitbit.e.a.d("HtcPedometerAdapter", ((StringBuilder) (obj)).append(flag).toString(), new Object[0]);
            }

            
            {
                b = HtcPedometerAdapter._cls1.this;
                a = transportmoderecord;
                super();
            }
        });
    }

    _cls1.a(HtcPedometerAdapter htcpedometeradapter)
    {
        a = htcpedometeradapter;
        super();
    }
}
