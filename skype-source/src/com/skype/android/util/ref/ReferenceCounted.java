// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.ref;


public interface ReferenceCounted
{

    public abstract void acquireOnce();

    public abstract void releaseFully();

    public abstract void releaseOnce();
}
