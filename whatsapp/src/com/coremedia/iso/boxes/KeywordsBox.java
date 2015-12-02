// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import java.nio.ByteBuffer;
import org.aspectj.runtime.reflect.Factory;

public class KeywordsBox extends AbstractFullBox
{

    public static final String TYPE = "kywd";
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_1;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_2;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_3;
    private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_4;
    private String keywords[];
    private String language;

    public KeywordsBox()
    {
        super("kywd");
    }

    private static void ajc$preClinit()
    {
        Factory factory = new Factory("KeywordsBox.java", com/coremedia/iso/boxes/KeywordsBox);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getLanguage", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "getKeywords", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "[Ljava.lang.String;"), 44);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setLanguage", "com.coremedia.iso.boxes.KeywordsBox", "java.lang.String", "language", "", "void"), 48);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "setKeywords", "com.coremedia.iso.boxes.KeywordsBox", "[Ljava.lang.String;", "keywords", "", "void"), 52);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"), 87);
    }

    public void _parseDetails(ByteBuffer bytebuffer)
    {
        parseVersionAndFlags(bytebuffer);
        language = IsoTypeReader.readIso639(bytebuffer);
        int j = IsoTypeReader.readUInt8(bytebuffer);
        keywords = new String[j];
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            IsoTypeReader.readUInt8(bytebuffer);
            keywords[i] = IsoTypeReader.readString(bytebuffer);
            i++;
        } while (true);
    }

    protected void getContent(ByteBuffer bytebuffer)
    {
        writeVersionAndFlags(bytebuffer);
        IsoTypeWriter.writeIso639(bytebuffer, language);
        IsoTypeWriter.writeUInt8(bytebuffer, keywords.length);
        String as[] = keywords;
        int j = as.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            String s = as[i];
            IsoTypeWriter.writeUInt8(bytebuffer, Utf8.utf8StringLengthInBytes(s) + 1);
            bytebuffer.put(Utf8.convert(s));
            i++;
        } while (true);
    }

    protected long getContentSize()
    {
        long l = 7L;
        String as[] = keywords;
        int j = as.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return l;
            }
            l += Utf8.utf8StringLengthInBytes(as[i]) + 1 + 1;
            i++;
        } while (true);
    }

    public String[] getKeywords()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_1, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return keywords;
    }

    public String getLanguage()
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        return language;
    }

    public void setKeywords(String as[])
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_3, this, this, as);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        keywords = as;
    }

    public void setLanguage(String s)
    {
        org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_2, this, this, s);
        RequiresParseDetailAspect.aspectOf().before(joinpoint);
        language = s;
    }

    public String toString()
    {
        Object obj = Factory.makeJP(ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(((org.aspectj.lang.JoinPoint) (obj)));
        obj = new StringBuffer();
        ((StringBuffer) (obj)).append("KeywordsBox[language=").append(getLanguage());
        int i = 0;
        do
        {
            if (i >= keywords.length)
            {
                ((StringBuffer) (obj)).append("]");
                return ((StringBuffer) (obj)).toString();
            }
            ((StringBuffer) (obj)).append(";keyword").append(i).append("=").append(keywords[i]);
            i++;
        } while (true);
    }

    static 
    {
        ajc$preClinit();
    }
}
