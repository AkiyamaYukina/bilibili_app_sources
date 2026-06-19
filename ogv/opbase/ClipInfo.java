package com.bilibili.ogv.opbase;

import G0.d;
import RQ.l;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.D;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.infra.gson.DurationFromSecondsTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/ClipInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ClipInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f69690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JsonAdapter(DurationFromSecondsTypeAdapter.class)
    public final long f69691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JsonAdapter(DurationFromSecondsTypeAdapter.class)
    public final long f69692c;

    public ClipInfo(long j7, long j8, long j9) {
        this.f69690a = j7;
        this.f69691b = j8;
        this.f69692c = j9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipInfo)) {
            return false;
        }
        ClipInfo clipInfo = (ClipInfo) obj;
        return this.f69690a == clipInfo.f69690a && Duration.equals-impl0(this.f69691b, clipInfo.f69691b) && Duration.equals-impl0(this.f69692c, clipInfo.f69692c);
    }

    public final int hashCode() {
        return Duration.hashCode-impl(this.f69692c) + l.a(Long.hashCode(this.f69690a) * 31, 31, this.f69691b);
    }

    @NotNull
    public final String toString() {
        String str = Duration.toString-impl(this.f69691b);
        String str2 = Duration.toString-impl(this.f69692c);
        StringBuilder sb = new StringBuilder("ClipInfo(id=");
        d.a(this.f69690a, ", start=", str, sb);
        return D.a(", end=", str2, ")", sb);
    }
}
