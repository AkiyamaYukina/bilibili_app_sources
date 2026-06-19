package com.bilibili.pegasus.recommendlabel.data;

import G0.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import cf.f;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/UinterestMngPageMaterial.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class UinterestMngPageMaterial implements Parcelable {

    @SerializedName("edit_add_group_title")
    @Nullable
    private final String editAddGroupTitle;

    @SerializedName("edit_finish_button_text")
    @Nullable
    private final String editFinishButtonText;

    @SerializedName("edit_max_labels_count")
    @Nullable
    private final Integer editMaxLabelsCount;

    @SerializedName("edit_my_group_subtitle")
    @Nullable
    private final String editMyGroupSubtitle;

    @SerializedName("edit_my_group_title")
    @Nullable
    private final String editMyGroupTitle;

    @SerializedName("edit_title")
    @Nullable
    private final String editTitle;

    @NotNull
    public static final Parcelable.Creator<UinterestMngPageMaterial> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/UinterestMngPageMaterial$a.class */
    public static final class a implements Parcelable.Creator<UinterestMngPageMaterial> {
        @Override // android.os.Parcelable.Creator
        public final UinterestMngPageMaterial createFromParcel(Parcel parcel) {
            return new UinterestMngPageMaterial(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final UinterestMngPageMaterial[] newArray(int i7) {
            return new UinterestMngPageMaterial[i7];
        }
    }

    public UinterestMngPageMaterial() {
        this(null, null, null, null, null, null, 63, null);
    }

    public UinterestMngPageMaterial(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num) {
        this.editTitle = str;
        this.editMyGroupTitle = str2;
        this.editMyGroupSubtitle = str3;
        this.editAddGroupTitle = str4;
        this.editFinishButtonText = str5;
        this.editMaxLabelsCount = num;
    }

    public /* synthetic */ UinterestMngPageMaterial(String str, String str2, String str3, String str4, String str5, Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5, (i7 & 32) != 0 ? null : num);
    }

    public static /* synthetic */ UinterestMngPageMaterial copy$default(UinterestMngPageMaterial uinterestMngPageMaterial, String str, String str2, String str3, String str4, String str5, Integer num, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = uinterestMngPageMaterial.editTitle;
        }
        if ((i7 & 2) != 0) {
            str2 = uinterestMngPageMaterial.editMyGroupTitle;
        }
        if ((i7 & 4) != 0) {
            str3 = uinterestMngPageMaterial.editMyGroupSubtitle;
        }
        if ((i7 & 8) != 0) {
            str4 = uinterestMngPageMaterial.editAddGroupTitle;
        }
        if ((i7 & 16) != 0) {
            str5 = uinterestMngPageMaterial.editFinishButtonText;
        }
        if ((i7 & 32) != 0) {
            num = uinterestMngPageMaterial.editMaxLabelsCount;
        }
        return uinterestMngPageMaterial.copy(str, str2, str3, str4, str5, num);
    }

    @Nullable
    public final String component1() {
        return this.editTitle;
    }

    @Nullable
    public final String component2() {
        return this.editMyGroupTitle;
    }

    @Nullable
    public final String component3() {
        return this.editMyGroupSubtitle;
    }

    @Nullable
    public final String component4() {
        return this.editAddGroupTitle;
    }

    @Nullable
    public final String component5() {
        return this.editFinishButtonText;
    }

    @Nullable
    public final Integer component6() {
        return this.editMaxLabelsCount;
    }

    @NotNull
    public final UinterestMngPageMaterial copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num) {
        return new UinterestMngPageMaterial(str, str2, str3, str4, str5, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UinterestMngPageMaterial)) {
            return false;
        }
        UinterestMngPageMaterial uinterestMngPageMaterial = (UinterestMngPageMaterial) obj;
        return Intrinsics.areEqual(this.editTitle, uinterestMngPageMaterial.editTitle) && Intrinsics.areEqual(this.editMyGroupTitle, uinterestMngPageMaterial.editMyGroupTitle) && Intrinsics.areEqual(this.editMyGroupSubtitle, uinterestMngPageMaterial.editMyGroupSubtitle) && Intrinsics.areEqual(this.editAddGroupTitle, uinterestMngPageMaterial.editAddGroupTitle) && Intrinsics.areEqual(this.editFinishButtonText, uinterestMngPageMaterial.editFinishButtonText) && Intrinsics.areEqual(this.editMaxLabelsCount, uinterestMngPageMaterial.editMaxLabelsCount);
    }

    @Nullable
    public final String getEditAddGroupTitle() {
        return this.editAddGroupTitle;
    }

    @Nullable
    public final String getEditFinishButtonText() {
        return this.editFinishButtonText;
    }

    @Nullable
    public final Integer getEditMaxLabelsCount() {
        return this.editMaxLabelsCount;
    }

    @Nullable
    public final String getEditMyGroupSubtitle() {
        return this.editMyGroupSubtitle;
    }

    @Nullable
    public final String getEditMyGroupTitle() {
        return this.editMyGroupTitle;
    }

    @Nullable
    public final String getEditTitle() {
        return this.editTitle;
    }

    public int hashCode() {
        String str = this.editTitle;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.editMyGroupTitle;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.editMyGroupSubtitle;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.editAddGroupTitle;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.editFinishButtonText;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.editMaxLabelsCount;
        if (num != null) {
            iHashCode = num.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        String str = this.editTitle;
        String str2 = this.editMyGroupTitle;
        String str3 = this.editMyGroupSubtitle;
        String str4 = this.editAddGroupTitle;
        String str5 = this.editFinishButtonText;
        Integer num = this.editMaxLabelsCount;
        StringBuilder sbA = b.a("UinterestMngPageMaterial(editTitle=", str, ", editMyGroupTitle=", str2, ", editMyGroupSubtitle=");
        B.a(str3, ", editAddGroupTitle=", str4, ", editFinishButtonText=", sbA);
        sbA.append(str5);
        sbA.append(", editMaxLabelsCount=");
        sbA.append(num);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.editTitle);
        parcel.writeString(this.editMyGroupTitle);
        parcel.writeString(this.editMyGroupSubtitle);
        parcel.writeString(this.editAddGroupTitle);
        parcel.writeString(this.editFinishButtonText);
        Integer num = this.editMaxLabelsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.a(parcel, 1, num);
        }
    }
}
