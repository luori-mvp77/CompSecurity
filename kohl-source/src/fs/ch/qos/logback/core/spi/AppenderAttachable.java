// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.spi;

import fs.ch.qos.logback.core.Appender;

public interface AppenderAttachable
{

    public abstract void addAppender(Appender appender);
}
