// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx;

import rx.functions.Func2;

// Referenced classes of package rx:
//            Observable

final class 
    implements Func2
{

    public final Boolean call(Object obj, Object obj1)
    {
        if (obj == null)
        {
            boolean flag;
            if (obj1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        } else
        {
            return Boolean.valueOf(obj.equals(obj1));
        }
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call(obj, obj1);
    }

    ()
    {
    }
}
