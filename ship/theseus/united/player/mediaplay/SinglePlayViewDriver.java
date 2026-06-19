package com.bilibili.ship.theseus.united.player.mediaplay;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import javax.inject.Inject;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/SinglePlayViewDriver.class */
@StabilityInferred(parameters = 0)
public final class SinglePlayViewDriver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f104507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final o f104508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<PlayViewUniteReply> f104509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<PlayViewUniteReply> f104510e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.SinglePlayViewDriver$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/SinglePlayViewDriver$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SinglePlayViewDriver this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.SinglePlayViewDriver$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/SinglePlayViewDriver$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SinglePlayViewDriver f104511a;

            public a(SinglePlayViewDriver singlePlayViewDriver) {
                this.f104511a = singlePlayViewDriver;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f104511a.f104509d.setValue((PlayViewUniteReply) obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SinglePlayViewDriver singlePlayViewDriver, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = singlePlayViewDriver;
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
                Flow<PlayViewUniteReply> flowG = this.this$0.f104507b.g();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowG.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.SinglePlayViewDriver$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/SinglePlayViewDriver$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SinglePlayViewDriver this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.SinglePlayViewDriver$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/SinglePlayViewDriver$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayViewUniteReply, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final SinglePlayViewDriver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SinglePlayViewDriver singlePlayViewDriver, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = singlePlayViewDriver;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(PlayViewUniteReply playViewUniteReply, Continuation<? super Unit> continuation) {
                return create(playViewUniteReply, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlayViewUniteReply playViewUniteReply = (PlayViewUniteReply) this.L$0;
                    if (playViewUniteReply != null) {
                        SinglePlayViewDriver singlePlayViewDriver = this.this$0;
                        this.label = 1;
                        singlePlayViewDriver.getClass();
                        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new SinglePlayViewDriver$enforcePlayViewReply$2(singlePlayViewDriver, playViewUniteReply, null), this);
                        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCoroutineScope = Unit.INSTANCE;
                        }
                        if (objCoroutineScope == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        BLog.w("SinglePlayViewDriver$2$1-invokeSuspend", "[theseus-united-SinglePlayViewDriver$2$1-invokeSuspend] emit null play view reply, can not drive play view reply", (Throwable) null);
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
        public AnonymousClass2(SinglePlayViewDriver singlePlayViewDriver, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = singlePlayViewDriver;
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
                SinglePlayViewDriver singlePlayViewDriver = this.this$0;
                StateFlow<PlayViewUniteReply> stateFlow = singlePlayViewDriver.f104510e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(singlePlayViewDriver, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
    public SinglePlayViewDriver(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull o oVar) {
        this.f104506a = coroutineScope;
        this.f104507b = jVar;
        this.f104508c = oVar;
        MutableStateFlow<PlayViewUniteReply> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f104509d = MutableStateFlow;
        this.f104510e = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
