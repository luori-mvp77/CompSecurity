// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzkb, zznw, zznr, 
//            zznq, zzny

public static final class zzst extends zzns
{

    private static volatile zzaNT zzapc[];
    public String name;
    public zzaNT zzapd;

    public static zzst[] zzss()
    {
        if (zzapc == null)
        {
            synchronized (zznw.zzaNS)
            {
                if (zzapc == null)
                {
                    zzapc = new zzapc[0];
                }
            }
        }
        return zzapc;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof zzapc)) goto _L4; else goto _L3
_L3:
        obj = (zzapc)obj;
        if (name != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((name) (obj)).name != null) goto _L4; else goto _L7
_L7:
        if (zzapd != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        if (((zzapd) (obj)).zzapd != null) goto _L4; else goto _L8
_L8:
        return zza(((zzns) (obj)));
_L6:
        if (!name.equals(((name) (obj)).name))
        {
            return false;
        }
          goto _L7
        if (!zzapd.equals(((equals) (obj)).zzapd))
        {
            return false;
        }
          goto _L8
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (name == null)
        {
            i = 0;
        } else
        {
            i = name.hashCode();
        }
        if (zzapd != null)
        {
            j = zzapd.hashCode();
        }
        return ((i + 527) * 31 + j) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (!name.equals(""))
        {
            zznr1.zzb(1, name);
        }
        if (zzapd != null)
        {
            zznr1.zza(2, zzapd);
        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzr(zznq1);
    }

    protected int zzc()
    {
        int j = super.zzc();
        int i = j;
        if (!name.equals(""))
        {
            i = j + zznr.zzj(1, name);
        }
        j = i;
        if (zzapd != null)
        {
            j = i + zznr.zzc(2, zzapd);
        }
        return j;
    }

    public zzapd zzr(zznq zznq1)
        throws IOException
    {
        do
        {
            int i = zznq1.zzzy();
            switch (i)
            {
            default:
                if (zza(zznq1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                name = zznq1.readString();
                break;

            case 18: // '\022'
                if (zzapd == null)
                {
                    zzapd = new <init>();
                }
                zznq1.zza(zzapd);
                break;
            }
        } while (true);
    }

    public zzapd zzst()
    {
        name = "";
        zzapd = null;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public ()
    {
        zzst();
    }
}
