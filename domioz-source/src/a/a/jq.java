// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package a.a:
//            jr

public final class jq
{

    public static void a(Closeable closeable)
    {
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            return;
        }
    }

    private static boolean a(jr jr1, int i, int j)
    {
        return jr1 != null && !jr1.a(i, j) && (i * 100) / j < 75;
    }

    public static boolean a(InputStream inputstream, OutputStream outputstream, jr jr1)
    {
        int k = inputstream.available();
        byte abyte0[] = new byte[32768];
        if (a(jr1, 0, k))
        {
            return false;
        }
        int i = 0;
        do
        {
            int j = inputstream.read(abyte0, 0, 32768);
            if (j != -1)
            {
                outputstream.write(abyte0, 0, j);
                j = i + j;
                i = j;
                if (a(jr1, j, k))
                {
                    return false;
                }
            } else
            {
                return true;
            }
        } while (true);
    }
}
