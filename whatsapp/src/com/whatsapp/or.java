// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            GroupChatInfo

class or
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final GroupChatInfo a;

    or(GroupChatInfo groupchatinfo)
    {
        a = groupchatinfo;
        super();
    }

    public void onGlobalLayout()
    {
        GroupChatInfo.m(a);
    }
}
