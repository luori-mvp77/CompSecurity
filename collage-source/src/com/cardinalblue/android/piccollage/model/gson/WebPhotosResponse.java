// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.google.b.e;
import java.lang.reflect.Field;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            WebPhotosData

public class WebPhotosResponse
{

    private WebPhotosData data;

    public WebPhotosResponse()
    {
    }

    public static e getFieldNamingStrategy(String s)
    {
        return new e(s) {

            final String val$dataNode;

            public String translateName(Field field)
            {
                return dataNode;
            }

            
            {
                dataNode = s;
                super();
            }
        };
    }

    public WebPhotosData getData()
    {
        return data;
    }
}
