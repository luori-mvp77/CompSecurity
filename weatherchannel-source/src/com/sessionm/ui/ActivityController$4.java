// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.util.Log;
import java.util.Locale;

// Referenced classes of package com.sessionm.ui:
//            ActivityController

class this._cls0
    implements Runnable
{

    final ActivityController this$0;

    public void run()
    {
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", String.format(Locale.US, "Present activity, fullScreen: %b, URL: %s ", new Object[] {
                Boolean.valueOf(isFullScreenActivity()), ActivityController.access$100(ActivityController.this)
            }));
        }
        prepare(new ActivityController.PrepareListener() {

            final ActivityController._cls4 this$1;

            public void onFailure(Throwable throwable)
            {
                dismiss();
            }

            public void onPrepared()
            {
                displayView();
            }

            
            {
                this$1 = ActivityController._cls4.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = ActivityController.this;
        super();
    }
}
