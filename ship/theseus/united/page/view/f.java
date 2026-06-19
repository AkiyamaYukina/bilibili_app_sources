package com.bilibili.ship.theseus.united.page.view;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/f.class */
@StabilityInferred(parameters = 1)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f104076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f104077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f104078d;

    public f(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z6) {
        this.f104075a = z6;
        this.f104076b = str;
        this.f104077c = str2;
        this.f104078d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f104075a == fVar.f104075a && Intrinsics.areEqual(this.f104076b, fVar.f104076b) && Intrinsics.areEqual(this.f104077c, fVar.f104077c) && Intrinsics.areEqual(this.f104078d, fVar.f104078d);
    }

    public final int hashCode() {
        return this.f104078d.hashCode() + E.a(E.a(Boolean.hashCode(this.f104075a) * 31, 31, this.f104076b), 31, this.f104077c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BgPlayNotice(allowShow=");
        sb.append(this.f104075a);
        sb.append(", title=");
        sb.append(this.f104076b);
        sb.append(", button1Text=");
        sb.append(this.f104077c);
        sb.append(", button2Text=");
        return C8770a.a(sb, this.f104078d, ")");
    }
}
