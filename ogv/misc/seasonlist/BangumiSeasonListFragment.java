package com.bilibili.ogv.misc.seasonlist;

import M3.A1;
import W60.N;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.lib.ui.BaseRecyclerViewToolbarFragment;
import com.bilibili.okretro.call.rxjava.c;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.SpacesItemDecoration;
import wk0.C8894a;
import wk0.InterfaceC8898e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/seasonlist/BangumiSeasonListFragment.class */
@StabilityInferred(parameters = 0)
public final class BangumiSeasonListFragment extends BaseRecyclerViewToolbarFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public C8894a f69305d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList<BangumiSeasonListPrevious> f69304c = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f69306e = LazyKt.lazy(new A1(8));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/seasonlist/BangumiSeasonListFragment$a.class */
    public static final class a extends GridLayoutManager.SpanSizeLookup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BangumiSeasonListFragment f69307a;

        public a(BangumiSeasonListFragment bangumiSeasonListFragment) {
            this.f69307a = bangumiSeasonListFragment;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public final int getSpanSize(int i7) {
            return this.f69307a.f69305d.getItemViewType(i7) == 101 ? 1 : 3;
        }
    }

    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        showLoading();
        Single<List<BangumiSeasonListPrevious>> seasonList = ((InterfaceC8898e) this.f69306e.getValue()).getSeasonList(1);
        Functions.v vVar = Functions.a;
        c.a(seasonList.subscribe(new N(this), new com.bilibili.upper.module.partitionTag.partitionTopic.fragment.a(this)), getLifecycle());
    }

    @Override // com.bilibili.lib.ui.BaseRecyclerViewToolbarFragment
    public final void onViewCreated(@Nullable RecyclerView recyclerView, @Nullable Bundle bundle) {
        setTitle(getString(2131822090));
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166076);
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new SpacesItemDecoration(dimensionPixelSize, 3));
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        gridLayoutManager.setSpanSizeLookup(new a(this));
        if (recyclerView != null) {
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        C8894a c8894a = new C8894a();
        this.f69305d = c8894a;
        if (recyclerView != null) {
            recyclerView.setAdapter(c8894a);
        }
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener());
        }
    }
}
