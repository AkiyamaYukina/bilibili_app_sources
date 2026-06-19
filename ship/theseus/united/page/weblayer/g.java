package com.bilibili.ship.theseus.united.page.weblayer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/g.class */
@StabilityInferred(parameters = 1)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f104252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f104253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f104254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f104255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.danmaku.f f104256e;

    public g(@NotNull String str, boolean z6, boolean z7, boolean z8, @NotNull com.bilibili.ship.theseus.united.page.danmaku.f fVar) {
        this.f104252a = str;
        this.f104253b = z6;
        this.f104254c = z7;
        this.f104255d = z8;
        this.f104256e = fVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f104252a, gVar.f104252a) && this.f104253b == gVar.f104253b && this.f104254c == gVar.f104254c && this.f104255d == gVar.f104255d && Intrinsics.areEqual(this.f104256e, gVar.f104256e);
    }

    public final int hashCode() {
        return hashCode() + androidx.compose.animation.z.a(androidx.compose.animation.z.a(androidx.compose.animation.z.a(this.f104252a.hashCode() * 31, 31, this.f104253b), 31, this.f104254c), 31, this.f104255d);
    }

    @NotNull
    public final String toString() {
        return "SlangPediaLayerShowInfo(url=" + this.f104252a + ", needCloseIcon=" + this.f104253b + ", needVerticalScrollbar=" + this.f104254c + ", needKeyBoardListener=" + this.f104255d + ", onLayerDismiss=" + this.f104256e + ")";
    }
}
