package com.bilibili.ogv.review.detailpage;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/VipLabel.class */
@StabilityInferred(parameters = 1)
@Bson
public final class VipLabel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f72318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f72319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f72320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f72321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f72322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f72323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f72324g;

    public VipLabel(@NotNull String str, @NotNull String str2, @NotNull String str3, int i7, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        this.f72318a = str;
        this.f72319b = str2;
        this.f72320c = str3;
        this.f72321d = i7;
        this.f72322e = str4;
        this.f72323f = str5;
        this.f72324g = str6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipLabel)) {
            return false;
        }
        VipLabel vipLabel = (VipLabel) obj;
        return Intrinsics.areEqual(this.f72318a, vipLabel.f72318a) && Intrinsics.areEqual(this.f72319b, vipLabel.f72319b) && Intrinsics.areEqual(this.f72320c, vipLabel.f72320c) && this.f72321d == vipLabel.f72321d && Intrinsics.areEqual(this.f72322e, vipLabel.f72322e) && Intrinsics.areEqual(this.f72323f, vipLabel.f72323f) && Intrinsics.areEqual(this.f72324g, vipLabel.f72324g);
    }

    public final int hashCode() {
        return this.f72324g.hashCode() + E.a(E.a(I.a(this.f72321d, E.a(E.a(this.f72318a.hashCode() * 31, 31, this.f72319b), 31, this.f72320c), 31), 31, this.f72322e), 31, this.f72323f);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VipLabel(path=");
        sb.append(this.f72318a);
        sb.append(", text=");
        sb.append(this.f72319b);
        sb.append(", labelTheme=");
        sb.append(this.f72320c);
        sb.append(", bgStyle=");
        sb.append(this.f72321d);
        sb.append(", bgColor=");
        sb.append(this.f72322e);
        sb.append(", borderColor=");
        sb.append(this.f72323f);
        sb.append(", textColor=");
        return C8770a.a(sb, this.f72324g, ")");
    }
}
