package com.bilibili.ship.theseus.united.page.playingarea;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collect16x9Lock$1.class */
final class PlayingAreaCompoundServiceImpl$collect16x9Lock$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PlayingAreaCompoundServiceImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collect16x9Lock$1$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collect16x9Lock$1$3.class */
    public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<WindowSizeClass, Pair<? extends Integer, ? extends Integer>, Continuation<? super Pair<? extends WindowSizeClass, ? extends Pair<? extends Integer, ? extends Integer>>>, Object>, SuspendFunction {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(WindowSizeClass windowSizeClass, Pair<Integer, Integer> pair, Continuation<? super Pair<WindowSizeClass, Pair<Integer, Integer>>> continuation) {
            return PlayingAreaCompoundServiceImpl$collect16x9Lock$1.invokeSuspend$lambda$0(windowSizeClass, pair, continuation);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends WindowSizeClass, ? extends Pair<? extends Integer, ? extends Integer>>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final PlayingAreaCompoundServiceImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlayingAreaCompoundServiceImpl this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1$1.class */
            public static final class C10891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final PlayingAreaCompoundServiceImpl this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1$1$1.class */
                public static final class C10901 extends SuspendLambda implements Function2<PageNestedScrollFusionRepository.b, Continuation<? super Boolean>, Object> {
                    Object L$0;
                    int label;

                    public C10901(Continuation<? super C10901> continuation) {
                        super(2, continuation);
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C10901 c10901 = new C10901(continuation);
                        c10901.L$0 = obj;
                        return c10901;
                    }

                    public final Object invoke(PageNestedScrollFusionRepository.b bVar, Continuation<? super Boolean> continuation) {
                        return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(((PageNestedScrollFusionRepository.b) this.L$0) instanceof PageNestedScrollFusionRepository.b.c);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10891(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super C10891> continuation) {
                    super(2, continuation);
                    this.this$0 = playingAreaCompoundServiceImpl;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10891(this.this$0, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r7 = r0
                        r0 = r4
                        int r0 = r0.label
                        r6 = r0
                        r0 = r6
                        if (r0 == 0) goto L3b
                        r0 = r6
                        r1 = 1
                        if (r0 == r1) goto L34
                        r0 = r6
                        r1 = 2
                        if (r0 == r1) goto L2d
                        r0 = r6
                        r1 = 3
                        if (r0 != r1) goto L23
                        r0 = r5
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto Lb4
                    L23:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L2d:
                        r0 = r5
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L90
                    L34:
                        r0 = r5
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L4e
                    L3b:
                        r0 = r5
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r4
                        r1 = 1
                        r0.label = r1
                        r0 = r4
                        java.lang.Object r0 = kotlinx.coroutines.YieldKt.yield(r0)
                        r1 = r7
                        if (r0 != r1) goto L4e
                        r0 = r7
                        return r0
                    L4e:
                        java.lang.String r0 = "[theseus-united-PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1$1-invokeSuspend] "
                        r1 = r4
                        com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl r1 = r1.this$0
                        com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository r1 = r1.f102306b
                        kotlinx.coroutines.flow.StateFlow<com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$b> r1 = r1.h
                        java.lang.Object r1 = r1.getValue()
                        java.lang.String r2 = "await first shrunk start, current "
                        java.lang.String r1 = Fp.c.b(r1, r2)
                        java.lang.String r2 = "PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1$1-invokeSuspend"
                        defpackage.a.b(r0, r1, r2)
                        r0 = r4
                        com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl r0 = r0.this$0
                        com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository r0 = r0.f102306b
                        kotlinx.coroutines.flow.StateFlow<com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$b> r0 = r0.h
                        r5 = r0
                        com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1$1$1 r0 = new com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1$1$1
                        r1 = r0
                        r2 = 0
                        r1.<init>(r2)
                        r8 = r0
                        r0 = r4
                        r1 = 2
                        r0.label = r1
                        r0 = r5
                        r1 = r8
                        r2 = r4
                        java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.first(r0, r1, r2)
                        r1 = r7
                        if (r0 != r1) goto L90
                        r0 = r7
                        return r0
                    L90:
                        java.lang.String r0 = "PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1$1-invokeSuspend"
                        java.lang.String r1 = "[theseus-united-PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1$1-invokeSuspend] await first shrunk end"
                        tv.danmaku.android.log.BLog.i(r0, r1)
                        r0 = r4
                        com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl r0 = r0.this$0
                        r5 = r0
                        r0 = r5
                        r1 = 0
                        r0.f102321r = r1
                        r0 = r5
                        com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl.m(r0)
                        r0 = r4
                        r1 = 3
                        r0.label = r1
                        r0 = r4
                        java.lang.Object r0 = kotlinx.coroutines.YieldKt.yield(r0)
                        r1 = r7
                        if (r0 != r1) goto Lb4
                        r0 = r7
                        return r0
                    Lb4:
                        r0 = r4
                        com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl r0 = r0.this$0
                        com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository r0 = r0.f102306b
                        r1 = 1
                        r2 = 1
                        r0.e(r1, r2)
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collect16x9Lock$1.AnonymousClass4.AnonymousClass1.C10891.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1$2.class */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final PlayingAreaCompoundServiceImpl this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1$2$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1$2$1.class */
                public static final class C10911 extends SuspendLambda implements Function2<PageNestedScrollFusionRepository.b, Continuation<? super Boolean>, Object> {
                    Object L$0;
                    int label;

                    public C10911(Continuation<? super C10911> continuation) {
                        super(2, continuation);
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C10911 c10911 = new C10911(continuation);
                        c10911.L$0 = obj;
                        return c10911;
                    }

                    public final Object invoke(PageNestedScrollFusionRepository.b bVar, Continuation<? super Boolean> continuation) {
                        return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(((PageNestedScrollFusionRepository.b) this.L$0) instanceof PageNestedScrollFusionRepository.b.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = playingAreaCompoundServiceImpl;
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
                        this.label = 1;
                        if (YieldKt.yield(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl = this.this$0;
                            playingAreaCompoundServiceImpl.f102321r = false;
                            PlayingAreaCompoundServiceImpl.m(playingAreaCompoundServiceImpl);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    StateFlow<PageNestedScrollFusionRepository.b> stateFlow = this.this$0.f102306b.h;
                    C10911 c10911 = new C10911(null);
                    this.label = 2;
                    if (FlowKt.first(stateFlow, c10911, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl2 = this.this$0;
                    playingAreaCompoundServiceImpl2.f102321r = false;
                    PlayingAreaCompoundServiceImpl.m(playingAreaCompoundServiceImpl2);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playingAreaCompoundServiceImpl;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return create(bool, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Boolean bool = (Boolean) this.L$0;
                defpackage.a.b("[theseus-united-PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1-invokeSuspend] ", "lock 16x9 state change to: " + bool, "PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1-invokeSuspend");
                if (bool == null) {
                    return Unit.INSTANCE;
                }
                if (bool.booleanValue()) {
                    PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl = this.this$0;
                    float f7 = 1.7777778f;
                    if (playingAreaCompoundServiceImpl.f102316m.h()) {
                        float fIntValue = ((Number) this.this$0.f102307c.d().getFirst()).intValue();
                        float fIntValue2 = (((Number) r0.getSecond()).intValue() / 2) - this.this$0.f102314k.f103507q;
                        f7 = 1.7777778f;
                        if (fIntValue2 > 0.0f) {
                            f7 = fIntValue <= 0.0f ? 1.7777778f : fIntValue / fIntValue2;
                        }
                    }
                    playingAreaCompoundServiceImpl.p(f7);
                } else {
                    PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl2 = this.this$0;
                    if (playingAreaCompoundServiceImpl2.f102323t) {
                        BLog.i("PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1-invokeSuspend", "[theseus-united-PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1-invokeSuspend] ignore unlock 16x9");
                        return Unit.INSTANCE;
                    }
                    if (((Boolean) playingAreaCompoundServiceImpl2.f102309e.f102366b.getValue()).booleanValue()) {
                        BLog.i("PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1-invokeSuspend", "[theseus-united-PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4$1-invokeSuspend] in occupied state, do not change");
                        return Unit.INSTANCE;
                    }
                    PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl3 = this.this$0;
                    playingAreaCompoundServiceImpl3.f102321r = true;
                    playingAreaCompoundServiceImpl3.g();
                    PlayingAreaDescription playingAreaDescriptionA = this.this$0.f102310f.a();
                    if (playingAreaDescriptionA == null || !PlayingAreaCompoundServiceImpl.k(this.this$0, playingAreaDescriptionA)) {
                        PlayingAreaDescription playingAreaDescriptionA2 = this.this$0.f102310f.a();
                        if (playingAreaDescriptionA2 != null && playingAreaDescriptionA2.f102327b == PlayingAreaDescription.Direction.Horizontal) {
                            PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl4 = this.this$0;
                            playingAreaCompoundServiceImpl4.f102306b.g(playingAreaCompoundServiceImpl4.f102316m.h() || !CompoundPlayStateProviderKt.a(this.this$0.f102311g));
                            PlayingAreaCompoundServiceImpl.m(this.this$0);
                            this.this$0.f102306b.e(true, false);
                            PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl5 = this.this$0;
                            BuildersKt.launch$default(playingAreaCompoundServiceImpl5.f102305a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(playingAreaCompoundServiceImpl5, null), 3, (Object) null);
                        }
                    } else {
                        this.this$0.f102306b.g(true);
                        PlayingAreaCompoundServiceImpl.m(this.this$0);
                        this.this$0.f102306b.e(false, false);
                        PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl6 = this.this$0;
                        BuildersKt.launch$default(playingAreaCompoundServiceImpl6.f102305a, (CoroutineContext) null, (CoroutineStart) null, new C10891(playingAreaCompoundServiceImpl6, null), 3, (Object) null);
                    }
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
                defpackage.a.b("[theseus-united-PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4-invokeSuspend] ", "rootSize changed: " + ((Pair) ((Pair) this.L$0).component2()), "PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4-invokeSuspend");
                if (this.this$0.f102316m.f()) {
                    BLog.i("PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4-invokeSuspend", "[theseus-united-PlayingAreaCompoundServiceImpl$collect16x9Lock$1$4-invokeSuspend] large screen, ignore 16x9 lock");
                } else {
                    PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl = this.this$0;
                    MutableStateFlow<Boolean> mutableStateFlow = playingAreaCompoundServiceImpl.f102319p;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(playingAreaCompoundServiceImpl, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public PlayingAreaCompoundServiceImpl$collect16x9Lock$1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super PlayingAreaCompoundServiceImpl$collect16x9Lock$1> continuation) {
        super(2, continuation);
        this.this$0 = playingAreaCompoundServiceImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$lambda$0(WindowSizeClass windowSizeClass, Pair pair, Continuation continuation) {
        return new Pair(windowSizeClass, pair);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayingAreaCompoundServiceImpl$collect16x9Lock$1(this.this$0, continuation);
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
