package com.bilibili.search2.result.ogv.aggregate;

import Bl.p0;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.magicasakura.widgets.TintConstraintLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.SearchOgvClusterRelationItem;
import com.bilibili.search2.api.SearchOgvRelationItem;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.bilibili.search2.utils.B;
import dt0.AbstractC6843f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/s.class */
@StabilityInferred(parameters = 0)
public final class s extends AbstractC6843f<SearchOgvClusterRelationItem> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p0 f88403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.api.g f88404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<cY.a> f88405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f88406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TintTextView f88407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewGroup f88408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f88409g;

    @Nullable
    public final Et0.f h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f88410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<Integer> f88411j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/s$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f88412a;

        static {
            int[] iArr = new int[SearchOgvClusterRelationItem.Sort.values().length];
            try {
                iArr[SearchOgvClusterRelationItem.Sort.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SearchOgvClusterRelationItem.Sort.PUBLISH_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f88412a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(@NotNull p0 p0Var) {
        super(p0Var.a);
        this.f88403a = p0Var;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(2131308220);
        this.f88406d = recyclerView;
        this.f88407e = (TintTextView) this.itemView.findViewById(2131308225);
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(2131308215);
        this.f88408f = viewGroup;
        this.f88410i = 3;
        this.f88411j = CollectionsKt.listOf(new Integer[]{7, 8});
        recyclerView.setNestedScrollingEnabled(false);
        if (this.h == null) {
            Et0.f fVar = new Et0.f();
            this.h = fVar;
            recyclerView.addItemDecoration(fVar);
        }
        viewGroup.setOnClickListener(new r(false, this));
        int px = ListExtentionsKt.toPx(12);
        B.j(viewGroup, px, px, px, px);
    }

    public static void r0(s sVar) {
        sVar.getClass();
        if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
            sVar.w0();
            return;
        }
        Fragment fragment = sVar.getFragment();
        SearchResultAllFragment searchResultAllFragment = fragment instanceof SearchResultAllFragment ? (SearchResultAllFragment) fragment : null;
        if (searchResultAllFragment != null) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(searchResultAllFragment.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new OgvAggregateRelationVideoHolder$doOGVAggregateSearch$1$1(false, sVar, searchResultAllFragment, null), 3, (Object) null);
        }
        ((SearchOgvClusterRelationItem) sVar.getData()).setLoading(true);
        sVar.v0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ae  */
    @Override // dt0.AbstractC6839b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bind() throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.result.ogv.aggregate.s.bind():void");
    }

    @Nullable
    public final List<cY.a> getExposeChildren() {
        return this.f88405c;
    }

    @Override // dt0.AbstractC6843f
    public final void onCardExpose() {
    }

    public final void onNestedChildExpose(int i7, int i8, @NotNull View view) {
        com.bilibili.bplus.im.protobuf.a.b(i8, ((SearchOgvClusterRelationItem) getData()).getVideos().size(), "onNestedChildExpose childPosition:", " in ", "OgvAggregateRelationVideoHolder");
        if (i8 < 0 || i8 >= ((SearchOgvClusterRelationItem) getData()).getVideos().size()) {
            return;
        }
        SearchOgvRelationItem.DetailsRelationItem detailsRelationItem = ((SearchOgvClusterRelationItem) getData()).getVideos().get(i8);
        RecyclerView recyclerView = getRecyclerView();
        boolean z6 = false;
        if ((recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0) == 0) {
            z6 = true;
        }
        detailsRelationItem.setAtFirstScreen(z6);
        String linkType = ((SearchOgvClusterRelationItem) getData()).getLinkType();
        String str = linkType;
        if (linkType == null) {
            str = "";
        }
        Xs0.b.k("search.search-result.search-card.all.show", str, detailsRelationItem, null, s0(detailsRelationItem), false, detailsRelationItem.getParam(), detailsRelationItem.getModulePos(), null, 616);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void q0() throws NoWhenBranchMatchedException {
        int i7 = a.f88412a[((SearchOgvClusterRelationItem) getData()).getCurrentSelectedSort().ordinal()];
        p0 p0Var = this.f88403a;
        if (i7 == 1) {
            p0Var.j.setText(p0Var.a.getResources().getText(2131846858));
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            p0Var.j.setText(p0Var.a.getResources().getText(2131847820));
        }
    }

    public final Map<String, String> s0(BaseSearchItem baseSearchItem) {
        String str;
        String param;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.bilibili.search2.api.g gVar = this.f88404b;
        if (gVar != null && (param = gVar.getParam()) != null) {
            linkedHashMap.put("moduleid", param);
        }
        com.bilibili.search2.api.g gVar2 = this.f88404b;
        if (gVar2 != null && (str = gVar2.f86337c) != null) {
            linkedHashMap.put("moduletype", str);
        }
        String param2 = baseSearchItem.getParam();
        if (param2 != null) {
            linkedHashMap.put("sub_moduleid", param2);
        }
        String goTo = baseSearchItem.getGoTo();
        if (goTo != null) {
            linkedHashMap.put("sub_moduletype", goTo);
        }
        return linkedHashMap;
    }

    public final void t0(String str) {
        String linkType = ((SearchOgvClusterRelationItem) getData()).getLinkType();
        String str2 = linkType;
        if (linkType == null) {
            str2 = "";
        }
        BaseSearchItem baseSearchItem = (BaseSearchItem) getData();
        com.bilibili.search2.api.g gVar = this.f88404b;
        Xs0.b.i("search.search-result.search-card.all.click", str, str2, baseSearchItem, null, null, Xs0.b.c(str, gVar != null ? gVar.f86345l : null), null, null, s0((BaseSearchItem) getData()), false, null, 7088);
    }

    public final void u0() {
        p0 p0Var = this.f88403a;
        TintConstraintLayout tintConstraintLayout = p0Var.c;
        ViewGroup.LayoutParams layoutParams = tintConstraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = ((SearchOgvClusterRelationItem) getData()).getRetryHeight();
        tintConstraintLayout.setLayoutParams(layoutParams);
        TintConstraintLayout tintConstraintLayout2 = p0Var.f;
        ViewGroup.LayoutParams layoutParams2 = tintConstraintLayout2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = ((SearchOgvClusterRelationItem) getData()).getRetryHeight();
        tintConstraintLayout2.setLayoutParams(layoutParams2);
    }

    public final void v0() {
        p0 p0Var = this.f88403a;
        ListExtentionsKt.visible(p0Var.f);
        ListExtentionsKt.visible(p0Var.e);
        p0Var.e.setAnimation("fav_ic_tv_loading.json");
        p0Var.e.setRepeatCount(-1);
        p0Var.e.playAnimation();
        ListExtentionsKt.gone(p0Var.c);
    }

    public final void w0() {
        p0 p0Var = this.f88403a;
        ListExtentionsKt.gone(p0Var.f);
        ListExtentionsKt.gone(p0Var.e);
        ListExtentionsKt.visible(p0Var.c);
        p0Var.b.setText(p0Var.a.getResources().getText(2131841570));
        B.f(p0Var.g, new Be1.p(this, 6));
    }
}
