// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class azc
{

    public final String a;
    public final boolean b;

    public azc(String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || obj.getClass() != azc)
            {
                return false;
            }
            obj = (azc)obj;
            if (!TextUtils.equals(a, ((azc) (obj)).a) || b != ((azc) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i;
        char c;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return c + (i + 31) * 31;
    }
}
