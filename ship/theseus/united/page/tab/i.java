package com.bilibili.ship.theseus.united.page.tab;

import K7.M;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<TabPage> f103191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f103192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f103193c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull List<? extends TabPage> list, @Nullable String str, @Nullable String str2) {
        this.f103191a = list;
        this.f103192b = str;
        this.f103193c = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f103191a, iVar.f103191a) && Intrinsics.areEqual(this.f103192b, iVar.f103192b) && Intrinsics.areEqual(this.f103193c, iVar.f103193c);
    }

    public final int hashCode() {
        int iHashCode = this.f103191a.hashCode();
        int iHashCode2 = 0;
        String str = this.f103192b;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f103193c;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbA = M.a("DetailTabs(list=", ", bg=", this.f103191a);
        sbA.append(this.f103192b);
        sbA.append(", bgWideScreen=");
        return C8770a.a(sbA, this.f103193c, ")");
    }
}
