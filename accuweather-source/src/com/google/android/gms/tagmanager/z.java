// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.a;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, dh

class z extends aj
{

    private static final String ID;
    private final Context mContext;

    public z(Context context)
    {
        super(ID, new String[0]);
        mContext = context;
    }

    protected String L(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public boolean lc()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        map = L(mContext);
        if (map == null)
        {
            return dh.mY();
        } else
        {
            return dh.r(map);
        }
    }

    static 
    {
        ID = a.X.toString();
    }
}
