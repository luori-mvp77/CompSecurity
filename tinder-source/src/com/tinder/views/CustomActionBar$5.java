// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import com.tinder.activities.ActivityMain;
import com.tinder.e.s;

// Referenced classes of package com.tinder.views:
//            CustomActionBar

class this._cls0
    implements s
{

    final CustomActionBar this$0;

    public void onMenuItemClick(int i)
    {
        if (CustomActionBar.access$000(CustomActionBar.this) instanceof ActivityMain)
        {
            ((ActivityMain)CustomActionBar.access$000(CustomActionBar.this)).i();
        }
    }

    ()
    {
        this$0 = CustomActionBar.this;
        super();
    }
}
