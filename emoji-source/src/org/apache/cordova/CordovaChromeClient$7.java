// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.DialogInterface;
import android.view.KeyEvent;
import org.xwalk.core.XWalkJavascriptResult;

// Referenced classes of package org.apache.cordova:
//            CordovaChromeClient

class val.result
    implements android.content.istener
{

    final CordovaChromeClient this$0;
    final XWalkJavascriptResult val$result;

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            val$result.cancel();
            return false;
        } else
        {
            return true;
        }
    }

    ener()
    {
        this$0 = final_cordovachromeclient;
        val$result = XWalkJavascriptResult.this;
        super();
    }
}
