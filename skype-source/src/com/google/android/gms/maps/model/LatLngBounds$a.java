// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.y;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLngBounds, LatLng

public static final class d
{

    private double a;
    private double b;
    private double c;
    private double d;

    public final d a(LatLng latlng)
    {
        double d1;
        boolean flag1;
        flag1 = true;
        a = Math.min(a, latlng.a);
        b = Math.max(b, latlng.a);
        d1 = latlng.b;
        if (!Double.isNaN(c)) goto _L2; else goto _L1
_L1:
        c = d1;
_L6:
        d = d1;
_L4:
        return this;
_L2:
        boolean flag;
        if (c <= d)
        {
            if (c <= d1 && d1 <= d)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = flag1;
            if (c > d1)
            {
                flag = flag1;
                if (d1 > d)
                {
                    flag = false;
                }
            }
        }
        if (flag) goto _L4; else goto _L3
_L3:
        if (LatLngBounds.a(c, d1) < LatLngBounds.b(d, d1))
        {
            c = d1;
            return this;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final LatLngBounds a()
    {
        boolean flag;
        if (!Double.isNaN(c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.a(flag, "no included points");
        return new LatLngBounds(new LatLng(a, c), new LatLng(b, d));
    }

    public ()
    {
        a = (1.0D / 0.0D);
        b = (-1.0D / 0.0D);
        c = (0.0D / 0.0D);
        d = (0.0D / 0.0D);
    }
}
