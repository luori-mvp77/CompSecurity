// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


public final class a9n
{

    public static boolean a;
    private static final String z;
    private final boolean b;

    public a9n(boolean flag)
    {
        b = flag;
    }

    public boolean a()
    {
        return b;
    }

    public String toString()
    {
        return (new StringBuilder()).append(z).append(b).append('}').toString();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\030\021gZG%>z\\I0\036z\\I.\026(".toCharArray();
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
        byte byte0 = 34;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 75;
          goto _L8
_L3:
        byte0 = 114;
          goto _L8
_L4:
        byte0 = 21;
          goto _L8
        byte0 = 63;
          goto _L8
    }
}
