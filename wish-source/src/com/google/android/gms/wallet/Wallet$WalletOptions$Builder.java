// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import java.util.Locale;

// Referenced classes of package com.google.android.gms.wallet:
//            Wallet

public static final class mTheme
{

    private int mTheme;
    private int zzaJy;

    static int zza(mTheme mtheme)
    {
        return mtheme.zzaJy;
    }

    static int zzb(zzaJy zzajy)
    {
        return zzajy.mTheme;
    }

    public mTheme build()
    {
        return new mTheme(this, null);
    }

    public mTheme setEnvironment(int i)
    {
        if (i == 0 || i == 2 || i == 1)
        {
            zzaJy = i;
            return this;
        } else
        {
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public zzaJy setTheme(int i)
    {
        if (i == 0 || i == 1)
        {
            mTheme = i;
            return this;
        } else
        {
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid theme value %d", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public ()
    {
        zzaJy = 0;
        mTheme = 0;
    }
}
