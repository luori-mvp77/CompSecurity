// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.a;

public class b extends a
{

    public b(String s, int i)
    {
        super(s, i);
    }

    protected void a(Bundle bundle, Boolean boolean1)
    {
        bundle.putBoolean(getName(), boolean1.booleanValue());
    }

    protected volatile void a(Bundle bundle, Object obj)
    {
        a(bundle, (Boolean)obj);
    }

    protected Object c(DataHolder dataholder, int i, int j)
    {
        return e(dataholder, i, j);
    }

    protected Boolean e(DataHolder dataholder, int i, int j)
    {
        return Boolean.valueOf(dataholder.d(getName(), i, j));
    }

    protected Object g(Bundle bundle)
    {
        return h(bundle);
    }

    protected Boolean h(Bundle bundle)
    {
        return Boolean.valueOf(bundle.getBoolean(getName()));
    }
}
