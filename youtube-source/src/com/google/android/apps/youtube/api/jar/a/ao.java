// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar.a;

import android.graphics.Bitmap;
import com.google.android.apps.youtube.core.player.overlay.g;

// Referenced classes of package com.google.android.apps.youtube.api.jar.a:
//            ae

final class ao
    implements Runnable
{

    final Bitmap a;
    final ae b;

    ao(ae ae1, Bitmap bitmap)
    {
        b = ae1;
        a = bitmap;
        super();
    }

    public final void run()
    {
        ae.b(b).setInfoCardTeaserImage(a);
    }
}
