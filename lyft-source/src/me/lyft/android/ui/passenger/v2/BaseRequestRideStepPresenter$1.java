// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import me.lyft.android.domain.location.Location;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            BaseRequestRideStepPresenter

class this._cls0
    implements Func1
{

    final BaseRequestRideStepPresenter this$0;

    public volatile Object call(Object obj)
    {
        return call((Location)obj);
    }

    public String call(Location location)
    {
        return location.getDisplayName();
    }

    ()
    {
        this$0 = BaseRequestRideStepPresenter.this;
        super();
    }
}
