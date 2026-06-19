package com.bilibili.player.tangram.playercore;

import Fa.T;
import androidx.compose.animation.core.I;
import com.bilibili.app.producers.ability.l0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/C.class */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f79343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Boolean f79344d;

    public C(int i7, int i8, boolean z6, Boolean bool) {
        this.f79341a = i7;
        this.f79342b = i8;
        this.f79343c = z6;
        this.f79344d = bool;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c7 = (C) obj;
        return pb0.a.a(this.f79341a, c7.f79341a) && this.f79342b == c7.f79342b && this.f79343c == c7.f79343c && Intrinsics.areEqual(this.f79344d, c7.f79344d);
    }

    public final int hashCode() {
        int iA = androidx.compose.animation.z.a(I.a(this.f79342b, Integer.hashCode(this.f79341a) * 31, 31), 31, this.f79343c);
        Boolean bool = this.f79344d;
        return iA + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sbA = l0.a("ResourceParam(codecType=", pb0.a.b(this.f79341a), ", format=");
        sbA.append(this.f79342b);
        sbA.append(", forceSafeConnect=");
        sbA.append(this.f79343c);
        sbA.append(", downgradeFreeData=");
        return T.a(sbA, this.f79344d, ")");
    }
}
