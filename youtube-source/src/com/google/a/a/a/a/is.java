// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.f;
import java.util.ArrayList;

// Referenced classes of package com.google.a.a.a.a:
//            dj, de, db, df

public final class is extends b
{

    public static final is a[] = new is[0];
    public dj b;
    public de c;
    public db d;
    public df e;

    public is()
    {
        b = null;
        c = null;
        d = null;
        e = null;
    }

    public final int a()
    {
        int j = 0;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(0x3049143, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3064567, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3070f41, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x32b52b9, e);
        }
        i += f.a(dl);
        dm = i;
        return i;
    }

    public final c a(a a1)
    {
        do
        {
            int i = a1.a();
            switch (i)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (f.a(dl, a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 405047834: 
                b = new dj();
                a1.a(b);
                break;

            case 405941050: 
                c = new de();
                a1.a(c);
                break;

            case 406354442: 
                d = new db();
                a1.a(d);
                break;

            case 425366986: 
                e = new df();
                a1.a(e);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x3049143, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x3064567, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x3070f41, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x32b52b9, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
