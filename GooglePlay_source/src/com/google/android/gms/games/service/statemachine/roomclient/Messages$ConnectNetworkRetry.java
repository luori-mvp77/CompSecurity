// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;


// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            Messages

public static final class 
{

    int mConnectNetworkTryCount;

    public final boolean getRetryAuthToken()
    {
        return mConnectNetworkTryCount % 2 == 0;
    }

    public ()
    {
    }
}
