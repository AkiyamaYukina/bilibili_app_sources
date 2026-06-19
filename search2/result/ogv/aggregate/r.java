package com.bilibili.search2.result.ogv.aggregate;

import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.search2.api.SearchOgvClusterRelationItem;
import kotlin.collections.MapsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/r.class */
public final /* synthetic */ class r implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f88401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f88402b;

    public /* synthetic */ r(boolean z6, s sVar) {
        this.f88401a = z6;
        this.f88402b = sVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.ogv.aggregate.s, dt0.b] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z6 = this.f88401a;
        ?? r02 = this.f88402b;
        if (z6) {
            return;
        }
        r02.t0("more");
        if (r02.f88411j.contains(Integer.valueOf(((SearchOgvClusterRelationItem) r02.getData()).getMoreSearchType()))) {
            Fragment fragment = r02.getFragment();
            Fragment parentFragment = fragment != null ? fragment.getParentFragment() : null;
            if (parentFragment instanceof com.bilibili.search2.result.l) {
                ((com.bilibili.search2.result.l) parentFragment).Ze(MapsKt.emptyMap(), ((SearchOgvClusterRelationItem) r02.getData()).getMoreSearchType(), false);
                return;
            }
            return;
        }
        String moreUrl = ((SearchOgvClusterRelationItem) r02.getData()).getMoreUrl();
        if (moreUrl == null || StringsKt.isBlank(moreUrl)) {
            return;
        }
        Os0.e.g(Os0.e.f18030a, r02.itemView.getContext(), ListExtentionsKt.appendUrlParamsIfAbsent(((SearchOgvClusterRelationItem) r02.getData()).getMoreUrl(), new Pair[]{Pair.create("from_spmid", "search.search-result.0.0"), Pair.create("query", ((SearchOgvClusterRelationItem) r02.getData()).getKeyword())}));
    }
}
