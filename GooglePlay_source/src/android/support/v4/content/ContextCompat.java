// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class ContextCompat
{

    public static final Drawable getDrawable(Context context, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return context.getDrawable(i);
        } else
        {
            return context.getResources().getDrawable(i);
        }
    }

    public static boolean startActivities(Context context, Intent aintent[], Bundle bundle)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 16)
        {
            context.startActivities(aintent, null);
            return true;
        }
        if (i >= 11)
        {
            context.startActivities(aintent);
            return true;
        } else
        {
            return false;
        }
    }
}
