// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v4.view:
//            LayoutInflaterFactory

final class LayoutInflaterCompatHC
{
    static final class FactoryWrapperHC extends LayoutInflaterCompatBase.FactoryWrapper
        implements android.view.LayoutInflater.Factory2
    {

        public final View onCreateView(View view, String s, Context context, AttributeSet attributeset)
        {
            return mDelegateFactory.onCreateView(view, s, context, attributeset);
        }

        FactoryWrapperHC(LayoutInflaterFactory layoutinflaterfactory)
        {
            super(layoutinflaterfactory);
        }
    }


    private static boolean sCheckedField;
    private static Field sLayoutInflaterFactory2Field;

    static void forceSetFactory2(LayoutInflater layoutinflater, android.view.LayoutInflater.Factory2 factory2)
    {
        if (!sCheckedField)
        {
            try
            {
                Field field = android/view/LayoutInflater.getDeclaredField("mFactory2");
                sLayoutInflaterFactory2Field = field;
                field.setAccessible(true);
            }
            catch (NoSuchFieldException nosuchfieldexception)
            {
                Log.e("LayoutInflaterCompatHC", (new StringBuilder("forceSetFactory2 Could not find field 'mFactory2' on class ")).append(android/view/LayoutInflater.getName()).append("; inflation may have unexpected results.").toString(), nosuchfieldexception);
            }
            sCheckedField = true;
        }
        if (sLayoutInflaterFactory2Field == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        sLayoutInflaterFactory2Field.set(layoutinflater, factory2);
        return;
        factory2;
        Log.e("LayoutInflaterCompatHC", (new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ")).append(layoutinflater).append("; inflation may have unexpected results.").toString(), factory2);
        return;
    }
}
