package com.bilibili.ship.theseus.ugc.endpage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ugc.feature.actions.GeminiPlayerReplayWidget;
import com.bilibili.app.gemini.ugc.feature.endpage.GeminiEndPageNestedView;
import com.bilibili.app.gemini.ugc.feature.endpage.GeminiEndPageVerticalTopLayout;
import com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.a;
import com.bilibili.app.gemini.ugc.feature.n;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.exposer.ExposeListener;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.playerbizcommon.view.RingProgressBar;
import com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.panel.IPanelContainer;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;
import tv.danmaku.biliplayerv2.widget.AbsGroupWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCVerticalFullScreenEndPageWidget.class */
@StabilityInferred(parameters = 0)
public final class UGCVerticalFullScreenEndPageWidget extends AbsGroupWidget implements com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public TextView f96558A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public bY.c<RecyclerView> f96559B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final e f96560C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @NotNull
    public final d f96561D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final c f96562E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f96564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f96565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final yk.c f96566g;

    @NotNull
    public final IPanelContainer h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f96567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f96568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f96569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f96570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f96571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final UGCEndPageRelatedRecommendService f96572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final a.a.a f96573o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public RecyclerView f96574p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public com.bilibili.app.gemini.ui.f f96575q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public GeminiEndPageVerticalTopLayout f96576r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public View f96577s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public TextView f96578t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public com.bilibili.app.gemini.player.widget.like.h f96579u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public View f96580v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public View f96581w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public View f96582x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public View f96583y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public TextView f96584z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCVerticalFullScreenEndPageWidget$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f96585a = false;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCVerticalFullScreenEndPageWidget$b.class */
    public final class b implements GeminiEndPageNestedView.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f96586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UGCVerticalFullScreenEndPageWidget f96587b;

        public b(UGCVerticalFullScreenEndPageWidget uGCVerticalFullScreenEndPageWidget) {
            this.f96587b = uGCVerticalFullScreenEndPageWidget;
        }

        public final boolean a(@NotNull MotionEvent motionEvent) {
            GeminiEndPageVerticalTopLayout geminiEndPageVerticalTopLayout;
            boolean z6;
            GeminiEndPageVerticalTopLayout geminiEndPageVerticalTopLayout2;
            boolean z7;
            View view;
            int actionMasked = motionEvent.getActionMasked();
            boolean z8 = actionMasked == 0;
            if (actionMasked == 0) {
                this.f96586a = (int) motionEvent.getY();
            } else if (actionMasked == 2) {
                int y6 = (int) (motionEvent.getY() - this.f96586a);
                this.f96586a = (int) motionEvent.getY();
                UGCVerticalFullScreenEndPageWidget uGCVerticalFullScreenEndPageWidget = this.f96587b;
                RecyclerView recyclerView = uGCVerticalFullScreenEndPageWidget.f96574p;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) (recyclerView != null ? recyclerView.getLayoutManager() : null);
                int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstCompletelyVisibleItemPosition() : -1;
                if (((iFindFirstCompletelyVisibleItemPosition == 0 && y6 < -20) || (iFindFirstCompletelyVisibleItemPosition > 0 && y6 < 0)) && (geminiEndPageVerticalTopLayout2 = uGCVerticalFullScreenEndPageWidget.f96576r) != null && (z7 = geminiEndPageVerticalTopLayout2.j)) {
                    z8 = true;
                    if (z7) {
                        if (geminiEndPageVerticalTopLayout2.o) {
                            z8 = true;
                        } else {
                            if (geminiEndPageVerticalTopLayout2.q < 0 && (view = geminiEndPageVerticalTopLayout2.a) != null && geminiEndPageVerticalTopLayout2.f != null && geminiEndPageVerticalTopLayout2.g != null) {
                                geminiEndPageVerticalTopLayout2.p = view.getMeasuredWidth();
                                View view2 = geminiEndPageVerticalTopLayout2.h;
                                if (view2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mTopLayout");
                                    view2 = null;
                                }
                                geminiEndPageVerticalTopLayout2.q = view2.getMeasuredWidth() - NewPlayerUtilsKt.toPx(230.0f);
                            }
                            if (geminiEndPageVerticalTopLayout2.q > 0) {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(geminiEndPageVerticalTopLayout2.q, geminiEndPageVerticalTopLayout2.a.getHeight());
                                View view3 = geminiEndPageVerticalTopLayout2.a;
                                if (view3 != null) {
                                    view3.setLayoutParams(layoutParams);
                                }
                            }
                            geminiEndPageVerticalTopLayout2.j = false;
                            Animator animatorA = geminiEndPageVerticalTopLayout2.a(true);
                            animatorA.addListener(geminiEndPageVerticalTopLayout2.r);
                            animatorA.start();
                            View view4 = geminiEndPageVerticalTopLayout2.c;
                            z8 = true;
                            if (view4 != null) {
                                view4.setVisibility(8);
                                z8 = true;
                            }
                        }
                    }
                } else if (iFindFirstCompletelyVisibleItemPosition == 0 && y6 > 30 && (geminiEndPageVerticalTopLayout = uGCVerticalFullScreenEndPageWidget.f96576r) != null && !(z6 = geminiEndPageVerticalTopLayout.j)) {
                    z8 = true;
                    if (!z6) {
                        if (geminiEndPageVerticalTopLayout.o) {
                            z8 = true;
                        } else {
                            if (geminiEndPageVerticalTopLayout.p > 0 && geminiEndPageVerticalTopLayout.a != null) {
                                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(geminiEndPageVerticalTopLayout.p, geminiEndPageVerticalTopLayout.a.getHeight());
                                View view5 = geminiEndPageVerticalTopLayout.a;
                                if (view5 != null) {
                                    view5.setLayoutParams(layoutParams2);
                                }
                            }
                            geminiEndPageVerticalTopLayout.j = true;
                            Animator animatorA2 = geminiEndPageVerticalTopLayout.a(false);
                            animatorA2.addListener(geminiEndPageVerticalTopLayout.r);
                            animatorA2.start();
                            View view6 = geminiEndPageVerticalTopLayout.c;
                            z8 = true;
                            if (view6 != null) {
                                view6.setVisibility(0);
                                z8 = true;
                            }
                        }
                    }
                }
            }
            return z8;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCVerticalFullScreenEndPageWidget$c.class */
    public static final class c implements GeminiEndPageVerticalTopLayout.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UGCVerticalFullScreenEndPageWidget f96588a;

        public c(UGCVerticalFullScreenEndPageWidget uGCVerticalFullScreenEndPageWidget) {
            this.f96588a = uGCVerticalFullScreenEndPageWidget;
        }

        public final void onAnimationEnd() {
            bY.c<RecyclerView> cVar = this.f96588a.f96559B;
            if (cVar != null) {
                cVar.h();
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCVerticalFullScreenEndPageWidget$d.class */
    public static final class d implements dY.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UGCVerticalFullScreenEndPageWidget f96589a;

        public d(UGCVerticalFullScreenEndPageWidget uGCVerticalFullScreenEndPageWidget) {
            this.f96589a = uGCVerticalFullScreenEndPageWidget;
        }

        public final boolean a(int i7) {
            return !UGCEndPageRelatedRecommendService.f(this.f96589a.f96572n, i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCVerticalFullScreenEndPageWidget$e.class */
    public static final class e implements ExposeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UGCVerticalFullScreenEndPageWidget f96590a;

        public e(UGCVerticalFullScreenEndPageWidget uGCVerticalFullScreenEndPageWidget) {
            this.f96590a = uGCVerticalFullScreenEndPageWidget;
        }

        public final void onExpose(int i7, View view) {
            UGCEndPageRelatedRecommendService.g(this.f96590a.f96572n, i7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCVerticalFullScreenEndPageWidget$f.class */
    public static final class f extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
            rect.bottom = NewPlayerUtilsKt.toPx(6.0f);
            if (childLayoutPosition % 2 == 0) {
                rect.right = NewPlayerUtilsKt.toPx(6.0f);
            } else {
                rect.left = NewPlayerUtilsKt.toPx(6.0f);
            }
        }
    }

    @Inject
    public UGCVerticalFullScreenEndPageWidget(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull BiliAccounts biliAccounts, @NotNull yk.c cVar, @NotNull IPanelContainer iPanelContainer, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull IPlayerSettingService iPlayerSettingService2, @NotNull UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService, @NotNull Context context) {
        super(context);
        this.f96563d = coroutineScope;
        this.f96564e = hVar;
        this.f96565f = biliAccounts;
        this.f96566g = cVar;
        this.h = iPanelContainer;
        this.f96567i = absFunctionWidgetService;
        this.f96568j = iPlayerSettingService;
        this.f96569k = dVar;
        this.f96570l = aVar;
        this.f96571m = iPlayerSettingService2;
        this.f96572n = uGCEndPageRelatedRecommendService;
        this.f96573o = a.a.a.a;
        this.f96560C = new e(this);
        this.f96561D = new d(this);
        this.f96562E = new c(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@NotNull com.bilibili.ogv.infra.util.f fVar) {
        RecyclerView recyclerView;
        if (!fVar.isEmpty() && (recyclerView = this.f96574p) != null) {
            recyclerView.setVisibility(0);
        }
        com.bilibili.app.gemini.ui.f fVar2 = this.f96575q;
        if (fVar2 != null) {
            fVar2.N(fVar);
        }
    }

    public final a.a getContainerType() {
        return this.f96573o;
    }

    @NotNull
    public final tv.danmaku.biliplayerv2.service.f getFunctionInsetConfig() {
        return new tv.danmaku.biliplayerv2.service.f(NewPlayerUtilsKt.toPx(16.0f), 26);
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(false, false, true, false, false);
        builderA.changeOrientationDisableWhenShow(false);
        return builderA.build();
    }

    public final void onConfigurationChanged(@NotNull AbsFunctionWidget.Configuration configuration) {
        if ((configuration instanceof a) && ((a) configuration).f96585a) {
            ViewGroup viewGroup = (ViewGroup) getView().findViewById(2131301986);
            viewGroup.addOnLayoutChangeListener(new i(this, viewGroup));
        }
    }

    @NotNull
    public final View onCreateContentView(@NotNull Context context) {
        Gk.c cVarInflate = Gk.c.inflate(LayoutInflater.from(context));
        LinearLayout linearLayout = cVarInflate.a;
        cVarInflate.b.d.setReplayHandle(new GeminiPlayerReplayWidget.a(this) { // from class: com.bilibili.ship.theseus.ugc.endpage.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UGCVerticalFullScreenEndPageWidget f96607a;

            {
                this.f96607a = this;
            }

            public final void replay() {
                UGCVerticalFullScreenEndPageWidget uGCVerticalFullScreenEndPageWidget = this.f96607a;
                BuildersKt.launch$default(uGCVerticalFullScreenEndPageWidget.f96563d, (CoroutineContext) null, (CoroutineStart) null, new UGCVerticalFullScreenEndPageWidget$onCreateContentView$1$1(uGCVerticalFullScreenEndPageWidget, null), 3, (Object) null);
            }
        });
        this.f96580v = linearLayout.findViewById(2131301778);
        this.f96581w = linearLayout.findViewById(2131301986);
        this.f96582x = linearLayout.findViewById(2131301974);
        this.f96583y = linearLayout.findViewById(2131319077);
        this.f96584z = (TextView) linearLayout.findViewById(2131305027);
        this.f96558A = (TextView) linearLayout.findViewById(2131298996);
        this.f96579u = new com.bilibili.app.gemini.player.widget.like.h(this.f96566g, this.f96570l.a(), linearLayout, this.f96581w, linearLayout.findViewById(2131302144), this.f96582x, linearLayout.findViewById(2131298989), linearLayout.findViewById(2131301983), linearLayout.findViewById(2131301432), (RingProgressBar) linearLayout.findViewById(2131298995), (RingProgressBar) linearLayout.findViewById(2131301436));
        this.f96574p = (RecyclerView) linearLayout.findViewById(2131306580);
        if (this.f96575q == null) {
            this.f96575q = new com.bilibili.app.gemini.ui.f(false);
        }
        RecyclerView recyclerView = this.f96574p;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f96575q);
            recyclerView.setLayoutManager(new GridLayoutManager(context, 2));
        }
        this.f96572n.a(this, UGCVerticalFullScreenEndPageWidget.class.getName());
        RecyclerView recyclerView2 = this.f96574p;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new RecyclerView.ItemDecoration());
        }
        linearLayout.findViewById(2131307803).setTouchInterceptor(new b(this));
        this.f96577s = linearLayout.findViewById(2131311173);
        this.f96576r = linearLayout.findViewById(2131296961);
        TextView textView = (TextView) linearLayout.findViewById(2131310009);
        this.f96578t = textView;
        if (textView != null) {
            textView.setVisibility(0);
        }
        IPlayerSettingService iPlayerSettingService = this.f96571m;
        Oi1.d cloudConfig = iPlayerSettingService.getCloudConfig();
        if (UGCEndPageRelatedRecommendService.f96802x) {
            TextView textView2 = this.f96578t;
            if (textView2 != null) {
                textView2.setText(Aj0.a.f317a.getResources().getString(2131846936));
            }
        } else {
            TextView textView3 = this.f96578t;
            if (textView3 != null) {
                textView3.setText(Aj0.a.f317a.getResources().getString(2131855793));
            }
        }
        View view = this.f96581w;
        if (view != null) {
            view.setVisibility((cloudConfig.D() && ConnectivityMonitor.getInstance().isNetworkActive()) ? 0 : 8);
        }
        if (iPlayerSettingService.getCloudConfig().j()) {
            View view2 = this.f96581w;
            if (view2 != null) {
                view2.setEnabled(false);
            }
            TextView textView4 = this.f96584z;
            if (textView4 != null) {
                textView4.setAlpha(0.4f);
            }
        } else {
            View view3 = this.f96581w;
            if (view3 != null) {
                view3.setEnabled(true);
            }
        }
        View view4 = this.f96583y;
        if (view4 != null) {
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
            view4.setVisibility(i7);
        }
        if (iPlayerSettingService.getCloudConfig().i()) {
            View view5 = this.f96582x;
            if (view5 != null) {
                view5.setEnabled(false);
            }
            TextView textView5 = this.f96558A;
            if (textView5 != null) {
                textView5.setAlpha(0.4f);
            }
        } else {
            View view6 = this.f96582x;
            if (view6 != null) {
                view6.setEnabled(true);
            }
        }
        RecyclerView recyclerView3 = this.f96574p;
        if (recyclerView3 != null) {
            bY.d dVar = new bY.d(new eY.c(recyclerView3));
            e eVar = this.f96560C;
            bY.a aVar = dVar.b;
            aVar.f = eVar;
            ((ArrayList) aVar.d).add(this.f96561D);
            this.f96559B = dVar.a();
        }
        GeminiEndPageVerticalTopLayout geminiEndPageVerticalTopLayout = this.f96576r;
        if (geminiEndPageVerticalTopLayout != null) {
            geminiEndPageVerticalTopLayout.setAnimationListener(this.f96562E);
        }
        return linearLayout;
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        com.bilibili.app.gemini.player.widget.like.h hVar = this.f96579u;
        if (hVar != null) {
            hVar.a();
        }
        this.f96572n.h(UGCVerticalFullScreenEndPageWidget.class.getName());
    }

    public final void onWidgetShow() {
        View view;
        super.onWidgetShow();
        if (this.f96569k.f() == this.f96565f.mid() && (view = this.f96580v) != null) {
            view.setVisibility(8);
        }
        if (this.f96574p == null) {
            return;
        }
        bY.c<RecyclerView> cVar = this.f96559B;
        if (cVar != null) {
            n nVar = this.f96572n.h;
            Float fI = nVar != null ? nVar.i() : null;
            cVar.f(fI != null ? fI.floatValue() : 0.8f);
        }
        bY.c<RecyclerView> cVar2 = this.f96559B;
        if (cVar2 != null) {
            cVar2.i();
        }
        com.bilibili.app.gemini.player.widget.like.h hVar = this.f96579u;
        if (hVar != null) {
            hVar.c();
        }
        Oi1.d cloudConfig = this.f96568j.getCloudConfig();
        View view2 = this.f96577s;
        if (view2 != null) {
            int i7 = 8;
            if (cloudConfig.Q()) {
                i7 = 8;
                if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                    i7 = 0;
                }
            }
            view2.setVisibility(i7);
        }
    }
}
