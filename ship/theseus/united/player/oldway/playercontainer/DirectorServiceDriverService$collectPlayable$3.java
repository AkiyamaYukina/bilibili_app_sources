package com.bilibili.ship.theseus.united.player.oldway.playercontainer;

import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.ship.theseus.united.player.oldway.playercontainer.DirectorServiceDriverService$collectPlayable$3;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.biliplayerv2.service.k;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/DirectorServiceDriverService$collectPlayable$3.class */
final class DirectorServiceDriverService$collectPlayable$3 extends SuspendLambda implements Function2<Pair<? extends com.bilibili.ship.theseus.keel.player.j, ? extends StateFlow<? extends GeminiCommonPlayableParams>>, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final DirectorServiceDriverService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.playercontainer.DirectorServiceDriverService$collectPlayable$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/playercontainer/DirectorServiceDriverService$collectPlayable$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.keel.player.j $playable;
        final StateFlow<GeminiCommonPlayableParams> $playableParamsFlow;
        private Object L$0;
        int label;
        final DirectorServiceDriverService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DirectorServiceDriverService directorServiceDriverService, StateFlow<? extends GeminiCommonPlayableParams> stateFlow, com.bilibili.ship.theseus.keel.player.j jVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = directorServiceDriverService;
            this.$playableParamsFlow = stateFlow;
            this.$playable = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(DirectorServiceDriverService directorServiceDriverService, com.bilibili.ship.theseus.keel.player.j jVar) {
            BuildersKt.launch$default(directorServiceDriverService.f104753a, (CoroutineContext) null, (CoroutineStart) null, new DirectorServiceDriverService$collectPlayable$3$1$1$1(jVar, null), 3, (Object) null);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$playableParamsFlow, this.$playable, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    tv.danmaku.biliplayerv2.service.k kVar = this.this$0.f104755c;
                    StateFlow<GeminiCommonPlayableParams> stateFlow = this.$playableParamsFlow;
                    com.bilibili.ship.theseus.keel.player.j jVar = this.$playable;
                    MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DirectorServiceDriverService$toInternalEventFlow$1(jVar, mutableSharedFlowMutableSharedFlow$default, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DirectorServiceDriverService$toInternalEventFlow$2(jVar, mutableSharedFlowMutableSharedFlow$default, null), 3, (Object) null);
                    final DirectorServiceDriverService directorServiceDriverService = this.this$0;
                    final com.bilibili.ship.theseus.keel.player.j jVar2 = this.$playable;
                    kVar.a(new k.b(stateFlow, mutableSharedFlowMutableSharedFlow$default, new Function0(directorServiceDriverService, jVar2) { // from class: com.bilibili.ship.theseus.united.player.oldway.playercontainer.b

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final DirectorServiceDriverService f104773a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final com.bilibili.ship.theseus.keel.player.j f104774b;

                        {
                            this.f104773a = directorServiceDriverService;
                            this.f104774b = jVar2;
                        }

                        public final Object invoke() {
                            return DirectorServiceDriverService$collectPlayable$3.AnonymousClass1.invokeSuspend$lambda$0(this.f104773a, this.f104774b);
                        }
                    }));
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
                this.this$0.f104755c.a((k.b) null);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectorServiceDriverService$collectPlayable$3(DirectorServiceDriverService directorServiceDriverService, Continuation<? super DirectorServiceDriverService$collectPlayable$3> continuation) {
        super(2, continuation);
        this.this$0 = directorServiceDriverService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DirectorServiceDriverService$collectPlayable$3 directorServiceDriverService$collectPlayable$3 = new DirectorServiceDriverService$collectPlayable$3(this.this$0, continuation);
        directorServiceDriverService$collectPlayable$3.L$0 = obj;
        return directorServiceDriverService$collectPlayable$3;
    }

    public final Object invoke(Pair<? extends com.bilibili.ship.theseus.keel.player.j, ? extends StateFlow<? extends GeminiCommonPlayableParams>> pair, Continuation<? super Unit> continuation) {
        return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.L$0;
            if (pair == null) {
                return Unit.INSTANCE;
            }
            com.bilibili.ship.theseus.keel.player.j jVar = (com.bilibili.ship.theseus.keel.player.j) pair.component1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (StateFlow) pair.component2(), jVar, null);
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
