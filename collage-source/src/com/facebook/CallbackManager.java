// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl;

public interface CallbackManager
{
    public static class Factory
    {

        public static CallbackManager create()
        {
            return new CallbackManagerImpl();
        }

        public Factory()
        {
        }
    }


    public abstract boolean onActivityResult(int i, int j, Intent intent);
}
