// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.zzfn;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzc

static final class a extends RelativeLayout
{

    zzfn a;

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        a.zzc(motionevent);
        return false;
    }

    public (Context context, String s)
    {
        super(context);
        a = new zzfn(context, s);
    }
}
