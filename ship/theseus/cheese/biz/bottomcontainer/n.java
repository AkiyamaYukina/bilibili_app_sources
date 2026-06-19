package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/n.class */
@Stable
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f89096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f89097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f89098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f89099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f89100e;

    public n(@NotNull c cVar, @NotNull c cVar2, @NotNull c cVar3, @NotNull c cVar4, boolean z6) {
        this.f89096a = cVar;
        this.f89097b = cVar2;
        this.f89098c = cVar3;
        this.f89099d = cVar4;
        this.f89100e = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f89096a, nVar.f89096a) && Intrinsics.areEqual(this.f89097b, nVar.f89097b) && Intrinsics.areEqual(this.f89098c, nVar.f89098c) && Intrinsics.areEqual(this.f89099d, nVar.f89099d) && this.f89100e == nVar.f89100e;
    }

    public final int hashCode() {
        int iHashCode = this.f89096a.hashCode();
        int iHashCode2 = this.f89097b.hashCode();
        int iHashCode3 = this.f89098c.hashCode();
        return Boolean.hashCode(this.f89100e) + ((this.f89099d.hashCode() + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CheeseBottomContainerUIState(favorite=");
        sb.append(this.f89096a);
        sb.append(", consult=");
        sb.append(this.f89097b);
        sb.append(", share=");
        sb.append(this.f89098c);
        sb.append(", purchase=");
        sb.append(this.f89099d);
        sb.append(", isPaid=");
        return androidx.appcompat.app.i.a(sb, this.f89100e, ")");
    }
}
