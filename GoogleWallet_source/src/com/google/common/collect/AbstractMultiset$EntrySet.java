// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractMultiset, Multiset

final class this._cls0 extends this._cls0
{

    final AbstractMultiset this$0;

    public final Iterator iterator()
    {
        return entryIterator();
    }

    final Multiset multiset()
    {
        return AbstractMultiset.this;
    }

    public final int size()
    {
        return distinctElements();
    }

    _cls9()
    {
        this$0 = AbstractMultiset.this;
        super();
    }
}
