package com.bilibili.search2.result.holder.recommend;

import Bl.I;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.search2.api.BaseSearchItem;
import dt0.AbstractC6843f;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/o.class */
@StabilityInferred(parameters = 0)
public final class o extends AbstractC6843f<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final I f88196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<cY.a> f88197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f88198c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/recommend/o$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f88199a;

        public a(o oVar) {
            this.f88199a = oVar;
        }
    }

    public o(@NotNull I i7) {
        super(i7.a);
        this.f88196a = i7;
        e eVar = new e(new a(this));
        this.f88198c = eVar;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i7.a.getContext(), 2);
        RecyclerView recyclerView = i7.b;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(eVar);
    }

    @Override // dt0.AbstractC6839b
    public final void bind() {
        final I i7 = this.f88196a;
        i7.c.setText(((p) getData()).getTitle());
        List<d> list = ((p) getData()).f88200a;
        e eVar = this.f88198c;
        eVar.getClass();
        List<d> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            eVar.f88175b.clear();
            eVar.f88175b.addAll(list2);
            eVar.notifyDataSetChanged();
        }
        OneShotPreDrawListener.add(i7.a, new Runnable(this, i7) { // from class: com.bilibili.search2.result.holder.recommend.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final o f88194a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final I f88195b;

            {
                this.f88194a = this;
                this.f88195b = i7;
            }

            @Override // java.lang.Runnable
            public final void run() {
                o oVar = this.f88194a;
                I i8 = this.f88195b;
                ((p) oVar.getData()).f88201b = i8.a.getHeight();
            }
        });
        this.f88197b = CollectionsKt.mutableListOf(new cY.a[]{new cY.b(new eY.c(i7.b), 0.8f)});
    }

    @Nullable
    public final List<cY.a> getExposeChildren() {
        return this.f88197b;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
    }

    public final void onNestedChildExpose(int i7, int i8, @NotNull View view) {
        List<d> list = ((p) getData()).f88200a;
        d dVar = list != null ? list.get(i8) : null;
        if (dVar == null || dVar.f88169c) {
            return;
        }
        p pVar = (p) getData();
        RecyclerView recyclerView = getRecyclerView();
        boolean z6 = false;
        if ((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) == 0) {
            z6 = true;
        }
        pVar.setAtFirstScreen(z6);
        dVar.f88169c = true;
        String linkType = ((p) getData()).getLinkType();
        if (linkType == null) {
            linkType = "";
        }
        BaseSearchItem baseSearchItem = (BaseSearchItem) getData();
        Map mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{com.bilibili.app.authorspace.ui.pages.p.a(i8, 1, "module_pos"), TuplesKt.to("sub_modulename", dVar.f88167a), TuplesKt.to("recommend_reason", dVar.f88172f), TuplesKt.to("icon_type", dVar.f88173g)});
        if (Intrinsics.areEqual(((p) getData()).getGoTo(), "query_rec_afterclick")) {
            String param = ((p) getData()).getParam();
            String str = param;
            if (param == null) {
                str = "";
            }
            mapMutableMapOf.put("from_avid", str);
            String trackId = ((p) getData()).getTrackId();
            if (trackId == null) {
                trackId = "";
            }
            mapMutableMapOf.put("from_trackid", trackId);
        }
        Unit unit = Unit.INSTANCE;
        Xs0.b.k("search.search-result.search-card.all.show", linkType, baseSearchItem, null, mapMutableMapOf, false, null, null, null, 968);
    }
}
