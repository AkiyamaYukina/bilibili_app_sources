package com.bilibili.ship.theseus.united.player.controlcontainer;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/ControlContainerSetup$1.class */
final class ControlContainerSetup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final b this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.controlcontainer.ControlContainerSetup$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/ControlContainerSetup$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.keel.player.j, Continuation<? super Long>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<AnonymousClass1> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(com.bilibili.ship.theseus.keel.player.j jVar, Continuation<Long> continuation) {
            return create(jVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxLong(((Number) obj).longValue());
                }
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            }
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.keel.player.j jVar = (com.bilibili.ship.theseus.keel.player.j) this.L$0;
            if (jVar == null) {
                this.label = 2;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw new KotlinNothingValueException();
            }
            this.label = 1;
            Object objU = jVar.u(this);
            obj = objU;
            if (objU == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Boxing.boxLong(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.controlcontainer.ControlContainerSetup$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/controlcontainer/ControlContainerSetup$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
        int label;
        final b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, Continuation<AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(long j7, Continuation<Unit> continuation) {
            return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (Continuation<Unit>) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                b bVar = this.this$0;
                this.label = 1;
                bVar.getClass();
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new ControlContainerSetup$enforceBusinessControlContainer$2(bVar, null), this);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
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
    public ControlContainerSetup$1(b bVar, Continuation<ControlContainerSetup$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ControlContainerSetup$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowMapLatest = FlowKt.mapLatest(FlowKt.asStateFlow(this.this$0.f104436b.f91111e), new AnonymousClass1(null));
            this.label = 1;
            if (FlowKt.first(flowMapLatest, this) == coroutine_suspended) {
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
        BLog.i("ControlContainerSetup$1-invokeSuspend", "[theseus-united-ControlContainerSetup$1-invokeSuspend] in business scope, wait first frame, set control container config");
        this.this$0.f104441g.a();
        b bVar = this.this$0;
        MutableStateFlow mutableStateFlow = bVar.f104441g.f104632l;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(bVar, null);
        this.label = 2;
        if (FlowKt.collectLatest(mutableStateFlow, anonymousClass2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
