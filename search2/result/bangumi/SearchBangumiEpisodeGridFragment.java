package com.bilibili.search2.result.bangumi;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.gestures.y0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.utils.BiliCallLifeCycleObserverKt;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseRecyclerViewToolbarFragment;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.api.Episode;
import com.bilibili.search2.api.SearchService;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.LoadingImageView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/SearchBangumiEpisodeGridFragment.class */
@StabilityInferred(parameters = 0)
public final class SearchBangumiEpisodeGridFragment extends BaseRecyclerViewToolbarFragment implements IPvTracker {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f87358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f87359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f87360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f87361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f87362g;

    @Nullable
    public r<Episode> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public List<String> f87363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final a f87364j = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/SearchBangumiEpisodeGridFragment$a.class */
    public static final class a extends BiliApiDataCallback<List<? extends Episode>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SearchBangumiEpisodeGridFragment f87365b;

        public a(SearchBangumiEpisodeGridFragment searchBangumiEpisodeGridFragment) {
            this.f87365b = searchBangumiEpisodeGridFragment;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(List<? extends Episode> list) {
            List<? extends Episode> list2 = list;
            SearchBangumiEpisodeGridFragment searchBangumiEpisodeGridFragment = this.f87365b;
            if (list2 != null) {
                List<? extends Episode> list3 = !list2.isEmpty() ? list2 : null;
                if (list3 != null) {
                    for (Episode episode : list3) {
                        List<String> list4 = searchBangumiEpisodeGridFragment.f87363i;
                        if (list4 != null) {
                            if (CollectionsKt.contains(list4, episode != null ? episode.getParam() : null) && episode != null) {
                                episode.setClicked(0, true);
                            }
                        }
                    }
                    searchBangumiEpisodeGridFragment.hideLoading();
                    r<Episode> rVar = searchBangumiEpisodeGridFragment.h;
                    Unit unit = null;
                    if (rVar != null) {
                        rVar.N(list2);
                        unit = Unit.INSTANCE;
                    }
                    if (unit != null) {
                        return;
                    }
                }
            }
            LoadingImageView loadingImageView = searchBangumiEpisodeGridFragment.f64718b;
            if (loadingImageView != null) {
                loadingImageView.setRefreshComplete();
                searchBangumiEpisodeGridFragment.showEmptyTips(2131847856, 2131232152);
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            SearchBangumiEpisodeGridFragment searchBangumiEpisodeGridFragment = this.f87365b;
            LoadingImageView loadingImageView = searchBangumiEpisodeGridFragment.f64718b;
            if (loadingImageView != null) {
                loadingImageView.setRefreshComplete();
                searchBangumiEpisodeGridFragment.showEmptyTips(2131847856, 2131232152);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/SearchBangumiEpisodeGridFragment$b.class */
    public static final class b extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f87366a = com.bilibili.search2.utils.B.C(75.0f);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f87367b;

        public b(int i7) {
            this.f87367b = i7;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                int spanCount = gridLayoutManager.getSpanCount();
                int spanIndex = gridLayoutManager.getSpanSizeLookup().getSpanIndex(recyclerView.getChildAdapterPosition(view), spanCount);
                int width = (((recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight()) - (this.f87366a * spanCount)) / (spanCount - 1);
                float f7 = spanIndex;
                float f8 = spanCount;
                float f9 = f7 / f8;
                float f10 = width;
                rect.left = (int) (f9 * f10);
                rect.right = (int) ((((spanCount - spanIndex) - 1) / f8) * f10);
                rect.bottom = this.f87367b;
            }
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "search.ep-search.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        Bundle arguments = getArguments();
        bundle.putString("query", arguments != null ? arguments.getString("keyword") : null);
        bundle.putString("searchpage", "search-gridep");
        return bundle;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.f87360e;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        linkedHashMap.put("query", str2);
        String str3 = this.f87359d;
        String str4 = str3;
        if (str3 == null) {
            str4 = "";
        }
        linkedHashMap.put("trackid", str4);
        String str5 = this.f87358c;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("abtestid", str5);
        linkedHashMap.put("searchpage", "search-gridep");
        linkedHashMap.put("moduletype", "grid-return");
        boolean z6 = Xs0.b.f28321a;
        Neurons.reportClick(false, "search.ep-search.grid-return.0.click", linkedHashMap);
        super.onDestroy();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (PageViewTracker.getInstance().isInterceptFragmentReport()) {
            PageViewTracker.getInstance().onPageVisibleChange("search.ep-search.0.0.pv", String.valueOf(hashCode()), 0, getPvExtra(), true);
        }
        super.onResume();
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [com.bilibili.okretro.converter.IParser, java.lang.Object] */
    @Override // com.bilibili.lib.ui.BaseRecyclerViewToolbarFragment
    public final void onViewCreated(@Nullable RecyclerView recyclerView, @Nullable Bundle bundle) {
        Bundle bundle2;
        Bundle arguments = getArguments();
        setTitle(arguments != null ? arguments.getString("title") : null);
        if (recyclerView != null) {
            recyclerView.setBackgroundColor(ThemeUtils.getColorById(p3(), R$color.f64616Wh0));
        }
        int iC = com.bilibili.search2.utils.B.C(12.0f);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        }
        if (recyclerView != null) {
            recyclerView.setPadding(iC, com.bilibili.search2.utils.B.C(10.0f), iC, 0);
        }
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new b(iC));
        }
        if (recyclerView != null) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new SearchBangumiEpisodeGridFragment$observeWindowSizeForDecorationUpdate$1(recyclerView, this, null), 3, (Object) null);
        }
        this.h = new r<>(2131494366, new y0(1));
        Bundle arguments2 = getArguments();
        this.f87362g = arguments2 != null ? arguments2.getString("season_id") : null;
        Bundle arguments3 = getArguments();
        this.f87361f = arguments3 != null ? arguments3.getString("param") : null;
        Bundle arguments4 = getArguments();
        this.f87360e = arguments4 != null ? arguments4.getString("keyword") : null;
        Bundle arguments5 = getArguments();
        this.f87359d = arguments5 != null ? arguments5.getString("trackid") : null;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            arguments6.getString("linktype");
        }
        Bundle arguments7 = getArguments();
        this.f87358c = arguments7 != null ? arguments7.getString("abtest_id") : null;
        Bundle arguments8 = getArguments();
        this.f87363i = (arguments8 == null || (bundle2 = arguments8.getBundle("clicked_params")) == null) ? null : bundle2.getStringArrayList("clicked");
        r<Episode> rVar = this.h;
        if (rVar != null) {
            rVar.f87458d = new Function2(this) { // from class: com.bilibili.search2.result.bangumi.w

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchBangumiEpisodeGridFragment f87469a;

                {
                    this.f87469a = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Unit unit;
                    String uri;
                    Episode episode = (Episode) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (episode == null || (uri = episode.getUri()) == null || StringsKt.isBlank(uri)) {
                        unit = Unit.INSTANCE;
                    } else {
                        Uri uriBuild = Uri.parse(episode.getUri()).buildUpon().appendQueryParameter("intentFrom", "5").appendQueryParameter("from_spmid", "search.ep-search.0.0").build();
                        SearchBangumiEpisodeGridFragment searchBangumiEpisodeGridFragment = this.f87469a;
                        Os0.e.f(searchBangumiEpisodeGridFragment.getApplicationContext(), uriBuild);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String str = searchBangumiEpisodeGridFragment.f87360e;
                        String str2 = str;
                        if (str == null) {
                            str2 = "";
                        }
                        linkedHashMap.put("query", str2);
                        String str3 = searchBangumiEpisodeGridFragment.f87359d;
                        String str4 = str3;
                        if (str3 == null) {
                            str4 = "";
                        }
                        linkedHashMap.put("trackid", str4);
                        String str5 = searchBangumiEpisodeGridFragment.f87361f;
                        String str6 = str5;
                        if (str5 == null) {
                            str6 = "";
                        }
                        linkedHashMap.put("moduleid", str6);
                        String param = episode.getParam();
                        String str7 = param;
                        if (param == null) {
                            str7 = "";
                        }
                        linkedHashMap.put("sub_moduleid", str7);
                        linkedHashMap.put("server_page_pos", String.valueOf(iIntValue + 1));
                        String str8 = searchBangumiEpisodeGridFragment.f87358c;
                        if (str8 == null) {
                            str8 = "";
                        }
                        linkedHashMap.put("abtestid", str8);
                        linkedHashMap.put("searchpage", "search-gridep");
                        linkedHashMap.put("moduletype", "grid-ep");
                        boolean z6 = Xs0.b.f28321a;
                        Neurons.reportClick(false, "search.ep-search.grid-ep.all.click", linkedHashMap);
                        unit = Unit.INSTANCE;
                    }
                    return unit;
                }
            };
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(rVar);
        }
        this.f64718b.getLoadingTips().setTextSize(16.0f);
        ViewGroup.LayoutParams layoutParams = this.f64718b.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = null;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        }
        if (layoutParams2 != null) {
            layoutParams2.setMargins(0, 0, 0, 0);
            layoutParams2.gravity = 17;
        }
        showLoading();
        BiliCallLifeCycleObserverKt.enqueue(((SearchService) ServiceGenerator.createService(SearchService.class)).searchEpisodes(w8.y.a(), this.f87362g).setParser(new Object()), this, this.f87364j);
    }
}
