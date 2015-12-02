// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.internal.jv;

public final class ConnectionResult
{

    public static final ConnectionResult Iu = new ConnectionResult(0, null);
    private final int Iv;
    private final PendingIntent mPendingIntent;

    public ConnectionResult(int i, PendingIntent pendingintent)
    {
        Iv = i;
        mPendingIntent = pendingintent;
    }

    private String gt()
    {
        switch (Iv)
        {
        case 12: // '\f'
        default:
            return (new StringBuilder()).append("unknown status code ").append(Iv).toString();

        case 0: // '\0'
            return "SUCCESS";

        case 1: // '\001'
            return "SERVICE_MISSING";

        case 2: // '\002'
            return "SERVICE_VERSION_UPDATE_REQUIRED";

        case 3: // '\003'
            return "SERVICE_DISABLED";

        case 4: // '\004'
            return "SIGN_IN_REQUIRED";

        case 5: // '\005'
            return "INVALID_ACCOUNT";

        case 6: // '\006'
            return "RESOLUTION_REQUIRED";

        case 7: // '\007'
            return "NETWORK_ERROR";

        case 8: // '\b'
            return "INTERNAL_ERROR";

        case 9: // '\t'
            return "SERVICE_INVALID";

        case 10: // '\n'
            return "DEVELOPER_ERROR";

        case 11: // '\013'
            return "LICENSE_CHECK_FAILED";

        case 13: // '\r'
            return "CANCELED";

        case 14: // '\016'
            return "TIMEOUT";

        case 15: // '\017'
            return "INTERRUPTED";
        }
    }

    public int getErrorCode()
    {
        return Iv;
    }

    public PendingIntent getResolution()
    {
        return mPendingIntent;
    }

    public boolean hasResolution()
    {
        return Iv != 0 && mPendingIntent != null;
    }

    public boolean isSuccess()
    {
        return Iv == 0;
    }

    public void startResolutionForResult(Activity activity, int i)
    {
        if (!hasResolution())
        {
            return;
        } else
        {
            activity.startIntentSenderForResult(mPendingIntent.getIntentSender(), i, null, 0, 0, 0);
            return;
        }
    }

    public String toString()
    {
        return jv.h(this).a("statusCode", gt()).a("resolution", mPendingIntent).toString();
    }

}
