// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverDashboardPresenter

class this._cls0 extends ClickableSpan
{

    final SaverDashboardPresenter this$0;

    public void onClick(View view)
    {
        SaverDashboardPresenter.access$400(SaverDashboardPresenter.this).launchFaq();
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
    }

    tionCallbacks()
    {
        this$0 = SaverDashboardPresenter.this;
        super();
    }
}
