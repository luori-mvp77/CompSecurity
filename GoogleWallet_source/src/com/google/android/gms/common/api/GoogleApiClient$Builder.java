// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.gms.internal.jw;
import com.google.android.gms.internal.kn;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, g, c, Api, 
//            Scope

public static final class Sw
{

    private String Fl;
    private Looper JL;
    private com.google.android.gms.common..OnConnectionFailedListener SA$3486c49a;
    private final Set SB = new HashSet();
    private final Set SC = new HashSet();
    private final Set St = new HashSet();
    private int Su;
    private View Sv;
    private String Sw;
    private final Map Sx = new HashMap();
    private FragmentActivity Sy;
    private int Sz;
    private final Context mContext;

    private jw id()
    {
        return new jw(Fl, St, Su, Sv, Sw);
    }

    private GoogleApiClient ie()
    {
        g g1 = g.a(Sy);
        GoogleApiClient googleapiclient = g1.cP(Sz);
        Object obj = googleapiclient;
        if (googleapiclient == null)
        {
            obj = new c(mContext.getApplicationContext(), JL, id(), Sx, SB, SC, Sz);
        }
        g1.a$4d14770(Sz, ((GoogleApiClient) (obj)), SA$3486c49a);
        return ((GoogleApiClient) (obj));
    }

    public final SA._cls3486c49a addApi(Api api)
    {
        Sx.put(api, null);
        api = api.hU();
        int j = api.size();
        for (int i = 0; i < j; i++)
        {
            St.add(((Scope)api.get(i)).ik());
        }

        return this;
    }

    public final s addApi(Api api, s s)
    {
        kn.b(s, "Null options are not permitted for this Api");
        Sx.put(api, s);
        api = api.hU();
        int j = api.size();
        for (int i = 0; i < j; i++)
        {
            St.add(((Scope)api.get(i)).ik());
        }

        return this;
    }

    public final onCallbacks addConnectionCallbacks(onCallbacks oncallbacks)
    {
        SB.add(oncallbacks);
        return this;
    }

    public final GoogleApiClient build()
    {
        boolean flag;
        if (!Sx.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.b(flag, "must call addApi() to add at least one API");
        if (Sz >= 0)
        {
            return ie();
        } else
        {
            return new c(mContext, JL, id(), Sx, SB, SC, -1);
        }
    }

    public final SC setAccountName(String s)
    {
        Fl = s;
        return this;
    }

    public onCallbacks(Context context)
    {
        Sz = -1;
        mContext = context;
        JL = context.getMainLooper();
        Sw = context.getPackageName();
    }
}
