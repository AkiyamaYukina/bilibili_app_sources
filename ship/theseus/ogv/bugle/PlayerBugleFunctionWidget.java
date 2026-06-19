package com.bilibili.ship.theseus.ogv.bugle;

import ZS0.t0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.bilibili.ad.core.click.K;
import com.bilibili.compose.theme.BiliThemeKt;
import com.bilibili.compose.theme.ThemeStrategy;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.injection.InjectPlayerService;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreServiceKtxKt;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/bugle/PlayerBugleFunctionWidget.class */
@StabilityInferred(parameters = 0)
public final class PlayerBugleFunctionWidget extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InjectPlayerService
    private AbsFunctionWidgetService f91614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InjectPlayerService
    private IPlayerCoreService f91615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ValueAnimator f91616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f91617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public ComposeView f91618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Job f91620g;

    @NotNull
    public final MutableState<Boolean> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f91621i;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/bugle/PlayerBugleFunctionWidget$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends AbsFunctionWidget.Configuration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final com.bilibili.ship.theseus.ogv.bugle.a f91622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f91623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f91624c;

        public a(@NotNull com.bilibili.ship.theseus.ogv.bugle.a aVar, boolean z6, boolean z7) {
            this.f91622a = aVar;
            this.f91623b = z6;
            this.f91624c = z7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/bugle/PlayerBugleFunctionWidget$b.class */
    public static final class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerBugleFunctionWidget f91625a;

        public b(PlayerBugleFunctionWidget playerBugleFunctionWidget) {
            this.f91625a = playerBugleFunctionWidget;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            view.removeOnLayoutChangeListener(this);
            ComposeView composeView = this.f91625a.f91618e;
            if (composeView != null) {
                if (!composeView.isLaidOut() || composeView.isLayoutRequested()) {
                    composeView.addOnLayoutChangeListener(new c(this.f91625a));
                } else {
                    PlayerBugleFunctionWidget playerBugleFunctionWidget = this.f91625a;
                    PlayerBugleFunctionWidget.i(playerBugleFunctionWidget, playerBugleFunctionWidget.f91617d);
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/bugle/PlayerBugleFunctionWidget$c.class */
    public static final class c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerBugleFunctionWidget f91626a;

        public c(PlayerBugleFunctionWidget playerBugleFunctionWidget) {
            this.f91626a = playerBugleFunctionWidget;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            view.removeOnLayoutChangeListener(this);
            PlayerBugleFunctionWidget playerBugleFunctionWidget = this.f91626a;
            PlayerBugleFunctionWidget.i(playerBugleFunctionWidget, playerBugleFunctionWidget.f91617d);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.bugle.PlayerBugleFunctionWidget$onWidgetShow$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/bugle/PlayerBugleFunctionWidget$onWidgetShow$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayerBugleFunctionWidget this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.bugle.PlayerBugleFunctionWidget$onWidgetShow$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/bugle/PlayerBugleFunctionWidget$onWidgetShow$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerBugleFunctionWidget f91627a;

            public a(PlayerBugleFunctionWidget playerBugleFunctionWidget) {
                this.f91627a = playerBugleFunctionWidget;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f91627a.k(((Number) obj).intValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlayerBugleFunctionWidget playerBugleFunctionWidget, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playerBugleFunctionWidget;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                IPlayerCoreService iPlayerCoreService = this.this$0.f91615b;
                IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
                if (iPlayerCoreService == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
                    iPlayerCoreService2 = null;
                }
                Flow flowE = IPlayerCoreServiceKtxKt.e(iPlayerCoreService2);
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowE.collect(aVar, this) == coroutine_suspended) {
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

    public PlayerBugleFunctionWidget(@NotNull Context context) {
        super(context);
        this.f91619f = K.a((Job) null, 1, (Object) null, Dispatchers.getMain().getImmediate());
        this.h = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f91621i = true;
    }

    public static final void i(final PlayerBugleFunctionWidget playerBugleFunctionWidget, float f7) {
        ComposeView composeView = playerBugleFunctionWidget.f91618e;
        if (composeView == null) {
            return;
        }
        long j7 = (long) ((1.0f - f7) * 8000);
        IPlayerCoreService iPlayerCoreService = null;
        if (j7 <= 0) {
            AbsFunctionWidgetService absFunctionWidgetService = playerBugleFunctionWidget.f91614a;
            if (absFunctionWidgetService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("functionWidgetService");
                absFunctionWidgetService = null;
            }
            absFunctionWidgetService.hideWidget(playerBugleFunctionWidget.getToken());
            return;
        }
        composeView.setVisibility(playerBugleFunctionWidget.f91621i ? 0 : 4);
        playerBugleFunctionWidget.f91617d = f7;
        playerBugleFunctionWidget.l();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f7, 1.0f);
        valueAnimatorOfFloat.setDuration(j7);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(playerBugleFunctionWidget) { // from class: com.bilibili.ship.theseus.ogv.bugle.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerBugleFunctionWidget f91646a;

            {
                this.f91646a = playerBugleFunctionWidget;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PlayerBugleFunctionWidget playerBugleFunctionWidget2 = this.f91646a;
                playerBugleFunctionWidget2.f91617d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                playerBugleFunctionWidget2.l();
            }
        });
        valueAnimatorOfFloat.addListener(new e(playerBugleFunctionWidget));
        valueAnimatorOfFloat.start();
        playerBugleFunctionWidget.f91616c = valueAnimatorOfFloat;
        IPlayerCoreService iPlayerCoreService2 = playerBugleFunctionWidget.f91615b;
        if (iPlayerCoreService2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
        } else {
            iPlayerCoreService = iPlayerCoreService2;
        }
        playerBugleFunctionWidget.k(iPlayerCoreService.getState());
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        final ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        composeView.setVisibility(4);
        frameLayout.addView(composeView);
        this.f91618e = composeView;
        frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this, composeView) { // from class: com.bilibili.ship.theseus.ogv.bugle.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerBugleFunctionWidget f91642a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ComposeView f91643b;

            {
                this.f91642a = this;
                this.f91643b = composeView;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                PlayerBugleFunctionWidget playerBugleFunctionWidget = this.f91642a;
                ComposeView composeView2 = this.f91643b;
                int i15 = i9 - i7;
                if (i15 > 0 && i15 != i13 - i11) {
                    playerBugleFunctionWidget.l();
                }
                int i16 = i10 - i8;
                if (i16 <= 0 || i16 == i14 - i12) {
                    return;
                }
                composeView2.setTranslationY(i16 * 0.25f);
            }
        });
        return frameLayout;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        return new FunctionWidgetConfig.Builder().dismissWhenVideoChange(false).dismissWhenScreenModeChange(false).persistent(false).build();
    }

    public final void k(int i7) {
        ComposeView composeView = this.f91618e;
        if (composeView == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f91616c;
        if (valueAnimator == null) {
            int i8 = 0;
            if (!this.f91621i) {
                i8 = 4;
            }
            composeView.setVisibility(i8);
            return;
        }
        if (!this.f91621i) {
            composeView.setVisibility(4);
            if (!valueAnimator.isRunning() || valueAnimator.isPaused()) {
                return;
            }
            valueAnimator.pause();
            return;
        }
        composeView.setVisibility(0);
        if (i7 == 4) {
            if (valueAnimator.isPaused()) {
                valueAnimator.resume();
            }
        } else {
            if (!valueAnimator.isRunning() || valueAnimator.isPaused()) {
                return;
            }
            valueAnimator.pause();
        }
    }

    public final void l() {
        ComposeView composeView = this.f91618e;
        if (composeView == null) {
            return;
        }
        int width = getView().getWidth();
        int width2 = composeView.getWidth();
        if (width <= 0 || width2 <= 0) {
            return;
        }
        float f7 = width;
        composeView.setTranslationX((((-width2) - f7) * this.f91617d) + f7);
    }

    public final void onConfigurationChanged(@NotNull AbsFunctionWidget.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a aVar = configuration instanceof a ? (a) configuration : null;
        if (aVar == null) {
            return;
        }
        this.h.setValue(Boolean.valueOf(aVar.f91623b));
        this.f91621i = aVar.f91624c;
        IPlayerCoreService iPlayerCoreService = this.f91615b;
        if (iPlayerCoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerCoreService");
            iPlayerCoreService = null;
        }
        k(iPlayerCoreService.getState());
    }

    public final void onRelease() {
        CoroutineScopeKt.cancel$default(this.f91619f, (CancellationException) null, 1, (Object) null);
        ValueAnimator valueAnimator = this.f91616c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f91616c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f91616c = null;
    }

    public final void onWidgetDismiss() {
        Job job = this.f91620g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f91620g = null;
        ValueAnimator valueAnimator = this.f91616c;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f91616c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f91616c = null;
        this.f91617d = 0.0f;
        super.onWidgetDismiss();
    }

    public final void onWidgetShow(@Nullable AbsFunctionWidget.Configuration configuration) {
        super.onWidgetShow(configuration);
        a aVar = configuration instanceof a ? (a) configuration : null;
        if (aVar == null) {
            return;
        }
        this.h.setValue(Boolean.valueOf(aVar.f91623b));
        this.f91621i = aVar.f91624c;
        ComposeView composeView = this.f91618e;
        if (composeView != null) {
            final com.bilibili.ship.theseus.ogv.bugle.a aVar2 = aVar.f91622a;
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(501241650, true, new Function2(aVar2, this) { // from class: com.bilibili.ship.theseus.ogv.bugle.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final a f91644a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PlayerBugleFunctionWidget f91645b;

                {
                    this.f91644a = aVar2;
                    this.f91645b = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(501241650, iIntValue, -1, "com.bilibili.ship.theseus.ogv.bugle.PlayerBugleFunctionWidget.onWidgetShow.<anonymous> (PlayerBugleFunctionWidget.kt:120)");
                        }
                        BiliThemeKt.BiliTheme((ThemeStrategy) null, false, ComposableLambdaKt.rememberComposableLambda(-1658343702, true, new t0(1, this.f91644a, this.f91645b), composer, 54), composer, 384, 3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        Job job = this.f91620g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f91620g = BuildersKt.launch$default(this.f91619f, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        View view = getView();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new b(this));
            return;
        }
        ComposeView composeView2 = this.f91618e;
        if (composeView2 != null) {
            if (!composeView2.isLaidOut() || composeView2.isLayoutRequested()) {
                composeView2.addOnLayoutChangeListener(new c(this));
            } else {
                i(this, this.f91617d);
            }
        }
    }
}
