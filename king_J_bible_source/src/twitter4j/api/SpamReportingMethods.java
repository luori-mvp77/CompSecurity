// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.TwitterException;
import twitter4j.User;

public interface SpamReportingMethods
{

    public abstract User reportSpam(long l)
        throws TwitterException;

    public abstract User reportSpam(String s)
        throws TwitterException;
}
