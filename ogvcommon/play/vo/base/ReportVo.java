package com.bilibili.ogvcommon.play.vo.base;

import G0.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.C8711a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/base/ReportVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ReportVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("show_event_id")
    @Nullable
    private final String f73344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("click_event_id")
    @Nullable
    private final String f73345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("extends")
    @Nullable
    private final Map<String, String> f73346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final transient String f73347d;

    public ReportVo(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map) {
        this.f73344a = str;
        this.f73345b = str2;
        this.f73346c = map;
        this.f73347d = map != null ? map.get("tips_repeat_key") : null;
    }

    @Nullable
    public final String a() {
        return this.f73345b;
    }

    @Nullable
    public final Map<String, String> b() {
        return this.f73346c;
    }

    @Nullable
    public final String c() {
        return this.f73344a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportVo)) {
            return false;
        }
        ReportVo reportVo = (ReportVo) obj;
        return Intrinsics.areEqual(this.f73344a, reportVo.f73344a) && Intrinsics.areEqual(this.f73345b, reportVo.f73345b) && Intrinsics.areEqual(this.f73346c, reportVo.f73346c);
    }

    public final int hashCode() {
        String str = this.f73344a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f73345b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Map<String, String> map = this.f73346c;
        if (map != null) {
            iHashCode = map.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        String str = this.f73344a;
        String str2 = this.f73345b;
        return C8711a.a(b.a("ReportVo(showEventId=", str, ", clickEventId=", str2, ", exts="), this.f73346c, ")");
    }
}
