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
//            NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor, NotificationCompatApi20

final class NotificationCompatApi21
{
    public static final class Builder
        implements NotificationBuilderWithActions, NotificationBuilderWithBuilderAccessor
    {

        private android.app.Notification.Builder b;

        public final void addAction(NotificationCompatBase.Action action)
        {
            NotificationCompatApi20.addAction(b, action);
        }

        public final Notification build()
        {
            return b.build();
        }

        public final android.app.Notification.Builder getBuilder()
        {
            return b;
        }

        public Builder(Context context, Notification notification, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, RemoteViews remoteviews, int i, 
                PendingIntent pendingintent, PendingIntent pendingintent1, Bitmap bitmap, int j, int k, boolean flag, boolean flag1, 
                boolean flag2, int l, CharSequence charsequence3, boolean flag3, String s, ArrayList arraylist, Bundle bundle, 
                int i1, int j1, Notification notification1, String s1, boolean flag4, String s2)
        {
            context = (new android.app.Notification.Builder(context)).setWhen(notification.when).setShowWhen(flag1).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
            if ((notification.flags & 2) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            context = context.setOngoing(flag);
            if ((notification.flags & 8) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            context = context.setOnlyAlertOnce(flag);
            if ((notification.flags & 0x10) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            context = context.setAutoCancel(flag).setDefaults(notification.defaults).setContentTitle(charsequence).setContentText(charsequence1).setSubText(null).setContentInfo(charsequence2).setContentIntent(pendingintent).setDeleteIntent(notification.deleteIntent);
            if ((notification.flags & 0x80) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = context.setFullScreenIntent(null, flag).setLargeIcon(bitmap).setNumber(0).setUsesChronometer(false).setPriority(l).setProgress(0, 0, false).setLocalOnly(flag3).setExtras(bundle).setGroup(null).setGroupSummary(false).setSortKey(null).setCategory(s).setColor(i1).setVisibility(j1).setPublicVersion(null);
            for (context = arraylist.iterator(); context.hasNext(); b.addPerson(notification))
            {
                notification = (String)context.next();
            }

        }
    }

}
