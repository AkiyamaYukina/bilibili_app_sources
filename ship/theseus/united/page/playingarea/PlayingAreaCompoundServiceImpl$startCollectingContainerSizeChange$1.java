package com.bilibili.ship.theseus.united.page.playingarea;

import com.bilibili.ship.theseus.united.page.playingarea.a;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1.class */
public final class PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PlayingAreaCompoundServiceImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final PlayingAreaCompoundServiceImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$1.class */
        public static final class C10941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final PlayingAreaCompoundServiceImpl this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$1$1.class */
            public static final class C10951 extends SuspendLambda implements Function2<Pair<? extends Integer, ? extends Integer>, Continuation<? super Unit>, Object> {
                int label;
                final PlayingAreaCompoundServiceImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10951(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super C10951> continuation) {
                    super(2, continuation);
                    this.this$0 = playingAreaCompoundServiceImpl;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10951(this.this$0, continuation);
                }

                public final Object invoke(Pair<Integer, Integer> pair, Continuation<? super Unit> continuation) {
                    return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    PlayingAreaCompoundServiceImpl.n(this.this$0);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10941(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super C10941> continuation) {
                super(2, continuation);
                this.this$0 = playingAreaCompoundServiceImpl;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10941(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<Pair<Integer, Integer>> stateFlowB = this.this$0.f102307c.b();
                    C10951 c10951 = new C10951(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowB, c10951, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final PlayingAreaCompoundServiceImpl this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$2$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$2$1.class */
            public static final class C10961 extends SuspendLambda implements Function2<a.C1102a, Continuation<? super Unit>, Object> {
                int label;
                final PlayingAreaCompoundServiceImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10961(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super C10961> continuation) {
                    super(2, continuation);
                    this.this$0 = playingAreaCompoundServiceImpl;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10961(this.this$0, continuation);
                }

                public final Object invoke(a.C1102a c1102a, Continuation<? super Unit> continuation) {
                    return create(c1102a, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    PlayingAreaCompoundServiceImpl.n(this.this$0);
                    return Unit.INSTANCE;
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
                    StateFlow<a.C1102a> stateFlowG = this.this$0.f102307c.g();
                    C10961 c10961 = new C10961(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowG, c10961, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$3.class */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final PlayingAreaCompoundServiceImpl this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$3$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$3$1.class */
            public static final class C10971 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
                int label;
                final PlayingAreaCompoundServiceImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10971(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super C10971> continuation) {
                    super(2, continuation);
                    this.this$0 = playingAreaCompoundServiceImpl;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10971(this.this$0, continuation);
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
                    PlayingAreaCompoundServiceImpl.n(this.this$0);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = playingAreaCompoundServiceImpl;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
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
                    StateFlow<Integer> stateFlow = playingAreaCompoundServiceImpl.f102306b.f102255f;
                    C10971 c10971 = new C10971(playingAreaCompoundServiceImpl, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, c10971, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final PlayingAreaCompoundServiceImpl this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$4$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1$1$4$1.class */
            public static final class C10981 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
                int label;
                final PlayingAreaCompoundServiceImpl this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10981(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super C10981> continuation) {
                    super(2, continuation);
                    this.this$0 = playingAreaCompoundServiceImpl;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C10981(this.this$0, continuation);
                }

                public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                    return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    PlayingAreaCompoundServiceImpl.n(this.this$0);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = playingAreaCompoundServiceImpl;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow stateFlowC = this.this$0.f102308d.c();
                    C10981 c10981 = new C10981(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowC, c10981, this) == coroutine_suspended) {
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
        public AnonymousClass1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playingAreaCompoundServiceImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
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
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C10941(this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1> continuation) {
        super(2, continuation);
        this.this$0 = playingAreaCompoundServiceImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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
