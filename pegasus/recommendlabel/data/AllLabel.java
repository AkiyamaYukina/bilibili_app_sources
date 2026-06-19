package com.bilibili.pegasus.recommendlabel.data;

import I01.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/AllLabel.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class AllLabel implements Parcelable {

    @SerializedName("area_icon")
    @Nullable
    private final String areaIcon;

    @SerializedName("area_label")
    @NotNull
    private final List<String> areaLabel;

    @SerializedName("area_name")
    @Nullable
    private final String areaName;

    @NotNull
    public static final Parcelable.Creator<AllLabel> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/AllLabel$a.class */
    public static final class a implements Parcelable.Creator<AllLabel> {
        @Override // android.os.Parcelable.Creator
        public final AllLabel createFromParcel(Parcel parcel) {
            return new AllLabel(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AllLabel[] newArray(int i7) {
            return new AllLabel[i7];
        }
    }

    public AllLabel() {
        this(null, null, null, 7, null);
    }

    public AllLabel(@Nullable String str, @NotNull List<String> list, @Nullable String str2) {
        this.areaIcon = str;
        this.areaLabel = list;
        this.areaName = str2;
    }

    public /* synthetic */ AllLabel(String str, List list, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? CollectionsKt.emptyList() : list, (i7 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllLabel copy$default(AllLabel allLabel, String str, List list, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = allLabel.areaIcon;
        }
        if ((i7 & 2) != 0) {
            list = allLabel.areaLabel;
        }
        if ((i7 & 4) != 0) {
            str2 = allLabel.areaName;
        }
        return allLabel.copy(str, list, str2);
    }

    @Nullable
    public final String component1() {
        return this.areaIcon;
    }

    @NotNull
    public final List<String> component2() {
        return this.areaLabel;
    }

    @Nullable
    public final String component3() {
        return this.areaName;
    }

    @NotNull
    public final AllLabel copy(@Nullable String str, @NotNull List<String> list, @Nullable String str2) {
        return new AllLabel(str, list, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllLabel)) {
            return false;
        }
        AllLabel allLabel = (AllLabel) obj;
        return Intrinsics.areEqual(this.areaIcon, allLabel.areaIcon) && Intrinsics.areEqual(this.areaLabel, allLabel.areaLabel) && Intrinsics.areEqual(this.areaName, allLabel.areaName);
    }

    @Nullable
    public final String getAreaIcon() {
        return this.areaIcon;
    }

    @NotNull
    public final List<String> getAreaLabel() {
        return this.areaLabel;
    }

    @Nullable
    public final String getAreaName() {
        return this.areaName;
    }

    public int hashCode() {
        String str = this.areaIcon;
        int iA = e0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.areaLabel);
        String str2 = this.areaName;
        return iA + (str2 == null ? 0 : str2.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.areaIcon;
        List<String> list = this.areaLabel;
        return C8770a.a(b.b("AllLabel(areaIcon=", str, ", areaLabel=", ", areaName=", list), this.areaName, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.areaIcon);
        parcel.writeStringList(this.areaLabel);
        parcel.writeString(this.areaName);
    }
}
