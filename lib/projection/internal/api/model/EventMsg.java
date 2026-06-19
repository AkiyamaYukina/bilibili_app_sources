package com.bilibili.lib.projection.internal.api.model;

import H0.e;
import I.E;
import Id.a;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/EventMsg.class */
@Keep
public final class EventMsg {

    @SerializedName("biz_session_id")
    @NotNull
    private String bizSessionId;

    @SerializedName("cmd_type")
    @Nullable
    private Integer cmdType;

    @SerializedName("device_type")
    @NotNull
    private String deviceType;

    @SerializedName("ott_build")
    private int ottBuild;

    @SerializedName("ott_buvid")
    @NotNull
    private String ottBuvid;

    public EventMsg() {
        this(null, null, null, 0, null, 31, null);
    }

    public EventMsg(@NotNull String str, @Nullable Integer num, @NotNull String str2, int i7, @NotNull String str3) {
        this.bizSessionId = str;
        this.cmdType = num;
        this.deviceType = str2;
        this.ottBuild = i7;
        this.ottBuvid = str3;
    }

    public /* synthetic */ EventMsg(String str, Integer num, String str2, int i7, String str3, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? null : num, (i8 & 4) != 0 ? "" : str2, (i8 & 8) != 0 ? -1 : i7, (i8 & 16) != 0 ? "" : str3);
    }

    public static /* synthetic */ EventMsg copy$default(EventMsg eventMsg, String str, Integer num, String str2, int i7, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = eventMsg.bizSessionId;
        }
        if ((i8 & 2) != 0) {
            num = eventMsg.cmdType;
        }
        if ((i8 & 4) != 0) {
            str2 = eventMsg.deviceType;
        }
        if ((i8 & 8) != 0) {
            i7 = eventMsg.ottBuild;
        }
        if ((i8 & 16) != 0) {
            str3 = eventMsg.ottBuvid;
        }
        return eventMsg.copy(str, num, str2, i7, str3);
    }

    @NotNull
    public final String component1() {
        return this.bizSessionId;
    }

    @Nullable
    public final Integer component2() {
        return this.cmdType;
    }

    @NotNull
    public final String component3() {
        return this.deviceType;
    }

    public final int component4() {
        return this.ottBuild;
    }

    @NotNull
    public final String component5() {
        return this.ottBuvid;
    }

    @NotNull
    public final EventMsg copy(@NotNull String str, @Nullable Integer num, @NotNull String str2, int i7, @NotNull String str3) {
        return new EventMsg(str, num, str2, i7, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventMsg)) {
            return false;
        }
        EventMsg eventMsg = (EventMsg) obj;
        return Intrinsics.areEqual(this.bizSessionId, eventMsg.bizSessionId) && Intrinsics.areEqual(this.cmdType, eventMsg.cmdType) && Intrinsics.areEqual(this.deviceType, eventMsg.deviceType) && this.ottBuild == eventMsg.ottBuild && Intrinsics.areEqual(this.ottBuvid, eventMsg.ottBuvid);
    }

    @NotNull
    public final String getBizSessionId() {
        return this.bizSessionId;
    }

    @Nullable
    public final Integer getCmdType() {
        return this.cmdType;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    public final int getOttBuild() {
        return this.ottBuild;
    }

    @NotNull
    public final String getOttBuvid() {
        return this.ottBuvid;
    }

    public int hashCode() {
        int iHashCode = this.bizSessionId.hashCode();
        Integer num = this.cmdType;
        return this.ottBuvid.hashCode() + I.a(this.ottBuild, E.a(((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31, 31, this.deviceType), 31);
    }

    public final void setBizSessionId(@NotNull String str) {
        this.bizSessionId = str;
    }

    public final void setCmdType(@Nullable Integer num) {
        this.cmdType = num;
    }

    public final void setDeviceType(@NotNull String str) {
        this.deviceType = str;
    }

    public final void setOttBuild(int i7) {
        this.ottBuild = i7;
    }

    public final void setOttBuvid(@NotNull String str) {
        this.ottBuvid = str;
    }

    @NotNull
    public String toString() {
        String str = this.bizSessionId;
        Integer num = this.cmdType;
        String str2 = this.deviceType;
        int i7 = this.ottBuild;
        String str3 = this.ottBuvid;
        StringBuilder sbA = a.a("EventMsg(bizSessionId=", num, str, ", cmdType=", ", deviceType=");
        e.b(i7, str2, ", ottBuild=", ", ottBuvid=", sbA);
        return C8770a.a(sbA, str3, ")");
    }
}
