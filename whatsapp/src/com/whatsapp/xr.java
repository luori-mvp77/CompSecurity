// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.Log;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            RecordAudio

class xr
    implements android.view.View.OnClickListener
{

    private static final String z;
    final RecordAudio a;

    xr(RecordAudio recordaudio)
    {
        a = recordaudio;
        super();
    }

    public void onClick(View view)
    {
        Log.i(z);
        a.finish();
        if (!RecordAudio.d(a) && RecordAudio.m(a) != null && RecordAudio.m(a).exists())
        {
            RecordAudio.m(a).delete();
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\002PN\020\001\024TX\033\032\037\032N\036\035\023PA".toCharArray();
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
        byte byte0 = 115;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 112;
          goto _L8
_L3:
        byte0 = 53;
          goto _L8
_L4:
        byte0 = 45;
          goto _L8
        byte0 = 127;
          goto _L8
    }
}
