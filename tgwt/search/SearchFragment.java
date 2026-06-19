package com.bilibili.tgwt.search;

import Ky0.RunnableC2474p;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.SearchView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/search/SearchFragment.class */
@StabilityInferred(parameters = 0)
public final class SearchFragment extends androidx_fragment_app_Fragment implements IPvTracker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f111840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.tgwt.search.a f111841c = new com.bilibili.tgwt.search.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TogetherWatchSearchResultFragment f111842d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/search/SearchFragment$a.class */
    public static final class a implements SearchView.OnQueryTextListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SearchFragment f111843a;

        public a(SearchFragment searchFragment) {
            this.f111843a = searchFragment;
        }

        public final boolean onQueryTextChange(String str) {
            return false;
        }

        public final boolean onQueryTextSubmit(String str) {
            if (str == null || str.length() == 0) {
                return false;
            }
            SearchFragment searchFragment = this.f111843a;
            TogetherWatchSearchResultFragment togetherWatchSearchResultFragment = searchFragment.f111842d;
            TogetherWatchSearchResultFragment togetherWatchSearchResultFragment2 = togetherWatchSearchResultFragment;
            if (togetherWatchSearchResultFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("togetherWatchSearchResultFragment");
                togetherWatchSearchResultFragment2 = null;
            }
            togetherWatchSearchResultFragment2.h = str;
            togetherWatchSearchResultFragment2.f111173b = 1;
            togetherWatchSearchResultFragment2.f111174c = false;
            togetherWatchSearchResultFragment2.f111175d = true;
            togetherWatchSearchResultFragment2.f111178g.N(CollectionsKt.emptyList());
            togetherWatchSearchResultFragment2.loadData();
            searchFragment.f111841c.a(true);
            return true;
        }

        public final boolean onSuggestionQuery(String str) {
            return false;
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return "pgc.watch-together-search.0.0.pv";
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        return new Bundle();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f111840b = Integer.parseInt(arguments.getString("type", "0"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), 2131888041)).inflate(2131500510, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(2131310921);
        TogetherWatchSearchResultFragment togetherWatchSearchResultFragment = (TogetherWatchSearchResultFragment) getChildFragmentManager().findFragmentById(2131301958);
        this.f111842d = togetherWatchSearchResultFragment;
        TogetherWatchSearchResultFragment togetherWatchSearchResultFragment2 = togetherWatchSearchResultFragment;
        if (togetherWatchSearchResultFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("togetherWatchSearchResultFragment");
            togetherWatchSearchResultFragment2 = null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("type", this.f111840b);
        togetherWatchSearchResultFragment2.setArguments(bundle2);
        com.bilibili.tgwt.search.a aVar = this.f111841c;
        View.OnClickListener aVar2 = new Yo.a(this, 2);
        a aVar3 = new a(this);
        if (viewFindViewById == null) {
            aVar.getClass();
        } else {
            aVar.f111844a = viewFindViewById;
            aVar.f111845b = viewFindViewById.findViewById(2131310886);
            aVar.f111846c = (TextView) viewFindViewById.findViewById(2131296364);
            aVar.f111847d = viewFindViewById.findViewById(2131310902);
            SearchView searchView = aVar.f111845b;
            if (searchView != null) {
                searchView.setOnQueryTextListener(aVar3);
            }
            TextView textView = aVar.f111846c;
            if (textView != null) {
                textView.setOnClickListener(aVar2);
            }
            View view2 = aVar.f111847d;
            if (view2 != null) {
                view2.setOnClickListener((View.OnClickListener) aVar.f111848e.getValue());
            }
        }
        com.bilibili.tgwt.search.a aVar4 = this.f111841c;
        SearchView searchView2 = aVar4.f111845b;
        if (searchView2 != null) {
            searchView2.postDelayed(new RunnableC2474p(aVar4, 2), 100L);
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z6) {
        super.setUserVisibleHint(z6);
        PageViewTracker.getInstance().setFragmentVisibility(this, z6);
    }
}
