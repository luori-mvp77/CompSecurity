// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import com.go.gl.view.GLView;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            HourlyTypeView

class q
    implements com.go.gl.view.GLView.OnClickListener
{

    final HourlyTypeView a;

    q(HourlyTypeView hourlytypeview)
    {
        a = hourlytypeview;
        super();
    }

    public void onClick(GLView glview)
    {
        if (HourlyTypeView.access$000(a) != 5)
        {
            return;
        } else
        {
            HourlyTypeView.access$100(a);
            return;
        }
    }
}
