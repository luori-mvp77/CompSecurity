// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.accountsync.PerformSyncManager;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            App

final class ge extends Handler
{

    private static final String z[];

    ge()
    {
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (!App.o())
        {
            break; /* Loop/switch isn't completed */
        }
        Log.i(z[1]);
        removeMessages(0);
        sendEmptyMessageDelayed(0, 15000L);
        if (App.am == 0) goto _L1; else goto _L3
_L3:
        Log.i(z[0]);
        removeMessages(0);
        PerformSyncManager.d(App.au);
        return;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "\n\023\031]4\022\r\n]5\036\r";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "\n\023\031]4\022\r\n]#\016\017\b\013";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 71;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 107;
          goto _L9
_L5:
        byte0 = 99;
          goto _L9
_L6:
        byte0 = 105;
          goto _L9
        byte0 = 114;
          goto _L9
    }
}
