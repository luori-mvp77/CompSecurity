// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzdt, zzhr, zzbb, 
//            zzid, zzhl

class zzwZ
    implements zzdg
{

    final zzbb zzwV;
    final zzwZ zzwW;
    final zzhr zzwZ;

    public void zza(zzid zzid, Map map)
    {
        synchronized (zzdt.zzc(zzwW.wU))
        {
            zzb.zzaA("JS Engine is requesting an update");
            if (zzdt.zze(zzwW.wU) == 0)
            {
                zzb.zzaA("Starting reload.");
                zzdt.zza(zzwW.wU, 2);
                zzwW.wU.zzdT();
            }
            zzwV.zzb("/requestReload", (zzdg)zzwZ.get());
        }
        return;
        map;
        zzid;
        JVM INSTR monitorexit ;
        throw map;
    }

    wT(wT wt, zzbb zzbb1, zzhr zzhr1)
    {
        zzwW = wt;
        zzwV = zzbb1;
        zzwZ = zzhr1;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzdt$1

/* anonymous class */
    class zzdt._cls1
        implements Runnable
    {

        final zzdt.zze zzwT;
        final zzdt zzwU;

        public void run()
        {
            zzbb zzbb1 = zzwU.zza(zzdt.zza(zzwU), com.google.android.gms.internal.zzdt.zzb(zzwU));
            zzbb1.zza(new zzdt._cls1._cls1(zzbb1));
            zzbb1.zza("/jsLoaded", new zzdt._cls1._cls2(zzbb1));
            zzhr zzhr1 = new zzhr();
            zzdt._cls1._cls3 _lcls3 = new zzdt._cls1._cls3(this, zzbb1, zzhr1);
            zzhr1.set(_lcls3);
            zzbb1.zza("/requestReload", _lcls3);
            if (zzdt.zzf(zzwU).endsWith(".js"))
            {
                zzbb1.zzr(zzdt.zzf(zzwU));
            } else
            if (zzdt.zzf(zzwU).startsWith("<html>"))
            {
                zzbb1.zzt(zzdt.zzf(zzwU));
            } else
            {
                zzbb1.zzs(zzdt.zzf(zzwU));
            }
            (new Timer()).schedule(new zzdt._cls1._cls4(zzbb1), zzdt.zza.zzxc);
        }

            
            {
                zzwU = zzdt1;
                zzwT = zze;
                super();
            }

        // Unreferenced inner class com/google/android/gms/internal/zzdt$1$1

/* anonymous class */
        class zzdt._cls1._cls1
            implements zzbb.zza
        {

            final zzbb zzwV;
            final zzdt._cls1 zzwW;

            public void zzcf()
            {
                (new Timer()).schedule(new zzdt._cls1._cls1._cls1(this), zzdt.zza.zzxd);
            }

                    
                    {
                        zzwW = zzdt._cls1.this;
                        zzwV = zzbb1;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/zzdt$1$1$1

/* anonymous class */
        class zzdt._cls1._cls1._cls1 extends TimerTask
        {

            final zzdt._cls1._cls1 zzwX;

            public void run()
            {
label0:
                {
                    synchronized (zzdt.zzc(zzwX.zzwW.zzwU))
                    {
                        if (zzwX.zzwW.zzwT.getStatus() != -1 && zzwX.zzwW.zzwT.getStatus() != 1)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                zzwX.zzwW.zzwT.reject();
                zzhl.runOnUiThread(new zzdt._cls1._cls1._cls1._cls1(this));
                zzb.zzaB("Could not receive loaded message in a timely manner. Rejecting.");
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

                    
                    {
                        zzwX = _pcls1;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/zzdt$1$1$1$1

/* anonymous class */
        class zzdt._cls1._cls1._cls1._cls1
            implements Runnable
        {

            final zzdt._cls1._cls1._cls1 zzwY;

            public void run()
            {
                zzwY.zzwX.zzwV.destroy();
            }

                    
                    {
                        zzwY = _pcls1;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/zzdt$1$2

/* anonymous class */
        class zzdt._cls1._cls2
            implements zzdg
        {

            final zzbb zzwV;
            final zzdt._cls1 zzwW;

            public void zza(zzid zzid, Map map)
            {
label0:
                {
                    synchronized (zzdt.zzc(zzwW.zzwU))
                    {
                        if (zzwW.zzwT.getStatus() != -1 && zzwW.zzwT.getStatus() != 1)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                zzdt.zza(zzwW.zzwU, 0);
                zzdt.zzd(zzwW.zzwU).zzc(zzwV);
                zzwW.zzwT.zzg(zzwV);
                zzdt.zza(zzwW.zzwU, zzwW.zzwT);
                zzb.zzaB("Successfully loaded JS Engine.");
                zzid;
                JVM INSTR monitorexit ;
                return;
                map;
                zzid;
                JVM INSTR monitorexit ;
                throw map;
            }

                    
                    {
                        zzwW = zzdt._cls1.this;
                        zzwV = zzbb1;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/zzdt$1$4

/* anonymous class */
        class zzdt._cls1._cls4 extends TimerTask
        {

            final zzbb zzwV;
            final zzdt._cls1 zzwW;

            public void run()
            {
label0:
                {
                    synchronized (zzdt.zzc(zzwW.zzwU))
                    {
                        if (zzwW.zzwT.getStatus() != -1 && zzwW.zzwT.getStatus() != 1)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                zzwW.zzwT.reject();
                zzhl.runOnUiThread(new zzdt._cls1._cls4._cls1(this));
                zzb.zzaB("Could not receive loaded message in a timely manner. Rejecting.");
                obj;
                JVM INSTR monitorexit ;
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

                    
                    {
                        zzwW = zzdt._cls1.this;
                        zzwV = zzbb1;
                        super();
                    }
        }


        // Unreferenced inner class com/google/android/gms/internal/zzdt$1$4$1

/* anonymous class */
        class zzdt._cls1._cls4._cls1
            implements Runnable
        {

            final zzdt._cls1._cls4 zzxa;

            public void run()
            {
                zzxa.zzwV.destroy();
            }

                    
                    {
                        zzxa = _pcls4;
                        super();
                    }
        }

    }

}
