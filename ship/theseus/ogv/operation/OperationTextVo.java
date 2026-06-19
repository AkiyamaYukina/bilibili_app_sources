package com.bilibili.ship.theseus.ogv.operation;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.room.B;
import com.bilibili.bson.adapter.FirstFromListAdapter;
import com.bilibili.bson.common.Bson;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.tencent.map.geolocation.TencentLocation;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OperationTextVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OperationTextVo implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f94106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f94107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("text_color")
    @JsonAdapter(FirstFromListAdapter.class)
    @Nullable
    private final String f94108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("bg_color")
    @NotNull
    private final List<String> f94109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName(TencentLocation.EXTRA_DIRECTION)
    @NotNull
    private final OgvColorDirection f94110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("event_ids")
    @Nullable
    private final OperationReportEvents f94111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("track_params")
    @NotNull
    private final Map<String, String> f94112g;

    @NotNull
    public final Map<String, String> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final OgvClickTarget f94113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient boolean f94114j;

    public OperationTextVo() {
        this(null, null, null, null, null, null, null, null, null, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE);
    }

    public OperationTextVo(String str, String str2, String str3, List list, OgvColorDirection ogvColorDirection, OperationReportEvents operationReportEvents, Map map, Map map2, OgvClickTarget ogvClickTarget, int i7) {
        str = (i7 & 1) != 0 ? "" : str;
        str2 = (i7 & 2) != 0 ? "" : str2;
        str3 = (i7 & 4) != 0 ? null : str3;
        list = (i7 & 8) != 0 ? CollectionsKt.emptyList() : list;
        ogvColorDirection = (i7 & 16) != 0 ? OgvColorDirection.Horizontal : ogvColorDirection;
        operationReportEvents = (i7 & 32) != 0 ? null : operationReportEvents;
        map = (i7 & 64) != 0 ? MapsKt.emptyMap() : map;
        map2 = (i7 & 128) != 0 ? MapsKt.emptyMap() : map2;
        ogvClickTarget = (i7 & 256) != 0 ? null : ogvClickTarget;
        this.f94106a = str;
        this.f94107b = str2;
        this.f94108c = str3;
        this.f94109d = list;
        this.f94110e = ogvColorDirection;
        this.f94111f = operationReportEvents;
        this.f94112g = map;
        this.h = map2;
        this.f94113i = ogvClickTarget;
    }

    @Override // com.bilibili.ship.theseus.ogv.operation.d
    public final void a() {
        this.f94114j = true;
    }

    @Override // com.bilibili.ship.theseus.ogv.operation.d
    public final boolean b() {
        return this.f94114j;
    }

    @NotNull
    public final OgvColorDirection c() {
        return this.f94110e;
    }

    @NotNull
    public final List<String> d() {
        return this.f94109d;
    }

    @Nullable
    public final OperationReportEvents e() {
        return this.f94111f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OperationTextVo)) {
            return false;
        }
        OperationTextVo operationTextVo = (OperationTextVo) obj;
        return Intrinsics.areEqual(this.f94106a, operationTextVo.f94106a) && Intrinsics.areEqual(this.f94107b, operationTextVo.f94107b) && Intrinsics.areEqual(this.f94108c, operationTextVo.f94108c) && Intrinsics.areEqual(this.f94109d, operationTextVo.f94109d) && this.f94110e == operationTextVo.f94110e && Intrinsics.areEqual(this.f94111f, operationTextVo.f94111f) && Intrinsics.areEqual(this.f94112g, operationTextVo.f94112g) && Intrinsics.areEqual(this.h, operationTextVo.h) && Intrinsics.areEqual(this.f94113i, operationTextVo.f94113i);
    }

    @NotNull
    public final Map<String, String> f() {
        return this.f94112g;
    }

    @Nullable
    public final String g() {
        return this.f94108c;
    }

    @Override // com.bilibili.ship.theseus.ogv.operation.d
    @NotNull
    public final Map<String, String> getParams() {
        return this.f94112g;
    }

    @Override // com.bilibili.ship.theseus.ogv.operation.d
    @Nullable
    public final String getShowEventId() {
        OperationReportEvents operationReportEvents = this.f94111f;
        return operationReportEvents != null ? operationReportEvents.f94103a : null;
    }

    public final int hashCode() {
        int iA = E.a(this.f94106a.hashCode() * 31, 31, this.f94107b);
        String str = this.f94108c;
        int iA2 = e0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f94109d);
        int iHashCode = this.f94110e.hashCode();
        OperationReportEvents operationReportEvents = this.f94111f;
        int iA3 = J2.g.a(J2.g.a((((iHashCode + iA2) * 31) + (operationReportEvents == null ? 0 : operationReportEvents.hashCode())) * 31, this.f94112g, 31), this.h, 31);
        OgvClickTarget ogvClickTarget = this.f94113i;
        return iA3 + (ogvClickTarget == null ? 0 : ogvClickTarget.hashCode());
    }

    @NotNull
    public final String toString() {
        String str = this.f94108c;
        List<String> list = this.f94109d;
        OgvColorDirection ogvColorDirection = this.f94110e;
        OperationReportEvents operationReportEvents = this.f94111f;
        Map<String, String> map = this.f94112g;
        Map<String, String> map2 = this.h;
        StringBuilder sb = new StringBuilder("OperationTextVo(code=");
        sb.append(this.f94106a);
        sb.append(", text=");
        B.a(this.f94107b, ", textColorName=", str, ", backgroundColorNames=", sb);
        sb.append(list);
        sb.append(", backgroundColorDirection=");
        sb.append(ogvColorDirection);
        sb.append(", eventIds=");
        sb.append(operationReportEvents);
        sb.append(", reportParams=");
        sb.append(map);
        sb.append(", extraParams=");
        sb.append(map2);
        sb.append(", clickTarget=");
        sb.append(this.f94113i);
        sb.append(")");
        return sb.toString();
    }
}
