// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            GmsClient

protected final class t> extends t>
{

    final GmsClient this$0;

    protected final void handleServiceFailure(ConnectionResult connectionresult)
    {
        GmsClient.access$100(GmsClient.this).onReportAccountValidation(connectionresult);
        onConnectionFailed(connectionresult);
    }

    protected final boolean handleServiceSuccess()
    {
        GmsClient.access$100(GmsClient.this).onReportAccountValidation(ConnectionResult.RESULT_SUCCESS);
        return true;
    }

    public rtCallbacks(int i, Bundle bundle)
    {
        this$0 = GmsClient.this;
        super(GmsClient.this, i, bundle);
    }
}
