// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            ChangeNumber

class z5
    implements android.content.DialogInterface.OnClickListener
{

    final ChangeNumber a;

    z5(ChangeNumber changenumber)
    {
        a = changenumber;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ChangeNumber.b(a);
    }
}
