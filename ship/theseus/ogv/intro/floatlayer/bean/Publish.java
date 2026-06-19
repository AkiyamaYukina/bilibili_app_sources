package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/Publish.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Publish {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f92889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f92890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f92891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f92892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f92893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f92894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f92895g;
    public final int h;

    public Publish(int i7, int i8, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z6, boolean z7) {
        this.f92889a = str;
        this.f92890b = str2;
        this.f92891c = z6;
        this.f92892d = z7;
        this.f92893e = i7;
        this.f92894f = str3;
        this.f92895g = str4;
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
        return Intrinsics.areEqual(this.f92889a, publish.f92889a) && Intrinsics.areEqual(this.f92890b, publish.f92890b) && this.f92891c == publish.f92891c && this.f92892d == publish.f92892d && this.f92893e == publish.f92893e && Intrinsics.areEqual(this.f92894f, publish.f92894f) && Intrinsics.areEqual(this.f92895g, publish.f92895g) && this.h == publish.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + E.a(E.a(I.a(this.f92893e, z.a(z.a(E.a(this.f92889a.hashCode() * 31, 31, this.f92890b), 31, this.f92891c), 31, this.f92892d), 31), 31, this.f92894f), 31, this.f92895g);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Publish(pubTime=");
        sb.append(this.f92889a);
        sb.append(", pubTimeShow=");
        sb.append(this.f92890b);
        sb.append(", isStarted=");
        sb.append(this.f92891c);
        sb.append(", isFinish=");
        sb.append(this.f92892d);
        sb.append(", weekday=");
        sb.append(this.f92893e);
        sb.append(", releaseDateShow=");
        sb.append(this.f92894f);
        sb.append(", timeLengthShow=");
        sb.append(this.f92895g);
        sb.append(", unknowPubDate=");
        return C4277b.a(this.h, ")", sb);
    }
}
