package com.bilibili.ship.theseus.united.page.playingarea;

import J1.M;
import androidx.window.core.layout.WindowSizeClass;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1.class */
final class PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PlayingAreaCompoundServiceImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<WindowSizeClass, Pair<? extends Integer, ? extends Integer>, Continuation<? super Pair<? extends WindowSizeClass, ? extends Pair<? extends Integer, ? extends Integer>>>, Object>, SuspendFunction {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(WindowSizeClass windowSizeClass, Pair<Integer, Integer> pair, Continuation<? super Pair<WindowSizeClass, Pair<Integer, Integer>>> continuation) {
            return PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1.invokeSuspend$lambda$0(windowSizeClass, pair, continuation);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends WindowSizeClass, ? extends Pair<? extends Integer, ? extends Integer>>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final PlayingAreaCompoundServiceImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final Pair<Integer, Integer> $rootSize;
            boolean Z$0;
            int label;
            final PlayingAreaCompoundServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Pair<Integer, Integer> pair, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playingAreaCompoundServiceImpl;
                this.$rootSize = pair;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$rootSize, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                defpackage.a.b("[theseus-united-PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1$4$1-invokeSuspend] ", M.a("with occupied = ", ", enter or exit 16:9 mode", z6), "PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1$4$1-invokeSuspend");
                if (z6) {
                    PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl = this.this$0;
                    float f7 = 1.7777778f;
                    if (playingAreaCompoundServiceImpl.f102316m.h()) {
                        float fIntValue = ((Number) this.$rootSize.getFirst()).intValue();
                        float fIntValue2 = (((Number) this.$rootSize.getSecond()).intValue() / 2) - this.this$0.f102314k.f103507q;
                        f7 = 1.7777778f;
                        if (fIntValue2 > 0.0f) {
                            f7 = fIntValue <= 0.0f ? 1.7777778f : fIntValue / fIntValue2;
                        }
                    }
                    playingAreaCompoundServiceImpl.p(f7);
                } else {
                    Boolean bool = (Boolean) this.this$0.f102319p.getValue();
                    if (bool != null ? bool.booleanValue() : false) {
                        BLog.i("PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1$4$1-invokeSuspend", "[theseus-united-PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1$4$1-invokeSuspend] suppressed, do not unlock");
                        return Unit.INSTANCE;
                    }
                    this.this$0.g();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = playingAreaCompoundServiceImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        public final Object invoke(Pair<WindowSizeClass, Pair<Integer, Integer>> pair, Continuation<? super Unit> continuation) {
            return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                WindowSizeClass windowSizeClass = (WindowSizeClass) pair.component1();
                Pair pair2 = (Pair) pair.component2();
                defpackage.a.b("[theseus-united-PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1$4-invokeSuspend] ", "window size changed: " + windowSizeClass + " " + pair2, "PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1$4-invokeSuspend");
                if (this.this$0.f102316m.f()) {
                    this.this$0.g();
                } else {
                    PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl = this.this$0;
                    StateFlow<Boolean> stateFlow = playingAreaCompoundServiceImpl.f102309e.f102367c;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(playingAreaCompoundServiceImpl, pair2, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1> continuation) {
        super(2, continuation);
        this.this$0 = playingAreaCompoundServiceImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(WindowSizeClass windowSizeClass, Pair pair, Continuation continuation) {
        return new Pair(windowSizeClass, pair);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl = this.this$0;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(playingAreaCompoundServiceImpl.f102316m.f102939c, playingAreaCompoundServiceImpl.f102307c.b(), AnonymousClass3.INSTANCE));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
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
