// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            k6, og, App

public class kn extends k6
{

    private static final String z;
    og b;

    public kn(og og1)
    {
        b = og1;
    }

    public String a()
    {
        return (new StringBuilder()).append(z).append(b.a).toString();
    }

    public void c()
    {
        App.b(b);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "$J\013h{4L\013xv0V{".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
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
        byte byte0 = 19;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 85;
          goto _L8
_L3:
        byte0 = 56;
          goto _L8
_L4:
        byte0 = 84;
          goto _L8
        byte0 = 11;
          goto _L8
    }
}
