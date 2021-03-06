// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            Element, RSIllegalArgumentException, RenderScript

public static class mArraySizes
{

    int mArraySizes[];
    int mCount;
    String mElementNames[];
    Element mElements[];
    RenderScript mRS;
    int mSkipPadding;

    public mArraySizes add(Element element, String s)
    {
        return add(element, s, 1);
    }

    public add add(Element element, String s, int i)
    {
        if (i < 1)
        {
            throw new RSIllegalArgumentException("Array size cannot be less than 1.");
        }
        if (mSkipPadding != 0 && s.startsWith("#padding_"))
        {
            mSkipPadding = 0;
            return this;
        }
        if (element.mVectorSize == 3)
        {
            mSkipPadding = 1;
        } else
        {
            mSkipPadding = 0;
        }
        if (mCount == mElements.length)
        {
            Element aelement[] = new Element[mCount + 8];
            String as[] = new String[mCount + 8];
            int ai[] = new int[mCount + 8];
            System.arraycopy(mElements, 0, aelement, 0, mCount);
            System.arraycopy(mElementNames, 0, as, 0, mCount);
            System.arraycopy(mArraySizes, 0, ai, 0, mCount);
            mElements = aelement;
            mElementNames = as;
            mArraySizes = ai;
        }
        mElements[mCount] = element;
        mElementNames[mCount] = s;
        mArraySizes[mCount] = i;
        mCount = mCount + 1;
        return this;
    }

    public Element create()
    {
        int i = 0;
        mRS.validate();
        Element aelement[] = new Element[mCount];
        String as[] = new String[mCount];
        int ai[] = new int[mCount];
        System.arraycopy(mElements, 0, aelement, 0, mCount);
        System.arraycopy(mElementNames, 0, as, 0, mCount);
        System.arraycopy(mArraySizes, 0, ai, 0, mCount);
        long al[] = new long[aelement.length];
        for (; i < aelement.length; i++)
        {
            al[i] = aelement[i].getID(mRS);
        }

        return new Element(mRS.nElementCreate2(al, as, ai), mRS, aelement, as, ai);
    }

    public tException(RenderScript renderscript)
    {
        mRS = renderscript;
        mCount = 0;
        mElements = new Element[8];
        mElementNames = new String[8];
        mArraySizes = new int[8];
    }
}
