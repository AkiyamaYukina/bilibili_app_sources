package com.bilibili.pegasus.recommendlabel.data;

import G0.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/UinterestPageMaterial.class */
@StabilityInferred(parameters = 1)
@Parcelize
@Keep
public final class UinterestPageMaterial implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<UinterestPageMaterial> CREATOR = new Object();

    @SerializedName("back_to_default_button")
    @Nullable
    private final String backToDefaultButton;

    @SerializedName("back_to_default_window")
    @Nullable
    private final BackToDefaultWindow backToDefaultWindow;

    @SerializedName("edit_button_text")
    @Nullable
    private final String editButtonText;

    @SerializedName("more_interest_button")
    @Nullable
    private final String moreInterestButton;

    @SerializedName("my_interest_title")
    @Nullable
    private final String myInterestTitle;

    @SerializedName("note_text")
    @Nullable
    private final String noteText;

    @SerializedName("right_top_22_bg")
    @Nullable
    private final String rightTopBg;

    @SerializedName("subtitle")
    @Nullable
    private final String subtitle;

    @SerializedName("title")
    @Nullable
    private final String title;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/UinterestPageMaterial$a.class */
    public static final class a implements Parcelable.Creator<UinterestPageMaterial> {
        @Override // android.os.Parcelable.Creator
        public final UinterestPageMaterial createFromParcel(Parcel parcel) {
            return new UinterestPageMaterial(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BackToDefaultWindow.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UinterestPageMaterial[] newArray(int i7) {
            return new UinterestPageMaterial[i7];
        }
    }

    public UinterestPageMaterial() {
        this(null, null, null, null, null, null, null, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE, null);
    }

    public UinterestPageMaterial(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable BackToDefaultWindow backToDefaultWindow, @Nullable String str8) {
        this.rightTopBg = str;
        this.title = str2;
        this.myInterestTitle = str3;
        this.subtitle = str4;
        this.editButtonText = str5;
        this.noteText = str6;
        this.backToDefaultButton = str7;
        this.backToDefaultWindow = backToDefaultWindow;
        this.moreInterestButton = str8;
    }

    public /* synthetic */ UinterestPageMaterial(String str, String str2, String str3, String str4, String str5, String str6, String str7, BackToDefaultWindow backToDefaultWindow, String str8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5, (i7 & 32) != 0 ? null : str6, (i7 & 64) != 0 ? null : str7, (i7 & 128) != 0 ? null : backToDefaultWindow, (i7 & 256) != 0 ? null : str8);
    }

    public static /* synthetic */ UinterestPageMaterial copy$default(UinterestPageMaterial uinterestPageMaterial, String str, String str2, String str3, String str4, String str5, String str6, String str7, BackToDefaultWindow backToDefaultWindow, String str8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = uinterestPageMaterial.rightTopBg;
        }
        if ((i7 & 2) != 0) {
            str2 = uinterestPageMaterial.title;
        }
        if ((i7 & 4) != 0) {
            str3 = uinterestPageMaterial.myInterestTitle;
        }
        if ((i7 & 8) != 0) {
            str4 = uinterestPageMaterial.subtitle;
        }
        if ((i7 & 16) != 0) {
            str5 = uinterestPageMaterial.editButtonText;
        }
        if ((i7 & 32) != 0) {
            str6 = uinterestPageMaterial.noteText;
        }
        if ((i7 & 64) != 0) {
            str7 = uinterestPageMaterial.backToDefaultButton;
        }
        if ((i7 & 128) != 0) {
            backToDefaultWindow = uinterestPageMaterial.backToDefaultWindow;
        }
        if ((i7 & 256) != 0) {
            str8 = uinterestPageMaterial.moreInterestButton;
        }
        return uinterestPageMaterial.copy(str, str2, str3, str4, str5, str6, str7, backToDefaultWindow, str8);
    }

    @Nullable
    public final String component1() {
        return this.rightTopBg;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.myInterestTitle;
    }

    @Nullable
    public final String component4() {
        return this.subtitle;
    }

    @Nullable
    public final String component5() {
        return this.editButtonText;
    }

    @Nullable
    public final String component6() {
        return this.noteText;
    }

    @Nullable
    public final String component7() {
        return this.backToDefaultButton;
    }

    @Nullable
    public final BackToDefaultWindow component8() {
        return this.backToDefaultWindow;
    }

    @Nullable
    public final String component9() {
        return this.moreInterestButton;
    }

    @NotNull
    public final UinterestPageMaterial copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable BackToDefaultWindow backToDefaultWindow, @Nullable String str8) {
        return new UinterestPageMaterial(str, str2, str3, str4, str5, str6, str7, backToDefaultWindow, str8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UinterestPageMaterial)) {
            return false;
        }
        UinterestPageMaterial uinterestPageMaterial = (UinterestPageMaterial) obj;
        return Intrinsics.areEqual(this.rightTopBg, uinterestPageMaterial.rightTopBg) && Intrinsics.areEqual(this.title, uinterestPageMaterial.title) && Intrinsics.areEqual(this.myInterestTitle, uinterestPageMaterial.myInterestTitle) && Intrinsics.areEqual(this.subtitle, uinterestPageMaterial.subtitle) && Intrinsics.areEqual(this.editButtonText, uinterestPageMaterial.editButtonText) && Intrinsics.areEqual(this.noteText, uinterestPageMaterial.noteText) && Intrinsics.areEqual(this.backToDefaultButton, uinterestPageMaterial.backToDefaultButton) && Intrinsics.areEqual(this.backToDefaultWindow, uinterestPageMaterial.backToDefaultWindow) && Intrinsics.areEqual(this.moreInterestButton, uinterestPageMaterial.moreInterestButton);
    }

    @Nullable
    public final String getBackToDefaultButton() {
        return this.backToDefaultButton;
    }

    @Nullable
    public final BackToDefaultWindow getBackToDefaultWindow() {
        return this.backToDefaultWindow;
    }

    @Nullable
    public final String getEditButtonText() {
        return this.editButtonText;
    }

    @Nullable
    public final String getMoreInterestButton() {
        return this.moreInterestButton;
    }

    @Nullable
    public final String getMyInterestTitle() {
        return this.myInterestTitle;
    }

    @Nullable
    public final String getNoteText() {
        return this.noteText;
    }

    @Nullable
    public final String getRightTopBg() {
        return this.rightTopBg;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.rightTopBg;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.myInterestTitle;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.subtitle;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.editButtonText;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.noteText;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.backToDefaultButton;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        BackToDefaultWindow backToDefaultWindow = this.backToDefaultWindow;
        int iHashCode9 = backToDefaultWindow == null ? 0 : backToDefaultWindow.hashCode();
        String str8 = this.moreInterestButton;
        if (str8 != null) {
            iHashCode = str8.hashCode();
        }
        return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        String str = this.rightTopBg;
        String str2 = this.title;
        String str3 = this.myInterestTitle;
        String str4 = this.subtitle;
        String str5 = this.editButtonText;
        String str6 = this.noteText;
        String str7 = this.backToDefaultButton;
        BackToDefaultWindow backToDefaultWindow = this.backToDefaultWindow;
        String str8 = this.moreInterestButton;
        StringBuilder sbA = b.a("UinterestPageMaterial(rightTopBg=", str, ", title=", str2, ", myInterestTitle=");
        B.a(str3, ", subtitle=", str4, ", editButtonText=", sbA);
        B.a(str5, ", noteText=", str6, ", backToDefaultButton=", sbA);
        sbA.append(str7);
        sbA.append(", backToDefaultWindow=");
        sbA.append(backToDefaultWindow);
        sbA.append(", moreInterestButton=");
        return C8770a.a(sbA, str8, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.rightTopBg);
        parcel.writeString(this.title);
        parcel.writeString(this.myInterestTitle);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.editButtonText);
        parcel.writeString(this.noteText);
        parcel.writeString(this.backToDefaultButton);
        BackToDefaultWindow backToDefaultWindow = this.backToDefaultWindow;
        if (backToDefaultWindow == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            backToDefaultWindow.writeToParcel(parcel, i7);
        }
        parcel.writeString(this.moreInterestButton);
    }
}
