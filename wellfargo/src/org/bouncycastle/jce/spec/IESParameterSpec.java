// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;

public class IESParameterSpec
    implements AlgorithmParameterSpec
{

    private int cipherKeySize;
    private byte derivation[];
    private byte encoding[];
    private int macKeySize;

    public IESParameterSpec(byte abyte0[], byte abyte1[], int i)
    {
        this(abyte0, abyte1, i, -1);
    }

    public IESParameterSpec(byte abyte0[], byte abyte1[], int i, int j)
    {
        if (abyte0 != null)
        {
            derivation = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, derivation, 0, abyte0.length);
        } else
        {
            derivation = null;
        }
        if (abyte1 != null)
        {
            encoding = new byte[abyte1.length];
            System.arraycopy(abyte1, 0, encoding, 0, abyte1.length);
        } else
        {
            encoding = null;
        }
        macKeySize = i;
        cipherKeySize = j;
    }

    public int getCipherKeySize()
    {
        return cipherKeySize;
    }

    public byte[] getDerivationV()
    {
        return derivation;
    }

    public byte[] getEncodingV()
    {
        return encoding;
    }

    public int getMacKeySize()
    {
        return macKeySize;
    }
}
