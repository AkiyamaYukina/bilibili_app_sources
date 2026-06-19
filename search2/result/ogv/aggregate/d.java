package com.bilibili.search2.result.ogv.aggregate;

import Bl.l0;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.image.ListPlaceHolderImageView;
import com.bilibili.app.comm.list.widget.tag.TagView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.view.legacy.ScalableImageView2;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.EpisodeNew;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.bilibili.search2.result.bangumi.C6062b;
import dt0.AbstractC6843f;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.text.TintFixedLineSpacingTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/d.class */
@StabilityInferred(parameters = 0)
public final class d extends AbstractC6843f<SearchBangumiItem> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f88330w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final l0 f88331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f88332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.api.g f88333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ConstraintLayout f88334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ListPlaceHolderImageView f88335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TintFixedLineSpacingTextView f88336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final LinearLayout f88337g;

    @NotNull
    public final TagView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TintTextView f88338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TintTextView f88339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final TintTextView f88340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Group f88341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final TintTextView f88342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final TintLinearLayout f88343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final TagView f88344o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final TintTextView f88345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final TintTextView f88346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final RecyclerView f88347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final ScalableImageView2 f88348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.result.bangumi.r<EpisodeNew> f88349t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final c f88350u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final C0597d f88351v;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/d$a.class */
    public static final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f88352a;

        public a(d dVar) {
            this.f88352a = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            int left;
            super.onScrollStateChanged(recyclerView, i7);
            if (i7 == 0) {
                View childAt = recyclerView.getChildAt(0);
                int bindingAdapterPosition = recyclerView.getChildViewHolder(childAt).getBindingAdapterPosition();
                d dVar = this.f88352a;
                SearchBangumiItem searchBangumiItem = (SearchBangumiItem) dVar.getData();
                if (childAt.getLeft() < 0) {
                    bindingAdapterPosition++;
                }
                searchBangumiItem.setScrollPosition(bindingAdapterPosition);
                SearchBangumiItem searchBangumiItem2 = (SearchBangumiItem) dVar.getData();
                if (childAt.getLeft() >= 0) {
                    left = childAt.getLeft();
                } else {
                    View childAt2 = recyclerView.getChildAt(1);
                    left = 0;
                    if (childAt2 != null) {
                        left = childAt2.getLeft();
                    }
                }
                searchBangumiItem2.setItemOffset(left);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/d$b.class */
    public static final class b {
        public static Uri a(int i7, String str, String str2) {
            int i8 = d.f88330w;
            if ((i7 & 4) != 0) {
                str2 = "search.search-result.0.0";
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("intentFrom", "5").appendQueryParameter("from_spmid", str2).build();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/d$c.class */
    public static final class c extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int px = ListExtentionsKt.toPx(4);
            int px2 = ListExtentionsKt.toPx(4);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                px = 0;
            }
            if (childAdapterPosition == state.getItemCount() - 1) {
                px2 = 0;
            }
            rect.set(px, 0, px2, 0);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.result.ogv.aggregate.d$d, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/d$d.class */
    public static final class C0597d extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int px = ListExtentionsKt.toPx(4);
            int px2 = ListExtentionsKt.toPx(4);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                px = 0;
            }
            if (childAdapterPosition == state.getItemCount() - 1) {
                px2 = 0;
            }
            rect.set(px, 0, px2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v32, types: [androidx.recyclerview.widget.RecyclerView$ItemDecoration, com.bilibili.search2.result.ogv.aggregate.d$c] */
    /* JADX WARN: Type inference failed for: r1v33, types: [androidx.recyclerview.widget.RecyclerView$ItemDecoration, com.bilibili.search2.result.ogv.aggregate.d$d] */
    public d(@NotNull l0 l0Var) {
        super(l0Var.a);
        this.f88331a = l0Var;
        this.f88334d = l0Var.k;
        this.f88335e = l0Var.d;
        this.f88336f = l0Var.t;
        this.f88337g = l0Var.r;
        this.h = l0Var.p;
        this.f88338i = l0Var.q;
        this.f88339j = l0Var.s;
        TintTextView tintTextView = l0Var.l;
        this.f88340k = tintTextView;
        this.f88341l = l0Var.o;
        this.f88342m = l0Var.n;
        TintLinearLayout tintLinearLayout = l0Var.h;
        this.f88343n = tintLinearLayout;
        this.f88344o = l0Var.e;
        this.f88345p = l0Var.c;
        this.f88346q = l0Var.g;
        RecyclerView recyclerView = l0Var.m;
        this.f88347r = recyclerView;
        this.f88348s = l0Var.i;
        ListExtentionsKt.toPx(8);
        ListExtentionsKt.toPx(0);
        this.f88350u = new RecyclerView.ItemDecoration();
        this.f88351v = new RecyclerView.ItemDecoration();
        this.itemView.setOnClickListener(new XD.i(1, this));
        tintLinearLayout.setOnClickListener(new XD.j(this, 4));
        tintTextView.setOnClickListener(new Yo.a(this, 1));
        recyclerView.addOnScrollListener(new a(this));
    }

    public static String s0(SearchBangumiItem searchBangumiItem) {
        String str;
        if (searchBangumiItem != null) {
            SearchBangumiItem.a aVar = SearchBangumiItem.Companion;
            int mediaType = searchBangumiItem.getMediaType();
            aVar.getClass();
            str = SearchBangumiItem.a.a(mediaType) ? "pgc.bangumi-search.0.0" : "pgc.cinema-search.0.0";
        } else {
            str = "0.0.0.0";
        }
        return str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    @Override // dt0.AbstractC6839b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind() throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.aggregate.d.bind():void");
    }

    @Override // dt0.AbstractC6839b
    public final void bindFragment(@Nullable Fragment fragment) {
        super.bindFragment(fragment);
        this.f88332b = !(fragment instanceof SearchResultAllFragment);
    }

    @Override // dt0.AbstractC6843f
    @Nullable
    public final View getClickStatusView() {
        return this.f88336f;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
        SearchBangumiItem searchBangumiItem = (SearchBangumiItem) getData();
        RecyclerView recyclerView = getRecyclerView();
        searchBangumiItem.setAtFirstScreen((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) == 0);
        Xs0.b.k(r0(false, (SearchBangumiItem) getData()), q0((BaseSearchItem) getData()), (BaseSearchItem) getData(), null, t0((SearchBangumiItem) getData()), !this.f88332b, null, null, null, 936);
    }

    @NotNull
    public final String q0(@NotNull BaseSearchItem baseSearchItem) {
        String str;
        if (this.f88332b) {
            String goTo = baseSearchItem.getGoTo();
            str = goTo;
            if (goTo == null) {
                str = "";
            }
        } else {
            String linkType = baseSearchItem.getLinkType();
            str = linkType;
            if (linkType == null) {
                str = "";
            }
        }
        return str;
    }

    @NotNull
    public final String r0(boolean z6, @NotNull SearchBangumiItem searchBangumiItem) {
        String str;
        if (this.f88332b) {
            SearchBangumiItem.a aVar = SearchBangumiItem.Companion;
            int mediaType = searchBangumiItem.getMediaType();
            aVar.getClass();
            str = SearchBangumiItem.a.a(mediaType) ? z6 ? "pgc.bangumi-search.search-card.all.click" : "pgc.bangumi-search.search-card.all.show" : z6 ? "pgc.cinema-search.search-card.all.click" : "pgc.cinema-search.search-card.all.show";
        } else {
            str = z6 ? "search.search-result.search-card.all.click" : "search.search-result.search-card.all.show";
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.String> t0(com.bilibili.search2.api.SearchBangumiItem r7) {
        /*
            r6 = this;
            r0 = r7
            java.util.List r0 = r0.getBadges()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L21
            r0 = r8
            r1 = 0
            java.lang.Object r0 = kotlin.collections.CollectionsKt.getOrNull(r0, r1)
            com.bilibili.search2.api.Tag r0 = (com.bilibili.search2.api.Tag) r0
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L21
            r0 = r8
            java.lang.String r0 = r0.getText()
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r9
            if (r0 != 0) goto L25
        L21:
            java.lang.String r0 = ""
            r8 = r0
        L25:
            r0 = 1
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "badges"
            r4 = r8
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            java.util.Map r0 = kotlin.collections.MapsKt.mutableMapOf(r0)
            r8 = r0
            r0 = r6
            com.bilibili.search2.api.g r0 = r0.f88333c
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L54
            r0 = r9
            java.lang.String r0 = r0.getParam()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L54
            r0 = r8
            java.lang.String r1 = "moduleid"
            r2 = r9
            java.lang.Object r0 = r0.put(r1, r2)
        L54:
            r0 = r6
            com.bilibili.search2.api.g r0 = r0.f88333c
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L71
            r0 = r9
            java.lang.String r0 = r0.f86345l
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L71
            r0 = r8
            java.lang.String r1 = "moduletype"
            r2 = r9
            java.lang.Object r0 = r0.put(r1, r2)
        L71:
            r0 = r7
            java.lang.String r0 = r0.getParam()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L85
            r0 = r8
            java.lang.String r1 = "sub_moduleid"
            r2 = r9
            java.lang.Object r0 = r0.put(r1, r2)
        L85:
            r0 = r7
            java.lang.String r0 = r0.getGoTo()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L99
            r0 = r8
            java.lang.String r1 = "sub_moduletype"
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
        L99:
            r0 = r8
            java.lang.String r1 = "module_pos"
            java.lang.String r2 = "1"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.aggregate.d.t0(com.bilibili.search2.api.SearchBangumiItem):java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e4  */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.bilibili.okretro.converter.IParser, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [com.bilibili.okretro.converter.IParser, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.aggregate.d.u0(android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(boolean z6) {
        RecyclerView recyclerView = this.f88347r;
        c cVar = this.f88350u;
        recyclerView.removeItemDecoration(cVar);
        C0597d c0597d = this.f88351v;
        recyclerView.removeItemDecoration(c0597d);
        if (((SearchBangumiItem) getData()).getEpisodesNew() == null || !(!r0.isEmpty())) {
            recyclerView.setVisibility(8);
            return;
        }
        Context context = this.itemView.getContext();
        recyclerView.setLayoutManager(z6 ? new LinearLayoutManager(context, 0, false) : new GridLayoutManager(context, 6));
        if (z6) {
            recyclerView.addItemDecoration(c0597d);
        } else {
            recyclerView.addItemDecoration(cVar);
            List<EpisodeNew> episodesNew = ((SearchBangumiItem) getData()).getEpisodesNew();
            if ((episodesNew != null ? Integer.valueOf(episodesNew.size()) : null).intValue() > 6) {
                SearchBangumiItem searchBangumiItem = (SearchBangumiItem) getData();
                List<EpisodeNew> episodesNew2 = ((SearchBangumiItem) getData()).getEpisodesNew();
                List<EpisodeNew> listSubList = null;
                if (episodesNew2 != null) {
                    listSubList = episodesNew2.subList(0, 6);
                }
                searchBangumiItem.setEpisodesNew(listSubList);
            }
        }
        com.bilibili.search2.result.bangumi.r<EpisodeNew> rVar = new com.bilibili.search2.result.bangumi.r<>(z6 ? 2131494427 : 2131494426, new E91.b(this.f88332b));
        rVar.f87459e = z6;
        this.f88349t = rVar;
        List<EpisodeNew> episodesNew3 = ((SearchBangumiItem) getData()).getEpisodesNew();
        if (episodesNew3 != null) {
            Iterator<T> it = episodesNew3.iterator();
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int i9 = i8;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i10 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                EpisodeNew episodeNew = (EpisodeNew) next;
                episodeNew.setPosForNeuron(i10);
                int i11 = i9;
                if (episodeNew.getType() == 0) {
                    episodeNew.setPosition(i9);
                    i11 = i9 + 1;
                }
                i7 = i10;
                i8 = i11;
            }
        }
        com.bilibili.search2.result.bangumi.r<EpisodeNew> rVar2 = this.f88349t;
        if (rVar2 != null) {
            rVar2.N(((SearchBangumiItem) getData()).getEpisodesNew());
        }
        recyclerView.setAdapter(this.f88349t);
        recyclerView.setVisibility(0);
        if (z6) {
            ListExtentionsKt.scrollToPositionWithOffset(recyclerView, ((SearchBangumiItem) getData()).getScrollPosition(), ((SearchBangumiItem) getData()).getItemOffset());
        }
    }

    public final void w0() {
        boolean z6 = true;
        if (((SearchBangumiItem) getData()).isAtten() != 1) {
            z6 = false;
        }
        int i7 = C6062b.f87387a;
        C6062b.c(this.f88343n, this.f88346q, z6, (SearchBangumiItem) getData(), 2131240003, 2131239922);
        SearchBangumiItem.FollowButton followButton = ((SearchBangumiItem) getData()).getFollowButton();
        C6062b.b(this.f88348s, followButton != null ? followButton.getIcon() : null, z6);
    }
}
