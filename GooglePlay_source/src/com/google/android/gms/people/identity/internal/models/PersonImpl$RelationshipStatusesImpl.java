// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, RelationshipStatusesImplCreator

public static class mValue
    implements SafeParcelable, com.google.android.gms.people.identity.models.usesImpl
{

    public static final RelationshipStatusesImplCreator CREATOR = new RelationshipStatusesImplCreator();
    String mFormattedValue;
    final Set mIndicatorSet;
    t> mMetadata;
    String mValue;
    final int mVersionCode;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        RelationshipStatusesImplCreator.writeToParcel(this, parcel, i);
    }


    public ()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    mVersionCode(Set set, int i, mVersionCode mversioncode, String s, String s1)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mMetadata = mversioncode;
        mFormattedValue = s;
        mValue = s1;
    }
}
