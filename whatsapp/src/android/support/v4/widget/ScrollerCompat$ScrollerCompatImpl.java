// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;

interface A
{

    public abstract void abortAnimation(Object obj);

    public abstract boolean computeScrollOffset(Object obj);

    public abstract Object createScroller(Context context, Interpolator interpolator);

    public abstract int getCurrX(Object obj);

    public abstract int getCurrY(Object obj);

    public abstract int getFinalX(Object obj);

    public abstract int getFinalY(Object obj);

    public abstract void startScroll(Object obj, int i, int j, int k, int l, int i1);
}
