// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import android.widget.TextView;
import io.fabric.sdk.android.services.settings.PromptSettingsData;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics, DialogStringResolver

class this._cls1
    implements android.content.OnClickListener
{

    final nLatch.setOptIn this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        setShouldSendUserReportsWithoutPrompting(true);
        latch.setOptIn(true);
        dialoginterface.dismiss();
    }

    PromptSettingsData()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/crashlytics/android/Crashlytics$5

/* anonymous class */
    class Crashlytics._cls5
        implements Runnable
    {

        final Crashlytics this$0;
        final Activity val$activity;
        final Crashlytics.OptInLatch val$latch;
        final PromptSettingsData val$promptData;
        final DialogStringResolver val$stringResolver;

        public void run()
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
            android.content.DialogInterface.OnClickListener onclicklistener = new Crashlytics._cls5._cls1();
            float f = activity.getResources().getDisplayMetrics().density;
            int i = Crashlytics.access$300(Crashlytics.this, f, 5);
            TextView textview = new TextView(activity);
            textview.setAutoLinkMask(15);
            textview.setText(stringResolver.getMessage());
            textview.setTextAppearance(activity, 0x1030044);
            textview.setPadding(i, i, i, i);
            textview.setFocusable(false);
            ScrollView scrollview = new ScrollView(activity);
            scrollview.setPadding(Crashlytics.access$300(Crashlytics.this, f, 14), Crashlytics.access$300(Crashlytics.this, f, 2), Crashlytics.access$300(Crashlytics.this, f, 10), Crashlytics.access$300(Crashlytics.this, f, 12));
            scrollview.addView(textview);
            builder.setView(scrollview).setTitle(stringResolver.getTitle()).setCancelable(false).setNeutralButton(stringResolver.getSendButtonTitle(), onclicklistener);
            if (promptData.showCancelButton)
            {
                android.content.DialogInterface.OnClickListener onclicklistener1 = new Crashlytics._cls5._cls2();
                builder.setNegativeButton(stringResolver.getCancelButtonTitle(), onclicklistener1);
            }
            if (promptData.showAlwaysSendButton)
            {
                Crashlytics._cls5._cls3 _lcls3 = new Crashlytics._cls5._cls3();
                builder.setPositiveButton(stringResolver.getAlwaysSendButtonTitle(), _lcls3);
            }
            builder.show();
        }

            
            {
                this$0 = final_crashlytics;
                activity = activity1;
                latch = optinlatch;
                stringResolver = dialogstringresolver;
                promptData = PromptSettingsData.this;
                super();
            }

        // Unreferenced inner class com/crashlytics/android/Crashlytics$5$1

/* anonymous class */
        class Crashlytics._cls5._cls1
            implements android.content.DialogInterface.OnClickListener
        {

            final Crashlytics._cls5 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                latch.setOptIn(true);
                dialoginterface.dismiss();
            }

                    
                    {
                        this$1 = Crashlytics._cls5.this;
                        super();
                    }
        }


        // Unreferenced inner class com/crashlytics/android/Crashlytics$5$2

/* anonymous class */
        class Crashlytics._cls5._cls2
            implements android.content.DialogInterface.OnClickListener
        {

            final Crashlytics._cls5 this$1;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                latch.setOptIn(false);
                dialoginterface.dismiss();
            }

                    
                    {
                        this$1 = Crashlytics._cls5.this;
                        super();
                    }
        }

    }

}
