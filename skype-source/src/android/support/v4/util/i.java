// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.util.Map;

// Referenced classes of package android.support.v4.util:
//            b, a

public class i
{

    static Object b[];
    static int c;
    static Object d[];
    static int e;
    int f[];
    Object g[];
    int h;

    public i()
    {
        f = b.a;
        g = b.c;
        h = 0;
    }

    public i(byte byte0)
    {
        e(10);
        h = 0;
    }

    private int a()
    {
        int i1 = h;
        int j;
        if (i1 == 0)
        {
            j = -1;
        } else
        {
            int l = android.support.v4.util.b.a(f, i1, 0);
            j = l;
            if (l >= 0)
            {
                j = l;
                if (g[l << 1] != null)
                {
                    int k;
                    for (k = l + 1; k < i1 && f[k] == 0; k++)
                    {
                        if (g[k << 1] == null)
                        {
                            return k;
                        }
                    }

                    for (l--; l >= 0 && f[l] == 0; l--)
                    {
                        if (g[l << 1] == null)
                        {
                            return l;
                        }
                    }

                    return ~k;
                }
            }
        }
        return j;
    }

    private int a(Object obj, int j)
    {
        int j1 = h;
        int k;
        if (j1 == 0)
        {
            k = -1;
        } else
        {
            int i1 = android.support.v4.util.b.a(f, j1, j);
            k = i1;
            if (i1 >= 0)
            {
                k = i1;
                if (!obj.equals(g[i1 << 1]))
                {
                    int l;
                    for (l = i1 + 1; l < j1 && f[l] == j; l++)
                    {
                        if (obj.equals(g[l << 1]))
                        {
                            return l;
                        }
                    }

                    for (i1--; i1 >= 0 && f[i1] == j; i1--)
                    {
                        if (obj.equals(g[i1 << 1]))
                        {
                            return i1;
                        }
                    }

                    return ~l;
                }
            }
        }
        return k;
    }

    private static void a(int ai[], Object aobj[], int j)
    {
        if (ai.length != 8) goto _L2; else goto _L1
_L1:
        android/support/v4/util/a;
        JVM INSTR monitorenter ;
        if (e < 10)
        {
            aobj[0] = ((Object) (d));
            break MISSING_BLOCK_LABEL_24;
        }
          goto _L3
_L8:
        d = aobj;
        e++;
_L3:
        android/support/v4/util/a;
        JVM INSTR monitorexit ;
        return;
        ai;
        android/support/v4/util/a;
        JVM INSTR monitorexit ;
        throw ai;
_L2:
        if (ai.length != 4) goto _L5; else goto _L4
_L4:
        android/support/v4/util/a;
        JVM INSTR monitorenter ;
        if (c >= 10) goto _L7; else goto _L6
_L6:
        aobj[0] = ((Object) (b));
        aobj[1] = ai;
        j = (j << 1) - 1;
        break MISSING_BLOCK_LABEL_134;
_L9:
        b = aobj;
        c++;
_L7:
        android/support/v4/util/a;
        JVM INSTR monitorexit ;
        return;
        ai;
        android/support/v4/util/a;
        JVM INSTR monitorexit ;
        throw ai;
        aobj[1] = ai;
        j = (j << 1) - 1;
        while (j >= 2) 
        {
            aobj[j] = null;
            j--;
        }
          goto _L8
_L5:
        return;
        while (j >= 2) 
        {
            aobj[j] = null;
            j--;
        }
          goto _L9
    }

    private void e(int j)
    {
        if (j != 8) goto _L2; else goto _L1
_L1:
        android/support/v4/util/a;
        JVM INSTR monitorenter ;
        Object aobj[];
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        aobj = d;
        g = aobj;
        d = (Object[])aobj[0];
        f = (int[])aobj[1];
        aobj[1] = null;
        aobj[0] = null;
        e--;
        android/support/v4/util/a;
        JVM INSTR monitorexit ;
        return;
        android/support/v4/util/a;
        JVM INSTR monitorexit ;
_L4:
        f = new int[j];
        g = new Object[j << 1];
        return;
        Exception exception;
        exception;
        android/support/v4/util/a;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (j != 4) goto _L4; else goto _L3
_L3:
        android/support/v4/util/a;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        exception = ((Exception) (b));
        g = exception;
        b = (Object[])exception[0];
        f = (int[])exception[1];
        exception[1] = null;
        exception[0] = null;
        c--;
        android/support/v4/util/a;
        JVM INSTR monitorexit ;
        return;
        exception;
        android/support/v4/util/a;
        JVM INSTR monitorexit ;
        throw exception;
        android/support/v4/util/a;
        JVM INSTR monitorexit ;
          goto _L4
    }

    public final int a(Object obj)
    {
        if (obj == null)
        {
            return a();
        } else
        {
            return a(obj, obj.hashCode());
        }
    }

    public final Object a(int j, Object obj)
    {
        j = (j << 1) + 1;
        Object obj1 = g[j];
        g[j] = obj;
        return obj1;
    }

    public final void a(int j)
    {
        if (f.length < j)
        {
            int ai[] = f;
            Object aobj[] = g;
            e(j);
            if (h > 0)
            {
                System.arraycopy(ai, 0, f, 0, h);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (g)), 0, h << 1);
            }
            a(ai, aobj, h);
        }
    }

    final int b(Object obj)
    {
        int l = h * 2;
        Object aobj[] = g;
        if (obj == null)
        {
            for (int j = 1; j < l; j += 2)
            {
                if (aobj[j] == null)
                {
                    return j >> 1;
                }
            }

        } else
        {
            for (int k = 1; k < l; k += 2)
            {
                if (obj.equals(aobj[k]))
                {
                    return k >> 1;
                }
            }

        }
        return -1;
    }

    public final Object b(int j)
    {
        return g[j << 1];
    }

    public final Object c(int j)
    {
        return g[(j << 1) + 1];
    }

    public void clear()
    {
        if (h != 0)
        {
            a(f, g, h);
            f = b.a;
            g = b.c;
            h = 0;
        }
    }

    public boolean containsKey(Object obj)
    {
        return a(obj) >= 0;
    }

    public boolean containsValue(Object obj)
    {
        return b(obj) >= 0;
    }

    public final Object d(int j)
    {
        int k = 8;
        Object obj = g[(j << 1) + 1];
        if (h <= 1)
        {
            a(f, g, h);
            f = b.a;
            g = b.c;
            h = 0;
        } else
        if (f.length > 8 && h < f.length / 3)
        {
            if (h > 8)
            {
                k = h + (h >> 1);
            }
            int ai[] = f;
            Object aobj[] = g;
            e(k);
            h = h - 1;
            if (j > 0)
            {
                System.arraycopy(ai, 0, f, 0, j);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (g)), 0, j << 1);
            }
            if (j < h)
            {
                System.arraycopy(ai, j + 1, f, j, h - j);
                System.arraycopy(((Object) (aobj)), j + 1 << 1, ((Object) (g)), j << 1, h - j << 1);
                return obj;
            }
        } else
        {
            h = h - 1;
            if (j < h)
            {
                System.arraycopy(f, j + 1, f, j, h - j);
                System.arraycopy(((Object) (g)), j + 1 << 1, ((Object) (g)), j << 1, h - j << 1);
            }
            g[h << 1] = null;
            g[(h << 1) + 1] = null;
            return obj;
        }
        return obj;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int j;
        if (!(obj instanceof Map))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = (Map)obj;
        if (size() != ((Map) (obj)).size())
        {
            return false;
        }
        j = 0;
_L4:
        Object obj1;
        Object obj2;
        Object obj3;
        if (j >= h)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = b(j);
        obj2 = c(j);
        obj3 = ((Map) (obj)).get(obj1);
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (!((Map) (obj)).containsKey(obj1))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        break MISSING_BLOCK_LABEL_106;
        boolean flag;
        try
        {
            flag = obj2.equals(obj3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (!flag)
        {
            return false;
        }
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        return false;
        return false;
    }

    public Object get(Object obj)
    {
        int j = a(obj);
        if (j >= 0)
        {
            return g[(j << 1) + 1];
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        int ai[] = f;
        Object aobj[] = g;
        int l = 0;
        int k = 0;
        int j = 1;
        int j1 = h;
        while (k < j1) 
        {
            Object obj = aobj[j];
            int k1 = ai[k];
            int i1;
            if (obj == null)
            {
                i1 = 0;
            } else
            {
                i1 = obj.hashCode();
            }
            l += i1 ^ k1;
            k++;
            j += 2;
        }
        return l;
    }

    public boolean isEmpty()
    {
        return h <= 0;
    }

    public Object put(Object obj, Object obj1)
    {
        int l;
        byte byte0;
        int i1;
        byte0 = 8;
        int j;
        if (obj == null)
        {
            l = 0;
            j = a();
        } else
        {
            l = obj.hashCode();
            j = a(obj, l);
        }
        if (j >= 0)
        {
            j = (j << 1) + 1;
            obj = g[j];
            g[j] = obj1;
            return obj;
        }
        i1 = ~j;
        if (h < f.length) goto _L2; else goto _L1
_L1:
        if (h < 8) goto _L4; else goto _L3
_L3:
        int k = h + (h >> 1);
_L6:
        int ai[] = f;
        Object aobj[] = g;
        e(k);
        if (f.length > 0)
        {
            System.arraycopy(ai, 0, f, 0, ai.length);
            System.arraycopy(((Object) (aobj)), 0, ((Object) (g)), 0, aobj.length);
        }
        a(ai, aobj, h);
_L2:
        if (i1 < h)
        {
            System.arraycopy(f, i1, f, i1 + 1, h - i1);
            System.arraycopy(((Object) (g)), i1 << 1, ((Object) (g)), i1 + 1 << 1, h - i1 << 1);
        }
        f[i1] = l;
        g[i1 << 1] = obj;
        g[(i1 << 1) + 1] = obj1;
        h = h + 1;
        return null;
_L4:
        k = byte0;
        if (h < 4)
        {
            k = 4;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Object remove(Object obj)
    {
        int j = a(obj);
        if (j >= 0)
        {
            return d(j);
        } else
        {
            return null;
        }
    }

    public int size()
    {
        return h;
    }

    public String toString()
    {
        if (isEmpty())
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(h * 28);
        stringbuilder.append('{');
        int j = 0;
        while (j < h) 
        {
            if (j > 0)
            {
                stringbuilder.append(", ");
            }
            Object obj = b(j);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            stringbuilder.append('=');
            obj = c(j);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            j++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
