// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.content.Context;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.cast:
//            CastRemoteDisplayLocalService

class zzRp
    implements ResultCallback
{

    final CastRemoteDisplayLocalService zzRp;

    public void onResult(Result result)
    {
        zza((laySessionResult)result);
    }

    public void zza(laySessionResult laysessionresult)
    {
        if (!laysessionresult.getStatus().isSuccess())
        {
            CastRemoteDisplayLocalService.zzln().zzc("Connection was not successful", new Object[0]);
            CastRemoteDisplayLocalService.zzc(zzRp);
        } else
        {
            laysessionresult = laysessionresult.getPresentationDisplay();
            if (laysessionresult != null)
            {
                CastRemoteDisplayLocalService.zza(zzRp, laysessionresult);
            } else
            {
                CastRemoteDisplayLocalService.zzln().zzc("Cast Remote Display session created without display", new Object[0]);
            }
            CastRemoteDisplayLocalService.zzlo().set(false);
            if (CastRemoteDisplayLocalService.zzd(zzRp) != null && CastRemoteDisplayLocalService.zze(zzRp) != null)
            {
                CastRemoteDisplayLocalService.zzd(zzRp).unbindService(CastRemoteDisplayLocalService.zze(zzRp));
                CastRemoteDisplayLocalService.zza(zzRp, null);
                CastRemoteDisplayLocalService.zza(zzRp, null);
                return;
            }
        }
    }

    laySessionResult(CastRemoteDisplayLocalService castremotedisplaylocalservice)
    {
        zzRp = castremotedisplaylocalservice;
        super();
    }
}
