// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;


// Referenced classes of package com.google.gson.internal:
//            ObjectConstructor, ConstructorConstructor, LinkedTreeMap

class a
    implements ObjectConstructor
{

    final ConstructorConstructor a;

    public Object a()
    {
        return new LinkedTreeMap();
    }

    (ConstructorConstructor constructorconstructor)
    {
        a = constructorconstructor;
        super();
    }
}
