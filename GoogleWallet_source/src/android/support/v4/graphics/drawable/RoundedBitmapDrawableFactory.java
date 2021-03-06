// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.support.v4.view.GravityCompat;

// Referenced classes of package android.support.v4.graphics.drawable:
//            RoundedBitmapDrawable21, RoundedBitmapDrawable

public final class RoundedBitmapDrawableFactory
{
    static final class DefaultRoundedBitmapDrawable extends RoundedBitmapDrawable
    {

        final void gravityCompatApply(int i, int j, int k, Rect rect, Rect rect1)
        {
            GravityCompat.apply(i, j, k, rect, rect1, 0);
        }

        DefaultRoundedBitmapDrawable(Resources resources, Bitmap bitmap)
        {
            super(resources, bitmap);
        }
    }


    public static RoundedBitmapDrawable create(Resources resources, Bitmap bitmap)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return new RoundedBitmapDrawable21(resources, bitmap);
        } else
        {
            return new DefaultRoundedBitmapDrawable(resources, bitmap);
        }
    }
}
