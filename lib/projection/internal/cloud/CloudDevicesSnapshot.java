package com.bilibili.lib.projection.internal.cloud;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.lib.projection.internal.device.DeviceSnapshot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/cloud/CloudDevicesSnapshot.class */
public final class CloudDevicesSnapshot implements DeviceSnapshot {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f63014b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/cloud/CloudDevicesSnapshot$a.class */
    public static final class a implements Parcelable.Creator<CloudDevicesSnapshot> {
        @Override // android.os.Parcelable.Creator
        public final CloudDevicesSnapshot createFromParcel(Parcel parcel) {
            return new CloudDevicesSnapshot(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CloudDevicesSnapshot[] newArray(int i7) {
            return new CloudDevicesSnapshot[i7];
        }
    }

    public CloudDevicesSnapshot(int i7, @NotNull String str) {
        this.f63013a = i7;
        this.f63014b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.bilibili.lib.projection.internal.device.DeviceSnapshot
    public final int e() {
        return this.f63013a;
    }

    @Override // com.bilibili.lib.projection.internal.device.DeviceSnapshot
    @NotNull
    public final String getUuid() {
        return this.f63014b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f63013a);
        parcel.writeString(this.f63014b);
    }
}
