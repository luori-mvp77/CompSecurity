// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package dagger.internal:
//            Factory, Collections

public final class MapFactory
    implements Factory
{

    private final Map contributingMap;

    private MapFactory(Map map)
    {
        contributingMap = Collections.unmodifiableMap(map);
    }

    public static MapFactory create(Provider provider)
    {
        return new MapFactory((Map)provider.get());
    }

    public volatile Object get()
    {
        return get();
    }

    public Map get()
    {
        java.util.LinkedHashMap linkedhashmap = Collections.newLinkedHashMapWithExpectedSize(contributingMap.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = contributingMap.entrySet().iterator(); iterator.hasNext(); linkedhashmap.put(entry.getKey(), ((Provider)entry.getValue()).get()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return Collections.unmodifiableMap(linkedhashmap);
    }
}
