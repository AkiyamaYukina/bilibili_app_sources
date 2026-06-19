package com.bilibili.playerbizcommonv2.widget.seek.v3;

import com.alipay.sdk.app.PayTask;
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
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.biliplayerv2.service.ControlContainerVisibleObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$millisecondsActive$2.class */
final class PlayerSeekWidget3$millisecondsActive$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    private Object L$0;
    int label;
    final PlayerSeekWidget3 this$0;

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$millisecondsActive$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$millisecondsActive$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayerSeekWidget3 this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$millisecondsActive$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$millisecondsActive$2$1$1.class */
        public static final class C05471 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final PlayerSeekWidget3 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05471(PlayerSeekWidget3 playerSeekWidget3, Continuation<? super C05471> continuation) {
                super(2, continuation);
                this.this$0 = playerSeekWidget3;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C05471 c05471 = new C05471(this.this$0, continuation);
                c05471.Z$0 = ((Boolean) obj).booleanValue();
                return c05471;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.Z$0) {
                        PlayerSeekWidget3.k(this.this$0, true);
                        return Unit.INSTANCE;
                    }
                    if (com.bilibili.playerbizcommonv2.utils.f.f81913a || com.bilibili.playerbizcommonv2.utils.f.f81914b || com.bilibili.playerbizcommonv2.utils.f.f81915c) {
                        this.label = 1;
                        if (DelayKt.delay(PayTask.f60018j, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        this.label = 2;
                        if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i7 != 1 && i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (!this.this$0.getControlContainerService().isShowing()) {
                    PlayerSeekWidget3.k(this.this$0, false);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayerSeekWidget3 playerSeekWidget3, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playerSeekWidget3;
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
                StateFlow stateFlowIsDraggingByUserFlow = this.this$0.getSeekService().isDraggingByUserFlow();
                C05471 c05471 = new C05471(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowIsDraggingByUserFlow, c05471, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$millisecondsActive$2$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$millisecondsActive$2$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final PlayerSeekWidget3 this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.seek.v3.PlayerSeekWidget3$millisecondsActive$2$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/PlayerSeekWidget3$millisecondsActive$2$2$a.class */
        public static final class a implements ControlContainerVisibleObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerSeekWidget3 f82951a;

            public a(PlayerSeekWidget3 playerSeekWidget3) {
                this.f82951a = playerSeekWidget3;
            }

            public final void onControlContainerVisibleChanged(boolean z6) {
                PlayerSeekWidget3.k(this.f82951a, z6);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlayerSeekWidget3 playerSeekWidget3, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playerSeekWidget3;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlayerSeekWidget3 playerSeekWidget3 = this.this$0;
                aVar = new a(playerSeekWidget3);
                playerSeekWidget3.getControlContainerService().registerControlContainerVisible(aVar);
                try {
                    this.L$0 = aVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    this.this$0.getControlContainerService().unregisterControlContainerVisible(aVar);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a aVar3 = (a) this.L$0;
                aVar2 = aVar3;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar3;
                } catch (Throwable th2) {
                    aVar = aVar2;
                    th = th2;
                    this.this$0.getControlContainerService().unregisterControlContainerVisible(aVar);
                    throw th;
                }
            }
            aVar2 = aVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSeekWidget3$millisecondsActive$2(PlayerSeekWidget3 playerSeekWidget3, Continuation<? super PlayerSeekWidget3$millisecondsActive$2> continuation) {
        super(2, continuation);
        this.this$0 = playerSeekWidget3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerSeekWidget3$millisecondsActive$2 playerSeekWidget3$millisecondsActive$2 = new PlayerSeekWidget3$millisecondsActive$2(this.this$0, continuation);
        playerSeekWidget3$millisecondsActive$2.L$0 = obj;
        return playerSeekWidget3$millisecondsActive$2;
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
        return BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
    }
}
