// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            VoipActivity, VoiceService

class auk
    implements android.view.View.OnClickListener
{

    final VoipActivity a;

    auk(VoipActivity voipactivity)
    {
        a = voipactivity;
        super();
    }

    public void onClick(View view)
    {
        if (VoipActivity.d(a) != null)
        {
            VoipActivity.d(a).h();
        }
    }
}
