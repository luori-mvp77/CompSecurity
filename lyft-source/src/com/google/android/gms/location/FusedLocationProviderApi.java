// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.location:
//            LocationListener, LocationRequest

public interface FusedLocationProviderApi
{

    public abstract Location a(GoogleApiClient googleapiclient);

    public abstract PendingResult a(GoogleApiClient googleapiclient, LocationListener locationlistener);

    public abstract PendingResult a(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener);
}
