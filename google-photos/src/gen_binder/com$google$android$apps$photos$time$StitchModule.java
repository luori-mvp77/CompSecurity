// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package gen_binder;

import android.content.Context;
import ivh;
import java.util.HashMap;
import olm;
import olv;

public final class A
    implements olv
{

    private HashMap a;

    public final void a(Context context, Class class1, olm olm)
    {
        if (a == null)
        {
            a = new HashMap(2);
            a.put(ivh.a, Integer.valueOf(0));
            a.put(ivh.b, Integer.valueOf(1));
        }
        context = (Integer)a.get(class1.getName());
        if (context == null)
        {
            return;
        }
        switch (context.intValue())
        {
        default:
            return;

        case 0: // '\0'
            ivh.a(olm);
            return;

        case 1: // '\001'
            ivh.b(olm);
            break;
        }
    }

    public A()
    {
    }
}
