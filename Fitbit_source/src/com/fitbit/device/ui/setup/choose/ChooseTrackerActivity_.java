// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.choose;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.device.ui.setup.choose:
//            ChooseTrackerActivity

public final class ChooseTrackerActivity_ extends ChooseTrackerActivity
    implements org.androidannotations.a.c.a, b
{
    public static class a
    {

        private Context a;
        private final Intent b;
        private Fragment c;

        public Intent a()
        {
            return b;
        }

        public a a(int i)
        {
            b.setFlags(i);
            return this;
        }

        public void b()
        {
            a.startActivity(b);
        }

        public void b(int i)
        {
            if (c != null)
            {
                c.startActivityForResult(b, i);
                return;
            }
            if (a instanceof Activity)
            {
                ((Activity)a).startActivityForResult(b, i);
                return;
            } else
            {
                a.startActivity(b);
                return;
            }
        }

        public a(Context context)
        {
            a = context;
            b = new Intent(context, com/fitbit/device/ui/setup/choose/ChooseTrackerActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/device/ui/setup/choose/ChooseTrackerActivity_);
        }
    }


    private final c l = new c();

    public ChooseTrackerActivity_()
    {
    }

    public static a a(Context context)
    {
        return new a(context);
    }

    public static a a(Fragment fragment)
    {
        return new a(fragment);
    }

    private void a(Bundle bundle)
    {
        c.a(this);
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        b = a1.findViewById(0x1020004);
        d = a1.findViewById(0x7f1100ae);
        c = (ListView)a1.findViewById(0x102000a);
        j = (ImageView)a1.findViewById(0x7f1100b3);
        k = a1.findViewById(0x7f1100b1);
        i = (TextView)a1.findViewById(0x7f1100b4);
        h = a1.findViewById(0x7f1100b2);
        a1 = a1.findViewById(0x7f1100b2);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final ChooseTrackerActivity_ a;

                public void onClick(View view)
                {
                    a.d();
                }

            
            {
                a = ChooseTrackerActivity_.this;
                super();
            }
            });
        }
        c();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        switch (i)
        {
        default:
            return;

        case 2010: 
            f_(j);
            return;

        case 2011: 
            a(j, intent);
            break;
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(l);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f040011);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (org.androidannotations.a.b.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        l.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        l.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        l.a(this);
    }
}
