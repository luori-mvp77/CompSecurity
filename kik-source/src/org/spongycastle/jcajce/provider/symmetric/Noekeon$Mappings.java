// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            Noekeon

public static class  extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/Noekeon.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("AlgorithmParameters.NOEKEON", (new StringBuilder()).append(a).append("$AlgParams").toString());
        configurableprovider.a("AlgorithmParameterGenerator.NOEKEON", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
        configurableprovider.a("Cipher.NOEKEON", (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a("KeyGenerator.NOEKEON", (new StringBuilder()).append(a).append("$KeyGen").toString());
    }


    public ()
    {
    }
}
