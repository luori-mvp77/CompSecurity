// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Bitmap;
import com.whatsapp.wallpaper.g;

// Referenced classes of package com.whatsapp:
//            TouchImageView

class a_8
    implements g
{

    final TouchImageView a;

    a_8(TouchImageView touchimageview)
    {
        a = touchimageview;
        super();
    }

    public void a(Bitmap bitmap)
    {
        if (a.y)
        {
            bitmap.recycle();
        }
    }
}
