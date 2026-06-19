package com.bilibili.pegasus.common;

import F3.C1708d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ReuseStrategy;
import com.bilibili.pegasus.card.base.C;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/j.class */
@StabilityInferred(parameters = 0)
public final class j extends ReuseStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f75652a = LazyKt.lazy(new C1708d(8));

    @Override // androidx.recyclerview.widget.ReuseStrategy
    @Nullable
    public final RecyclerView.ViewHolder beforePutRecycledView(@Nullable RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null) {
            return null;
        }
        if (!(viewHolder instanceof com.bilibili.pegasus.card.base.b)) {
            return super.beforePutRecycledView(viewHolder);
        }
        com.bilibili.pegasus.card.base.b bVar = (com.bilibili.pegasus.card.base.b) viewHolder;
        bVar.f = null;
        bVar.e = null;
        ((ao.a) bVar).b = false;
        return viewHolder;
    }

    @Override // androidx.recyclerview.widget.ReuseStrategy
    public final int getCacheSize(int i7) {
        List list = C.a;
        return i7 == -1096825796 ? 14 : (i7 == -1778797597 || i7 == 1055486616) ? 1 : i7 == 1337809031 ? 5 : 0;
    }

    @Override // androidx.recyclerview.widget.ReuseStrategy
    public final boolean prepareEnable() {
        return true;
    }

    @Override // androidx.recyclerview.widget.ReuseStrategy
    public final boolean useCache(int i7) {
        List list = (List) this.f75652a.getValue();
        List listEmptyList = list;
        if (list == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (listEmptyList.contains(Integer.valueOf(i7))) {
            return false;
        }
        return super.useCache(i7);
    }
}
