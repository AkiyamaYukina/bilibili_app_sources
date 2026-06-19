package com.bilibili.lib.projection.internal.projectionitem;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.lib.projection.internal.api.model.ProjectionQualityInfo;
import com.bilibili.lib.projection.internal.projectionitem.base.CompatCloudPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/CloudPlayableItemWrapper.class */
public final class CloudPlayableItemWrapper implements CompatCloudPlayableItem {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StandardProjectionItem f63461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f63462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ProjectionQualityInfo f63463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public List<ProjectionQualityInfo> f63464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63465e = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/CloudPlayableItemWrapper$a.class */
    public static final class a implements Parcelable.Creator<CloudPlayableItemWrapper> {
        @Override // android.os.Parcelable.Creator
        public final CloudPlayableItemWrapper createFromParcel(Parcel parcel) {
            CloudPlayableItemWrapper cloudPlayableItemWrapper = new CloudPlayableItemWrapper((StandardProjectionItem) parcel.readParcelable(StandardProjectionItem.class.getClassLoader()), parcel.readByte() != 0);
            cloudPlayableItemWrapper.f63463c = (ProjectionQualityInfo) parcel.readParcelable(ProjectionQualityInfo.class.getClassLoader());
            cloudPlayableItemWrapper.f63464d = parcel.createTypedArrayList(ProjectionQualityInfo.CREATOR);
            return cloudPlayableItemWrapper;
        }

        @Override // android.os.Parcelable.Creator
        public final CloudPlayableItemWrapper[] newArray(int i7) {
            return new CloudPlayableItemWrapper[i7];
        }
    }

    public CloudPlayableItemWrapper(@NotNull StandardProjectionItem standardProjectionItem, boolean z6) {
        this.f63461a = standardProjectionItem;
        this.f63462b = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudPlayableItemWrapper)) {
            return false;
        }
        CloudPlayableItemWrapper cloudPlayableItemWrapper = (CloudPlayableItemWrapper) obj;
        return Intrinsics.areEqual(this.f63461a, cloudPlayableItemWrapper.f63461a) && this.f63462b == cloudPlayableItemWrapper.f63462b;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem
    public final IProjectionItem getRawItem() {
        return this.f63461a;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.CompatCloudPlayableItem, com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem
    @NotNull
    public final StandardProjectionItem getRawItem() {
        return this.f63461a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63462b) + (this.f63461a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "CloudPlayableItemWrapper(rawItem=" + this.f63461a + ", isOldCloud=" + this.f63462b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeParcelable(this.f63461a, i7);
        parcel.writeByte(this.f63462b ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f63463c, i7);
        parcel.writeTypedList(this.f63464d);
    }
}
