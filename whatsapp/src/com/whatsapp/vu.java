// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            Voip, VoipActivity, App

class vu
    implements android.view.View.OnClickListener
{

    private static final String z;
    final VoipActivity a;

    vu(VoipActivity voipactivity)
    {
        a = voipactivity;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            Log.i(z);
            if (Voip.getCurrentCallState() == Voip.CallState.RECEIVED_CALL)
            {
                VoipActivity.f(a);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            VoipActivity.e(a);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "lT~:c\177Usj {W{j!oOc%-:Ke/0i^s".toCharArray();
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
        byte byte0 = 67;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 26;
          goto _L8
_L3:
        byte0 = 59;
          goto _L8
_L4:
        byte0 = 23;
          goto _L8
        byte0 = 74;
          goto _L8
    }
}
