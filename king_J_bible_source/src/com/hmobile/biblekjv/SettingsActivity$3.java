// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.hmobile.biblekjv:
//            SettingsActivity

class this._cls0
    implements android.widget.electedListener
{

    final SettingsActivity this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (new StringBuilder(String.valueOf(fontStyle[i].toLowerCase().replace("-", "")))).append(".ttf").toString();
        editor.putString("font_style", adapterview);
        editor.commit();
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$0 = SettingsActivity.this;
        super();
    }
}
