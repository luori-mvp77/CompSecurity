// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.widget.Checkable;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            i

class c extends i
    implements Checkable
{

    public c(Context context)
    {
        super(context);
    }

    public boolean isChecked()
    {
        return ((Checkable)a).isChecked();
    }

    public void setChecked(boolean flag)
    {
        ((Checkable)a).setChecked(flag);
    }

    public void toggle()
    {
        boolean flag;
        if (!isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }
}
