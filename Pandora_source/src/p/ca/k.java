// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import p.cw.c;
import p.df.a;

public class k extends Fragment
{

    public k()
    {
    }

    protected void a(String s1)
    {
        p.df.a.a("BaseFragment", "[%s - %d] %s", new Object[] {
            getClass().getSimpleName(), Integer.valueOf(hashCode()), s1
        });
    }

    public void onActivityCreated(Bundle bundle)
    {
        a("onActivityCreated");
        super.onActivityCreated(bundle);
    }

    public void onCreate(Bundle bundle)
    {
        a("onCreate");
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a("onCreateView");
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        a("onDestroy");
        super.onDestroy();
    }

    public void onDestroyView()
    {
        a("onDestroyView");
        if (getView() != null)
        {
            b.a.b().c(this);
            b.a.e().b(this);
        }
        super.onDestroyView();
    }

    public void onDetach()
    {
        a("onDetach");
        super.onDetach();
    }

    public void onHiddenChanged(boolean flag)
    {
        a((new StringBuilder()).append("onHiddenChanged, hidden=").append(flag).toString());
        super.onHiddenChanged(flag);
    }

    public void onPause()
    {
        a("onPause");
        super.onPause();
    }

    public void onResume()
    {
        a("onResume");
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (s.u())
        {
            super.onSaveInstanceState(bundle);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        b.a.b().b(this);
        b.a.e().c(this);
        a("onViewCreated");
        super.onViewCreated(view, bundle);
    }
}
