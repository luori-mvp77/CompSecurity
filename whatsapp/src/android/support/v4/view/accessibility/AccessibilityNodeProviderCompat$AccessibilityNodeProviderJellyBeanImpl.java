// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeProviderCompatJellyBean, AccessibilityNodeProviderCompat

class _cls1 extends _cls1
{

    public Object newAccessibilityNodeProviderBridge(final AccessibilityNodeProviderCompat compat)
    {
        class _cls1
            implements AccessibilityNodeProviderCompatJellyBean.AccessibilityNodeInfoBridge
        {

            final AccessibilityNodeProviderCompat.AccessibilityNodeProviderJellyBeanImpl this$0;
            final AccessibilityNodeProviderCompat val$compat;

            public Object createAccessibilityNodeInfo(int i)
            {
                AccessibilityNodeInfoCompat accessibilitynodeinfocompat = compat.createAccessibilityNodeInfo(i);
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
                boolean flag = AccessibilityNodeInfoCompat.a;
                s = compat.findAccessibilityNodeInfosByText(s, i);
                ArrayList arraylist = new ArrayList();
                int j = s.size();
                i = 0;
                do
                {
label0:
                    {
                        if (i < j)
                        {
                            arraylist.add(((AccessibilityNodeInfoCompat)s.get(i)).getInfo());
                            if (!flag)
                            {
                                break label0;
                            }
                        }
                        if (Fragment.a != 0)
                        {
                            if (flag)
                            {
                                flag = false;
                            } else
                            {
                                flag = true;
                            }
                            AccessibilityNodeInfoCompat.a = flag;
                        }
                        return arraylist;
                    }
                    i++;
                } while (true);
            }

            public boolean performAction(int i, int j, Bundle bundle)
            {
                return compat.performAction(i, j, bundle);
            }

            _cls1()
            {
                this$0 = AccessibilityNodeProviderCompat.AccessibilityNodeProviderJellyBeanImpl.this;
                compat = accessibilitynodeprovidercompat;
                super();
            }
        }

        return AccessibilityNodeProviderCompatJellyBean.newAccessibilityNodeProviderBridge(new _cls1());
    }

    _cls1()
    {
    }
}
