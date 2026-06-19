package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.C8711a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/ReportVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ReportVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("show_event_id")
    @NotNull
    private final String f102632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("click_event_id")
    @NotNull
    private final String f102633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("extends")
    @NotNull
    private final Map<String, String> f102634c;

    public ReportVo(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        this.f102632a = str;
        this.f102633b = str2;
        this.f102634c = map;
    }

    public static ReportVo a(ReportVo reportVo, Map map) {
        String str = reportVo.f102632a;
        String str2 = reportVo.f102633b;
        reportVo.getClass();
        return new ReportVo(str, str2, map);
    }

    @NotNull
    public final String b() {
        return this.f102633b;
    }

    @NotNull
    public final Map<String, String> c() {
        return this.f102634c;
    }

    @NotNull
    public final String d() {
        return this.f102632a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportVo)) {
            return false;
        }
        ReportVo reportVo = (ReportVo) obj;
        return Intrinsics.areEqual(this.f102632a, reportVo.f102632a) && Intrinsics.areEqual(this.f102633b, reportVo.f102633b) && Intrinsics.areEqual(this.f102634c, reportVo.f102634c);
    }

    public final int hashCode() {
        return this.f102634c.hashCode() + I.E.a(this.f102632a.hashCode() * 31, 31, this.f102633b);
    }

    @NotNull
    public final String toString() {
        String str = this.f102632a;
        String str2 = this.f102633b;
        return C8711a.a(G0.b.a("ReportVo(showEventId=", str, ", clickEventId=", str2, ", exts="), this.f102634c, ")");
    }
}
