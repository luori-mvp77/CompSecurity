// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound.ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import cQ;
import cT;
import cV;
import cW;
import cX;
import cZ;
import da;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SpringConfiguratorView extends FrameLayout
{
    final class a
        implements android.view.View.OnTouchListener
    {

        private SpringConfiguratorView a;

        public final boolean onTouch(View view, MotionEvent motionevent)
        {
            if (motionevent.getAction() == 0)
            {
                SpringConfiguratorView.g(a);
            }
            return true;
        }

        private a()
        {
            a = SpringConfiguratorView.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b
        implements cX
    {

        private SpringConfiguratorView a;

        public final void a()
        {
        }

        public final void a(cT ct)
        {
            float f1 = (float)ct.d.a;
            float f2 = SpringConfiguratorView.h(a);
            float f3 = SpringConfiguratorView.i(a);
            a.setTranslationY(f1 * (f3 - f2) + f2);
        }

        private b()
        {
            a = SpringConfiguratorView.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    final class c
        implements android.widget.SeekBar.OnSeekBarChangeListener
    {

        private SpringConfiguratorView a;

        public final void onProgressChanged(SeekBar seekbar, int i1, boolean flag)
        {
            if (seekbar == SpringConfiguratorView.c(a))
            {
                float f1 = ((float)i1 * 200F) / 100000F + 0.0F;
                SpringConfiguratorView.b(a).b = cQ.a(f1);
                String s = SpringConfiguratorView.a().format(f1);
                SpringConfiguratorView.d(a).setText((new StringBuilder("T:")).append(s).toString());
            }
            if (seekbar == SpringConfiguratorView.e(a))
            {
                float f2 = ((float)i1 * 50F) / 100000F + 0.0F;
                SpringConfiguratorView.b(a).a = cQ.b(f2);
                seekbar = SpringConfiguratorView.a().format(f2);
                SpringConfiguratorView.f(a).setText((new StringBuilder("F:")).append(seekbar).toString());
            }
        }

        public final void onStartTrackingTouch(SeekBar seekbar)
        {
        }

        public final void onStopTrackingTouch(SeekBar seekbar)
        {
        }

        private c()
        {
            a = SpringConfiguratorView.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    final class d extends BaseAdapter
    {

        final List a = new ArrayList();
        private final Context b;
        private SpringConfiguratorView c;

        public final void a(String s)
        {
            a.add(s);
            notifyDataSetChanged();
        }

        public final int getCount()
        {
            return a.size();
        }

        public final Object getItem(int i1)
        {
            return a.get(i1);
        }

        public final long getItemId(int i1)
        {
            return (long)i1;
        }

        public final View getView(int i1, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                view = new TextView(b);
                view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -1));
                int j1 = da.a(12F, c.getResources());
                view.setPadding(j1, j1, j1, j1);
                view.setTextColor(SpringConfiguratorView.j(c));
            } else
            {
                view = (TextView)view;
            }
            view.setText((CharSequence)a.get(i1));
            return view;
        }

        public d(Context context)
        {
            c = SpringConfiguratorView.this;
            super();
            b = context;
        }
    }

    final class e
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        private SpringConfiguratorView a;

        public final void onItemSelected(AdapterView adapterview, View view, int i1, long l1)
        {
            SpringConfiguratorView.a(a, (cV)SpringConfiguratorView.a(a).get(i1));
            SpringConfiguratorView.b(a, SpringConfiguratorView.b(a));
        }

        public final void onNothingSelected(AdapterView adapterview)
        {
        }

        private e()
        {
            a = SpringConfiguratorView.this;
            super();
        }

        e(byte byte0)
        {
            this();
        }
    }


    private static final DecimalFormat a = new DecimalFormat("#.#");
    private final d b;
    private final List c;
    private final cT d;
    private final float e;
    private final float f;
    private final cW g;
    private final int h;
    private SeekBar i;
    private SeekBar j;
    private Spinner k;
    private TextView l;
    private TextView m;
    private cV n;

    public SpringConfiguratorView(Context context)
    {
        this(context, null);
    }

    public SpringConfiguratorView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SpringConfiguratorView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = new ArrayList();
        h = Color.argb(255, 225, 225, 225);
        attributeset = cZ.c();
        if (cW.a == null)
        {
            cW.a = new cW();
        }
        g = cW.a;
        b = new d(context);
        Object obj = getResources();
        f = da.a(40F, ((android.content.res.Resources) (obj)));
        e = da.a(280F, ((android.content.res.Resources) (obj)));
        d = attributeset.a();
        attributeset = new b((byte)0);
        d.a(1.0D).b(1.0D).a(attributeset);
        obj = getResources();
        i1 = da.a(5F, ((android.content.res.Resources) (obj)));
        int j1 = da.a(10F, ((android.content.res.Resources) (obj)));
        int k1 = da.a(20F, ((android.content.res.Resources) (obj)));
        Object obj1 = new android.widget.TableLayout.LayoutParams(0, -2, 1.0F);
        ((android.widget.TableLayout.LayoutParams) (obj1)).setMargins(0, 0, i1, 0);
        attributeset = new FrameLayout(context);
        attributeset.setLayoutParams(da.a(-1, da.a(300F, ((android.content.res.Resources) (obj)))));
        Object obj3 = new FrameLayout(context);
        Object obj2 = da.a(-1, -1);
        ((android.widget.FrameLayout.LayoutParams) (obj2)).setMargins(0, k1, 0, 0);
        ((FrameLayout) (obj3)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
        ((FrameLayout) (obj3)).setBackgroundColor(Color.argb(100, 0, 0, 0));
        attributeset.addView(((View) (obj3)));
        k = new Spinner(context, 0);
        obj2 = da.a(-1, -2);
        obj2.gravity = 48;
        ((android.widget.FrameLayout.LayoutParams) (obj2)).setMargins(j1, j1, j1, 0);
        k.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
        ((FrameLayout) (obj3)).addView(k);
        obj2 = new LinearLayout(context);
        android.widget.FrameLayout.LayoutParams layoutparams = da.a(-1, -2);
        layoutparams.setMargins(0, 0, 0, da.a(80F, ((android.content.res.Resources) (obj))));
        layoutparams.gravity = 80;
        ((LinearLayout) (obj2)).setLayoutParams(layoutparams);
        ((LinearLayout) (obj2)).setOrientation(1);
        ((FrameLayout) (obj3)).addView(((View) (obj2)));
        obj3 = new LinearLayout(context);
        layoutparams = da.a(-1, -2);
        layoutparams.setMargins(j1, j1, j1, k1);
        ((LinearLayout) (obj3)).setPadding(j1, j1, j1, j1);
        ((LinearLayout) (obj3)).setLayoutParams(layoutparams);
        ((LinearLayout) (obj3)).setOrientation(0);
        ((LinearLayout) (obj2)).addView(((View) (obj3)));
        i = new SeekBar(context);
        i.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((LinearLayout) (obj3)).addView(i);
        m = new TextView(getContext());
        m.setTextColor(h);
        layoutparams = da.a(da.a(50F, ((android.content.res.Resources) (obj))), -1);
        m.setGravity(19);
        m.setLayoutParams(layoutparams);
        m.setMaxLines(1);
        ((LinearLayout) (obj3)).addView(m);
        obj3 = new LinearLayout(context);
        layoutparams = da.a(-1, -2);
        layoutparams.setMargins(j1, j1, j1, k1);
        ((LinearLayout) (obj3)).setPadding(j1, j1, j1, j1);
        ((LinearLayout) (obj3)).setLayoutParams(layoutparams);
        ((LinearLayout) (obj3)).setOrientation(0);
        ((LinearLayout) (obj2)).addView(((View) (obj3)));
        j = new SeekBar(context);
        j.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((LinearLayout) (obj3)).addView(j);
        l = new TextView(getContext());
        l.setTextColor(h);
        obj1 = da.a(da.a(50F, ((android.content.res.Resources) (obj))), -1);
        l.setGravity(19);
        l.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        l.setMaxLines(1);
        ((LinearLayout) (obj3)).addView(l);
        context = new View(context);
        obj = da.a(da.a(60F, ((android.content.res.Resources) (obj))), da.a(40F, ((android.content.res.Resources) (obj))));
        obj.gravity = 49;
        context.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        context.setOnTouchListener(new a((byte)0));
        context.setBackgroundColor(Color.argb(255, 0, 164, 209));
        attributeset.addView(context);
        addView(attributeset);
        context = new c((byte)0);
        i.setMax(0x186a0);
        i.setOnSeekBarChangeListener(context);
        j.setMax(0x186a0);
        j.setOnSeekBarChangeListener(context);
        k.setAdapter(b);
        k.setOnItemSelectedListener(new e((byte)0));
        b();
        setTranslationY(e);
    }

    static cV a(SpringConfiguratorView springconfiguratorview, cV cv)
    {
        springconfiguratorview.n = cv;
        return cv;
    }

    static DecimalFormat a()
    {
        return a;
    }

    static List a(SpringConfiguratorView springconfiguratorview)
    {
        return springconfiguratorview.c;
    }

    static cV b(SpringConfiguratorView springconfiguratorview)
    {
        return springconfiguratorview.n;
    }

    private void b()
    {
        Map map = Collections.unmodifiableMap(g.b);
        Object obj = b;
        ((d) (obj)).a.clear();
        ((d) (obj)).notifyDataSetChanged();
        c.clear();
        obj = map.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            if (entry.getKey() != cV.c)
            {
                c.add(entry.getKey());
                b.a((String)entry.getValue());
            }
        } while (true);
        c.add(cV.c);
        b.a((String)map.get(cV.c));
        b.notifyDataSetChanged();
        if (c.size() > 0)
        {
            k.setSelection(0);
        }
    }

    static void b(SpringConfiguratorView springconfiguratorview, cV cv)
    {
        double d2 = 0.0D;
        double d1 = cv.b;
        int i1;
        int j1;
        if (d1 == 0.0D)
        {
            d1 = 0.0D;
        } else
        {
            d1 = (d1 - 194D) / 3.6200000000000001D + 30D;
        }
        i1 = Math.round(((float)d1 * 100000F) / 200F);
        d1 = cv.a;
        if (d1 == 0.0D)
        {
            d1 = d2;
        } else
        {
            d1 = (d1 - 25D) / 3D + 8D;
        }
        j1 = Math.round(((float)d1 * 100000F) / 50F);
        springconfiguratorview.i.setProgress(i1);
        springconfiguratorview.j.setProgress(j1);
    }

    static SeekBar c(SpringConfiguratorView springconfiguratorview)
    {
        return springconfiguratorview.i;
    }

    static TextView d(SpringConfiguratorView springconfiguratorview)
    {
        return springconfiguratorview.m;
    }

    static SeekBar e(SpringConfiguratorView springconfiguratorview)
    {
        return springconfiguratorview.j;
    }

    static TextView f(SpringConfiguratorView springconfiguratorview)
    {
        return springconfiguratorview.l;
    }

    static void g(SpringConfiguratorView springconfiguratorview)
    {
        double d1 = 1.0D;
        double d2 = springconfiguratorview.d.h;
        springconfiguratorview = springconfiguratorview.d;
        if (d2 == 1.0D)
        {
            d1 = 0.0D;
        }
        springconfiguratorview.b(d1);
    }

    static float h(SpringConfiguratorView springconfiguratorview)
    {
        return springconfiguratorview.f;
    }

    static float i(SpringConfiguratorView springconfiguratorview)
    {
        return springconfiguratorview.e;
    }

    static int j(SpringConfiguratorView springconfiguratorview)
    {
        return springconfiguratorview.h;
    }

}
