// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.IOException;

final class ar extends IOException
{

    ar()
    {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
