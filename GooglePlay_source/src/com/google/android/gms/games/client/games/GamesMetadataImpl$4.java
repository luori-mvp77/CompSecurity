// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.client.PlayGamesClientImpl;

// Referenced classes of package com.google.android.gms.games.client.games:
//            GamesMetadataImpl

final class adGamesImpl extends adGamesImpl
{

    final GamesMetadataImpl this$0;
    final boolean val$forceReload = false;
    final int val$pageSize;

    protected final volatile void doExecute(com.google.android.gms.common.api.aImpl._cls4 _pcls4)
        throws RemoteException
    {
        ((PlayGamesClientImpl)_pcls4).loadRecentlyPlayedGamesForPlayer(this, null, val$pageSize, false, val$forceReload);
    }

    adGamesImpl(boolean flag)
    {
        this$0 = final_gamesmetadataimpl;
        val$pageSize = I.this;
        super(final_googleapiclient, (byte)0);
    }
}
