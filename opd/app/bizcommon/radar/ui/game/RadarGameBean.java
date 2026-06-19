package com.bilibili.opd.app.bizcommon.radar.ui.game;

import G0.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.A;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/game/RadarGameBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RadarGameBean implements Parcelable {

    @Nullable
    private String activityToken;

    @Nullable
    private String cardGameVersion;

    @Nullable
    private String mod;

    @Nullable
    private String url;

    @NotNull
    public static final a CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/game/RadarGameBean$a.class */
    public static final class a implements Parcelable.Creator<RadarGameBean> {
        @Override // android.os.Parcelable.Creator
        public final RadarGameBean createFromParcel(Parcel parcel) {
            return new RadarGameBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RadarGameBean[] newArray(int i7) {
            return new RadarGameBean[i7];
        }
    }

    public RadarGameBean() {
        this(null, null, null, null, 15, null);
    }

    public RadarGameBean(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public RadarGameBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.activityToken = str;
        this.cardGameVersion = str2;
        this.mod = str3;
        this.url = str4;
    }

    public /* synthetic */ RadarGameBean(String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? "" : str4);
    }

    public static /* synthetic */ RadarGameBean copy$default(RadarGameBean radarGameBean, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = radarGameBean.activityToken;
        }
        if ((i7 & 2) != 0) {
            str2 = radarGameBean.cardGameVersion;
        }
        if ((i7 & 4) != 0) {
            str3 = radarGameBean.mod;
        }
        if ((i7 & 8) != 0) {
            str4 = radarGameBean.url;
        }
        return radarGameBean.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.activityToken;
    }

    @Nullable
    public final String component2() {
        return this.cardGameVersion;
    }

    @Nullable
    public final String component3() {
        return this.mod;
    }

    @Nullable
    public final String component4() {
        return this.url;
    }

    @NotNull
    public final RadarGameBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new RadarGameBean(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadarGameBean)) {
            return false;
        }
        RadarGameBean radarGameBean = (RadarGameBean) obj;
        return Intrinsics.areEqual(this.activityToken, radarGameBean.activityToken) && Intrinsics.areEqual(this.cardGameVersion, radarGameBean.cardGameVersion) && Intrinsics.areEqual(this.mod, radarGameBean.mod) && Intrinsics.areEqual(this.url, radarGameBean.url);
    }

    @Nullable
    public final String getActivityToken() {
        return this.activityToken;
    }

    @Nullable
    public final String getCardGameVersion() {
        return this.cardGameVersion;
    }

    @Nullable
    public final String getMod() {
        return this.mod;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.activityToken;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.cardGameVersion;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.mod;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.url;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public final void setActivityToken(@Nullable String str) {
        this.activityToken = str;
    }

    public final void setCardGameVersion(@Nullable String str) {
        this.cardGameVersion = str;
    }

    public final void setMod(@Nullable String str) {
        this.mod = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        return A.a(this.mod, ", url=", this.url, ")", b.a("RadarGameBean(activityToken=", this.activityToken, ", cardGameVersion=", this.cardGameVersion, ", mod="));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.activityToken);
        parcel.writeString(this.cardGameVersion);
        parcel.writeString(this.mod);
        parcel.writeString(this.url);
    }
}
