// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.View;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            AbstractPresenterListener, AltCamOverlay

class rListener extends AbstractPresenterListener
{

    final AltCamOverlay this$0;

    public void onToggleFullScreen(boolean flag)
    {
        super.onToggleFullScreen(flag);
        View view = shim;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    rListener()
    {
        this$0 = AltCamOverlay.this;
        super();
    }
}
