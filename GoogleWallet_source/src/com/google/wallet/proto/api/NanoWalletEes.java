// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

public interface NanoWalletEes
{
    public static final class EesEncryptFileResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletShared.ClientEncryptedData encryptedFile;

        private EesEncryptFileResponse clear()
        {
            encryptedFile = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private EesEncryptFileResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (encryptedFile == null)
                    {
                        encryptedFile = new com.google.wallet.proto.NanoWalletShared.ClientEncryptedData();
                    }
                    codedinputbytebuffernano.readMessage(encryptedFile);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (encryptedFile != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, encryptedFile);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (encryptedFile != null)
            {
                codedoutputbytebuffernano.writeMessage(1, encryptedFile);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public EesEncryptFileResponse()
        {
            clear();
        }
    }

}
