// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.address;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;

// Referenced classes of package com.dominos.fragments.address:
//            AddressOtherFragment

class this._cls0
    implements android.widget.tedListener
{

    final AddressOtherFragment this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (!AddressOtherFragment.access$000(AddressOtherFragment.this))
        {
            mZipEntry.requestFocus();
        }
        AddressOtherFragment.access$002(AddressOtherFragment.this, false);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$0 = AddressOtherFragment.this;
        super();
    }
}
