// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.jce.X509LDAPCertStoreParameters;
import org.bouncycastle.util.Selector;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;
import org.bouncycastle.x509.X509StoreParameters;
import org.bouncycastle.x509.X509StoreSpi;
import org.bouncycastle.x509.util.LDAPStoreHelper;

public class X509StoreLDAPAttrCerts extends X509StoreSpi
{

    private LDAPStoreHelper a;

    public X509StoreLDAPAttrCerts()
    {
    }

    public final Collection a(Selector selector)
    {
        if (!(selector instanceof X509AttributeCertStoreSelector))
        {
            return Collections.EMPTY_SET;
        } else
        {
            selector = (X509AttributeCertStoreSelector)selector;
            HashSet hashset = new HashSet();
            hashset.addAll(a.a(selector));
            hashset.addAll(a.c(selector));
            hashset.addAll(a.b(selector));
            return hashset;
        }
    }

    public final void a(X509StoreParameters x509storeparameters)
    {
        if (!(x509storeparameters instanceof X509LDAPCertStoreParameters))
        {
            throw new IllegalArgumentException((new StringBuilder("Initialization parameters must be an instance of ")).append(org/bouncycastle/jce/X509LDAPCertStoreParameters.getName()).append(".").toString());
        } else
        {
            a = new LDAPStoreHelper((X509LDAPCertStoreParameters)x509storeparameters);
            return;
        }
    }
}
