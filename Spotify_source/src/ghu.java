// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.spotify.mobile.android.util.logging.LogLevel;
import java.util.EnumSet;

public final class ghu
    implements ght
{

    private static final gia a = new gia() {

        public final void a(String s, String s1)
        {
            Log.v("Spotify", ghu.a(s, s1));
        }

        public final void a(String s, String s1, Throwable throwable)
        {
            Log.v("Spotify", ghu.a(s, s1), throwable);
        }

    };
    private static final gia b = new gia() {

        public final void a(String s, String s1)
        {
            Log.i("Spotify", ghu.a(s, s1));
        }

        public final void a(String s, String s1, Throwable throwable)
        {
            Log.i("Spotify", ghu.a(s, s1), throwable);
        }

    };
    private static final gia c = new gia() {

        public final void a(String s, String s1)
        {
            Log.w("Spotify", ghu.a(s, s1));
        }

        public final void a(String s, String s1, Throwable throwable)
        {
            Log.w("Spotify", ghu.a(s, s1), throwable);
        }

    };
    private static final gia d = new gia() {

        public final void a(String s, String s1)
        {
            Log.e("Spotify", ghu.a(s, s1));
        }

        public final void a(String s, String s1, Throwable throwable)
        {
            Log.e("Spotify", ghu.a(s, s1), throwable);
        }

    };
    private final gia e;
    private final gia f;
    private final gia g;
    private final gia h;

    public ghu(EnumSet enumset)
    {
        gia gia1;
        if (enumset.contains(LogLevel.a))
        {
            gia1 = a;
        } else
        {
            gia1 = gia.a;
        }
        e = gia1;
        if (!enumset.contains(LogLevel.b))
        {
            gia1 = gia.a;
        }
        if (enumset.contains(LogLevel.c))
        {
            gia1 = b;
        } else
        {
            gia1 = gia.a;
        }
        f = gia1;
        if (enumset.contains(LogLevel.d))
        {
            gia1 = c;
        } else
        {
            gia1 = gia.a;
        }
        g = gia1;
        if (enumset.contains(LogLevel.e))
        {
            gia1 = d;
        } else
        {
            gia1 = gia.a;
        }
        h = gia1;
        if (!enumset.contains(LogLevel.f))
        {
            enumset = gia.a;
        }
    }

    static String a(String s, String s1)
    {
        return (new StringBuilder("[")).append(s).append("] ").append(s1).toString();
    }

    public final gia a()
    {
        return e;
    }

    public final gia b()
    {
        return f;
    }

    public final gia c()
    {
        return g;
    }

    public final gia d()
    {
        return h;
    }

    static 
    {
        new gia() {

            public final void a(String s, String s1)
            {
                Log.d("Spotify", ghu.a(s, s1));
            }

            public final void a(String s, String s1, Throwable throwable)
            {
                Log.d("Spotify", ghu.a(s, s1), throwable);
            }

        };
        new gia() {

            public final void a(String s, String s1)
            {
                Log.e("YELL", ghu.a(s, s1));
            }

            public final void a(String s, String s1, Throwable throwable)
            {
                Log.e("YELL", ghu.a(s, s1), throwable);
            }

        };
    }
}
