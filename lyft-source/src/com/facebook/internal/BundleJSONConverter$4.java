// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.os.Bundle;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            BundleJSONConverter

final class tter
    implements tter
{

    public void setOnBundle(Bundle bundle, String s, Object obj)
    {
        bundle.putDouble(s, ((Double)obj).doubleValue());
    }

    public void setOnJSON(JSONObject jsonobject, String s, Object obj)
    {
        jsonobject.put(s, obj);
    }

    tter()
    {
    }
}
