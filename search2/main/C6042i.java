package com.bilibili.search2.main;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.mixin.IFragmentShowHide;
import com.bilibili.pvtracker.IPvTracker;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.discover.BiliMainSearchDiscoverFragment;
import com.bilibili.search2.result.BiliMainSearchResultFragment;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.search2.main.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/i.class */
@StabilityInferred(parameters = 0)
public final class C6042i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public FragmentManager f86835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public OH.e f86836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public cJ.u f86837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public cJ.v f86838d;

    public static void a(C6042i c6042i, BaseMainSearchChildFragment baseMainSearchChildFragment, int i7, String str) throws Exception {
        c6042i.b();
        FragmentTransaction fragmentTransactionBeginTransaction = c6042i.f86835a.beginTransaction();
        if (!baseMainSearchChildFragment.isAdded()) {
            fragmentTransactionBeginTransaction.add(i7, baseMainSearchChildFragment, str);
            fragmentTransactionBeginTransaction.hide(baseMainSearchChildFragment);
        }
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
    }

    public static BaseFragment e(C6042i c6042i, boolean z6, boolean z7, int i7) throws Exception {
        BaseSearchResultFragment<?> baseSearchResultFragmentC;
        BiliMainSearchSuggestFragment biliMainSearchSuggestFragmentF;
        if ((i7 & 1) != 0) {
            z6 = false;
        }
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        c6042i.b();
        if (z6 && (biliMainSearchSuggestFragmentF = c6042i.f()) != null && biliMainSearchSuggestFragmentF.isVisible()) {
            baseSearchResultFragmentC = c6042i.f();
        } else {
            BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragmentC = c6042i.c();
            if (biliMainSearchDiscoverFragmentC == null || !biliMainSearchDiscoverFragmentC.isVisible()) {
                BaseSearchResultFragment<?> baseSearchResultFragmentYf = null;
                if (!z7) {
                    BiliMainSearchResultFragment biliMainSearchResultFragmentD = c6042i.d();
                    baseSearchResultFragmentYf = null;
                    if (biliMainSearchResultFragmentD != null) {
                        baseSearchResultFragmentYf = null;
                        if (biliMainSearchResultFragmentD.isVisible()) {
                            BiliMainSearchResultFragment biliMainSearchResultFragmentD2 = c6042i.d();
                            baseSearchResultFragmentYf = null;
                            if (biliMainSearchResultFragmentD2 != null) {
                                baseSearchResultFragmentYf = biliMainSearchResultFragmentD2.yf();
                            }
                        }
                    }
                }
                baseSearchResultFragmentC = baseSearchResultFragmentYf;
            } else {
                baseSearchResultFragmentC = c6042i.c();
            }
        }
        return baseSearchResultFragmentC;
    }

    public final void b() throws Exception {
        if (this.f86835a == null) {
            throw new Exception("fragmentManager is null, call attach() first!");
        }
    }

    @Nullable
    public final BiliMainSearchDiscoverFragment c() throws Exception {
        b();
        Fragment fragmentFindFragmentByTag = this.f86835a.findFragmentByTag("search_discover_fragment");
        return fragmentFindFragmentByTag instanceof BiliMainSearchDiscoverFragment ? (BiliMainSearchDiscoverFragment) fragmentFindFragmentByTag : null;
    }

    @Nullable
    public final BiliMainSearchResultFragment d() throws Exception {
        b();
        Fragment fragmentFindFragmentByTag = this.f86835a.findFragmentByTag("search_result_fragment");
        return fragmentFindFragmentByTag instanceof BiliMainSearchResultFragment ? (BiliMainSearchResultFragment) fragmentFindFragmentByTag : null;
    }

    @Nullable
    public final BiliMainSearchSuggestFragment f() throws Exception {
        b();
        Fragment fragmentFindFragmentByTag = this.f86835a.findFragmentByTag("search_suggest_fragment");
        return fragmentFindFragmentByTag instanceof BiliMainSearchSuggestFragment ? (BiliMainSearchSuggestFragment) fragmentFindFragmentByTag : null;
    }

    public final void g() {
        ConstraintLayout constraintLayout;
        OH.e eVar = this.f86836b;
        if (eVar == null || (constraintLayout = ((M) eVar.b).f86722c) == null) {
            return;
        }
        constraintLayout.setVisibility(8);
    }

    public final void h(boolean z6) throws Exception {
        BiliMainSearchSuggestFragment biliMainSearchSuggestFragmentF = f();
        if (biliMainSearchSuggestFragmentF == null || !biliMainSearchSuggestFragmentF.isVisible()) {
            return;
        }
        View view = f().getView();
        if (view != null) {
            view.setVisibility(8);
        }
        this.f86835a.beginTransaction().hide(biliMainSearchSuggestFragmentF).commitNowAllowingStateLoss();
        if (z6) {
            IFragmentShowHide iFragmentShowHideE = e(this, false, true, 1);
            IPvTracker iPvTracker = iFragmentShowHideE instanceof IPvTracker ? (IPvTracker) iFragmentShowHideE : null;
            if (iPvTracker != null) {
                PageViewTracker.getInstance().onPageVisibleChange(iPvTracker.getPvEventId(), String.valueOf(iPvTracker.hashCode()), 1, new Bundle(), true);
            }
        }
    }

    public final void i() throws Exception {
        b();
        BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragmentC = c();
        BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragment = biliMainSearchDiscoverFragmentC;
        if (biliMainSearchDiscoverFragmentC == null) {
            biliMainSearchDiscoverFragment = new BiliMainSearchDiscoverFragment();
        }
        BiliMainSearchResultFragment biliMainSearchResultFragmentD = d();
        BiliMainSearchResultFragment biliMainSearchResultFragment = biliMainSearchResultFragmentD;
        if (biliMainSearchResultFragmentD == null) {
            biliMainSearchResultFragment = new BiliMainSearchResultFragment();
        }
        BiliMainSearchSuggestFragment biliMainSearchSuggestFragmentF = f();
        BiliMainSearchSuggestFragment biliMainSearchSuggestFragment = biliMainSearchSuggestFragmentF;
        if (biliMainSearchSuggestFragmentF == null) {
            biliMainSearchSuggestFragment = new BiliMainSearchSuggestFragment();
        }
        a(this, biliMainSearchDiscoverFragment, 2131298918, "search_discover_fragment");
        a(this, biliMainSearchResultFragment, 2131298918, "search_result_fragment");
        a(this, biliMainSearchSuggestFragment, 2131312700, "search_suggest_fragment");
    }

    public final void j() throws Exception {
        b();
        BiliMainSearchSuggestFragment biliMainSearchSuggestFragmentF = f();
        if (biliMainSearchSuggestFragmentF == null || biliMainSearchSuggestFragmentF.isVisible()) {
            return;
        }
        View view = biliMainSearchSuggestFragmentF.getView();
        if (view != null) {
            view.setVisibility(0);
        }
        this.f86835a.beginTransaction().show(biliMainSearchSuggestFragmentF).commitNowAllowingStateLoss();
        IFragmentShowHide iFragmentShowHideE = e(this, false, false, 3);
        IPvTracker iPvTracker = iFragmentShowHideE instanceof IPvTracker ? (IPvTracker) iFragmentShowHideE : null;
        if (iPvTracker != null) {
            PageViewTracker.getInstance().onPageVisibleChange(iPvTracker.getPvEventId(), String.valueOf(iPvTracker.hashCode()), 0, iPvTracker.getPvExtra(), false);
        }
    }

    public final void k(BaseMainSearchChildFragment baseMainSearchChildFragment, BaseMainSearchChildFragment baseMainSearchChildFragment2) throws Exception {
        b();
        if (baseMainSearchChildFragment == null || baseMainSearchChildFragment2 == null) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = this.f86835a.beginTransaction();
        if (baseMainSearchChildFragment.isAdded() && baseMainSearchChildFragment2.isAdded()) {
            fragmentTransactionBeginTransaction.hide(baseMainSearchChildFragment).show(baseMainSearchChildFragment2).commitNowAllowingStateLoss();
        }
    }
}
