package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/C0.class */
@StabilityInferred(parameters = 1)
public final class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f100824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f100825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f100826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f100827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final C6302a f100828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f100829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final StatInfoData f100830g;

    @Nullable
    public final Boolean h;

    public C0(@NotNull String str, long j7, long j8, long j9, @Nullable C6302a c6302a, @NotNull String str2, @Nullable StatInfoData statInfoData, @Nullable Boolean bool) {
        this.f100824a = str;
        this.f100825b = j7;
        this.f100826c = j8;
        this.f100827d = j9;
        this.f100828e = c6302a;
        this.f100829f = str2;
        this.f100830g = statInfoData;
        this.h = bool;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        return Intrinsics.areEqual(this.f100824a, c02.f100824a) && this.f100825b == c02.f100825b && this.f100826c == c02.f100826c && this.f100827d == c02.f100827d && Intrinsics.areEqual(this.f100828e, c02.f100828e) && Intrinsics.areEqual(this.f100829f, c02.f100829f) && Intrinsics.areEqual(this.f100830g, c02.f100830g) && Intrinsics.areEqual(this.h, c02.h);
    }

    public final int hashCode() {
        int iA = C3554n0.a(C3554n0.a(C3554n0.a(this.f100824a.hashCode() * 31, 31, this.f100825b), 31, this.f100826c), 31, this.f100827d);
        int iHashCode = 0;
        C6302a c6302a = this.f100828e;
        int iA2 = I.E.a((iA + (c6302a == null ? 0 : c6302a.hashCode())) * 31, 31, this.f100829f);
        StatInfoData statInfoData = this.f100830g;
        int iHashCode2 = statInfoData == null ? 0 : statInfoData.hashCode();
        Boolean bool = this.h;
        if (bool != null) {
            iHashCode = bool.hashCode();
        }
        return ((iA2 + iHashCode2) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelateLiveCard(name=");
        sb.append(this.f100824a);
        sb.append(", watchedShow=");
        sb.append(this.f100825b);
        sb.append(", liveStatus=");
        sb.append(this.f100826c);
        sb.append(", iconType=");
        sb.append(this.f100827d);
        sb.append(", recommendReason=");
        sb.append(this.f100828e);
        sb.append(", liveNewStyle=");
        sb.append(this.f100829f);
        sb.append(", statInfo=");
        sb.append(this.f100830g);
        sb.append(", showRcmdStyle=");
        return Fa.T.a(sb, this.h, ")");
    }
}
