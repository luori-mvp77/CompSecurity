// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;


public final class ApplicationState extends Enum
{

    public static final ApplicationState a;
    public static final ApplicationState b;
    public static final ApplicationState c;
    private static final ApplicationState d[];

    private ApplicationState(String s, int i)
    {
        super(s, i);
    }

    public static ApplicationState valueOf(String s)
    {
        return (ApplicationState)Enum.valueOf(com/comscore/analytics/ApplicationState, s);
    }

    public static ApplicationState[] values()
    {
        return (ApplicationState[])d.clone();
    }

    static 
    {
        a = new ApplicationState("INACTIVE", 0);
        b = new ApplicationState("BACKGROUND_UX_ACTIVE", 1);
        c = new ApplicationState("FOREGROUND", 2);
        d = (new ApplicationState[] {
            a, b, c
        });
    }
}
