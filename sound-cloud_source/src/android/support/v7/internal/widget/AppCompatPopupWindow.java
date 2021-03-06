// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.internal.widget:
//            TintTypedArray

public class AppCompatPopupWindow extends PopupWindow
{

    private static final String TAG = "AppCompatPopupWindow";
    private final boolean mOverlapAnchor;

    public AppCompatPopupWindow(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.PopupWindow, i, 0);
        mOverlapAnchor = context.getBoolean(android.support.v7.appcompat.R.styleable.PopupWindow_overlapAnchor, false);
        setBackgroundDrawable(context.getDrawable(android.support.v7.appcompat.R.styleable.PopupWindow_android_popupBackground));
        context.recycle();
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            wrapOnScrollChangedListener(this);
        }
    }

    private static void wrapOnScrollChangedListener(final PopupWindow popup)
    {
        try
        {
            final Field fieldAnchor = android/widget/PopupWindow.getDeclaredField("mAnchor");
            fieldAnchor.setAccessible(true);
            Field field = android/widget/PopupWindow.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
            field.set(popup, new _cls1());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final PopupWindow popup)
        {
            return;
        }
    }

    public void showAsDropDown(View view, int i, int j)
    {
        int k = j;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            k = j;
            if (mOverlapAnchor)
            {
                k = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, k);
    }

    public void showAsDropDown(View view, int i, int j, int k)
    {
        int l = j;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            l = j;
            if (mOverlapAnchor)
            {
                l = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, l, k);
    }

    public void update(View view, int i, int j, int k, int l)
    {
        if (android.os.Build.VERSION.SDK_INT < 21 && mOverlapAnchor)
        {
            j -= view.getHeight();
        }
        super.update(view, i, j, k, l);
    }

    private class _cls1
        implements android.view.ViewTreeObserver.OnScrollChangedListener
    {

        final Field val$fieldAnchor;
        final android.view.ViewTreeObserver.OnScrollChangedListener val$originalListener;
        final PopupWindow val$popup;

        public final void onScrollChanged()
        {
            WeakReference weakreference = (WeakReference)fieldAnchor.get(popup);
            if (weakreference == null)
            {
                break MISSING_BLOCK_LABEL_38;
            }
            if (weakreference.get() == null)
            {
                return;
            }
            try
            {
                originalListener.onScrollChanged();
                return;
            }
            catch (IllegalAccessException illegalaccessexception) { }
        }

        _cls1()
        {
            fieldAnchor = field;
            popup = popupwindow;
            originalListener = onscrollchangedlistener;
            super();
        }
    }

}
