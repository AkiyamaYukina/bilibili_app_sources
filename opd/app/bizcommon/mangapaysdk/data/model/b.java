package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import androidx.compose.animation.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/b.class */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f74038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f74039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f74040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f74041d;

    public b() {
        this(15, 0.0f, 0.0f, false);
    }

    public /* synthetic */ b(int i7, float f7, float f8, boolean z6) {
        this((i7 & 1) != 0 ? false : z6, (i7 & 2) != 0 ? -1.0f : f7, (i7 & 4) != 0 ? -1.0f : f8, false);
    }

    public b(boolean z6, float f7, float f8, boolean z7) {
        this.f74038a = z6;
        this.f74039b = f7;
        this.f74040c = f8;
        this.f74041d = z7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f74038a == bVar.f74038a && Float.compare(this.f74039b, bVar.f74039b) == 0 && Float.compare(this.f74040c, bVar.f74040c) == 0 && this.f74041d == bVar.f74041d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f74041d) + n.a(this.f74040c, n.a(this.f74039b, Boolean.hashCode(this.f74038a) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "PayBalanceState(isPurchase=" + this.f74038a + ", consume=" + this.f74039b + ", balance=" + this.f74040c + ", isSignPurchaseSuccess=" + this.f74041d + ")";
    }
}
