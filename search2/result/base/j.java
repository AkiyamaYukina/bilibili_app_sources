package com.bilibili.search2.result.base;

import Ps0.C2787h;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.FilterValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/base/j.class */
@StabilityInferred(parameters = 0)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C2787h f87552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Integer> f87553b;

    public j() {
        throw null;
    }

    public j(C2787h c2787h) {
        ArrayList arrayList = new ArrayList();
        this.f87552a = c2787h;
        this.f87553b = arrayList;
    }

    public final void a(@NotNull HashMap<String, String> map) {
        C2787h c2787h = this.f87552a;
        String str = c2787h.f19205e;
        if (this.f87553b.isEmpty() || str == null || str.length() <= 0) {
            map.put(str + "_filter", "default");
            return;
        }
        String strConcat = str.concat("_filter");
        List<Integer> list = this.f87553b;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            FilterValue filterValue = (FilterValue) CollectionsKt.getOrNull(c2787h.f19202b, ((Number) it.next()).intValue());
            arrayList.add(filterValue != null ? filterValue.getSubModuleForNeuron() : null);
        }
        map.put(strConcat, CollectionsKt.p(arrayList, ",", (CharSequence) null, (CharSequence) null, (Function1) null, 62));
    }

    public final boolean b(int i7) {
        return (this.f87553b.isEmpty() && i7 == 0) ? true : this.f87553b.contains(Integer.valueOf(i7));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f87552a, jVar.f87552a) && Intrinsics.areEqual(this.f87553b, jVar.f87553b);
    }

    public final int hashCode() {
        return this.f87553b.hashCode() + (this.f87552a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "FilterSelectedData(filterEntries=" + this.f87552a + ", selectedIndex=" + this.f87553b + ")";
    }
}
