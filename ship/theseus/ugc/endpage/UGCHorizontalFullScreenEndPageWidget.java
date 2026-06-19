package com.bilibili.ship.theseus.ugc.endpage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ugc.feature.actions.GeminiPlayerFollowButton;
import com.bilibili.app.gemini.ugc.feature.actions.GeminiPlayerReplayWidget;
import com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.a;
import com.bilibili.app.gemini.ugc.feature.n;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.exposer.ExposeListener;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.playerbizcommonv2.widget.base.PlayerBackWidget;
import com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.panel.IPanelContainer;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.AbsGroupWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCHorizontalFullScreenEndPageWidget.class */
@StabilityInferred(parameters = 0)
public final class UGCHorizontalFullScreenEndPageWidget extends AbsGroupWidget implements com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f96517A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f96518B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View f96519C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TintTextView f96520D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public TintTextView f96521E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public View f96522F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public RecyclerView f96523G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public com.bilibili.app.gemini.ui.f f96524H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public List<? extends UIComponent<?>> f96525I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public bY.c<RecyclerView> f96526J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final c f96527K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final b f96528L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f96530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f96531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f96532g;

    @NotNull
    public final IPlayerSettingService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IPanelContainer f96533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final yk.c f96534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final n f96535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f96536l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f96537m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f96538n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final UGCEndPageRelatedRecommendService f96539o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Context f96540p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f96541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final a.a.a f96542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PlayerBackWidget f96543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f96544t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f96545u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f96546v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f96547w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.bilibili.app.gemini.player.widget.like.h f96548x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public GeminiPlayerFollowButton f96549y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f96550z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCHorizontalFullScreenEndPageWidget$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f96551a = false;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCHorizontalFullScreenEndPageWidget$b.class */
    public static final class b implements dY.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UGCHorizontalFullScreenEndPageWidget f96552a;

        public b(UGCHorizontalFullScreenEndPageWidget uGCHorizontalFullScreenEndPageWidget) {
            this.f96552a = uGCHorizontalFullScreenEndPageWidget;
        }

        public final boolean a(int i7) {
            return !UGCEndPageRelatedRecommendService.f(this.f96552a.f96539o, i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCHorizontalFullScreenEndPageWidget$c.class */
    public static final class c implements ExposeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UGCHorizontalFullScreenEndPageWidget f96553a;

        public c(UGCHorizontalFullScreenEndPageWidget uGCHorizontalFullScreenEndPageWidget) {
            this.f96553a = uGCHorizontalFullScreenEndPageWidget;
        }

        public final void onExpose(int i7, View view) {
            UGCEndPageRelatedRecommendService.g(this.f96553a.f96539o, i7);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.UGCHorizontalFullScreenEndPageWidget$onWidgetShow$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCHorizontalFullScreenEndPageWidget$onWidgetShow$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCHorizontalFullScreenEndPageWidget this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.UGCHorizontalFullScreenEndPageWidget$onWidgetShow$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCHorizontalFullScreenEndPageWidget$onWidgetShow$1$1.class */
        public static final class C08211 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            final a $largeLandscapeItemDecoration;
            final b $normalItemDecoration;
            final c $verticalItemDecoration;
            Object L$0;
            int label;
            final UGCHorizontalFullScreenEndPageWidget this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08211(UGCHorizontalFullScreenEndPageWidget uGCHorizontalFullScreenEndPageWidget, c cVar, a aVar, b bVar, Continuation<? super C08211> continuation) {
                super(2, continuation);
                this.this$0 = uGCHorizontalFullScreenEndPageWidget;
                this.$verticalItemDecoration = cVar;
                this.$largeLandscapeItemDecoration = aVar;
                this.$normalItemDecoration = bVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08211 c08211 = new C08211(this.this$0, this.$verticalItemDecoration, this.$largeLandscapeItemDecoration, this.$normalItemDecoration, continuation);
                c08211.L$0 = obj;
                return c08211;
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                LinearLayoutManager linearLayoutManager;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
                RecyclerView recyclerView = this.this$0.f96523G;
                RecyclerView recyclerView2 = recyclerView;
                if (recyclerView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                    recyclerView2 = null;
                }
                recyclerView2.removeItemDecoration(this.$verticalItemDecoration);
                RecyclerView recyclerView3 = this.this$0.f96523G;
                RecyclerView recyclerView4 = recyclerView3;
                if (recyclerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                    recyclerView4 = null;
                }
                recyclerView4.removeItemDecoration(this.$largeLandscapeItemDecoration);
                RecyclerView recyclerView5 = this.this$0.f96523G;
                RecyclerView recyclerView6 = recyclerView5;
                if (recyclerView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                    recyclerView6 = null;
                }
                recyclerView6.removeItemDecoration(this.$normalItemDecoration);
                if (com.bilibili.ship.theseus.united.page.screensize.b.a(windowSizeClass)) {
                    PlayerBackWidget playerBackWidget = this.this$0.f96543s;
                    PlayerBackWidget playerBackWidget2 = playerBackWidget;
                    if (playerBackWidget == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("back");
                        playerBackWidget2 = null;
                    }
                    ViewGroup.LayoutParams layoutParams = playerBackWidget2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = DimenUtilsKt.dpToPx(28);
                    marginLayoutParams.leftMargin = DimenUtilsKt.dpToPx(20);
                    playerBackWidget2.setLayoutParams(marginLayoutParams);
                    View view = this.this$0.f96544t;
                    View view2 = view;
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("chargeDivider");
                        view2 = null;
                    }
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = MathKt.roundToInt(DimenUtilsKt.dpToPx(windowSizeClass.getMinHeightDp()) * (windowSizeClass.getMinHeightDp() < 700 ? 0.05f : 0.08f));
                    view2.setLayoutParams(marginLayoutParams2);
                    View view3 = this.this$0.f96545u;
                    View view4 = view3;
                    if (view3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recommendDivider");
                        view4 = null;
                    }
                    ViewGroup.LayoutParams layoutParams3 = view4.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams3.topMargin = MathKt.roundToInt(DimenUtilsKt.dpToPx(windowSizeClass.getMinHeightDp()) * (windowSizeClass.getMinHeightDp() < 700 ? 0.08f : 0.1f)) - DimenUtilsKt.dpToPx(16);
                    view4.setLayoutParams(marginLayoutParams3);
                    View view5 = this.this$0.f96546v;
                    View view6 = view5;
                    if (view5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rightSpace");
                        view6 = null;
                    }
                    ViewGroup.LayoutParams layoutParams4 = view6.getLayoutParams();
                    if (layoutParams4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    marginLayoutParams4.rightMargin = DimenUtilsKt.dpToPx(28);
                    view6.setLayoutParams(marginLayoutParams4);
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(this.this$0.f96540p, 5, 1, false);
                    RecyclerView recyclerView7 = this.this$0.f96523G;
                    RecyclerView recyclerView8 = recyclerView7;
                    if (recyclerView7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView8 = null;
                    }
                    recyclerView8.addItemDecoration(this.$largeLandscapeItemDecoration);
                    int iDpToPx = DimenUtilsKt.dpToPx(28);
                    RecyclerView recyclerView9 = this.this$0.f96523G;
                    RecyclerView recyclerView10 = recyclerView9;
                    if (recyclerView9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView10 = null;
                    }
                    RecyclerView recyclerView11 = this.this$0.f96523G;
                    RecyclerView recyclerView12 = recyclerView11;
                    if (recyclerView11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView12 = null;
                    }
                    int paddingTop = recyclerView12.getPaddingTop();
                    RecyclerView recyclerView13 = this.this$0.f96523G;
                    RecyclerView recyclerView14 = recyclerView13;
                    if (recyclerView13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView14 = null;
                    }
                    recyclerView10.setPadding(iDpToPx, paddingTop, iDpToPx, recyclerView14.getPaddingBottom());
                    linearLayoutManager = gridLayoutManager;
                } else if (this.this$0.f96541q.i()) {
                    PlayerBackWidget playerBackWidget3 = this.this$0.f96543s;
                    PlayerBackWidget playerBackWidget4 = playerBackWidget3;
                    if (playerBackWidget3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("back");
                        playerBackWidget4 = null;
                    }
                    ViewGroup.LayoutParams layoutParams5 = playerBackWidget4.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    marginLayoutParams5.topMargin = 0;
                    marginLayoutParams5.leftMargin = DimenUtilsKt.dpToPx(4);
                    playerBackWidget4.setLayoutParams(marginLayoutParams5);
                    View view7 = this.this$0.f96544t;
                    View view8 = view7;
                    if (view7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("chargeDivider");
                        view8 = null;
                    }
                    ViewGroup.LayoutParams layoutParams6 = view8.getLayoutParams();
                    if (layoutParams6 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                    marginLayoutParams6.topMargin = 0;
                    view8.setLayoutParams(marginLayoutParams6);
                    View view9 = this.this$0.f96545u;
                    View view10 = view9;
                    if (view9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recommendDivider");
                        view10 = null;
                    }
                    ViewGroup.LayoutParams layoutParams7 = view10.getLayoutParams();
                    if (layoutParams7 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
                    marginLayoutParams7.topMargin = DimenUtilsKt.dpToPx(0);
                    view10.setLayoutParams(marginLayoutParams7);
                    View view11 = this.this$0.f96546v;
                    View view12 = view11;
                    if (view11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rightSpace");
                        view12 = null;
                    }
                    ViewGroup.LayoutParams layoutParams8 = view12.getLayoutParams();
                    if (layoutParams8 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams8;
                    marginLayoutParams8.rightMargin = DimenUtilsKt.dpToPx(20);
                    view12.setLayoutParams(marginLayoutParams8);
                    LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this.this$0.f96540p, 0, false);
                    RecyclerView recyclerView15 = this.this$0.f96523G;
                    RecyclerView recyclerView16 = recyclerView15;
                    if (recyclerView15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView16 = null;
                    }
                    recyclerView16.addItemDecoration(this.$normalItemDecoration);
                    RecyclerView recyclerView17 = this.this$0.f96523G;
                    RecyclerView recyclerView18 = recyclerView17;
                    if (recyclerView17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView18 = null;
                    }
                    RecyclerView recyclerView19 = this.this$0.f96523G;
                    RecyclerView recyclerView20 = recyclerView19;
                    if (recyclerView19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView20 = null;
                    }
                    int paddingTop2 = recyclerView20.getPaddingTop();
                    RecyclerView recyclerView21 = this.this$0.f96523G;
                    RecyclerView recyclerView22 = recyclerView21;
                    if (recyclerView21 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView22 = null;
                    }
                    recyclerView18.setPadding(0, paddingTop2, 0, recyclerView22.getPaddingBottom());
                    linearLayoutManager = linearLayoutManager2;
                } else {
                    PlayerBackWidget playerBackWidget5 = this.this$0.f96543s;
                    PlayerBackWidget playerBackWidget6 = playerBackWidget5;
                    if (playerBackWidget5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("back");
                        playerBackWidget6 = null;
                    }
                    ViewGroup.LayoutParams layoutParams9 = playerBackWidget6.getLayoutParams();
                    if (layoutParams9 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) layoutParams9;
                    marginLayoutParams9.topMargin = DimenUtilsKt.dpToPx(28);
                    marginLayoutParams9.leftMargin = DimenUtilsKt.dpToPx(4);
                    playerBackWidget6.setLayoutParams(marginLayoutParams9);
                    View view13 = this.this$0.f96544t;
                    View view14 = view13;
                    if (view13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("chargeDivider");
                        view14 = null;
                    }
                    ViewGroup.LayoutParams layoutParams10 = view14.getLayoutParams();
                    if (layoutParams10 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) layoutParams10;
                    marginLayoutParams10.topMargin = DimenUtilsKt.dpToPx(25);
                    view14.setLayoutParams(marginLayoutParams10);
                    View view15 = this.this$0.f96545u;
                    View view16 = view15;
                    if (view15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recommendDivider");
                        view16 = null;
                    }
                    ViewGroup.LayoutParams layoutParams11 = view16.getLayoutParams();
                    if (layoutParams11 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) layoutParams11;
                    marginLayoutParams11.topMargin = DimenUtilsKt.dpToPx(45);
                    view16.setLayoutParams(marginLayoutParams11);
                    View view17 = this.this$0.f96546v;
                    View view18 = view17;
                    if (view17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rightSpace");
                        view18 = null;
                    }
                    ViewGroup.LayoutParams layoutParams12 = view18.getLayoutParams();
                    if (layoutParams12 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams12 = (ViewGroup.MarginLayoutParams) layoutParams12;
                    marginLayoutParams12.rightMargin = DimenUtilsKt.dpToPx(8);
                    view18.setLayoutParams(marginLayoutParams12);
                    GridLayoutManager gridLayoutManager2 = new GridLayoutManager(this.this$0.f96540p, 3);
                    RecyclerView recyclerView23 = this.this$0.f96523G;
                    RecyclerView recyclerView24 = recyclerView23;
                    if (recyclerView23 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView24 = null;
                    }
                    recyclerView24.addItemDecoration(this.$verticalItemDecoration);
                    int iDpToPx2 = DimenUtilsKt.dpToPx(14);
                    RecyclerView recyclerView25 = this.this$0.f96523G;
                    RecyclerView recyclerView26 = recyclerView25;
                    if (recyclerView25 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView26 = null;
                    }
                    RecyclerView recyclerView27 = this.this$0.f96523G;
                    RecyclerView recyclerView28 = recyclerView27;
                    if (recyclerView27 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView28 = null;
                    }
                    int paddingTop3 = recyclerView28.getPaddingTop();
                    RecyclerView recyclerView29 = this.this$0.f96523G;
                    RecyclerView recyclerView30 = recyclerView29;
                    if (recyclerView29 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView30 = null;
                    }
                    recyclerView26.setPadding(iDpToPx2, paddingTop3, iDpToPx2, recyclerView30.getPaddingBottom());
                    linearLayoutManager = gridLayoutManager2;
                }
                RecyclerView recyclerView31 = this.this$0.f96523G;
                if (recyclerView31 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                    recyclerView31 = null;
                }
                recyclerView31.setLayoutManager(linearLayoutManager);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.UGCHorizontalFullScreenEndPageWidget$onWidgetShow$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCHorizontalFullScreenEndPageWidget$onWidgetShow$1$a.class */
        public static final class a extends RecyclerView.ItemDecoration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f96554a = DimenUtilsKt.dpToPx(22);

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                if (recyclerView.getChildAdapterPosition(view) >= 5) {
                    rect.set(0, this.f96554a, 0, 0);
                }
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.UGCHorizontalFullScreenEndPageWidget$onWidgetShow$1$b */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCHorizontalFullScreenEndPageWidget$onWidgetShow$1$b.class */
        public static final class b extends RecyclerView.ItemDecoration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f96555a = DimenUtilsKt.dpToPx(12);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UGCHorizontalFullScreenEndPageWidget f96556b;

            public b(UGCHorizontalFullScreenEndPageWidget uGCHorizontalFullScreenEndPageWidget) {
                this.f96556b = uGCHorizontalFullScreenEndPageWidget;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int i7 = this.f96555a;
                if (childAdapterPosition == 0) {
                    rect.set(i7, 0, 0, 0);
                }
                com.bilibili.app.gemini.ui.f fVar = this.f96556b.f96524H;
                com.bilibili.app.gemini.ui.f fVar2 = fVar;
                if (fVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("componentAdapter");
                    fVar2 = null;
                }
                if (childAdapterPosition >= fVar2.c.size() - 1) {
                    rect.set(0, 0, i7, 0);
                }
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.UGCHorizontalFullScreenEndPageWidget$onWidgetShow$1$c */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCHorizontalFullScreenEndPageWidget$onWidgetShow$1$c.class */
        public static final class c extends RecyclerView.ItemDecoration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f96557a = DimenUtilsKt.dpToPx(22);

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                if (recyclerView.getChildAdapterPosition(view) >= 3) {
                    rect.set(0, this.f96557a, 0, 0);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCHorizontalFullScreenEndPageWidget uGCHorizontalFullScreenEndPageWidget, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCHorizontalFullScreenEndPageWidget;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                c cVar = new c();
                a aVar = new a();
                b bVar = new b(this.this$0);
                UGCHorizontalFullScreenEndPageWidget uGCHorizontalFullScreenEndPageWidget = this.this$0;
                StateFlow<WindowSizeClass> stateFlow = uGCHorizontalFullScreenEndPageWidget.f96541q.f102939c;
                C08211 c08211 = new C08211(uGCHorizontalFullScreenEndPageWidget, cVar, aVar, bVar, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08211, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public UGCHorizontalFullScreenEndPageWidget(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull BiliAccounts biliAccounts, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull IPanelContainer iPanelContainer, @NotNull yk.c cVar, @Nullable n nVar, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull IPlayerSettingService iPlayerSettingService2, @NotNull UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService, @NotNull Context context, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2) {
        super(context);
        this.f96529d = coroutineScope;
        this.f96530e = hVar;
        this.f96531f = biliAccounts;
        this.f96532g = aVar;
        this.h = iPlayerSettingService;
        this.f96533i = iPanelContainer;
        this.f96534j = cVar;
        this.f96535k = nVar;
        this.f96536l = absFunctionWidgetService;
        this.f96537m = dVar;
        this.f96538n = iPlayerSettingService2;
        this.f96539o = uGCEndPageRelatedRecommendService;
        this.f96540p = context;
        this.f96541q = aVar2;
        this.f96542r = a.a.a.a;
        this.f96525I = CollectionsKt.emptyList();
        this.f96527K = new c(this);
        this.f96528L = new b(this);
    }

    public static void i(int i7, View view) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i7;
        view.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@NotNull com.bilibili.ogv.infra.util.f fVar) {
        boolean z6;
        if (fVar.isEmpty() || this.f96525I.isEmpty() || fVar.size() <= this.f96525I.size() || Intrinsics.areEqual(((UIComponent) CollectionsKt.first(fVar)).identityEqualityKey(), ((UIComponent) CollectionsKt.first(this.f96525I)).identityEqualityKey()) || fVar.isEmpty()) {
            z6 = false;
        } else {
            Iterator it = fVar.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((UIComponent) it.next()).identityEqualityKey(), ((UIComponent) CollectionsKt.first(this.f96525I)).identityEqualityKey())) {
                    z6 = true;
                    break;
                }
            }
            z6 = false;
        }
        com.bilibili.app.gemini.ui.f fVar2 = this.f96524H;
        com.bilibili.app.gemini.ui.f fVar3 = fVar2;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("componentAdapter");
            fVar3 = null;
        }
        fVar3.N(fVar);
        this.f96525I = fVar;
        if (z6 && !fVar.isEmpty()) {
            RecyclerView recyclerView = this.f96523G;
            RecyclerView recyclerView2 = recyclerView;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                recyclerView2 = null;
            }
            recyclerView2.post(new Runnable(this) { // from class: com.bilibili.ship.theseus.ugc.endpage.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UGCHorizontalFullScreenEndPageWidget f96603a;

                {
                    this.f96603a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    RecyclerView recyclerView3 = this.f96603a.f96523G;
                    RecyclerView recyclerView4 = recyclerView3;
                    if (recyclerView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
                        recyclerView4 = null;
                    }
                    recyclerView4.smoothScrollToPosition(0);
                }
            });
        }
        BuildersKt.launch$default(this.f96529d, (CoroutineContext) null, (CoroutineStart) null, new UGCHorizontalFullScreenEndPageWidget$updateUIComponents$2(this, null), 3, (Object) null);
    }

    public final a.a getContainerType() {
        return this.f96542r;
    }

    @NotNull
    public final tv.danmaku.biliplayerv2.service.f getFunctionInsetConfig() {
        return new tv.danmaku.biliplayerv2.service.f(0, 30);
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(false, false, true, false, false);
        builderA.changeOrientationDisableWhenShow(false);
        return builderA.build();
    }

    public final void onConfigurationChanged(@NotNull AbsFunctionWidget.Configuration configuration) {
        if ((configuration instanceof a) && ((a) configuration).f96551a) {
            View viewFindViewById = getView().findViewById(2131305022);
            viewFindViewById.addOnLayoutChangeListener(new f(this, viewFindViewById));
        }
    }

    @NotNull
    public final View onCreateContentView(@NotNull Context context) {
        Gk.b bVarInflate = Gk.b.inflate(LayoutInflater.from(context));
        ConstraintLayout constraintLayout = bVarInflate.a;
        this.f96539o.a(this, UGCHorizontalFullScreenEndPageWidget.class.getName());
        bVarInflate.x.setReplayHandle(new GeminiPlayerReplayWidget.a(this) { // from class: com.bilibili.ship.theseus.ugc.endpage.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UGCHorizontalFullScreenEndPageWidget f96602a;

            {
                this.f96602a = this;
            }

            public final void replay() {
                UGCHorizontalFullScreenEndPageWidget uGCHorizontalFullScreenEndPageWidget = this.f96602a;
                BuildersKt.launch$default(uGCHorizontalFullScreenEndPageWidget.f96529d, (CoroutineContext) null, (CoroutineStart) null, new UGCHorizontalFullScreenEndPageWidget$onCreateContentView$1$1(uGCHorizontalFullScreenEndPageWidget, null), 3, (Object) null);
            }
        });
        this.f96543s = bVarInflate.c;
        this.f96544t = bVarInflate.d;
        this.f96545u = bVarInflate.u;
        this.f96546v = bVarInflate.y;
        this.f96517A = bVarInflate.r;
        this.f96518B = bVarInflate.p;
        this.f96519C = bVarInflate.h;
        this.f96520D = bVarInflate.t;
        this.f96521E = bVarInflate.g;
        IPlayerSettingService iPlayerSettingService = this.f96538n;
        Oi1.d cloudConfig = iPlayerSettingService.getCloudConfig();
        View view = this.f96517A;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("frameLike");
            view2 = null;
        }
        view2.setVisibility(cloudConfig.D() && ConnectivityMonitor.getInstance().isNetworkActive() ? 0 : 8);
        if (iPlayerSettingService.getCloudConfig().j()) {
            View view3 = this.f96517A;
            View view4 = view3;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("frameLike");
                view4 = null;
            }
            view4.setEnabled(false);
            TintTextView tintTextView = this.f96520D;
            TintTextView tintTextView2 = tintTextView;
            if (tintTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("likeText");
                tintTextView2 = null;
            }
            tintTextView2.setAlpha(0.4f);
        } else {
            View view5 = this.f96517A;
            View view6 = view5;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("frameLike");
                view6 = null;
            }
            view6.setEnabled(true);
        }
        View view7 = this.f96519C;
        View view8 = view7;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coinLayout");
            view8 = null;
        }
        int i7 = 8;
        if (cloudConfig.o()) {
            i7 = 8;
            if (cloudConfig.u()) {
                i7 = 8;
                if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                    i7 = 0;
                }
            }
        }
        view8.setVisibility(i7);
        if (iPlayerSettingService.getCloudConfig().i()) {
            View view9 = this.f96518B;
            View view10 = view9;
            if (view9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("frameCoin");
                view10 = null;
            }
            view10.setEnabled(false);
            TintTextView tintTextView3 = this.f96521E;
            TintTextView tintTextView4 = tintTextView3;
            if (tintTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coinText");
                tintTextView4 = null;
            }
            tintTextView4.setAlpha(0.4f);
        } else {
            View view11 = this.f96518B;
            View view12 = view11;
            if (view11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("frameCoin");
                view12 = null;
            }
            view12.setEnabled(true);
        }
        this.f96547w = bVarInflate.v;
        this.f96549y = bVarInflate.o;
        long jA = this.f96532g.a();
        View view13 = this.f96517A;
        if (view13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("frameLike");
            view13 = null;
        }
        View view14 = this.f96518B;
        if (view14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("frameCoin");
            view14 = null;
        }
        this.f96548x = new com.bilibili.app.gemini.player.widget.like.h(this.f96534j, jA, constraintLayout, view13, bVarInflate.s, view14, bVarInflate.e, bVarInflate.q, bVarInflate.m, bVarInflate.f, bVarInflate.n);
        this.f96550z = bVarInflate.i;
        this.f96522F = bVarInflate.z;
        TextView textView = this.f96547w;
        TextView textView2 = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("relateTitle");
            textView2 = null;
        }
        textView2.setText(Aj0.a.f317a.getResources().getString(UGCEndPageRelatedRecommendService.f96802x ? 2131846936 : 2131855793));
        this.f96523G = bVarInflate.w;
        this.f96524H = new com.bilibili.app.gemini.ui.f(false);
        RecyclerView recyclerView = this.f96523G;
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView2 = null;
        }
        RecyclerView.Adapter adapter = this.f96524H;
        RecyclerView.Adapter adapter2 = adapter;
        if (adapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("componentAdapter");
            adapter2 = null;
        }
        recyclerView2.setAdapter(adapter2);
        RecyclerView recyclerView3 = this.f96523G;
        RecyclerView recyclerView4 = recyclerView3;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView4 = null;
        }
        bY.d dVar = new bY.d(new eY.c(recyclerView4));
        c cVar = this.f96527K;
        bY.a aVar = dVar.b;
        aVar.f = cVar;
        ((ArrayList) aVar.d).add(this.f96528L);
        this.f96526J = dVar.a();
        Point displayRealSize = StatusBarCompat.getDisplayRealSize(context);
        int i8 = displayRealSize.x;
        int i9 = displayRealSize.y;
        int i10 = i8 > i9 ? i9 : i8;
        if (i8 <= i9) {
            i8 = i9;
        }
        if (i10 > 0 && i8 > 0 && i10 / i8 > 0.5f) {
            int iDip2px = ScreenUtil.dip2px(context, 50.0f);
            i(iDip2px, bVarInflate.r);
            View view15 = this.f96550z;
            View view16 = view15;
            if (view15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dislikeLayout");
                view16 = null;
            }
            i(iDip2px, view16);
            i(iDip2px, bVarInflate.h);
            i(iDip2px, bVarInflate.j);
            i(iDip2px, bVarInflate.z);
            View view17 = bVarInflate.l;
            ViewGroup.LayoutParams layoutParams = view17.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.rightMargin = ScreenUtil.dip2px(context, 6.0f);
                view17.setLayoutParams(marginLayoutParams);
            }
            LinearLayout linearLayout = bVarInflate.k;
            i(iDip2px, linearLayout);
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            }
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.rightMargin = ScreenUtil.dip2px(context, 6.0f);
                linearLayout.setLayoutParams(marginLayoutParams2);
            }
        }
        return constraintLayout;
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        com.bilibili.app.gemini.player.widget.like.h hVar = this.f96548x;
        com.bilibili.app.gemini.player.widget.like.h hVar2 = hVar;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("likeTriple");
            hVar2 = null;
        }
        hVar2.a();
        this.f96539o.h(UGCHorizontalFullScreenEndPageWidget.class.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWidgetShow() {
        StateFlow stateFlowJ;
        super.onWidgetShow();
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        View view = this.f96549y;
        View view2 = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("followButton");
            view2 = null;
        }
        view2.setVisibility((this.f96537m.f() > this.f96531f.mid() ? 1 : (this.f96537m.f() == this.f96531f.mid() ? 0 : -1)) != 0 ? 0 : 8);
        com.bilibili.app.gemini.player.widget.like.h hVar = this.f96548x;
        com.bilibili.app.gemini.player.widget.like.h hVar2 = hVar;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("likeTriple");
            hVar2 = null;
        }
        hVar2.c();
        n nVar = this.f96535k;
        if (nVar != null && (stateFlowJ = nVar.j()) != null) {
            List list = (List) stateFlowJ.getValue();
            TextView textView = this.f96547w;
            TextView textView2 = textView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("relateTitle");
                textView2 = null;
            }
            List list2 = list;
            textView2.setVisibility((list2 == null || list2.isEmpty()) ? 8 : 0);
        }
        bY.c<RecyclerView> cVar = this.f96526J;
        bY.c<RecyclerView> cVar2 = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exposeClient");
            cVar2 = null;
        }
        n nVar2 = this.f96539o.h;
        Float fI = nVar2 != null ? nVar2.i() : null;
        cVar2.f(fI != null ? fI.floatValue() : 0.8f);
        bY.c<RecyclerView> cVar3 = this.f96526J;
        bY.c<RecyclerView> cVar4 = cVar3;
        if (cVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("exposeClient");
            cVar4 = null;
        }
        cVar4.i();
        Oi1.d cloudConfig = this.h.getCloudConfig();
        View view3 = this.f96550z;
        View view4 = view3;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dislikeLayout");
            view4 = null;
        }
        view4.setVisibility((cloudConfig.a.getDislikeConf().b(true) && cloudConfig.x()) ? 0 : 8);
        View view5 = this.f96522F;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("share");
            view5 = null;
        }
        view5.setVisibility((cloudConfig.Q() && ConnectivityMonitor.getInstance().isNetworkActive()) ? 0 : 8);
    }
}
