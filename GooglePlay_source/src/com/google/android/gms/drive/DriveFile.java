// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.drive:
//            DriveResource

public interface DriveFile
    extends DriveResource
{
    public static interface DownloadProgressListener
    {

        public abstract void onProgress(long l, long l1);
    }


    public abstract PendingResult open$298a1a43(GoogleApiClient googleapiclient, int i);
}
