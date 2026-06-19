package com.bilibili.ship.theseus.united.page.miniplayer;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/MiniPlayerSuppressionService$collectPlayerState$1.class */
final class MiniPlayerSuppressionService$collectPlayerState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MiniPlayerSuppressionService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.miniplayer.MiniPlayerSuppressionService$collectPlayerState$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/MiniPlayerSuppressionService$collectPlayerState$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final MiniPlayerSuppressionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.miniplayer.MiniPlayerSuppressionService$collectPlayerState$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/MiniPlayerSuppressionService$collectPlayerState$1$1$a.class */
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f102045a;

            static {
                int[] iArr = new int[PlayerAvailability.values().length];
                try {
                    iArr[PlayerAvailability.IDLE.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[PlayerAvailability.FORBIDDEN.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[PlayerAvailability.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[PlayerAvailability.COMPLETED.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                f102045a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MiniPlayerSuppressionService miniPlayerSuppressionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = miniPlayerSuppressionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
            return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i7 = a.f102045a[((PlayerAvailability) this.L$0).ordinal()];
            if (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4) {
                this.this$0.f102035c.a("playerAvailabilitySuppressor");
                this.this$0.f102039g.a("playerAvailabilitySuppressor");
            } else {
                this.this$0.f102035c.b("playerAvailabilitySuppressor");
                this.this$0.f102039g.b("playerAvailabilitySuppressor");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniPlayerSuppressionService$collectPlayerState$1(MiniPlayerSuppressionService miniPlayerSuppressionService, Continuation<? super MiniPlayerSuppressionService$collectPlayerState$1> continuation) {
        super(2, continuation);
        this.this$0 = miniPlayerSuppressionService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiniPlayerSuppressionService$collectPlayerState$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MiniPlayerSuppressionService miniPlayerSuppressionService = this.this$0;
            MutableStateFlow<PlayerAvailability> mutableStateFlow = miniPlayerSuppressionService.f102036d.f91107a.f79286c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(miniPlayerSuppressionService, null);
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
