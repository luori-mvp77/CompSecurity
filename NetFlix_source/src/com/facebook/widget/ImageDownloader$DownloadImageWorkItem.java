// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;

// Referenced classes of package com.facebook.widget:
//            ImageDownloader

private static class key
    implements Runnable
{

    private Context context;
    private context key;

    public void run()
    {
        ImageDownloader.access$200(key, context);
    }

    (Context context1,  )
    {
        context = context1;
        key = ;
    }
}
