// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

// Referenced classes of package com.google.android.gms.internal:
//            cs

static final class ii
    implements android.content.gInterface.OnClickListener
{

    final JsResult ii;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ii.cancel();
    }

    ckListener(JsResult jsresult)
    {
        ii = jsresult;
        super();
    }
}
