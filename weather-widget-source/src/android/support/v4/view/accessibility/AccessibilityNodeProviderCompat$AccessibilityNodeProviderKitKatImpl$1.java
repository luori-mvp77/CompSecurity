// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeProviderCompat, AccessibilityNodeInfoCompat

class val.compat
    implements val.compat
{

    final val.compat this$1;
    private final AccessibilityNodeProviderCompat val$compat;

    public Object createAccessibilityNodeInfo(int i)
    {
        AccessibilityNodeInfoCompat accessibilitynodeinfocompat = val$compat.createAccessibilityNodeInfo(i);
        if (accessibilitynodeinfocompat == null)
        {
            return null;
        } else
        {
            return accessibilitynodeinfocompat.getInfo();
        }
    }

    public List findAccessibilityNodeInfosByText(String s, int i)
    {
        s = val$compat.findAccessibilityNodeInfosByText(s, i);
        ArrayList arraylist = new ArrayList();
        int j = s.size();
        i = 0;
        do
        {
            if (i >= j)
            {
                return arraylist;
            }
            arraylist.add(((AccessibilityNodeInfoCompat)s.get(i)).getInfo());
            i++;
        } while (true);
    }

    public Object findFocus(int i)
    {
        AccessibilityNodeInfoCompat accessibilitynodeinfocompat = val$compat.findFocus(i);
        if (accessibilitynodeinfocompat == null)
        {
            return null;
        } else
        {
            return accessibilitynodeinfocompat.getInfo();
        }
    }

    public boolean performAction(int i, int j, Bundle bundle)
    {
        return val$compat.performAction(i, j, bundle);
    }

    q()
    {
        this$1 = final_q;
        val$compat = AccessibilityNodeProviderCompat.this;
        super();
    }
}
