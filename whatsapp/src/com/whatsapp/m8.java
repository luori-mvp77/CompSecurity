// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            App, GroupChatInfo, mk, og, 
//            ViewProfilePhoto, qk

class m8
    implements android.view.View.OnClickListener
{

    private static final String z;
    final GroupChatInfo a;

    m8(GroupChatInfo groupchatinfo)
    {
        a = groupchatinfo;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            int i = App.am;
            if (!mk.c(GroupChatInfo.g(a)))
            {
                a.f(a.getString(0x7f0e018a));
                if (i == 0)
                {
                    break label0;
                }
            }
            if (GroupChatInfo.d(a).C)
            {
                view = new Intent(a, com/whatsapp/ViewProfilePhoto);
                view.putExtra(z, GroupChatInfo.d(a).a);
                a.startActivityForResult(view, 14);
                if (i == 0)
                {
                    break label0;
                }
            }
            qk.a(GroupChatInfo.d(a), a, 12);
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "Ev\036".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 58;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 47;
          goto _L8
_L3:
        byte0 = 31;
          goto _L8
_L4:
        byte0 = 122;
          goto _L8
        byte0 = 88;
          goto _L8
    }
}
