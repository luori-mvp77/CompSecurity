// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.wire;


// Referenced classes of package com.walmartlabs.android.photo.model.wire:
//            WirePendingOrder

public static class Address
{
    public static class Address
    {

        private String city;
        private String state;
        private String streetAddress;
        private int zipCode;

        public String getCity()
        {
            return city;
        }

        public String getState()
        {
            return state;
        }

        public String getStreetAddress()
        {
            return streetAddress;
        }

        public int getZipCode()
        {
            return zipCode;
        }

        public void setCity(String s)
        {
            city = s;
        }

        public void setState(String s)
        {
            state = s;
        }

        public void setStreetAddress(String s)
        {
            streetAddress = s;
        }

        public void setZipCode(int i)
        {
            zipCode = i;
        }

        public Address()
        {
        }
    }


    private Address address;
    private int number;
    private String phone;

    public Address getAddress()
    {
        return address;
    }

    public int getNumber()
    {
        return number;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setAddress(Address address1)
    {
        address = address1;
    }

    public void setNumber(int i)
    {
        number = i;
    }

    public void setPhone(String s)
    {
        phone = s;
    }

    public Address()
    {
    }
}
