// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            dw, AccountInfoActivity, RegisterName

class qs
    implements android.view.View.OnClickListener
{

    private static final String z;
    final dw a;

    qs(dw dw1)
    {
        a = dw1;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent(a.d, com/whatsapp/AccountInfoActivity);
        view.putExtra(z, true);
        a.d.startActivity(view);
        a.d.finish();
        RegisterName.a(null);
        a.d.removeDialog(0);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\001w ".toCharArray();
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
    //                   2 97
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 61;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 99;
          goto _L8
_L3:
        byte0 = 2;
          goto _L8
_L4:
        byte0 = 89;
          goto _L8
        byte0 = 84;
          goto _L8
    }
}
