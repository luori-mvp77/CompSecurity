// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import dagger.a.b;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.utils:
//            GooglePlayServicesWrapper

public final class  extends b
    implements Provider
{

    public final GooglePlayServicesWrapper get()
    {
        return new GooglePlayServicesWrapper();
    }

    public final volatile Object get()
    {
        return get();
    }

    public ()
    {
        super("com.soundcloud.android.utils.GooglePlayServicesWrapper", "members/com.soundcloud.android.utils.GooglePlayServicesWrapper", false, com/soundcloud/android/utils/GooglePlayServicesWrapper);
    }
}
