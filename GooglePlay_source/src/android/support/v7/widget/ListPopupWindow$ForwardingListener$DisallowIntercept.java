// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

private final class <init>
    implements Runnable
{

    final this._cls0 this$0;

    public final void run()
    {
        <init>(this._cls0.this).getParent().requestDisallowInterceptTouchEvent(true);
    }

    private ()
    {
        this$0 = this._cls0.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
