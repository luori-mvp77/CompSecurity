// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.gms.internal:
//            af, ai

public final class ah
{

    private final af a;
    private final SecureRandom b = null;

    public ah(af af1)
    {
        a = af1;
    }

    public final byte[] a(String s)
    {
        try
        {
            s = a.a(s);
            if (s.length != 32)
            {
                throw new ai(this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ai(this, s);
        }
        byte abyte0[];
        s = ByteBuffer.wrap(s, 4, 16);
        abyte0 = new byte[16];
        s.get(abyte0);
        for (int i = 0; i < 16; i++)
        {
            abyte0[i] = (byte)(abyte0[i] ^ 0x44);
        }

        return abyte0;
    }

    public final byte[] a(byte abyte0[], String s)
    {
        if (abyte0.length != 16)
        {
            throw new ai(this);
        }
        byte abyte1[];
        Object obj;
        try
        {
            abyte1 = a.a(s);
            if (abyte1.length <= 16)
            {
                throw new ai(this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ai(this, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ai(this, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ai(this, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ai(this, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ai(this, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ai(this, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new ai(this, abyte0);
        }
        obj = ByteBuffer.allocate(abyte1.length);
        ((ByteBuffer) (obj)).put(abyte1);
        ((ByteBuffer) (obj)).flip();
        s = new byte[16];
        abyte1 = new byte[abyte1.length - 16];
        ((ByteBuffer) (obj)).get(s);
        ((ByteBuffer) (obj)).get(abyte1);
        abyte0 = new SecretKeySpec(abyte0, "AES");
        obj = Cipher.getInstance("AES/CBC/PKCS5Padding");
        ((Cipher) (obj)).init(2, abyte0, new IvParameterSpec(s));
        abyte0 = ((Cipher) (obj)).doFinal(abyte1);
        return abyte0;
    }
}
