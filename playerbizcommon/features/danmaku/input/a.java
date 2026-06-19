package com.bilibili.playerbizcommon.features.danmaku.input;

import androidx.compose.foundation.C3554n0;
import com.bilibili.playerbizcommon.api.DanmakuColorfulPanelInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/input/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f79674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f79675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public DanmakuColorfulPanelInfo f79676c;

    public a() {
        this(7);
    }

    public /* synthetic */ a(int i7) {
        this(false, 0L, null);
    }

    public a(boolean z6, long j7, @Nullable DanmakuColorfulPanelInfo danmakuColorfulPanelInfo) {
        this.f79674a = z6;
        this.f79675b = j7;
        this.f79676c = danmakuColorfulPanelInfo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f79674a == aVar.f79674a && this.f79675b == aVar.f79675b && Intrinsics.areEqual(this.f79676c, aVar.f79676c);
    }

    public final int hashCode() {
        int iA = C3554n0.a(Boolean.hashCode(this.f79674a) * 31, 31, this.f79675b);
        DanmakuColorfulPanelInfo danmakuColorfulPanelInfo = this.f79676c;
        return iA + (danmakuColorfulPanelInfo == null ? 0 : danmakuColorfulPanelInfo.hashCode());
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f79674a;
        long j7 = this.f79675b;
        DanmakuColorfulPanelInfo danmakuColorfulPanelInfo = this.f79676c;
        StringBuilder sbA = z4.e.a(j7, "DanmakuColorInfo(vipOrderPromotion=", ", colorful=", z6);
        sbA.append(", colorfulData=");
        sbA.append(danmakuColorfulPanelInfo);
        sbA.append(")");
        return sbA.toString();
    }
}
