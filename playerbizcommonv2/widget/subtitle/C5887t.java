package com.bilibili.playerbizcommonv2.widget.subtitle;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.community.service.dm.v1.SubtitleType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/t.class */
@StabilityInferred(parameters = 1)
public final class C5887t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f83777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f83778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f83779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final SubtitleType f83780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f83781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final SubtitleRole f83782f;

    public C5887t(@Nullable String str, @NotNull String str2, @Nullable String str3, @Nullable SubtitleType subtitleType, int i7, @Nullable SubtitleRole subtitleRole) {
        this.f83777a = str;
        this.f83778b = str2;
        this.f83779c = str3;
        this.f83780d = subtitleType;
        this.f83781e = i7;
        this.f83782f = subtitleRole;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5887t)) {
            return false;
        }
        C5887t c5887t = (C5887t) obj;
        return Intrinsics.areEqual(this.f83777a, c5887t.f83777a) && Intrinsics.areEqual(this.f83778b, c5887t.f83778b) && Intrinsics.areEqual(this.f83779c, c5887t.f83779c) && this.f83780d == c5887t.f83780d && this.f83781e == c5887t.f83781e && this.f83782f == c5887t.f83782f;
    }

    public final int hashCode() {
        String str = this.f83777a;
        int iA = I.E.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f83778b);
        String str2 = this.f83779c;
        int iHashCode = str2 == null ? 0 : str2.hashCode();
        SubtitleType subtitleType = this.f83780d;
        int iA2 = androidx.compose.animation.core.I.a(this.f83781e, (((iA + iHashCode) * 31) + (subtitleType == null ? 0 : subtitleType.hashCode())) * 31, 31);
        SubtitleRole subtitleRole = this.f83782f;
        return iA2 + (subtitleRole == null ? 0 : subtitleRole.hashCode());
    }

    @NotNull
    public final String toString() {
        return "DisplayableSubtitleItem(originalKey=" + this.f83777a + ", displayKey=" + this.f83778b + ", label=" + this.f83779c + ", type=" + this.f83780d + ", aiStatus=" + this.f83781e + ", role=" + this.f83782f + ")";
    }
}
