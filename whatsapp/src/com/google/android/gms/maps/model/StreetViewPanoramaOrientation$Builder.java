// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;


// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaOrientation

public final class 
{

    public float bearing;
    public float tilt;

    public  bearing(float f)
    {
        bearing = f;
        return this;
    }

    public StreetViewPanoramaOrientation build()
    {
        return new StreetViewPanoramaOrientation(tilt, bearing);
    }

    public bearing tilt(float f)
    {
        tilt = f;
        return this;
    }

    public ()
    {
    }
}
