// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.rsa:
//            CipherSpi

public static class  extends CipherSpi
{

    public ()
    {
        super(false, true, new PKCS1Encoding(new RSABlindedEngine()));
    }
}
