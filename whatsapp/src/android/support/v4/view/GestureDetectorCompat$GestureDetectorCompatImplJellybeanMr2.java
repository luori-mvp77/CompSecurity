// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

class mDetector
    implements mDetector
{

    private final GestureDetector mDetector;

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return mDetector.onTouchEvent(motionevent);
    }

    public Y(Context context, android.view.llybeanMr2 llybeanmr2, Handler handler)
    {
        mDetector = new GestureDetector(context, llybeanmr2, handler);
    }
}
