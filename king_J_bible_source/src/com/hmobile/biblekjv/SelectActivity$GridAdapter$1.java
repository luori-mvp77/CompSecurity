// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.Intent;
import android.view.View;
import com.hmobile.common.SegmentedRadioGroup;

// Referenced classes of package com.hmobile.biblekjv:
//            SelectActivity, MainBookActivity

class val.position
    implements android.view.apter._cls1
{

    final this._cls1 this$1;
    private final int val$position;

    public void onClick(View view)
    {
        if (cess._mth0(this._cls1.this).isChapterView)
        {
            cess._mth0(this._cls1.this).chap_id = val$position + 1;
            cess._mth0(this._cls1.this).segmentText.check(0x7f0e00cf);
        } else
        if (cess._mth0(this._cls1.this).isVerseView)
        {
            cess._mth0(this._cls1.this).verse_id = val$position + 1;
            view = new Intent(cess._mth0(this._cls1.this), com/hmobile/biblekjv/MainBookActivity);
            view.putExtra("book_id", cess._mth0(this._cls1.this).book_id);
            view.putExtra("chap_id", cess._mth0(this._cls1.this).chap_id);
            view.putExtra("verse_id", cess._mth0(this._cls1.this).verse_id);
            view.putExtra("select_flag", true);
            view.setFlags(0x4000000);
            cess._mth0(this._cls1.this).startActivity(view);
            cess._mth0(this._cls1.this).finish();
            return;
        }
    }

    ()
    {
        this$1 = final_;
        val$position = I.this;
        super();
    }
}
