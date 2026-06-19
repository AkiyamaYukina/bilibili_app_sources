package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.pub.community.BangumiBadgeInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/PlayListItemVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class PlayListItemVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f102617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f102618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f102619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BangumiBadgeInfo f102620e;

    public PlayListItemVo(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull BangumiBadgeInfo bangumiBadgeInfo) {
        this.f102616a = j7;
        this.f102617b = str;
        this.f102618c = str2;
        this.f102619d = str3;
        this.f102620e = bangumiBadgeInfo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayListItemVo)) {
            return false;
        }
        PlayListItemVo playListItemVo = (PlayListItemVo) obj;
        return this.f102616a == playListItemVo.f102616a && Intrinsics.areEqual(this.f102617b, playListItemVo.f102617b) && Intrinsics.areEqual(this.f102618c, playListItemVo.f102618c) && Intrinsics.areEqual(this.f102619d, playListItemVo.f102619d) && Intrinsics.areEqual(this.f102620e, playListItemVo.f102620e);
    }

    public final int hashCode() {
        return this.f102620e.hashCode() + I.E.a(I.E.a(I.E.a(Long.hashCode(this.f102616a) * 31, 31, this.f102617b), 31, this.f102618c), 31, this.f102619d);
    }

    @NotNull
    public final String toString() {
        return "PlayListItemVo(seasonId=" + this.f102616a + ", title=" + this.f102617b + ", cover=" + this.f102618c + ", link=" + this.f102619d + ", badgeInfo=" + this.f102620e + ")";
    }
}
