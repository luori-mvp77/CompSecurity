// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import java.util.Map;

// Referenced classes of package com.stripe.model:
//            StripeObject, InvoiceLineItemPeriod, Plan

public class InvoiceLineItem extends StripeObject
{

    Integer amount;
    String currency;
    String description;
    String id;
    Boolean livemode;
    Map metadata;
    InvoiceLineItemPeriod period;
    Plan plan;
    Boolean proration;
    Integer quantity;
    String subscription;
    String type;

    public InvoiceLineItem()
    {
    }

    public Integer getAmount()
    {
        return amount;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getDescription()
    {
        return description;
    }

    public String getId()
    {
        return id;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Map getMetadata()
    {
        return metadata;
    }

    public InvoiceLineItemPeriod getPeriod()
    {
        return period;
    }

    public Plan getPlan()
    {
        return plan;
    }

    public Boolean getProration()
    {
        return proration;
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public String getSubscription()
    {
        return subscription;
    }

    public String getType()
    {
        return type;
    }
}
