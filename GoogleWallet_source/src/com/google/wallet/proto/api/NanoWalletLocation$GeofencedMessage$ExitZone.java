// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletLocation

public static final class clear extends ExtendableMessageNano
{

    private static volatile radiusInMeters _emptyArray[];
    public com.google.wallet.proto.one center;
    public Float radiusInMeters;

    private clear clear()
    {
        center = null;
        radiusInMeters = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                if (center == null)
                {
                    center = new com.google.wallet.proto.one.center();
                }
                codedinputbytebuffernano.readMessage(center);
                break;

            case 21: // '\025'
                radiusInMeters = Float.valueOf(codedinputbytebuffernano.readFloat());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (center != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, center);
        }
        j = i;
        if (radiusInMeters != null)
        {
            j = i + CodedOutputByteBufferNano.computeFloatSize(2, radiusInMeters.floatValue());
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
        if (center != null)
        {
            codedoutputbytebuffernano.writeMessage(1, center);
        }
        if (radiusInMeters != null)
        {
            codedoutputbytebuffernano.writeFloat(2, radiusInMeters.floatValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
