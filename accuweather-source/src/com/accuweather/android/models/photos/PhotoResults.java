// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.photos;

import com.accuweather.android.models.ExpirableModel;
import com.accuweather.android.utilities.IClock;
import java.io.Serializable;
import java.util.ArrayList;

public class PhotoResults extends ArrayList
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private ExpirableModel expirableModel;

    public PhotoResults()
    {
        expirableModel = new ExpirableModel() {

            final PhotoResults this$0;

            protected int getExpirationTimeInMinutes()
            {
                return 120;
            }

            
            {
                this$0 = PhotoResults.this;
                super();
            }
        };
    }

    public long getUpdateTime()
    {
        return expirableModel.getUpdateTime();
    }

    public final boolean isExpired(IClock iclock)
    {
        return expirableModel.isExpired(iclock);
    }

    public void setUpdateTime(long l)
    {
        expirableModel.setUpdateTime(l);
    }
}
