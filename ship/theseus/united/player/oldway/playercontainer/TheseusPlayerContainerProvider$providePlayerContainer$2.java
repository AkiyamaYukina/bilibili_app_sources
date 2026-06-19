package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.paging.Y;
import com.bilibili.ship.theseus.united.player.oldway.playercontainer.w;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.bili.videopage.common.performance.PerformanceTracerImpl;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.videoplayer.core.videoview.AspectRatio;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/TheseusPlayerContainerProvider$providePlayerContainer$2.class */
final class TheseusPlayerContainerProvider$providePlayerContainer$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    final AspectRatio $initCanvasMode;
    final Lifecycle $lifecycle;
    final com.bilibili.ship.theseus.united.page.performance.a $performanceTracker;
    final PlayerContainer $playerContainer;
    final MutableStateFlow<Boolean> $playerContainerCreatedFlow;
    final Flow<w.a> $viewsFlow;
    int label;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.playercontainer.TheseusPlayerContainerProvider$providePlayerContainer$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/TheseusPlayerContainerProvider$providePlayerContainer$2$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<w.a, Boolean, Continuation<? super Pair<? extends w.a, ? extends Boolean>>, Object>, SuspendFunction {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(w.a aVar, boolean z6, Continuation<? super Pair<w.a, Boolean>> continuation) {
            return TheseusPlayerContainerProvider$providePlayerContainer$2.invokeSuspend$lambda$0(aVar, z6, continuation);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((w.a) obj, ((Boolean) obj2).booleanValue(), (Continuation<? super Pair<w.a, Boolean>>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.playercontainer.TheseusPlayerContainerProvider$providePlayerContainer$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/TheseusPlayerContainerProvider$providePlayerContainer$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends w.a, ? extends Boolean>, Continuation<? super Unit>, Object> {
        final Context $context;
        final AspectRatio $initCanvasMode;
        final Lifecycle $lifecycle;
        final Ref.ObjectRef<View> $panelView;
        final com.bilibili.ship.theseus.united.page.performance.a $performanceTracker;
        final PlayerContainer $playerContainer;
        final Ref.BooleanRef $viewCreated;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.playercontainer.TheseusPlayerContainerProvider$providePlayerContainer$2$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/TheseusPlayerContainerProvider$providePlayerContainer$2$4$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f104768a;

            static {
                int[] iArr = new int[Lifecycle.State.values().length];
                try {
                    iArr[Lifecycle.State.STARTED.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[Lifecycle.State.RESUMED.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                f104768a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Ref.ObjectRef<View> objectRef, PlayerContainer playerContainer, Context context, Ref.BooleanRef booleanRef, com.bilibili.ship.theseus.united.page.performance.a aVar, AspectRatio aspectRatio, Lifecycle lifecycle, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$panelView = objectRef;
            this.$playerContainer = playerContainer;
            this.$context = context;
            this.$viewCreated = booleanRef;
            this.$performanceTracker = aVar;
            this.$initCanvasMode = aspectRatio;
            this.$lifecycle = lifecycle;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$panelView, this.$playerContainer, this.$context, this.$viewCreated, this.$performanceTracker, this.$initCanvasMode, this.$lifecycle, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(Pair<w.a, Boolean> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    w.a aVar = (w.a) pair.component1();
                    boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
                    if (aVar == null) {
                        return Unit.INSTANCE;
                    }
                    if (zBooleanValue) {
                        View view = (View) this.$panelView.element;
                        View viewOnCreateView = view;
                        if (view == null) {
                            viewOnCreateView = this.$playerContainer.onCreateView(LayoutInflater.from(this.$context), aVar.f104782a, (Bundle) null);
                        }
                        this.$panelView.element = viewOnCreateView;
                        ViewParent parent = viewOnCreateView.getParent();
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeView(viewOnCreateView);
                        }
                        aVar.f104782a.addView(viewOnCreateView);
                        Ref.BooleanRef booleanRef = this.$viewCreated;
                        if (booleanRef.element) {
                            int i8 = a.f104768a[this.$lifecycle.getCurrentState().ordinal()];
                            if (i8 == 1) {
                                this.$playerContainer.onPause();
                            } else if (i8 == 2) {
                                this.$playerContainer.onResume();
                            }
                        } else {
                            booleanRef.element = true;
                            this.$playerContainer.onViewCreated(viewOnCreateView, (Bundle) null);
                            this.$performanceTracker.c(PerformanceTracerImpl.Entry.ON_VIEW_CREATED.attach(SystemClock.elapsedRealtime()));
                            AspectRatio aspectRatio = this.$initCanvasMode;
                            if (aspectRatio != null) {
                                this.$playerContainer.getRenderContainerService().setAspectRatio(aspectRatio);
                            }
                        }
                    }
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                if (this.$viewCreated.element) {
                    this.$playerContainer.onDestroyView();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerContainerProvider$providePlayerContainer$2(Flow<w.a> flow, MutableStateFlow<Boolean> mutableStateFlow, PlayerContainer playerContainer, Context context, com.bilibili.ship.theseus.united.page.performance.a aVar, AspectRatio aspectRatio, Lifecycle lifecycle, Continuation<? super TheseusPlayerContainerProvider$providePlayerContainer$2> continuation) {
        super(2, continuation);
        this.$viewsFlow = flow;
        this.$playerContainerCreatedFlow = mutableStateFlow;
        this.$playerContainer = playerContainer;
        this.$context = context;
        this.$performanceTracker = aVar;
        this.$initCanvasMode = aspectRatio;
        this.$lifecycle = lifecycle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(w.a aVar, boolean z6, Continuation continuation) {
        return new Pair(aVar, Boxing.boxBoolean(z6));
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusPlayerContainerProvider$providePlayerContainer$2(this.$viewsFlow, this.$playerContainerCreatedFlow, this.$playerContainer, this.$context, this.$performanceTracker, this.$initCanvasMode, this.$lifecycle, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            Ref.BooleanRef booleanRefA = Y.a(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(this.$viewsFlow, this.$playerContainerCreatedFlow, AnonymousClass3.INSTANCE));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(objectRef, this.$playerContainer, this.$context, booleanRefA, this.$performanceTracker, this.$initCanvasMode, this.$lifecycle, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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
