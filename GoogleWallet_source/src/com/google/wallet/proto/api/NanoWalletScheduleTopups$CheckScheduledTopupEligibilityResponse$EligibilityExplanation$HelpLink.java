// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletScheduleTopups

public static final class clear extends ExtendableMessageNano
{

    public String linkUri;
    public String text;

    private clear clear()
    {
        text = null;
        linkUri = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (storeUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                text = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                linkUri = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (text != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, text);
        }
        j = i;
        if (linkUri != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, linkUri);
        }
        return j;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (text != null)
        {
            codedoutputbytebuffernano.writeString(1, text);
        }
        if (linkUri != null)
        {
            codedoutputbytebuffernano.writeString(2, linkUri);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public _81_()
    {
        clear();
    }
}
