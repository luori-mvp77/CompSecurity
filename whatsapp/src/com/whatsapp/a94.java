// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            GroupChatInfo, og

class a94
    implements android.content.DialogInterface.OnClickListener
{

    final GroupChatInfo a;

    a94(GroupChatInfo groupchatinfo)
    {
        a = groupchatinfo;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.removeDialog(6);
        GroupChatInfo.a(a, GroupChatInfo.s(a).a);
    }
}
