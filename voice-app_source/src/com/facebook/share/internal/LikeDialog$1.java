// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;

// Referenced classes of package com.facebook.share.internal:
//            ResultProcessor, LikeDialog

class or extends ResultProcessor
{

    final LikeDialog this$0;
    private final FacebookCallback val$callback;

    public void onSuccess(AppCall appcall, Bundle bundle)
    {
        val$callback.onSuccess(new sult(bundle));
    }

    sult(FacebookCallback facebookcallback1)
    {
        this$0 = final_likedialog;
        val$callback = facebookcallback1;
        super(FacebookCallback.this);
    }
}
