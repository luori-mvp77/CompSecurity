// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.aa;

// Referenced classes of package com.google.android.gms.maps.model:
//            a, LatLng, b

public final class CameraPosition
    implements SafeParcelable
{

    public static final com.google.android.gms.maps.model.a CREATOR = new com.google.android.gms.maps.model.a();
    private final int CK;
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    CameraPosition(int i, LatLng latlng, float f, float f1, float f2)
    {
        jx.b(latlng, "null camera target");
        boolean flag;
        if (0.0F <= f1 && f1 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "Tilt needs to be between 0 and 90 inclusive");
        CK = i;
        target = latlng;
        zoom = f;
        tilt = f1 + 0.0F;
        f = f2;
        if ((double)f2 <= 0.0D)
        {
            f = f2 % 360F + 360F;
        }
        bearing = f % 360F;
    }

    public CameraPosition(LatLng latlng, float f, float f1, float f2)
    {
        this(1, latlng, f, f1, f2);
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static CameraPosition createFromAttributes(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        context = context.getResources().obtainAttributes(attributeset, a.MapAttrs);
        float f;
        float f1;
        Builder builder1;
        if (context.hasValue(a.MapAttrs_cameraTargetLat))
        {
            f = context.getFloat(a.MapAttrs_cameraTargetLat, 0.0F);
        } else
        {
            f = 0.0F;
        }
        if (context.hasValue(a.MapAttrs_cameraTargetLng))
        {
            f1 = context.getFloat(a.MapAttrs_cameraTargetLng, 0.0F);
        } else
        {
            f1 = 0.0F;
        }
        attributeset = new LatLng(f, f1);
        builder1 = builder();
        builder1.target(attributeset);
        if (context.hasValue(a.MapAttrs_cameraZoom))
        {
            builder1.zoom(context.getFloat(a.MapAttrs_cameraZoom, 0.0F));
        }
        if (context.hasValue(a.MapAttrs_cameraBearing))
        {
            builder1.bearing(context.getFloat(a.MapAttrs_cameraBearing, 0.0F));
        }
        if (context.hasValue(a.MapAttrs_cameraTilt))
        {
            builder1.tilt(context.getFloat(a.MapAttrs_cameraTilt, 0.0F));
        }
        return builder1.build();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof CameraPosition))
            {
                return false;
            }
            obj = (CameraPosition)obj;
            if (!target.equals(((CameraPosition) (obj)).target) || Float.floatToIntBits(zoom) != Float.floatToIntBits(((CameraPosition) (obj)).zoom) || Float.floatToIntBits(tilt) != Float.floatToIntBits(((CameraPosition) (obj)).tilt) || Float.floatToIntBits(bearing) != Float.floatToIntBits(((CameraPosition) (obj)).bearing))
            {
                return false;
            }
        }
        return true;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            target, Float.valueOf(zoom), Float.valueOf(tilt), Float.valueOf(bearing)
        });
    }

    public String toString()
    {
        return jv.h(this).a("target", target).a("zoom", Float.valueOf(zoom)).a("tilt", Float.valueOf(tilt)).a("bearing", Float.valueOf(bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
label0:
        {
            if (aa.ob())
            {
                com.google.android.gms.maps.model.b.a(this, parcel, i);
                if (com.google.android.gms.maps.model.LatLng.a == 0)
                {
                    break label0;
                }
            }
            com.google.android.gms.maps.model.a.a(this, parcel, i);
        }
    }


    private class Builder
    {

        private LatLng alN;
        private float alO;
        private float alP;
        private float alQ;

        public Builder bearing(float f)
        {
            alQ = f;
            return this;
        }

        public CameraPosition build()
        {
            return new CameraPosition(alN, alO, alP, alQ);
        }

        public Builder target(LatLng latlng)
        {
            alN = latlng;
            return this;
        }

        public Builder tilt(float f)
        {
            alP = f;
            return this;
        }

        public Builder zoom(float f)
        {
            alO = f;
            return this;
        }

        public Builder()
        {
        }
    }

}
