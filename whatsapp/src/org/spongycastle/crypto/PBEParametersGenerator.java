// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto;

import org.spongycastle.util.Strings;

// Referenced classes of package org.spongycastle.crypto:
//            DataLengthException, CipherParameters

public abstract class PBEParametersGenerator
{

    protected int iterationCount;
    protected byte password[];
    protected byte salt[];

    protected PBEParametersGenerator()
    {
    }

    public static byte[] PKCS12PasswordToBytes(char ac[])
    {
        int i = 0;
        int j = DataLengthException.a;
        if (ac != null)
        {
            int k;
            try
            {
                k = ac.length;
            }
            // Misplaced declaration of an exception variable
            catch (char ac[])
            {
                throw ac;
            }
            if (k > 0)
            {
                byte abyte0[] = new byte[(ac.length + 1) * 2];
                do
                {
                    if (i == ac.length)
                    {
                        break;
                    }
                    abyte0[i * 2] = (byte)(ac[i] >>> 8);
                    abyte0[i * 2 + 1] = (byte)ac[i];
                    i++;
                } while (j == 0);
                return abyte0;
            }
        }
        return new byte[0];
    }

    public static byte[] PKCS5PasswordToBytes(char ac[])
    {
        int i = 0;
        int j = DataLengthException.a;
        if (ac != null)
        {
            byte abyte0[] = new byte[ac.length];
            do
            {
                if (i == abyte0.length)
                {
                    break;
                }
                abyte0[i] = (byte)ac[i];
                i++;
            } while (j == 0);
            return abyte0;
        } else
        {
            return new byte[0];
        }
    }

    public static byte[] PKCS5PasswordToUTF8Bytes(char ac[])
    {
        if (ac != null)
        {
            try
            {
                ac = Strings.toUTF8ByteArray(ac);
            }
            // Misplaced declaration of an exception variable
            catch (char ac[])
            {
                throw ac;
            }
            return ac;
        } else
        {
            return new byte[0];
        }
    }

    public abstract CipherParameters generateDerivedMacParameters(int i);

    public abstract CipherParameters generateDerivedParameters(int i);

    public abstract CipherParameters generateDerivedParameters(int i, int j);

    public int getIterationCount()
    {
        return iterationCount;
    }

    public byte[] getPassword()
    {
        return password;
    }

    public byte[] getSalt()
    {
        return salt;
    }

    public void init(byte abyte0[], byte abyte1[], int i)
    {
        password = abyte0;
        salt = abyte1;
        iterationCount = i;
    }
}
