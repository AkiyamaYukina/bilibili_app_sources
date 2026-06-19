package com.bilibili.search2.main;

import Yt0.C3163q;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline0;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.droid.StringUtil;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.mixin.Flag;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.api.DefaultKeyword;
import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.search2.api.SearchSuggest;
import com.bilibili.search2.discover.BiliMainSearchDiscoverFragment;
import com.bilibili.search2.main.data.SearchPageStateModel;
import com.bilibili.search2.result.BiliMainSearchResultFragment;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.bilibili.search2.result.all.SearchResultAllViewModel;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import com.bilibili.search2.result.base.SearchState;
import com.bilibili.search2.result.ogv.OgvThemeColorHelper;
import com.bilibili.search2.result.ogv.SearchColorModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.SearchView;
import tv.danmaku.bili.widget.section.adapter.BaseAdapter;
import tv.danmaku.bili.widget.section.holder.BaseViewHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchSuggestFragment.class */
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public final class BiliMainSearchSuggestFragment extends Hilt_BiliMainSearchSuggestFragment implements SearchView.OnQueryTextListener, SearchView.f, Et0.c, IPvTracker, Observer<SearchSuggest> {
    public RecyclerView h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Wt0.a f86683i = new BaseAdapter();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SearchPageStateModel f86684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public r f86685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Inject
    public com.bilibili.search2.component.f f86686l;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchSuggestFragment$a.class */
    public static final class a extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliMainSearchSuggestFragment f86687a;

        public a(BiliMainSearchSuggestFragment biliMainSearchSuggestFragment) {
            this.f86687a = biliMainSearchSuggestFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            super.onScrollStateChanged(recyclerView, i7);
            if (i7 == 1) {
                SearchPageStateModel searchPageStateModel = this.f86687a.f86684j;
                SearchPageStateModel searchPageStateModel2 = searchPageStateModel;
                if (searchPageStateModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                    searchPageStateModel2 = null;
                }
                searchPageStateModel2.f86755b.setValue(new SearchPageStateModel.c(false, false));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchSuggestFragment$b.class */
    public static final class b implements BaseAdapter.HandleClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliMainSearchSuggestFragment f86688a;

        public b(BiliMainSearchSuggestFragment biliMainSearchSuggestFragment) {
            this.f86688a = biliMainSearchSuggestFragment;
        }

        public final void handleClick(BaseViewHolder baseViewHolder) {
            if (baseViewHolder instanceof Xt0.a) {
                ((Xt0.a) baseViewHolder).itemView.setOnClickListener(new com.bilibili.ad.adview.videodetail.relate.d(1, baseViewHolder, this.f86688a));
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchSuggestFragment$c.class */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliMainSearchSuggestFragment f86689a;

        public c(BiliMainSearchSuggestFragment biliMainSearchSuggestFragment) {
            this.f86689a = biliMainSearchSuggestFragment;
        }
    }

    public final boolean A9(int i7, @Nullable KeyEvent keyEvent) {
        if (!isVisible()) {
            return false;
        }
        SearchPageStateModel searchPageStateModel = this.f86684j;
        SearchPageStateModel searchPageStateModel2 = searchPageStateModel;
        if (searchPageStateModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
            searchPageStateModel2 = null;
        }
        searchPageStateModel2.f86756c.setValue(new SearchPageStateModel.b(false, false, 2));
        return false;
    }

    @Override // Et0.c
    @Nullable
    public final OgvThemeColorHelper K2() {
        Et0.c cVarC = z.c(this);
        return cVarC != null ? cVarC.K2() : null;
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "search.search-sug.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return CredentialProviderBeginSignInController$$ExternalSyntheticOutline0.m("searchpage", "search-sug");
    }

    @Override // com.bilibili.search2.main.BaseMainSearchChildFragment
    @NotNull
    public final String jf() {
        return "search.search-sug.cancel-search.0.click";
    }

    @Override // com.bilibili.search2.main.BaseMainSearchChildFragment
    @NotNull
    public final String kf() {
        return "search-sug";
    }

    @Override // com.bilibili.search2.main.BaseMainSearchChildFragment
    public final void lf(boolean z6) {
        PageViewTracker.getInstance().setFragmentVisibility(this, !z6);
    }

    public final void nf() {
        SearchPageStateModel searchPageStateModel = this.f86684j;
        SearchPageStateModel searchPageStateModel2 = searchPageStateModel;
        if (searchPageStateModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
            searchPageStateModel2 = null;
        }
        searchPageStateModel2.f86755b.setValue(new SearchPageStateModel.c(false, false));
        SearchPageStateModel searchPageStateModel3 = this.f86684j;
        if (searchPageStateModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
            searchPageStateModel3 = null;
        }
        searchPageStateModel3.f86756c.setValue(new SearchPageStateModel.b(false, false, 6));
    }

    public final void of(String str) {
        r rVar = this.f86685k;
        if (rVar != null) {
            rVar.f86912b++;
            Handler handler = rVar.f86913c;
            handler.removeMessages(1);
            Message messageObtainMessage = handler.obtainMessage(1);
            messageObtainMessage.obj = str;
            messageObtainMessage.arg1 = rVar.f86912b;
            handler.sendMessageDelayed(messageObtainMessage, 50L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Wt0.a, androidx.recyclerview.widget.RecyclerView$Adapter, java.lang.Object] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(SearchSuggest searchSuggest) {
        SearchSuggest searchSuggest2 = searchSuggest;
        ?? r02 = this.f86683i;
        if (searchSuggest2 != null) {
            r02.getClass();
            List<Rs0.a> list = searchSuggest2.getList();
            r02.f27355a = list != null ? CollectionsKt.toMutableList(list) : null;
            r02.notifyDataSetChanged();
            return;
        }
        List<Rs0.a> list2 = r02.f27355a;
        if (list2 != null) {
            list2.clear();
            r02.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131494107, viewGroup, false);
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f86683i.f27356b = null;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentHide(@NotNull Flag flag) {
        SearchColorModel searchColorModelB;
        MutableLiveData<Boolean> mutableLiveData;
        super.onFragmentHide(flag);
        OgvThemeColorHelper ogvThemeColorHelperK2 = K2();
        if (ogvThemeColorHelperK2 == null || (searchColorModelB = ogvThemeColorHelperK2.b()) == null || (mutableLiveData = searchColorModelB.f88299j) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.FALSE);
    }

    @Override // com.bilibili.lib.ui.BaseFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, com.bilibili.lib.ui.mixin.IFragmentShowHide
    public final void onFragmentShow(@NotNull Flag flag) {
        SearchColorModel searchColorModelB;
        MutableLiveData<Boolean> mutableLiveData;
        super.onFragmentShow(flag);
        OgvThemeColorHelper ogvThemeColorHelperK2 = K2();
        if (ogvThemeColorHelperK2 == null || (searchColorModelB = ogvThemeColorHelperK2.b()) == null || (mutableLiveData = searchColorModelB.f88299j) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.TRUE);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Wt0.a, androidx.recyclerview.widget.RecyclerView$Adapter] */
    public final boolean onQueryTextChange(@Nullable String str) {
        Intent intent;
        Uri data;
        Intent intent2;
        if (this.f86684j == null) {
            return true;
        }
        if (str == null || StringsKt.isBlank(str)) {
            ?? r02 = this.f86683i;
            List<Rs0.a> list = r02.f27355a;
            if (list != null) {
                list.clear();
                r02.notifyDataSetChanged();
            }
            SearchPageStateModel searchPageStateModel = this.f86684j;
            SearchPageStateModel searchPageStateModel2 = searchPageStateModel;
            if (searchPageStateModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                searchPageStateModel2 = null;
            }
            searchPageStateModel2.f86754a.setValue(SearchPageStateModel.ShowFragmentState.DISCOVER);
        } else {
            SearchPageStateModel searchPageStateModel3 = this.f86684j;
            SearchPageStateModel searchPageStateModel4 = searchPageStateModel3;
            if (searchPageStateModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                searchPageStateModel4 = null;
            }
            if (Intrinsics.areEqual(searchPageStateModel4.f86766n.getValue(), Boolean.TRUE)) {
                SearchPageStateModel searchPageStateModel5 = this.f86684j;
                SearchPageStateModel searchPageStateModel6 = searchPageStateModel5;
                if (searchPageStateModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                    searchPageStateModel6 = null;
                }
                if (!searchPageStateModel6.f86776x) {
                    SearchPageStateModel searchPageStateModel7 = this.f86684j;
                    SearchPageStateModel searchPageStateModel8 = searchPageStateModel7;
                    if (searchPageStateModel7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                        searchPageStateModel8 = null;
                    }
                    searchPageStateModel8.f86755b.setValue(new SearchPageStateModel.c(true, false));
                    SearchPageStateModel searchPageStateModel9 = this.f86684j;
                    SearchPageStateModel searchPageStateModel10 = searchPageStateModel9;
                    if (searchPageStateModel9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                        searchPageStateModel10 = null;
                    }
                    searchPageStateModel10.f86756c.setValue(new SearchPageStateModel.b(true, false, 6));
                    of(str);
                }
            }
        }
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null && (intent2 = fragmentActivityP3.getIntent()) != null) {
            intent2.putExtra("keyword", str);
        }
        FragmentActivity fragmentActivityP32 = p3();
        if (fragmentActivityP32 != null && (intent = fragmentActivityP32.getIntent()) != null && (data = intent.getData()) != null) {
            Uri.Builder builderClearQuery = data.buildUpon().clearQuery();
            for (String str2 : data.getQueryParameterNames()) {
                if (!Intrinsics.areEqual(str2, "keyword")) {
                    builderClearQuery.appendQueryParameter(str2, data.getQueryParameter(str2));
                } else if (str != null && str.length() != 0) {
                    builderClearQuery.appendQueryParameter("keyword", str);
                }
            }
            intent.setData(builderClearQuery.build());
        }
        SearchPageStateModel searchPageStateModel11 = this.f86684j;
        if (searchPageStateModel11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
            searchPageStateModel11 = null;
        }
        searchPageStateModel11.f86766n.setValue(Boolean.TRUE);
        return true;
    }

    public final boolean onQueryTextSubmit(@Nullable String str) throws Exception {
        y yVarB = z.b(this);
        qf(str, false, yVarB != null ? yVarB.m9() : null);
        return true;
    }

    public final boolean onSuggestionQuery(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            SearchPageStateModel searchPageStateModel = this.f86684j;
            SearchPageStateModel searchPageStateModel2 = searchPageStateModel;
            if (searchPageStateModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                searchPageStateModel2 = null;
            }
            searchPageStateModel2.f86755b.setValue(new SearchPageStateModel.c(true, false));
            SearchPageStateModel searchPageStateModel3 = this.f86684j;
            if (searchPageStateModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                searchPageStateModel3 = null;
            }
            searchPageStateModel3.f86756c.setValue(new SearchPageStateModel.b(false, false, 6));
            return true;
        }
        SearchPageStateModel searchPageStateModel4 = this.f86684j;
        SearchPageStateModel searchPageStateModel5 = searchPageStateModel4;
        if (searchPageStateModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
            searchPageStateModel5 = null;
        }
        searchPageStateModel5.f86755b.setValue(new SearchPageStateModel.c(true, false));
        SearchPageStateModel searchPageStateModel6 = this.f86684j;
        if (searchPageStateModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
            searchPageStateModel6 = null;
        }
        searchPageStateModel6.f86756c.setValue(new SearchPageStateModel.b(true, false, 6));
        of(str);
        return true;
    }

    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.h = (RecyclerView) view.findViewById(2131312701);
        com.bilibili.search2.component.f fVar = this.f86686l;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchSuggestFactory");
            fVar = null;
        }
        RecyclerView recyclerView = this.h;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSugListView");
            recyclerView2 = null;
        }
        fVar.a(this, recyclerView2).a();
        RecyclerView recyclerView3 = this.h;
        RecyclerView recyclerView4 = recyclerView3;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSugListView");
            recyclerView4 = null;
        }
        recyclerView4.setLayoutManager(new LinearLayoutManager(p3()));
        RecyclerView recyclerView5 = this.h;
        RecyclerView recyclerView6 = recyclerView5;
        if (recyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSugListView");
            recyclerView6 = null;
        }
        recyclerView6.setAdapter(this.f86683i);
        RecyclerView recyclerView7 = this.h;
        RecyclerView recyclerView8 = recyclerView7;
        if (recyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSugListView");
            recyclerView8 = null;
        }
        recyclerView8.addItemDecoration(new C3163q(R$color.Ga2, com.bilibili.search2.utils.B.C(0.5f), com.bilibili.search2.utils.B.C(12.0f), com.bilibili.search2.utils.B.C(12.0f), false, null, false, false, 976));
        RecyclerView recyclerView9 = this.h;
        if (recyclerView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSugListView");
            recyclerView9 = null;
        }
        recyclerView9.addOnScrollListener(new a(this));
        this.f86683i.setHandleClickListener(new b(this));
        this.f86683i.f27356b = new c(this);
        this.f86684j = z.d(this);
        r rVar = (r) new ViewModelProvider(this).get(r.class);
        rVar.f86911a.observe(getViewLifecycleOwner(), this);
        this.f86685k = rVar;
    }

    public final void pf(@Nullable String str, @Nullable C6042i c6042i, @Nullable Integer num, @NotNull String str2, @Nullable String str3, boolean z6) {
        BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragmentC;
        BiliMainSearchResultFragment biliMainSearchResultFragmentD;
        BiliMainSearchSuggestFragment biliMainSearchSuggestFragmentF;
        if (str == null || StringsKt.isBlank(str)) {
            SearchPageStateModel searchPageStateModel = this.f86684j;
            SearchPageStateModel searchPageStateModel2 = searchPageStateModel;
            if (searchPageStateModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                searchPageStateModel2 = null;
            }
            DefaultKeyword value = searchPageStateModel2.f86758e.getValue();
            if (value != null) {
                String uri = value.getUri();
                Uri uri2 = (uri == null || StringsKt.isBlank(uri)) ? null : Uri.parse(value.getUri());
                SearchPageStateModel searchPageStateModel3 = this.f86684j;
                SearchPageStateModel searchPageStateModel4 = searchPageStateModel3;
                if (searchPageStateModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                    searchPageStateModel4 = null;
                }
                searchPageStateModel4.f86760g.setValue(new SearchPageStateModel.a(value.getWord(), uri2, str2, str3, z6, num, null, null, null, null, 3984));
                boolean z7 = Xs0.b.f28321a;
                Neurons.reportClick$default(false, "search.search-discover.search-gpt.0.click", (Map) null, 4, (Object) null);
            }
        } else {
            if (c6042i != null && (biliMainSearchSuggestFragmentF = c6042i.f()) != null && biliMainSearchSuggestFragmentF.isVisible()) {
                boolean z8 = Xs0.b.f28321a;
                if (!StringsKt.isBlank(str)) {
                    cf.p.b("query", str, "search.search-sug.search-gpt.0.click", false);
                }
            } else if (c6042i != null && (biliMainSearchResultFragmentD = c6042i.d()) != null && biliMainSearchResultFragmentD.isVisible()) {
                boolean z9 = Xs0.b.f28321a;
                if (!StringsKt.isBlank(str)) {
                    cf.p.b("query", str, "search.search-result.search-gpt.0.click", false);
                }
            } else if (c6042i != null && (biliMainSearchDiscoverFragmentC = c6042i.c()) != null && biliMainSearchDiscoverFragmentC.isVisible()) {
                boolean z10 = Xs0.b.f28321a;
                Neurons.reportClick$default(false, "search.search-discover.search-gpt.0.click", (Map) null, 4, (Object) null);
            }
            SearchPageStateModel searchPageStateModel5 = this.f86684j;
            if (searchPageStateModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                searchPageStateModel5 = null;
            }
            searchPageStateModel5.f86760g.setValue(new SearchPageStateModel.a(str, null, str2, str3, z6, num, null, null, null, null, 3984));
        }
        nf();
    }

    public final void qf(@Nullable String str, boolean z6, @Nullable C6042i c6042i) throws Exception {
        BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragmentC;
        String word;
        BiliMainSearchSuggestFragment biliMainSearchSuggestFragmentF;
        BiliMainSearchResultFragment biliMainSearchResultFragmentD;
        BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragmentC2;
        BiliMainSearchResultFragment biliMainSearchResultFragmentD2;
        BiliMainSearchSuggestFragment biliMainSearchSuggestFragmentF2;
        SearchResultAllFragment searchResultAllFragmentWf;
        SearchResultAllViewModel searchResultAllViewModelRf;
        SearchResultAll searchResultAllH1;
        BiliMainSearchSuggestFragment biliMainSearchSuggestFragmentF3;
        if (str == null || StringsKt.isBlank(str)) {
            SearchPageStateModel searchPageStateModel = this.f86684j;
            SearchPageStateModel searchPageStateModel2 = searchPageStateModel;
            if (searchPageStateModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                searchPageStateModel2 = null;
            }
            DefaultKeyword value = searchPageStateModel2.f86758e.getValue();
            if (value != null) {
                boolean z7 = Xs0.b.f28321a;
                HashMap map = new HashMap();
                map.put("query", value.getShow());
                map.put("trackid", value.getTrackId());
                map.put("searchpage", "search-discover");
                map.put("abtestid", value.getExpStr());
                map.put("click_query", value.getWord());
                map.put("jump_type", StringUtil.isNotBlank(value.getUri()) ? "av" : "search_result");
                map.put("jump_content", StringUtil.isNotBlank(value.getUri()) ? value.getUri() : value.getWord());
                Neurons.reportClick(false, "search.search-discover.default-word.0.click", map);
                if (c6042i != null && (biliMainSearchSuggestFragmentF = c6042i.f()) != null && biliMainSearchSuggestFragmentF.isVisible()) {
                    String word2 = value.getWord();
                    if (word2 != null && !StringsKt.isBlank(word2)) {
                        Neurons.reportClick(false, "search.search-sug.search.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("query", value.getWord()), TuplesKt.to("default_word_type", String.valueOf(value.getDefaultWordType()))}));
                    }
                } else if (c6042i != null && (biliMainSearchDiscoverFragmentC = c6042i.c()) != null && biliMainSearchDiscoverFragmentC.isVisible() && (word = value.getWord()) != null && !StringsKt.isBlank(word)) {
                    Neurons.reportClick(false, "search.search-discover.search.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("query", value.getWord()), TuplesKt.to("default_word_type", String.valueOf(value.getDefaultWordType()))}));
                }
                String uri = value.getUri();
                Uri uri2 = (uri == null || StringsKt.isBlank(uri)) ? null : Uri.parse(value.getUri());
                SearchPageStateModel searchPageStateModel3 = this.f86684j;
                if (searchPageStateModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                    searchPageStateModel3 = null;
                }
                searchPageStateModel3.f86760g.setValue(new SearchPageStateModel.a(value.getWord(), uri2, "app_recommend", value.getTrackId(), false, null, null, null, null, null, 4080));
            }
        } else {
            if (z6) {
                if (c6042i != null && (biliMainSearchSuggestFragmentF3 = c6042i.f()) != null && biliMainSearchSuggestFragmentF3.isVisible()) {
                    boolean z8 = Xs0.b.f28321a;
                    if (!StringsKt.isBlank(str)) {
                        cf.p.b("query", str, "search.search-sug.search.0.click", false);
                    }
                } else if (c6042i != null && (biliMainSearchDiscoverFragmentC2 = c6042i.c()) != null && biliMainSearchDiscoverFragmentC2.isVisible()) {
                    boolean z9 = Xs0.b.f28321a;
                    if (!StringsKt.isBlank(str)) {
                        cf.p.b("query", str, "search.search-discover.search.0.click", false);
                    }
                } else if (c6042i != null && (biliMainSearchResultFragmentD = c6042i.d()) != null && biliMainSearchResultFragmentD.isVisible()) {
                    boolean z10 = Xs0.b.f28321a;
                    if (!StringsKt.isBlank(str)) {
                        cf.p.b("query", str, "search.search-result.search.0.click", false);
                    }
                }
                if (c6042i != null && (biliMainSearchResultFragmentD2 = c6042i.d()) != null && biliMainSearchResultFragmentD2.isVisible() && (biliMainSearchSuggestFragmentF2 = c6042i.f()) != null && !biliMainSearchSuggestFragmentF2.isVisible()) {
                    BiliMainSearchResultFragment biliMainSearchResultFragmentD3 = c6042i.d();
                    if (biliMainSearchResultFragmentD3 != null) {
                        if (!Intrinsics.areEqual(biliMainSearchResultFragmentD3.yf(), biliMainSearchResultFragmentD3.wf()) || (searchResultAllFragmentWf = biliMainSearchResultFragmentD3.wf()) == null || (searchResultAllViewModelRf = searchResultAllFragmentWf.rf()) == null || (searchResultAllH1 = searchResultAllViewModelRf.h1()) == null || !searchResultAllH1.refreshFunctionOneEnable()) {
                            biliMainSearchResultFragmentD3 = null;
                        }
                        if (biliMainSearchResultFragmentD3 != null) {
                            BaseSearchResultFragment<?> baseSearchResultFragmentYf = biliMainSearchResultFragmentD3.yf();
                            if (baseSearchResultFragmentYf != null) {
                                baseSearchResultFragmentYf.d();
                                if (baseSearchResultFragmentYf instanceof SearchResultAllFragment) {
                                    SearchResultAllFragment searchResultAllFragment = (SearchResultAllFragment) baseSearchResultFragmentYf;
                                    if (((SearchState) searchResultAllFragment.rf().f87499f.getValue()).getEnableRefresh()) {
                                        searchResultAllFragment.cg();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            } else {
                boolean z11 = Xs0.b.f28321a;
                if (!StringsKt.isBlank(str)) {
                    cf.p.b("query", str, "search.search-sug.search.0.click", false);
                }
            }
            SearchPageStateModel searchPageStateModel4 = this.f86684j;
            if (searchPageStateModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                searchPageStateModel4 = null;
            }
            searchPageStateModel4.f86760g.setValue(new SearchPageStateModel.a(str, null, "app_search", null, false, null, null, null, null, null, 4088));
        }
        nf();
    }
}
