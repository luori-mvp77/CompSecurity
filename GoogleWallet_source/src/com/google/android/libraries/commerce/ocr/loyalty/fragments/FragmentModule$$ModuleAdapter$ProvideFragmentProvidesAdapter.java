// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import android.support.v4.app.Fragment;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            FragmentModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final FragmentModule module;

    public final Fragment get()
    {
        return module.provideFragment();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (FragmentModule fragmentmodule)
    {
        super("android.support.v4.app.Fragment", false, "com.google.android.libraries.commerce.ocr.loyalty.fragments.FragmentModule", "provideFragment");
        module = fragmentmodule;
        setLibrary(true);
    }
}
