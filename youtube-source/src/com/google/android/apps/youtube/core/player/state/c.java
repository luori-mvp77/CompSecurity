// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.state;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.youtube.core.player.state:
//            VideoIdsSequencerState

final class c
    implements android.os.Parcelable.Creator
{

    c()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new VideoIdsSequencerState(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new VideoIdsSequencerState[i];
    }
}
