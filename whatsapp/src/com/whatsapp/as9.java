// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.whatsapp:
//            ov, aoz, _g

class as9
    implements Runnable
{

    final boolean a;
    final aoz b;
    final Collection c;

    as9(aoz aoz1, Collection collection, boolean flag)
    {
        b = aoz1;
        c = collection;
        a = flag;
        super();
    }

    public void run()
    {
        boolean flag = ov.e;
        HashMap hashmap = new HashMap();
        Iterator iterator = c.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c4 c4_1 = (c4)iterator.next();
            int i = com.whatsapp.aoz.a(b, c4_1, a);
            hashmap.put(c4_1.y.a, Integer.valueOf(i));
        } while (!flag);
        com.whatsapp.aoz.a(b).post(new _g(this, hashmap));
    }
}
