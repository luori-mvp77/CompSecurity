// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import me.lyft.android.domain.location.Location;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideMap

class this._cls0
    implements Action1
{

    final RideMap this$0;

    public volatile void call(Object obj)
    {
        call((Location)obj);
    }

    public void call(Location location)
    {
        RideMap.access$300(RideMap.this).onNext(location);
    }

    cation()
    {
        this$0 = RideMap.this;
        super();
    }
}
