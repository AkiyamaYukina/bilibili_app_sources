package com.bilibili.playerbizcommonv2.service;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.api.DanmakuColorfulPanelInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/a.class */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f81820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f81821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public DanmakuColorfulPanelInfo f81822c;

    public a() {
        this(7);
    }

    public /* synthetic */ a(int i7) {
        this(false, 0L, null);
    }

    public a(boolean z6, long j7, @Nullable DanmakuColorfulPanelInfo danmakuColorfulPanelInfo) {
        this.f81820a = z6;
        this.f81821b = j7;
        this.f81822c = danmakuColorfulPanelInfo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f81820a == aVar.f81820a && this.f81821b == aVar.f81821b && Intrinsics.areEqual(this.f81822c, aVar.f81822c);
    }

    public final int hashCode() {
        int iA = C3554n0.a(Boolean.hashCode(this.f81820a) * 31, 31, this.f81821b);
        DanmakuColorfulPanelInfo danmakuColorfulPanelInfo = this.f81822c;
        return iA + (danmakuColorfulPanelInfo == null ? 0 : danmakuColorfulPanelInfo.hashCode());
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f81820a;
        long j7 = this.f81821b;
        DanmakuColorfulPanelInfo danmakuColorfulPanelInfo = this.f81822c;
        StringBuilder sbA = z4.e.a(j7, "DanmakuColorInfo(vipOrderPromotion=", ", colorful=", z6);
        sbA.append(", colorfulData=");
        sbA.append(danmakuColorfulPanelInfo);
        sbA.append(")");
        return sbA.toString();
    }
}
