// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.app.AlertDialog;
import android.view.View;
import com.roidapp.photogrid.common.o;

// Referenced classes of package com.roidapp.photogrid:
//            MainPage

final class w
    implements android.view.View.OnClickListener
{

    final AlertDialog a;
    final MainPage b;

    w(MainPage mainpage, AlertDialog alertdialog)
    {
        b = mainpage;
        a = alertdialog;
        super();
    }

    public final void onClick(View view)
    {
        (new o(b)).d();
        a.dismiss();
    }
}
