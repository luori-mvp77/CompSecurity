// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1.cms;

import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERTaggedObject;

// Referenced classes of package org.spongycastle.asn1.cms:
//            IssuerAndSerialNumber, RecipientKeyIdentifier

public class KeyAgreeRecipientIdentifier extends ASN1Object
    implements ASN1Choice
{

    private IssuerAndSerialNumber a;
    private RecipientKeyIdentifier b;

    public final ASN1Primitive a()
    {
        if (a != null)
        {
            return a.a();
        } else
        {
            return new DERTaggedObject(false, 0, b);
        }
    }
}
