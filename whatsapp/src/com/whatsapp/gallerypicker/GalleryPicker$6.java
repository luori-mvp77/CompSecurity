// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.whatsapp.gallerypicker:
//            GalleryPicker

class a extends BroadcastReceiver
{

    final GalleryPicker a;

    public void onReceive(Context context, Intent intent)
    {
        GalleryPicker.a(a, intent);
    }

    (GalleryPicker gallerypicker)
    {
        a = gallerypicker;
        super();
    }
}
