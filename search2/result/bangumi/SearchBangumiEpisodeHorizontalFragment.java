package com.bilibili.search2.result.bangumi;

import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.common.utils.BiliCallLifeCycleObserverKt;
import com.bilibili.app.comm.list.widget.SearchLoadingImageView;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseToolbarFragment;
import com.bilibili.magicasakura.widgets.TintToolbar;
import com.bilibili.okretro.BiliApiDataCallback;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.api.EpisodeNew;
import com.bilibili.search2.api.SearchService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.recycler.DividerDecoration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/SearchBangumiEpisodeHorizontalFragment.class */
@StabilityInferred(parameters = 0)
public final class SearchBangumiEpisodeHorizontalFragment extends BaseToolbarFragment implements IPvTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f87371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f87372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f87373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f87374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f87375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public r<EpisodeNew> f87376g;

    @Nullable
    public ViewGroup h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public RecyclerView f87377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public SearchLoadingImageView f87378j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f87381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public List<String> f87382n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f87379k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f87380l = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final a f87383o = new a(this);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/SearchBangumiEpisodeHorizontalFragment$a.class */
    public static final class a extends BiliApiDataCallback<EpisodesNewItem> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SearchBangumiEpisodeHorizontalFragment f87384b;

        public a(SearchBangumiEpisodeHorizontalFragment searchBangumiEpisodeHorizontalFragment) {
            this.f87384b = searchBangumiEpisodeHorizontalFragment;
        }

        @Override // com.bilibili.okretro.BiliApiDataCallback
        public final void onDataSuccess(EpisodesNewItem episodesNewItem) {
            List<EpisodeNew> episodeNewList;
            List<EpisodeNew> episodeNewList2;
            EpisodesNewItem episodesNewItem2 = episodesNewItem;
            List<EpisodeNew> episodeNewList3 = episodesNewItem2 != null ? episodesNewItem2.getEpisodeNewList() : null;
            SearchBangumiEpisodeHorizontalFragment searchBangumiEpisodeHorizontalFragment = this.f87384b;
            if (episodeNewList3 == null || ((episodeNewList = episodesNewItem2.getEpisodeNewList()) != null && episodeNewList.isEmpty())) {
                searchBangumiEpisodeHorizontalFragment.f87380l = false;
                if (searchBangumiEpisodeHorizontalFragment.f87379k != 1) {
                    SearchBangumiEpisodeHorizontalFragment.mf(searchBangumiEpisodeHorizontalFragment);
                    return;
                }
                SearchLoadingImageView searchLoadingImageView = searchBangumiEpisodeHorizontalFragment.f87378j;
                if (searchLoadingImageView != null) {
                    searchLoadingImageView.setVisibility(0);
                }
                SearchLoadingImageView searchLoadingImageView2 = searchBangumiEpisodeHorizontalFragment.f87378j;
                if (searchLoadingImageView2 != null) {
                    SearchLoadingImageView.P(searchLoadingImageView2, true, (Integer) null, (Integer) null, 6);
                    return;
                }
                return;
            }
            List<EpisodeNew> episodeNewList4 = episodesNewItem2.getEpisodeNewList();
            if (episodeNewList4 != null) {
                for (EpisodeNew episodeNew : episodeNewList4) {
                    List<String> list = searchBangumiEpisodeHorizontalFragment.f87382n;
                    if (list != null && CollectionsKt.contains(list, episodeNew.getParam())) {
                        episodeNew.setClicked(0, true);
                    }
                }
            }
            SearchLoadingImageView searchLoadingImageView3 = searchBangumiEpisodeHorizontalFragment.f87378j;
            if (searchLoadingImageView3 != null) {
                searchLoadingImageView3.K(true);
            }
            searchBangumiEpisodeHorizontalFragment.f87379k++;
            r<EpisodeNew> rVar = searchBangumiEpisodeHorizontalFragment.f87376g;
            if (rVar != null && (episodeNewList2 = episodesNewItem2.getEpisodeNewList()) != null && !episodeNewList2.isEmpty()) {
                Collection collection = rVar.f87457c;
                if (collection != null) {
                    ((ArrayList) collection).addAll(episodeNewList2);
                }
                rVar.notifyDataSetChanged();
            }
            searchBangumiEpisodeHorizontalFragment.f87381m = false;
            if (episodesNewItem2.getEpisodeNewList().size() < 20) {
                searchBangumiEpisodeHorizontalFragment.f87380l = false;
                SearchBangumiEpisodeHorizontalFragment.mf(searchBangumiEpisodeHorizontalFragment);
            }
        }

        @Override // com.bilibili.okretro.BiliApiCallback
        public final void onError(Throwable th) {
            View viewFindViewById;
            SearchBangumiEpisodeHorizontalFragment searchBangumiEpisodeHorizontalFragment = this.f87384b;
            View viewFindViewById2 = null;
            if (searchBangumiEpisodeHorizontalFragment.f87379k == 1) {
                SearchLoadingImageView searchLoadingImageView = searchBangumiEpisodeHorizontalFragment.f87378j;
                if (searchLoadingImageView != null) {
                    searchLoadingImageView.setVisibility(0);
                }
                SearchLoadingImageView searchLoadingImageView2 = searchBangumiEpisodeHorizontalFragment.f87378j;
                if (searchLoadingImageView2 != null) {
                    SearchLoadingImageView.P(searchLoadingImageView2, true, (Integer) null, (Integer) null, 6);
                }
            } else {
                ViewGroup viewGroup = searchBangumiEpisodeHorizontalFragment.h;
                if (viewGroup != null) {
                    viewGroup.setOnClickListener(new com.bilibili.ad.adview.widget.D(searchBangumiEpisodeHorizontalFragment, 1));
                }
                ViewGroup viewGroup2 = searchBangumiEpisodeHorizontalFragment.h;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                ViewGroup viewGroup3 = searchBangumiEpisodeHorizontalFragment.h;
                if (viewGroup3 != null && (viewFindViewById = viewGroup3.findViewById(2131303590)) != null) {
                    viewFindViewById.setVisibility(8);
                }
                ViewGroup viewGroup4 = searchBangumiEpisodeHorizontalFragment.h;
                if (viewGroup4 != null) {
                    viewFindViewById2 = viewGroup4.findViewById(2131311144);
                }
                ((TextView) viewFindViewById2).setText(2131841381);
            }
            searchBangumiEpisodeHorizontalFragment.f87381m = false;
        }
    }

    public static final void mf(SearchBangumiEpisodeHorizontalFragment searchBangumiEpisodeHorizontalFragment) {
        View viewFindViewById;
        ViewGroup viewGroup = searchBangumiEpisodeHorizontalFragment.h;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
        ViewGroup viewGroup2 = searchBangumiEpisodeHorizontalFragment.h;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        ViewGroup viewGroup3 = searchBangumiEpisodeHorizontalFragment.h;
        if (viewGroup3 != null && (viewFindViewById = viewGroup3.findViewById(2131303590)) != null) {
            viewFindViewById.setVisibility(8);
        }
        ViewGroup viewGroup4 = searchBangumiEpisodeHorizontalFragment.h;
        View viewFindViewById2 = null;
        if (viewGroup4 != null) {
            viewFindViewById2 = viewGroup4.findViewById(2131311144);
        }
        ((TextView) viewFindViewById2).setText(2131841736);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "search.ep-new.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        Bundle arguments = getArguments();
        bundle.putString("query", arguments != null ? arguments.getString("keyword") : null);
        bundle.putString("searchpage", "search-bandep");
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [com.bilibili.okretro.converter.IParser, java.lang.Object] */
    public final void nf() {
        View viewFindViewById;
        View viewFindViewById2 = null;
        if (!ConnectivityMonitor.getInstance().isNetworkActive() && this.f87379k == 1) {
            SearchLoadingImageView searchLoadingImageView = this.f87378j;
            if (searchLoadingImageView != null) {
                searchLoadingImageView.setVisibility(0);
            }
            SearchLoadingImageView searchLoadingImageView2 = this.f87378j;
            if (searchLoadingImageView2 != null) {
                SearchLoadingImageView.P(searchLoadingImageView2, true, (Integer) null, 2131841710, 2);
                return;
            }
            return;
        }
        if (!this.f87380l || this.f87381m) {
            return;
        }
        this.f87381m = true;
        if (this.f87379k == 1) {
            SearchLoadingImageView searchLoadingImageView3 = this.f87378j;
            if (searchLoadingImageView3 != null) {
                searchLoadingImageView3.setVisibility(0);
            }
            SearchLoadingImageView searchLoadingImageView4 = this.f87378j;
            if (searchLoadingImageView4 != null) {
                int i7 = SearchLoadingImageView.m;
                searchLoadingImageView4.Q(true, (Integer) null, (Integer) null);
            }
        } else {
            ViewGroup viewGroup = this.h;
            if (viewGroup != null) {
                viewGroup.setOnClickListener(null);
            }
            ViewGroup viewGroup2 = this.h;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            ViewGroup viewGroup3 = this.h;
            if (viewGroup3 != null && (viewFindViewById = viewGroup3.findViewById(2131303590)) != null) {
                viewFindViewById.setVisibility(0);
            }
            ViewGroup viewGroup4 = this.h;
            if (viewGroup4 != null) {
                viewFindViewById2 = viewGroup4.findViewById(2131311144);
            }
            ((TextView) viewFindViewById2).setText(2131841570);
        }
        BiliCallLifeCycleObserverKt.enqueue(((SearchService) ServiceGenerator.createService(SearchService.class)).searchEpisodesNew(w8.y.a(), this.f87375f, this.f87379k, 20).setParser(new Object()), this, this.f87383o);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131494746, viewGroup, false);
        this.f87377i = (RecyclerView) viewInflate.findViewById(2131306580);
        this.f87378j = viewInflate.findViewById(2131303626);
        return viewInflate;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.f87373d;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        linkedHashMap.put("query", str2);
        String str3 = this.f87372c;
        String str4 = str3;
        if (str3 == null) {
            str4 = "";
        }
        linkedHashMap.put("trackid", str4);
        String str5 = this.f87371b;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("abtestid", str5);
        linkedHashMap.put("searchpage", "search-bandep");
        linkedHashMap.put("moduletype", "band-return");
        boolean z6 = Xs0.b.f28321a;
        Neurons.reportClick(false, "search.ep-new.band-return.0.click", linkedHashMap);
        super.onDestroy();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (PageViewTracker.getInstance().isInterceptFragmentReport()) {
            PageViewTracker.getInstance().onPageVisibleChange("search.ep-new.0.0.pv", String.valueOf(hashCode()), 0, getPvExtra(), true);
        }
        super.onResume();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // com.bilibili.lib.ui.BaseToolbarFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Bundle bundle2;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.f87375f = arguments != null ? arguments.getString("season_id") : null;
        Bundle arguments2 = getArguments();
        this.f87374e = arguments2 != null ? arguments2.getString("param") : null;
        Bundle arguments3 = getArguments();
        this.f87373d = arguments3 != null ? arguments3.getString("keyword") : null;
        Bundle arguments4 = getArguments();
        this.f87372c = arguments4 != null ? arguments4.getString("trackid") : null;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            arguments5.getString("linktype");
        }
        Bundle arguments6 = getArguments();
        this.f87371b = arguments6 != null ? arguments6.getString("abtest_id") : null;
        Bundle arguments7 = getArguments();
        this.f87382n = (arguments7 == null || (bundle2 = arguments7.getBundle("clicked_params")) == null) ? null : bundle2.getStringArrayList("clicked");
        TintToolbar mToolbar = getMToolbar();
        if (mToolbar != null) {
            Bundle arguments8 = getArguments();
            mToolbar.setTitle(arguments8 != null ? arguments8.getString("title") : null);
        }
        r<EpisodeNew> rVar = new r<>(2131494367, new Object());
        this.f87376g = rVar;
        rVar.f87458d = new Function2(this) { // from class: com.bilibili.search2.result.bangumi.y

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SearchBangumiEpisodeHorizontalFragment f87470a;

            {
                this.f87470a = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                Unit unit;
                String uri;
                EpisodeNew episodeNew = (EpisodeNew) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (episodeNew == null || (uri = episodeNew.getUri()) == null || StringsKt.isBlank(uri)) {
                    unit = Unit.INSTANCE;
                } else {
                    Uri uriBuild = Uri.parse(episodeNew.getUri()).buildUpon().appendQueryParameter("intentFrom", "5").appendQueryParameter("from_spmid", "search.ep-new.0.0").build();
                    SearchBangumiEpisodeHorizontalFragment searchBangumiEpisodeHorizontalFragment = this.f87470a;
                    Os0.e.f(searchBangumiEpisodeHorizontalFragment.getApplicationContext(), uriBuild);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String str = searchBangumiEpisodeHorizontalFragment.f87373d;
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    linkedHashMap.put("query", str2);
                    String str3 = searchBangumiEpisodeHorizontalFragment.f87372c;
                    String str4 = str3;
                    if (str3 == null) {
                        str4 = "";
                    }
                    linkedHashMap.put("trackid", str4);
                    String str5 = searchBangumiEpisodeHorizontalFragment.f87374e;
                    String str6 = str5;
                    if (str5 == null) {
                        str6 = "";
                    }
                    linkedHashMap.put("moduleid", str6);
                    String param = episodeNew.getParam();
                    String str7 = param;
                    if (param == null) {
                        str7 = "";
                    }
                    linkedHashMap.put("sub_moduleid", str7);
                    linkedHashMap.put("server_page_pos", String.valueOf(iIntValue + 1));
                    String str8 = searchBangumiEpisodeHorizontalFragment.f87371b;
                    if (str8 == null) {
                        str8 = "";
                    }
                    linkedHashMap.put("abtestid", str8);
                    linkedHashMap.put("searchpage", "search-bandep");
                    linkedHashMap.put("moduletype", "band-ep");
                    boolean z6 = Xs0.b.f28321a;
                    Neurons.reportClick(false, "search.ep-new.band-ep.all.click", linkedHashMap);
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        };
        int i7 = R$color.Ga2;
        int iApplyDimension = (int) TypedValue.applyDimension(1, 0.5f, getResources().getDisplayMetrics());
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics());
        RecyclerView recyclerView = this.f87377i;
        if (recyclerView != null) {
            recyclerView.addItemDecoration(new DividerDecoration(i7, iApplyDimension, iApplyDimension2, 0));
        }
        RecyclerView recyclerView2 = this.f87377i;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        RecyclerView recyclerView3 = this.f87377i;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.f87376g);
        }
        RecyclerView recyclerView4 = this.f87377i;
        if (recyclerView4 != null) {
            recyclerView4.addOnScrollListener(new A(this));
        }
        this.h = (ViewGroup) LayoutInflater.from(getContext()).inflate(2131494692, (ViewGroup) this.f87377i, false);
        RecyclerView.Adapter bVar = new Kh1.b(this.f87376g);
        bVar.N(this.h, (Object) null);
        RecyclerView recyclerView5 = this.f87377i;
        if (recyclerView5 != null) {
            recyclerView5.setAdapter(bVar);
        }
        ViewGroup viewGroup = this.h;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        nf();
    }
}
