// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsSignInStaticPageFragment

class au extends DebouncingOnClickListener
{

    final RewardsSignInStaticPageFragment a;
    final RewardsSignInStaticPageFragment..ViewInjector b;

    au(RewardsSignInStaticPageFragment..ViewInjector viewinjector, RewardsSignInStaticPageFragment rewardssigninstaticpagefragment)
    {
        b = viewinjector;
        a = rewardssigninstaticpagefragment;
        super();
    }

    public void doClick(View view)
    {
        a.connectExistingAccounts();
    }
}
