package com.bilibili.ship.theseus.united.page.playingarea;

import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.ship.theseus.united.page.playingarea.a;
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
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2.class */
final class PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    private Object L$0;
    int label;
    final PlayingAreaCompoundServiceImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayingAreaCompoundServiceImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2$1$1.class */
        public static final class C10931 extends SuspendLambda implements Function2<a.C1102a, Continuation<? super Unit>, Object> {
            int label;
            final PlayingAreaCompoundServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10931(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super C10931> continuation) {
                super(2, continuation);
                this.this$0 = playingAreaCompoundServiceImpl;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C10931(this.this$0, continuation);
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
                PlayingAreaCompoundServiceImpl.m(this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playingAreaCompoundServiceImpl;
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
                StateFlow<a.C1102a> stateFlowG = this.this$0.f102307c.g();
                C10931 c10931 = new C10931(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowG, c10931, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayingAreaCompoundServiceImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Pair<? extends Integer, ? extends Integer>, Continuation<? super Unit>, Object> {
            int label;
            final PlayingAreaCompoundServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playingAreaCompoundServiceImpl;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
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
                PlayingAreaCompoundServiceImpl.m(this.this$0);
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
                StateFlow<Pair<Integer, Integer>> stateFlowB = this.this$0.f102307c.b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowB, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayingAreaCompoundServiceImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            int label;
            final PlayingAreaCompoundServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playingAreaCompoundServiceImpl;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
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
                PlayingAreaCompoundServiceImpl.m(this.this$0);
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
                Flow<Boolean> flowB = CompoundPlayStateProviderKt.b(this.this$0.f102311g);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowB, anonymousClass1, this) == coroutine_suspended) {
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
    public PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2> continuation) {
        super(2, continuation);
        this.this$0 = playingAreaCompoundServiceImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2 playingAreaCompoundServiceImpl$collectMaxScrollDistance$2 = new PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2(this.this$0, continuation);
        playingAreaCompoundServiceImpl$collectMaxScrollDistance$2.L$0 = obj;
        return playingAreaCompoundServiceImpl$collectMaxScrollDistance$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
    }
}
