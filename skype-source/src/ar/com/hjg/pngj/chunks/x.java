// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.r;
import ar.com.hjg.pngj.v;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            z, d

public final class x extends z
{

    private int h;

    public x(m m)
    {
        super("sRGB", m);
    }

    public final void a(d d1)
    {
        if (d1.a != 1)
        {
            throw new v((new StringBuilder("bad chunk length ")).append(d1).toString());
        } else
        {
            h = r.a(d1.d, 0);
            return;
        }
    }
}
