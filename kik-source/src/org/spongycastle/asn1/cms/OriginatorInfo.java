// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;

public class OriginatorInfo extends ASN1Object
{

    private ASN1Set a;
    private ASN1Set b;

    public final ASN1Primitive a()
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        if (a != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 0, a));
        }
        if (b != null)
        {
            asn1encodablevector.a(new DERTaggedObject(false, 1, b));
        }
        return new DERSequence(asn1encodablevector);
    }
}
