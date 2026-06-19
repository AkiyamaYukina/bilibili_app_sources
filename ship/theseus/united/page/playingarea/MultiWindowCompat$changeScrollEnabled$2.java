package com.bilibili.ship.theseus.united.page.playingarea;

import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/MultiWindowCompat$changeScrollEnabled$2.class */
final class MultiWindowCompat$changeScrollEnabled$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    private Object L$0;
    int label;
    final MultiWindowCompat this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.MultiWindowCompat$changeScrollEnabled$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/MultiWindowCompat$changeScrollEnabled$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<PlayerAvailability, Boolean, Continuation<? super Unit>, Object> {
        Object L$0;
        boolean Z$0;
        int label;
        final MultiWindowCompat this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MultiWindowCompat multiWindowCompat, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.this$0 = multiWindowCompat;
        }

        public final Object invoke(PlayerAvailability playerAvailability, boolean z6, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = playerAvailability;
            anonymousClass1.Z$0 = z6;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((PlayerAvailability) obj, ((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PlayerAvailability playerAvailability = (PlayerAvailability) this.L$0;
            boolean z6 = this.Z$0;
            if (playerAvailability == PlayerAvailability.COMPLETED || !z6) {
                this.this$0.f102248d.g(true);
            } else {
                this.this$0.f102248d.g(false);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiWindowCompat$changeScrollEnabled$2(MultiWindowCompat multiWindowCompat, Continuation<? super MultiWindowCompat$changeScrollEnabled$2> continuation) {
        super(2, continuation);
        this.this$0 = multiWindowCompat;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MultiWindowCompat$changeScrollEnabled$2 multiWindowCompat$changeScrollEnabled$2 = new MultiWindowCompat$changeScrollEnabled$2(this.this$0, continuation);
        multiWindowCompat$changeScrollEnabled$2.L$0 = obj;
        return multiWindowCompat$changeScrollEnabled$2;
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
        com.bilibili.ship.theseus.keel.player.h hVar = this.this$0.f102245a;
        return FlowKt.launchIn(FlowKt.combine(hVar.f91107a.f79286c, CompoundPlayStateProviderKt.b(hVar), new AnonymousClass1(this.this$0, null)), coroutineScope);
    }
}
