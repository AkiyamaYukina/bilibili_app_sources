package com.bilibili.ship.theseus.united.page.playviewextra;

import I.E;
import K7.L;
import RQ.l;
import androidx.compose.animation.z;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.infra.gson.DurationFromSecondsTypeAdapter;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.google.gson.annotations.JsonAdapter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/FullPromptBarVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class FullPromptBarVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f102379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TextVo f102380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final TextVo f102381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @JsonAdapter(DurationFromSecondsTypeAdapter.class)
    public final long f102382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f102383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<TextVo> f102384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final FoldDataVo f102385g;

    @Nullable
    public final ReportVo h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f102386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f102387j;

    public FullPromptBarVo() {
        throw null;
    }

    public FullPromptBarVo(String str, TextVo textVo, TextVo textVo2, long j7, boolean z6, List list, FoldDataVo foldDataVo, ReportVo reportVo, String str2, int i7) {
        this.f102379a = str;
        this.f102380b = textVo;
        this.f102381c = textVo2;
        this.f102382d = j7;
        this.f102383e = z6;
        this.f102384f = list;
        this.f102385g = foldDataVo;
        this.h = reportVo;
        this.f102386i = str2;
        this.f102387j = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullPromptBarVo)) {
            return false;
        }
        FullPromptBarVo fullPromptBarVo = (FullPromptBarVo) obj;
        return Intrinsics.areEqual(this.f102379a, fullPromptBarVo.f102379a) && Intrinsics.areEqual(this.f102380b, fullPromptBarVo.f102380b) && Intrinsics.areEqual(this.f102381c, fullPromptBarVo.f102381c) && Duration.equals-impl0(this.f102382d, fullPromptBarVo.f102382d) && this.f102383e == fullPromptBarVo.f102383e && Intrinsics.areEqual(this.f102384f, fullPromptBarVo.f102384f) && Intrinsics.areEqual(this.f102385g, fullPromptBarVo.f102385g) && Intrinsics.areEqual(this.h, fullPromptBarVo.h) && Intrinsics.areEqual(this.f102386i, fullPromptBarVo.f102386i) && this.f102387j == fullPromptBarVo.f102387j;
    }

    public final int hashCode() {
        int iHashCode = this.f102379a.hashCode();
        TextVo textVo = this.f102380b;
        int iHashCode2 = textVo == null ? 0 : textVo.hashCode();
        TextVo textVo2 = this.f102381c;
        int iA = e0.a(z.a(l.a(((((iHashCode * 31) + iHashCode2) * 31) + (textVo2 == null ? 0 : textVo2.hashCode())) * 31, 31, this.f102382d), 31, this.f102383e), 31, this.f102384f);
        FoldDataVo foldDataVo = this.f102385g;
        int iHashCode3 = foldDataVo == null ? 0 : foldDataVo.hashCode();
        ReportVo reportVo = this.h;
        return Integer.hashCode(this.f102387j) + E.a((((iA + iHashCode3) * 31) + (reportVo == null ? 0 : reportVo.hashCode())) * 31, 31, this.f102386i);
    }

    @NotNull
    public final String toString() {
        String str = Duration.toString-impl(this.f102382d);
        List<TextVo> list = this.f102384f;
        StringBuilder sb = new StringBuilder("FullPromptBarVo(icon=");
        sb.append(this.f102379a);
        sb.append(", title=");
        sb.append(this.f102380b);
        sb.append(", subtitle=");
        sb.append(this.f102381c);
        sb.append(", timerCountdown=");
        sb.append(str);
        sb.append(", countdownEnable=");
        L.b(sb, this.f102383e, ", buttons=", list, ", foldDataVo=");
        sb.append(this.f102385g);
        sb.append(", report=");
        sb.append(this.h);
        sb.append(", bgImage=");
        sb.append(this.f102386i);
        sb.append(", barHeight=");
        return C4277b.a(this.f102387j, ")", sb);
    }
}
