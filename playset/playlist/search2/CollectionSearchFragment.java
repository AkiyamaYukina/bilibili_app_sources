package com.bilibili.playset.playlist.search2;

import Pa.G;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.provider.SearchRecentSuggestions;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.widget.search.TintSearchView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.lib.ui.callback.IBackPress;
import com.bilibili.lib.ui.theme.ThemeWatcher;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playerbizcommon.playerinput.utils.InputExtensionsKt;
import com.bilibili.playset.playlist.search.MusicSuggestionProvider;
import dagger.hilt.android.AndroidEntryPoint;
import es0.C6971a;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchFragment.class */
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public final class CollectionSearchFragment extends Hilt_CollectionSearchFragment implements d, ThemeWatcher.Observer, IBackPress {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f85398g;

    @Nullable
    public C6971a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Fragment f85399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f85400j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f85401k;

    @Override // com.bilibili.playset.playlist.search2.d
    public final void V() {
        es0.g gVar;
        Fragment fragment = this.f85399i;
        if (fragment != null) {
            if (!fragment.isVisible()) {
                fragment = null;
            }
            if (fragment != null) {
                Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("search_suggest_fragment");
                if (fragmentFindFragmentByTag != null) {
                    FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
                    if (fragment.isAdded() && fragmentFindFragmentByTag.isAdded()) {
                        fragmentTransactionBeginTransaction.hide(fragment).show(fragmentFindFragmentByTag).commitNowAllowingStateLoss();
                    }
                }
                C6971a c6971a = this.h;
                if (c6971a == null || (gVar = c6971a.f117374c) == null) {
                    return;
                }
                gVar.f117415c.requestFocus();
            }
        }
    }

    @Override // com.bilibili.playset.playlist.search2.d
    @Nullable
    public final C6971a k6() {
        return this.h;
    }

    public final boolean kf() {
        String string;
        Boolean booleanStrictOrNull;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("isEmbedded")) == null || (booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(string)) == null) ? false : booleanStrictOrNull.booleanValue();
    }

    public final void lf(BaseFragment baseFragment, String str) {
        if (baseFragment.isAdded()) {
            FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
            C6971a c6971a = this.h;
            if (c6971a != null) {
                fragmentTransactionBeginTransaction.replace(c6971a.f117373b.getId(), baseFragment, str).commitNowAllowingStateLoss();
                return;
            }
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction2 = getChildFragmentManager().beginTransaction();
        C6971a c6971a2 = this.h;
        if (c6971a2 != null) {
            fragmentTransactionBeginTransaction2.add(c6971a2.f117373b.getId(), baseFragment, str).commitNowAllowingStateLoss();
        }
    }

    public final void mf() {
        WindowSizeClass windowSizeClassWindowSize;
        C6971a c6971a;
        es0.g gVar;
        es0.g gVar2;
        TintLinearLayout tintLinearLayout;
        es0.g gVar3;
        TintLinearLayout tintLinearLayout2;
        WindowSizeClass windowSizeClassWindowSize2;
        Context context = getContext();
        boolean z6 = (!com.bilibili.playset.utils.b.d() || context == null || (windowSizeClassWindowSize2 = ScreenAdjustUtilsKt.windowSize(context)) == null || KScreenAdjustUtilsKt.isNormal(windowSizeClassWindowSize2)) ? false : true;
        C6971a c6971a2 = this.h;
        ConstraintLayout.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = (c6971a2 == null || (gVar3 = c6971a2.f117374c) == null || (tintLinearLayout2 = gVar3.f117413a) == null) ? null : tintLinearLayout2.getLayoutParams();
        if (layoutParams2 instanceof ConstraintLayout.LayoutParams) {
            layoutParams = (ConstraintLayout.LayoutParams) layoutParams2;
        }
        if (layoutParams != null) {
            if (z6) {
                layoutParams.matchConstraintMaxWidth = ListExtentionsKt.toPx(600);
            } else {
                layoutParams.matchConstraintMaxWidth = 0;
            }
            C6971a c6971a3 = this.h;
            if (c6971a3 != null && (gVar2 = c6971a3.f117374c) != null && (tintLinearLayout = gVar2.f117413a) != null) {
                tintLinearLayout.setLayoutParams(layoutParams);
            }
        }
        Context context2 = getContext();
        if (context2 == null || (windowSizeClassWindowSize = ScreenAdjustUtilsKt.windowSize(context2)) == null || (c6971a = this.h) == null || (gVar = c6971a.f117374c) == null) {
            return;
        }
        int px = ListExtentionsKt.toPx(6);
        int px2 = KScreenAdjustUtilsKt.widthBreakPointLarge(windowSizeClassWindowSize) ? 0 : KScreenAdjustUtilsKt.widthBreakPointMedium(windowSizeClassWindowSize) ? ListExtentionsKt.toPx(20) : ListExtentionsKt.toPx(12);
        int px3 = (KScreenAdjustUtilsKt.widthBreakPointMedium(windowSizeClassWindowSize) || KScreenAdjustUtilsKt.widthBreakPointLarge(windowSizeClassWindowSize)) ? ListExtentionsKt.toPx(20) : ListExtentionsKt.toPx(16);
        InputExtensionsKt.updateMargin$default(gVar.f117416d, px2, 0, px, px, 2, null);
        TintTextView tintTextView = gVar.f117414b;
        tintTextView.setPadding(px3, tintTextView.getPaddingTop(), px3, tintTextView.getPaddingBottom());
    }

    @Override // com.bilibili.lib.ui.callback.IBackPress
    public final boolean onBackPressed() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null || fragmentManager.getBackStackEntryCount() <= 0) {
            return false;
        }
        fragmentManager.popBackStack();
        return true;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i7 = this.f85401k;
        int i8 = configuration.screenWidthDp;
        this.f85401k = i8;
        if (i7 != i8) {
            mf();
        }
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ThemeWatcher.getInstance().subscribe(this);
        com.bilibili.playset.utils.c cVar = com.bilibili.playset.utils.c.f85657a;
        G g7 = new G(this, 4);
        cVar.getClass();
        com.bilibili.playset.utils.c.b(this, g7);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C6971a c6971aInflate = C6971a.inflate(layoutInflater);
        this.h = c6971aInflate;
        return c6971aInflate != null ? c6971aInflate.f117372a : null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ThemeWatcher.getInstance().unSubscribe(this);
    }

    @Override // com.bilibili.playset.playlist.search2.d
    public final boolean onQueryTextSubmit(@Nullable String str) {
        if (isDetached()) {
            return false;
        }
        if (str == null) {
            return true;
        }
        CollectionSearchResultFragment collectionSearchResultFragment = null;
        new SearchRecentSuggestions(p3(), MusicSuggestionProvider.AUTHORITY, 1).saveRecentQuery(str, null);
        BLog.i("CollectionSearchFragment", "hideSuggestionFragment -> " + getChildFragmentManager().getFragments());
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("search_suggest_fragment");
        if (fragmentFindFragmentByTag != null && fragmentFindFragmentByTag.isAdded() && !fragmentFindFragmentByTag.isHidden()) {
            getChildFragmentManager().beginTransaction().hide(fragmentFindFragmentByTag).commitNowAllowingStateLoss();
        }
        Fragment fragment = this.f85399i;
        if (fragment != null && fragment.isAdded()) {
            getChildFragmentManager().beginTransaction().remove(fragment).commitNowAllowingStateLoss();
        }
        Fragment fragmentFindFragmentByTag2 = getChildFragmentManager().findFragmentByTag("search_result_fragment");
        if (fragmentFindFragmentByTag2 instanceof CollectionSearchResultFragment) {
            collectionSearchResultFragment = (CollectionSearchResultFragment) fragmentFindFragmentByTag2;
        }
        CollectionSearchResultFragment collectionSearchResultFragment2 = collectionSearchResultFragment;
        if (collectionSearchResultFragment == null) {
            collectionSearchResultFragment2 = new CollectionSearchResultFragment();
        }
        this.f85399i = collectionSearchResultFragment2;
        Bundle bundleM = CredentialProviderBeginSignInController$$ExternalSyntheticOutline0.m("keyword", str);
        bundleM.putLong("playlist_id", this.f85398g);
        bundleM.putString("isEmbedded", String.valueOf(kf()));
        collectionSearchResultFragment2.setArguments(bundleM);
        lf(collectionSearchResultFragment2, "search_result_fragment");
        return true;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f85400j) {
            return;
        }
        this.f85399i = getChildFragmentManager().findFragmentByTag("search_result_fragment");
    }

    @Override // com.bilibili.lib.ui.theme.ThemeWatcher.Observer
    public final void onThemeChanged() {
        es0.g gVar;
        TintSearchView tintSearchView;
        FragmentContainerView fragmentContainerView;
        C6971a c6971a = this.h;
        if (c6971a != null && (fragmentContainerView = c6971a.f117373b) != null) {
            fragmentContainerView.setBackgroundColor(ThemeUtils.getColorById(getContext(), R$color.Bg1));
        }
        C6971a c6971a2 = this.h;
        if (c6971a2 == null || (gVar = c6971a2.f117374c) == null || (tintSearchView = gVar.f117415c) == null) {
            return;
        }
        tintSearchView.h(R$color.Text1, R$color.Text3);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c9  */
    @Override // com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r7, @org.jetbrains.annotations.Nullable android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.search2.CollectionSearchFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
