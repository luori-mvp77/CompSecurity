// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.aa;
import com.google.android.gms.fitness.request.ad;
import com.google.android.gms.fitness.request.af;
import com.google.android.gms.fitness.request.ah;
import com.google.android.gms.fitness.request.aj;
import com.google.android.gms.fitness.request.b;
import com.google.android.gms.fitness.request.e;
import com.google.android.gms.fitness.request.j;
import com.google.android.gms.fitness.request.m;
import com.google.android.gms.fitness.request.o;
import com.google.android.gms.fitness.request.q;
import com.google.android.gms.fitness.request.u;
import com.google.android.gms.fitness.request.w;
import com.google.android.gms.fitness.request.y;

// Referenced classes of package com.google.android.gms.internal:
//            kt, km, kn, ko, 
//            kr, kq, ks, lf

public interface kp
    extends IInterface
{
    public static abstract class a extends Binder
        implements kp
    {

        public static kp as(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (iinterface != null && (iinterface instanceof kp))
            {
                return (kp)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int k)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (DataSourcesRequest)DataSourcesRequest.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kn.a.aq(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj1;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (o)o.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj2;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (q)q.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj3;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (af)af.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj4;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (aj)aj.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj5;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (m)m.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kq.a.at(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj6;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (e)e.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                DataDeleteRequest datadeleterequest = obj7;
                if (parcel.readInt() != 0)
                {
                    datadeleterequest = (DataDeleteRequest)DataDeleteRequest.CREATOR.createFromParcel(parcel);
                }
                a(datadeleterequest, kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj8;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (DataTypeCreateRequest)DataTypeCreateRequest.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, ko.a.ar(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj9;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (j)j.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, ko.a.ar(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj10;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (DataReadRequest)DataReadRequest.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, km.a.ap(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj11;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (SessionInsertRequest)SessionInsertRequest.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj12;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (SessionReadRequest)SessionReadRequest.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kr.a.au(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj13;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (w)w.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj14;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (y)y.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, ks.a.av(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj15;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (StartBleScanRequest)StartBleScanRequest.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj16;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (ad)ad.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj17;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (b)b.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj18;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (ah)ah.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj19;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (u)u.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                parcel1 = obj20;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (aa)aa.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                a(kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                b(kt.a.aw(parcel.readStrongBinder()), parcel.readString());
                return true;

            case 24: // '\030'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.IGoogleFitnessService");
                a(lf.a.ax(parcel.readStrongBinder()), parcel.readString());
                return true;
            }
        }
    }

    private static class a.a
        implements kp
    {

        private IBinder lb;

        public void a(DataDeleteRequest datadeleterequest, kt kt1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (datadeleterequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            datadeleterequest.writeToParcel(parcel, 0);
_L3:
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            datadeleterequest = kt1.asBinder();
_L4:
            parcel.writeStrongBinder(datadeleterequest);
            parcel.writeString(s);
            lb.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            datadeleterequest;
            parcel1.recycle();
            parcel.recycle();
            throw datadeleterequest;
            datadeleterequest = null;
              goto _L4
        }

        public void a(DataReadRequest datareadrequest, km km1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (datareadrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            datareadrequest.writeToParcel(parcel, 0);
_L4:
            datareadrequest = obj;
            if (km1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            datareadrequest = km1.asBinder();
            parcel.writeStrongBinder(datareadrequest);
            parcel.writeString(s);
            lb.transact(8, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            datareadrequest;
            parcel.recycle();
            throw datareadrequest;
        }

        public void a(DataSourcesRequest datasourcesrequest, kn kn1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (datasourcesrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            datasourcesrequest.writeToParcel(parcel, 0);
_L4:
            datasourcesrequest = obj;
            if (kn1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            datasourcesrequest = kn1.asBinder();
            parcel.writeStrongBinder(datasourcesrequest);
            parcel.writeString(s);
            lb.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            datasourcesrequest;
            parcel.recycle();
            throw datasourcesrequest;
        }

        public void a(DataTypeCreateRequest datatypecreaterequest, ko ko1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (datatypecreaterequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            datatypecreaterequest.writeToParcel(parcel, 0);
_L4:
            datatypecreaterequest = obj;
            if (ko1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            datatypecreaterequest = ko1.asBinder();
            parcel.writeStrongBinder(datatypecreaterequest);
            parcel.writeString(s);
            lb.transact(13, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            datatypecreaterequest;
            parcel.recycle();
            throw datatypecreaterequest;
        }

        public void a(SessionInsertRequest sessioninsertrequest, kt kt1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (sessioninsertrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            sessioninsertrequest.writeToParcel(parcel, 0);
_L4:
            sessioninsertrequest = obj;
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            sessioninsertrequest = kt1.asBinder();
            parcel.writeStrongBinder(sessioninsertrequest);
            parcel.writeString(s);
            lb.transact(9, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            sessioninsertrequest;
            parcel.recycle();
            throw sessioninsertrequest;
        }

        public void a(SessionReadRequest sessionreadrequest, kr kr1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (sessionreadrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            sessionreadrequest.writeToParcel(parcel, 0);
_L4:
            sessionreadrequest = obj;
            if (kr1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            sessionreadrequest = kr1.asBinder();
            parcel.writeStrongBinder(sessionreadrequest);
            parcel.writeString(s);
            lb.transact(10, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            sessionreadrequest;
            parcel.recycle();
            throw sessionreadrequest;
        }

        public void a(StartBleScanRequest startblescanrequest, kt kt1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (startblescanrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            startblescanrequest.writeToParcel(parcel, 0);
_L4:
            startblescanrequest = obj;
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            startblescanrequest = kt1.asBinder();
            parcel.writeStrongBinder(startblescanrequest);
            parcel.writeString(s);
            lb.transact(15, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            startblescanrequest;
            parcel.recycle();
            throw startblescanrequest;
        }

        public void a(aa aa1, kt kt1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (aa1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            aa1.writeToParcel(parcel, 0);
_L4:
            aa1 = obj;
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            aa1 = kt1.asBinder();
            parcel.writeStrongBinder(aa1);
            parcel.writeString(s);
            lb.transact(21, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            aa1;
            parcel.recycle();
            throw aa1;
        }

        public void a(ad ad1, kt kt1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (ad1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            ad1.writeToParcel(parcel, 0);
_L4:
            ad1 = obj;
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            ad1 = kt1.asBinder();
            parcel.writeStrongBinder(ad1);
            parcel.writeString(s);
            lb.transact(16, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            ad1;
            parcel.recycle();
            throw ad1;
        }

        public void a(af af1, kt kt1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (af1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            af1.writeToParcel(parcel, 0);
_L4:
            af1 = obj;
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            af1 = kt1.asBinder();
            parcel.writeStrongBinder(af1);
            parcel.writeString(s);
            lb.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            af1;
            parcel.recycle();
            throw af1;
        }

        public void a(ah ah1, kt kt1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (ah1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            ah1.writeToParcel(parcel, 0);
_L4:
            ah1 = obj;
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            ah1 = kt1.asBinder();
            parcel.writeStrongBinder(ah1);
            parcel.writeString(s);
            lb.transact(18, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            ah1;
            parcel.recycle();
            throw ah1;
        }

        public void a(aj aj1, kt kt1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (aj1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            aj1.writeToParcel(parcel, 0);
_L4:
            aj1 = obj;
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            aj1 = kt1.asBinder();
            parcel.writeStrongBinder(aj1);
            parcel.writeString(s);
            lb.transact(5, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            aj1;
            parcel.recycle();
            throw aj1;
        }

        public void a(b b1, kt kt1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (b1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            b1.writeToParcel(parcel, 0);
_L4:
            b1 = obj;
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            b1 = kt1.asBinder();
            parcel.writeStrongBinder(b1);
            parcel.writeString(s);
            lb.transact(17, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            b1;
            parcel.recycle();
            throw b1;
        }

        public void a(e e1, kt kt1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (e1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            e1.writeToParcel(parcel, 0);
_L4:
            e1 = obj;
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            e1 = kt1.asBinder();
            parcel.writeStrongBinder(e1);
            parcel.writeString(s);
            lb.transact(7, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            e1;
            parcel.recycle();
            throw e1;
        }

        public void a(j j1, ko ko1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (j1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            j1.writeToParcel(parcel, 0);
_L4:
            j1 = obj;
            if (ko1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            j1 = ko1.asBinder();
            parcel.writeStrongBinder(j1);
            parcel.writeString(s);
            lb.transact(14, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            j1;
            parcel.recycle();
            throw j1;
        }

        public void a(m m1, kq kq1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (m1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            m1.writeToParcel(parcel, 0);
_L4:
            m1 = obj;
            if (kq1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            m1 = kq1.asBinder();
            parcel.writeStrongBinder(m1);
            parcel.writeString(s);
            lb.transact(6, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            m1;
            parcel.recycle();
            throw m1;
        }

        public void a(o o1, kt kt1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (o1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            o1.writeToParcel(parcel, 0);
_L4:
            o1 = obj;
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            o1 = kt1.asBinder();
            parcel.writeStrongBinder(o1);
            parcel.writeString(s);
            lb.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            o1;
            parcel.recycle();
            throw o1;
        }

        public void a(q q1, kt kt1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (q1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            q1.writeToParcel(parcel, 0);
_L4:
            q1 = obj;
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            q1 = kt1.asBinder();
            parcel.writeStrongBinder(q1);
            parcel.writeString(s);
            lb.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            q1;
            parcel.recycle();
            throw q1;
        }

        public void a(u u1, kt kt1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (u1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            u1.writeToParcel(parcel, 0);
_L4:
            u1 = obj;
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            u1 = kt1.asBinder();
            parcel.writeStrongBinder(u1);
            parcel.writeString(s);
            lb.transact(20, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            u1;
            parcel.recycle();
            throw u1;
        }

        public void a(w w1, kt kt1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            w1.writeToParcel(parcel, 0);
_L4:
            w1 = obj;
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            w1 = kt1.asBinder();
            parcel.writeStrongBinder(w1);
            parcel.writeString(s);
            lb.transact(11, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            w1;
            parcel.recycle();
            throw w1;
        }

        public void a(y y1, ks ks1, String s)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            obj = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (y1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            y1.writeToParcel(parcel, 0);
_L4:
            y1 = obj;
            if (ks1 == null)
            {
                break MISSING_BLOCK_LABEL_46;
            }
            y1 = ks1.asBinder();
            parcel.writeStrongBinder(y1);
            parcel.writeString(s);
            lb.transact(12, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
            if (true) goto _L4; else goto _L3
_L3:
            y1;
            parcel.recycle();
            throw y1;
        }

        public void a(kt kt1, String s)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_25;
            }
            ibinder = kt1.asBinder();
            parcel.writeStrongBinder(ibinder);
            parcel.writeString(s);
            lb.transact(22, parcel, null, 1);
            parcel.recycle();
            return;
            kt1;
            parcel.recycle();
            throw kt1;
        }

        public void a(lf lf1, String s)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (lf1 == null)
            {
                break MISSING_BLOCK_LABEL_25;
            }
            ibinder = lf1.asBinder();
            parcel.writeStrongBinder(ibinder);
            parcel.writeString(s);
            lb.transact(24, parcel, null, 1);
            parcel.recycle();
            return;
            lf1;
            parcel.recycle();
            throw lf1;
        }

        public IBinder asBinder()
        {
            return lb;
        }

        public void b(kt kt1, String s)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IGoogleFitnessService");
            if (kt1 == null)
            {
                break MISSING_BLOCK_LABEL_25;
            }
            ibinder = kt1.asBinder();
            parcel.writeStrongBinder(ibinder);
            parcel.writeString(s);
            lb.transact(23, parcel, null, 1);
            parcel.recycle();
            return;
            kt1;
            parcel.recycle();
            throw kt1;
        }

        a.a(IBinder ibinder)
        {
            lb = ibinder;
        }
    }


    public abstract void a(DataDeleteRequest datadeleterequest, kt kt, String s)
        throws RemoteException;

    public abstract void a(DataReadRequest datareadrequest, km km, String s)
        throws RemoteException;

    public abstract void a(DataSourcesRequest datasourcesrequest, kn kn, String s)
        throws RemoteException;

    public abstract void a(DataTypeCreateRequest datatypecreaterequest, ko ko, String s)
        throws RemoteException;

    public abstract void a(SessionInsertRequest sessioninsertrequest, kt kt, String s)
        throws RemoteException;

    public abstract void a(SessionReadRequest sessionreadrequest, kr kr, String s)
        throws RemoteException;

    public abstract void a(StartBleScanRequest startblescanrequest, kt kt, String s)
        throws RemoteException;

    public abstract void a(aa aa, kt kt, String s)
        throws RemoteException;

    public abstract void a(ad ad, kt kt, String s)
        throws RemoteException;

    public abstract void a(af af, kt kt, String s)
        throws RemoteException;

    public abstract void a(ah ah, kt kt, String s)
        throws RemoteException;

    public abstract void a(aj aj, kt kt, String s)
        throws RemoteException;

    public abstract void a(b b1, kt kt, String s)
        throws RemoteException;

    public abstract void a(e e, kt kt, String s)
        throws RemoteException;

    public abstract void a(j j, ko ko, String s)
        throws RemoteException;

    public abstract void a(m m, kq kq, String s)
        throws RemoteException;

    public abstract void a(o o, kt kt, String s)
        throws RemoteException;

    public abstract void a(q q, kt kt, String s)
        throws RemoteException;

    public abstract void a(u u, kt kt, String s)
        throws RemoteException;

    public abstract void a(w w, kt kt, String s)
        throws RemoteException;

    public abstract void a(y y, ks ks, String s)
        throws RemoteException;

    public abstract void a(kt kt, String s)
        throws RemoteException;

    public abstract void a(lf lf, String s)
        throws RemoteException;

    public abstract void b(kt kt, String s)
        throws RemoteException;
}
