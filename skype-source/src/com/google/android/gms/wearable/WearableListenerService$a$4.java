// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.NodeParcelable;

// Referenced classes of package com.google.android.gms.wearable:
//            WearableListenerService

final class a
    implements Runnable
{

    final NodeParcelable a;
    final a b;

    public final void run()
    {
        b.b.onPeerDisconnected(a);
    }

    A(A a1, NodeParcelable nodeparcelable)
    {
        b = a1;
        a = nodeparcelable;
        super();
    }
}
