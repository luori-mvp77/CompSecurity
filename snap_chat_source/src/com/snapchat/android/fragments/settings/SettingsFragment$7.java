// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import Mf;
import Oi;
import android.view.View;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            SettingsFragment

final class ragment
    implements android.view.r
{

    public final void onClick(View view)
    {
        AnalyticsEvents.e();
        Mf.a().a(new Oi(LeftSwipeContentFragment.ADDITIONAL_SERVICES_FRAGMENT));
    }

    ragment()
    {
    }
}
