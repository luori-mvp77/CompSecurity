// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid;

import android.app.PendingIntent;
import android.os.Bundle;
import com.microsoft.onlineid.internal.f;
import com.microsoft.onlineid.internal.g;

// Referenced classes of package com.microsoft.onlineid:
//            i, j

public interface e
    extends f, g
{

    public abstract void onTicketAcquired(i i, j j, Bundle bundle);

    public abstract void onUINeeded(PendingIntent pendingintent, Bundle bundle);
}
