// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.checks;


public final class Preconditions
{

    private Preconditions()
    {
    }

    private static String badElementIndex(int i, int j, String s)
    {
        if (i < 0)
        {
            return format("%s (%s) must not be negative", new Object[] {
                s, Integer.valueOf(i)
            });
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("negative size: ")).append(j).toString());
        } else
        {
            return format("%s (%s) must be less than size (%s)", new Object[] {
                s, Integer.valueOf(i), Integer.valueOf(j)
            });
        }
    }

    private static String badPositionIndex(int i, int j, String s)
    {
        if (i < 0)
        {
            return format("%s (%s) must not be negative", new Object[] {
                s, Integer.valueOf(i)
            });
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("negative size: ")).append(j).toString());
        } else
        {
            return format("%s (%s) must not be greater than size (%s)", new Object[] {
                s, Integer.valueOf(i), Integer.valueOf(j)
            });
        }
    }

    private static String badPositionIndexes(int i, int j, int k)
    {
        if (i < 0 || i > k)
        {
            return badPositionIndex(i, k, "start index");
        }
        if (j < 0 || j > k)
        {
            return badPositionIndex(j, k, "end index");
        } else
        {
            return format("end index (%s) must not be less than start index (%s)", new Object[] {
                Integer.valueOf(j), Integer.valueOf(i)
            });
        }
    }

    public static void checkArgument(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException();
        } else
        {
            return;
        }
    }

    public static void checkArgument(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalArgumentException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    public static int checkElementIndex(int i, int j)
    {
        return checkElementIndex(i, j, "index");
    }

    public static int checkElementIndex(int i, int j, String s)
    {
        if (i < 0 || i >= j)
        {
            throw new IndexOutOfBoundsException(badElementIndex(i, j, s));
        } else
        {
            return i;
        }
    }

    public static Object checkNotNull(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            return obj;
        }
    }

    public static Object checkNotNull(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new NullPointerException(String.valueOf(obj1));
        } else
        {
            return obj;
        }
    }

    public static int checkPositionIndex(int i, int j)
    {
        return checkPositionIndex(i, j, "index");
    }

    public static int checkPositionIndex(int i, int j, String s)
    {
        if (i < 0 || i > j)
        {
            throw new IndexOutOfBoundsException(badPositionIndex(i, j, s));
        } else
        {
            return i;
        }
    }

    public static void checkPositionIndexes(int i, int j, int k)
    {
        if (i < 0 || j < i || j > k)
        {
            throw new IndexOutOfBoundsException(badPositionIndexes(i, j, k));
        } else
        {
            return;
        }
    }

    public static void checkState(boolean flag)
    {
        if (!flag)
        {
            throw new IllegalStateException();
        } else
        {
            return;
        }
    }

    public static void checkState(boolean flag, Object obj)
    {
        if (!flag)
        {
            throw new IllegalStateException(String.valueOf(obj));
        } else
        {
            return;
        }
    }

    static transient String format(String s, Object aobj[])
    {
        int i = 0;
        s = String.valueOf(s);
        StringBuilder stringbuilder = new StringBuilder(s.length() + aobj.length * 16);
        int j = 0;
        do
        {
            if (i >= aobj.length)
            {
                break;
            }
            int k = s.indexOf("%s", j);
            if (k == -1)
            {
                break;
            }
            stringbuilder.append(s.substring(j, k));
            stringbuilder.append(aobj[i]);
            j = k + 2;
            i++;
        } while (true);
        stringbuilder.append(s.substring(j));
        if (i < aobj.length)
        {
            stringbuilder.append(" [");
            stringbuilder.append(aobj[i]);
            for (i++; i < aobj.length; i++)
            {
                stringbuilder.append(", ");
                stringbuilder.append(aobj[i]);
            }

            stringbuilder.append(']');
        }
        return stringbuilder.toString();
    }
}
