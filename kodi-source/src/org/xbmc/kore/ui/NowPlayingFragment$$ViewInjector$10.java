// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package org.xbmc.kore.ui:
//            NowPlayingFragment

class  extends DebouncingOnClickListener
{

    final  this$0;
    final NowPlayingFragment val$target;

    public void doClick(View view)
    {
        val$target.onOverflowClicked(view);
    }

    ()
    {
        this$0 = final_;
        val$target = NowPlayingFragment.this;
        super();
    }
}
