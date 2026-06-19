package com.bilibili.playset.playlist.search2;

import android.content.Context;
import android.os.Bundle;
import android.provider.SearchRecentSuggestions;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$$ExternalSyntheticOutline0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.playset.playlist.search.MusicSuggestionProvider;
import dagger.hilt.android.AndroidEntryPoint;
import es0.C6971a;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search2/CollectionSearchActivity.class */
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public class CollectionSearchActivity extends m implements d {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int f85393J = 0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f85394F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public C6971a f85395G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public Fragment f85396H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f85397I = true;

    public final void Q6(BaseFragment baseFragment, String str) {
        if (baseFragment.isAdded()) {
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            C6971a c6971a = this.f85395G;
            if (c6971a != null) {
                fragmentTransactionBeginTransaction.replace(c6971a.f117373b.getId(), baseFragment, str).commitNowAllowingStateLoss();
                return;
            }
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction2 = getSupportFragmentManager().beginTransaction();
        C6971a c6971a2 = this.f85395G;
        if (c6971a2 != null) {
            fragmentTransactionBeginTransaction2.add(c6971a2.f117373b.getId(), baseFragment, str).commitNowAllowingStateLoss();
        }
    }

    @Override // com.bilibili.playset.playlist.search2.d
    public final void V() {
        es0.g gVar;
        Fragment fragment = this.f85396H;
        if (fragment != null) {
            CollectionSearchSuggestionFragment collectionSearchSuggestionFragment = null;
            if (!fragment.isVisible()) {
                fragment = null;
            }
            if (fragment != null) {
                Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("search_suggest_fragment");
                if (fragmentFindFragmentByTag instanceof CollectionSearchSuggestionFragment) {
                    collectionSearchSuggestionFragment = (CollectionSearchSuggestionFragment) fragmentFindFragmentByTag;
                }
                if (collectionSearchSuggestionFragment != null) {
                    FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
                    if (fragment.isAdded() && collectionSearchSuggestionFragment.isAdded()) {
                        fragmentTransactionBeginTransaction.hide(fragment).show(collectionSearchSuggestionFragment).commitNowAllowingStateLoss();
                    }
                }
                C6971a c6971a = this.f85395G;
                if (c6971a == null || (gVar = c6971a.f117374c) == null) {
                    return;
                }
                gVar.f117415c.requestFocus();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // com.bilibili.playset.playlist.search2.d
    @Nullable
    public final C6971a k6() {
        return this.f85395G;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @Override // com.bilibili.playset.playlist.search2.m, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.search2.CollectionSearchActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.playset.playlist.search2.d
    public final boolean onQueryTextSubmit(@Nullable String str) {
        if (isDestroyed()) {
            return false;
        }
        if (str == null) {
            return true;
        }
        new SearchRecentSuggestions(this, MusicSuggestionProvider.AUTHORITY, 1).saveRecentQuery(str, null);
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("search_suggest_fragment");
        CollectionSearchSuggestionFragment collectionSearchSuggestionFragment = fragmentFindFragmentByTag instanceof CollectionSearchSuggestionFragment ? (CollectionSearchSuggestionFragment) fragmentFindFragmentByTag : null;
        if (collectionSearchSuggestionFragment != null && collectionSearchSuggestionFragment.isAdded()) {
            getSupportFragmentManager().beginTransaction().hide(collectionSearchSuggestionFragment).commitNowAllowingStateLoss();
        }
        Fragment fragment = this.f85396H;
        if (fragment != null && fragment.isAdded()) {
            getSupportFragmentManager().beginTransaction().remove(fragment).commitNowAllowingStateLoss();
        }
        Fragment fragmentFindFragmentByTag2 = getSupportFragmentManager().findFragmentByTag("search_result_fragment");
        CollectionSearchResultFragment collectionSearchResultFragment = null;
        if (fragmentFindFragmentByTag2 instanceof CollectionSearchResultFragment) {
            collectionSearchResultFragment = (CollectionSearchResultFragment) fragmentFindFragmentByTag2;
        }
        CollectionSearchResultFragment collectionSearchResultFragment2 = collectionSearchResultFragment;
        if (collectionSearchResultFragment == null) {
            collectionSearchResultFragment2 = new CollectionSearchResultFragment();
        }
        this.f85396H = collectionSearchResultFragment2;
        Bundle bundleM = CredentialProviderBeginSignInController$$ExternalSyntheticOutline0.m("keyword", str);
        bundleM.putLong("playlist_id", this.f85394F);
        collectionSearchResultFragment2.setArguments(bundleM);
        Q6(collectionSearchResultFragment2, "search_result_fragment");
        return true;
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f85397I) {
            return;
        }
        this.f85396H = getSupportFragmentManager().findFragmentByTag("search_result_fragment");
    }
}
