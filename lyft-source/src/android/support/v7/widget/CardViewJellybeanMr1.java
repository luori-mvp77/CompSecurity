// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

// Referenced classes of package android.support.v7.widget:
//            CardViewEclairMr1, RoundRectDrawableWithShadow

class CardViewJellybeanMr1 extends CardViewEclairMr1
{

    CardViewJellybeanMr1()
    {
    }

    public void a()
    {
        RoundRectDrawableWithShadow.c = new RoundRectDrawableWithShadow.RoundRectHelper() {

            final CardViewJellybeanMr1 a;

            public void a(Canvas canvas, RectF rectf, float f, Paint paint)
            {
                canvas.drawRoundRect(rectf, f, f, paint);
            }

            
            {
                a = CardViewJellybeanMr1.this;
                super();
            }
        };
    }
}
