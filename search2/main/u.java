package com.bilibili.search2.main;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.main.data.SearchPageStateModel;
import com.bilibili.search2.ogv.OgvSearchView;
import kntr.base.utils.foundation.InputMethodManagerHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.SearchView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/u.class */
@StabilityInferred(parameters = 0)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public TintLinearLayout f86918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public OgvSearchView f86919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public TintTextView f86920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View f86921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public TintLinearLayout f86922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public TintImageView f86923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public TintImageView f86924g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f86925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f86926j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public C6042i f86927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public View.OnClickListener f86928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public SearchPageStateModel f86929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f86930n = LazyKt.lazy(new com.bilibili.biligame.ui.pay.cdk.compose.s(this, 1));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f86931o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f86932p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f86933q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final t f86934r;

    /* JADX WARN: Type inference failed for: r1v8, types: [com.bilibili.search2.main.t] */
    public u() {
        ConfigManager.Companion companion = ConfigManager.Companion;
        this.f86931o = companion.isHitFF("ff_search_bar_ui_exp1");
        this.f86932p = companion.isHitFF("ff_search_bar_ui_exp2");
        this.f86933q = DeviceDecision.INSTANCE.getBoolean("list_search_click_area_extend_disable", false);
        this.f86934r = new ViewTreeObserver.OnWindowFocusChangeListener(this) { // from class: com.bilibili.search2.main.t

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final u f86917a;

            {
                this.f86917a = this;
            }

            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z6) {
                ViewTreeObserver viewTreeObserver;
                u uVar = this.f86917a;
                uVar.getClass();
                BLog.i("BiliMainSearchViewHelper", "onWindowFocusChanged " + z6);
                if (z6) {
                    SearchView searchView = uVar.f86919b;
                    SearchView.QueryText queryTextView = null;
                    Context context = searchView != null ? searchView.getContext() : null;
                    OgvSearchView ogvSearchView = uVar.f86919b;
                    if (ogvSearchView != null) {
                        queryTextView = ogvSearchView.getQueryTextView();
                    }
                    InputMethodManagerHelper.showSoftInput(context, queryTextView, 2);
                    try {
                        BLog.i("BiliMainSearchViewHelper", "removeOnWindowFocusChangeListener");
                        SearchView searchView2 = uVar.f86919b;
                        if (searchView2 == null || (viewTreeObserver = searchView2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
                            return;
                        }
                        viewTreeObserver.removeOnWindowFocusChangeListener(uVar.f86934r);
                    } catch (IllegalStateException e7) {
                        BLog.e("BiliMainSearchViewHelper", "removeOnWindowFocusChangeListener exception=" + e7);
                    }
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(@org.jetbrains.annotations.NotNull final com.bilibili.search2.main.C6042i r12, @org.jetbrains.annotations.NotNull Bl.x1 r13, @org.jetbrains.annotations.NotNull com.bilibili.search2.main.data.SearchPageStateModel r14, @org.jetbrains.annotations.NotNull android.view.View.OnClickListener r15, @org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleCoroutineScope r16, @org.jetbrains.annotations.NotNull com.bilibili.search2.main.C6035b r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.u.a(com.bilibili.search2.main.i, Bl.x1, com.bilibili.search2.main.data.SearchPageStateModel, android.view.View$OnClickListener, androidx.lifecycle.LifecycleCoroutineScope, com.bilibili.search2.main.b, boolean):void");
    }

    public final void b(boolean z6) {
        SearchView searchView = this.f86919b;
        if (searchView == null) {
            return;
        }
        InputMethodManagerHelper.hideSoftInput(searchView.getContext(), this.f86919b, 2);
        if (z6) {
            this.f86919b.clearFocus();
            this.f86919b.setFocusable(false);
        }
    }

    public final void c() {
        ViewTreeObserver viewTreeObserver;
        SearchView searchView = this.f86919b;
        if (searchView != null) {
            searchView.setFocusable(true);
        }
        SearchView searchView2 = this.f86919b;
        if (searchView2 != null) {
            searchView2.requestFocus();
        }
        SearchView searchView3 = this.f86919b;
        if (searchView3 == null || !searchView3.hasWindowFocus()) {
            BLog.i("BiliMainSearchViewHelper", "!hasWindowFocus");
            SearchView searchView4 = this.f86919b;
            if (searchView4 == null || (viewTreeObserver = searchView4.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnWindowFocusChangeListener(this.f86934r);
            return;
        }
        BLog.i("BiliMainSearchViewHelper", "hasWindowFocus");
        SearchView searchView5 = this.f86919b;
        SearchView.QueryText queryTextView = null;
        Context context = searchView5 != null ? searchView5.getContext() : null;
        OgvSearchView ogvSearchView = this.f86919b;
        if (ogvSearchView != null) {
            queryTextView = ogvSearchView.getQueryTextView();
        }
        InputMethodManagerHelper.showSoftInput(context, queryTextView, 2);
    }

    public final void d(boolean z6) {
        if (z6) {
            TintTextView tintTextView = this.f86920c;
            if (tintTextView != null) {
                tintTextView.setTextColor(this.f86926j);
            }
            TintImageView tintImageView = this.f86923f;
            if (tintImageView != null) {
                tintImageView.setColorFilter(this.f86926j);
                return;
            }
            return;
        }
        TintTextView tintTextView2 = this.f86920c;
        if (tintTextView2 != null) {
            tintTextView2.setTextColor(this.f86925i);
        }
        TintImageView tintImageView2 = this.f86923f;
        if (tintImageView2 != null) {
            tintImageView2.setColorFilter(this.h);
        }
    }

    public final void e(@Nullable String str) {
        OgvSearchView ogvSearchView = this.f86919b;
        if (ogvSearchView != null) {
            ogvSearchView.setQuery(str);
        }
    }
}
