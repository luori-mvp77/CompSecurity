// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.lang;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// Referenced classes of package org.aspectj.lang:
//            NoAspectBoundException

public class Aspects14
{

    private static final String ASPECTOF = "aspectOf";
    private static final Class EMPTY_CLASS_ARRAY[] = new Class[0];
    private static final Object EMPTY_OBJECT_ARRAY[] = new Object[0];
    private static final String HASASPECT = "hasAspect";
    private static final Class PEROBJECT_CLASS_ARRAY[];
    private static final Class PERTYPEWITHIN_CLASS_ARRAY[];
    static Class class$java$lang$Class;
    static Class class$java$lang$Object;

    public Aspects14()
    {
    }

    public static Object aspectOf(Class class1)
        throws NoAspectBoundException
    {
        Object obj;
        try
        {
            obj = getSingletonOrThreadAspectOf(class1).invoke(null, EMPTY_OBJECT_ARRAY);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new NoAspectBoundException(class1.getName(), invocationtargetexception);
        }
        catch (Exception exception)
        {
            throw new NoAspectBoundException(class1.getName(), exception);
        }
        return obj;
    }

    public static Object aspectOf(Class class1, Class class2)
        throws NoAspectBoundException
    {
        try
        {
            class2 = ((Class) (getPerTypeWithinAspectOf(class1).invoke(null, new Object[] {
                class2
            })));
        }
        // Misplaced declaration of an exception variable
        catch (Class class2)
        {
            throw new NoAspectBoundException(class1.getName(), class2);
        }
        // Misplaced declaration of an exception variable
        catch (Class class2)
        {
            throw new NoAspectBoundException(class1.getName(), class2);
        }
        return class2;
    }

    public static Object aspectOf(Class class1, Object obj)
        throws NoAspectBoundException
    {
        try
        {
            obj = getPerObjectAspectOf(class1).invoke(null, new Object[] {
                obj
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new NoAspectBoundException(class1.getName(), ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new NoAspectBoundException(class1.getName(), ((Throwable) (obj)));
        }
        return obj;
    }

    private static Method checkAspectOf(Method method, Class class1)
        throws NoSuchMethodException
    {
        method.setAccessible(true);
        if (!method.isAccessible() || !Modifier.isPublic(method.getModifiers()) || !Modifier.isStatic(method.getModifiers()))
        {
            throw new NoSuchMethodException(class1.getName() + ".aspectOf(..) is not accessible public static");
        } else
        {
            return method;
        }
    }

    private static Method checkHasAspect(Method method, Class class1)
        throws NoSuchMethodException
    {
        method.setAccessible(true);
        if (!method.isAccessible() || !Modifier.isPublic(method.getModifiers()) || !Modifier.isStatic(method.getModifiers()))
        {
            throw new NoSuchMethodException(class1.getName() + ".hasAspect(..) is not accessible public static");
        } else
        {
            return method;
        }
    }

    static Class _mthclass$(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NoClassDefFoundError(s.getMessage());
        }
        return s;
    }

    private static Method getPerObjectAspectOf(Class class1)
        throws NoSuchMethodException
    {
        return checkAspectOf(class1.getDeclaredMethod("aspectOf", PEROBJECT_CLASS_ARRAY), class1);
    }

    private static Method getPerObjectHasAspect(Class class1)
        throws NoSuchMethodException
    {
        return checkHasAspect(class1.getDeclaredMethod("hasAspect", PEROBJECT_CLASS_ARRAY), class1);
    }

    private static Method getPerTypeWithinAspectOf(Class class1)
        throws NoSuchMethodException
    {
        return checkAspectOf(class1.getDeclaredMethod("aspectOf", PERTYPEWITHIN_CLASS_ARRAY), class1);
    }

    private static Method getPerTypeWithinHasAspect(Class class1)
        throws NoSuchMethodException
    {
        return checkHasAspect(class1.getDeclaredMethod("hasAspect", PERTYPEWITHIN_CLASS_ARRAY), class1);
    }

    private static Method getSingletonOrThreadAspectOf(Class class1)
        throws NoSuchMethodException
    {
        return checkAspectOf(class1.getDeclaredMethod("aspectOf", EMPTY_CLASS_ARRAY), class1);
    }

    private static Method getSingletonOrThreadHasAspect(Class class1)
        throws NoSuchMethodException
    {
        return checkHasAspect(class1.getDeclaredMethod("hasAspect", EMPTY_CLASS_ARRAY), class1);
    }

    public static boolean hasAspect(Class class1)
        throws NoAspectBoundException
    {
        boolean flag;
        try
        {
            flag = ((Boolean)getSingletonOrThreadHasAspect(class1).invoke(null, EMPTY_OBJECT_ARRAY)).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return false;
        }
        return flag;
    }

    public static boolean hasAspect(Class class1, Class class2)
        throws NoAspectBoundException
    {
        boolean flag;
        try
        {
            flag = ((Boolean)getPerTypeWithinHasAspect(class1).invoke(null, new Object[] {
                class2
            })).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return false;
        }
        return flag;
    }

    public static boolean hasAspect(Class class1, Object obj)
        throws NoAspectBoundException
    {
        boolean flag;
        try
        {
            flag = ((Boolean)getPerObjectHasAspect(class1).invoke(null, new Object[] {
                obj
            })).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return false;
        }
        return flag;
    }

    static 
    {
        Class class1;
        if (class$java$lang$Object == null)
        {
            class1 = _mthclass$("java.lang.Object");
            class$java$lang$Object = class1;
        } else
        {
            class1 = class$java$lang$Object;
        }
        PEROBJECT_CLASS_ARRAY = (new Class[] {
            class1
        });
        if (class$java$lang$Class == null)
        {
            class1 = _mthclass$("java.lang.Class");
            class$java$lang$Class = class1;
        } else
        {
            class1 = class$java$lang$Class;
        }
        PERTYPEWITHIN_CLASS_ARRAY = (new Class[] {
            class1
        });
    }
}
