// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.GamesStatusCodes;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class zzanZ
    implements com.google.android.gms.games.achievement.nZ
{

    private final Status zzOt;
    private final String zzanZ;

    public String getAchievementId()
    {
        return zzanZ;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    (int i, String s)
    {
        zzOt = GamesStatusCodes.zzfn(i);
        zzanZ = s;
    }
}
