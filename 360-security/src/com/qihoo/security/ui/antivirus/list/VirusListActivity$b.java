// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;


// Referenced classes of package com.qihoo.security.ui.antivirus.list:
//            VirusListActivity

private static final class  extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo/security/ui/antivirus/list/VirusListActivity$b, s);
    }

    public static [] values()
    {
        return ([])e.clone();
    }

    static 
    {
        a = new <init>("REPAIR_ALL", 0);
        b = new <init>("REPAIR_SELECTED", 1);
        c = new <init>("REPAIR", 2);
        d = new <init>("FINISH", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
