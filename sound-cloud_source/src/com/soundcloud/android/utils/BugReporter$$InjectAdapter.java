// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.res.Resources;
import com.soundcloud.android.properties.ApplicationProperties;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.utils:
//            BugReporter, DeviceHelper

public final class  extends b
    implements Provider
{

    private b applicationProperties;
    private b deviceHelper;
    private b resources;

    public final void attach(l l1)
    {
        applicationProperties = l1.a("com.soundcloud.android.properties.ApplicationProperties", com/soundcloud/android/utils/BugReporter, getClass().getClassLoader());
        deviceHelper = l1.a("com.soundcloud.android.utils.DeviceHelper", com/soundcloud/android/utils/BugReporter, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/utils/BugReporter, getClass().getClassLoader());
    }

    public final BugReporter get()
    {
        return new BugReporter((ApplicationProperties)applicationProperties.get(), (DeviceHelper)deviceHelper.get(), (Resources)resources.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(applicationProperties);
        set.add(deviceHelper);
        set.add(resources);
    }

    public ()
    {
        super("com.soundcloud.android.utils.BugReporter", "members/com.soundcloud.android.utils.BugReporter", false, com/soundcloud/android/utils/BugReporter);
    }
}
