package com.bilibili.ship.theseus.ugc.playlimited;

import androidx.lifecycle.Lifecycle;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UGCEpisodeRestrictionLayerService$collectVideoCompletion$1.class */
final class UGCEpisodeRestrictionLayerService$collectVideoCompletion$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final a this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playlimited.UGCEpisodeRestrictionLayerService$collectVideoCompletion$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UGCEpisodeRestrictionLayerService$collectVideoCompletion$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final com.bilibili.ship.theseus.ugc.playlimited.a this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playlimited.UGCEpisodeRestrictionLayerService$collectVideoCompletion$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UGCEpisodeRestrictionLayerService$collectVideoCompletion$1$1$1.class */
        public static final class C09141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private Object L$0;
            int label;
            final com.bilibili.ship.theseus.ugc.playlimited.a this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playlimited.UGCEpisodeRestrictionLayerService$collectVideoCompletion$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UGCEpisodeRestrictionLayerService$collectVideoCompletion$1$1$1$1.class */
            public static final class C09151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final com.bilibili.ship.theseus.ugc.playlimited.a this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playlimited.UGCEpisodeRestrictionLayerService$collectVideoCompletion$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UGCEpisodeRestrictionLayerService$collectVideoCompletion$1$1$1$1$1.class */
                public static final class C09161 extends SuspendLambda implements Function2<Lifecycle.State, Continuation<? super Boolean>, Object> {
                    Object L$0;
                    int label;

                    public C09161(Continuation<? super C09161> continuation) {
                        super(2, continuation);
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C09161 c09161 = new C09161(continuation);
                        c09161.L$0 = obj;
                        return c09161;
                    }

                    public final Object invoke(Lifecycle.State state, Continuation<? super Boolean> continuation) {
                        return create(state, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(((Lifecycle.State) this.L$0) == Lifecycle.State.RESUMED);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09151(com.bilibili.ship.theseus.ugc.playlimited.a aVar, Continuation<? super C09151> continuation) {
                    super(2, continuation);
                    this.this$0 = aVar;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C09151(this.this$0, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        StateFlow<Lifecycle.State> currentStateFlow = this.this$0.f98373g.getCurrentStateFlow();
                        C09161 c09161 = new C09161(null);
                        this.label = 1;
                        if (FlowKt.first(currentStateFlow, c09161, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    BLog.i("UGCEpisodeRestrictionLayerService$collectVideoCompletion$1$1$1$1-invokeSuspend", "[theseus-ugc-UGCEpisodeRestrictionLayerService$collectVideoCompletion$1$1$1$1-invokeSuspend] forbidden call player pause");
                    this.this$0.f98370d.pause();
                    this.this$0.f98369c.a("UGCPlayLimitedLayerDriver");
                    com.bilibili.ship.theseus.ugc.playlimited.a aVar = this.this$0;
                    this.label = 2;
                    aVar.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UGCEpisodeRestrictionLayerService$handleVideoForbidden$2(aVar, null), this);
                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                    if (objCoroutineScope == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09141(com.bilibili.ship.theseus.ugc.playlimited.a aVar, Continuation<? super C09141> continuation) {
                super(2, continuation);
                this.this$0 = aVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09141 c09141 = new C09141(this.this$0, continuation);
                c09141.L$0 = obj;
                return c09141;
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
                BuildersKt.launch$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C09151(this.this$0, null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playlimited.UGCEpisodeRestrictionLayerService$collectVideoCompletion$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/UGCEpisodeRestrictionLayerService$collectVideoCompletion$1$1$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f98363a;

            static {
                int[] iArr = new int[PlayerAvailability.values().length];
                try {
                    iArr[PlayerAvailability.FORBIDDEN.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[PlayerAvailability.READY.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[PlayerAvailability.COMPLETED.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[PlayerAvailability.ERROR.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                try {
                    iArr[PlayerAvailability.IDLE.ordinal()] = 5;
                } catch (NoSuchFieldError e11) {
                }
                try {
                    iArr[PlayerAvailability.LOADING.ordinal()] = 6;
                } catch (NoSuchFieldError e12) {
                }
                f98363a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.bilibili.ship.theseus.ugc.playlimited.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
            return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlayerAvailability playerAvailability = (PlayerAvailability) this.L$0;
                defpackage.a.b("[theseus-ugc-UGCEpisodeRestrictionLayerService$collectVideoCompletion$1$1-invokeSuspend] ", "Handling PlayerAvailability: " + playerAvailability, "UGCEpisodeRestrictionLayerService$collectVideoCompletion$1$1-invokeSuspend");
                switch (a.f98363a[playerAvailability.ordinal()]) {
                    case 1:
                        C09141 c09141 = new C09141(this.this$0, null);
                        this.label = 1;
                        if (CoroutineScopeKt.coroutineScope(c09141, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 2:
                    case 3:
                    case 4:
                        this.this$0.f98369c.c("UGCPlayLimitedLayerDriver");
                        break;
                    case 5:
                    case 6:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
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
    public UGCEpisodeRestrictionLayerService$collectVideoCompletion$1(a aVar, Continuation<? super UGCEpisodeRestrictionLayerService$collectVideoCompletion$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCEpisodeRestrictionLayerService$collectVideoCompletion$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = this.this$0;
            MutableStateFlow<PlayerAvailability> mutableStateFlow = aVar.f98370d.f91107a.f79286c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, null);
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
