package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.view.StatData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/k0.class */
@StabilityInferred(parameters = 1)
public final class C6323k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final C6302a f101272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StatData f101273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final C6317h0 f101274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f101275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Boolean f101276e;

    public C6323k0(@Nullable C6302a c6302a, @NotNull StatData statData, @Nullable C6317h0 c6317h0, @Nullable String str, @Nullable Boolean bool) {
        this.f101272a = c6302a;
        this.f101273b = statData;
        this.f101274c = c6317h0;
        this.f101275d = str;
        this.f101276e = bool;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6323k0)) {
            return false;
        }
        C6323k0 c6323k0 = (C6323k0) obj;
        return Intrinsics.areEqual(this.f101272a, c6323k0.f101272a) && Intrinsics.areEqual(this.f101273b, c6323k0.f101273b) && Intrinsics.areEqual(this.f101274c, c6323k0.f101274c) && Intrinsics.areEqual(this.f101275d, c6323k0.f101275d) && Intrinsics.areEqual(this.f101276e, c6323k0.f101276e);
    }

    public final int hashCode() {
        int iHashCode = 0;
        C6302a c6302a = this.f101272a;
        int iHashCode2 = c6302a == null ? 0 : c6302a.hashCode();
        int iHashCode3 = this.f101273b.hashCode();
        C6317h0 c6317h0 = this.f101274c;
        int iHashCode4 = c6317h0 == null ? 0 : c6317h0.hashCode();
        String str = this.f101275d;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        Boolean bool = this.f101276e;
        if (bool != null) {
            iHashCode = bool.hashCode();
        }
        return ((((((iHashCode3 + (iHashCode2 * 31)) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelateBangumiAvCard(recmdReason=");
        sb.append(this.f101272a);
        sb.append(", stat=");
        sb.append(this.f101273b);
        sb.append(", rating=");
        sb.append(this.f101274c);
        sb.append(", badgeText=");
        sb.append(this.f101275d);
        sb.append(", showRcmdStyle=");
        return Fa.T.a(sb, this.f101276e, ")");
    }
}
