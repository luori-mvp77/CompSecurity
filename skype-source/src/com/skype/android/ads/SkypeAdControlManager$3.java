// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.ads;

import java.util.HashMap;

// Referenced classes of package com.skype.android.ads:
//            SkypeAdControlManager, SkypeAdPlacer

final class a
    implements Runnable
{

    final SkypeAdControlManager a;

    public final void run()
    {
        try
        {
            SkypeAdPlacer.a().c();
            SkypeAdControlManager.a(a).clear();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    (SkypeAdControlManager skypeadcontrolmanager)
    {
        a = skypeadcontrolmanager;
        super();
    }
}
