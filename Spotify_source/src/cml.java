// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

final class cml extends Handler
{

    private cmk a;

    cml(cmk cmk1, Looper looper)
    {
        a = cmk1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 4: default 36
    //                   1 62
    //                   2 109
    //                   3 117
    //                   4 132;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Log.w("GoogleApiClientImpl", (new StringBuilder("Unknown message id: ")).append(message.what).toString());
        return;
_L2:
        message = a;
        ((cmk) (message)).a.lock();
        if (message.h())
        {
            message.b();
        }
        ((cmk) (message)).a.unlock();
        return;
        Exception exception;
        exception;
        ((cmk) (message)).a.unlock();
        throw exception;
_L3:
        cmk.a(a);
        return;
_L4:
        ((cmm)message.obj).a(a);
        return;
_L5:
        throw (RuntimeException)message.obj;
    }
}
