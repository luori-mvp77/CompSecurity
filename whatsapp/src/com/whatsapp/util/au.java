// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import java.io.RandomAccessFile;

// Referenced classes of package com.whatsapp.util:
//            ad, bi

public class au extends ad
{

    private static final String z;
    int d;
    String e;
    String f;
    String g;
    String h;

    public au(long l, String s, RandomAccessFile randomaccessfile)
    {
        super(l, s, randomaccessfile);
        d = bi.b(randomaccessfile);
        bi.e(randomaccessfile);
        e = bi.a(randomaccessfile, 4);
        g = bi.a(randomaccessfile, 4);
        h = bi.a(randomaccessfile, 4);
        bi.d(randomaccessfile);
        bi.d(randomaccessfile);
        int j = bi.b(randomaccessfile);
        int i = j;
        if ((long)j != l - 33L)
        {
            i = (int)l - 33;
            randomaccessfile.seek(randomaccessfile.getFilePointer() - 1L);
        }
        s = new byte[i];
        randomaccessfile.read(s, 0, i);
        f = new String(s);
    }

    public String toString()
    {
        return (new StringBuilder()).append(super.toString()).append("[").append(e).append("/").append(g).append(z).append(f).append("]").toString();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "R\031]".toCharArray();
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
        byte byte0 = 15;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 114;
          goto _L8
_L3:
        byte0 = 52;
          goto _L8
_L4:
        byte0 = 125;
          goto _L8
        byte0 = 53;
          goto _L8
    }
}
