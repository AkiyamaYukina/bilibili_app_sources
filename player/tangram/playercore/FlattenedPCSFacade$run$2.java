package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.player.tangram.playercore.FlattenedPCSFacade;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$run$2.class */
final class FlattenedPCSFacade$run$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    final Object $legacy;
    final boolean $seeksAccurately;
    final long $targetPosition;
    private Object L$0;
    int label;
    final FlattenedPCSFacade this$0;

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$run$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$run$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlattenedPCSFacade.a, Continuation<? super Unit>, Object> {
        final CoroutineScope $coordinatingCoroutineScope;
        final Ref.ObjectRef<Job> $pieceJob;
        Object L$0;
        int label;
        final FlattenedPCSFacade this$0;

        /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$run$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$run$2$1$1.class */
        public static final class C05121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final CoroutineScope $coordinatingCoroutineScope;
            final FlattenedPCSFacade.a $it;
            int label;
            final FlattenedPCSFacade this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05121(FlattenedPCSFacade flattenedPCSFacade, FlattenedPCSFacade.a aVar, CoroutineScope coroutineScope, Continuation<? super C05121> continuation) {
                super(2, continuation);
                this.this$0 = flattenedPCSFacade;
                this.$it = aVar;
                this.$coordinatingCoroutineScope = coroutineScope;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05121(this.this$0, this.$it, this.$coordinatingCoroutineScope, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    FlattenedPCSFacade flattenedPCSFacade = this.this$0;
                    FlattenedPCSFacade.a.C0511a c0511a = (FlattenedPCSFacade.a.C0511a) this.$it;
                    int i8 = c0511a.f79374a;
                    long j7 = c0511a.f79375b;
                    boolean z6 = c0511a.f79376c;
                    CoroutineScope coroutineScope = this.$coordinatingCoroutineScope;
                    this.label = 1;
                    flattenedPCSFacade.getClass();
                    if (CoroutineScopeKt.coroutineScope(new FlattenedPCSFacade$runPiece$2(flattenedPCSFacade, i8, j7, coroutineScope, z6, null), this) == coroutine_suspended) {
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
        public AnonymousClass1(Ref.ObjectRef<Job> objectRef, FlattenedPCSFacade flattenedPCSFacade, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$pieceJob = objectRef;
            this.this$0 = flattenedPCSFacade;
            this.$coordinatingCoroutineScope = coroutineScope;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pieceJob, this.this$0, this.$coordinatingCoroutineScope, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(FlattenedPCSFacade.a aVar, Continuation<? super Unit> continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            FlattenedPCSFacade.a aVar;
            FlattenedPCSFacade.a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                aVar = (FlattenedPCSFacade.a) this.L$0;
                if (!(aVar instanceof FlattenedPCSFacade.a.C0511a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Job job = (Job) this.$pieceJob.element;
                this.L$0 = aVar;
                this.label = 1;
                if (JobKt.cancelAndJoin(job, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    FlattenedPCSFacade.a aVar3 = (FlattenedPCSFacade.a) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar3;
                    aVar2 = aVar;
                    FlattenedPCSFacade flattenedPCSFacade = this.this$0;
                    flattenedPCSFacade.f79369s = null;
                    Ref.ObjectRef<Job> objectRef = this.$pieceJob;
                    CoroutineScope coroutineScope = this.$coordinatingCoroutineScope;
                    objectRef.element = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C05121(flattenedPCSFacade, aVar2, coroutineScope, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
                FlattenedPCSFacade.a aVar4 = (FlattenedPCSFacade.a) this.L$0;
                ResultKt.throwOnFailure(obj);
                aVar = aVar4;
            }
            Job job2 = this.this$0.f79369s;
            aVar2 = aVar;
            if (job2 != null) {
                this.L$0 = aVar;
                this.label = 2;
                if (JobKt.cancelAndJoin(job2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar2 = aVar;
            }
            FlattenedPCSFacade flattenedPCSFacade2 = this.this$0;
            flattenedPCSFacade2.f79369s = null;
            Ref.ObjectRef<Job> objectRef2 = this.$pieceJob;
            CoroutineScope coroutineScope2 = this.$coordinatingCoroutineScope;
            objectRef2.element = BuildersKt.launch$default(coroutineScope2, (CoroutineContext) null, (CoroutineStart) null, new C05121(flattenedPCSFacade2, aVar2, coroutineScope2, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$run$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$run$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final FlattenedPCSFacade this$0;

        /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$run$2$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$run$2$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final FlattenedPCSFacade this$0;

            /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$run$2$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$run$2$2$1$1.class */
            public static final class C05131 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                boolean Z$0;
                int label;

                public C05131(Continuation<? super C05131> continuation) {
                    super(2, continuation);
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C05131 c05131 = new C05131(continuation);
                    c05131.Z$0 = ((Boolean) obj).booleanValue();
                    return c05131;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                }

                public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
                    return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(!this.Z$0);
                }
            }

            /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$run$2$2$1$2, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$run$2$2$1$2.class */
            public static final class C05142 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
                boolean Z$0;
                int label;

                public C05142(Continuation<? super C05142> continuation) {
                    super(2, continuation);
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C05142 c05142 = new C05142(continuation);
                    c05142.Z$0 = ((Boolean) obj).booleanValue();
                    return c05142;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
                }

                public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
                    return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(this.Z$0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FlattenedPCSFacade flattenedPCSFacade, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = flattenedPCSFacade;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
                return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    Method dump skipped, instruction units count: 207
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$run$2.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FlattenedPCSFacade flattenedPCSFacade, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = flattenedPCSFacade;
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
                FlattenedPCSFacade flattenedPCSFacade = this.this$0;
                MutableStateFlow<PlayerAvailability> mutableStateFlow = flattenedPCSFacade.f79367q;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(flattenedPCSFacade, null);
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
    public FlattenedPCSFacade$run$2(FlattenedPCSFacade flattenedPCSFacade, Object obj, long j7, boolean z6, Continuation<? super FlattenedPCSFacade$run$2> continuation) {
        super(2, continuation);
        this.this$0 = flattenedPCSFacade;
        this.$legacy = obj;
        this.$targetPosition = j7;
        this.$seeksAccurately = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlattenedPCSFacade$run$2 flattenedPCSFacade$run$2 = new FlattenedPCSFacade$run$2(this.this$0, this.$legacy, this.$targetPosition, this.$seeksAccurately, continuation);
        flattenedPCSFacade$run$2.L$0 = obj;
        return flattenedPCSFacade$run$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new FlattenedPCSFacade$run$2$pieceJob$1(this.$legacy, this.this$0, this.$targetPosition, this.$seeksAccurately, coroutineScope, null), 3, (Object) null);
                FlowKt.launchIn(FlowKt.onEach(FlowKt.receiveAsFlow(this.this$0.f79362l), new AnonymousClass1(objectRef, this.this$0, coroutineScope, null)), coroutineScope);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
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
            this.this$0.f79367q.setValue(PlayerAvailability.IDLE);
            throw th;
        }
    }
}
