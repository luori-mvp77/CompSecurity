// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class >
    implements Comparator
{

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (AJ)obj;
        return ((AJ)obj1).mPriority - ((AJ) (obj)).mPriority;
    }

    private >()
    {
    }

    >(byte byte0)
    {
        this();
    }
}
