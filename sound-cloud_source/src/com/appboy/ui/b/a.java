// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.appboy.d;
import com.appboy.d.a.b;
import com.appboy.d.a.c;
import com.appboy.d.a.e;
import com.appboy.d.a.f;
import com.appboy.ui.widget.h;
import com.appboy.ui.widget.j;
import com.appboy.ui.widget.k;
import com.appboy.ui.widget.m;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class a extends ArrayAdapter
{

    private static final String b;
    public final Set a = new HashSet();
    private final Context c;
    private final com.appboy.ui.c.a d;

    public a(Context context, int i, List list)
    {
        super(context, i, list);
        c = context;
        d = new com.appboy.ui.c.a(context);
    }

    private void a(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        super.add(c1);
        this;
        JVM INSTR monitorexit ;
        return;
        c1;
        throw c1;
    }

    private void a(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        super.addAll(collection);
        this;
        JVM INSTR monitorexit ;
        return;
        collection;
        throw collection;
    }

    public final void a(int i, int l)
    {
        if (getCount() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        i = Math.max(0, i);
        l = Math.min(getCount(), l);
_L5:
        if (i >= l) goto _L1; else goto _L3
_L3:
        c c1 = (c)getItem(i);
        if (c1 == null) goto _L1; else goto _L4
_L4:
        if (!c1.f())
        {
            c1.g();
        }
        i++;
          goto _L5
    }

    public final void a(List list)
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        setNotifyOnChange(false);
        if (list != null) goto _L2; else goto _L1
_L1:
        clear();
        notifyDataSetChanged();
_L7:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i1;
        String.format("Replacing existing feed of %d cards with new feed containing %d cards.", new Object[] {
            Integer.valueOf(getCount()), Integer.valueOf(list.size())
        });
        i1 = list.size();
        int l = 0;
_L3:
        c c2;
        if (l >= getCount())
        {
            break MISSING_BLOCK_LABEL_148;
        }
        c2 = (c)getItem(l);
        c c1;
        c1 = null;
        if (i >= i1)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        c1 = (c)list.get(i);
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        if (!c1.a(c2))
        {
            break MISSING_BLOCK_LABEL_135;
        }
        i++;
        l++;
          goto _L3
        remove(c2);
          goto _L3
        list;
        throw list;
        if (android.os.Build.VERSION.SDK_INT >= 11) goto _L5; else goto _L4
_L4:
        if (i >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        a((c)list.get(i));
        i++;
        if (true) goto _L4; else goto _L6
_L5:
        a(((Collection) (list.subList(i, i1))));
_L6:
        notifyDataSetChanged();
          goto _L7
    }

    public void add(Object obj)
    {
        a((c)obj);
    }

    public int getItemViewType(int i)
    {
        c c1 = (c)getItem(i);
        if (c1 instanceof com.appboy.d.a.a)
        {
            return 1;
        }
        if (c1 instanceof b)
        {
            return 2;
        }
        if (c1 instanceof com.appboy.d.a.d)
        {
            return 3;
        }
        if (c1 instanceof e)
        {
            return 4;
        }
        return !(c1 instanceof f) ? 0 : 5;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = (c)getItem(i);
        String s;
        if (view == null)
        {
            if (viewgroup instanceof com.appboy.d.a.a)
            {
                view = new com.appboy.ui.widget.a(c);
            } else
            if (viewgroup instanceof b)
            {
                view = new com.appboy.ui.widget.f(c);
            } else
            if (viewgroup instanceof com.appboy.d.a.d)
            {
                view = new h(c);
            } else
            if (viewgroup instanceof e)
            {
                view = new k(c);
            } else
            if (viewgroup instanceof f)
            {
                view = new m(c);
            } else
            {
                view = new j(c);
            }
        } else
        {
            view = (com.appboy.ui.widget.c)view;
        }
        String.format("Using view of type: %s for card at position %d: %s", new Object[] {
            view.getClass().getName(), Integer.valueOf(i), viewgroup.toString()
        });
        view.b(viewgroup);
        s = viewgroup.c();
        if (!a.contains(s))
        {
            a.add(s);
            viewgroup.a();
            String.format("Logged impression for card %s", new Object[] {
                s
            });
        } else
        {
            String.format("Already counted impression for card %s", new Object[] {
                s
            });
        }
        if (!viewgroup.d())
        {
            viewgroup.e();
        }
        return view;
    }

    public int getViewTypeCount()
    {
        return 8;
    }

    static 
    {
        b = String.format("%s.%s", new Object[] {
            d.a, com/appboy/ui/b/a.getName()
        });
    }
}
