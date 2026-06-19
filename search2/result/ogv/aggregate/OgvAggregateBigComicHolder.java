package com.bilibili.search2.result.ogv.aggregate;

import Bl.m0;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.compose.animation.core.C3337p;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.image2.view.legacy.ScalableImageView2;
import com.bilibili.lib.theme.R$color;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.EpisodeNew;
import com.bilibili.search2.api.FollowButtonV2;
import com.bilibili.search2.api.SearchComicItem;
import com.bilibili.search2.result.ogv.aggregate.OgvAggregateBigComicHolder;
import dt0.AbstractC6843f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/OgvAggregateBigComicHolder.class */
@StabilityInferred(parameters = 0)
public final class OgvAggregateBigComicHolder extends AbstractC6843f<SearchComicItem> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Companion f88308f = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final m0 f88309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.result.holder.comic.o<EpisodeNew> f88310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.api.g f88311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f88312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f88313e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/OgvAggregateBigComicHolder$Companion.class */
    public static final class Companion {
        @JvmStatic
        @Keep
        @NotNull
        public final OgvAggregateBigComicHolder create(@NotNull ViewGroup viewGroup) {
            return new OgvAggregateBigComicHolder(m0.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/OgvAggregateBigComicHolder$a.class */
    public static final class a extends RecyclerView.ItemDecoration {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/OgvAggregateBigComicHolder$b.class */
    public static final class b extends RecyclerView.ItemDecoration {
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

    static {
        ListExtentionsKt.toPx(8);
        ListExtentionsKt.toPx(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.recyclerview.widget.RecyclerView$ItemDecoration, com.bilibili.search2.result.ogv.aggregate.OgvAggregateBigComicHolder$a] */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.recyclerview.widget.RecyclerView$ItemDecoration, com.bilibili.search2.result.ogv.aggregate.OgvAggregateBigComicHolder$b] */
    public OgvAggregateBigComicHolder(@NotNull m0 m0Var) {
        super(m0Var.a);
        this.f88309a = m0Var;
        this.f88312d = new RecyclerView.ItemDecoration();
        this.f88313e = new RecyclerView.ItemDecoration();
        m0Var.h.setOnClickListener(new Hn.c(this, 3));
        this.itemView.setOnClickListener(new XD0.h(this, 2));
        m0Var.e.setOnClickListener(new View.OnClickListener(this) { // from class: com.bilibili.search2.result.ogv.aggregate.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvAggregateBigComicHolder f88357a;

            {
                this.f88357a = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [Z7.c, androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.search2.result.ogv.aggregate.OgvAggregateBigComicHolder, dt0.b] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LifecycleOwner viewLifecycleOwner;
                LifecycleCoroutineScope lifecycleScope;
                LifecycleOwner viewLifecycleOwner2;
                LifecycleCoroutineScope lifecycleScope2;
                ?? r02 = this.f88357a;
                OgvAggregateBigComicHolder.Companion companion = OgvAggregateBigComicHolder.f88308f;
                long cid = ((SearchComicItem) r02.getData()).getCid();
                if (!C3337p.c(r02.itemView)) {
                    Os0.e.f18030a.d(r02.itemView.getContext());
                    return;
                }
                if (((SearchComicItem) r02.getData()).isAttended()) {
                    Fragment fragment = r02.getFragment();
                    if (fragment != null && (viewLifecycleOwner2 = fragment.getViewLifecycleOwner()) != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2)) != null) {
                        BuildersKt.launch$default(lifecycleScope2, (CoroutineContext) null, (CoroutineStart) null, new OgvAggregateBigComicHolder$onFollowClick$1(cid, r02, null), 3, (Object) null);
                    }
                } else {
                    Fragment fragment2 = r02.getFragment();
                    if (fragment2 != null && (viewLifecycleOwner = fragment2.getViewLifecycleOwner()) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) != null) {
                        BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new OgvAggregateBigComicHolder$onFollowClick$2(cid, r02, null), 3, (Object) null);
                    }
                }
                String str = ((SearchComicItem) r02.getData()).isAttended() ? "unfocus" : "focus";
                String linkType = ((SearchComicItem) r02.getData()).getLinkType();
                String str2 = linkType;
                if (linkType == null) {
                    str2 = "manga";
                }
                Xs0.b.i("search.comic-search.search-card.all.click", str, str2, (BaseSearchItem) r02.getData(), null, null, Xs0.b.b(((SearchComicItem) r02.getData()).getLinkType(), str), null, null, r02.q0((SearchComicItem) r02.getData()), false, null, 7088);
            }
        });
    }

    @JvmStatic
    @Keep
    @NotNull
    public static final OgvAggregateBigComicHolder create(@NotNull ViewGroup viewGroup) {
        return f88308f.create(viewGroup);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // dt0.AbstractC6839b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind() throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.aggregate.OgvAggregateBigComicHolder.bind():void");
    }

    @Override // dt0.AbstractC6843f
    @NotNull
    public final View getClickStatusView() {
        return this.f88309a.l;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
        SearchComicItem searchComicItem = (SearchComicItem) getData();
        RecyclerView recyclerView = getRecyclerView();
        boolean z6 = false;
        if ((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) == 0) {
            z6 = true;
        }
        searchComicItem.setAtFirstScreen(z6);
        Map<String, String> mapQ0 = q0((SearchComicItem) getData());
        String linkType = ((SearchComicItem) getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "manga";
        }
        Xs0.b.k("search.search-result.search-card.all.show", str, (BaseSearchItem) getData(), null, mapQ0, false, null, null, null, 1000);
    }

    public final Map<String, String> q0(SearchComicItem searchComicItem) {
        String str;
        String param;
        Map<String, String> mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to("module_pos", "1")});
        com.bilibili.search2.api.g gVar = this.f88311c;
        if (gVar != null && (param = gVar.getParam()) != null) {
            mapMutableMapOf.put("moduleid", param);
        }
        com.bilibili.search2.api.g gVar2 = this.f88311c;
        if (gVar2 != null && (str = gVar2.f86345l) != null) {
            mapMutableMapOf.put("moduletype", str);
        }
        String param2 = searchComicItem.getParam();
        if (param2 != null) {
            mapMutableMapOf.put("sub_moduleid", param2);
        }
        String goTo = searchComicItem.getGoTo();
        if (goTo != null) {
            mapMutableMapOf.put("sub_moduletype", goTo);
        }
        return mapMutableMapOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(boolean z6) {
        RecyclerView recyclerView = this.f88309a.j;
        a aVar = this.f88312d;
        recyclerView.removeItemDecoration(aVar);
        b bVar = this.f88313e;
        recyclerView.removeItemDecoration(bVar);
        if (((SearchComicItem) getData()).getEpisodesNew() == null || !(!r0.isEmpty())) {
            recyclerView.setVisibility(8);
            return;
        }
        Context context = this.itemView.getContext();
        recyclerView.setLayoutManager(z6 ? new LinearLayoutManager(context, 0, false) : new GridLayoutManager(context, 6));
        if (z6) {
            recyclerView.addItemDecoration(bVar);
        } else {
            recyclerView.addItemDecoration(aVar);
            List<EpisodeNew> episodesNew = ((SearchComicItem) getData()).getEpisodesNew();
            if ((episodesNew != null ? Integer.valueOf(episodesNew.size()) : null).intValue() > 6) {
                SearchComicItem searchComicItem = (SearchComicItem) getData();
                List<EpisodeNew> episodesNew2 = ((SearchComicItem) getData()).getEpisodesNew();
                List<EpisodeNew> listSubList = null;
                if (episodesNew2 != null) {
                    listSubList = episodesNew2.subList(0, 6);
                }
                searchComicItem.setEpisodesNew(listSubList);
            }
        }
        com.bilibili.search2.result.holder.comic.o<EpisodeNew> oVar = new com.bilibili.search2.result.holder.comic.o<>(z6 ? 2131494427 : 2131494426, new com.bilibili.search2.result.holder.comic.p(0));
        oVar.f88116e = z6;
        this.f88310b = oVar;
        List<EpisodeNew> episodesNew3 = ((SearchComicItem) getData()).getEpisodesNew();
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
        com.bilibili.search2.result.holder.comic.o<EpisodeNew> oVar2 = this.f88310b;
        if (oVar2 != null) {
            oVar2.N(((SearchComicItem) getData()).getEpisodesNew());
        }
        recyclerView.setAdapter(this.f88310b);
        recyclerView.setVisibility(0);
        if (z6) {
            ListExtentionsKt.scrollToPositionWithOffset(recyclerView, ((SearchComicItem) getData()).getScrollPosition(), ((SearchComicItem) getData()).getItemOffset());
        }
    }

    public final void s0() {
        boolean zIsAttended = ((SearchComicItem) getData()).isAttended();
        m0 m0Var = this.f88309a;
        com.bilibili.search2.result.holder.comic.b.b(m0Var.e, m0Var.d, zIsAttended, (SearchComicItem) getData(), 2131240003, R$color.Brand_pink, 2131239998, R$color.Graph_bg_thick);
        ScalableImageView2 scalableImageView2 = m0Var.f;
        FollowButtonV2 followButton = ((SearchComicItem) getData()).getFollowButton();
        com.bilibili.search2.result.holder.comic.b.a(R$color.Brand_pink, scalableImageView2, followButton != null ? followButton.getIcon() : null, zIsAttended);
    }
}
