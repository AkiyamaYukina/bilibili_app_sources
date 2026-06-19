package com.bilibili.ogv.review.detailpage;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/Vip.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Vip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f72313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f72314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f72316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f72317e;

    public Vip(int i7, int i8, @NotNull String str, int i9, @NotNull String str2) {
        this.f72313a = i7;
        this.f72314b = i8;
        this.f72315c = i9;
        this.f72316d = str;
        this.f72317e = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vip)) {
            return false;
        }
        Vip vip = (Vip) obj;
        return this.f72313a == vip.f72313a && this.f72314b == vip.f72314b && this.f72315c == vip.f72315c && Intrinsics.areEqual(this.f72316d, vip.f72316d) && Intrinsics.areEqual(this.f72317e, vip.f72317e);
    }

    public final int hashCode() {
        return this.f72317e.hashCode() + E.a(I.a(this.f72315c, I.a(this.f72314b, Integer.hashCode(this.f72313a) * 31, 31), 31), 31, this.f72316d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Vip(vipStatus=");
        sb.append(this.f72313a);
        sb.append(", vipType=");
        sb.append(this.f72314b);
        sb.append(", themeType=");
        sb.append(this.f72315c);
        sb.append(", avatarSubscriptUrl=");
        sb.append(this.f72316d);
        sb.append(", nicknameColor=");
        return C8770a.a(sb, this.f72317e, ")");
    }
}
