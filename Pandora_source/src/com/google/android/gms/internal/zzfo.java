// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            zzfk, zzfv

public class zzfo
{
    public static interface zza
    {

        public abstract Object zzb(InputStream inputstream);

        public abstract Object zzem();
    }


    public static final zza zzCB = new zza() {

        public Void a()
        {
            return null;
        }

        public Void a(InputStream inputstream)
        {
            return null;
        }

        public Object zzb(InputStream inputstream)
        {
            return a(inputstream);
        }

        public Object zzem()
        {
            return a();
        }

    };

    public zzfo()
    {
    }

    public zzfv zza(String s, zza zza1)
    {
        return zzfk.zza(new Callable(s, zza1) {

            final String a;
            final zza b;
            final zzfo c;

            public Object call()
            {
                Object obj;
                HttpURLConnection httpurlconnection;
                Object obj2;
                obj2 = null;
                obj = null;
                httpurlconnection = null;
                HttpURLConnection httpurlconnection1 = c.zzah(a);
                httpurlconnection = httpurlconnection1;
                obj2 = httpurlconnection1;
                obj = httpurlconnection1;
                httpurlconnection1.connect();
                httpurlconnection = httpurlconnection1;
                obj2 = httpurlconnection1;
                obj = httpurlconnection1;
                int i = httpurlconnection1.getResponseCode();
                if (i < 200 || i > 299)
                {
                    break MISSING_BLOCK_LABEL_103;
                }
                httpurlconnection = httpurlconnection1;
                obj2 = httpurlconnection1;
                obj = httpurlconnection1;
                Object obj3 = b.zzb(httpurlconnection1.getInputStream());
                if (httpurlconnection1 != null)
                {
                    httpurlconnection1.disconnect();
                }
                return obj3;
                if (httpurlconnection1 != null)
                {
                    httpurlconnection1.disconnect();
                }
_L2:
                return b.zzem();
                obj2;
                obj = httpurlconnection;
                zzb.zzd("Error making HTTP request.", ((Throwable) (obj2)));
                if (httpurlconnection != null)
                {
                    httpurlconnection.disconnect();
                }
                continue; /* Loop/switch isn't completed */
                Object obj1;
                obj1;
                obj = obj2;
                zzb.zzd("Error making HTTP request.", ((Throwable) (obj1)));
                if (obj2 != null)
                {
                    ((HttpURLConnection) (obj2)).disconnect();
                }
                if (true) goto _L2; else goto _L1
_L1:
                obj1;
                if (obj != null)
                {
                    ((HttpURLConnection) (obj)).disconnect();
                }
                throw obj1;
            }

            
            {
                c = zzfo.this;
                a = s;
                b = zza1;
                super();
            }
        });
    }

    protected HttpURLConnection zzah(String s)
        throws MalformedURLException, IOException
    {
        return (HttpURLConnection)(new URL(s)).openConnection();
    }

}
