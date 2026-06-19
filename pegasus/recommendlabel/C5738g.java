package com.bilibili.pegasus.recommendlabel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.pegasus.recommendlabel.data.Label;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/g.class */
@StabilityInferred(parameters = 0)
public final class C5738g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f78714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f78715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Label> f78716c;

    public C5738g(@Nullable String str, @Nullable String str2, @NotNull List<Label> list) {
        this.f78714a = str;
        this.f78715b = str2;
        this.f78716c = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5738g)) {
            return false;
        }
        C5738g c5738g = (C5738g) obj;
        return Intrinsics.areEqual(this.f78714a, c5738g.f78714a) && Intrinsics.areEqual(this.f78715b, c5738g.f78715b) && Intrinsics.areEqual(this.f78716c, c5738g.f78716c);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f78714a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f78715b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return this.f78716c.hashCode() + (((iHashCode2 * 31) + iHashCode) * 31);
    }

    @NotNull
    public final String toString() {
        List<Label> list = this.f78716c;
        StringBuilder sb = new StringBuilder("FavoriteSelection(selectionTitle=");
        sb.append(this.f78714a);
        sb.append(", selectionIcon=");
        return N1.o.a(this.f78715b, ", favoritesItems=", ")", sb, list);
    }
}
