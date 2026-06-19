package com.bilibili.ship.theseus.cheese.biz.intro.desc;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import eu0.C7004w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/desc/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C7004w f89411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f89413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<j> f89414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f89415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f89416f;

    public i(@NotNull C7004w c7004w, int i7, @NotNull String str, @NotNull List<j> list, int i8, boolean z6) {
        this.f89411a = c7004w;
        this.f89412b = i7;
        this.f89413c = str;
        this.f89414d = list;
        this.f89415e = i8;
        this.f89416f = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f89411a, iVar.f89411a) && this.f89412b == iVar.f89412b && Intrinsics.areEqual(this.f89413c, iVar.f89413c) && Intrinsics.areEqual(this.f89414d, iVar.f89414d) && this.f89415e == iVar.f89415e && this.f89416f == iVar.f89416f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89416f) + I.a(this.f89415e, e0.a(E.a(I.a(this.f89412b, this.f89411a.hashCode() * 31, 31), 31, this.f89413c), 31, this.f89414d), 31);
    }

    @NotNull
    public final String toString() {
        List<j> list = this.f89414d;
        StringBuilder sb = new StringBuilder("PugvSeasonDescription(nav=");
        sb.append(this.f89411a);
        sb.append(", type=");
        sb.append(this.f89412b);
        sb.append(", text=");
        M6.f.a(this.f89413c, ", images=", ", foldThreshold=", sb, list);
        sb.append(this.f89415e);
        sb.append(", expanded=");
        return androidx.appcompat.app.i.a(sb, this.f89416f, ")");
    }
}
