// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.g;
import com.facebook.internal.aw;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.login:
//            LoginMethodHandler, e, LoginClient, i, 
//            d, b, c

class GetTokenLoginMethodHandler extends LoginMethodHandler
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private b c;

    GetTokenLoginMethodHandler(Parcel parcel)
    {
        super(parcel);
    }

    GetTokenLoginMethodHandler(LoginClient loginclient)
    {
        super(loginclient);
    }

    final String a()
    {
        return "get_token";
    }

    final void a(LoginClient.Request request, Bundle bundle)
    {
        c = null;
        LoginClient loginclient = b;
        if (loginclient.e != null)
        {
            loginclient.e.b();
        }
        if (bundle != null)
        {
            Object obj = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Object obj1 = request.a();
            if (obj != null && (obj1 == null || ((ArrayList) (obj)).containsAll(((java.util.Collection) (obj1)))))
            {
                obj = bundle.getString("com.facebook.platform.extra.USER_ID");
                if (obj == null || ((String) (obj)).isEmpty())
                {
                    b.d();
                    aw.a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new d(this, bundle, request));
                    return;
                } else
                {
                    b(request, bundle);
                    return;
                }
            }
            bundle = new HashSet();
            obj1 = ((Set) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj1)).next();
                if (!((ArrayList) (obj)).contains(s))
                {
                    bundle.add(s);
                }
            } while (true);
            if (!bundle.isEmpty())
            {
                a("new_permissions", TextUtils.join(",", bundle));
            }
            request.a(bundle);
        }
        b.c();
    }

    final boolean a(LoginClient.Request request)
    {
        c = new b(b.c.getActivity(), request.d());
        if (!c.a())
        {
            return false;
        } else
        {
            b.d();
            request = new c(this, request);
            c.a(request);
            return true;
        }
    }

    final void b()
    {
        if (c != null)
        {
            c.b();
            c = null;
        }
    }

    final void b(LoginClient.Request request, Bundle bundle)
    {
        Object obj = null;
        g g1 = g.d;
        request = request.d();
        Date date = aw.a(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList arraylist = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String s = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (aw.a(s))
        {
            request = obj;
        } else
        {
            request = new AccessToken(s, request, bundle.getString("com.facebook.platform.extra.USER_ID"), arraylist, null, g1, date, new Date());
        }
        request = LoginClient.Result.a(b.g, request);
        b.a(request);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        super.writeToParcel(parcel, j);
    }

}
