// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.view.View;

// Referenced classes of package com.facebook.contacts.contactcard:
//            ContactCardFragment

class p
    implements android.view.View.OnClickListener
{

    final ContactCardFragment a;

    p(ContactCardFragment contactcardfragment)
    {
        a = contactcardfragment;
        super();
    }

    public void onClick(View view)
    {
        ContactCardFragment.a(a, "add_to_address_book");
        ContactCardFragment.b(a);
    }
}
