// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.support.v7.internal.widget.al;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

class a extends FrameLayout
{

    final AppCompatDelegateImplV7 a;

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return a.a(keyevent) || super.dispatchKeyEvent(keyevent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            int i = (int)motionevent.getX();
            int j = (int)motionevent.getY();
            boolean flag;
            if (i < -5 || j < -5 || i > getWidth() + 5 || j > getHeight() + 5)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                motionevent = a;
                motionevent.a(motionevent.e(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionevent);
    }

    public void setBackgroundResource(int i)
    {
        setBackgroundDrawable(al.a(getContext(), i));
    }

    public (AppCompatDelegateImplV7 appcompatdelegateimplv7, Context context)
    {
        a = appcompatdelegateimplv7;
        super(context);
    }
}
