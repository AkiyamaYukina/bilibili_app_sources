package com.bilibili.pegasus.recommendlabel.data;

import G0.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/BackToDefaultWindow.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class BackToDefaultWindow implements Parcelable {

    @SerializedName("cancel_button")
    @Nullable
    private final String cancelButton;

    @SerializedName("confirm_button")
    @Nullable
    private final String confirmButton;

    @SerializedName("subtitle")
    @Nullable
    private final String subtitle;

    @SerializedName("title")
    @Nullable
    private final String title;

    @SerializedName("toast")
    @Nullable
    private final String toast;

    @NotNull
    public static final Parcelable.Creator<BackToDefaultWindow> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/data/BackToDefaultWindow$a.class */
    public static final class a implements Parcelable.Creator<BackToDefaultWindow> {
        @Override // android.os.Parcelable.Creator
        public final BackToDefaultWindow createFromParcel(Parcel parcel) {
            return new BackToDefaultWindow(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BackToDefaultWindow[] newArray(int i7) {
            return new BackToDefaultWindow[i7];
        }
    }

    public BackToDefaultWindow() {
        this(null, null, null, null, null, 31, null);
    }

    public BackToDefaultWindow(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.title = str;
        this.subtitle = str2;
        this.cancelButton = str3;
        this.confirmButton = str4;
        this.toast = str5;
    }

    public /* synthetic */ BackToDefaultWindow(String str, String str2, String str3, String str4, String str5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ BackToDefaultWindow copy$default(BackToDefaultWindow backToDefaultWindow, String str, String str2, String str3, String str4, String str5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = backToDefaultWindow.title;
        }
        if ((i7 & 2) != 0) {
            str2 = backToDefaultWindow.subtitle;
        }
        if ((i7 & 4) != 0) {
            str3 = backToDefaultWindow.cancelButton;
        }
        if ((i7 & 8) != 0) {
            str4 = backToDefaultWindow.confirmButton;
        }
        if ((i7 & 16) != 0) {
            str5 = backToDefaultWindow.toast;
        }
        return backToDefaultWindow.copy(str, str2, str3, str4, str5);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.subtitle;
    }

    @Nullable
    public final String component3() {
        return this.cancelButton;
    }

    @Nullable
    public final String component4() {
        return this.confirmButton;
    }

    @Nullable
    public final String component5() {
        return this.toast;
    }

    @NotNull
    public final BackToDefaultWindow copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new BackToDefaultWindow(str, str2, str3, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackToDefaultWindow)) {
            return false;
        }
        BackToDefaultWindow backToDefaultWindow = (BackToDefaultWindow) obj;
        return Intrinsics.areEqual(this.title, backToDefaultWindow.title) && Intrinsics.areEqual(this.subtitle, backToDefaultWindow.subtitle) && Intrinsics.areEqual(this.cancelButton, backToDefaultWindow.cancelButton) && Intrinsics.areEqual(this.confirmButton, backToDefaultWindow.confirmButton) && Intrinsics.areEqual(this.toast, backToDefaultWindow.toast);
    }

    @Nullable
    public final String getCancelButton() {
        return this.cancelButton;
    }

    @Nullable
    public final String getConfirmButton() {
        return this.confirmButton;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getToast() {
        return this.toast;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.subtitle;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.cancelButton;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.confirmButton;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.toast;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.cancelButton;
        String str4 = this.confirmButton;
        String str5 = this.toast;
        StringBuilder sbA = b.a("BackToDefaultWindow(title=", str, ", subtitle=", str2, ", cancelButton=");
        B.a(str3, ", confirmButton=", str4, ", toast=", sbA);
        return C8770a.a(sbA, str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.cancelButton);
        parcel.writeString(this.confirmButton);
        parcel.writeString(this.toast);
    }
}
