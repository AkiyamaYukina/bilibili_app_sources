package com.bilibili.search2.main;

import Bl.z1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.search2.discover.BiliMainSearchDiscoverFragment;
import com.bilibili.search2.halfscreen.SearchCoreHostFragment;
import com.bilibili.search2.main.data.SearchPageStateModel;
import com.bilibili.search2.main.ogv.OgvThemeState;
import com.bilibili.search2.main.ogv.e;
import com.bilibili.search2.ogv.OgvSearchView;
import com.bilibili.search2.result.BiliMainSearchResultFragment;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import com.bilibili.search2.result.ogv.OgvThemeColorHelper;
import com.bilibili.search2.result.ogv.weight.OgvRelativeLayout;
import com.bilibili.teenagersmode.TeenagersMode;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment.class */
@StabilityInferred(parameters = 0)
public final class BiliMainSearchCoreFragment extends androidx_fragment_app_Fragment implements x, Et0.c, Et0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public z1 f86651b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f86653d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public LinearLayout f86658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f86659k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public TintLinearLayout f86660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public OgvSearchView f86661m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public OgvRelativeLayout f86662n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public View f86663o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public View f86664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public C6037d f86665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public com.bilibili.search2.main.ogv.g f86666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f86667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f86668t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public Drawable f86669u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Drawable f86670v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f86652c = LazyKt.lazy(new E11.l(5));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f86654e = LazyKt.lazy(new E11.m(6));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lazy f86655f = LazyKt.lazy(new US0.A(this, 2));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f86656g = LazyKt.lazy(new E11.o(7));

    @NotNull
    public final Lazy h = LazyKt.lazy(new E11.p(8));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f86657i = LazyKt.lazy(new E11.u(8));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Lazy f86671w = LazyKt.lazy(new E11.e(5));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final Lazy f86672x = LazyKt.lazy(new E11.f(8));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Lazy f86673y = LazyKt.lazy(new Af1.w(this, 4));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final Lazy f86674z = LazyKt.lazy(new US0.w(this, 2));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment$a.class */
    public interface a {
        void qc();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f86675a;

        static {
            int[] iArr = new int[OgvThemeState.InputBarStyle.values().length];
            try {
                iArr[OgvThemeState.InputBarStyle.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[OgvThemeState.InputBarStyle.OGV.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f86675a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchCoreFragment$c.class */
    public static final /* synthetic */ class c implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final J41.c f86676a;

        public c(J41.c cVar) {
            this.f86676a = cVar;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f86676a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f86676a.invoke(obj);
        }
    }

    @Override // Et0.c
    @NotNull
    public final OgvThemeColorHelper K2() {
        return (OgvThemeColorHelper) this.f86657i.getValue();
    }

    @Override // com.bilibili.search2.main.y
    @NotNull
    public final SearchPageStateModel V4() {
        return kf();
    }

    @Override // com.bilibili.search2.main.y
    @NotNull
    public final E b9() {
        return (E) this.f86656g.getValue();
    }

    @Override // Et0.b
    public final void dd(float f7) {
        com.bilibili.search2.main.ogv.g gVar = this.f86666r;
        if (gVar != null) {
            gVar.h.trySend-JP2dKIU(new e.g(f7));
        }
    }

    public final SearchCoreHostFragment hf() {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment fragment = parentFragment;
            if (fragment == null) {
                return null;
            }
            if (fragment instanceof SearchCoreHostFragment) {
                return (SearchCoreHostFragment) fragment;
            }
            parentFragment = fragment.getParentFragment();
        }
    }

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public final F m8689if() {
        return (F) this.f86652c.getValue();
    }

    public final com.bilibili.search2.halfscreen.m jf() {
        return (com.bilibili.search2.halfscreen.m) this.f86674z.getValue();
    }

    public final SearchPageStateModel kf() {
        return (SearchPageStateModel) this.f86655f.getValue();
    }

    public final MainSearchViewModel lf() {
        return (MainSearchViewModel) this.f86673y.getValue();
    }

    @Override // com.bilibili.search2.main.y
    @NotNull
    public final C6042i m9() {
        return lf().f86729b;
    }

    public final void mf() throws Exception {
        BaseSearchResultFragment<?> baseSearchResultFragmentYf;
        BiliMainSearchResultFragment biliMainSearchResultFragmentD = lf().f86729b.d();
        if (biliMainSearchResultFragmentD == null || !biliMainSearchResultFragmentD.isVisible()) {
            pf();
            return;
        }
        kf().f86764l.setValue(Boolean.TRUE);
        BiliMainSearchResultFragment biliMainSearchResultFragmentD2 = lf().f86729b.d();
        if (biliMainSearchResultFragmentD2 != null && (baseSearchResultFragmentYf = biliMainSearchResultFragmentD2.yf()) != null) {
            baseSearchResultFragmentYf.lf(baseSearchResultFragmentYf);
            try {
                Xs0.b.e(baseSearchResultFragmentYf.rf().O0(), baseSearchResultFragmentYf.rf().getTrackId(), baseSearchResultFragmentYf.rf().P0());
            } catch (Throwable th) {
                BLog.e(th.toString());
            }
        }
        nf();
    }

    public final void nf() {
        if (lf().f86730c == null || Intrinsics.areEqual(lf().f86730c, Boolean.TRUE)) {
            pf();
            return;
        }
        u uVar = this.f86653d;
        u uVar2 = uVar;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchViewHelper");
            uVar2 = null;
        }
        uVar2.e("");
    }

    public final void of(int i7, String str, String str2, String str3, boolean z6) throws Exception {
        if (str2 != null && str2.length() != 0) {
            String str4 = str2;
            if (Intrinsics.areEqual(str3, "appsuggest_search")) {
                String strAppendUrlParamsIfAbsent = ListExtentionsKt.appendUrlParamsIfAbsent(str2, new Pair[]{new Pair("from_spmid", "search.search-sug.0.0")});
                if (z6) {
                    com.bilibili.search2.utils.B.t(requireContext(), str);
                }
                BiliMainSearchDiscoverFragment biliMainSearchDiscoverFragmentC = lf().f86729b.c();
                str4 = strAppendUrlParamsIfAbsent;
                if (biliMainSearchDiscoverFragmentC != null) {
                    String str5 = com.bilibili.search2.discover.d.f86431a;
                    Context context = biliMainSearchDiscoverFragmentC.getContext();
                    com.bilibili.search2.discover.o oVar = biliMainSearchDiscoverFragmentC.f86414q;
                    if (oVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("searchDiscoverDataCallback");
                        oVar = null;
                    }
                    com.bilibili.search2.discover.d.a(context, oVar);
                    str4 = strAppendUrlParamsIfAbsent;
                }
            }
            Os0.e.f(requireContext(), Uri.parse(str4));
            return;
        }
        kf().f86766n.setValue(Boolean.FALSE);
        u uVar = this.f86653d;
        u uVar2 = uVar;
        if (uVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchViewHelper");
            uVar2 = null;
        }
        uVar2.e(str);
        if (z6) {
            com.bilibili.search2.utils.B.t(requireContext(), str);
        }
        if (!TeenagersMode.getInstance().isEnable() && str != null) {
            for (com.bilibili.search2.interceptor.d dVar : (ArrayList) m8689if().f86708p) {
                if (dVar.a(str) && dVar.b(requireActivity(), str, LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()))) {
                    break;
                }
            }
        }
        u uVar3 = this.f86653d;
        u uVar4 = uVar3;
        if (uVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchViewHelper");
            uVar4 = null;
        }
        uVar4.b(false);
        kf().f86754a.setValue(SearchPageStateModel.ShowFragmentState.RESULT);
        BiliMainSearchResultFragment biliMainSearchResultFragmentD = lf().f86729b.d();
        if (biliMainSearchResultFragmentD != null) {
            if (str == null) {
                str = "";
            }
            if (str3 == null) {
                str3 = "";
            }
            biliMainSearchResultFragmentD.rf(str, str3, i7, m8689if().f86699f, m8689if().f86700g, m8689if().h, m8689if().f86702j, m8689if().f86703k, m8689if().f86701i, m8689if().f86704l, m8689if().f86705m, m8689if().f86706n, m8689if().f86707o);
        }
        F fM8689if = m8689if();
        fM8689if.f86699f = null;
        fM8689if.f86700g = null;
        fM8689if.h = null;
        fM8689if.f86701i = null;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        z1 z1VarInflate = z1.inflate(layoutInflater, viewGroup, false);
        this.f86651b = z1VarInflate;
        return z1VarInflate.a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (this.f86667s) {
            try {
                Result.Companion companion = Result.Companion;
                SearchPageStateModel searchPageStateModelKf = kf();
                searchPageStateModelKf.f86755b.setValue(null);
                searchPageStateModelKf.f86776x = false;
                searchPageStateModelKf.f86759f.setValue(null);
                Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.constructor-impl(ResultKt.createFailure(th));
            }
        }
        super.onDestroy();
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f86666r = null;
        this.f86651b = null;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.f86667s) {
            u uVar = this.f86653d;
            u uVar2 = uVar;
            if (uVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchViewHelper");
                uVar2 = null;
            }
            uVar2.b(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023d  */
    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onStart() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.BiliMainSearchCoreFragment.onStart():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onViewCreated(@org.jetbrains.annotations.NotNull android.view.View r14, @org.jetbrains.annotations.Nullable android.os.Bundle r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.BiliMainSearchCoreFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void pf() {
        ActivityResultCaller parentFragment = getParentFragment();
        a aVar = parentFragment instanceof a ? (a) parentFragment : null;
        if (aVar != null) {
            aVar.qc();
            return;
        }
        androidx.core.content.g gVarP3 = p3();
        a aVar2 = null;
        if (gVarP3 instanceof a) {
            aVar2 = (a) gVarP3;
        }
        if (aVar2 != null) {
            aVar2.qc();
            return;
        }
        FragmentActivity fragmentActivityP3 = p3();
        if (fragmentActivityP3 != null) {
            fragmentActivityP3.finish();
        }
    }
}
