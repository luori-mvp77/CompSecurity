// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            l

private static class <init>
{

    private boolean a(TreeMap treemap, View view, List list)
    {
        if (list.contains(view))
        {
            return false;
        }
        if (treemap.containsKey(view))
        {
            List list1 = (List)treemap.remove(view);
            list.add(view);
            int j = list1.size();
            for (int i = 0; i < j; i++)
            {
                if (!a(treemap, (View)list1.get(i), list))
                {
                    return false;
                }
            }

            list.remove(view);
        }
        return true;
    }

    public boolean a(TreeMap treemap)
    {
        ArrayList arraylist = new ArrayList();
        while (!treemap.isEmpty()) 
        {
            if (!a(treemap, (View)treemap.firstKey(), ((List) (arraylist))))
            {
                return false;
            }
        }
        return true;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
