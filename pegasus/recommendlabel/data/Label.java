package com.bilibili.pegasus.recommendlabel.data;

import G0.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import cf.o;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/Label.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class Label implements Parcelable {

    @Nullable
    private String areaName;

    @SerializedName("icon")
    @Nullable
    private final String icon;

    @SerializedName("is_fixed")
    private final int isFixed;

    @SerializedName("name")
    @Nullable
    private final String name;

    @NotNull
    public static final Parcelable.Creator<Label> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/Label$a.class */
    public static final class a implements Parcelable.Creator<Label> {
        @Override // android.os.Parcelable.Creator
        public final Label createFromParcel(Parcel parcel) {
            return new Label(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Label[] newArray(int i7) {
            return new Label[i7];
        }
    }

    public Label() {
        this(null, null, 0, null, 15, null);
    }

    public Label(@Nullable String str, @Nullable String str2, int i7, @Nullable String str3) {
        this.name = str;
        this.icon = str2;
        this.isFixed = i7;
        this.areaName = str3;
    }

    public /* synthetic */ Label(String str, String str2, int i7, String str3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? 0 : i7, (i8 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ Label copy$default(Label label, String str, String str2, int i7, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = label.name;
        }
        if ((i8 & 2) != 0) {
            str2 = label.icon;
        }
        if ((i8 & 4) != 0) {
            i7 = label.isFixed;
        }
        if ((i8 & 8) != 0) {
            str3 = label.areaName;
        }
        return label.copy(str, str2, i7, str3);
    }

    @Nullable
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final String component2() {
        return this.icon;
    }

    public final int component3() {
        return this.isFixed;
    }

    @Nullable
    public final String component4() {
        return this.areaName;
    }

    @NotNull
    public final Label copy(@Nullable String str, @Nullable String str2, int i7, @Nullable String str3) {
        return new Label(str, str2, i7, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Label)) {
            return false;
        }
        Label label = (Label) obj;
        return Intrinsics.areEqual(this.name, label.name) && Intrinsics.areEqual(this.icon, label.icon) && this.isFixed == label.isFixed && Intrinsics.areEqual(this.areaName, label.areaName);
    }

    @Nullable
    public final String getAreaName() {
        return this.areaName;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.icon;
        int iA = I.a(this.isFixed, ((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.areaName;
        return iA + (str3 == null ? 0 : str3.hashCode());
    }

    public final int isFixed() {
        return this.isFixed;
    }

    public final boolean isPined() {
        boolean z6 = true;
        if (this.isFixed != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void setAreaName(@Nullable String str) {
        this.areaName = str;
    }

    @NotNull
    public String toString() {
        return o.a(this.isFixed, ", areaName=", this.areaName, ")", b.a("Label(name=", this.name, ", icon=", this.icon, ", isFixed="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.name);
        parcel.writeString(this.icon);
        parcel.writeInt(this.isFixed);
        parcel.writeString(this.areaName);
    }
}
