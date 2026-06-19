package com.bilibili.lib.webcommon;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import fb0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/webcommon/StartRecordListener.class */
public interface StartRecordListener extends IInterface {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/webcommon/StartRecordListener$a.class */
    public static abstract class a extends Binder implements StartRecordListener {

        /* JADX INFO: renamed from: com.bilibili.lib.webcommon.StartRecordListener$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/webcommon/StartRecordListener$a$a.class */
        public static final class C0365a implements StartRecordListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f65133a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f65133a;
            }

            @Override // com.bilibili.lib.webcommon.StartRecordListener
            public final void onStateChanged(int i7) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bilibili.lib.webcommon.StartRecordListener");
                    parcelObtain.writeInt(i7);
                    this.f65133a.transact(1, parcelObtain, parcelObtain2, 0);
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

        @Override // android.os.Binder
        public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface("com.bilibili.lib.webcommon.StartRecordListener");
            }
            if (i7 == 1598968902) {
                parcel2.writeString("com.bilibili.lib.webcommon.StartRecordListener");
                return true;
            }
            if (i7 != 1) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            ((b) this).onStateChanged(parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    void onStateChanged(int i7) throws RemoteException;
}
