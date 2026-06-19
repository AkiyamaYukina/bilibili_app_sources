package com.bilibili.lib.projection.internal.projectionitem.base;

import I.E;
import Id.a;
import androidx.annotation.Keep;
import androidx.room.B;
import cf.j;
import com.bilibili.adcommon.utils.c;
import com.bilibili.search2.api.SearchBangumiItem;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/projectionitem/base/DeviceInfo.class */
@Keep
public final class DeviceInfo {

    @SerializedName("ott_build")
    @Nullable
    private Long ottBuild;

    @SerializedName("ott_buvid")
    @NotNull
    private String ottBuvid;

    @SerializedName("ott_mid")
    @Nullable
    private Long ottMid;

    @SerializedName("ott_mobi_app")
    @NotNull
    private String ottMobiApp;

    @SerializedName("pink_build")
    @Nullable
    private Integer pinkBuild;

    @SerializedName("pink_buvid")
    @NotNull
    private String pinkBuvid;

    @SerializedName("pink_mobi_app")
    @NotNull
    private String pinkMobiApp;

    public DeviceInfo() {
        this(null, null, null, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public DeviceInfo(@NotNull String str, @Nullable Integer num, @NotNull String str2, @NotNull String str3, @Nullable Long l7, @NotNull String str4, @Nullable Long l8) {
        this.pinkMobiApp = str;
        this.pinkBuild = num;
        this.pinkBuvid = str2;
        this.ottMobiApp = str3;
        this.ottBuild = l7;
        this.ottBuvid = str4;
        this.ottMid = l8;
    }

    public /* synthetic */ DeviceInfo(String str, Integer num, String str2, String str3, Long l7, String str4, Long l8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? "" : str2, (i7 & 8) != 0 ? "" : str3, (i7 & 16) != 0 ? null : l7, (i7 & 32) != 0 ? "" : str4, (i7 & 64) != 0 ? null : l8);
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, String str, Integer num, String str2, String str3, Long l7, String str4, Long l8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = deviceInfo.pinkMobiApp;
        }
        if ((i7 & 2) != 0) {
            num = deviceInfo.pinkBuild;
        }
        if ((i7 & 4) != 0) {
            str2 = deviceInfo.pinkBuvid;
        }
        if ((i7 & 8) != 0) {
            str3 = deviceInfo.ottMobiApp;
        }
        if ((i7 & 16) != 0) {
            l7 = deviceInfo.ottBuild;
        }
        if ((i7 & 32) != 0) {
            str4 = deviceInfo.ottBuvid;
        }
        if ((i7 & 64) != 0) {
            l8 = deviceInfo.ottMid;
        }
        return deviceInfo.copy(str, num, str2, str3, l7, str4, l8);
    }

    @NotNull
    public final String component1() {
        return this.pinkMobiApp;
    }

    @Nullable
    public final Integer component2() {
        return this.pinkBuild;
    }

    @NotNull
    public final String component3() {
        return this.pinkBuvid;
    }

    @NotNull
    public final String component4() {
        return this.ottMobiApp;
    }

    @Nullable
    public final Long component5() {
        return this.ottBuild;
    }

    @NotNull
    public final String component6() {
        return this.ottBuvid;
    }

    @Nullable
    public final Long component7() {
        return this.ottMid;
    }

    @NotNull
    public final DeviceInfo copy(@NotNull String str, @Nullable Integer num, @NotNull String str2, @NotNull String str3, @Nullable Long l7, @NotNull String str4, @Nullable Long l8) {
        return new DeviceInfo(str, num, str2, str3, l7, str4, l8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return Intrinsics.areEqual(this.pinkMobiApp, deviceInfo.pinkMobiApp) && Intrinsics.areEqual(this.pinkBuild, deviceInfo.pinkBuild) && Intrinsics.areEqual(this.pinkBuvid, deviceInfo.pinkBuvid) && Intrinsics.areEqual(this.ottMobiApp, deviceInfo.ottMobiApp) && Intrinsics.areEqual(this.ottBuild, deviceInfo.ottBuild) && Intrinsics.areEqual(this.ottBuvid, deviceInfo.ottBuvid) && Intrinsics.areEqual(this.ottMid, deviceInfo.ottMid);
    }

    @Nullable
    public final Long getOttBuild() {
        return this.ottBuild;
    }

    @NotNull
    public final String getOttBuvid() {
        return this.ottBuvid;
    }

    @Nullable
    public final Long getOttMid() {
        return this.ottMid;
    }

    @NotNull
    public final String getOttMobiApp() {
        return this.ottMobiApp;
    }

    @Nullable
    public final Integer getPinkBuild() {
        return this.pinkBuild;
    }

    @NotNull
    public final String getPinkBuvid() {
        return this.pinkBuvid;
    }

    @NotNull
    public final String getPinkMobiApp() {
        return this.pinkMobiApp;
    }

    public int hashCode() {
        int iHashCode = this.pinkMobiApp.hashCode();
        Integer num = this.pinkBuild;
        int iA = E.a(E.a(((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31, 31, this.pinkBuvid), 31, this.ottMobiApp);
        Long l7 = this.ottBuild;
        int iA2 = E.a((iA + (l7 == null ? 0 : l7.hashCode())) * 31, 31, this.ottBuvid);
        Long l8 = this.ottMid;
        return iA2 + (l8 == null ? 0 : l8.hashCode());
    }

    public final void setOttBuild(@Nullable Long l7) {
        this.ottBuild = l7;
    }

    public final void setOttBuvid(@NotNull String str) {
        this.ottBuvid = str;
    }

    public final void setOttMid(@Nullable Long l7) {
        this.ottMid = l7;
    }

    public final void setOttMobiApp(@NotNull String str) {
        this.ottMobiApp = str;
    }

    public final void setPinkBuild(@Nullable Integer num) {
        this.pinkBuild = num;
    }

    public final void setPinkBuvid(@NotNull String str) {
        this.pinkBuvid = str;
    }

    public final void setPinkMobiApp(@NotNull String str) {
        this.pinkMobiApp = str;
    }

    @NotNull
    public String toString() {
        String str = this.pinkMobiApp;
        Integer num = this.pinkBuild;
        String str2 = this.pinkBuvid;
        String str3 = this.ottMobiApp;
        Long l7 = this.ottBuild;
        String str4 = this.ottBuvid;
        Long l8 = this.ottMid;
        StringBuilder sbA = a.a("DeviceInfo(pinkMobiApp=", num, str, ", pinkBuild=", ", pinkBuvid=");
        B.a(str2, ", ottMobiApp=", str3, ", ottBuild=", sbA);
        j.a(sbA, l7, ", ottBuvid=", str4, ", ottMid=");
        return c.a(sbA, l8, ")");
    }
}
