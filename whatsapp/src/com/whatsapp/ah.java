// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.b3;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            e5, App, tt, af2, 
//            ey

class ah
    implements Runnable
{

    private static final String z[];
    final b3 a;
    final e5 b;

    ah(e5 e5_1, b3 b3)
    {
        b = e5_1;
        a = b3;
        super();
    }

    public void run()
    {
        Log.i(z[1]);
        if (!e5.a(b).aq.b())
        {
            Log.i(z[0]);
            e5.a(b).aq.h();
        }
        e5.a(b).ab().post(new af2(this, e5.a(b).aq.b(), e5.a(b).aq.g(), e5.a(b).aq.a(), e5.a(b).aq.f().b()));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "N\021\005]G[\005JYIKI\004^\bZ\007\031TF[I\032CMD\f\023B\023\017\016\017_M]\b\036XFHI\031^EJI\004T_\017\006\004T[";
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
                obj = "N\021\005]G[\005JPX_\f\004UAA\016JPLK\000\036XGA\b\006\021X]\f\001TQ\\";
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
        byte byte0 = 40;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 47;
          goto _L9
_L5:
        byte0 = 105;
          goto _L9
_L6:
        byte0 = 106;
          goto _L9
        byte0 = 49;
          goto _L9
    }
}
