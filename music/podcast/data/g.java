package com.bilibili.music.podcast.data;

import androidx.compose.foundation.C3554n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/g.class */
public final class g extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f66458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f66459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f66460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f66461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f66462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f66463f;

    public g(long j7, long j8, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f66458a = str;
        this.f66459b = str2;
        this.f66460c = str3;
        this.f66461d = str4;
        this.f66462e = j7;
        this.f66463f = j8;
    }

    @Override // com.bilibili.music.podcast.data.e
    public final int a() {
        return 3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f66458a, gVar.f66458a) && Intrinsics.areEqual(this.f66459b, gVar.f66459b) && Intrinsics.areEqual(this.f66460c, gVar.f66460c) && Intrinsics.areEqual(this.f66461d, gVar.f66461d) && this.f66462e == gVar.f66462e && this.f66463f == gVar.f66463f;
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f66458a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f66459b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f66460c;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f66461d;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return Long.hashCode(this.f66463f) + C3554n0.a(((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31, 31, this.f66462e);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Footer(leftImg=");
        sb.append(this.f66458a);
        sb.append(", rightImg=");
        sb.append(this.f66459b);
        sb.append(", title=");
        sb.append(this.f66460c);
        sb.append(", gotoUrl=");
        sb.append(this.f66461d);
        sb.append(", cardId=");
        sb.append(this.f66462e);
        sb.append(", pickId=");
        return android.support.v4.media.session.a.a(sb, this.f66463f, ")");
    }
}
