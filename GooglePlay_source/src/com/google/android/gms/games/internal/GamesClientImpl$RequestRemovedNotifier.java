// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.request.OnRequestReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class mRequestId
    implements com.google.android.gms.common.api.internal.estId
{

    private final String mRequestId;

    public final volatile void notifyListener(Object obj)
    {
        ((OnRequestReceivedListener)obj).onRequestRemoved$552c4e01();
    }

    public final void onNotifyListenerFailed()
    {
    }

    (String s)
    {
        mRequestId = s;
    }
}
