// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import me.lyft.android.flows.ProfileFlow;

// Referenced classes of package me.lyft.android.ui.passenger:
//            DriverPhotoView

class this._cls0
    implements android.view.er
{

    final DriverPhotoView this$0;

    public void onClick(View view)
    {
        profileFlow.openDriverRideProfile();
    }

    ()
    {
        this$0 = DriverPhotoView.this;
        super();
    }
}
