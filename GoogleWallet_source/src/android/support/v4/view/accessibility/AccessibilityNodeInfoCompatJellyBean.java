// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

final class AccessibilityNodeInfoCompatJellyBean
{

    public static int getMovementGranularities(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).getMovementGranularities();
    }

    public static boolean isAccessibilityFocused(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isAccessibilityFocused();
    }

    public static boolean isVisibleToUser(Object obj)
    {
        return ((AccessibilityNodeInfo)obj).isVisibleToUser();
    }

    public static void setAccesibilityFocused(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setAccessibilityFocused(flag);
    }

    public static void setMovementGranularities(Object obj, int i)
    {
        ((AccessibilityNodeInfo)obj).setMovementGranularities(i);
    }

    public static void setVisibleToUser(Object obj, boolean flag)
    {
        ((AccessibilityNodeInfo)obj).setVisibleToUser(flag);
    }
}
