// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DcmMessages

public static final class currentPlayerId extends MessageBase
{

    public final String authToken;
    public final String currentPlayerId;

    public (String s, String s1)
    {
        super(6002);
        authToken = s;
        currentPlayerId = s1;
    }
}
