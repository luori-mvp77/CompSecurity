// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class <init>
    implements ServiceConnection
{

    private boolean a;
    private final LinkedBlockingQueue b;

    public IBinder a()
    {
        if (a)
        {
            Fabric.g().d("Fabric", "getBinder already called");
        }
        a = true;
        IBinder ibinder;
        try
        {
            ibinder = (IBinder)b.poll(200L, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedexception)
        {
            return null;
        }
        return ibinder;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        try
        {
            b.put(ibinder);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            return;
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        b.clear();
    }

    private ()
    {
        a = false;
        b = new LinkedBlockingQueue(1);
    }

    b(b b1)
    {
        this();
    }
}
