// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import java.lang.reflect.Field;

// Referenced classes of package com.google.b:
//            d

final class i extends d
{

    i(String s)
    {
        super(s, 4, (byte)0);
    }

    public final String a(Field field)
    {
        return d.a(field.getName(), "-").toLowerCase();
    }
}
