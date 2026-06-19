package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import com.bilibili.relation.FollowStateEvent;
import com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpComponent;
import com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpService$createRecommendUpComponent$7.class */
final class RecommendUpService$createRecommendUpComponent$7 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final MutableStateFlow<RecommendUpComponent.a> $recommendUpStateFlow;
    int label;
    final RecommendUpService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService$createRecommendUpComponent$7$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpService$createRecommendUpComponent$7$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableStateFlow<RecommendUpComponent.a> $recommendUpStateFlow;
        private Object L$0;
        int label;
        final RecommendUpService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService$createRecommendUpComponent$7$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpService$createRecommendUpComponent$7$1$1.class */
        public static final class C08951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MutableStateFlow<RecommendUpComponent.a> $recommendUpStateFlow;
            int label;
            final RecommendUpService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService$createRecommendUpComponent$7$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpService$createRecommendUpComponent$7$1$1$1.class */
            public static final class C08961 extends SuspendLambda implements Function2<List<? extends RecommendUp>, Continuation<? super Unit>, Object> {
                final MutableStateFlow<RecommendUpComponent.a> $recommendUpStateFlow;
                Object L$0;
                int label;
                final RecommendUpService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08961(MutableStateFlow<RecommendUpComponent.a> mutableStateFlow, RecommendUpService recommendUpService, Continuation<? super C08961> continuation) {
                    super(2, continuation);
                    this.$recommendUpStateFlow = mutableStateFlow;
                    this.this$0 = recommendUpService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08961 c08961 = new C08961(this.$recommendUpStateFlow, this.this$0, continuation);
                    c08961.L$0 = obj;
                    return c08961;
                }

                public final Object invoke(List<RecommendUp> list, Continuation<? super Unit> continuation) {
                    return create(list, continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        Method dump skipped, instruction units count: 312
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService$createRecommendUpComponent$7.AnonymousClass1.C08951.C08961.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08951(RecommendUpService recommendUpService, MutableStateFlow<RecommendUpComponent.a> mutableStateFlow, Continuation<? super C08951> continuation) {
                super(2, continuation);
                this.this$0 = recommendUpService;
                this.$recommendUpStateFlow = mutableStateFlow;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08951(this.this$0, this.$recommendUpStateFlow, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    RecommendUpService recommendUpService = this.this$0;
                    MutableStateFlow mutableStateFlow = recommendUpService.f97805e.f97800g;
                    C08961 c08961 = new C08961(this.$recommendUpStateFlow, recommendUpService, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(mutableStateFlow, c08961, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService$createRecommendUpComponent$7$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpService$createRecommendUpComponent$7$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MutableStateFlow<RecommendUpComponent.a> $recommendUpStateFlow;
            int label;
            final RecommendUpService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService$createRecommendUpComponent$7$1$2$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpService$createRecommendUpComponent$7$1$2$1.class */
            public static final class C08971 extends SuspendLambda implements Function2<RecommendUpRepository.LoadState, Continuation<? super Unit>, Object> {
                final MutableStateFlow<RecommendUpComponent.a> $recommendUpStateFlow;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C08971(MutableStateFlow<RecommendUpComponent.a> mutableStateFlow, Continuation<? super C08971> continuation) {
                    super(2, continuation);
                    this.$recommendUpStateFlow = mutableStateFlow;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C08971 c08971 = new C08971(this.$recommendUpStateFlow, continuation);
                    c08971.L$0 = obj;
                    return c08971;
                }

                public final Object invoke(RecommendUpRepository.LoadState loadState, Continuation<? super Unit> continuation) {
                    return create(loadState, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    RecommendUpRepository.LoadState loadState = (RecommendUpRepository.LoadState) this.L$0;
                    MutableStateFlow<RecommendUpComponent.a> mutableStateFlow = this.$recommendUpStateFlow;
                    mutableStateFlow.setValue(RecommendUpComponent.a.a((RecommendUpComponent.a) mutableStateFlow.getValue(), null, loadState, 3));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(RecommendUpService recommendUpService, MutableStateFlow<RecommendUpComponent.a> mutableStateFlow, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = recommendUpService;
                this.$recommendUpStateFlow = mutableStateFlow;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$recommendUpStateFlow, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<RecommendUpRepository.LoadState> stateFlow = this.this$0.f97805e.f97798e;
                    C08971 c08971 = new C08971(this.$recommendUpStateFlow, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c08971, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService$createRecommendUpComponent$7$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpService$createRecommendUpComponent$7$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final MutableStateFlow<RecommendUpComponent.a> $recommendUpStateFlow;
            int label;
            final RecommendUpService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.uprecommend.RecommendUpService$createRecommendUpComponent$7$1$3$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUpService$createRecommendUpComponent$7$1$3$a.class */
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MutableStateFlow<RecommendUpComponent.a> f97809a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final RecommendUpService f97810b;

                public a(MutableStateFlow<RecommendUpComponent.a> mutableStateFlow, RecommendUpService recommendUpService) {
                    this.f97809a = mutableStateFlow;
                    this.f97810b = recommendUpService;
                }

                public final Object emit(Object obj, Continuation continuation) {
                    RecommendUp recommendUp;
                    RecommendUpDescButton recommendUpDescButtonD;
                    RecommendUpDescRelation recommendUpDescRelationB;
                    FollowStateEvent followStateEvent = (FollowStateEvent) obj;
                    for (RecommendUpComponent.e eVar : new ArrayList(((RecommendUpComponent.a) this.f97809a.getValue()).f97760b)) {
                        if (followStateEvent.getUid() == eVar.f97780a.i() && ((recommendUpDescButtonD = (recommendUp = eVar.f97780a).d()) == null || (recommendUpDescRelationB = recommendUpDescButtonD.b()) == null || followStateEvent.isFollow() != recommendUpDescRelationB.e())) {
                            RecommendUpService.c(this.f97810b, recommendUp, followStateEvent.isFollow() ? 1 : 0);
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(MutableStateFlow<RecommendUpComponent.a> mutableStateFlow, RecommendUpService recommendUpService, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$recommendUpStateFlow = mutableStateFlow;
                this.this$0 = recommendUpService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$recommendUpStateFlow, this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(com.bilibili.ogv.infra.violet.c.a(FollowStateEvent.class));
                    a aVar = new a(this.$recommendUpStateFlow, this.this$0);
                    this.label = 1;
                    if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
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
        public AnonymousClass1(RecommendUpService recommendUpService, MutableStateFlow<RecommendUpComponent.a> mutableStateFlow, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = recommendUpService;
            this.$recommendUpStateFlow = mutableStateFlow;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$recommendUpStateFlow, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C08951(this.this$0, this.$recommendUpStateFlow, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$recommendUpStateFlow, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$recommendUpStateFlow, this.this$0, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendUpService$createRecommendUpComponent$7(RecommendUpService recommendUpService, MutableStateFlow<RecommendUpComponent.a> mutableStateFlow, Continuation<? super RecommendUpService$createRecommendUpComponent$7> continuation) {
        super(1, continuation);
        this.this$0 = recommendUpService;
        this.$recommendUpStateFlow = mutableStateFlow;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new RecommendUpService$createRecommendUpComponent$7(this.this$0, this.$recommendUpStateFlow, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$recommendUpStateFlow, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
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
