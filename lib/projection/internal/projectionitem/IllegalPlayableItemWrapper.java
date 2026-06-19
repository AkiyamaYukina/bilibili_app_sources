package com.bilibili.lib.projection.internal.projectionitem;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import com.bilibili.lib.projection.internal.projectionitem.base.StandardProjectionItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/IllegalPlayableItemWrapper.class */
public final class IllegalPlayableItemWrapper implements IProjectionPlayableItem {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IProjectionItem f63468a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/IllegalPlayableItemWrapper$a.class */
    public static final class a implements Parcelable.Creator<IllegalPlayableItemWrapper> {
        @Override // android.os.Parcelable.Creator
        public final IllegalPlayableItemWrapper createFromParcel(Parcel parcel) {
            return new IllegalPlayableItemWrapper((IProjectionItem) parcel.readParcelable(StandardProjectionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IllegalPlayableItemWrapper[] newArray(int i7) {
            return new IllegalPlayableItemWrapper[i7];
        }
    }

    public IllegalPlayableItemWrapper(@NotNull IProjectionItem iProjectionItem) {
        this.f63468a = iProjectionItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IllegalPlayableItemWrapper) && Intrinsics.areEqual(this.f63468a, ((IllegalPlayableItemWrapper) obj).f63468a);
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem
    @NotNull
    public final IProjectionItem getRawItem() {
        return this.f63468a;
    }

    public final int hashCode() {
        return this.f63468a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "IllegalPlayableItemWrapper(rawItem=" + this.f63468a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeParcelable(this.f63468a, i7);
    }
}
