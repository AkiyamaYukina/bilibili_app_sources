package com.bilibili.search2.result.holder.recommend;

import a5.C3188c;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f88167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f88168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f88170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f88171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f88172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f88173g;
    public long h;

    public d() {
        this(0);
    }

    public d(int i7) {
        this.f88167a = null;
        this.f88168b = null;
        this.f88169c = false;
        this.f88170d = null;
        this.f88171e = null;
        this.f88172f = null;
        this.f88173g = null;
        this.h = 0L;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f88167a, dVar.f88167a) && Intrinsics.areEqual(this.f88168b, dVar.f88168b) && this.f88169c == dVar.f88169c && Intrinsics.areEqual(this.f88170d, dVar.f88170d) && Intrinsics.areEqual(this.f88171e, dVar.f88171e) && Intrinsics.areEqual(this.f88172f, dVar.f88172f) && Intrinsics.areEqual(this.f88173g, dVar.f88173g) && this.h == dVar.h;
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f88167a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f88168b;
        int iA = z.a(((iHashCode2 * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f88169c);
        String str3 = this.f88170d;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f88171e;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f88172f;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.f88173g;
        if (str6 != null) {
            iHashCode = str6.hashCode();
        }
        return Long.hashCode(this.h) + ((((((((iA + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f88169c;
        StringBuilder sb = new StringBuilder("RelatedSearchWord(query=");
        sb.append(this.f88167a);
        sb.append(", url=");
        C3188c.a(this.f88168b, ", isExposed=", ", icon=", sb, z6);
        sb.append(this.f88170d);
        sb.append(", iconNight=");
        sb.append(this.f88171e);
        sb.append(", rcmdReason=");
        sb.append(this.f88172f);
        sb.append(", iconType=");
        sb.append(this.f88173g);
        sb.append(", iconTypeLong=");
        return android.support.v4.media.session.a.a(sb, this.h, ")");
    }
}
