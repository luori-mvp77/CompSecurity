// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class com.google.android.gms.common.internal.safeparcel.zza
{
    public static class zza extends RuntimeException
    {

        public zza(String s, Parcel parcel)
        {
            super((new StringBuilder()).append(s).append(" Parcel: pos=").append(parcel.dataPosition()).append(" size=").append(parcel.dataSize()).toString());
        }
    }


    public static ArrayList zzB(Parcel parcel, int i)
    {
        int j = zza(parcel, i);
        int k = parcel.dataPosition();
        if (j == 0)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        int l = parcel.readInt();
        for (i = 0; i < l; i++)
        {
            arraylist.add(Integer.valueOf(parcel.readInt()));
        }

        parcel.setDataPosition(k + j);
        return arraylist;
    }

    public static ArrayList zzC(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            ArrayList arraylist = parcel.createStringArrayList();
            parcel.setDataPosition(i + j);
            return arraylist;
        }
    }

    public static int zzI(Parcel parcel)
    {
        return parcel.readInt();
    }

    public static int zzJ(Parcel parcel)
    {
        int j = zzI(parcel);
        int k = zza(parcel, j);
        int i = parcel.dataPosition();
        if (zzaP(j) != 20293)
        {
            throw new zza((new StringBuilder("Expected object header. Got 0x")).append(Integer.toHexString(j)).toString(), parcel);
        }
        j = i + k;
        if (j < i || j > parcel.dataSize())
        {
            throw new zza((new StringBuilder("Size read is invalid start=")).append(i).append(" end=").append(j).toString(), parcel);
        } else
        {
            return j;
        }
    }

    public static int zza(Parcel parcel, int i)
    {
        if ((i & 0xffff0000) != 0xffff0000)
        {
            return i >> 16 & 0xffff;
        } else
        {
            return parcel.readInt();
        }
    }

    public static Parcelable zza(Parcel parcel, int i, android.os.Parcelable.Creator creator)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            creator = (Parcelable)creator.createFromParcel(parcel);
            parcel.setDataPosition(i + j);
            return creator;
        }
    }

    private static void zza(Parcel parcel, int i, int j)
    {
        i = zza(parcel, i);
        if (i != j)
        {
            throw new zza((new StringBuilder("Expected size ")).append(j).append(" got ").append(i).append(" (0x").append(Integer.toHexString(i)).append(")").toString(), parcel);
        } else
        {
            return;
        }
    }

    private static void zza(Parcel parcel, int i, int j, int k)
    {
        if (j != k)
        {
            throw new zza((new StringBuilder("Expected size ")).append(k).append(" got ").append(j).append(" (0x").append(Integer.toHexString(j)).append(")").toString(), parcel);
        } else
        {
            return;
        }
    }

    public static int zzaP(int i)
    {
        return 0xffff & i;
    }

    public static void zzb(Parcel parcel, int i)
    {
        parcel.setDataPosition(zza(parcel, i) + parcel.dataPosition());
    }

    public static Object[] zzb(Parcel parcel, int i, android.os.Parcelable.Creator creator)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            creator = ((android.os.Parcelable.Creator) (parcel.createTypedArray(creator)));
            parcel.setDataPosition(i + j);
            return creator;
        }
    }

    public static ArrayList zzc(Parcel parcel, int i, android.os.Parcelable.Creator creator)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            creator = parcel.createTypedArrayList(creator);
            parcel.setDataPosition(i + j);
            return creator;
        }
    }

    public static boolean zzc(Parcel parcel, int i)
    {
        zza(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte zze(Parcel parcel, int i)
    {
        zza(parcel, i, 4);
        return (byte)parcel.readInt();
    }

    public static short zzf(Parcel parcel, int i)
    {
        zza(parcel, i, 4);
        return (short)parcel.readInt();
    }

    public static int zzg(Parcel parcel, int i)
    {
        zza(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer zzh(Parcel parcel, int i)
    {
        int j = zza(parcel, i);
        if (j == 0)
        {
            return null;
        } else
        {
            zza(parcel, i, j, 4);
            return Integer.valueOf(parcel.readInt());
        }
    }

    public static long zzi(Parcel parcel, int i)
    {
        zza(parcel, i, 8);
        return parcel.readLong();
    }

    public static float zzl(Parcel parcel, int i)
    {
        zza(parcel, i, 4);
        return parcel.readFloat();
    }

    public static double zzm(Parcel parcel, int i)
    {
        zza(parcel, i, 8);
        return parcel.readDouble();
    }

    public static String zzo(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            String s = parcel.readString();
            parcel.setDataPosition(i + j);
            return s;
        }
    }

    public static IBinder zzp(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            IBinder ibinder = parcel.readStrongBinder();
            parcel.setDataPosition(i + j);
            return ibinder;
        }
    }

    public static Bundle zzq(Parcel parcel, int i)
    {
        i = zza(parcel, i);
        int j = parcel.dataPosition();
        if (i == 0)
        {
            return null;
        } else
        {
            Bundle bundle = parcel.readBundle();
            parcel.setDataPosition(i + j);
            return bundle;
        }
    }
}
