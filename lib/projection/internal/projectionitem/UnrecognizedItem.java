package com.bilibili.lib.projection.internal.projectionitem;

import android.os.Parcel;
import android.os.Parcelable;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem;
import com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/UnrecognizedItem.class */
public final class UnrecognizedItem implements IProjectionPlayableItem, IProjectionItem {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f63521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f63522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f63523c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/UnrecognizedItem$a.class */
    public static final class a implements Parcelable.Creator<UnrecognizedItem> {
        @Override // android.os.Parcelable.Creator
        public final UnrecognizedItem createFromParcel(Parcel parcel) {
            return new UnrecognizedItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UnrecognizedItem[] newArray(int i7) {
            return new UnrecognizedItem[i7];
        }
    }

    public UnrecognizedItem(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f63521a = str;
        this.f63522b = str2;
        this.f63523c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.IProjectionItem
    public final int getClientType() {
        return -2;
    }

    @Override // com.bilibili.lib.projection.internal.projectionitem.base.IProjectionPlayableItem
    @NotNull
    public final IProjectionItem getRawItem() {
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.f63521a);
        parcel.writeString(this.f63522b);
        parcel.writeString(this.f63523c);
    }
}
