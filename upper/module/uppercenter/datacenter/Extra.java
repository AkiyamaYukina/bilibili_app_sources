package com.bilibili.upper.module.uppercenter.datacenter;

import G0.b;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.A;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/datacenter/Extra.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Extra {
    public static final int $stable = 8;

    @JSONField(name = GameCardButton.extraAvid)
    @Nullable
    private String avid;

    @JSONField(name = CaptureSchema.MISSION_ID)
    @Nullable
    private String missionId;

    @JSONField(name = NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private String status;

    @JSONField(name = "type")
    @Nullable
    private String type;

    public Extra() {
        this(null, null, null, null, 15, null);
    }

    public Extra(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.type = str;
        this.status = str2;
        this.avid = str3;
        this.missionId = str4;
    }

    public /* synthetic */ Extra(String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ Extra copy$default(Extra extra, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = extra.type;
        }
        if ((i7 & 2) != 0) {
            str2 = extra.status;
        }
        if ((i7 & 4) != 0) {
            str3 = extra.avid;
        }
        if ((i7 & 8) != 0) {
            str4 = extra.missionId;
        }
        return extra.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.type;
    }

    @Nullable
    public final String component2() {
        return this.status;
    }

    @Nullable
    public final String component3() {
        return this.avid;
    }

    @Nullable
    public final String component4() {
        return this.missionId;
    }

    @NotNull
    public final Extra copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new Extra(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Extra)) {
            return false;
        }
        Extra extra = (Extra) obj;
        return Intrinsics.areEqual(this.type, extra.type) && Intrinsics.areEqual(this.status, extra.status) && Intrinsics.areEqual(this.avid, extra.avid) && Intrinsics.areEqual(this.missionId, extra.missionId);
    }

    @Nullable
    public final String getAvid() {
        return this.avid;
    }

    @Nullable
    public final String getMissionId() {
        return this.missionId;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.status;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.avid;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.missionId;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public final void setAvid(@Nullable String str) {
        this.avid = str;
    }

    public final void setMissionId(@Nullable String str) {
        this.missionId = str;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        return A.a(this.avid, ", missionId=", this.missionId, ")", b.a("Extra(type=", this.type, ", status=", this.status, ", avid="));
    }
}
