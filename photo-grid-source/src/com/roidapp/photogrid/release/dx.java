// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            dk

final class dx
    implements android.view.View.OnClickListener
{

    final Dialog a;
    final dk b;

    dx(dk dk, Dialog dialog)
    {
        b = dk;
        a = dialog;
        super();
    }

    public final void onClick(View view)
    {
        a.dismiss();
    }
}
