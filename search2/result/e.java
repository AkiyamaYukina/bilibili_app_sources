package com.bilibili.search2.result;

import com.bilibili.search2.api.SearchResultAll;
import com.bilibili.search2.result.all.SearchResultAllFragment;
import com.bilibili.search2.result.all.SearchResultAllViewModel;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import com.bilibili.search2.result.base.SearchState;
import rx.functions.Action1;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/e.class */
public final /* synthetic */ class e implements PagerSlidingTabStrip.PageReselectedListener, Action1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f87749a;

    public /* synthetic */ e(Object obj) {
        this.f87749a = obj;
    }

    public void call(Object obj) {
        ((w60.j) this.f87749a).invoke(obj);
    }

    public void onReselected(int i7) {
        SearchResultAllViewModel searchResultAllViewModelRf;
        SearchResultAll searchResultAllH1;
        BiliMainSearchResultFragment biliMainSearchResultFragment = (BiliMainSearchResultFragment) this.f87749a;
        BaseSearchResultFragment<?> baseSearchResultFragmentYf = biliMainSearchResultFragment.yf();
        if (baseSearchResultFragmentYf != null) {
            SearchResultAllFragment searchResultAllFragmentWf = biliMainSearchResultFragment.wf();
            if (searchResultAllFragmentWf == null || (searchResultAllViewModelRf = searchResultAllFragmentWf.rf()) == null || (searchResultAllH1 = searchResultAllViewModelRf.h1()) == null || !searchResultAllH1.refreshFunctionOneEnable()) {
                baseSearchResultFragmentYf = null;
            }
            if (baseSearchResultFragmentYf != null) {
                baseSearchResultFragmentYf.d();
                if (baseSearchResultFragmentYf instanceof SearchResultAllFragment) {
                    SearchResultAllFragment searchResultAllFragment = (SearchResultAllFragment) baseSearchResultFragmentYf;
                    if (((SearchState) searchResultAllFragment.rf().f87499f.getValue()).getEnableRefresh()) {
                        searchResultAllFragment.cg();
                    }
                }
            }
        }
    }
}
