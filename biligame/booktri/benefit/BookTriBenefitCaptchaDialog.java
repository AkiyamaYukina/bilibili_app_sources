package com.bilibili.biligame.booktri.benefit;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bilibili.app.comm.bh.BiliWebView;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.api.bean.GameOfficialInfo;
import com.bilibili.biligame.bean.BiligameNewGiftDetail;
import com.bilibili.biligame.booktri.benefit.AbstractC5292c;
import com.bilibili.biligame.compose.ExposerKt;
import com.bilibili.biligame.download.GameDownloadManager;
import com.bilibili.biligame.event.GameStatusEvent;
import com.bilibili.biligame.kntr.common.bean.KBiligame;
import com.bilibili.biligame.report3.ReporterV3;
import com.bilibili.biligame.ui.coupons.bean.UserCouponsDetailBean;
import com.bilibili.biligame.ui.coupons.bus.CouponReceiveMessage;
import com.bilibili.biligame.ui.coupons.bus.CouponReceiveMessageKt;
import com.bilibili.biligame.ui.feed.bean.GameFeedItem;
import com.bilibili.biligame.ui.gamedetail.data.Coupon;
import com.bilibili.biligame.ui.gift.v3.bus.GiftReceiveMessage;
import com.bilibili.biligame.widget.dialog.BaseCaptchaDialogFragment;
import com.bilibili.bus.Violet;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import com.bilibili.droid.ToastHelper;
import com.bilibili.game.service.bean.DownloadInfo;
import com.bilibili.game.service.interfaces.DownloadCallback;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kntr.app.game.base.ui.widget.gameaction.provider.GameActionStateProvider;
import kntr.app.game.base.ui.widget.gameaction.provider.GameActionStateProviderKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ro.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/BookTriBenefitCaptchaDialog.class */
@StabilityInferred(parameters = 0)
public final class BookTriBenefitCaptchaDialog extends BaseCaptchaDialogFragment implements DownloadCallback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f62249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f62250o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public String f62251p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f62252q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public GameFeedItem f62253r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public String f62254s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f62255t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f62256u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final GameActionStateProvider f62257v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Map<BiligameMainGame, KBiligame> f62258w;

    /* JADX WARN: Multi-variable type inference failed */
    public BookTriBenefitCaptchaDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>(this) { // from class: com.bilibili.biligame.booktri.benefit.BookTriBenefitCaptchaDialog$special$$inlined$viewModels$default$1
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Fragment m6561invoke() {
                return this.$this_viewModels;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>(function0) { // from class: com.bilibili.biligame.booktri.benefit.BookTriBenefitCaptchaDialog$special$$inlined$viewModels$default$2
            final Function0 $ownerProducer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$ownerProducer = function0;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner m6562invoke() {
                return (ViewModelStoreOwner) this.$ownerProducer.invoke();
            }
        });
        final Function0 function02 = null;
        this.f62249n = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(h0.class), new Function0<ViewModelStore>(lazy) { // from class: com.bilibili.biligame.booktri.benefit.BookTriBenefitCaptchaDialog$special$$inlined$viewModels$default$3
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$owner$delegate = lazy;
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ViewModelStore m6563invoke() {
                return FragmentViewModelLazyKt.m4419viewModels$lambda1(this.$owner$delegate).getViewModelStore();
            }
        }, new Function0<CreationExtras>(function02, lazy) { // from class: com.bilibili.biligame.booktri.benefit.BookTriBenefitCaptchaDialog$special$$inlined$viewModels$default$4
            final Function0 $extrasProducer;
            final Lazy $owner$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$extrasProducer = function02;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.viewmodel.CreationExtras m6564invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.jvm.functions.Function0 r0 = r0.$extrasProducer
                    r3 = r0
                    r0 = r3
                    if (r0 == 0) goto L19
                    r0 = r3
                    java.lang.Object r0 = r0.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L44
                L19:
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L30
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L32
                L30:
                    r0 = 0
                    r3 = r0
                L32:
                    r0 = r3
                    if (r0 == 0) goto L40
                    r0 = r3
                    androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
                    r3 = r0
                    goto L44
                L40:
                    androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
                    r3 = r0
                L44:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.booktri.benefit.BookTriBenefitCaptchaDialog$special$$inlined$viewModels$default$4.m6564invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }
        }, new Function0<ViewModelProvider.Factory>(this, lazy) { // from class: com.bilibili.biligame.booktri.benefit.BookTriBenefitCaptchaDialog$special$$inlined$viewModels$default$5
            final Lazy $owner$delegate;
            final Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
                this.$owner$delegate = lazy;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
            @org.jetbrains.annotations.NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final androidx.lifecycle.ViewModelProvider.Factory m6565invoke() {
                /*
                    r2 = this;
                    r0 = r2
                    kotlin.Lazy r0 = r0.$owner$delegate
                    androidx.lifecycle.ViewModelStoreOwner r0 = androidx.fragment.app.FragmentViewModelLazyKt.m4417access$viewModels$lambda1(r0)
                    r3 = r0
                    r0 = r3
                    boolean r0 = r0 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
                    if (r0 == 0) goto L17
                    r0 = r3
                    androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
                    r3 = r0
                    goto L19
                L17:
                    r0 = 0
                    r3 = r0
                L19:
                    r0 = r3
                    if (r0 == 0) goto L2a
                    r0 = r3
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r4 = r0
                    r0 = r4
                    r3 = r0
                    r0 = r4
                    if (r0 != 0) goto L32
                L2a:
                    r0 = r2
                    androidx.fragment.app.Fragment r0 = r0.$this_viewModels
                    androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
                    r3 = r0
                L32:
                    r0 = r3
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.booktri.benefit.BookTriBenefitCaptchaDialog$special$$inlined$viewModels$default$5.m6565invoke():androidx.lifecycle.ViewModelProvider$Factory");
            }
        });
        this.f62251p = "";
        this.f62256u = true;
        this.f62257v = GameActionStateProvider.Companion.createGameStateProvider();
        this.f62258w = new LinkedHashMap();
    }

    public final void closeCaptchaDialog() {
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dismiss() {
        Context context;
        super.dismiss();
        if (this.f62255t && (context = getContext()) != null) {
            ToastHelper.showToastShort(context, "游戏上线WIFI自动下载设置完成");
        }
        AbstractC5292c abstractC5292c = (AbstractC5292c) mf().f62400g.getValue();
        if (abstractC5292c instanceof AbstractC5292c.e) {
            C5294e c5294e = ((AbstractC5292c.e) abstractC5292c).f62366a;
            if (!c5294e.f62382g) {
                List<Integer> list = c5294e.f62386l;
                List<Integer> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    int i7 = ro.c.f126714a1;
                    c.C1350c.a(this.f62250o);
                } else {
                    Iterator<Integer> it = list.iterator();
                    while (it.hasNext()) {
                        int iIntValue = it.next().intValue();
                        int i8 = ro.c.f126714a1;
                        c.C1350c.a(iIntValue);
                    }
                }
            }
        }
        if (this.f62256u) {
            AbstractC5292c abstractC5292c2 = (AbstractC5292c) mf().f62400g.getValue();
            if (abstractC5292c2 instanceof AbstractC5292c.e) {
                Violet violet = Violet.INSTANCE;
                int i9 = this.f62250o;
                AbstractC5292c.e eVar = (AbstractC5292c.e) abstractC5292c2;
                List<BiligameNewGiftDetail> list3 = eVar.f62366a.f62383i;
                List<BiligameNewGiftDetail> listEmptyList = list3;
                if (list3 == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                violet.sendMsg(new GiftReceiveMessage(String.valueOf(i9), listEmptyList));
                ArrayList arrayList = new ArrayList();
                List<UserCouponsDetailBean> list4 = eVar.f62366a.f62384j;
                if (list4 != null) {
                    for (UserCouponsDetailBean userCouponsDetailBean : list4) {
                        Coupon coupon = new Coupon();
                        coupon.setCouponId(userCouponsDetailBean.getCouponNo());
                        coupon.setReceived(true);
                        arrayList.add(coupon);
                    }
                }
                Violet.INSTANCE.sendMsg(new CouponReceiveMessage(String.valueOf(this.f62250o), CouponReceiveMessageKt.getRECEIVE(), arrayList));
            }
            this.f62256u = false;
        }
    }

    public final int getGeetSceneType() {
        return 1;
    }

    public final int getLayoutResId() {
        return 2131502915;
    }

    public final void kf() {
        BiliWebView mWebView = getMWebView();
        if (mWebView != null) {
            mWebView.setVisibility(8);
        }
        cancelCaptchaCall();
        h0.K0(mf(), this.f62250o, this.f62251p, this.f62254s, null, null, null, null, null, null, null, 1016);
    }

    public final Map<String, String> lf(Pair<String, String>... pairArr) {
        Object value = mf().f62400g.getValue();
        AbstractC5292c.e eVar = value instanceof AbstractC5292c.e ? (AbstractC5292c.e) value : null;
        GameOfficialInfo gameOfficialInfo = null;
        if (eVar != null) {
            C5294e c5294e = eVar.f62366a;
            gameOfficialInfo = null;
            if (c5294e != null) {
                gameOfficialInfo = c5294e.f62381f;
            }
        }
        boolean z6 = false;
        if (gameOfficialInfo != null) {
            z6 = false;
            if (gameOfficialInfo.getShowWxOfficialEntrance() == 1) {
                z6 = true;
            }
        }
        Pair pair = TuplesKt.to("game_base_id", String.valueOf(this.f62250o));
        String sCurrentSpmId = ReporterV3.INSTANCE.getSCurrentSpmId();
        String str = sCurrentSpmId;
        if (sCurrentSpmId == null) {
            str = "";
        }
        Map<String, String> mapMutableMapOf = MapsKt.mutableMapOf(new Pair[]{pair, TuplesKt.to("spmid", str), TuplesKt.to("subscribe", String.valueOf(z6))});
        MapsKt.putAll(mapMutableMapOf, pairArr);
        return mapMutableMapOf;
    }

    public final h0 mf() {
        return (h0) this.f62249n.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f62250o = arguments.getInt("game_base_id", 0);
            this.f62251p = arguments.getString("ad_source", "");
            this.f62252q = arguments.getBoolean("booked", false);
            this.f62254s = arguments.getString(CaptureSchema.JUMP_PARAMS_EXTRA);
        }
        GameDownloadManager.INSTANCE.register(this);
        Violet.INSTANCE.ofChannel(GameStatusEvent.class).observe(this, new Sg.c(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super/*com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment*/.onDestroy();
        GameDownloadManager.INSTANCE.unregister(this);
        GameActionStateProvider.Companion.removeGameStateProvider(this.f62257v);
    }

    public final void onError(@Nullable DownloadInfo downloadInfo) {
        String str;
        if (downloadInfo == null || (str = downloadInfo.pkgName) == null) {
            return;
        }
        GameActionStateProvider.Companion.updateDownloadStates(str);
    }

    public final void onInit(@Nullable DownloadInfo downloadInfo) {
        String str;
        if (downloadInfo == null || (str = downloadInfo.pkgName) == null) {
            return;
        }
        GameActionStateProvider.Companion.updateDownloadStates(str);
    }

    public final void onProgress(@Nullable DownloadInfo downloadInfo) {
        String str;
        if (downloadInfo == null || (str = downloadInfo.pkgName) == null) {
            return;
        }
        GameActionStateProvider.Companion.updateDownloadStates(str);
    }

    public final void onStatusChange(@Nullable DownloadInfo downloadInfo) {
        String str;
        if (downloadInfo == null || (str = downloadInfo.pkgName) == null) {
            return;
        }
        GameActionStateProvider.Companion.updateDownloadStates(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.bilibili.biligame.booktri.benefit.a, java.lang.Object] */
    public final void setUiBeforeShow() {
        FrameLayout frameLayout;
        if (this.f62252q) {
            BiliWebView mWebView = getMWebView();
            if (mWebView != null) {
                mWebView.setVisibility(8);
            }
            h0 h0VarMf = mf();
            h0VarMf.getClass();
            h0VarMf.f62399f.setValue(new AbstractC5292c.a(new Object()));
        } else {
            kf();
        }
        View mRootView = getMRootView();
        if (mRootView != null && (frameLayout = (FrameLayout) mRootView.findViewById(2131305505)) != null) {
            final ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1356749429, true, new Function2(this, composeView) { // from class: com.bilibili.biligame.booktri.benefit.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final BookTriBenefitCaptchaDialog f62389a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ComposeView f62390b;

                {
                    this.f62389a = this;
                    this.f62390b = composeView;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1356749429, iIntValue, -1, "com.bilibili.biligame.booktri.benefit.BookTriBenefitCaptchaDialog.setupComposeView.<anonymous>.<anonymous>.<anonymous> (BookTriBenefitCaptchaDialog.kt:213)");
                        }
                        ProvidedValue providedValueProvides = ExposerKt.getLocalExposeCollectorHolder().provides(ExposerKt.rememberCollectorHolder(composer, 0));
                        ProvidableCompositionLocal localGameStateProvider = GameActionStateProviderKt.getLocalGameStateProvider();
                        final BookTriBenefitCaptchaDialog bookTriBenefitCaptchaDialog = this.f62389a;
                        ProvidedValue providedValueProvides2 = localGameStateProvider.provides(bookTriBenefitCaptchaDialog.f62257v);
                        final ComposeView composeView2 = this.f62390b;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providedValueProvides, providedValueProvides2}, ComposableLambdaKt.rememberComposableLambda(1802608053, true, new Function2(bookTriBenefitCaptchaDialog, composeView2) { // from class: com.bilibili.biligame.booktri.benefit.g

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final BookTriBenefitCaptchaDialog f62393a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final ComposeView f62394b;

                            {
                                this.f62393a = bookTriBenefitCaptchaDialog;
                                this.f62394b = composeView2;
                            }

                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1802608053, iIntValue2, -1, "com.bilibili.biligame.booktri.benefit.BookTriBenefitCaptchaDialog.setupComposeView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookTriBenefitCaptchaDialog.kt:218)");
                                    }
                                    final ComposeView composeView3 = this.f62394b;
                                    final int i7 = 0;
                                    final BookTriBenefitCaptchaDialog bookTriBenefitCaptchaDialog2 = this.f62393a;
                                    BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-2145586947, true, new Function2(i7, bookTriBenefitCaptchaDialog2, composeView3) { // from class: com.bilibili.biligame.booktri.benefit.h

                                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                                        public final int f62395a;

                                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                                        public final Object f62396b;

                                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                                        public final Object f62397c;

                                        {
                                            this.f62395a = i7;
                                            this.f62396b = bookTriBenefitCaptchaDialog2;
                                            this.f62397c = composeView3;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Removed duplicated region for block: B:38:0x01a6  */
                                        /* JADX WARN: Removed duplicated region for block: B:43:0x01e2  */
                                        /* JADX WARN: Removed duplicated region for block: B:48:0x021f  */
                                        /* JADX WARN: Removed duplicated region for block: B:53:0x025c  */
                                        /* JADX WARN: Removed duplicated region for block: B:58:0x0299  */
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                                        */
                                        public final java.lang.Object invoke(java.lang.Object r28, java.lang.Object r29) {
                                            /*
                                                Method dump skipped, instruction units count: 733
                                                To view this dump change 'Code comments level' option to 'DEBUG'
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.booktri.benefit.C5297h.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                                        }
                                    }, composer2, 54), composer2, 384, 3);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, composer, 54), composer, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }));
            frameLayout.addView(composeView, new FrameLayout.LayoutParams(-1, -1));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new BookTriBenefitCaptchaDialog$setupComposeView$2(this, null), 3, (Object) null);
    }

    public final void showFailure(@NotNull String str) {
        mf().L0(str, "");
    }

    public final void verifyWithGeeCaptcha(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        BiliWebView mWebView = getMWebView();
        if (mWebView != null) {
            mWebView.setVisibility(8);
        }
        cancelCaptchaCall();
        h0 h0VarMf = mf();
        h0.K0(h0VarMf, h0VarMf.f62407o, h0VarMf.f62408p, h0VarMf.f62409q, str, str2, str3, str4, 1, null, null, 768);
    }

    public final void verifyWithImageCaptcha(@Nullable String str, @Nullable String str2) {
        BiliWebView mWebView = getMWebView();
        if (mWebView != null) {
            mWebView.setVisibility(8);
        }
        cancelCaptchaCall();
        h0 h0VarMf = mf();
        h0.K0(h0VarMf, h0VarMf.f62407o, h0VarMf.f62408p, h0VarMf.f62409q, null, null, null, null, null, str, str2, 248);
    }
}
