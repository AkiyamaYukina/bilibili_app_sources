package com.bilibili.ship.theseus.ugc.endpage;

import Vu0.C2974m;
import Vu0.C2975n;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bilibili.app.gemini.ugc.feature.actions.GeminiPlayerReplayWidget;
import com.bilibili.app.gemini.ugc.feature.endpage.GeminiEndPageThumbRelativeNewWidget;
import com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.a;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.widget.AbsGroupWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCHalfScreenEndPageWidget.class */
@StabilityInferred(parameters = 0)
public final class UGCHalfScreenEndPageWidget extends AbsGroupWidget implements com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f96493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f96495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final UGCEndPageRelatedRecommendService f96496g;

    @NotNull
    public final PageNestedScrollFusionRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f96497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f96498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f96499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a.a.b f96500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public Job f96501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public View f96502n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public GeminiEndPageThumbRelativeNewWidget f96503o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public AlphaAnimation f96504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f96505q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f96506r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f96507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f96508t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public C2975n f96509u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f96510v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f96511w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final DecelerateInterpolator f96512x;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.UGCHalfScreenEndPageWidget$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCHalfScreenEndPageWidget$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCHalfScreenEndPageWidget this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.UGCHalfScreenEndPageWidget$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCHalfScreenEndPageWidget$1$1.class */
        public static final class C08201 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            int I$0;
            int label;
            final UGCHalfScreenEndPageWidget this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08201(UGCHalfScreenEndPageWidget uGCHalfScreenEndPageWidget, Continuation<? super C08201> continuation) {
                super(2, continuation);
                this.this$0 = uGCHalfScreenEndPageWidget;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08201 c08201 = new C08201(this.this$0, continuation);
                c08201.I$0 = ((Number) obj).intValue();
                return c08201;
            }

            public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                UGCHalfScreenEndPageWidget uGCHalfScreenEndPageWidget = this.this$0;
                C2975n c2975n = uGCHalfScreenEndPageWidget.f96509u;
                if (c2975n != null) {
                    int iAbs = Math.abs(i7);
                    if (uGCHalfScreenEndPageWidget.f96508t == 0) {
                        uGCHalfScreenEndPageWidget.f96508t = uGCHalfScreenEndPageWidget.h.f102262n;
                    }
                    int i8 = uGCHalfScreenEndPageWidget.f96508t;
                    float f7 = i8 == 0 ? 0.0f : iAbs / i8;
                    float interpolation = uGCHalfScreenEndPageWidget.f96512x.getInterpolation(f7);
                    int i9 = (int) (uGCHalfScreenEndPageWidget.f96510v * interpolation);
                    int i10 = (int) (uGCHalfScreenEndPageWidget.f96511w * interpolation);
                    float f8 = 1.0f - f7;
                    int iCoerceAtMost = RangesKt.coerceAtMost(i10 + i9, uGCHalfScreenEndPageWidget.f96507s);
                    int iCoerceAtMost2 = RangesKt.coerceAtMost(i9, uGCHalfScreenEndPageWidget.f96506r);
                    GeminiEndPageThumbRelativeNewWidget geminiEndPageThumbRelativeNewWidget = c2975n.f25943e;
                    geminiEndPageThumbRelativeNewWidget.setAlpha(f8);
                    geminiEndPageThumbRelativeNewWidget.setTranslationY(-iCoerceAtMost2);
                    c2975n.f25940b.setAlpha(f8);
                    c2975n.f25940b.setTranslationY(-iCoerceAtMost);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCHalfScreenEndPageWidget uGCHalfScreenEndPageWidget, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCHalfScreenEndPageWidget;
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
                this.this$0.f96499k.hide();
                UGCHalfScreenEndPageWidget uGCHalfScreenEndPageWidget = this.this$0;
                StateFlow<Integer> stateFlow = uGCHalfScreenEndPageWidget.h.f102255f;
                C08201 c08201 = new C08201(uGCHalfScreenEndPageWidget, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c08201, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCHalfScreenEndPageWidget$a.class */
    public static final class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UGCHalfScreenEndPageWidget f96513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f96514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f96515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Function0<Unit> f96516d;

        public a(UGCHalfScreenEndPageWidget uGCHalfScreenEndPageWidget, float f7, float f8, Function0<Unit> function0) {
            this.f96513a = uGCHalfScreenEndPageWidget;
            this.f96514b = f7;
            this.f96515c = f8;
            this.f96516d = function0;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            View view = this.f96513a.f96502n;
            if (view != null) {
                view.setAlpha(this.f96515c);
            }
            View view2 = this.f96513a.f96502n;
            if (view2 != null) {
                view2.setLayerType(0, null);
            }
            Function0<Unit> function0 = this.f96516d;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            View view = this.f96513a.f96502n;
            if (view != null) {
                view.setAlpha(this.f96514b);
            }
            View view2 = this.f96513a.f96502n;
            if (view2 != null) {
                view2.setLayerType(2, null);
            }
        }
    }

    @Inject
    public UGCHalfScreenEndPageWidget(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull IControlContainerService iControlContainerService) {
        super(context);
        this.f96493d = context;
        this.f96494e = coroutineScope;
        this.f96495f = hVar;
        this.f96496g = uGCEndPageRelatedRecommendService;
        this.h = pageNestedScrollFusionRepository;
        this.f96497i = theseusPageUIStyleRepository;
        this.f96498j = aVar;
        this.f96499k = iControlContainerService;
        this.f96500l = a.a.b.a;
        this.f96505q = 250L;
        this.f96506r = DimenUtilsKt.dpToPx(20.0f);
        this.f96507s = DimenUtilsKt.dpToPx(103.0f);
        this.f96510v = DimenUtilsKt.dpToPx(20.0f);
        this.f96511w = DimenUtilsKt.dpToPx(45.0f);
        this.f96512x = new DecelerateInterpolator(1.5f);
        if (theseusPageUIStyleRepository.f103504n) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        }
    }

    public static final Object i(UGCHalfScreenEndPageWidget uGCHalfScreenEndPageWidget, UIComponent uIComponent, ViewGroup viewGroup, Continuation continuation) {
        uGCHalfScreenEndPageWidget.getClass();
        viewGroup.removeAllViews();
        UIComponent.ViewEntry viewEntryCreateViewEntry = uIComponent.createViewEntry(uGCHalfScreenEndPageWidget.f96493d, viewGroup);
        View root = viewEntryCreateViewEntry.getRoot();
        uGCHalfScreenEndPageWidget.f96502n = root;
        if ((root != null ? root.getParent() : null) == null) {
            viewGroup.addView(uGCHalfScreenEndPageWidget.f96502n);
        }
        Object objBindToView = uIComponent.bindToView(viewEntryCreateViewEntry, continuation);
        if (objBindToView != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objBindToView = Unit.INSTANCE;
        }
        return objBindToView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@NotNull com.bilibili.ogv.infra.util.f fVar) {
        UIComponent uIComponent;
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        GeminiEndPageThumbRelativeNewWidget geminiEndPageThumbRelativeNewWidget = this.f96503o;
        if (geminiEndPageThumbRelativeNewWidget == null || (uIComponent = (UIComponent) CollectionsKt.firstOrNull(fVar)) == null || (lifecycleOwner = ViewTreeLifecycleOwner.get(geminiEndPageThumbRelativeNewWidget)) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        Job job = this.f96501m;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f96501m = null;
        AlphaAnimation alphaAnimation = this.f96504p;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
        }
        this.f96501m = BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new UGCHalfScreenEndPageWidget$updateUIComponents$1(this, uIComponent, geminiEndPageThumbRelativeNewWidget, null), 3, (Object) null);
    }

    public final a.a getContainerType() {
        return this.f96500l;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(false, false, true, false, false);
        builderA.changeOrientationDisableWhenShow(false);
        return builderA.build();
    }

    public final void k(float f7, float f8, Function0<Unit> function0) {
        if (this.f96502n == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f7, f8);
        alphaAnimation.setDuration(this.f96505q);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new a(this, f7, f8, function0));
        this.f96504p = alphaAnimation;
        View view = this.f96502n;
        if (view != null) {
            view.startAnimation(alphaAnimation);
        }
    }

    @NotNull
    public final View onCreateContentView(@NotNull Context context) {
        boolean z6 = this.f96497i.f103504n;
        UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService = this.f96496g;
        if (!z6 || this.f96498j.f()) {
            C2974m c2974mInflate = C2974m.inflate(LayoutInflater.from(context));
            c2974mInflate.f25937b.setReplayHandle(new GeminiPlayerReplayWidget.a(this) { // from class: com.bilibili.ship.theseus.ugc.endpage.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UGCHalfScreenEndPageWidget f96600a;

                {
                    this.f96600a = this;
                }

                public final void replay() {
                    UGCHalfScreenEndPageWidget uGCHalfScreenEndPageWidget = this.f96600a;
                    BuildersKt.launch$default(uGCHalfScreenEndPageWidget.f96494e, (CoroutineContext) null, (CoroutineStart) null, new UGCHalfScreenEndPageWidget$onCreateContentView$2$1(uGCHalfScreenEndPageWidget, null), 3, (Object) null);
                }
            });
            this.f96503o = c2974mInflate.f25938c;
            uGCEndPageRelatedRecommendService.a(this, UGCHalfScreenEndPageWidget.class.getName());
            return c2974mInflate.f25936a;
        }
        C2975n c2975nInflate = C2975n.inflate(LayoutInflater.from(context));
        c2975nInflate.f25942d.setReplayHandle(new GeminiPlayerReplayWidget.a(this) { // from class: com.bilibili.ship.theseus.ugc.endpage.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UGCHalfScreenEndPageWidget f96591a;

            {
                this.f96591a = this;
            }

            public final void replay() {
                UGCHalfScreenEndPageWidget uGCHalfScreenEndPageWidget = this.f96591a;
                BuildersKt.launch$default(uGCHalfScreenEndPageWidget.f96494e, (CoroutineContext) null, (CoroutineStart) null, new UGCHalfScreenEndPageWidget$onCreateContentView$1$1(uGCHalfScreenEndPageWidget, null), 3, (Object) null);
            }
        });
        this.f96509u = c2975nInflate;
        this.f96503o = c2975nInflate.f25943e;
        uGCEndPageRelatedRecommendService.a(this, UGCHalfScreenEndPageWidget.class.getName());
        return c2975nInflate.f25939a;
    }

    public final void onRelease() {
        Job job = this.f96501m;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f96501m = null;
        AlphaAnimation alphaAnimation = this.f96504p;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
        }
        GeminiEndPageThumbRelativeNewWidget geminiEndPageThumbRelativeNewWidget = this.f96503o;
        if (geminiEndPageThumbRelativeNewWidget != null) {
            geminiEndPageThumbRelativeNewWidget.setLayerType(0, null);
        }
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        this.f96496g.h(UGCHalfScreenEndPageWidget.class.getName());
    }
}
