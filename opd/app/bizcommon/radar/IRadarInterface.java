package com.bilibili.opd.app.bizcommon.radar;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bilibili.opd.app.bizcommon.radar.data.RadarReportEvent;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerEvent;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/IRadarInterface.class */
public interface IRadarInterface extends IInterface {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/IRadarInterface$a.class */
    public static abstract class a extends Binder implements IRadarInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f74161a = 0;

        /* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.radar.IRadarInterface$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/IRadarInterface$a$a.class */
        public static final class C0470a implements IRadarInterface {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f74162a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f74162a;
            }

            @Override // com.bilibili.opd.app.bizcommon.radar.IRadarInterface
            public final void emit(RadarReportEvent radarReportEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bilibili.opd.app.bizcommon.radar.IRadarInterface");
                    if (radarReportEvent != null) {
                        parcelObtain.writeInt(1);
                        radarReportEvent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f74162a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bilibili.opd.app.bizcommon.radar.IRadarInterface
            public final void trigger(RadarTriggerEvent radarTriggerEvent) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bilibili.opd.app.bizcommon.radar.IRadarInterface");
                    if (radarTriggerEvent != null) {
                        parcelObtain.writeInt(1);
                        radarTriggerEvent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f74162a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.bilibili.opd.app.bizcommon.radar.IRadarInterface");
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface("com.bilibili.opd.app.bizcommon.radar.IRadarInterface");
            }
            if (i7 == 1598968902) {
                parcel2.writeString("com.bilibili.opd.app.bizcommon.radar.IRadarInterface");
                return true;
            }
            Object objCreateFromParcel = null;
            if (i7 == 1) {
                RadarReportEvent.a aVar = RadarReportEvent.CREATOR;
                Object objCreateFromParcel2 = null;
                if (parcel.readInt() != 0) {
                    objCreateFromParcel2 = aVar.createFromParcel(parcel);
                }
                emit((RadarReportEvent) objCreateFromParcel2);
                parcel2.writeNoException();
                return true;
            }
            if (i7 != 2) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            RadarTriggerEvent.a aVar2 = RadarTriggerEvent.CREATOR;
            if (parcel.readInt() != 0) {
                objCreateFromParcel = aVar2.createFromParcel(parcel);
            }
            trigger((RadarTriggerEvent) objCreateFromParcel);
            parcel2.writeNoException();
            return true;
        }
    }

    void emit(RadarReportEvent radarReportEvent) throws RemoteException;

    void trigger(RadarTriggerEvent radarTriggerEvent) throws RemoteException;
}
