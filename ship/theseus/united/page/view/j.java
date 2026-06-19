package com.bilibili.ship.theseus.united.page.view;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.B;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/j.class */
@StabilityInferred(parameters = 0)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f104094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f104095c = false;

    public j(boolean z6, String str) {
        this.f104093a = z6;
        this.f104094b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f104093a == jVar.f104093a && Intrinsics.areEqual(this.f104094b, jVar.f104094b) && this.f104095c == jVar.f104095c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104095c) + E.a(Boolean.hashCode(this.f104093a) * 31, 31, this.f104094b);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f104095c;
        StringBuilder sb = new StringBuilder("HardcoreFan(isFollowDisplay=");
        sb.append(this.f104093a);
        sb.append(", wingPic=");
        return B.c(this.f104094b, ", forbidden=", ")", sb, z6);
    }
}
