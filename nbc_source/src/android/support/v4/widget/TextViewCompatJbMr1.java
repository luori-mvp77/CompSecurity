// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

class TextViewCompatJbMr1
{

    public static void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
    {
        boolean flag = true;
        Drawable drawable4;
        if (textview.getLayoutDirection() != 1)
        {
            flag = false;
        }
        if (flag)
        {
            drawable4 = drawable2;
        } else
        {
            drawable4 = drawable;
        }
        if (!flag)
        {
            drawable = drawable2;
        }
        textview.setCompoundDrawables(drawable4, drawable1, drawable, drawable3);
    }
}
