package com.bilibili.lib.projection.internal.ottBlink;

import G0.b;
import I.E;
import androidx.annotation.Keep;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.fragment.app.D;
import androidx.media3.common.util.C4638g;
import androidx.room.B;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/ottBlink/DeviceMsg.class */
@Keep
public final class DeviceMsg {

    @SerializedName("autoPullId")
    @NotNull
    private String autoPullId;

    @SerializedName("brand_name")
    @NotNull
    private String brandName;

    @SerializedName("uuid")
    @NotNull
    private String buvid;

    @SerializedName("channelName")
    @NotNull
    private String channelName;

    @SerializedName("friendlyName")
    @NotNull
    private String friendlyName;

    @SerializedName("manufacture")
    @NotNull
    private String manufacture;

    @SerializedName("model_name")
    @NotNull
    private String modelName;

    @SerializedName("needNvaExtra")
    private boolean needNvaExtra;

    @SerializedName("ottVersion")
    private long ottVersion;

    @SerializedName("address")
    @NotNull
    private String pinkMobiApp;

    @SerializedName("support4k")
    private boolean support4k;

    public DeviceMsg() {
        this(null, null, null, null, null, null, null, 0L, false, false, null, 2047, null);
    }

    public DeviceMsg(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, long j7, boolean z6, boolean z7, @NotNull String str8) {
        this.pinkMobiApp = str;
        this.buvid = str2;
        this.friendlyName = str3;
        this.modelName = str4;
        this.brandName = str5;
        this.manufacture = str6;
        this.channelName = str7;
        this.ottVersion = j7;
        this.support4k = z6;
        this.needNvaExtra = z7;
        this.autoPullId = str8;
    }

    public /* synthetic */ DeviceMsg(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j7, boolean z6, boolean z7, String str8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? "" : str4, (i7 & 16) != 0 ? "" : str5, (i7 & 32) != 0 ? "" : str6, (i7 & 64) != 0 ? "" : str7, (i7 & 128) != 0 ? 0L : j7, (i7 & 256) != 0 ? false : z6, (i7 & 512) != 0 ? false : z7, (i7 & 1024) != 0 ? "" : str8);
    }

    public static /* synthetic */ DeviceMsg copy$default(DeviceMsg deviceMsg, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j7, boolean z6, boolean z7, String str8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = deviceMsg.pinkMobiApp;
        }
        if ((i7 & 2) != 0) {
            str2 = deviceMsg.buvid;
        }
        if ((i7 & 4) != 0) {
            str3 = deviceMsg.friendlyName;
        }
        if ((i7 & 8) != 0) {
            str4 = deviceMsg.modelName;
        }
        if ((i7 & 16) != 0) {
            str5 = deviceMsg.brandName;
        }
        if ((i7 & 32) != 0) {
            str6 = deviceMsg.manufacture;
        }
        if ((i7 & 64) != 0) {
            str7 = deviceMsg.channelName;
        }
        if ((i7 & 128) != 0) {
            j7 = deviceMsg.ottVersion;
        }
        if ((i7 & 256) != 0) {
            z6 = deviceMsg.support4k;
        }
        if ((i7 & 512) != 0) {
            z7 = deviceMsg.needNvaExtra;
        }
        if ((i7 & 1024) != 0) {
            str8 = deviceMsg.autoPullId;
        }
        return deviceMsg.copy(str, str2, str3, str4, str5, str6, str7, j7, z6, z7, str8);
    }

    @NotNull
    public final String component1() {
        return this.pinkMobiApp;
    }

    public final boolean component10() {
        return this.needNvaExtra;
    }

    @NotNull
    public final String component11() {
        return this.autoPullId;
    }

    @NotNull
    public final String component2() {
        return this.buvid;
    }

    @NotNull
    public final String component3() {
        return this.friendlyName;
    }

    @NotNull
    public final String component4() {
        return this.modelName;
    }

    @NotNull
    public final String component5() {
        return this.brandName;
    }

    @NotNull
    public final String component6() {
        return this.manufacture;
    }

    @NotNull
    public final String component7() {
        return this.channelName;
    }

    public final long component8() {
        return this.ottVersion;
    }

    public final boolean component9() {
        return this.support4k;
    }

    @NotNull
    public final DeviceMsg copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, long j7, boolean z6, boolean z7, @NotNull String str8) {
        return new DeviceMsg(str, str2, str3, str4, str5, str6, str7, j7, z6, z7, str8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceMsg)) {
            return false;
        }
        DeviceMsg deviceMsg = (DeviceMsg) obj;
        return Intrinsics.areEqual(this.pinkMobiApp, deviceMsg.pinkMobiApp) && Intrinsics.areEqual(this.buvid, deviceMsg.buvid) && Intrinsics.areEqual(this.friendlyName, deviceMsg.friendlyName) && Intrinsics.areEqual(this.modelName, deviceMsg.modelName) && Intrinsics.areEqual(this.brandName, deviceMsg.brandName) && Intrinsics.areEqual(this.manufacture, deviceMsg.manufacture) && Intrinsics.areEqual(this.channelName, deviceMsg.channelName) && this.ottVersion == deviceMsg.ottVersion && this.support4k == deviceMsg.support4k && this.needNvaExtra == deviceMsg.needNvaExtra && Intrinsics.areEqual(this.autoPullId, deviceMsg.autoPullId);
    }

    @NotNull
    public final String getAutoPullId() {
        return this.autoPullId;
    }

    @NotNull
    public final String getBrandName() {
        return this.brandName;
    }

    @NotNull
    public final String getBuvid() {
        return this.buvid;
    }

    @NotNull
    public final String getChannelName() {
        return this.channelName;
    }

    @NotNull
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    @NotNull
    public final String getManufacture() {
        return this.manufacture;
    }

    @NotNull
    public final String getModelName() {
        return this.modelName;
    }

    public final boolean getNeedNvaExtra() {
        return this.needNvaExtra;
    }

    public final long getOttVersion() {
        return this.ottVersion;
    }

    @NotNull
    public final String getPinkMobiApp() {
        return this.pinkMobiApp;
    }

    public final boolean getSupport4k() {
        return this.support4k;
    }

    public int hashCode() {
        return this.autoPullId.hashCode() + z.a(z.a(C3554n0.a(E.a(E.a(E.a(E.a(E.a(E.a(this.pinkMobiApp.hashCode() * 31, 31, this.buvid), 31, this.friendlyName), 31, this.modelName), 31, this.brandName), 31, this.manufacture), 31, this.channelName), 31, this.ottVersion), 31, this.support4k), 31, this.needNvaExtra);
    }

    public final void setAutoPullId(@NotNull String str) {
        this.autoPullId = str;
    }

    public final void setBrandName(@NotNull String str) {
        this.brandName = str;
    }

    public final void setBuvid(@NotNull String str) {
        this.buvid = str;
    }

    public final void setChannelName(@NotNull String str) {
        this.channelName = str;
    }

    public final void setFriendlyName(@NotNull String str) {
        this.friendlyName = str;
    }

    public final void setManufacture(@NotNull String str) {
        this.manufacture = str;
    }

    public final void setModelName(@NotNull String str) {
        this.modelName = str;
    }

    public final void setNeedNvaExtra(boolean z6) {
        this.needNvaExtra = z6;
    }

    public final void setOttVersion(long j7) {
        this.ottVersion = j7;
    }

    public final void setPinkMobiApp(@NotNull String str) {
        this.pinkMobiApp = str;
    }

    public final void setSupport4k(boolean z6) {
        this.support4k = z6;
    }

    @NotNull
    public String toString() {
        String str = this.pinkMobiApp;
        String str2 = this.buvid;
        String str3 = this.friendlyName;
        String str4 = this.modelName;
        String str5 = this.brandName;
        String str6 = this.manufacture;
        String str7 = this.channelName;
        long j7 = this.ottVersion;
        boolean z6 = this.support4k;
        boolean z7 = this.needNvaExtra;
        String str8 = this.autoPullId;
        StringBuilder sbA = b.a("DeviceMsg(pinkMobiApp=", str, ", buvid=", str2, ", friendlyName=");
        B.a(str3, ", modelName=", str4, ", brandName=", sbA);
        B.a(str5, ", manufacture=", str6, ", channelName=", sbA);
        v.a(j7, str7, ", ottVersion=", sbA);
        C4638g.b(", support4k=", ", needNvaExtra=", sbA, z6, z7);
        return D.a(", autoPullId=", str8, ")", sbA);
    }
}
