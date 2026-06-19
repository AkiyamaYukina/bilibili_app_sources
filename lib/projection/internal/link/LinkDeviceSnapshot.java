package com.bilibili.lib.projection.internal.link;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.lib.projection.internal.device.DeviceSnapshot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/link/LinkDeviceSnapshot.class */
public final class LinkDeviceSnapshot implements DeviceSnapshot {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f63209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f63210c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/link/LinkDeviceSnapshot$a.class */
    public static final class a implements Parcelable.Creator<LinkDeviceSnapshot> {
        @Override // android.os.Parcelable.Creator
        public final LinkDeviceSnapshot createFromParcel(Parcel parcel) {
            return new LinkDeviceSnapshot(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LinkDeviceSnapshot[] newArray(int i7) {
            return new LinkDeviceSnapshot[i7];
        }
    }

    public LinkDeviceSnapshot(int i7, @NotNull String str, @NotNull String str2) {
        this.f63208a = i7;
        this.f63209b = str;
        this.f63210c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.bilibili.lib.projection.internal.device.DeviceSnapshot
    public final int e() {
        return this.f63208a;
    }

    @Override // com.bilibili.lib.projection.internal.device.DeviceSnapshot
    @NotNull
    public final String getUuid() {
        return this.f63209b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.f63208a);
        parcel.writeString(this.f63209b);
        parcel.writeString(this.f63210c);
    }
}
