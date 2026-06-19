package com.bilibili.ship.theseus.united.page.view;

import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/q.class */
@StabilityInferred(parameters = 1)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f104115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f104116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f104117d;

    public q(boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f104114a = z6;
        this.f104115b = z7;
        this.f104116c = z8;
        this.f104117d = z9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f104114a == qVar.f104114a && this.f104115b == qVar.f104115b && this.f104116c == qVar.f104116c && this.f104117d == qVar.f104117d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104117d) + z.a(z.a(Boolean.hashCode(this.f104114a) * 31, 31, this.f104115b), 31, this.f104116c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Rights(onlyVipDownload=");
        sb.append(this.f104114a);
        sb.append(", noReprint=");
        sb.append(this.f104115b);
        sb.append(", canDownload=");
        sb.append(this.f104116c);
        sb.append(", isChargeVideo=");
        return androidx.appcompat.app.i.a(sb, this.f104117d, ")");
    }
}
