package com.bilibili.ship.theseus.ogv.dubbing;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.pgc.gateway.player.v2.DashItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f91847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<DashItem> f91848c;

    public e(int i7, @NotNull String str, @NotNull List<DashItem> list) {
        this.f91846a = i7;
        this.f91847b = str;
        this.f91848c = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f91846a == eVar.f91846a && Intrinsics.areEqual(this.f91847b, eVar.f91847b) && Intrinsics.areEqual(this.f91848c, eVar.f91848c);
    }

    public final int hashCode() {
        return this.f91848c.hashCode() + E.a(Integer.hashCode(this.f91846a) * 31, 31, this.f91847b);
    }

    @NotNull
    public final String toString() {
        List<DashItem> list = this.f91848c;
        StringBuilder sb = new StringBuilder("DubbingRoleAudioSelectedData(selectedIndex=");
        sb.append(this.f91846a);
        sb.append(", audioEdition=");
        return N1.o.a(this.f91847b, ", dashItemList=", ")", sb, list);
    }
}
