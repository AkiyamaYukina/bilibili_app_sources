package com.bilibili.lib.webcommon;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bilibili.lib.jsbridge.common.record.recorder.ScreenRecorderService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/webcommon/RecordServiceBinder.class */
public interface RecordServiceBinder extends IInterface {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/webcommon/RecordServiceBinder$a.class */
    public static abstract class a extends Binder implements RecordServiceBinder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f65131a = 0;

        /* JADX INFO: renamed from: com.bilibili.lib.webcommon.RecordServiceBinder$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/webcommon/RecordServiceBinder$a$a.class */
        public static final class C0364a implements RecordServiceBinder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f65132a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f65132a;
            }

            @Override // com.bilibili.lib.webcommon.RecordServiceBinder
            public final void startRecord(Intent intent, StartRecordListener startRecordListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bilibili.lib.webcommon.RecordServiceBinder");
                    if (intent != null) {
                        parcelObtain.writeInt(1);
                        intent.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeStrongInterface(startRecordListener);
                    this.f65132a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bilibili.lib.webcommon.RecordServiceBinder
            public final void stopRecord() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bilibili.lib.webcommon.RecordServiceBinder");
                    this.f65132a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [com.bilibili.lib.webcommon.StartRecordListener] */
        /* JADX WARN: Type inference failed for: r8v2, types: [com.bilibili.lib.webcommon.StartRecordListener$a$a] */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        @Override // android.os.Binder
        public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
            ?? r8;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface("com.bilibili.lib.webcommon.RecordServiceBinder");
            }
            if (i7 == 1598968902) {
                parcel2.writeString("com.bilibili.lib.webcommon.RecordServiceBinder");
                return true;
            }
            if (i7 != 1) {
                if (i7 != 2) {
                    return super.onTransact(i7, parcel, parcel2, i8);
                }
                ((ScreenRecorderService.b) this).stopRecord();
                parcel2.writeNoException();
                return true;
            }
            Intent intent = (Intent) (parcel.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcel) : null);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                r8 = 0;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.bilibili.lib.webcommon.StartRecordListener");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof StartRecordListener)) {
                    ?? obj = new Object();
                    obj.f65133a = strongBinder;
                    r8 = obj;
                } else {
                    r8 = (StartRecordListener) iInterfaceQueryLocalInterface;
                }
            }
            ((ScreenRecorderService.b) this).startRecord(intent, (StartRecordListener) r8);
            parcel2.writeNoException();
            return true;
        }
    }

    void startRecord(Intent intent, StartRecordListener startRecordListener) throws RemoteException;

    void stopRecord() throws RemoteException;
}
