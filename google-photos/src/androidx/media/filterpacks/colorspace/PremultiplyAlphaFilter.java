// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.colorspace;

import ahn;
import ahs;
import ahv;
import aif;
import ajl;
import ajo;
import ajr;
import aju;
import ajw;

public class PremultiplyAlphaFilter extends ahn
{

    private static final String mPremultShaderCode = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 c = texture2D(tex_sampler_0, v_texcoord);\n  gl_FragColor = vec4(c.r * c.a, c.g * c.a, c.b * c.a, c.a);\n}\n";
    private ajl mShader;

    public PremultiplyAlphaFilter(ajr ajr, String s)
    {
        super(ajr, s);
    }

    public final ajw b()
    {
        aif aif1 = aif.a(301, 2);
        aif aif2 = aif.a(301, 16);
        return (new ajw()).a("image", 2, aif1).b("image", 2, aif2).a();
    }

    protected final void c()
    {
        mShader = new ajl("precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 c = texture2D(tex_sampler_0, v_texcoord);\n  gl_FragColor = vec4(c.r * c.a, c.g * c.a, c.b * c.a, c.a);\n}\n");
    }

    protected final void e()
    {
        aju aju1 = b("image");
        ahv ahv1 = a("image").a().h();
        ahv ahv2 = aju1.a(ahv1.l()).h();
        mShader.a(ahv1, ahv2);
        aju1.a(ahv2);
    }
}
