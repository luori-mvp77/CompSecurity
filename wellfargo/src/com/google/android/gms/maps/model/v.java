// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaOrientation

public class v
    implements android.os.Parcelable.Creator
{

    public v()
    {
    }

    static void a(StreetViewPanoramaOrientation streetviewpanoramaorientation, Parcel parcel, int i)
    {
        i = c.a(parcel);
        c.a(parcel, 1, streetviewpanoramaorientation.a());
        c.a(parcel, 2, streetviewpanoramaorientation.a);
        c.a(parcel, 3, streetviewpanoramaorientation.b);
        c.a(parcel, i);
    }

    public StreetViewPanoramaOrientation a(Parcel parcel)
    {
        float f1 = 0.0F;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        float f = 0.0F;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    f = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 3: // '\003'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaOrientation(i, f, f1);
            }
        } while (true);
    }

    public StreetViewPanoramaOrientation[] a(int i)
    {
        return new StreetViewPanoramaOrientation[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
