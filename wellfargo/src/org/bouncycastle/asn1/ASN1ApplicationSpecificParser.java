// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;


// Referenced classes of package org.bouncycastle.asn1:
//            ASN1Encodable, InMemoryRepresentable

public interface ASN1ApplicationSpecificParser
    extends ASN1Encodable, InMemoryRepresentable
{

    public abstract ASN1Encodable readObject();
}
