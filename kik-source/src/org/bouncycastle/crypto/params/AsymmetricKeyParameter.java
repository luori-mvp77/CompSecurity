// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

public class AsymmetricKeyParameter
    implements CipherParameters
{

    boolean a;

    public AsymmetricKeyParameter(boolean flag)
    {
        a = flag;
    }

    public boolean isPrivate()
    {
        return a;
    }
}
