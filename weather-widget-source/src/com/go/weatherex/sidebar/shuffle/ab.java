// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;


// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            aa, ShuffleLoadingActivity

class ab
    implements Runnable
{

    final aa a;

    ab(aa aa1)
    {
        a = aa1;
        super();
    }

    public void run()
    {
        if (!ShuffleLoadingActivity.c(a.a))
        {
            ShuffleLoadingActivity.e(a.a);
        }
    }
}
