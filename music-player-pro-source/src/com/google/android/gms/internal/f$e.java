// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            f

private final class <init>
    implements <init>
{

    final f kv;

    public void b(byte abyte0[], byte abyte1[])
    {
        kv.hP = kv.jr & ~kv.iw;
        kv.jP = kv.jr & ~kv.hP;
        kv.gS = kv.iZ | kv.jP;
        kv.gS = kv.gS & ~kv.iL;
        kv.jB = kv.hP ^ kv.jB;
        kv.gS = kv.jB ^ kv.gS;
        kv.jW = kv.gS ^ kv.jW;
        kv.kh = kv.jB ^ kv.kh;
        kv.kh = kv.jj & kv.kh;
        kv.kh = kv.iy ^ kv.kh;
        kv.iy = kv.hP ^ kv.iZ;
        kv.iy = kv.iL & kv.iy;
        kv.iy = kv.ij ^ kv.iy;
        kv.ij = kv.jj & kv.iy;
        kv.ij = kv.iy ^ kv.ij;
        kv.ij = kv.hS | kv.ij;
        kv.ij = kv.kh ^ kv.ij;
        kv.hd = kv.ij ^ kv.hd;
        kv.ij = kv.iZ | kv.hP;
        kv.ij = kv.jr ^ kv.ij;
        kv.hZ = kv.ij ^ kv.hZ;
        kv.hZ = kv.jj & ~kv.hZ;
        kv.hZ = kv.iu ^ kv.hZ;
        kv.hZ = kv.hZ & ~kv.hS;
        kv.iu = kv.hP & ~kv.iZ;
        kv.iu = kv.iw ^ kv.iu;
        kv.iu = kv.iL & ~kv.iu;
        kv.ij = kv.iZ | kv.hP;
        kv.ij = kv.hl ^ kv.ij;
        kv.ij = kv.iL & ~kv.ij;
        kv.hi = kv.hi & ~kv.jr;
        kv.hi = kv.hX ^ kv.hi;
        kv.hp = kv.hi ^ kv.hp;
        kv.jn = kv.hp ^ kv.jn;
        kv.hp = kv.jb | kv.jn;
        kv.hp = kv.jC ^ kv.hp;
        kv.hR = kv.hp ^ kv.hR;
        kv.jn = kv.jb & kv.jn;
        kv.jn = kv.jC ^ kv.jn;
        kv.hH = kv.jn ^ kv.hH;
        kv.jr = kv.iw ^ kv.jr;
        kv.jn = kv.jr & ~kv.iZ;
        kv.jn = kv.hP ^ kv.jn;
        kv.iu = kv.jn ^ kv.iu;
        kv.iu = kv.jj & ~kv.iu;
        kv.jn = kv.iZ | kv.jr;
        kv.jn = kv.jr ^ kv.jn;
        kv.ij = kv.jn ^ kv.ij;
        kv.ij = kv.jj & kv.ij;
        kv.jJ = kv.jr ^ kv.jJ;
        kv.jJ = kv.iL & kv.jJ;
        kv.jJ = kv.jj & kv.jJ;
        kv.jJ = kv.jP ^ kv.jJ;
        kv.jJ = kv.hS | kv.jJ;
        kv.jJ = kv.jW ^ kv.jJ;
        kv.gL = kv.jJ ^ kv.gL;
        kv.iZ = kv.jr ^ kv.iZ;
        kv.gV = kv.iZ ^ kv.gV;
        kv.iu = kv.gV ^ kv.iu;
        kv.kj = kv.iu ^ kv.kj;
        kv.iU = kv.kj ^ kv.iU;
        kv.iU = ~kv.iU;
        kv.hT = kv.jr ^ kv.hT;
        kv.hT = kv.iL & kv.hT;
        kv.hT = kv.iZ ^ kv.hT;
        kv.ij = kv.hT ^ kv.ij;
        kv.hZ = kv.ij ^ kv.hZ;
        kv.iS = kv.hZ ^ kv.iS;
        abyte1[0] = (byte)(kv.is & 0xff);
        abyte1[1] = (byte)((kv.is & 0xff00) >>> 8);
        abyte1[2] = (byte)((kv.is & 0xff0000) >>> 16);
        abyte1[3] = (byte)((kv.is & 0xff000000) >>> 24);
        abyte1[4] = (byte)(kv.jL & 0xff);
        abyte1[5] = (byte)((kv.jL & 0xff00) >>> 8);
        abyte1[6] = (byte)((kv.jL & 0xff0000) >>> 16);
        abyte1[7] = (byte)((kv.jL & 0xff000000) >>> 24);
        abyte1[8] = (byte)(kv.iU & 0xff);
        abyte1[9] = (byte)((kv.iU & 0xff00) >>> 8);
        abyte1[10] = (byte)((kv.iU & 0xff0000) >>> 16);
        abyte1[11] = (byte)((kv.iU & 0xff000000) >>> 24);
        abyte1[12] = (byte)(kv.iK & 0xff);
        abyte1[13] = (byte)((kv.iK & 0xff00) >>> 8);
        abyte1[14] = (byte)((kv.iK & 0xff0000) >>> 16);
        abyte1[15] = (byte)((kv.iK & 0xff000000) >>> 24);
        abyte1[16] = (byte)(kv.gL & 0xff);
        abyte1[17] = (byte)((kv.gL & 0xff00) >>> 8);
        abyte1[18] = (byte)((kv.gL & 0xff0000) >>> 16);
        abyte1[19] = (byte)((kv.gL & 0xff000000) >>> 24);
        abyte1[20] = (byte)(kv.gK & 0xff);
        abyte1[21] = (byte)((kv.gK & 0xff00) >>> 8);
        abyte1[22] = (byte)((kv.gK & 0xff0000) >>> 16);
        abyte1[23] = (byte)((kv.gK & 0xff000000) >>> 24);
        abyte1[24] = (byte)(kv.gN & 0xff);
        abyte1[25] = (byte)((kv.gN & 0xff00) >>> 8);
        abyte1[26] = (byte)((kv.gN & 0xff0000) >>> 16);
        abyte1[27] = (byte)((kv.gN & 0xff000000) >>> 24);
        abyte1[28] = (byte)(kv.jj & 0xff);
        abyte1[29] = (byte)((kv.jj & 0xff00) >>> 8);
        abyte1[30] = (byte)((kv.jj & 0xff0000) >>> 16);
        abyte1[31] = (byte)((kv.jj & 0xff000000) >>> 24);
        abyte1[32] = (byte)(kv.gP & 0xff);
        abyte1[33] = (byte)((kv.gP & 0xff00) >>> 8);
        abyte1[34] = (byte)((kv.gP & 0xff0000) >>> 16);
        abyte1[35] = (byte)((kv.gP & 0xff000000) >>> 24);
        abyte1[36] = (byte)(kv.kd & 0xff);
        abyte1[37] = (byte)((kv.kd & 0xff00) >>> 8);
        abyte1[38] = (byte)((kv.kd & 0xff0000) >>> 16);
        abyte1[39] = (byte)((kv.kd & 0xff000000) >>> 24);
        abyte1[40] = (byte)(kv.jg & 0xff);
        abyte1[41] = (byte)((kv.jg & 0xff00) >>> 8);
        abyte1[42] = (byte)((kv.jg & 0xff0000) >>> 16);
        abyte1[43] = (byte)((kv.jg & 0xff000000) >>> 24);
        abyte1[44] = (byte)(kv.gQ & 0xff);
        abyte1[45] = (byte)((kv.gQ & 0xff00) >>> 8);
        abyte1[46] = (byte)((kv.gQ & 0xff0000) >>> 16);
        abyte1[47] = (byte)((kv.gQ & 0xff000000) >>> 24);
        abyte1[48] = (byte)(kv.in & 0xff);
        abyte1[49] = (byte)((kv.in & 0xff00) >>> 8);
        abyte1[50] = (byte)((kv.in & 0xff0000) >>> 16);
        abyte1[51] = (byte)((kv.in & 0xff000000) >>> 24);
        abyte1[52] = (byte)(kv.jk & 0xff);
        abyte1[53] = (byte)((kv.jk & 0xff00) >>> 8);
        abyte1[54] = (byte)((kv.jk & 0xff0000) >>> 16);
        abyte1[55] = (byte)((kv.jk & 0xff000000) >>> 24);
        abyte1[56] = (byte)(kv.iE & 0xff);
        abyte1[57] = (byte)((kv.iE & 0xff00) >>> 8);
        abyte1[58] = (byte)((kv.iE & 0xff0000) >>> 16);
        abyte1[59] = (byte)((kv.iE & 0xff000000) >>> 24);
        abyte1[60] = (byte)(kv.gU & 0xff);
        abyte1[61] = (byte)((kv.gU & 0xff00) >>> 8);
        abyte1[62] = (byte)((kv.gU & 0xff0000) >>> 16);
        abyte1[63] = (byte)((kv.gU & 0xff000000) >>> 24);
        abyte1[64] = (byte)(kv.iS & 0xff);
        abyte1[65] = (byte)((kv.iS & 0xff00) >>> 8);
        abyte1[66] = (byte)((kv.iS & 0xff0000) >>> 16);
        abyte1[67] = (byte)((kv.iS & 0xff000000) >>> 24);
        abyte1[68] = (byte)(kv.iJ & 0xff);
        abyte1[69] = (byte)((kv.iJ & 0xff00) >>> 8);
        abyte1[70] = (byte)((kv.iJ & 0xff0000) >>> 16);
        abyte1[71] = (byte)((kv.iJ & 0xff000000) >>> 24);
        abyte1[72] = (byte)(kv.hV & 0xff);
        abyte1[73] = (byte)((kv.hV & 0xff00) >>> 8);
        abyte1[74] = (byte)((kv.hV & 0xff0000) >>> 16);
        abyte1[75] = (byte)((kv.hV & 0xff000000) >>> 24);
        abyte1[76] = (byte)(kv.iI & 0xff);
        abyte1[77] = (byte)((kv.iI & 0xff00) >>> 8);
        abyte1[78] = (byte)((kv.iI & 0xff0000) >>> 16);
        abyte1[79] = (byte)((kv.iI & 0xff000000) >>> 24);
        abyte1[80] = (byte)(kv.hb & 0xff);
        abyte1[81] = (byte)((kv.hb & 0xff00) >>> 8);
        abyte1[82] = (byte)((kv.hb & 0xff0000) >>> 16);
        abyte1[83] = (byte)((kv.hb & 0xff000000) >>> 24);
        abyte1[84] = (byte)(kv.ha & 0xff);
        abyte1[85] = (byte)((kv.ha & 0xff00) >>> 8);
        abyte1[86] = (byte)((kv.ha & 0xff0000) >>> 16);
        abyte1[87] = (byte)((kv.ha & 0xff000000) >>> 24);
        abyte1[88] = (byte)(kv.hd & 0xff);
        abyte1[89] = (byte)((kv.hd & 0xff00) >>> 8);
        abyte1[90] = (byte)((kv.hd & 0xff0000) >>> 16);
        abyte1[91] = (byte)((kv.hd & 0xff000000) >>> 24);
        abyte1[92] = (byte)(kv.hc & 0xff);
        abyte1[93] = (byte)((kv.hc & 0xff00) >>> 8);
        abyte1[94] = (byte)((kv.hc & 0xff0000) >>> 16);
        abyte1[95] = (byte)((kv.hc & 0xff000000) >>> 24);
        abyte1[96] = (byte)(kv.jl & 0xff);
        abyte1[97] = (byte)((kv.jl & 0xff00) >>> 8);
        abyte1[98] = (byte)((kv.jl & 0xff0000) >>> 16);
        abyte1[99] = (byte)((kv.jl & 0xff000000) >>> 24);
        abyte1[100] = (byte)(kv.ju & 0xff);
        abyte1[101] = (byte)((kv.ju & 0xff00) >>> 8);
        abyte1[102] = (byte)((kv.ju & 0xff0000) >>> 16);
        abyte1[103] = (byte)((kv.ju & 0xff000000) >>> 24);
        abyte1[104] = (byte)(kv.im & 0xff);
        abyte1[105] = (byte)((kv.im & 0xff00) >>> 8);
        abyte1[106] = (byte)((kv.im & 0xff0000) >>> 16);
        abyte1[107] = (byte)((kv.im & 0xff000000) >>> 24);
        abyte1[108] = (byte)(kv.hg & 0xff);
        abyte1[109] = (byte)((kv.hg & 0xff00) >>> 8);
        abyte1[110] = (byte)((kv.hg & 0xff0000) >>> 16);
        abyte1[111] = (byte)((kv.hg & 0xff000000) >>> 24);
        abyte1[112] = (byte)(kv.hj & 0xff);
        abyte1[113] = (byte)((kv.hj & 0xff00) >>> 8);
        abyte1[114] = (byte)((kv.hj & 0xff0000) >>> 16);
        abyte1[115] = (byte)((kv.hj & 0xff000000) >>> 24);
        abyte1[116] = (byte)(kv.hA & 0xff);
        abyte1[117] = (byte)((kv.hA & 0xff00) >>> 8);
        abyte1[118] = (byte)((kv.hA & 0xff0000) >>> 16);
        abyte1[119] = (byte)((kv.hA & 0xff000000) >>> 24);
        abyte1[120] = (byte)(kv.jo & 0xff);
        abyte1[121] = (byte)((kv.jo & 0xff00) >>> 8);
        abyte1[122] = (byte)((kv.jo & 0xff0000) >>> 16);
        abyte1[123] = (byte)((kv.jo & 0xff000000) >>> 24);
        abyte1[124] = (byte)(kv.iO & 0xff);
        abyte1[125] = (byte)((kv.iO & 0xff00) >>> 8);
        abyte1[126] = (byte)((kv.iO & 0xff0000) >>> 16);
        abyte1[127] = (byte)((kv.iO & 0xff000000) >>> 24);
        abyte1[128] = (byte)(kv.iP & 0xff);
        abyte1[129] = (byte)((kv.iP & 0xff00) >>> 8);
        abyte1[130] = (byte)((kv.iP & 0xff0000) >>> 16);
        abyte1[131] = (byte)((kv.iP & 0xff000000) >>> 24);
        abyte1[132] = (byte)(kv.hm & 0xff);
        abyte1[133] = (byte)((kv.hm & 0xff00) >>> 8);
        abyte1[134] = (byte)((kv.hm & 0xff0000) >>> 16);
        abyte1[135] = (byte)((kv.hm & 0xff000000) >>> 24);
        abyte1[136] = (byte)(kv.iA & 0xff);
        abyte1[137] = (byte)((kv.iA & 0xff00) >>> 8);
        abyte1[138] = (byte)((kv.iA & 0xff0000) >>> 16);
        abyte1[139] = (byte)((kv.iA & 0xff000000) >>> 24);
        abyte1[140] = (byte)(kv.jT & 0xff);
        abyte1[141] = (byte)((kv.jT & 0xff00) >>> 8);
        abyte1[142] = (byte)((kv.jT & 0xff0000) >>> 16);
        abyte1[143] = (byte)((kv.jT & 0xff000000) >>> 24);
        abyte1[144] = (byte)(kv.hr & 0xff);
        abyte1[145] = (byte)((kv.hr & 0xff00) >>> 8);
        abyte1[146] = (byte)((kv.hr & 0xff0000) >>> 16);
        abyte1[147] = (byte)((kv.hr & 0xff000000) >>> 24);
        abyte1[148] = (byte)(kv.jS & 0xff);
        abyte1[149] = (byte)((kv.jS & 0xff00) >>> 8);
        abyte1[150] = (byte)((kv.jS & 0xff0000) >>> 16);
        abyte1[151] = (byte)((kv.jS & 0xff000000) >>> 24);
        abyte1[152] = (byte)(kv.jy & 0xff);
        abyte1[153] = (byte)((kv.jy & 0xff00) >>> 8);
        abyte1[154] = (byte)((kv.jy & 0xff0000) >>> 16);
        abyte1[155] = (byte)((kv.jy & 0xff000000) >>> 24);
        abyte1[156] = (byte)(kv.hD & 0xff);
        abyte1[157] = (byte)((kv.hD & 0xff00) >>> 8);
        abyte1[158] = (byte)((kv.hD & 0xff0000) >>> 16);
        abyte1[159] = (byte)((kv.hD & 0xff000000) >>> 24);
        abyte1[160] = (byte)(kv.hv & 0xff);
        abyte1[161] = (byte)((kv.hv & 0xff00) >>> 8);
        abyte1[162] = (byte)((kv.hv & 0xff0000) >>> 16);
        abyte1[163] = (byte)((kv.hv & 0xff000000) >>> 24);
        abyte1[164] = (byte)(kv.gO & 0xff);
        abyte1[165] = (byte)((kv.gO & 0xff00) >>> 8);
        abyte1[166] = (byte)((kv.gO & 0xff0000) >>> 16);
        abyte1[167] = (byte)((kv.gO & 0xff000000) >>> 24);
        abyte1[168] = (byte)(kv.hK & 0xff);
        abyte1[169] = (byte)((kv.hK & 0xff00) >>> 8);
        abyte1[170] = (byte)((kv.hK & 0xff0000) >>> 16);
        abyte1[171] = (byte)((kv.hK & 0xff000000) >>> 24);
        abyte1[172] = (byte)(kv.hG & 0xff);
        abyte1[173] = (byte)((kv.hG & 0xff00) >>> 8);
        abyte1[174] = (byte)((kv.hG & 0xff0000) >>> 16);
        abyte1[175] = (byte)((kv.hG & 0xff000000) >>> 24);
        abyte1[176] = (byte)(kv.hz & 0xff);
        abyte1[177] = (byte)((kv.hz & 0xff00) >>> 8);
        abyte1[178] = (byte)((kv.hz & 0xff0000) >>> 16);
        abyte1[179] = (byte)((kv.hz & 0xff000000) >>> 24);
        abyte1[180] = (byte)(kv.iw & 0xff);
        abyte1[181] = (byte)((kv.iw & 0xff00) >>> 8);
        abyte1[182] = (byte)((kv.iw & 0xff0000) >>> 16);
        abyte1[183] = (byte)((kv.iw & 0xff000000) >>> 24);
        abyte1[184] = (byte)(kv.hB & 0xff);
        abyte1[185] = (byte)((kv.hB & 0xff00) >>> 8);
        abyte1[186] = (byte)((kv.hB & 0xff0000) >>> 16);
        abyte1[187] = (byte)((kv.hB & 0xff000000) >>> 24);
        abyte1[188] = (byte)(kv.hY & 0xff);
        abyte1[189] = (byte)((kv.hY & 0xff00) >>> 8);
        abyte1[190] = (byte)((kv.hY & 0xff0000) >>> 16);
        abyte1[191] = (byte)((kv.hY & 0xff000000) >>> 24);
        abyte1[192] = (byte)(kv.gR & 0xff);
        abyte1[193] = (byte)((kv.gR & 0xff00) >>> 8);
        abyte1[194] = (byte)((kv.gR & 0xff0000) >>> 16);
        abyte1[195] = (byte)((kv.gR & 0xff000000) >>> 24);
        abyte1[196] = (byte)(kv.iq & 0xff);
        abyte1[197] = (byte)((kv.iq & 0xff00) >>> 8);
        abyte1[198] = (byte)((kv.iq & 0xff0000) >>> 16);
        abyte1[199] = (byte)((kv.iq & 0xff000000) >>> 24);
        abyte1[200] = (byte)(kv.hF & 0xff);
        abyte1[201] = (byte)((kv.hF & 0xff00) >>> 8);
        abyte1[202] = (byte)((kv.hF & 0xff0000) >>> 16);
        abyte1[203] = (byte)((kv.hF & 0xff000000) >>> 24);
        abyte1[204] = (byte)(kv.ik & 0xff);
        abyte1[205] = (byte)((kv.ik & 0xff00) >>> 8);
        abyte1[206] = (byte)((kv.ik & 0xff0000) >>> 16);
        abyte1[207] = (byte)((kv.ik & 0xff000000) >>> 24);
        abyte1[208] = (byte)(kv.hH & 0xff);
        abyte1[209] = (byte)((kv.hH & 0xff00) >>> 8);
        abyte1[210] = (byte)((kv.hH & 0xff0000) >>> 16);
        abyte1[211] = (byte)((kv.hH & 0xff000000) >>> 24);
        abyte1[212] = (byte)(kv.iL & 0xff);
        abyte1[213] = (byte)((kv.iL & 0xff00) >>> 8);
        abyte1[214] = (byte)((kv.iL & 0xff0000) >>> 16);
        abyte1[215] = (byte)((kv.iL & 0xff000000) >>> 24);
        abyte1[216] = (byte)(kv.hJ & 0xff);
        abyte1[217] = (byte)((kv.hJ & 0xff00) >>> 8);
        abyte1[218] = (byte)((kv.hJ & 0xff0000) >>> 16);
        abyte1[219] = (byte)((kv.hJ & 0xff000000) >>> 24);
        abyte1[220] = (byte)(kv.hy & 0xff);
        abyte1[221] = (byte)((kv.hy & 0xff00) >>> 8);
        abyte1[222] = (byte)((kv.hy & 0xff0000) >>> 16);
        abyte1[223] = (byte)((kv.hy & 0xff000000) >>> 24);
        abyte1[224] = (byte)(kv.jM & 0xff);
        abyte1[225] = (byte)((kv.jM & 0xff00) >>> 8);
        abyte1[226] = (byte)((kv.jM & 0xff0000) >>> 16);
        abyte1[227] = (byte)((kv.jM & 0xff000000) >>> 24);
        abyte1[228] = (byte)(kv.jm & 0xff);
        abyte1[229] = (byte)((kv.jm & 0xff00) >>> 8);
        abyte1[230] = (byte)((kv.jm & 0xff0000) >>> 16);
        abyte1[231] = (byte)((kv.jm & 0xff000000) >>> 24);
        abyte1[232] = (byte)(kv.iY & 0xff);
        abyte1[233] = (byte)((kv.iY & 0xff00) >>> 8);
        abyte1[234] = (byte)((kv.iY & 0xff0000) >>> 16);
        abyte1[235] = (byte)((kv.iY & 0xff000000) >>> 24);
        abyte1[236] = (byte)(kv.jZ & 0xff);
        abyte1[237] = (byte)((kv.jZ & 0xff00) >>> 8);
        abyte1[238] = (byte)((kv.jZ & 0xff0000) >>> 16);
        abyte1[239] = (byte)((kv.jZ & 0xff000000) >>> 24);
        abyte1[240] = (byte)(kv.jI & 0xff);
        abyte1[241] = (byte)((kv.jI & 0xff00) >>> 8);
        abyte1[242] = (byte)((kv.jI & 0xff0000) >>> 16);
        abyte1[243] = (byte)((kv.jI & 0xff000000) >>> 24);
        abyte1[244] = (byte)(kv.il & 0xff);
        abyte1[245] = (byte)((kv.il & 0xff00) >>> 8);
        abyte1[246] = (byte)((kv.il & 0xff0000) >>> 16);
        abyte1[247] = (byte)((kv.il & 0xff000000) >>> 24);
        abyte1[248] = (byte)(kv.hR & 0xff);
        abyte1[249] = (byte)((kv.hR & 0xff00) >>> 8);
        abyte1[250] = (byte)((kv.hR & 0xff0000) >>> 16);
        abyte1[251] = (byte)((kv.hR & 0xff000000) >>> 24);
        abyte1[252] = (byte)(kv.ir & 0xff);
        abyte1[253] = (byte)((kv.ir & 0xff00) >>> 8);
        abyte1[254] = (byte)((kv.ir & 0xff0000) >>> 16);
        abyte1[255] = (byte)((kv.ir & 0xff000000) >>> 24);
    }

    private (f f1)
    {
        kv = f1;
        super();
    }

    kv(f f1, kv kv1)
    {
        this(f1);
    }
}
