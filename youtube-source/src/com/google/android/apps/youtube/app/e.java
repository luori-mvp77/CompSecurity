// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.view.View;
import com.google.android.apps.youtube.common.e.b;

// Referenced classes of package com.google.android.apps.youtube.app:
//            DebugOfflineAdActivity

final class e
    implements android.view.View.OnClickListener
{

    final DebugOfflineAdActivity a;

    e(DebugOfflineAdActivity debugofflineadactivity)
    {
        a = debugofflineadactivity;
        super();
    }

    public final void onClick(View view)
    {
        DebugOfflineAdActivity.a(a, DebugOfflineAdActivity.a(a).a());
    }
}
