package com.bilibili.ogv.misc.follow.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/SeriesItem.class */
@StabilityInferred(parameters = 0)
@Bson
public final class SeriesItem extends ItemData {

    @NotNull
    public static final a CREATOR = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @SerializedName("can_watch")
    private boolean f69154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @SerializedName("follow")
    private boolean f69155r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @SerializedName("series")
    @Nullable
    private Series f69156s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient boolean f69157t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public transient boolean f69158u;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/entity/SeriesItem$a.class */
    public static final class a implements Parcelable.Creator<SeriesItem> {
        @Override // android.os.Parcelable.Creator
        public final SeriesItem createFromParcel(Parcel parcel) {
            return new SeriesItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SeriesItem[] newArray(int i7) {
            return new SeriesItem[i7];
        }
    }

    public SeriesItem() {
        this.f69154q = true;
        this.f69155r = true;
    }

    public SeriesItem(@NotNull Parcel parcel) {
        super(parcel);
        this.f69154q = true;
        this.f69155r = true;
        this.f69154q = parcel.readByte() != 0;
        this.f69155r = parcel.readByte() != 0;
        this.f69156s = (Series) parcel.readParcelable(Series.class.getClassLoader());
    }

    public final boolean A() {
        return this.f69155r;
    }

    @Nullable
    public final Series B() {
        return this.f69156s;
    }

    public final void D(boolean z6) {
        this.f69154q = z6;
    }

    public final void F(boolean z6) {
        this.f69155r = z6;
    }

    public final void G(@Nullable Series series) {
        this.f69156s = series;
    }

    @Override // com.bilibili.ogv.misc.follow.api.entity.ItemData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeByte(this.f69154q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f69155r ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f69156s, i7);
    }

    public final boolean z() {
        return this.f69154q;
    }
}
