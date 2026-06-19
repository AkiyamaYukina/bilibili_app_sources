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
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectContainerRatio$2.class */
final class PlayingAreaCompoundServiceImpl$collectContainerRatio$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final a.c $views;
    private Object L$0;
    int label;
    final PlayingAreaCompoundServiceImpl this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectContainerRatio$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectContainerRatio$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a.c $views;
        int label;
        final PlayingAreaCompoundServiceImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectContainerRatio$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectContainerRatio$2$1$1.class */
        public static final class C10921 extends SuspendLambda implements Function2<PlayingAreaDescription, Continuation<? super Unit>, Object> {
            final a.c $views;
            Object L$0;
            int label;
            final PlayingAreaCompoundServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10921(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, a.c cVar, Continuation<? super C10921> continuation) {
                super(2, continuation);
                this.this$0 = playingAreaCompoundServiceImpl;
                this.$views = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10921 c10921 = new C10921(this.this$0, this.$views, continuation);
                c10921.L$0 = obj;
                return c10921;
            }

            public final Object invoke(PlayingAreaDescription playingAreaDescription, Continuation<? super Unit> continuation) {
                return create(playingAreaDescription, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                defpackage.a.b("[theseus-united-PlayingAreaCompoundServiceImpl$collectContainerRatio$2$1$1-invokeSuspend] ", "descriptionFlow " + ((PlayingAreaDescription) this.L$0), "PlayingAreaCompoundServiceImpl$collectContainerRatio$2$1$1-invokeSuspend");
                PlayingAreaCompoundServiceImpl.l(this.this$0, this.$views);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, a.c cVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playingAreaCompoundServiceImpl;
            this.$views = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$views, continuation);
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
                StateFlow<PlayingAreaDescription> stateFlow = playingAreaCompoundServiceImpl.f102310f.f123389b;
                C10921 c10921 = new C10921(playingAreaCompoundServiceImpl, this.$views, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c10921, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectContainerRatio$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectContainerRatio$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a.c $views;
        int label;
        final PlayingAreaCompoundServiceImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectContainerRatio$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectContainerRatio$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
            final a.c $views;
            Object L$0;
            int label;
            final PlayingAreaCompoundServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, a.c cVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playingAreaCompoundServiceImpl;
                this.$views = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$views, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
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
                defpackage.a.b("[theseus-united-PlayingAreaCompoundServiceImpl$collectContainerRatio$2$2$1-invokeSuspend] ", "screenStateFlow " + ((c.a) this.L$0), "PlayingAreaCompoundServiceImpl$collectContainerRatio$2$2$1-invokeSuspend");
                PlayingAreaCompoundServiceImpl.l(this.this$0, this.$views);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, a.c cVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playingAreaCompoundServiceImpl;
            this.$views = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$views, continuation);
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$views, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowC, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectContainerRatio$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectContainerRatio$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a.c $views;
        int label;
        final PlayingAreaCompoundServiceImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectContainerRatio$2$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectContainerRatio$2$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Pair<? extends Integer, ? extends Integer>, Continuation<? super Unit>, Object> {
            final a.c $views;
            Object L$0;
            int label;
            final PlayingAreaCompoundServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, a.c cVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playingAreaCompoundServiceImpl;
                this.$views = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$views, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
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
                defpackage.a.b("[theseus-united-PlayingAreaCompoundServiceImpl$collectContainerRatio$2$3$1-invokeSuspend] ", "rootSizeFlow " + ((Pair) this.L$0), "PlayingAreaCompoundServiceImpl$collectContainerRatio$2$3$1-invokeSuspend");
                PlayingAreaCompoundServiceImpl.l(this.this$0, this.$views);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, a.c cVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = playingAreaCompoundServiceImpl;
            this.$views = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$views, continuation);
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
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$views, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectContainerRatio$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectContainerRatio$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a.c $views;
        int label;
        final PlayingAreaCompoundServiceImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$collectContainerRatio$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$collectContainerRatio$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<a.b, Continuation<? super Unit>, Object> {
            final a.c $views;
            Object L$0;
            int label;
            final PlayingAreaCompoundServiceImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, a.c cVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playingAreaCompoundServiceImpl;
                this.$views = cVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$views, continuation);
                anonymousClass1.L$0 = (a.b) obj;
                return anonymousClass1;
            }

            /* JADX INFO: renamed from: invoke-ogElLq0, reason: not valid java name and merged with bridge method [inline-methods] */
            public final Object invoke(a.b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                defpackage.a.b("[theseus-united-PlayingAreaCompoundServiceImpl$collectContainerRatio$2$4$1-invokeSuspend] ", "specifiedRatioFlow " + ((a.b) this.L$0), "PlayingAreaCompoundServiceImpl$collectContainerRatio$2$4$1-invokeSuspend");
                PlayingAreaCompoundServiceImpl.l(this.this$0, this.$views);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, a.c cVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = playingAreaCompoundServiceImpl;
            this.$views = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$views, continuation);
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
                MutableStateFlow<a.b> mutableStateFlow = playingAreaCompoundServiceImpl.f102318o;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playingAreaCompoundServiceImpl, this.$views, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public PlayingAreaCompoundServiceImpl$collectContainerRatio$2(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, a.c cVar, Continuation<? super PlayingAreaCompoundServiceImpl$collectContainerRatio$2> continuation) {
        super(2, continuation);
        this.this$0 = playingAreaCompoundServiceImpl;
        this.$views = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayingAreaCompoundServiceImpl$collectContainerRatio$2 playingAreaCompoundServiceImpl$collectContainerRatio$2 = new PlayingAreaCompoundServiceImpl$collectContainerRatio$2(this.this$0, this.$views, continuation);
        playingAreaCompoundServiceImpl$collectContainerRatio$2.L$0 = obj;
        return playingAreaCompoundServiceImpl$collectContainerRatio$2;
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
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, this.$views, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, this.$views, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, this.$views, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, this.$views, null), 3, (Object) null);
    }
}
