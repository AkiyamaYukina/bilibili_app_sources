package com.bilibili.moduleservice.main;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/main/g.class */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f66325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66326b;

    public g() {
        this(false, false);
    }

    public g(boolean z6, boolean z7) {
        this.f66325a = z6;
        this.f66326b = z7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f66325a == gVar.f66325a && this.f66326b == gVar.f66326b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66326b) + (Boolean.hashCode(this.f66325a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("InterestDialogState(inProgressing=");
        sb.append(this.f66325a);
        sb.append(", exclusiveMode=");
        return androidx.appcompat.app.i.a(sb, this.f66326b, ")");
    }
}
