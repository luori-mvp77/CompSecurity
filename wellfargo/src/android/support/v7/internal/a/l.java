// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.support.v4.view.ViewPropertyAnimatorUpdateListener;
import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.internal.a:
//            i

class l
    implements ViewPropertyAnimatorUpdateListener
{

    final i a;

    l(i j)
    {
        a = j;
        super();
    }

    public void onAnimationUpdate(View view)
    {
        ((View)i.c(a).getParent()).invalidate();
    }
}
