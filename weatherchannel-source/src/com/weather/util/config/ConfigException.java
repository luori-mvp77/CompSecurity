// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.config;


public class ConfigException extends Exception
{

    private static final long serialVersionUID = 0xbcfddfa73bdd94f2L;

    public ConfigException(String s)
    {
        super(s);
    }

    public ConfigException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
