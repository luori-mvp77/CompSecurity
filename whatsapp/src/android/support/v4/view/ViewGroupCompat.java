// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewGroup;

public class ViewGroupCompat
{

    static final ViewGroupCompatImpl IMPL;

    public static void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
    {
        IMPL.setMotionEventSplittingEnabled(viewgroup, flag);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            IMPL = new ViewGroupCompatApi21Impl();
        } else
        if (i >= 18)
        {
            IMPL = new ViewGroupCompatJellybeanMR2Impl();
        } else
        if (i >= 14)
        {
            IMPL = new ViewGroupCompatIcsImpl();
        } else
        if (i >= 11)
        {
            IMPL = new ViewGroupCompatHCImpl();
        } else
        {
            IMPL = new ViewGroupCompatStubImpl();
        }
    }

    private class ViewGroupCompatImpl
    {

        public abstract void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag);
    }


    private class ViewGroupCompatApi21Impl extends ViewGroupCompatJellybeanMR2Impl
    {
        private class ViewGroupCompatJellybeanMR2Impl extends ViewGroupCompatIcsImpl
        {
            private class ViewGroupCompatIcsImpl extends ViewGroupCompatHCImpl
            {
                private class ViewGroupCompatHCImpl extends ViewGroupCompatStubImpl
                {
                    private class ViewGroupCompatStubImpl
                        implements ViewGroupCompatImpl
                    {

                        public void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
                        {
                        }

                        ViewGroupCompatStubImpl()
                        {
                        }
                    }


                    public void setMotionEventSplittingEnabled(ViewGroup viewgroup, boolean flag)
                    {
                        ViewGroupCompatHC.setMotionEventSplittingEnabled(viewgroup, flag);
                    }

                    ViewGroupCompatHCImpl()
                    {
                    }
                }


                ViewGroupCompatIcsImpl()
                {
                }
            }


            ViewGroupCompatJellybeanMR2Impl()
            {
            }
        }


        ViewGroupCompatApi21Impl()
        {
        }
    }

}
