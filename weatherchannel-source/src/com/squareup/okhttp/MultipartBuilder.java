// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okio.BufferedSink;
import okio.ByteString;

// Referenced classes of package com.squareup.okhttp:
//            MediaType, RequestBody, Headers

public final class MultipartBuilder
{
    private static final class MultipartRequestBody extends RequestBody
    {

        private final ByteString boundary;
        private final MediaType contentType;
        private final List partBodies;
        private final List partHeaders;

        public long contentLength()
            throws IOException
        {
            return -1L;
        }

        public MediaType contentType()
        {
            return contentType;
        }

        public void writeTo(BufferedSink bufferedsink)
            throws IOException
        {
            int i = 0;
            for (int k = partHeaders.size(); i < k; i++)
            {
                Object obj = (Headers)partHeaders.get(i);
                RequestBody requestbody = (RequestBody)partBodies.get(i);
                bufferedsink.write(MultipartBuilder.DASHDASH);
                bufferedsink.write(boundary);
                bufferedsink.write(MultipartBuilder.CRLF);
                if (obj != null)
                {
                    int j = 0;
                    for (int l = ((Headers) (obj)).size(); j < l; j++)
                    {
                        bufferedsink.writeUtf8(((Headers) (obj)).name(j)).write(MultipartBuilder.COLONSPACE).writeUtf8(((Headers) (obj)).value(j)).write(MultipartBuilder.CRLF);
                    }

                }
                obj = requestbody.contentType();
                if (obj != null)
                {
                    bufferedsink.writeUtf8("Content-Type: ").writeUtf8(((MediaType) (obj)).toString()).write(MultipartBuilder.CRLF);
                }
                long l1 = requestbody.contentLength();
                if (l1 != -1L)
                {
                    bufferedsink.writeUtf8("Content-Length: ").writeUtf8(Long.toString(l1)).write(MultipartBuilder.CRLF);
                }
                bufferedsink.write(MultipartBuilder.CRLF);
                ((RequestBody)partBodies.get(i)).writeTo(bufferedsink);
                bufferedsink.write(MultipartBuilder.CRLF);
            }

            bufferedsink.write(MultipartBuilder.DASHDASH);
            bufferedsink.write(boundary);
            bufferedsink.write(MultipartBuilder.DASHDASH);
            bufferedsink.write(MultipartBuilder.CRLF);
        }

        public MultipartRequestBody(MediaType mediatype, ByteString bytestring, List list, List list1)
        {
            if (mediatype == null)
            {
                throw new NullPointerException("type == null");
            } else
            {
                boundary = bytestring;
                contentType = MediaType.parse((new StringBuilder()).append(mediatype).append("; boundary=").append(bytestring.utf8()).toString());
                partHeaders = Util.immutableList(list);
                partBodies = Util.immutableList(list1);
                return;
            }
        }
    }


    public static final MediaType ALTERNATIVE = MediaType.parse("multipart/alternative");
    private static final byte COLONSPACE[] = {
        58, 32
    };
    private static final byte CRLF[] = {
        13, 10
    };
    private static final byte DASHDASH[] = {
        45, 45
    };
    public static final MediaType DIGEST = MediaType.parse("multipart/digest");
    public static final MediaType FORM = MediaType.parse("multipart/form-data");
    public static final MediaType MIXED = MediaType.parse("multipart/mixed");
    public static final MediaType PARALLEL = MediaType.parse("multipart/parallel");
    private final ByteString boundary;
    private final List partBodies;
    private final List partHeaders;
    private MediaType type;

    public MultipartBuilder()
    {
        this(UUID.randomUUID().toString());
    }

    public MultipartBuilder(String s)
    {
        type = MIXED;
        partHeaders = new ArrayList();
        partBodies = new ArrayList();
        boundary = ByteString.encodeUtf8(s);
    }

    private static StringBuilder appendQuotedString(StringBuilder stringbuilder, String s)
    {
        int i;
        int j;
        stringbuilder.append('"');
        i = 0;
        j = s.length();
_L6:
        char c;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        c = s.charAt(i);
        c;
        JVM INSTR lookupswitch 3: default 64
    //                   10: 77
    //                   13: 87
    //                   34: 97;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_97;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        stringbuilder.append(c);
_L7:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        stringbuilder.append("%0A");
          goto _L7
_L3:
        stringbuilder.append("%0D");
          goto _L7
        stringbuilder.append("%22");
          goto _L7
        stringbuilder.append('"');
        return stringbuilder;
    }

    public MultipartBuilder addFormDataPart(String s, String s1)
    {
        return addFormDataPart(s, null, RequestBody.create(null, s1));
    }

    public MultipartBuilder addFormDataPart(String s, String s1, RequestBody requestbody)
    {
        if (s == null)
        {
            throw new NullPointerException("name == null");
        }
        StringBuilder stringbuilder = new StringBuilder("form-data; name=");
        appendQuotedString(stringbuilder, s);
        if (s1 != null)
        {
            stringbuilder.append("; filename=");
            appendQuotedString(stringbuilder, s1);
        }
        return addPart(Headers.of(new String[] {
            "Content-Disposition", stringbuilder.toString()
        }), requestbody);
    }

    public MultipartBuilder addPart(Headers headers, RequestBody requestbody)
    {
        if (requestbody == null)
        {
            throw new NullPointerException("body == null");
        }
        if (headers != null && headers.get("Content-Type") != null)
        {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (headers != null && headers.get("Content-Length") != null)
        {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        } else
        {
            partHeaders.add(headers);
            partBodies.add(requestbody);
            return this;
        }
    }

    public MultipartBuilder addPart(RequestBody requestbody)
    {
        return addPart(null, requestbody);
    }

    public RequestBody build()
    {
        if (partHeaders.isEmpty())
        {
            throw new IllegalStateException("Multipart body must have at least one part.");
        } else
        {
            return new MultipartRequestBody(type, boundary, partHeaders, partBodies);
        }
    }

    public MultipartBuilder type(MediaType mediatype)
    {
        if (mediatype == null)
        {
            throw new NullPointerException("type == null");
        }
        if (!mediatype.type().equals("multipart"))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("multipart != ").append(mediatype).toString());
        } else
        {
            type = mediatype;
            return this;
        }
    }




}
