// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.q;

import android.app.ActivityManager;
import com.google.common.base.Preconditions;

public class a
{

    private final ActivityManager a;

    public a(ActivityManager activitymanager)
    {
        a = (ActivityManager)Preconditions.checkNotNull(activitymanager);
    }
}
