// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.android.SkypeApplicationComponent;
import com.skype.android.util.cache.FormattedMessageCache;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.app.calling:
//            DaggerVideoMonitorComponent

final class val.builder
    implements Factory
{

    private final SkypeApplicationComponent skypeApplicationComponent;
    final DaggerVideoMonitorComponent this$0;
    final lder val$builder;

    public final FormattedMessageCache get()
    {
        FormattedMessageCache formattedmessagecache = skypeApplicationComponent.formattedMessageCache();
        if (formattedmessagecache == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return formattedmessagecache;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    lder()
    {
        this$0 = final_daggervideomonitorcomponent;
        val$builder = lder.this;
        super();
        skypeApplicationComponent = lder.access._mth100(val$builder);
    }
}
