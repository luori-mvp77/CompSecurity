// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            VideoPreviewActivity, ConversationTextEntry

class ct
    implements android.widget.TextView.OnEditorActionListener
{

    private static final String z;
    final VideoPreviewActivity a;

    ct(VideoPreviewActivity videopreviewactivity)
    {
        a = videopreviewactivity;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (keyevent != null && keyevent.getKeyCode() == 66)
        {
            ((InputMethodManager)a.getSystemService(z)).hideSoftInputFromWindow(VideoPreviewActivity.j(a).getWindowToken(), 0);
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\005x<w\0333{)v\007\003r".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 111;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 108;
          goto _L8
_L3:
        byte0 = 22;
          goto _L8
_L4:
        byte0 = 76;
          goto _L8
        byte0 = 2;
          goto _L8
    }
}
