// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble;

import android.content.Context;
import com.dominos.pebble.order.PebbleOrderHandler_;
import com.getpebble.android.kit.PebbleKit;

// Referenced classes of package com.dominos.pebble:
//            PebbleCommand

final class it> extends PebbleCommand
{

    public final transient void execute(Context context, int i, Object aobj[])
    {
        PebbleKit.a(context, i);
        PebbleOrderHandler_.getInstance_(context).sendCheckoutInfo();
    }

    Handler_(String s, int i)
    {
        super(s, i, null);
    }
}
