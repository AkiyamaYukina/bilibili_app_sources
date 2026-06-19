package com.bilibili.search2.main;

import HG0.O0;
import M3.C2571d;
import M3.C2583h;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.app.dialogmanager2.PageDialogManager;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.openapk.AdOpenApkScene;
import com.bilibili.gripper.api.ad.core.openapk.IAdOpenApkWatcher;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.garb.Garb;
import com.bilibili.lib.ui.garb.GarbManager;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.utils.ThemeUtils;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.search2.main.data.SearchPageStateModel;
import com.bilibili.search2.ogv.OgvSearchView;
import com.bilibili.search2.result.BiliMainSearchResultFragment;
import com.bilibili.search2.result.base.BaseSearchResultFragment;
import com.bilibili.search2.result.ogv.OgvThemeColorHelper;
import com.bilibili.search2.result.ogv.SearchColorModel;
import com.bilibili.search2.result.ogv.weight.OgvRelativeLayout;
import com.bilibili.teenagersmode.TeenagersMode;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchActivity.class */
@StabilityInferred(parameters = 0)
@AndroidEntryPoint
public class BiliMainSearchActivity extends w implements It0.a, x, Et0.c, Et0.b {

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final int f86622Y0 = 0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f86624G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public u f86625H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public LinearLayout f86626I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public TintLinearLayout f86627J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public OgvRelativeLayout f86628K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public OgvSearchView f86629L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public View f86630M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Ht0.a f86632O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Ht0.a f86633P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Ht0.c f86634Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Ht0.a f86635R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Ht0.c f86636S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Ht0.b f86637T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Garb f86641X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    @Inject
    public com.bilibili.search2.component.d f86642X0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Bl.a f86646c0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @Nullable
    public IAdOpenApkWatcher f86649v0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final Lazy f86623F = LazyKt.lazy(new C2571d(6));

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public final C6035b f86631N = new C6035b();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @NotNull
    public final C6046m f86638U = new C6046m();

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    @NotNull
    public final E f86639V = new E();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @NotNull
    public final OgvThemeColorHelper f86640W = new OgvThemeColorHelper();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    @NotNull
    public final Lazy f86643Y = LazyKt.lazy(new com.bilibili.biligame.ui.pay.cdk.j(this, 2));

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @NotNull
    public final Lazy f86644Z = LazyKt.lazy(new K9.g(this, 1));

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public final Lazy f86645a0 = LazyKt.lazy(new K9.h(this, 5));

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy f86647p0 = LazyKt.lazy(new E00.a(8));

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Lazy f86648r0 = LazyKt.lazy(new C2583h(6));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchActivity$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f86650a;

        static {
            int[] iArr = new int[SearchColorModel.StateSource.values().length];
            try {
                iArr[SearchColorModel.StateSource.SLIDE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SearchColorModel.StateSource.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[SearchColorModel.StateSource.DRAW.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f86650a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.search2.main.BiliMainSearchActivity$onCreate$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/BiliMainSearchActivity$onCreate$2.class */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<SearchPageStateModel.a, Unit> {
        public AnonymousClass2(Object obj) {
            super(1, obj, BiliMainSearchActivity.class, "handleSearchAction", "handleSearchAction(Lcom/bilibili/search2/main/data/SearchPageStateModel$SearchAction;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchPageStateModel.a) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(SearchPageStateModel.a aVar) {
            BiliMainSearchActivity biliMainSearchActivity = (BiliMainSearchActivity) ((CallableReference) this).receiver;
            int i7 = BiliMainSearchActivity.f86622Y0;
            biliMainSearchActivity.getClass();
            Os0.e eVar = Os0.e.f18030a;
            String str = aVar.f86778a;
            Uri uri = aVar.f86779b;
            Os0.e.a(eVar, biliMainSearchActivity, str, uri != null ? uri.toString() : null, aVar.f86782e, aVar.f86780c, aVar.f86781d, aVar.f86783f, aVar.f86784g, aVar.h, aVar.f86785i, aVar.f86786j, aVar.f86787k, 64);
        }
    }

    @Override // It0.a
    public final void Aa() {
        OgvRelativeLayout ogvRelativeLayout = this.f86628K;
        OgvRelativeLayout ogvRelativeLayout2 = ogvRelativeLayout;
        if (ogvRelativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvRelativeLayout");
            ogvRelativeLayout2 = null;
        }
        ogvRelativeLayout2.f88472j = 0;
    }

    @Override // It0.a
    public final void Ce(int i7, @Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        OgvRelativeLayout ogvRelativeLayout = this.f86628K;
        OgvRelativeLayout ogvRelativeLayout2 = ogvRelativeLayout;
        if (ogvRelativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvRelativeLayout");
            ogvRelativeLayout2 = null;
        }
        ogvRelativeLayout2.a(i7, bitmap);
    }

    @Override // Et0.c
    @NotNull
    public final OgvThemeColorHelper K2() {
        return this.f86640W;
    }

    @Override // It0.a
    public final void K5(@ColorInt int i7) {
        ConstraintLayout constraintLayout;
        g7(i7);
        Ht0.a aVar = this.f86633P;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
            aVar2 = null;
        }
        i7(aVar2.f8770c, (com.bilibili.search2.component.e.g(this) && (constraintLayout = ((M) this.f86645a0.getValue()).f86722c) != null && constraintLayout.getVisibility() == 0) ? 1 : U6());
    }

    @Override // It0.a
    public final void Ke() {
        Ht0.a aVar = this.f86632O;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputSearchColor");
            aVar2 = null;
        }
        g7(aVar2.f8768a);
        Ht0.a aVar3 = this.f86633P;
        Ht0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
            aVar4 = null;
        }
        i7(aVar4.f8768a, U6());
        S6().d(false);
        TintLinearLayout tintLinearLayout = this.f86627J;
        TintLinearLayout tintLinearLayout2 = tintLinearLayout;
        if (tintLinearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBarLayout");
            tintLinearLayout2 = null;
        }
        Ht0.c cVar = this.f86634Q;
        Ht0.c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputLayoutDrawable");
            cVar2 = null;
        }
        tintLinearLayout2.setBackground(cVar2.f8773a);
        OgvSearchView ogvSearchView = this.f86629L;
        OgvSearchView ogvSearchView2 = ogvSearchView;
        if (ogvSearchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchView");
            ogvSearchView2 = null;
        }
        Ht0.a aVar5 = this.f86635R;
        Ht0.a aVar6 = aVar5;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchViewColor");
            aVar6 = null;
        }
        ogvSearchView2.setQueryTextColor(aVar6.f8768a);
        OgvSearchView ogvSearchView3 = this.f86629L;
        OgvSearchView ogvSearchView4 = ogvSearchView3;
        if (ogvSearchView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchView");
            ogvSearchView4 = null;
        }
        Ht0.c cVar3 = this.f86636S;
        Ht0.c cVar4 = cVar3;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvCancelDrawable");
            cVar4 = null;
        }
        ogvSearchView4.setCancelDrawable(cVar4.f8773a);
        Ht0.b bVar = this.f86637T;
        Ht0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvAITheme");
            bVar2 = null;
        }
        this.f86631N.b(bVar2.f8772a);
        OgvRelativeLayout ogvRelativeLayout = this.f86628K;
        OgvRelativeLayout ogvRelativeLayout2 = ogvRelativeLayout;
        if (ogvRelativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvRelativeLayout");
            ogvRelativeLayout2 = null;
        }
        ogvRelativeLayout2.f88466c = false;
        ogvRelativeLayout2.f88467d = false;
        ogvRelativeLayout2.invalidate();
        OgvRelativeLayout ogvRelativeLayout3 = this.f86628K;
        OgvRelativeLayout ogvRelativeLayout4 = ogvRelativeLayout3;
        if (ogvRelativeLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvRelativeLayout");
            ogvRelativeLayout4 = null;
        }
        ogvRelativeLayout4.f88472j = 0;
        ogvRelativeLayout4.f88468e = null;
    }

    @Override // It0.a
    public final void Le(@NotNull com.bilibili.search2.main.ogv.a aVar) {
        OgvRelativeLayout ogvRelativeLayout = this.f86628K;
        OgvRelativeLayout ogvRelativeLayout2 = ogvRelativeLayout;
        if (ogvRelativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvRelativeLayout");
            ogvRelativeLayout2 = null;
        }
        ogvRelativeLayout2.setBrandAdGradientOverlay(aVar);
    }

    @Override // It0.a
    public final void Nc(@Nullable Bitmap bitmap) {
        Ht0.a aVar = this.f86632O;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputSearchColor");
            aVar2 = null;
        }
        int i7 = aVar2.f8771d;
        Ht0.a aVar3 = this.f86633P;
        Ht0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
            aVar4 = null;
        }
        d7(i7, aVar4.f8771d);
        Ht0.c cVar = this.f86634Q;
        Ht0.c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputLayoutDrawable");
            cVar2 = null;
        }
        b7(cVar2.f8774b);
        Ht0.a aVar5 = this.f86635R;
        Ht0.a aVar6 = aVar5;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchViewColor");
            aVar6 = null;
        }
        int i8 = aVar6.f8769b;
        Ht0.c cVar3 = this.f86636S;
        Ht0.c cVar4 = cVar3;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvCancelDrawable");
            cVar4 = null;
        }
        Drawable drawable = cVar4.f8775c;
        Ht0.b bVar = this.f86637T;
        Ht0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvAITheme");
            bVar2 = null;
        }
        bVar2.getClass();
        c7(i8, drawable);
        if (!Intrinsics.areEqual(this.f86640W.b().f88297g.getValue(), Boolean.TRUE)) {
            OgvRelativeLayout ogvRelativeLayout = this.f86628K;
            if (ogvRelativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOgvRelativeLayout");
                ogvRelativeLayout = null;
            }
            ogvRelativeLayout.f88466c = false;
            ogvRelativeLayout.f88467d = true;
            ogvRelativeLayout.invalidate();
            return;
        }
        OgvRelativeLayout ogvRelativeLayout2 = this.f86628K;
        if (ogvRelativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvRelativeLayout");
            ogvRelativeLayout2 = null;
        }
        ogvRelativeLayout2.f88468e = bitmap;
        if (bitmap != null) {
            ogvRelativeLayout2.d(bitmap);
        }
        ogvRelativeLayout2.f88466c = true;
        ogvRelativeLayout2.f88467d = false;
        ogvRelativeLayout2.invalidate();
    }

    public final F Q6() {
        return (F) this.f86623F.getValue();
    }

    public final SearchPageStateModel R6() {
        return (SearchPageStateModel) this.f86643Y.getValue();
    }

    @NotNull
    public final u S6() {
        u uVar = this.f86625H;
        if (uVar != null) {
            return uVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSearchViewHelper");
        return null;
    }

    @NotNull
    public final MainSearchViewModel T6() {
        return (MainSearchViewModel) this.f86644Z.getValue();
    }

    public final int U6() {
        int i7;
        Garb garb = this.f86641X;
        Garb garb2 = garb;
        if (garb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
            garb2 = null;
        }
        if (garb2.isPure()) {
            i7 = 0;
        } else {
            Garb garb3 = this.f86641X;
            if (garb3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                garb3 = null;
            }
            i7 = garb3.isDarkMode() ? 1 : 2;
        }
        return i7;
    }

    @Override // com.bilibili.search2.main.y
    @NotNull
    public final SearchPageStateModel V4() {
        return R6();
    }

    public final void V6() {
        int px = ListExtentionsKt.toPx(8.0f);
        float f7 = OgvThemeColorHelper.f88258p;
        int px2 = ListExtentionsKt.toPx(8.0f) + OgvThemeColorHelper.a.a();
        LinearLayout linearLayout = (LinearLayout) findViewById(2131310921);
        bilibili.live.app.service.resolver.c.a(px2, "initPageHeader: ", "BiliMainSearchActivity");
        if (linearLayout != null) {
            linearLayout.setPadding(0, px2, 0, px);
        }
    }

    @Override // It0.a
    public final void W6(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        OgvRelativeLayout ogvRelativeLayout = this.f86628K;
        OgvRelativeLayout ogvRelativeLayout2 = ogvRelativeLayout;
        if (ogvRelativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvRelativeLayout");
            ogvRelativeLayout2 = null;
        }
        ogvRelativeLayout2.f88468e = bitmap;
        ogvRelativeLayout2.d(bitmap);
        ogvRelativeLayout2.f88467d = false;
        ogvRelativeLayout2.f88466c = true;
        ogvRelativeLayout2.invalidate();
    }

    public final void X6() {
        if (T6().f86730c != null && !Intrinsics.areEqual(T6().f86730c, Boolean.TRUE)) {
            S6().e("");
        } else {
            this.f86624G = true;
            super.onBackPressed();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y6(android.content.Intent r16, android.os.Bundle r17) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.BiliMainSearchActivity.Y6(android.content.Intent, android.os.Bundle):void");
    }

    @Override // It0.a
    public final void Z4() {
        Ht0.a aVar = this.f86632O;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputSearchColor");
            aVar2 = null;
        }
        g7(aVar2.f8768a);
        Ht0.a aVar3 = this.f86633P;
        Ht0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
            aVar4 = null;
        }
        i7(aVar4.f8768a, 0);
        S6().d(false);
        TintLinearLayout tintLinearLayout = this.f86627J;
        TintLinearLayout tintLinearLayout2 = tintLinearLayout;
        if (tintLinearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBarLayout");
            tintLinearLayout2 = null;
        }
        Ht0.c cVar = this.f86634Q;
        Ht0.c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputLayoutDrawable");
            cVar2 = null;
        }
        tintLinearLayout2.setBackground(cVar2.f8773a);
        OgvSearchView ogvSearchView = this.f86629L;
        OgvSearchView ogvSearchView2 = ogvSearchView;
        if (ogvSearchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchView");
            ogvSearchView2 = null;
        }
        Ht0.a aVar5 = this.f86635R;
        Ht0.a aVar6 = aVar5;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchViewColor");
            aVar6 = null;
        }
        ogvSearchView2.setQueryTextColor(aVar6.f8768a);
        OgvSearchView ogvSearchView3 = this.f86629L;
        OgvSearchView ogvSearchView4 = ogvSearchView3;
        if (ogvSearchView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchView");
            ogvSearchView4 = null;
        }
        Ht0.c cVar3 = this.f86636S;
        Ht0.c cVar4 = cVar3;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvCancelDrawable");
            cVar4 = null;
        }
        ogvSearchView4.setCancelDrawable(cVar4.f8773a);
        Ht0.b bVar = this.f86637T;
        Ht0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvAITheme");
            bVar2 = null;
        }
        this.f86631N.b(bVar2.f8772a);
        OgvRelativeLayout ogvRelativeLayout = this.f86628K;
        if (ogvRelativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvRelativeLayout");
            ogvRelativeLayout = null;
        }
        ogvRelativeLayout.f88466c = false;
        ogvRelativeLayout.f88467d = false;
        ogvRelativeLayout.invalidate();
    }

    public final void a7(Intent intent) {
        String stringExtra = intent.getStringExtra("search_default_word");
        String str = stringExtra;
        if (stringExtra == null) {
            str = "";
        }
        String str2 = com.bilibili.search2.discover.d.f86431a;
        com.bilibili.search2.discover.d.b(this, str, R6().f86777y);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    public final void b7(Drawable drawable) {
        S6().d(true);
        if (drawable != null) {
            Ht0.c cVar = this.f86634Q;
            Ht0.c cVar2 = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputLayoutDrawable");
                cVar2 = null;
            }
            cVar2.f8775c = drawable;
            TintLinearLayout tintLinearLayout = this.f86627J;
            TintLinearLayout tintLinearLayout2 = tintLinearLayout;
            if (tintLinearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputBarLayout");
                tintLinearLayout2 = null;
            }
            Ht0.c cVar3 = this.f86634Q;
            if (cVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputLayoutDrawable");
                cVar3 = null;
            }
            tintLinearLayout2.setBackground(cVar3.f8775c);
        }
    }

    @Override // com.bilibili.search2.main.y
    @NotNull
    public final E b9() {
        return this.f86639V;
    }

    public final void c7(@ColorInt int i7, Drawable drawable) {
        Ht0.a aVar = this.f86635R;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchViewColor");
            aVar2 = null;
        }
        aVar2.f8771d = i7;
        Ht0.c cVar = this.f86636S;
        Ht0.c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvCancelDrawable");
            cVar2 = null;
        }
        cVar2.f8775c = drawable;
        Ht0.b bVar = this.f86637T;
        Ht0.b bVar2 = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvAITheme");
            bVar2 = null;
        }
        bVar2.getClass();
        C6035b c6035b = this.f86631N;
        if (!c6035b.f86749e) {
            c6035b.b(true);
        }
        OgvSearchView ogvSearchView = this.f86629L;
        OgvSearchView ogvSearchView2 = ogvSearchView;
        if (ogvSearchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchView");
            ogvSearchView2 = null;
        }
        Ht0.a aVar3 = this.f86635R;
        Ht0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchViewColor");
            aVar4 = null;
        }
        ogvSearchView2.setQueryTextColor(aVar4.f8771d);
        if (drawable != null) {
            OgvSearchView ogvSearchView3 = this.f86629L;
            OgvSearchView ogvSearchView4 = ogvSearchView3;
            if (ogvSearchView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchView");
                ogvSearchView4 = null;
            }
            Drawable drawable2 = this.f86640W.e() ? ResourcesCompat.getDrawable(getResources(), 2131236105, getTheme()) : null;
            Drawable drawable3 = drawable2;
            if (drawable2 == null) {
                Ht0.c cVar3 = this.f86636S;
                if (cVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mOgvCancelDrawable");
                    cVar3 = null;
                }
                drawable3 = cVar3.f8775c;
            }
            ogvSearchView4.setCancelDrawable(drawable3);
        }
    }

    public final void d7(@ColorInt int i7, @ColorInt int i8) {
        ConstraintLayout constraintLayout;
        Ht0.a aVar = this.f86632O;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputSearchColor");
            aVar2 = null;
        }
        aVar2.f8771d = i7;
        Ht0.a aVar3 = this.f86633P;
        Ht0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
            aVar4 = null;
        }
        aVar4.f8771d = i8;
        OgvSearchView ogvSearchView = this.f86629L;
        OgvSearchView ogvSearchView2 = ogvSearchView;
        if (ogvSearchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchView");
            ogvSearchView2 = null;
        }
        if (ogvSearchView2.getQueryTextView().hasFocus()) {
            return;
        }
        Ht0.a aVar5 = this.f86632O;
        Ht0.a aVar6 = aVar5;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputSearchColor");
            aVar6 = null;
        }
        g7(aVar6.f8771d);
        Ht0.a aVar7 = this.f86633P;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
            aVar7 = null;
        }
        i7(aVar7.f8771d, (com.bilibili.search2.component.e.g(this) && (constraintLayout = ((M) this.f86645a0.getValue()).f86722c) != null && constraintLayout.getVisibility() == 0) ? 1 : 2);
    }

    @Override // Et0.b
    public final void dd(float f7) {
        OgvRelativeLayout ogvRelativeLayout = this.f86628K;
        OgvRelativeLayout ogvRelativeLayout2 = ogvRelativeLayout;
        if (ogvRelativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvRelativeLayout");
            ogvRelativeLayout2 = null;
        }
        ogvRelativeLayout2.setMaxShowDistanceExtra(f7);
    }

    public final void e7(WindowSizeClass windowSizeClass) {
        int i7 = KScreenAdjustUtilsKt.widthBreakPointNormal(windowSizeClass) ? 1 : -1;
        if (getRequestedOrientation() != i7) {
            BLog.i("BiliMainSearchActivity", "updateOrientationByWindowSize: isNormalWidth=" + KScreenAdjustUtilsKt.widthBreakPointNormal(windowSizeClass) + ", newOrientation=" + i7);
            setRequestedOrientation(i7);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // It0.a
    public final void f9(float f7, int i7, @NotNull SearchColorModel.StateSource stateSource) throws NoWhenBranchMatchedException {
        int i8 = a.f86650a[stateSource.ordinal()];
        Ht0.a aVar = null;
        if (i8 == 1) {
            int iA = com.bilibili.search2.utils.m.a(f7, i7);
            Ht0.a aVar2 = this.f86632O;
            Ht0.a aVar3 = aVar2;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputSearchColor");
                aVar3 = null;
            }
            aVar3.f8771d = iA;
            Ht0.a aVar4 = this.f86633P;
            Ht0.a aVar5 = aVar4;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
                aVar5 = null;
            }
            Ht0.a aVar6 = this.f86633P;
            if (aVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
            } else {
                aVar = aVar6;
            }
            aVar5.f8771d = aVar.f8770c;
            return;
        }
        C6035b c6035b = this.f86631N;
        if (i8 == 2) {
            Ht0.a aVar7 = this.f86632O;
            Ht0.a aVar8 = aVar7;
            if (aVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputSearchColor");
                aVar8 = null;
            }
            aVar8.f8771d = i7;
            Ht0.a aVar9 = this.f86633P;
            Ht0.a aVar10 = aVar9;
            if (aVar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
                aVar10 = null;
            }
            Ht0.a aVar11 = this.f86633P;
            Ht0.a aVar12 = aVar11;
            if (aVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
                aVar12 = null;
            }
            aVar10.f8771d = aVar12.f8770c;
            Ht0.c cVar = this.f86634Q;
            Ht0.c cVar2 = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputLayoutDrawable");
                cVar2 = null;
            }
            Ht0.c cVar3 = this.f86634Q;
            Ht0.c cVar4 = cVar3;
            if (cVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mInputLayoutDrawable");
                cVar4 = null;
            }
            cVar2.f8775c = cVar4.f8774b;
            Ht0.a aVar13 = this.f86635R;
            Ht0.a aVar14 = aVar13;
            if (aVar13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchViewColor");
                aVar14 = null;
            }
            Ht0.a aVar15 = this.f86635R;
            Ht0.a aVar16 = aVar15;
            if (aVar15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchViewColor");
                aVar16 = null;
            }
            aVar14.f8771d = aVar16.f8769b;
            Ht0.c cVar5 = this.f86636S;
            Ht0.c cVar6 = cVar5;
            if (cVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOgvCancelDrawable");
                cVar6 = null;
            }
            Ht0.c cVar7 = this.f86636S;
            Ht0.c cVar8 = cVar7;
            if (cVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOgvCancelDrawable");
                cVar8 = null;
            }
            cVar6.f8775c = cVar8.f8774b;
            Ht0.b bVar = this.f86637T;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOgvAITheme");
                bVar = null;
            }
            bVar.getClass();
            c6035b.b(true);
            return;
        }
        if (i8 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Ht0.a aVar17 = this.f86632O;
        Ht0.a aVar18 = aVar17;
        if (aVar17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputSearchColor");
            aVar18 = null;
        }
        Ht0.a aVar19 = this.f86632O;
        Ht0.a aVar20 = aVar19;
        if (aVar19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputSearchColor");
            aVar20 = null;
        }
        aVar18.f8771d = aVar20.f8770c;
        Ht0.a aVar21 = this.f86633P;
        Ht0.a aVar22 = aVar21;
        if (aVar21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
            aVar22 = null;
        }
        Ht0.a aVar23 = this.f86633P;
        Ht0.a aVar24 = aVar23;
        if (aVar23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
            aVar24 = null;
        }
        aVar22.f8771d = aVar24.f8770c;
        Ht0.c cVar9 = this.f86634Q;
        Ht0.c cVar10 = cVar9;
        if (cVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputLayoutDrawable");
            cVar10 = null;
        }
        Ht0.c cVar11 = this.f86634Q;
        Ht0.c cVar12 = cVar11;
        if (cVar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputLayoutDrawable");
            cVar12 = null;
        }
        cVar10.f8775c = cVar12.f8774b;
        Ht0.a aVar25 = this.f86635R;
        Ht0.a aVar26 = aVar25;
        if (aVar25 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchViewColor");
            aVar26 = null;
        }
        Ht0.a aVar27 = this.f86635R;
        Ht0.a aVar28 = aVar27;
        if (aVar27 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchViewColor");
            aVar28 = null;
        }
        aVar26.f8771d = aVar28.f8769b;
        Ht0.c cVar13 = this.f86636S;
        Ht0.c cVar14 = cVar13;
        if (cVar13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvCancelDrawable");
            cVar14 = null;
        }
        Ht0.c cVar15 = this.f86636S;
        Ht0.c cVar16 = cVar15;
        if (cVar15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvCancelDrawable");
            cVar16 = null;
        }
        cVar14.f8775c = cVar16.f8774b;
        Ht0.b bVar2 = this.f86637T;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvAITheme");
            bVar2 = null;
        }
        bVar2.getClass();
        c6035b.b(true);
    }

    @Override // It0.a
    public final void g1() {
        OgvRelativeLayout ogvRelativeLayout = this.f86628K;
        OgvRelativeLayout ogvRelativeLayout2 = ogvRelativeLayout;
        if (ogvRelativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvRelativeLayout");
            ogvRelativeLayout2 = null;
        }
        ogvRelativeLayout2.f88466c = false;
        ogvRelativeLayout2.f88467d = false;
        ogvRelativeLayout2.invalidate();
    }

    public final void g7(@ColorInt int i7) {
        if (Intrinsics.areEqual(this.f86640W.b().h.getValue(), Boolean.TRUE) && i7 == 0) {
            return;
        }
        LinearLayout linearLayout = this.f86626I;
        LinearLayout linearLayout2 = linearLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchLayout");
            linearLayout2 = null;
        }
        linearLayout2.setBackgroundColor(i7);
    }

    @Override // It0.a
    public final void ha(float f7, int i7) {
        Ht0.a aVar = null;
        if (f7 >= 1.0f) {
            Ht0.a aVar2 = this.f86633P;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
            } else {
                aVar = aVar2;
            }
            d7(i7, aVar.f8770c);
            return;
        }
        if (f7 > 0.0f) {
            int iA = com.bilibili.search2.utils.m.a(f7, i7);
            Ht0.a aVar3 = this.f86633P;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
                aVar3 = null;
            }
            d7(iA, aVar3.f8770c);
            return;
        }
        Ht0.a aVar4 = this.f86632O;
        Ht0.a aVar5 = aVar4;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputSearchColor");
            aVar5 = null;
        }
        int i8 = aVar5.f8770c;
        Ht0.a aVar6 = this.f86633P;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
            aVar6 = null;
        }
        d7(i8, aVar6.f8770c);
    }

    public final void i7(@ColorInt int i7, int i8) {
        StatusBarCompat.tintStatusBar(this, i7, i8);
        OgvRelativeLayout ogvRelativeLayout = this.f86628K;
        OgvRelativeLayout ogvRelativeLayout2 = ogvRelativeLayout;
        if (ogvRelativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvRelativeLayout");
            ogvRelativeLayout2 = null;
        }
        boolean z6 = true;
        if (ogvRelativeLayout2.f88475m[1] > 0) {
            z6 = false;
        }
        if (!isInMultiWindowMode() || z6) {
            View viewFindViewById = ((ViewGroup) getWindow().getDecorView()).findViewById(2131297221);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
                return;
            }
            return;
        }
        View viewFindViewById2 = ((ViewGroup) getWindow().getDecorView()).findViewById(2131297221);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
    }

    @Override // It0.a
    public final void l8(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        Ht0.a aVar = this.f86632O;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputSearchColor");
            aVar2 = null;
        }
        int i7 = aVar2.f8770c;
        Ht0.a aVar3 = this.f86633P;
        Ht0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
            aVar4 = null;
        }
        d7(i7, aVar4.f8770c);
        OgvRelativeLayout ogvRelativeLayout = this.f86628K;
        if (ogvRelativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvRelativeLayout");
            ogvRelativeLayout = null;
        }
        ogvRelativeLayout.f88468e = bitmap;
        ogvRelativeLayout.d(bitmap);
        ogvRelativeLayout.f88467d = false;
        ogvRelativeLayout.f88466c = true;
        ogvRelativeLayout.invalidate();
    }

    @Override // It0.a
    public final void m2(@ColorInt int i7) {
        OgvRelativeLayout ogvRelativeLayout = this.f86628K;
        OgvRelativeLayout ogvRelativeLayout2 = ogvRelativeLayout;
        if (ogvRelativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvRelativeLayout");
            ogvRelativeLayout2 = null;
        }
        ogvRelativeLayout2.f88467d = true;
        ogvRelativeLayout2.f88466c = false;
        ogvRelativeLayout2.f88470g.setColor(i7);
        ogvRelativeLayout2.invalidate();
        Ht0.a aVar = this.f86632O;
        Ht0.a aVar2 = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputSearchColor");
            aVar2 = null;
        }
        int i8 = aVar2.f8770c;
        Ht0.a aVar3 = this.f86633P;
        Ht0.a aVar4 = aVar3;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mStatusBarColor");
            aVar4 = null;
        }
        d7(i8, aVar4.f8770c);
        Ht0.c cVar = this.f86634Q;
        Ht0.c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputLayoutDrawable");
            cVar2 = null;
        }
        b7(cVar2.f8774b);
        Ht0.a aVar5 = this.f86635R;
        Ht0.a aVar6 = aVar5;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchViewColor");
            aVar6 = null;
        }
        int i9 = aVar6.f8769b;
        Ht0.c cVar3 = this.f86636S;
        Ht0.c cVar4 = cVar3;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvCancelDrawable");
            cVar4 = null;
        }
        Drawable drawable = cVar4.f8774b;
        Ht0.b bVar = this.f86637T;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvAITheme");
            bVar = null;
        }
        bVar.getClass();
        c7(i9, drawable);
    }

    @Override // com.bilibili.search2.main.y
    @NotNull
    public final C6042i m9() {
        return T6().f86729b;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final S60.B b7 = new S60.B(this, 6);
        BLog.i("BiliMainSearchActivity", "measureWindowInsets");
        ViewCompat.setOnApplyWindowInsetsListener(getWindow().getDecorView(), new OnApplyWindowInsetsListener(this, b7) { // from class: com.bilibili.search2.main.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BiliMainSearchActivity f86830a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final S60.B f86831b;

            {
                this.f86830a = this;
                this.f86831b = b7;
            }

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                int i7 = BiliMainSearchActivity.f86622Y0;
                BLog.i("BiliMainSearchActivity", "onApplyWindowInsets insets:" + windowInsetsCompat);
                int i8 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars()).top;
                BiliMainSearchActivity biliMainSearchActivity = this.f86830a;
                int statusBarHeight = StatusBarCompat.getStatusBarHeight(biliMainSearchActivity);
                com.bilibili.bplus.im.protobuf.a.b(i8, i8, "statusBarHeight: ", " statusBarTop ", "BiliMainSearchActivity");
                if (i8 > statusBarHeight) {
                    OgvThemeColorHelper.f88259q = i8;
                    View childAt = ((ViewGroup) biliMainSearchActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
                    if (childAt != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        ViewCompat.setFitsSystemWindows(childAt, true);
                        layoutParams.topMargin = -i8;
                        childAt.setLayoutParams(layoutParams);
                    }
                }
                this.f86831b.invoke();
                Bl.a aVar = biliMainSearchActivity.f86646c0;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    aVar = null;
                }
                ViewCompat.setOnApplyWindowInsetsListener(aVar.a, null);
                return windowInsetsCompat;
            }
        });
        ViewCompat.requestApplyInsets(getWindow().getDecorView());
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws Exception {
        BaseSearchResultFragment<?> baseSearchResultFragmentYf;
        BiliMainSearchResultFragment biliMainSearchResultFragmentD = T6().f86729b.d();
        if (biliMainSearchResultFragmentD == null || !biliMainSearchResultFragmentD.isVisible()) {
            this.f86624G = true;
            super.onBackPressed();
            return;
        }
        R6().f86764l.setValue(Boolean.TRUE);
        BiliMainSearchResultFragment biliMainSearchResultFragmentD2 = T6().f86729b.d();
        if (biliMainSearchResultFragmentD2 != null && (baseSearchResultFragmentYf = biliMainSearchResultFragmentD2.yf()) != null) {
            baseSearchResultFragmentYf.lf(baseSearchResultFragmentYf);
            try {
                Xs0.b.e(baseSearchResultFragmentYf.rf().O0(), baseSearchResultFragmentYf.rf().getTrackId(), baseSearchResultFragmentYf.rf().P0());
            } catch (Throwable th) {
                BLog.e(th.toString());
            }
        }
        X6();
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e7(ScreenAdjustUtilsKt.windowSize(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v137, types: [Ht0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v173, types: [Ht0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v185, types: [Ht0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v252, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.bilibili.search2.main.I] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.search2.main.w, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) throws Exception {
        int secondaryPageColor;
        int secondaryPageColor2;
        ConstraintLayout constraintLayout;
        e7(ScreenAdjustUtilsKt.windowSize(this));
        super.onCreate(bundle);
        this.f86625H = new u();
        this.f86641X = GarbManager.getCurGarb();
        Bl.a aVarInflate = Bl.a.inflate(getLayoutInflater());
        setContentView(aVarInflate.a);
        this.f86646c0 = aVarInflate;
        if (TeenagersMode.getInstance().isEnable() && !wD0.a.a()) {
            TeenagersMode.getInstance().intentToInteceptPage(this);
            finish();
        }
        PageDialogManager.Companion.registerDialogManager(hashCode(), this);
        this.f86649v0 = GAdCoreKt.getGAdOpenApk().getWatcher(this, AdOpenApkScene.Search);
        float f7 = OgvThemeColorHelper.f88258p;
        OgvThemeColorHelper.f88259q = StatusBarCompat.getStatusBarHeight(this);
        V6();
        OgvThemeColorHelper ogvThemeColorHelper = this.f86640W;
        ogvThemeColorHelper.getClass();
        ogvThemeColorHelper.f88266a = (SearchColorModel) new ViewModelProvider(this).get(SearchColorModel.class);
        this.f86638U.c(this, R6(), T6().f86729b, S6(), new AnonymousClass2(this));
        this.f86639V.f86692a = R6();
        if (bundle == null) {
            C6042i c6042i = T6().f86729b;
            c6042i.f86835a = getSupportFragmentManager();
            c6042i.i();
        } else {
            T6().f86729b.f86835a = getSupportFragmentManager();
        }
        M m7 = (M) this.f86645a0.getValue();
        C6042i c6042i2 = T6().f86729b;
        m7.f86727i = c6042i2;
        m7.h = this;
        BiliMainSearchActivity biliMainSearchActivity = m7.f86721b.get();
        boolean zG = false;
        if (biliMainSearchActivity != null && !TeenagersMode.getInstance().isEnable()) {
            zG = com.bilibili.search2.component.e.g(biliMainSearchActivity);
        }
        m7.f86726g = zG;
        BiliMainSearchActivity biliMainSearchActivity2 = m7.f86721b.get();
        if (biliMainSearchActivity2 != null) {
            m7.f86722c = (ConstraintLayout) biliMainSearchActivity2.findViewById(2131321860);
            m7.f86723d = (RecyclerView) biliMainSearchActivity2.findViewById(2131321861);
            m7.f86724e = biliMainSearchActivity2.findViewById(2131300245);
        }
        OH.e eVar = new OH.e(m7, 5);
        cJ.u uVar = new cJ.u(m7, 2);
        cJ.v vVar = new cJ.v(m7, 2);
        c6042i2.f86836b = eVar;
        c6042i2.f86837c = uVar;
        c6042i2.f86838d = vVar;
        RecyclerView recyclerView = m7.f86723d;
        if (recyclerView != 0) {
            ?? i7 = new I(m7.f86720a);
            m7.f86725f = i7;
            recyclerView.setAdapter(i7);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        }
        if (!m7.f86726g && (constraintLayout = m7.f86722c) != null) {
            constraintLayout.setVisibility(8);
        }
        BiliMainSearchActivity biliMainSearchActivity3 = m7.h;
        if (biliMainSearchActivity3 != null) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(biliMainSearchActivity3), (CoroutineContext) null, (CoroutineStart) null, new SearchRightSideManager$observeDiscoverState$1$1(m7, null), 3, (Object) null);
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new SearchRightSideManager$init$4(m7, c6042i2, null), 3, (Object) null);
        com.bilibili.search2.component.d dVar = this.f86642X0;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchInputComponentFactory");
            dVar = null;
        }
        Bl.a aVar = this.f86646c0;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar = null;
        }
        dVar.a(this, aVar.c, R6()).a();
        this.f86626I = (LinearLayout) findViewById(2131310921);
        this.f86627J = (TintLinearLayout) findViewById(2131310889);
        this.f86628K = (OgvRelativeLayout) findViewById(2131308210);
        OgvSearchView ogvSearchView = (OgvSearchView) findViewById(2131310886);
        this.f86629L = ogvSearchView;
        if (Build.VERSION.SDK_INT >= 26) {
            OgvSearchView ogvSearchView2 = ogvSearchView;
            if (ogvSearchView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchView");
                ogvSearchView2 = null;
            }
            ogvSearchView2.getQueryTextView().setImportantForAutofill(2);
        }
        u uVarS6 = S6();
        C6042i c6042i3 = T6().f86729b;
        Bl.a aVar2 = this.f86646c0;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            aVar2 = null;
        }
        uVarS6.a(c6042i3, aVar2.c, R6(), new O0(this, 3), LifecycleOwnerKt.getLifecycleScope(this), this.f86631N, false);
        Garb garb = this.f86641X;
        Garb garb2 = garb;
        if (garb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
            garb2 = null;
        }
        if (garb2.isPure()) {
            secondaryPageColor = ThemeUtils.getColorById(this, 2131103971);
        } else {
            Garb garb3 = this.f86641X;
            Garb garb4 = garb3;
            if (garb3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                garb4 = null;
            }
            secondaryPageColor = garb4.getSecondaryPageColor();
        }
        Garb garb5 = this.f86641X;
        Garb garb6 = garb5;
        if (garb5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
            garb6 = null;
        }
        if (garb6.isPure()) {
            secondaryPageColor2 = ThemeUtils.getThemeAttrColor(this, 2130968986);
        } else {
            Garb garb7 = this.f86641X;
            Garb garb8 = garb7;
            if (garb7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                garb8 = null;
            }
            secondaryPageColor2 = garb8.getSecondaryPageColor();
        }
        Ht0.a aVar3 = new Ht0.a();
        this.f86632O = aVar3;
        aVar3.f8768a = secondaryPageColor;
        Ht0.a aVar4 = new Ht0.a();
        this.f86633P = aVar4;
        aVar4.f8768a = secondaryPageColor2;
        ?? obj = new Object();
        this.f86634Q = obj;
        TintLinearLayout tintLinearLayout = this.f86627J;
        TintLinearLayout tintLinearLayout2 = tintLinearLayout;
        if (tintLinearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputBarLayout");
            tintLinearLayout2 = null;
        }
        obj.f8773a = tintLinearLayout2.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((((Boolean) this.f86647p0.getValue()).booleanValue() || ((Boolean) this.f86648r0.getValue()).booleanValue()) ? ListExtentionsKt.toPx(17.0f) : ListExtentionsKt.toPx(16.0f));
        gradientDrawable.setColor(getResources().getColor(R$color.Wh0_u));
        Ht0.c cVar = this.f86634Q;
        Ht0.c cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInputLayoutDrawable");
            cVar2 = null;
        }
        cVar2.f8774b = gradientDrawable;
        Ht0.a aVar5 = new Ht0.a();
        this.f86635R = aVar5;
        OgvSearchView ogvSearchView3 = this.f86629L;
        OgvSearchView ogvSearchView4 = ogvSearchView3;
        if (ogvSearchView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchView");
            ogvSearchView4 = null;
        }
        aVar5.f8768a = ogvSearchView4.getQueryTextColor();
        Ht0.a aVar6 = this.f86635R;
        Ht0.a aVar7 = aVar6;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchViewColor");
            aVar7 = null;
        }
        aVar7.f8769b = getResources().getColor(R$color.Ga10_u);
        ?? obj2 = new Object();
        this.f86636S = obj2;
        OgvSearchView ogvSearchView5 = this.f86629L;
        OgvSearchView ogvSearchView6 = ogvSearchView5;
        if (ogvSearchView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvSearchView");
            ogvSearchView6 = null;
        }
        obj2.f8773a = ogvSearchView6.getCancelDrawable();
        Ht0.c cVar3 = this.f86636S;
        Ht0.c cVar4 = cVar3;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOgvCancelDrawable");
            cVar4 = null;
        }
        cVar4.f8774b = ResourcesCompat.getDrawable(getResources(), 2131236104, getTheme());
        ?? obj3 = new Object();
        obj3.f8772a = true;
        this.f86637T = obj3;
        obj3.f8772a = this.f86631N.f86749e;
        new It0.j(this, ogvThemeColorHelper);
        Q6().a();
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new BiliMainSearchActivity$onCreate$4$1(new Ws0.d(this), this, null), 3, (Object) null);
        BLog.d("BiliMainSearchActivity", "searchOnCreate: " + this + " ,viewModel: " + T6());
    }

    @Override // com.bilibili.search2.main.w, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        this.f86639V.getClass();
        if (PageViewTracker.getInstance().isInterceptFragmentReport()) {
            PageViewTracker.getInstance().onInterceptFragmentReport(false);
        }
        SearchPageStateModel searchPageStateModelR6 = R6();
        searchPageStateModelR6.f86755b.setValue(null);
        searchPageStateModelR6.f86776x = false;
        searchPageStateModelR6.f86759f.setValue(null);
        M m7 = (M) this.f86645a0.getValue();
        C6042i c6042i = m7.f86727i;
        if (c6042i != null) {
            c6042i.f86836b = null;
            c6042i.f86837c = null;
            c6042i.f86838d = null;
        }
        m7.f86727i = null;
        RecyclerView recyclerView = m7.f86723d;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        m7.f86725f = null;
        m7.f86722c = null;
        m7.f86723d = null;
        m7.h = null;
        C6035b c6035b = this.f86631N;
        c6035b.getClass();
        if (EntryPointKt.getMemleakOptEnable()) {
            Job job = c6035b.f86748d;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            c6035b.f86748d = null;
            c6035b.f86745a = null;
            c6035b.f86746b = null;
            c6035b.f86747c = null;
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@NotNull Intent intent) throws Exception {
        super.onNewIntent(intent);
        setIntent(intent);
        Y6(intent, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    @Override // androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.BiliMainSearchActivity.onPause():void");
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) throws Exception {
        int themeAttrColor;
        super.onPostCreate(bundle);
        StatusBarCompat.immersiveStatusBar(this);
        Garb garb = this.f86641X;
        Garb garb2 = garb;
        if (garb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
            garb2 = null;
        }
        if (garb2.isPure()) {
            themeAttrColor = ThemeUtils.getThemeAttrColor(this, 2130968986);
        } else {
            Garb garb3 = this.f86641X;
            Garb garb4 = garb3;
            if (garb3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                garb4 = null;
            }
            themeAttrColor = garb4.getSecondaryPageColor();
        }
        StatusBarCompat.tintStatusBar(this, themeAttrColor, U6());
        Garb garb5 = this.f86641X;
        Garb garb6 = garb5;
        if (garb5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGarb");
            garb6 = null;
        }
        if (!garb6.isPure()) {
            Garb garb7 = this.f86641X;
            if (garb7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGarb");
                garb7 = null;
            }
            g7(garb7.getSecondaryPageColor());
        }
        Y6(bundle != null ? (Intent) bundle.getParcelable("intent_extra") : getIntent(), bundle);
    }

    @Override // lf0.ActivityC7846a, android.app.Activity
    public final void onRestoreInstanceState(@NotNull Bundle bundle) {
        R6().f86776x = true;
        super.onRestoreInstanceState(bundle);
        R6().f86776x = false;
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f86624G = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        bundle.putParcelable("intent_extra", getIntent());
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onStop() {
        boolean z6;
        C6042i c6042i = T6().f86729b;
        E e7 = this.f86639V;
        e7.getClass();
        if (PageViewTracker.getInstance().isInterceptFragmentReport()) {
            PageViewTracker.getInstance().onInterceptFragmentReport(false);
            DeviceDecision deviceDecision = DeviceDecision.INSTANCE;
            if (deviceDecision.getBoolean("dd_search_fix_pv_intercept_on_jump", false)) {
                z6 = e7.f86693b;
            } else {
                SearchPageStateModel searchPageStateModel = e7.f86692a;
                SearchPageStateModel searchPageStateModel2 = searchPageStateModel;
                if (searchPageStateModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                    searchPageStateModel2 = null;
                }
                Boolean value = searchPageStateModel2.f86761i.getValue();
                boolean zBooleanValue = value != null ? value.booleanValue() : false;
                SearchPageStateModel searchPageStateModel3 = e7.f86692a;
                if (searchPageStateModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPageStateModel");
                    searchPageStateModel3 = null;
                }
                Boolean value2 = searchPageStateModel3.f86762j.getValue();
                z6 = zBooleanValue && (value2 != null ? value2.booleanValue() : false);
            }
            if (z6) {
                PageViewTracker.getInstance().setFragmentVisibility(C6042i.e(c6042i, true, false, 2), false);
                if (deviceDecision.getBoolean("dd_search_fix_pv_intercept_on_jump", false)) {
                    e7.f86693b = false;
                }
            }
        }
        super.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        IAdOpenApkWatcher iAdOpenApkWatcher = this.f86649v0;
        if (iAdOpenApkWatcher != null) {
            iAdOpenApkWatcher.onWindowFocusChanged(z6);
        }
    }

    @Override // It0.a
    public final void x1() {
        View view = this.f86630M;
        if (view == null || view == null) {
            return;
        }
        view.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae A[PHI: r9
  0x00ae: PHI (r9v23 java.lang.Integer) = (r9v9 java.lang.Integer), (r9v13 java.lang.Integer) binds: [B:27:0x00ab, B:37:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // It0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void xa(int r6, boolean r7) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.main.BiliMainSearchActivity.xa(int, boolean):void");
    }
}
