package com.bilibili.search2.result.ogv.aggregate;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.SearchOgvRelationItem;
import com.bilibili.search2.result.all.AbstractC6048b;
import dt0.AbstractC6839b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/q.class */
@StabilityInferred(parameters = 0)
public final class q extends AbstractC6048b<AbstractC6839b<SearchOgvRelationItem.DetailsRelationItem>, SearchOgvRelationItem.DetailsRelationItem> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final com.bilibili.search2.api.g f88400c;

    public q(int i7, @Nullable com.bilibili.search2.api.g gVar) {
        this.f88399b = i7;
        this.f88400c = gVar;
    }

    @Override // com.bilibili.search2.result.all.AbstractC6048b
    @NotNull
    public final AbstractC6839b P(int i7, @NotNull ViewGroup viewGroup) {
        p pVar;
        com.bilibili.search2.api.g gVar = this.f88400c;
        if (i7 == -337153127 || i7 == 94843483) {
            pVar = new p(p.a(viewGroup, 2131496584, viewGroup, false));
            pVar.f88393a = gVar;
        } else {
            pVar = new p(p.a(viewGroup, 2131496584, viewGroup, false));
            pVar.f88393a = gVar;
        }
        return pVar;
    }
}
