package com.bilibili.ship.theseus.united.player.mediaplay.network;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.player.mediaplay.network.d;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/PlayerNetworkLimitService$keepShowNetworkLimitWidget$2.class */
final class PlayerNetworkLimitService$keepShowNetworkLimitWidget$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    private Object L$0;
    int label;
    final o this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.network.PlayerNetworkLimitService$keepShowNetworkLimitWidget$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/PlayerNetworkLimitService$keepShowNetworkLimitWidget$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final d $component;
        Object L$0;
        Object L$1;
        int label;
        final o this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(o oVar, d dVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = oVar;
            this.$component = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$component, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object invokeSuspend(Object obj) throws Throwable {
            d dVar;
            d dVar2;
            Throwable th;
            com.bilibili.ship.theseus.keel.player.h hVar;
            com.bilibili.player.tangram.basic.d dVar3;
            com.bilibili.player.tangram.basic.d dVar4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                o oVar = this.this$0;
                com.bilibili.ship.theseus.keel.player.h hVar2 = oVar.f104590b;
                dVar = this.$component;
                hVar2.h(dVar);
                try {
                    TheseusFloatLayerService theseusFloatLayerService = oVar.f104592d;
                    this.L$0 = hVar2;
                    this.L$1 = dVar;
                    this.label = 1;
                    dVar4 = hVar2;
                    if (theseusFloatLayerService.i(dVar, null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    dVar2 = dVar;
                    th = th2;
                    hVar = hVar2;
                    hVar.i(dVar2);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d dVar5 = (d) this.L$1;
                com.bilibili.player.tangram.basic.d dVar6 = (com.bilibili.player.tangram.basic.d) this.L$0;
                dVar2 = dVar5;
                dVar3 = dVar6;
                try {
                    ResultKt.throwOnFailure(obj);
                    dVar = dVar5;
                    dVar4 = dVar6;
                } catch (Throwable th3) {
                    th = th3;
                    hVar = dVar3 == true ? 1 : 0;
                    hVar.i(dVar2);
                    throw th;
                }
            }
            dVar2 = dVar;
            dVar3 = dVar4 == true ? 1 : 0;
            Unit unit = Unit.INSTANCE;
            dVar4.i(dVar);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.network.PlayerNetworkLimitService$keepShowNetworkLimitWidget$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/PlayerNetworkLimitService$keepShowNetworkLimitWidget$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final d $component;
        Object L$0;
        Object L$1;
        int label;
        final o this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(o oVar, d dVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = oVar;
            this.$component = dVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$component, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            com.bilibili.ship.theseus.united.page.playingarea.i iVar;
            com.bilibili.ship.theseus.united.page.playingarea.i iVar2;
            d dVar;
            d dVar2;
            d dVar3;
            com.bilibili.ship.theseus.united.page.playingarea.i iVar3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                iVar = this.this$0.f104594f;
                d dVar4 = this.$component;
                iVar.a(dVar4);
                try {
                    this.L$0 = iVar;
                    this.L$1 = dVar4;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dVar2 = dVar4;
                } catch (Throwable th) {
                    th = th;
                    iVar2 = iVar;
                    dVar = dVar4;
                    iVar2.c(dVar);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dVar2 = (d) this.L$1;
                com.bilibili.ship.theseus.united.page.playingarea.i iVar4 = (com.bilibili.ship.theseus.united.page.playingarea.i) this.L$0;
                dVar3 = dVar2;
                iVar3 = iVar4;
                try {
                    ResultKt.throwOnFailure(obj);
                    iVar = iVar4;
                } catch (Throwable th2) {
                    dVar = dVar3;
                    iVar2 = iVar3;
                    th = th2;
                    iVar2.c(dVar);
                    throw th;
                }
            }
            dVar3 = dVar2;
            iVar3 = iVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.network.PlayerNetworkLimitService$keepShowNetworkLimitWidget$2$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/PlayerNetworkLimitService$keepShowNetworkLimitWidget$2$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final o this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(o oVar, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = oVar;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.f104591c.setBufferLimit(true);
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
                this.this$0.f104591c.setBufferLimit(false);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.network.PlayerNetworkLimitService$keepShowNetworkLimitWidget$2$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/PlayerNetworkLimitService$keepShowNetworkLimitWidget$2$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final o this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.mediaplay.network.PlayerNetworkLimitService$keepShowNetworkLimitWidget$2$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/PlayerNetworkLimitService$keepShowNetworkLimitWidget$2$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final o this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(o oVar, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = oVar;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object value;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c.a aVar = (c.a) this.L$0;
                MutableStateFlow<d.c> mutableStateFlowA = this.this$0.a();
                do {
                    value = mutableStateFlowA.getValue();
                } while (!mutableStateFlowA.compareAndSet(value, d.c.a((d.c) value, null, p.a(aVar), null, 29)));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(o oVar, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = oVar;
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
                StateFlow stateFlowC = this.this$0.f104593e.c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerNetworkLimitService$keepShowNetworkLimitWidget$2(o oVar, Continuation<? super PlayerNetworkLimitService$keepShowNetworkLimitWidget$2> continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerNetworkLimitService$keepShowNetworkLimitWidget$2 playerNetworkLimitService$keepShowNetworkLimitWidget$2 = new PlayerNetworkLimitService$keepShowNetworkLimitWidget$2(this.this$0, continuation);
        playerNetworkLimitService$keepShowNetworkLimitWidget$2.L$0 = obj;
        return playerNetworkLimitService$keepShowNetworkLimitWidget$2;
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
        d dVar = new d(this.this$0.a());
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this.this$0, dVar, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, dVar, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.this$0, null), 3, (Object) null);
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.this$0, null), 3, (Object) null);
    }
}
