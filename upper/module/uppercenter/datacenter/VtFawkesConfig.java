package com.bilibili.upper.module.uppercenter.datacenter;

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
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/datacenter/VtFawkesConfig.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class VtFawkesConfig implements Parcelable {

    @SerializedName("dialog_button")
    @Nullable
    private String dialogButton;

    @SerializedName("dialog_title")
    @Nullable
    private String dialogTitle;

    @SerializedName("show_offline_dialog")
    private int showOfflineDialog;

    @NotNull
    public static final Parcelable.Creator<VtFawkesConfig> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/datacenter/VtFawkesConfig$a.class */
    public static final class a implements Parcelable.Creator<VtFawkesConfig> {
        @Override // android.os.Parcelable.Creator
        public final VtFawkesConfig createFromParcel(Parcel parcel) {
            return new VtFawkesConfig(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VtFawkesConfig[] newArray(int i7) {
            return new VtFawkesConfig[i7];
        }
    }

    public VtFawkesConfig() {
        this(0, null, null, 7, null);
    }

    public VtFawkesConfig(int i7, @Nullable String str, @Nullable String str2) {
        this.showOfflineDialog = i7;
        this.dialogTitle = str;
        this.dialogButton = str2;
    }

    public /* synthetic */ VtFawkesConfig(int i7, String str, String str2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ VtFawkesConfig copy$default(VtFawkesConfig vtFawkesConfig, int i7, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = vtFawkesConfig.showOfflineDialog;
        }
        if ((i8 & 2) != 0) {
            str = vtFawkesConfig.dialogTitle;
        }
        if ((i8 & 4) != 0) {
            str2 = vtFawkesConfig.dialogButton;
        }
        return vtFawkesConfig.copy(i7, str, str2);
    }

    public final int component1() {
        return this.showOfflineDialog;
    }

    @Nullable
    public final String component2() {
        return this.dialogTitle;
    }

    @Nullable
    public final String component3() {
        return this.dialogButton;
    }

    @NotNull
    public final VtFawkesConfig copy(int i7, @Nullable String str, @Nullable String str2) {
        return new VtFawkesConfig(i7, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VtFawkesConfig)) {
            return false;
        }
        VtFawkesConfig vtFawkesConfig = (VtFawkesConfig) obj;
        return this.showOfflineDialog == vtFawkesConfig.showOfflineDialog && Intrinsics.areEqual(this.dialogTitle, vtFawkesConfig.dialogTitle) && Intrinsics.areEqual(this.dialogButton, vtFawkesConfig.dialogButton);
    }

    @Nullable
    public final String getDialogButton() {
        return this.dialogButton;
    }

    @Nullable
    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    public final int getShowOfflineDialog() {
        return this.showOfflineDialog;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.showOfflineDialog);
        String str = this.dialogTitle;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.dialogButton;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public final void setDialogButton(@Nullable String str) {
        this.dialogButton = str;
    }

    public final void setDialogTitle(@Nullable String str) {
        this.dialogTitle = str;
    }

    public final void setShowOfflineDialog(int i7) {
        this.showOfflineDialog = i7;
    }

    @NotNull
    public String toString() {
        int i7 = this.showOfflineDialog;
        String str = this.dialogTitle;
        return C8770a.a(bilibili.live.app.service.resolver.a.b(i7, "VtFawkesConfig(showOfflineDialog=", ", dialogTitle=", str, ", dialogButton="), this.dialogButton, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeInt(this.showOfflineDialog);
        parcel.writeString(this.dialogTitle);
        parcel.writeString(this.dialogButton);
    }
}
