package com.bilibili.search2.discover;

import K7.M;
import Ps0.F;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.discover.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<F> f86440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f86441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f86443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final j f86444e;

    public i() {
        throw null;
    }

    public i(List list, String str, boolean z6, j jVar, int i7) {
        jVar = (i7 & 16) != 0 ? j.b.f86446a : jVar;
        this.f86440a = list;
        this.f86441b = str;
        this.f86442c = z6;
        this.f86443d = false;
        this.f86444e = jVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f86440a, iVar.f86440a) && Intrinsics.areEqual(this.f86441b, iVar.f86441b) && this.f86442c == iVar.f86442c && this.f86443d == iVar.f86443d && Intrinsics.areEqual(this.f86444e, iVar.f86444e);
    }

    public final int hashCode() {
        List<F> list = this.f86440a;
        int iHashCode = 0;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.f86441b;
        if (str != null) {
            iHashCode = str.hashCode();
        }
        return this.f86444e.hashCode() + z.a(z.a(((iHashCode2 * 31) + iHashCode) * 31, 31, this.f86442c), 31, this.f86443d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbA = M.a("HistoryModel(list=", ", title=", this.f86440a);
        sbA.append(this.f86441b);
        sbA.append(", hasUpRightClear=");
        sbA.append(this.f86442c);
        sbA.append(", isDelete=");
        sbA.append(this.f86443d);
        sbA.append(", state=");
        sbA.append(this.f86444e);
        sbA.append(")");
        return sbA.toString();
    }
}
