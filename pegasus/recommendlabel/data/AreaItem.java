package com.bilibili.pegasus.recommendlabel.data;

import G0.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/AreaItem.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class AreaItem implements Parcelable {

    @SerializedName("color")
    @Nullable
    private final String color;

    @SerializedName("count")
    private final long count;

    @SerializedName("name")
    @Nullable
    private final String name;

    @NotNull
    public static final Parcelable.Creator<AreaItem> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/AreaItem$a.class */
    public static final class a implements Parcelable.Creator<AreaItem> {
        @Override // android.os.Parcelable.Creator
        public final AreaItem createFromParcel(Parcel parcel) {
            return new AreaItem(parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final AreaItem[] newArray(int i7) {
            return new AreaItem[i7];
        }
    }

    public AreaItem() {
        this(null, null, 0L, 7, null);
    }

    public AreaItem(@Nullable String str, @Nullable String str2, long j7) {
        this.name = str;
        this.color = str2;
        this.count = j7;
    }

    public /* synthetic */ AreaItem(String str, String str2, long j7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? 0L : j7);
    }

    public static /* synthetic */ AreaItem copy$default(AreaItem areaItem, String str, String str2, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = areaItem.name;
        }
        if ((i7 & 2) != 0) {
            str2 = areaItem.color;
        }
        if ((i7 & 4) != 0) {
            j7 = areaItem.count;
        }
        return areaItem.copy(str, str2, j7);
    }

    @Nullable
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final String component2() {
        return this.color;
    }

    public final long component3() {
        return this.count;
    }

    @NotNull
    public final AreaItem copy(@Nullable String str, @Nullable String str2, long j7) {
        return new AreaItem(str, str2, j7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AreaItem)) {
            return false;
        }
        AreaItem areaItem = (AreaItem) obj;
        return Intrinsics.areEqual(this.name, areaItem.name) && Intrinsics.areEqual(this.color, areaItem.color) && this.count == areaItem.count;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    public final long getCount() {
        return this.count;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.color;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return Long.hashCode(this.count) + (((iHashCode2 * 31) + iHashCode) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.color;
        return android.support.v4.media.session.a.a(b.a("AreaItem(name=", str, ", color=", str2, ", count="), this.count, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.name);
        parcel.writeString(this.color);
        parcel.writeLong(this.count);
    }
}
