package com.bilibili.ogv.pub.community;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.C4277b;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/Publish.class */
@Bson
public final class Publish {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f71524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f71526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f71527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f71529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f71530g;
    public final int h;

    public Publish(int i7, int i8, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z6, boolean z7) {
        this.f71524a = str;
        this.f71525b = str2;
        this.f71526c = z6;
        this.f71527d = z7;
        this.f71528e = i7;
        this.f71529f = str3;
        this.f71530g = str4;
        this.h = i8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Publish)) {
            return false;
        }
        Publish publish = (Publish) obj;
        return Intrinsics.areEqual(this.f71524a, publish.f71524a) && Intrinsics.areEqual(this.f71525b, publish.f71525b) && this.f71526c == publish.f71526c && this.f71527d == publish.f71527d && this.f71528e == publish.f71528e && Intrinsics.areEqual(this.f71529f, publish.f71529f) && Intrinsics.areEqual(this.f71530g, publish.f71530g) && this.h == publish.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + E.a(E.a(I.a(this.f71528e, z.a(z.a(E.a(this.f71524a.hashCode() * 31, 31, this.f71525b), 31, this.f71526c), 31, this.f71527d), 31), 31, this.f71529f), 31, this.f71530g);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Publish(pubTime=");
        sb.append(this.f71524a);
        sb.append(", pubTimeShow=");
        sb.append(this.f71525b);
        sb.append(", isStarted=");
        sb.append(this.f71526c);
        sb.append(", isFinish=");
        sb.append(this.f71527d);
        sb.append(", weekday=");
        sb.append(this.f71528e);
        sb.append(", releaseDateShow=");
        sb.append(this.f71529f);
        sb.append(", timeLengthShow=");
        sb.append(this.f71530g);
        sb.append(", unknowPubDate=");
        return C4277b.a(this.h, ")", sb);
    }
}
