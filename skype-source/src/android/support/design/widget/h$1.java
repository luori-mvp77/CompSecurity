// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            h

final class Adapter extends AnimatorListenerAdapter
{

    final h a;

    public final void onAnimationCancel(Animator animator)
    {
        h.a(a, false);
    }

    public final void onAnimationEnd(Animator animator)
    {
        h.a(a, false);
        a.e.setVisibility(8);
    }

    public final void onAnimationStart(Animator animator)
    {
        h.a(a, true);
        a.e.setVisibility(0);
    }

    Adapter(h h1)
    {
        a = h1;
        super();
    }
}
