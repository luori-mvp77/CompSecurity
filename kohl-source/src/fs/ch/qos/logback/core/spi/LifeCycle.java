// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.spi;


public interface LifeCycle
{

    public abstract boolean isStarted();

    public abstract void start();

    public abstract void stop();
}
