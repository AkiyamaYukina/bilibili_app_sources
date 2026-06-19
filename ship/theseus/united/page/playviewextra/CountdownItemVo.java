package com.bilibili.ship.theseus.united.page.playviewextra;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.infra.gson.DurationFromSecondsTypeAdapter;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.google.gson.annotations.JsonAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/CountdownItemVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class CountdownItemVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @JsonAdapter(DurationFromSecondsTypeAdapter.class)
    public final long f102372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TextVo f102373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final TextVo f102374c;

    public CountdownItemVo(long j7, TextVo textVo, TextVo textVo2) {
        this.f102372a = j7;
        this.f102373b = textVo;
        this.f102374c = textVo2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountdownItemVo)) {
            return false;
        }
        CountdownItemVo countdownItemVo = (CountdownItemVo) obj;
        return Duration.equals-impl0(this.f102372a, countdownItemVo.f102372a) && Intrinsics.areEqual(this.f102373b, countdownItemVo.f102373b) && Intrinsics.areEqual(this.f102374c, countdownItemVo.f102374c);
    }

    public final int hashCode() {
        int i7 = Duration.hashCode-impl(this.f102372a);
        int iHashCode = 0;
        TextVo textVo = this.f102373b;
        int iHashCode2 = textVo == null ? 0 : textVo.hashCode();
        TextVo textVo2 = this.f102374c;
        if (textVo2 != null) {
            iHashCode = textVo2.hashCode();
        }
        return (((i7 * 31) + iHashCode2) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "CountdownItemVo(foldCountdown=" + Duration.toString-impl(this.f102372a) + ", title=" + this.f102373b + ", subtitle=" + this.f102374c + ")";
    }
}
