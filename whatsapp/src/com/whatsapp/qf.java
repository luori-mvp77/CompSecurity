// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            ContactInfo

class qf
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final ContactInfo a;

    qf(ContactInfo contactinfo)
    {
        a = contactinfo;
        super();
    }

    public void onGlobalLayout()
    {
        ContactInfo.b(a);
    }
}
