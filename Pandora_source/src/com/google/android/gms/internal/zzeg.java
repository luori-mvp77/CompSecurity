// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;

// Referenced classes of package com.google.android.gms.internal:
//            zzeb, zzfl, zzgd, zzge

public class zzeg extends zzeb
{

    zzeg(Context context, zzfa.zza zza, zzgd zzgd, zzef.zza zza1)
    {
        super(context, zza, zzgd, zza1);
    }

    protected void zzeg()
    {
    }

    protected void zzg(long l)
        throws zzee.zza
    {
        zzfl.zzCr.post(new Runnable() {

            final zzeg a;

            public void run()
            {
label0:
                {
                    synchronized (a.zzoe)
                    {
                        if (a.zzyi.errorCode == -2)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                a.zznp.zzft().zza(a);
                a.zzeg();
                zzb.zzam("Loading HTML in WebView.");
                a.zznp.loadDataWithBaseURL(zzh.zzaQ().zzad(a.zzyi.zzwB), a.zzyi.zzzr, "text/html", "UTF-8", null);
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = zzeg.this;
                super();
            }
        });
        zzf(l);
    }
}
