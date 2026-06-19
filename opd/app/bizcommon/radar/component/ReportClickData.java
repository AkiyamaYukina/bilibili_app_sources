package com.bilibili.opd.app.bizcommon.radar.component;

import G0.b;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.opd.app.bizcommon.radar.data.AttachPageInfo;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/component/ReportClickData.class */
@StabilityInferred(parameters = 0)
@Keep
public final class ReportClickData {
    public static final int $stable = 8;

    @Nullable
    private String actId;

    @Nullable
    private String actUrl;

    @Nullable
    private String actionParams;

    @Nullable
    private Integer actionUsage;

    @Nullable
    private AttachPageInfo attachPageInfo;

    @Nullable
    private String group;

    @Nullable
    private String id;

    @Nullable
    private String jumpAction;

    @Nullable
    private Map<String, String> reportParams;

    @Nullable
    private String type;

    public ReportClickData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Map<String, String> map, @Nullable AttachPageInfo attachPageInfo, @Nullable Integer num, @Nullable String str7) {
        this.type = str;
        this.id = str2;
        this.actUrl = str3;
        this.actId = str4;
        this.group = str5;
        this.jumpAction = str6;
        this.reportParams = map;
        this.attachPageInfo = attachPageInfo;
        this.actionUsage = num;
        this.actionParams = str7;
    }

    public /* synthetic */ ReportClickData(String str, String str2, String str3, String str4, String str5, String str6, Map map, AttachPageInfo attachPageInfo, Integer num, String str7, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? "" : str4, (i7 & 16) != 0 ? "" : str5, (i7 & 32) != 0 ? "" : str6, map, attachPageInfo, (i7 & 256) != 0 ? 0 : num, (i7 & 512) != 0 ? "" : str7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReportClickData copy$default(ReportClickData reportClickData, String str, String str2, String str3, String str4, String str5, String str6, Map map, AttachPageInfo attachPageInfo, Integer num, String str7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = reportClickData.type;
        }
        if ((i7 & 2) != 0) {
            str2 = reportClickData.id;
        }
        if ((i7 & 4) != 0) {
            str3 = reportClickData.actUrl;
        }
        if ((i7 & 8) != 0) {
            str4 = reportClickData.actId;
        }
        if ((i7 & 16) != 0) {
            str5 = reportClickData.group;
        }
        if ((i7 & 32) != 0) {
            str6 = reportClickData.jumpAction;
        }
        if ((i7 & 64) != 0) {
            map = reportClickData.reportParams;
        }
        if ((i7 & 128) != 0) {
            attachPageInfo = reportClickData.attachPageInfo;
        }
        if ((i7 & 256) != 0) {
            num = reportClickData.actionUsage;
        }
        if ((i7 & 512) != 0) {
            str7 = reportClickData.actionParams;
        }
        return reportClickData.copy(str, str2, str3, str4, str5, str6, map, attachPageInfo, num, str7);
    }

    @Nullable
    public final String component1() {
        return this.type;
    }

    @Nullable
    public final String component10() {
        return this.actionParams;
    }

    @Nullable
    public final String component2() {
        return this.id;
    }

    @Nullable
    public final String component3() {
        return this.actUrl;
    }

    @Nullable
    public final String component4() {
        return this.actId;
    }

    @Nullable
    public final String component5() {
        return this.group;
    }

    @Nullable
    public final String component6() {
        return this.jumpAction;
    }

    @Nullable
    public final Map<String, String> component7() {
        return this.reportParams;
    }

    @Nullable
    public final AttachPageInfo component8() {
        return this.attachPageInfo;
    }

    @Nullable
    public final Integer component9() {
        return this.actionUsage;
    }

    @NotNull
    public final ReportClickData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Map<String, String> map, @Nullable AttachPageInfo attachPageInfo, @Nullable Integer num, @Nullable String str7) {
        return new ReportClickData(str, str2, str3, str4, str5, str6, map, attachPageInfo, num, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportClickData)) {
            return false;
        }
        ReportClickData reportClickData = (ReportClickData) obj;
        return Intrinsics.areEqual(this.type, reportClickData.type) && Intrinsics.areEqual(this.id, reportClickData.id) && Intrinsics.areEqual(this.actUrl, reportClickData.actUrl) && Intrinsics.areEqual(this.actId, reportClickData.actId) && Intrinsics.areEqual(this.group, reportClickData.group) && Intrinsics.areEqual(this.jumpAction, reportClickData.jumpAction) && Intrinsics.areEqual(this.reportParams, reportClickData.reportParams) && Intrinsics.areEqual(this.attachPageInfo, reportClickData.attachPageInfo) && Intrinsics.areEqual(this.actionUsage, reportClickData.actionUsage) && Intrinsics.areEqual(this.actionParams, reportClickData.actionParams);
    }

    @Nullable
    public final String getActId() {
        return this.actId;
    }

    @Nullable
    public final String getActUrl() {
        return this.actUrl;
    }

    @Nullable
    public final String getActionParams() {
        return this.actionParams;
    }

    @Nullable
    public final Integer getActionUsage() {
        return this.actionUsage;
    }

    @Nullable
    public final AttachPageInfo getAttachPageInfo() {
        return this.attachPageInfo;
    }

    @Nullable
    public final String getGroup() {
        return this.group;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getJumpAction() {
        return this.jumpAction;
    }

    @Nullable
    public final Map<String, String> getReportParams() {
        return this.reportParams;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.id;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.actUrl;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.actId;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.group;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.jumpAction;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        Map<String, String> map = this.reportParams;
        int iHashCode8 = map == null ? 0 : map.hashCode();
        AttachPageInfo attachPageInfo = this.attachPageInfo;
        int iHashCode9 = attachPageInfo == null ? 0 : attachPageInfo.hashCode();
        Integer num = this.actionUsage;
        int iHashCode10 = num == null ? 0 : num.hashCode();
        String str7 = this.actionParams;
        if (str7 != null) {
            iHashCode = str7.hashCode();
        }
        return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode;
    }

    public final void setActId(@Nullable String str) {
        this.actId = str;
    }

    public final void setActUrl(@Nullable String str) {
        this.actUrl = str;
    }

    public final void setActionParams(@Nullable String str) {
        this.actionParams = str;
    }

    public final void setActionUsage(@Nullable Integer num) {
        this.actionUsage = num;
    }

    public final void setAttachPageInfo(@Nullable AttachPageInfo attachPageInfo) {
        this.attachPageInfo = attachPageInfo;
    }

    public final void setGroup(@Nullable String str) {
        this.group = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setJumpAction(@Nullable String str) {
        this.jumpAction = str;
    }

    public final void setReportParams(@Nullable Map<String, String> map) {
        this.reportParams = map;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.id;
        String str3 = this.actUrl;
        String str4 = this.actId;
        String str5 = this.group;
        String str6 = this.jumpAction;
        Map<String, String> map = this.reportParams;
        AttachPageInfo attachPageInfo = this.attachPageInfo;
        Integer num = this.actionUsage;
        String str7 = this.actionParams;
        StringBuilder sbA = b.a("ReportClickData(type=", str, ", id=", str2, ", actUrl=");
        B.a(str3, ", actId=", str4, ", group=", sbA);
        B.a(str5, ", jumpAction=", str6, ", reportParams=", sbA);
        sbA.append(map);
        sbA.append(", attachPageInfo=");
        sbA.append(attachPageInfo);
        sbA.append(", actionUsage=");
        sbA.append(num);
        sbA.append(", actionParams=");
        sbA.append(str7);
        sbA.append(")");
        return sbA.toString();
    }
}
