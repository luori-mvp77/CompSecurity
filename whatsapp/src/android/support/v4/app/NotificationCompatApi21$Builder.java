// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions, NotificationCompatApi20

public class t.a
    implements NotificationBuilderWithBuilderAccessor, NotificationBuilderWithActions
{

    public static boolean a;
    private android.app._cls21.Builder.b b;

    public void addAction(cessor cessor)
    {
        NotificationCompatApi20.addAction(b, cessor);
    }

    public Notification build()
    {
        return b.b();
    }

    public android.app._cls21.Builder getBuilder()
    {
        return b;
    }

    public t(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
            PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
            boolean flag2, int l, CharSequence charsequence3, boolean flag3, String s, ArrayList arraylist, Bundle bundle, 
            int i1, int j1, Notification notification1, String s1, boolean flag4, String s2)
    {
        boolean flag5 = t;
        super();
        context = (new android.app.e.Action.a(context)).a(notification.when).(flag1).n(notification.icon, notification.iconLevel).n(notification.contentView).n(notification.tickerText, remoteviews).n(notification.sound, notification.audioStreamType).n(notification.vibrate).n(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        context = context.n(flag1);
        if ((notification.flags & 8) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        context = context.tOnce(flag1);
        if ((notification.flags & 0x10) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        context = context.el(flag1).(notification.defaults).itle(charsequence).ext(charsequence1).ext(charsequence3).nfo(charsequence2).ntent(pendingintent).tent(notification.deleteIntent);
        if ((notification.flags & 0x80) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b = context.enIntent(pendingintent1, flag1).n(bitmap).n(i).nometer(flag2).(l).(j, k, flag).y(flag3).y(bundle).y(s1).mary(flag4).mary(s2).(s).(i1).ty(j1).rsion(notification1);
        context = arraylist.iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            notification = (String)context.next();
            b.b(notification);
        } while (!flag5);
        if (t.a)
        {
            if (flag5)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            t.a = flag;
        }
    }
}
