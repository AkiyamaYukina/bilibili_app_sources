package com.bilibili.lib.projection.internal.projectionitem;

import android.os.Parcel;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/NoItem.class */
public final class NoItem implements IProjectionPlayableItem, IProjectionItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final NoItem f63473a = new NoItem();

    private NoItem() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem
    public final int getClientType() {
        return -1;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem
    @NotNull
    public final IProjectionItem getRawItem() {
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
    }
}
