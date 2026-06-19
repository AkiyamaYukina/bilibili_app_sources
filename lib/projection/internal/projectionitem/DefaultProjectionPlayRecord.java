package com.bilibili.lib.projection.internal.projectionitem;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.lib.projection.internal.device.DeviceSnapshot;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.ProjectionPlayRecord;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/DefaultProjectionPlayRecord.class */
public final class DefaultProjectionPlayRecord implements ProjectionPlayRecord {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeviceSnapshot f63466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IProjectionPlayableItem f63467b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/DefaultProjectionPlayRecord$a.class */
    public static final class a implements Parcelable.Creator<DefaultProjectionPlayRecord> {
        @Override // android.os.Parcelable.Creator
        public final DefaultProjectionPlayRecord createFromParcel(Parcel parcel) {
            return new DefaultProjectionPlayRecord((DeviceSnapshot) parcel.readParcelable(DeviceSnapshot.class.getClassLoader()), (IProjectionPlayableItem) parcel.readParcelable(IProjectionPlayableItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DefaultProjectionPlayRecord[] newArray(int i7) {
            return new DefaultProjectionPlayRecord[i7];
        }
    }

    public DefaultProjectionPlayRecord(@NotNull DeviceSnapshot deviceSnapshot, @NotNull IProjectionPlayableItem iProjectionPlayableItem) {
        this.f63466a = deviceSnapshot;
        this.f63467b = iProjectionPlayableItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultProjectionPlayRecord)) {
            return false;
        }
        DefaultProjectionPlayRecord defaultProjectionPlayRecord = (DefaultProjectionPlayRecord) obj;
        return Intrinsics.areEqual(this.f63466a, defaultProjectionPlayRecord.f63466a) && Intrinsics.areEqual(this.f63467b, defaultProjectionPlayRecord.f63467b);
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.ProjectionPlayRecord
    @NotNull
    public final IProjectionPlayableItem f() {
        return this.f63467b;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.ProjectionPlayRecord
    @NotNull
    public final DeviceSnapshot getDevice() {
        return this.f63466a;
    }

    public final int hashCode() {
        return this.f63467b.hashCode() + (this.f63466a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "DefaultProjectionPlayRecord(device=" + this.f63466a + ", playableItem=" + this.f63467b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeParcelable(this.f63466a, i7);
        parcel.writeParcelable(this.f63467b, i7);
    }
}
