// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.soundcloud.android.crypto.Obfuscator;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.storage:
//            StorageModule

public static final class setLibrary extends t
    implements Provider
{

    private b context;
    private final StorageModule module;
    private b obfuscator;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/storage/StorageModule, getClass().getClassLoader());
        obfuscator = l1.a("com.soundcloud.android.crypto.Obfuscator", com/soundcloud/android/storage/StorageModule, getClass().getClassLoader());
    }

    public final SharedPreferences get()
    {
        return module.provideFeaturePrefs((Context)context.get(), (Obfuscator)obfuscator.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(obfuscator);
    }

    public (StorageModule storagemodule)
    {
        super("@javax.inject.Named(value=Features)/android.content.SharedPreferences", true, "com.soundcloud.android.storage.StorageModule", "provideFeaturePrefs");
        module = storagemodule;
        setLibrary(true);
    }
}
