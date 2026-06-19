package com.bilibili.ship.theseus.united.page.toolbar;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import javax.inject.Inject;
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
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup.class */
@StabilityInferred(parameters = 0)
public final class ToolbarSetup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C6417a f103309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f103310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C6420d f103311c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final TheseusCastScreenRepository $castScreenRepo;
        final PageNestedScrollFusionRepository $pageNestedScrollFusionRepository;
        final com.bilibili.ship.theseus.united.page.playingarea.i $playingAreaOccupationRepository;
        final ToolbarRepository $toolbarRepository;
        int label;
        final ToolbarSetup this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$1$1.class */
        public static final class C11321 extends SuspendLambda implements Function6<Boolean, Boolean, Boolean, Boolean, Boolean, Continuation<? super Boolean>, Object> {
            boolean Z$0;
            boolean Z$1;
            boolean Z$2;
            boolean Z$3;
            boolean Z$4;
            int label;

            public C11321(Continuation<? super C11321> continuation) {
                super(6, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue(), (Continuation<? super Boolean>) obj6);
            }

            public final Object invoke(boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, Continuation<? super Boolean> continuation) {
                C11321 c11321 = new C11321(continuation);
                c11321.Z$0 = z6;
                c11321.Z$1 = z7;
                c11321.Z$2 = z8;
                c11321.Z$3 = z9;
                c11321.Z$4 = z10;
                return c11321.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.Z$0;
                boolean z7 = this.Z$1;
                boolean z8 = this.Z$2;
                boolean z9 = this.Z$3;
                boolean z10 = this.Z$4;
                if (!z9) {
                    z7 = !z8 && !(com.bilibili.playerbizcommonv2.utils.p.d() && z10) && (z6 || z7);
                }
                return Boxing.boxBoolean(z7);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final ToolbarRepository $toolbarRepository;
            boolean Z$0;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$1$2$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$1$2$1.class */
            public static final class C11331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final ToolbarRepository $toolbarRepository;
                private Object L$0;
                int label;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$1$2$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$1$2$1$1.class */
                public static final class C11341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final ToolbarRepository $toolbarRepository;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11341(ToolbarRepository toolbarRepository, Continuation<? super C11341> continuation) {
                        super(2, continuation);
                        this.$toolbarRepository = toolbarRepository;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C11341(this.$toolbarRepository, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            ToolbarRepository toolbarRepository = this.$toolbarRepository;
                            this.label = 1;
                            if (toolbarRepository.i(this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$1$2$1$2, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$1$2$1$2.class */
                public static final class C11352 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final ToolbarRepository $toolbarRepository;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11352(ToolbarRepository toolbarRepository, Continuation<? super C11352> continuation) {
                        super(2, continuation);
                        this.$toolbarRepository = toolbarRepository;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C11352(this.$toolbarRepository, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            ToolbarRepository toolbarRepository = this.$toolbarRepository;
                            this.label = 1;
                            Object objA = toolbarRepository.f103286j.a(this);
                            if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objA = Unit.INSTANCE;
                            }
                            if (objA == coroutine_suspended) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11331(ToolbarRepository toolbarRepository, Continuation<? super C11331> continuation) {
                    super(2, continuation);
                    this.$toolbarRepository = toolbarRepository;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C11331 c11331 = new C11331(this.$toolbarRepository, continuation);
                    c11331.L$0 = obj;
                    return c11331;
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C11341(this.$toolbarRepository, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C11352(this.$toolbarRepository, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ToolbarRepository toolbarRepository, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$toolbarRepository = toolbarRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$toolbarRepository, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.Z$0) {
                        return Unit.INSTANCE;
                    }
                    C11331 c11331 = new C11331(this.$toolbarRepository, null);
                    this.label = 1;
                    if (CoroutineScopeKt.coroutineScope(c11331, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ship.theseus.united.page.playingarea.i iVar, PageNestedScrollFusionRepository pageNestedScrollFusionRepository, TheseusCastScreenRepository theseusCastScreenRepository, ToolbarSetup toolbarSetup, ToolbarRepository toolbarRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$playingAreaOccupationRepository = iVar;
            this.$pageNestedScrollFusionRepository = pageNestedScrollFusionRepository;
            this.$castScreenRepo = theseusCastScreenRepository;
            this.this$0 = toolbarSetup;
            this.$toolbarRepository = toolbarRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$playingAreaOccupationRepository, this.$pageNestedScrollFusionRepository, this.$castScreenRepo, this.this$0, this.$toolbarRepository, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> stateFlow = this.$playingAreaOccupationRepository.f102367c;
                StateFlow<Boolean> stateFlow2 = this.$pageNestedScrollFusionRepository.f102266r;
                TheseusCastScreenRepository$special$$inlined$map$1 theseusCastScreenRepository$special$$inlined$map$1 = new TheseusCastScreenRepository$special$$inlined$map$1(this.$castScreenRepo.f99126c);
                ToolbarSetup toolbarSetup = this.this$0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(stateFlow, stateFlow2, theseusCastScreenRepository$special$$inlined$map$1, toolbarSetup.f103309a.f103315a.f104859b, toolbarSetup.f103311c.f103384a.f104859b, new C11321(null)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$toolbarRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PageNestedScrollFusionRepository $pageNestedScrollFusionRepository;
        final com.bilibili.ship.theseus.keel.player.h $player;
        final ToolbarRepository $toolbarRepository;
        int label;
        final ToolbarSetup this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$2$1.class */
        public static final class AnonymousClass1<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.bilibili.ship.theseus.keel.player.h f103312a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ToolbarSetup f103313b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final PageNestedScrollFusionRepository f103314c;

            public AnonymousClass1(com.bilibili.ship.theseus.keel.player.h hVar, ToolbarSetup toolbarSetup, PageNestedScrollFusionRepository pageNestedScrollFusionRepository) {
                this.f103312a = hVar;
                this.f103313b = toolbarSetup;
                this.f103314c = pageNestedScrollFusionRepository;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(kotlin.Unit r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    r0 = r7
                    boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$2$1$emit$1
                    if (r0 == 0) goto L23
                    r0 = r7
                    com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$2$1$emit$1 r0 = (com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$2$1$emit$1) r0
                    r6 = r0
                    r0 = r6
                    int r0 = r0.label
                    r8 = r0
                    r0 = r8
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r0 & r1
                    if (r0 == 0) goto L23
                    r0 = r6
                    r1 = r8
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    int r1 = r1 + r2
                    r0.label = r1
                    goto L2d
                L23:
                    com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$2$1$emit$1 r0 = new com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$2$1$emit$1
                    r1 = r0
                    r2 = r5
                    r3 = r7
                    r1.<init>(r2, r3)
                    r6 = r0
                L2d:
                    r0 = r6
                    java.lang.Object r0 = r0.result
                    r9 = r0
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r7 = r0
                    r0 = r6
                    int r0 = r0.label
                    r8 = r0
                    r0 = r8
                    if (r0 == 0) goto L57
                    r0 = r8
                    r1 = 1
                    if (r0 != r1) goto L4d
                    r0 = r9
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto L97
                L4d:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L57:
                    r0 = r9
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r5
                    com.bilibili.ship.theseus.keel.player.h r0 = r0.f103312a
                    r9 = r0
                    r0 = r9
                    r0.p()
                    r0 = r5
                    com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup r0 = r0.f103313b
                    tv.danmaku.biliplayerv2.service.IPlayerCoreService r0 = r0.f103310b
                    int r0 = r0.getState()
                    r1 = 6
                    if (r0 != r1) goto L97
                    r0 = r9
                    com.bilibili.ship.theseus.keel.player.j r0 = r0.j()
                    r9 = r0
                    r0 = r9
                    if (r0 == 0) goto L97
                    r0 = r6
                    r1 = 1
                    r0.label = r1
                    r0 = r9
                    r1 = r6
                    java.lang.Object r0 = r0.a(r1)
                    r1 = r7
                    if (r0 != r1) goto L97
                    r0 = r7
                    return r0
                L97:
                    r0 = r5
                    com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository r0 = r0.f103314c
                    r1 = 1
                    r2 = 0
                    r0.e(r1, r2)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup.AnonymousClass2.AnonymousClass1.emit(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ToolbarRepository toolbarRepository, com.bilibili.ship.theseus.keel.player.h hVar, ToolbarSetup toolbarSetup, PageNestedScrollFusionRepository pageNestedScrollFusionRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$toolbarRepository = toolbarRepository;
            this.$player = hVar;
            this.this$0 = toolbarSetup;
            this.$pageNestedScrollFusionRepository = pageNestedScrollFusionRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$toolbarRepository, this.$player, this.this$0, this.$pageNestedScrollFusionRepository, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<Unit> mutableSharedFlow = this.$toolbarRepository.f103294r;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$player, this.this$0, this.$pageNestedScrollFusionRepository);
                this.label = 1;
                if (mutableSharedFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final PageNestedScrollFusionRepository $pageNestedScrollFusionRepository;
        final com.bilibili.ship.theseus.keel.player.h $player;
        final ToolbarRepository $toolbarRepository;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
            boolean Z$0;
            boolean Z$1;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Boolean>) obj3);
            }

            public final Object invoke(boolean z6, boolean z7, Continuation<? super Boolean> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = z6;
                anonymousClass1.Z$1 = z7;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.Z$0 && !this.Z$1);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$3$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$3$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final ToolbarRepository $toolbarRepository;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ToolbarRepository toolbarRepository, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$toolbarRepository = toolbarRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$toolbarRepository, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.Z$0) {
                        ToolbarRepository toolbarRepository = this.$toolbarRepository;
                        this.label = 1;
                        Object objA = toolbarRepository.f103287k.a(this);
                        if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objA = Unit.INSTANCE;
                        }
                        if (objA == coroutine_suspended) {
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
        public AnonymousClass3(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, com.bilibili.ship.theseus.keel.player.h hVar, ToolbarRepository toolbarRepository, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$pageNestedScrollFusionRepository = pageNestedScrollFusionRepository;
            this.$player = hVar;
            this.$toolbarRepository = toolbarRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$pageNestedScrollFusionRepository, this.$player, this.$toolbarRepository, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(this.$pageNestedScrollFusionRepository.f102266r, CompoundPlayStateProviderKt.b(this.$player), new AnonymousClass1(null)));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$toolbarRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final StateFlow<Boolean> $lessonsModeFlow;
        final StateFlow<Boolean> $teenagerModeFlow;
        final ToolbarRepository $toolbarRepository;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$4$1.class */
        public static final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object>, SuspendFunction {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(3, Boolean.TYPE, "or", "or(Z)Z", 4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Boolean>) obj3);
            }

            public final Object invoke(boolean z6, boolean z7, Continuation<? super Boolean> continuation) {
                return AnonymousClass4.invokeSuspend$or(z6, z7, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$4$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$4$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final ToolbarRepository $toolbarRepository;
            boolean Z$0;
            int label;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$4$2$1, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$4$2$1.class */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final ToolbarRepository $toolbarRepository;
                private Object L$0;
                int label;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$4$2$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$4$2$1$1.class */
                public static final class C11361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final ToolbarRepository $toolbarRepository;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11361(ToolbarRepository toolbarRepository, Continuation<? super C11361> continuation) {
                        super(2, continuation);
                        this.$toolbarRepository = toolbarRepository;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C11361(this.$toolbarRepository, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            ToolbarRepository toolbarRepository = this.$toolbarRepository;
                            this.label = 1;
                            Object objA = toolbarRepository.f103286j.a(this);
                            if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objA = Unit.INSTANCE;
                            }
                            if (objA == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.ToolbarSetup$4$2$1$2, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/ToolbarSetup$4$2$1$2.class */
                public static final class C11372 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final ToolbarRepository $toolbarRepository;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C11372(ToolbarRepository toolbarRepository, Continuation<? super C11372> continuation) {
                        super(2, continuation);
                        this.$toolbarRepository = toolbarRepository;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C11372(this.$toolbarRepository, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            ToolbarRepository toolbarRepository = this.$toolbarRepository;
                            this.label = 1;
                            if (toolbarRepository.h(this) == coroutine_suspended) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ToolbarRepository toolbarRepository, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$toolbarRepository = toolbarRepository;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$toolbarRepository, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C11361(this.$toolbarRepository, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C11372(this.$toolbarRepository, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ToolbarRepository toolbarRepository, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$toolbarRepository = toolbarRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$toolbarRepository, continuation);
                anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.Z$0) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$toolbarRepository, null);
                        this.label = 1;
                        if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
        public AnonymousClass4(StateFlow<Boolean> stateFlow, StateFlow<Boolean> stateFlow2, ToolbarRepository toolbarRepository, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$teenagerModeFlow = stateFlow;
            this.$lessonsModeFlow = stateFlow2;
            this.$toolbarRepository = toolbarRepository;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$or(boolean z6, boolean z7, Continuation continuation) {
            return Boxing.boxBoolean(z6 | z7);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$teenagerModeFlow, this.$lessonsModeFlow, this.$toolbarRepository, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(this.$teenagerModeFlow, this.$lessonsModeFlow, AnonymousClass1.INSTANCE);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$toolbarRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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
    public ToolbarSetup(@NotNull ToolbarRepository toolbarRepository, @NotNull com.bilibili.ship.theseus.united.page.playingarea.i iVar, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull C6417a c6417a, @NotNull StateFlow<Boolean> stateFlow, @NotNull StateFlow<Boolean> stateFlow2, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull C6420d c6420d) {
        this.f103309a = c6417a;
        this.f103310b = iPlayerCoreService;
        this.f103311c = c6420d;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(iVar, pageNestedScrollFusionRepository, theseusCastScreenRepository, this, toolbarRepository, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(toolbarRepository, hVar, this, pageNestedScrollFusionRepository, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(pageNestedScrollFusionRepository, hVar, toolbarRepository, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(stateFlow2, stateFlow, toolbarRepository, null), 3, (Object) null);
    }
}
