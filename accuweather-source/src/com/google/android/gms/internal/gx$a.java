// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            gx, hl

public static final class FQ
{

    public final int FP;
    public final int FQ;

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof FQ) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (this == obj) goto _L4; else goto _L3
_L3:
        obj = (FQ)obj;
        if (((FQ) (obj)).FP != FP)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((FP) (obj)).FQ == FQ) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Integer.valueOf(FP), Integer.valueOf(FQ)
        });
    }

    public (int i, int j)
    {
        FP = i;
        FQ = j;
    }
}
