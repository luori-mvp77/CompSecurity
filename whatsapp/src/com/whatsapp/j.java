// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.whatsapp:
//            og, ListChatInfo

class j
    implements android.widget.AdapterView.OnItemClickListener
{

    final ListChatInfo a;

    j(ListChatInfo listchatinfo)
    {
        a = listchatinfo;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (og)view.getTag();
        if (adapterview != null)
        {
            ListChatInfo.b(a, adapterview);
            view.showContextMenu();
        }
    }
}
