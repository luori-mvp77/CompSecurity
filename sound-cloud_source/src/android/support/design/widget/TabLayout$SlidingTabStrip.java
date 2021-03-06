// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package android.support.design.widget:
//            TabLayout, ViewUtils, AnimationUtils, ValueAnimatorCompat

private class setWillNotDraw extends LinearLayout
{

    private int mIndicatorLeft;
    private int mIndicatorRight;
    private int mSelectedIndicatorHeight;
    private final Paint mSelectedIndicatorPaint = new Paint();
    private int mSelectedPosition;
    private float mSelectionOffset;
    final TabLayout this$0;

    private void setIndicatorPosition(int i, int j)
    {
        if (i != mIndicatorLeft || j != mIndicatorRight)
        {
            mIndicatorLeft = i;
            mIndicatorRight = j;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private void updateIndicatorPosition()
    {
        View view = getChildAt(mSelectedPosition);
        int i;
        int j;
        if (view != null && view.getWidth() > 0)
        {
            int l = view.getLeft();
            int k = view.getRight();
            i = l;
            j = k;
            if (mSelectionOffset > 0.0F)
            {
                i = l;
                j = k;
                if (mSelectedPosition < getChildCount() - 1)
                {
                    View view1 = getChildAt(mSelectedPosition + 1);
                    float f = mSelectionOffset;
                    float f1 = view1.getLeft();
                    float f2 = mSelectionOffset;
                    i = (int)((float)l * (1.0F - f2) + f * f1);
                    f = mSelectionOffset;
                    f1 = view1.getRight();
                    f2 = mSelectionOffset;
                    j = (int)((float)k * (1.0F - f2) + f1 * f);
                }
            }
        } else
        {
            i = -1;
            j = -1;
        }
        setIndicatorPosition(i, j);
    }

    void animateIndicatorToPosition(final int position, int i)
    {
        final int startLeft;
        final int startRight;
        final int targetLeft;
        final int targetRight;
        class _cls1
            implements ValueAnimatorCompat.AnimatorUpdateListener
        {

            final TabLayout.SlidingTabStrip this$1;
            final int val$startLeft;
            final int val$startRight;
            final int val$targetLeft;
            final int val$targetRight;

            public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
            {
                float f = valueanimatorcompat.getAnimatedFraction();
                setIndicatorPosition(AnimationUtils.lerp(startLeft, targetLeft, f), AnimationUtils.lerp(startRight, targetRight, f));
            }

            _cls1()
            {
                this$1 = TabLayout.SlidingTabStrip.this;
                startLeft = i;
                targetLeft = j;
                startRight = k;
                targetRight = l;
                super();
            }
        }

        class _cls2 extends ValueAnimatorCompat.AnimatorListenerAdapter
        {

            final TabLayout.SlidingTabStrip this$1;
            final int val$position;

            public void onAnimationCancel(ValueAnimatorCompat valueanimatorcompat)
            {
                mSelectedPosition = position;
                mSelectionOffset = 0.0F;
            }

            public void onAnimationEnd(ValueAnimatorCompat valueanimatorcompat)
            {
                mSelectedPosition = position;
                mSelectionOffset = 0.0F;
            }

            _cls2()
            {
                this$1 = TabLayout.SlidingTabStrip.this;
                position = i;
                super();
            }
        }

        Object obj;
        if (ViewCompat.getLayoutDirection(this) == 1)
        {
            startLeft = 1;
        } else
        {
            startLeft = 0;
        }
        obj = getChildAt(position);
        targetLeft = ((View) (obj)).getLeft();
        targetRight = ((View) (obj)).getRight();
        if (Math.abs(position - mSelectedPosition) > 1) goto _L2; else goto _L1
_L1:
        startLeft = mIndicatorLeft;
        startRight = mIndicatorRight;
_L4:
        if (startLeft != targetLeft || startRight != targetRight)
        {
            obj = TabLayout.access$1102(TabLayout.this, ViewUtils.createAnimator());
            ((ValueAnimatorCompat) (obj)).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            ((ValueAnimatorCompat) (obj)).setDuration(i);
            ((ValueAnimatorCompat) (obj)).setFloatValues(0.0F, 1.0F);
            ((ValueAnimatorCompat) (obj)).setUpdateListener(new _cls1());
            ((ValueAnimatorCompat) (obj)).setListener(new _cls2());
            ((ValueAnimatorCompat) (obj)).start();
        }
        return;
_L2:
        startRight = TabLayout.access$1400(TabLayout.this, 24);
        if (position < mSelectedPosition)
        {
            if (startLeft == 0)
            {
                startRight = targetRight + startRight;
                startLeft = startRight;
                continue; /* Loop/switch isn't completed */
            }
        } else
        if (startLeft != 0)
        {
            startRight = targetRight + startRight;
            startLeft = startRight;
            continue; /* Loop/switch isn't completed */
        }
        startRight = targetLeft - startRight;
        startLeft = startRight;
        if (true) goto _L4; else goto _L3
_L3:
    }

    boolean childrenNeedLayout()
    {
        boolean flag1 = false;
        int j = getChildCount();
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (getChildAt(i).getWidth() > 0)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (mIndicatorLeft >= 0 && mIndicatorRight > mIndicatorLeft)
        {
            canvas.drawRect(mIndicatorLeft, getHeight() - mSelectedIndicatorHeight, mIndicatorRight, getHeight(), mSelectedIndicatorPaint);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        updateIndicatorPosition();
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        break MISSING_BLOCK_LABEL_6;
        if (android.view.(i) == 0x40000000 && TabLayout.access$1200(TabLayout.this) == 1 && TabLayout.access$1300(TabLayout.this) == 1)
        {
            int k1 = getChildCount();
            int l1 = android.view.reSpec(0, 0);
            int l = 0;
            int k = 0;
            for (; l < k1; l++)
            {
                View view = getChildAt(l);
                view.measure(l1, j);
                k = Math.max(k, view.getMeasuredWidth());
            }

            if (k > 0)
            {
                int i1 = TabLayout.access$1400(TabLayout.this, 16);
                if (k * k1 <= getMeasuredWidth() - i1 * 2)
                {
                    for (int j1 = 0; j1 < k1; j1++)
                    {
                        android.widget.lidingTabStrip lidingtabstrip = (android.widget.lidingTabStrip.getMeasuredWidth)getChildAt(j1).getLayoutParams();
                        lidingtabstrip.width = k;
                        lidingtabstrip.weight = 0.0F;
                    }

                } else
                {
                    TabLayout.access$1302(TabLayout.this, 0);
                    TabLayout.access$1500(TabLayout.this);
                }
                super.onMeasure(i, j);
                return;
            }
        }
        return;
    }

    void setIndicatorPositionFromTabPosition(int i, float f)
    {
        if (TabLayout.access$1100(TabLayout.this) != null && TabLayout.access$1100(TabLayout.this).isRunning())
        {
            return;
        } else
        {
            mSelectedPosition = i;
            mSelectionOffset = f;
            updateIndicatorPosition();
            return;
        }
    }

    void setSelectedIndicatorColor(int i)
    {
        mSelectedIndicatorPaint.setColor(i);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    void setSelectedIndicatorHeight(int i)
    {
        mSelectedIndicatorHeight = i;
        ViewCompat.postInvalidateOnAnimation(this);
    }



/*
    static int access$1702(_cls2 _pcls2, int i)
    {
        _pcls2.mSelectedPosition = i;
        return i;
    }

*/


/*
    static float access$1802(mSelectedPosition mselectedposition, float f)
    {
        mselectedposition.mSelectionOffset = f;
        return f;
    }

*/

    mSelectionOffset(Context context)
    {
        this$0 = TabLayout.this;
        super(context);
        mSelectedPosition = -1;
        mIndicatorLeft = -1;
        mIndicatorRight = -1;
        setWillNotDraw(false);
    }
}
