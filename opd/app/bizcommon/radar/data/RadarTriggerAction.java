package com.bilibili.opd.app.bizcommon.radar.data;

import G0.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import c6.P;
import e4.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/RadarTriggerAction.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RadarTriggerAction implements Parcelable {

    @Nullable
    private String actionId;

    @Nullable
    private String actionParams;

    @Nullable
    private String actionText;

    @Nullable
    private String actionUrl;

    @Nullable
    private Integer actionUsage;
    private boolean destructive;

    @Nullable
    private String errorToast;

    @Nullable
    private String jumpAction;

    @Nullable
    private String pageAction;
    private boolean showTimeCountdown;

    @Nullable
    private String successToast;

    @NotNull
    public static final a CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/RadarTriggerAction$a.class */
    public static final class a implements Parcelable.Creator<RadarTriggerAction> {
        @Override // android.os.Parcelable.Creator
        public final RadarTriggerAction createFromParcel(Parcel parcel) {
            return new RadarTriggerAction(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RadarTriggerAction[] newArray(int i7) {
            return new RadarTriggerAction[i7];
        }
    }

    public RadarTriggerAction() {
        this(null, null, null, null, false, false, null, null, null, null, null, 2047, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RadarTriggerAction(@NotNull Parcel parcel) {
        String string = parcel.readString();
        string = string == null ? "" : string;
        String string2 = parcel.readString();
        string2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        string3 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        string4 = string4 == null ? "" : string4;
        boolean z6 = parcel.readByte() == 1;
        boolean z7 = parcel.readByte() == 1;
        String string5 = parcel.readString();
        string5 = string5 == null ? "" : string5;
        String string6 = parcel.readString();
        string6 = string6 == null ? "" : string6;
        String string7 = parcel.readString();
        string7 = string7 == null ? "" : string7;
        String string8 = parcel.readString();
        this(string, string2, string3, string4, z6, z7, string5, string6, string7, string8 == null ? "" : string8, Integer.valueOf(parcel.readInt()));
    }

    public RadarTriggerAction(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z6, boolean z7, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num) {
        this.actionId = str;
        this.actionText = str2;
        this.actionUrl = str3;
        this.jumpAction = str4;
        this.destructive = z6;
        this.showTimeCountdown = z7;
        this.pageAction = str5;
        this.successToast = str6;
        this.errorToast = str7;
        this.actionParams = str8;
        this.actionUsage = num;
    }

    public /* synthetic */ RadarTriggerAction(String str, String str2, String str3, String str4, boolean z6, boolean z7, String str5, String str6, String str7, String str8, Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? "" : str4, (i7 & 16) != 0 ? false : z6, (i7 & 32) != 0 ? false : z7, (i7 & 64) != 0 ? "" : str5, (i7 & 128) != 0 ? "" : str6, (i7 & 256) != 0 ? "" : str7, (i7 & 512) != 0 ? "" : str8, (i7 & 1024) != 0 ? 0 : num);
    }

    public static /* synthetic */ RadarTriggerAction copy$default(RadarTriggerAction radarTriggerAction, String str, String str2, String str3, String str4, boolean z6, boolean z7, String str5, String str6, String str7, String str8, Integer num, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = radarTriggerAction.actionId;
        }
        if ((i7 & 2) != 0) {
            str2 = radarTriggerAction.actionText;
        }
        if ((i7 & 4) != 0) {
            str3 = radarTriggerAction.actionUrl;
        }
        if ((i7 & 8) != 0) {
            str4 = radarTriggerAction.jumpAction;
        }
        if ((i7 & 16) != 0) {
            z6 = radarTriggerAction.destructive;
        }
        if ((i7 & 32) != 0) {
            z7 = radarTriggerAction.showTimeCountdown;
        }
        if ((i7 & 64) != 0) {
            str5 = radarTriggerAction.pageAction;
        }
        if ((i7 & 128) != 0) {
            str6 = radarTriggerAction.successToast;
        }
        if ((i7 & 256) != 0) {
            str7 = radarTriggerAction.errorToast;
        }
        if ((i7 & 512) != 0) {
            str8 = radarTriggerAction.actionParams;
        }
        if ((i7 & 1024) != 0) {
            num = radarTriggerAction.actionUsage;
        }
        return radarTriggerAction.copy(str, str2, str3, str4, z6, z7, str5, str6, str7, str8, num);
    }

    @Nullable
    public final String component1() {
        return this.actionId;
    }

    @Nullable
    public final String component10() {
        return this.actionParams;
    }

    @Nullable
    public final Integer component11() {
        return this.actionUsage;
    }

    @Nullable
    public final String component2() {
        return this.actionText;
    }

    @Nullable
    public final String component3() {
        return this.actionUrl;
    }

    @Nullable
    public final String component4() {
        return this.jumpAction;
    }

    public final boolean component5() {
        return this.destructive;
    }

    public final boolean component6() {
        return this.showTimeCountdown;
    }

    @Nullable
    public final String component7() {
        return this.pageAction;
    }

    @Nullable
    public final String component8() {
        return this.successToast;
    }

    @Nullable
    public final String component9() {
        return this.errorToast;
    }

    @NotNull
    public final RadarTriggerAction copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z6, boolean z7, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num) {
        return new RadarTriggerAction(str, str2, str3, str4, z6, z7, str5, str6, str7, str8, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadarTriggerAction)) {
            return false;
        }
        RadarTriggerAction radarTriggerAction = (RadarTriggerAction) obj;
        return Intrinsics.areEqual(this.actionId, radarTriggerAction.actionId) && Intrinsics.areEqual(this.actionText, radarTriggerAction.actionText) && Intrinsics.areEqual(this.actionUrl, radarTriggerAction.actionUrl) && Intrinsics.areEqual(this.jumpAction, radarTriggerAction.jumpAction) && this.destructive == radarTriggerAction.destructive && this.showTimeCountdown == radarTriggerAction.showTimeCountdown && Intrinsics.areEqual(this.pageAction, radarTriggerAction.pageAction) && Intrinsics.areEqual(this.successToast, radarTriggerAction.successToast) && Intrinsics.areEqual(this.errorToast, radarTriggerAction.errorToast) && Intrinsics.areEqual(this.actionParams, radarTriggerAction.actionParams) && Intrinsics.areEqual(this.actionUsage, radarTriggerAction.actionUsage);
    }

    @Nullable
    public final String getActionId() {
        return this.actionId;
    }

    @Nullable
    public final String getActionParams() {
        return this.actionParams;
    }

    @Nullable
    public final String getActionText() {
        return this.actionText;
    }

    @Nullable
    public final String getActionUrl() {
        return this.actionUrl;
    }

    @Nullable
    public final Integer getActionUsage() {
        return this.actionUsage;
    }

    public final boolean getDestructive() {
        return this.destructive;
    }

    @Nullable
    public final String getErrorToast() {
        return this.errorToast;
    }

    @Nullable
    public final String getJumpAction() {
        return this.jumpAction;
    }

    @Nullable
    public final String getPageAction() {
        return this.pageAction;
    }

    public final boolean getShowTimeCountdown() {
        return this.showTimeCountdown;
    }

    @Nullable
    public final String getSuccessToast() {
        return this.successToast;
    }

    public int hashCode() {
        String str = this.actionId;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.actionText;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.actionUrl;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.jumpAction;
        int iA = z.a(z.a(((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.destructive), 31, this.showTimeCountdown);
        String str5 = this.pageAction;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.successToast;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.errorToast;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.actionParams;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        Integer num = this.actionUsage;
        if (num != null) {
            iHashCode = num.hashCode();
        }
        return ((((((((iA + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode;
    }

    public final void setActionId(@Nullable String str) {
        this.actionId = str;
    }

    public final void setActionParams(@Nullable String str) {
        this.actionParams = str;
    }

    public final void setActionText(@Nullable String str) {
        this.actionText = str;
    }

    public final void setActionUrl(@Nullable String str) {
        this.actionUrl = str;
    }

    public final void setActionUsage(@Nullable Integer num) {
        this.actionUsage = num;
    }

    public final void setDestructive(boolean z6) {
        this.destructive = z6;
    }

    public final void setErrorToast(@Nullable String str) {
        this.errorToast = str;
    }

    public final void setJumpAction(@Nullable String str) {
        this.jumpAction = str;
    }

    public final void setPageAction(@Nullable String str) {
        this.pageAction = str;
    }

    public final void setShowTimeCountdown(boolean z6) {
        this.showTimeCountdown = z6;
    }

    public final void setSuccessToast(@Nullable String str) {
        this.successToast = str;
    }

    @NotNull
    public String toString() {
        String str = this.actionId;
        String str2 = this.actionText;
        String str3 = this.actionUrl;
        String str4 = this.jumpAction;
        boolean z6 = this.destructive;
        boolean z7 = this.showTimeCountdown;
        String str5 = this.pageAction;
        String str6 = this.successToast;
        String str7 = this.errorToast;
        String str8 = this.actionParams;
        Integer num = this.actionUsage;
        StringBuilder sbA = b.a("RadarTriggerAction(actionId=", str, ", actionText=", str2, ", actionUrl=");
        B.a(str3, ", jumpAction=", str4, ", destructive=", sbA);
        P.a(", showTimeCountdown=", ", pageAction=", sbA, z6, z7);
        B.a(str5, ", successToast=", str6, ", errorToast=", sbA);
        B.a(str7, ", actionParams=", str8, ", actionUsage=", sbA);
        return c.a(sbA, num, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.actionId);
        parcel.writeString(this.actionText);
        parcel.writeString(this.actionUrl);
        parcel.writeString(this.jumpAction);
        parcel.writeByte(this.destructive ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showTimeCountdown ? (byte) 1 : (byte) 0);
        parcel.writeString(this.pageAction);
        parcel.writeString(this.successToast);
        parcel.writeString(this.errorToast);
        parcel.writeString(this.actionParams);
        Integer num = this.actionUsage;
        parcel.writeInt(num != null ? num.intValue() : 0);
    }
}
