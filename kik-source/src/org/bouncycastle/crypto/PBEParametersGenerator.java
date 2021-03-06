// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;

import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.crypto:
//            CipherParameters

public abstract class PBEParametersGenerator
{

    protected byte a[];
    protected byte b[];
    protected int c;

    protected PBEParametersGenerator()
    {
    }

    public static byte[] PKCS12PasswordToBytes(char ac[])
    {
        int i = 0;
        if (ac.length > 0)
        {
            byte abyte0[] = new byte[(ac.length + 1) * 2];
            for (; i != ac.length; i++)
            {
                abyte0[i * 2] = (byte)(ac[i] >>> 8);
                abyte0[i * 2 + 1] = (byte)ac[i];
            }

            return abyte0;
        } else
        {
            return new byte[0];
        }
    }

    public static byte[] PKCS5PasswordToBytes(char ac[])
    {
        byte abyte0[] = new byte[ac.length];
        for (int i = 0; i != abyte0.length; i++)
        {
            abyte0[i] = (byte)ac[i];
        }

        return abyte0;
    }

    public static byte[] PKCS5PasswordToUTF8Bytes(char ac[])
    {
        return Strings.a(ac);
    }

    public abstract CipherParameters generateDerivedMacParameters(int i);

    public abstract CipherParameters generateDerivedParameters(int i);

    public abstract CipherParameters generateDerivedParameters(int i, int j);

    public int getIterationCount()
    {
        return c;
    }

    public byte[] getPassword()
    {
        return a;
    }

    public byte[] getSalt()
    {
        return b;
    }

    public void init(byte abyte0[], byte abyte1[], int i)
    {
        a = abyte0;
        b = abyte1;
        c = i;
    }
}
