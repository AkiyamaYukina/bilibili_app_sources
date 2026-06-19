package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.bean.VideoDimension;
import com.bilibili.ship.theseus.united.page.view.StatData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/j0.class */
@StabilityInferred(parameters = 0)
public final class C6321j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Long f101263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f101264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final VideoDimension f101265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StatData f101266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f101267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final C6302a f101268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f101269g;

    @Nullable
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Boolean f101270i;

    public C6321j0(@Nullable Long l7, long j7, @NotNull VideoDimension videoDimension, @NotNull StatData statData, @NotNull String str, @Nullable C6302a c6302a, boolean z6, @Nullable String str2, @Nullable Boolean bool) {
        this.f101263a = l7;
        this.f101264b = j7;
        this.f101265c = videoDimension;
        this.f101266d = statData;
        this.f101267e = str;
        this.f101268f = c6302a;
        this.f101269g = z6;
        this.h = str2;
        this.f101270i = bool;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6321j0)) {
            return false;
        }
        C6321j0 c6321j0 = (C6321j0) obj;
        return Intrinsics.areEqual(this.f101263a, c6321j0.f101263a) && this.f101264b == c6321j0.f101264b && Intrinsics.areEqual(this.f101265c, c6321j0.f101265c) && Intrinsics.areEqual(this.f101266d, c6321j0.f101266d) && Intrinsics.areEqual(this.f101267e, c6321j0.f101267e) && Intrinsics.areEqual(this.f101268f, c6321j0.f101268f) && this.f101269g == c6321j0.f101269g && Intrinsics.areEqual(this.h, c6321j0.h) && Intrinsics.areEqual(this.f101270i, c6321j0.f101270i);
    }

    public final int hashCode() {
        int iHashCode = 0;
        Long l7 = this.f101263a;
        int iA = I.E.a((this.f101266d.hashCode() + ((this.f101265c.hashCode() + C3554n0.a((l7 == null ? 0 : l7.hashCode()) * 31, 31, this.f101264b)) * 31)) * 31, 31, this.f101267e);
        C6302a c6302a = this.f101268f;
        int iA2 = androidx.compose.animation.z.a((iA + (c6302a == null ? 0 : c6302a.hashCode())) * 31, 31, this.f101269g);
        String str = this.h;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Boolean bool = this.f101270i;
        if (bool != null) {
            iHashCode = bool.hashCode();
        }
        return ((iA2 + iHashCode2) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelateAvCard(duration=");
        sb.append(this.f101263a);
        sb.append(", cid=");
        sb.append(this.f101264b);
        sb.append(", dimension=");
        sb.append(this.f101265c);
        sb.append(", stat=");
        sb.append(this.f101266d);
        sb.append(", jumpUrl=");
        sb.append(this.f101267e);
        sb.append(", rcmdReason=");
        sb.append(this.f101268f);
        sb.append(", showUpName=");
        sb.append(this.f101269g);
        sb.append(", durationText=");
        sb.append(this.h);
        sb.append(", showRcmdStyle=");
        return Fa.T.a(sb, this.f101270i, ")");
    }
}
