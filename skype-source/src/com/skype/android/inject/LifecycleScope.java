// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import java.lang.annotation.Annotation;

// Referenced classes of package com.skype.android.inject:
//            LifecycleState

public interface LifecycleScope
    extends Annotation
{

    public abstract LifecycleState value();
}
