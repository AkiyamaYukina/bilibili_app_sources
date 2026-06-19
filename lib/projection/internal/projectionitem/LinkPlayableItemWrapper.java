package com.bilibili.lib.projection.internal.projectionitem;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.lib.projection.internal.api.model.ProjectionQualityInfo;
import com.bilibili.lib.projection.internal.projectionitem.base.CompatLinkPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/LinkPlayableItemWrapper.class */
public final class LinkPlayableItemWrapper implements CompatLinkPlayableItem {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StandardProjectionItem f63469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ProjectionQualityInfo f63470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<ProjectionQualityInfo> f63471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63472d = -1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/LinkPlayableItemWrapper$a.class */
    public static final class a implements Parcelable.Creator<LinkPlayableItemWrapper> {
        @Override // android.os.Parcelable.Creator
        public final LinkPlayableItemWrapper createFromParcel(Parcel parcel) {
            LinkPlayableItemWrapper linkPlayableItemWrapper = new LinkPlayableItemWrapper((StandardProjectionItem) parcel.readParcelable(StandardProjectionItem.class.getClassLoader()));
            linkPlayableItemWrapper.f63470b = (ProjectionQualityInfo) parcel.readParcelable(ProjectionQualityInfo.class.getClassLoader());
            linkPlayableItemWrapper.f63471c = parcel.createTypedArrayList(ProjectionQualityInfo.CREATOR);
            linkPlayableItemWrapper.f63472d = parcel.readInt();
            return linkPlayableItemWrapper;
        }

        @Override // android.os.Parcelable.Creator
        public final LinkPlayableItemWrapper[] newArray(int i7) {
            return new LinkPlayableItemWrapper[i7];
        }
    }

    public LinkPlayableItemWrapper(@NotNull StandardProjectionItem standardProjectionItem) {
        this.f63469a = standardProjectionItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinkPlayableItemWrapper) && Intrinsics.areEqual(this.f63469a, ((LinkPlayableItemWrapper) obj).f63469a);
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem
    public final IProjectionItem getRawItem() {
        return this.f63469a;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.CompatProjectionPlayableItem, com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem
    @NotNull
    public final StandardProjectionItem getRawItem() {
        return this.f63469a;
    }

    public final int hashCode() {
        return this.f63469a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "LinkPlayableItemWrapper(rawItem=" + this.f63469a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeParcelable(this.f63469a, i7);
        parcel.writeParcelable(this.f63470b, i7);
        parcel.writeTypedList(this.f63471c);
        parcel.writeInt(this.f63472d);
    }
}
