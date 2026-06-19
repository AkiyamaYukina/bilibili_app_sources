package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/a.class */
@StabilityInferred(parameters = 0)
public final class C6426a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f103849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f103850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f103851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f103852d;

    public C6426a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map) {
        this.f103849a = str;
        this.f103850b = str2;
        this.f103851c = str3;
        this.f103852d = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6426a)) {
            return false;
        }
        C6426a c6426a = (C6426a) obj;
        return Intrinsics.areEqual(this.f103849a, c6426a.f103849a) && Intrinsics.areEqual(this.f103850b, c6426a.f103850b) && Intrinsics.areEqual(this.f103851c, c6426a.f103851c) && Intrinsics.areEqual(this.f103852d, c6426a.f103852d);
    }

    public final int hashCode() {
        return this.f103852d.hashCode() + I.E.a(I.E.a(this.f103849a.hashCode() * 31, 31, this.f103850b), 31, this.f103851c);
    }

    @NotNull
    public final String toString() {
        Map<String, String> map = this.f103852d;
        StringBuilder sb = new StringBuilder("BuyVipParams(appId=");
        sb.append(this.f103849a);
        sb.append(", appSubId=");
        sb.append(this.f103850b);
        sb.append(", sourceFrom=");
        return C4665g.a(sb, this.f103851c, ", extraReportData=", map, ")");
    }
}
