// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice.fastpickup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.wmservice.fastpickup:
//            FastPickupService

public static class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        WLog.d(FastPickupService.access$100(), "AlarmReceiver.onReceive()");
        FastPickupService.refresh(context, false);
    }

    public ()
    {
    }
}
