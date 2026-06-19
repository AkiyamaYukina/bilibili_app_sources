package com.bilibili.player.tangram.playercore;

import androidx.compose.animation.core.I;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/B.class */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f79333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final u f79335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.player.tangram.basic.c f79336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f79337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f79338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f79339g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Function1<A, Unit> f79340i;

    public B() {
        throw null;
    }

    public B(boolean z6, int i7, u uVar, com.bilibili.player.tangram.basic.c cVar, int i8, int i9, String str, int i10, Function1 function1) {
        this.f79333a = z6;
        this.f79334b = i7;
        this.f79335c = uVar;
        this.f79336d = cVar;
        this.f79337e = i8;
        this.f79338f = i9;
        this.f79339g = str;
        this.h = i10;
        this.f79340i = function1;
    }

    public static B a(B b7, boolean z6, int i7, int i8, int i9, String str, int i10, int i11) {
        if ((i11 & 1) != 0) {
            z6 = b7.f79333a;
        }
        if ((i11 & 2) != 0) {
            i7 = b7.f79334b;
        }
        u uVar = (i11 & 4) != 0 ? b7.f79335c : null;
        com.bilibili.player.tangram.basic.c cVar = b7.f79336d;
        if ((i11 & 16) != 0) {
            i8 = b7.f79337e;
        }
        if ((i11 & 32) != 0) {
            i9 = b7.f79338f;
        }
        if ((i11 & 64) != 0) {
            str = b7.f79339g;
        }
        if ((i11 & 128) != 0) {
            i10 = b7.h;
        }
        Function1<A, Unit> function1 = b7.f79340i;
        b7.getClass();
        return new B(z6, i7, uVar, cVar, i8, i9, str, i10, function1);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b7 = (B) obj;
        return this.f79333a == b7.f79333a && com.bilibili.player.tangram.basic.a.b(this.f79334b, b7.f79334b) && Intrinsics.areEqual(this.f79335c, b7.f79335c) && Intrinsics.areEqual(this.f79336d, b7.f79336d) && pb0.a.a(this.f79337e, b7.f79337e) && this.f79338f == b7.f79338f && Intrinsics.areEqual(this.f79339g, b7.f79339g) && this.h == b7.h && Intrinsics.areEqual(this.f79340i, b7.f79340i);
    }

    public final int hashCode() {
        int iA = I.a(this.f79334b, Boolean.hashCode(this.f79333a) * 31, 31);
        u uVar = this.f79335c;
        int iA2 = I.a(this.f79338f, I.a(this.f79337e, (this.f79336d.hashCode() + ((iA + (uVar == null ? 0 : uVar.hashCode())) * 31)) * 31, 31), 31);
        String str = this.f79339g;
        return this.f79340i.hashCode() + I.a(this.h, (iA2 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    @NotNull
    public final String toString() {
        int i7 = this.f79334b;
        String strB = pb0.a.b(this.f79337e);
        StringBuilder sb = new StringBuilder("ResolvingContext(requiresSafeConnection=");
        O4.a.d(", resolvingQuality=", String.valueOf(i7), ", previousMedia=", sb, this.f79333a);
        sb.append(this.f79335c);
        sb.append(", initialQualityPreference=");
        sb.append(this.f79336d);
        sb.append(", resolvingCodecType=");
        sb.append(strB);
        sb.append(", resolvingFormat=");
        sb.append(this.f79338f);
        sb.append(", language=");
        sb.append(this.f79339g);
        sb.append(", productionType=");
        sb.append(this.h);
        sb.append(", emitProfilingEvent=");
        sb.append(this.f79340i);
        sb.append(")");
        return sb.toString();
    }
}
