// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.sec;

import java.math.BigInteger;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ECParametersHolder;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.util.encoders.Hex;

// Referenced classes of package org.spongycastle.asn1.sec:
//            SECNamedCurves

final class ab extends X9ECParametersHolder
{

    ab()
    {
    }

    protected final X9ECParameters a()
    {
        Object obj = SECNamedCurves.c("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF");
        BigInteger biginteger2 = SECNamedCurves.c("D6031998D1B3BBFEBF59CC9BBFF9AEE1");
        BigInteger biginteger3 = SECNamedCurves.c("5EEEFCA380D02919DC2C6558BB6D8A5D");
        byte abyte0[] = Hex.a("004D696E67687561517512D8F03431FCE63B88F4");
        BigInteger biginteger = SECNamedCurves.c("3FFFFFFF7FFFFFFFBE0024720613B5A3");
        BigInteger biginteger1 = BigInteger.valueOf(4L);
        obj = new org.spongycastle.math.ec.ECCurve.Fp(((BigInteger) (obj)), biginteger2, biginteger3);
        return new X9ECParameters(((ECCurve) (obj)), ((ECCurve) (obj)).a(Hex.a("047B6AA5D85E572983E6FB32A7CDEBC14027B6916A894D3AEE7106FE805FC34B44")), biginteger, biginteger1, abyte0);
    }
}
