// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso;

import com.googlecode.mp4parser.util.IntHashMap;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso:
//            Utf8

public final class IsoTypeReader
{

    private static byte codeBytes[] = new byte[4];
    private static IntHashMap codeCache = new IntHashMap();

    public IsoTypeReader()
    {
    }

    public static int byte2int(byte byte0)
    {
        int i = byte0;
        if (byte0 < 0)
        {
            i = byte0 + 256;
        }
        return i;
    }

    public static String read4cc(ByteBuffer bytebuffer)
    {
        int i;
        bytebuffer.get(codeBytes);
        i = codeBytes[0] << 24 & 0xff000000 | codeBytes[1] << 16 & 0xff0000 | codeBytes[2] << 8 & 0xff00 | codeBytes[3] & 0xff;
        bytebuffer = (String)codeCache.get(i);
        if (bytebuffer != null)
        {
            return bytebuffer;
        }
        bytebuffer = new String(codeBytes, "ISO-8859-1");
        codeCache.put(i, bytebuffer);
        return bytebuffer;
        bytebuffer;
_L2:
        throw new RuntimeException(bytebuffer);
        bytebuffer;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static double readFixedPoint0230(ByteBuffer bytebuffer)
    {
        byte abyte0[] = new byte[4];
        bytebuffer.get(abyte0);
        return (double)(0 | abyte0[0] << 24 & 0xff000000 | abyte0[1] << 16 & 0xff0000 | abyte0[2] << 8 & 0xff00 | abyte0[3] & 0xff) / 1073741824D;
    }

    public static double readFixedPoint1616(ByteBuffer bytebuffer)
    {
        byte abyte0[] = new byte[4];
        bytebuffer.get(abyte0);
        return (double)(0 | abyte0[0] << 24 & 0xff000000 | abyte0[1] << 16 & 0xff0000 | abyte0[2] << 8 & 0xff00 | abyte0[3] & 0xff) / 65536D;
    }

    public static float readFixedPoint88(ByteBuffer bytebuffer)
    {
        byte abyte0[] = new byte[2];
        bytebuffer.get(abyte0);
        short word0 = (short)(abyte0[0] << 8 & 0xff00 | 0);
        return (float)(short)(abyte0[1] & 0xff | word0) / 256F;
    }

    public static String readIso639(ByteBuffer bytebuffer)
    {
        int j = readUInt16(bytebuffer);
        bytebuffer = new StringBuilder();
        int i = 0;
        do
        {
            if (i >= 3)
            {
                return bytebuffer.toString();
            }
            bytebuffer.append((char)((j >> (2 - i) * 5 & 0x1f) + 96));
            i++;
        } while (true);
    }

    public static String readString(ByteBuffer bytebuffer)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        do
        {
            byte byte0 = bytebuffer.get();
            if (byte0 == 0)
            {
                return Utf8.convert(bytearrayoutputstream.toByteArray());
            }
            bytearrayoutputstream.write(byte0);
        } while (true);
    }

    public static String readString(ByteBuffer bytebuffer, int i)
    {
        byte abyte0[] = new byte[i];
        bytebuffer.get(abyte0);
        return Utf8.convert(abyte0);
    }

    public static int readUInt16(ByteBuffer bytebuffer)
    {
        return 0 + (byte2int(bytebuffer.get()) << 8) + byte2int(bytebuffer.get());
    }

    public static int readUInt16BE(ByteBuffer bytebuffer)
    {
        return 0 + byte2int(bytebuffer.get()) + (byte2int(bytebuffer.get()) << 8);
    }

    public static int readUInt24(ByteBuffer bytebuffer)
    {
        return 0 + (readUInt16(bytebuffer) << 8) + byte2int(bytebuffer.get());
    }

    public static long readUInt32(ByteBuffer bytebuffer)
    {
        long l1 = bytebuffer.getInt();
        long l = l1;
        if (l1 < 0L)
        {
            l = l1 + 0x100000000L;
        }
        return l;
    }

    public static long readUInt32BE(ByteBuffer bytebuffer)
    {
        long l = readUInt8(bytebuffer);
        long l1 = readUInt8(bytebuffer);
        long l2 = readUInt8(bytebuffer);
        return ((long)readUInt8(bytebuffer) << 24) + (l2 << 16) + (l1 << 8) + (l << 0);
    }

    public static long readUInt64(ByteBuffer bytebuffer)
    {
        long l = 0L + (readUInt32(bytebuffer) << 32);
        if (l < 0L)
        {
            throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
        } else
        {
            return l + readUInt32(bytebuffer);
        }
    }

    public static int readUInt8(ByteBuffer bytebuffer)
    {
        return byte2int(bytebuffer.get());
    }

}
