// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.a;
import android.text.TextPaint;
import android.text.TextUtils;
import com.skype.ObjectInterface;
import com.skype.android.text.SymbolDrawable;

// Referenced classes of package com.skype.android.widget:
//            ParticipantSpan

protected static abstract class ze
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a e[];
        private final int d;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/widget/ParticipantSpan$Builder$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        public final int a()
        {
            return d;
        }

        static 
        {
            a = new a("NORMAL", 0, 0);
            b = new a("PRESSED", 1, 1);
            c = new a("SELECTED", 2, 2);
            e = (new a[] {
                a, b, c
            });
        }

        private a(String s, int l, int i1)
        {
            super(s, l);
            d = i1;
        }
    }


    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    private int f;
    private int g;
    private android.support.v4.content.res.a h;
    private Drawable i[];
    private Drawable j;
    private final Context k;

    private int a()
    {
        return a + f;
    }

    private CharSequence a(TextPaint textpaint, int l, CharSequence charsequence)
    {
        return TextUtils.ellipsize(charsequence, textpaint, l - (b * 2 + a() + f), android.text.);
    }

    protected abstract SymbolDrawable a(ObjectInterface objectinterface);

    public final ParticipantSpan a(TextPaint textpaint, ObjectInterface objectinterface, int l, boolean flag, boolean flag1)
    {
        CharSequence charsequence = b(objectinterface);
        Object obj = a(textpaint, l, charsequence);
        Object obj1 = new Rect();
        textpaint.getTextBounds(((CharSequence) (obj)).toString(), 0, ((CharSequence) (obj)).length(), ((Rect) (obj1)));
        obj = new Rect(0, 0, ((Rect) (obj1)).width() + a() + b * 2, e);
        obj1 = k.getResources();
        float f1 = textpaint.getTextSize();
        int j1 = ((Resources) (obj1)).getColor(0x7f0f00fe);
        int k1 = ((Rect) (obj)).width();
        int l1 = ((Rect) (obj)).height();
        Bitmap bitmap = Bitmap.createBitmap(k1, l1, android.graphics.Builder.k);
        Canvas canvas = new Canvas(bitmap);
        textpaint.setColor(j1);
        Object obj2;
        int i1;
        int i2;
        if (flag1)
        {
            i1 = a.b.a();
        } else
        if (flag)
        {
            i1 = a.c.a();
        } else
        {
            i1 = com.skype.android.widget.a.a.a();
        }
        obj2 = i[i1];
        ((Drawable) (obj2)).setBounds(new Rect(0, 0, k1, l1));
        ((Drawable) (obj2)).draw(canvas);
        charsequence = a(textpaint, l, charsequence);
        obj2 = new Rect();
        textpaint.getTextBounds("PayRig", 0, 1, ((Rect) (obj2)));
        i2 = (int)(float)(l1 - (l1 - ((Rect) (obj2)).height()) / 2);
        l = b;
        if (!flag)
        {
            SymbolDrawable symboldrawable = a(objectinterface);
            if (symboldrawable != null)
            {
                Rect rect1 = new Rect();
                rect1.left = (b * 2) / 3;
                rect1.right = rect1.left + a;
                rect1.top = e / 2 - a / 2;
                rect1.bottom = rect1.top + a;
                symboldrawable.setBounds(rect1);
                symboldrawable.draw(canvas);
                l += a();
            } else
            {
                l -= f / 2;
            }
        } else
        {
            i1 = f / 2;
            Rect rect = new Rect();
            rect.right = k1 - d;
            rect.left = rect.right - j.getIntrinsicWidth();
            rect.top = e / 2 - j.getIntrinsicHeight() / 2;
            rect.bottom = rect.top + j.getIntrinsicHeight();
            int j2 = rect.left - d;
            textpaint.setColor(-1);
            canvas.drawRect(j2, 0.0F, j2 + c, l1, textpaint);
            j.setBounds(rect);
            j.draw(canvas);
            l -= i1;
        }
        if (flag)
        {
            i1 = -1;
        } else
        {
            i1 = j1;
        }
        textpaint.setColor(i1);
        canvas.drawText(charsequence, 0, charsequence.length(), l, i2, textpaint);
        obj1 = new BitmapDrawable(((Resources) (obj1)), bitmap);
        ((BitmapDrawable) (obj1)).setBounds(0, 0, k1, l1);
        textpaint.setTextSize(f1);
        textpaint.setColor(j1);
        h = new android.support.v4.content.res.a();
        textpaint = a(objectinterface, ((BitmapDrawable) (obj1)), ((Rect) (obj)), flag, flag1);
        textpaint.a(j.getIntrinsicWidth() + b);
        return textpaint;
    }

    protected abstract ParticipantSpan a(ObjectInterface objectinterface, BitmapDrawable bitmapdrawable, Rect rect, boolean flag, boolean flag1);

    public Context b()
    {
        return k;
    }

    protected abstract CharSequence b(ObjectInterface objectinterface);

    protected a.d(Context context)
    {
        h = new android.support.v4.content.res.a();
        k = context;
        context = context.getResources();
        f = (int)context.getDimension(0x7f0c00bc);
        g = (int)context.getDimension(0x7f0c00c4);
        b = g;
        i = new Drawable[a.values().length];
        i[com.skype.android.widget.a.a.a()] = android.support.v4.content.res.a.a(context, 0x7f020144);
        i[a.b.a()] = android.support.v4.content.res.a.a(context, 0x7f020145);
        i[a.c.a()] = android.support.v4.content.res.a.a(context, 0x7f020146);
        j = android.support.v4.content.res.a.a(context, 0x7f02010e);
        c = context.getDimensionPixelSize(0x7f0c0192);
        d = context.getDimensionPixelSize(0x7f0c0191);
        a = context.getDimensionPixelSize(0x7f0c0251);
        e = context.getDimensionPixelSize(0x7f0c0193);
    }
}
