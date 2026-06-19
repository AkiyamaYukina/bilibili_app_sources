package com.bilibili.music.podcast.data;

import androidx.compose.foundation.C3554n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/h.class */
public final class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f66464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f66465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f66466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f66467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f66468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f66469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f66470g;
    public boolean h;

    public h(@Nullable String str, long j7, long j8, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f66464a = str;
        this.f66465b = str2;
        this.f66466c = str3;
        this.f66467d = str4;
        this.f66468e = str5;
        this.f66469f = j7;
        this.f66470g = j8;
    }

    @Override // com.bilibili.music.podcast.data.e
    public final int a() {
        return 1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f66464a, hVar.f66464a) && Intrinsics.areEqual(this.f66465b, hVar.f66465b) && Intrinsics.areEqual(this.f66466c, hVar.f66466c) && Intrinsics.areEqual(this.f66467d, hVar.f66467d) && Intrinsics.areEqual(this.f66468e, hVar.f66468e) && this.f66469f == hVar.f66469f && this.f66470g == hVar.f66470g;
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f66464a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f66465b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f66466c;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f66467d;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f66468e;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        return Long.hashCode(this.f66470g) + C3554n0.a(((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31, 31, this.f66469f);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(title=");
        sb.append(this.f66464a);
        sb.append(", desc=");
        sb.append(this.f66465b);
        sb.append(", btnIcon=");
        sb.append(this.f66466c);
        sb.append(", btnText=");
        sb.append(this.f66467d);
        sb.append(", btnUri=");
        sb.append(this.f66468e);
        sb.append(", pickId=");
        sb.append(this.f66469f);
        sb.append(", cardId=");
        return android.support.v4.media.session.a.a(sb, this.f66470g, ")");
    }
}
