// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.view.View;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            StickersActivity

class a
    implements android.view.r
{

    final StickersActivity a;

    public void onClick(View view)
    {
        a.onOptionsItemSelected(StickersActivity.d(a));
    }

    (StickersActivity stickersactivity)
    {
        a = stickersactivity;
        super();
    }
}
