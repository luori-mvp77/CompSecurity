// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.google.android.gms.common.internal.au;

public class e extends DialogFragment
{

    private Dialog a;
    private android.content.DialogInterface.OnCancelListener b;

    public e()
    {
        a = null;
        b = null;
    }

    public static e a(Dialog dialog, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        e e1 = new e();
        dialog = (Dialog)au.a(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        e1.a = dialog;
        if (oncancellistener != null)
        {
            e1.b = oncancellistener;
        }
        return e1;
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (b != null)
        {
            b.onCancel(dialoginterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if (a == null)
        {
            setShowsDialog(false);
        }
        return a;
    }

    public void show(FragmentManager fragmentmanager, String s)
    {
        super.show(fragmentmanager, s);
    }
}
