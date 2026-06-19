package com.bilibili.upper.module.uppercenterlocal;

import androidx.activity.OnBackPressedCallback;
import com.bilibili.upper.module.uppercenterlocal.UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2.class */
final class UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2 extends SuspendLambda implements Function2<ProducerScope<? super kntr.base.jsb.api.hilo.c>, Continuation<? super Unit>, Object> {
    final AtomicBoolean $collected;
    private Object L$0;
    int label;
    final UpperCenterLocalDelegate this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2$a.class */
    public static final class a extends OnBackPressedCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProducerScope<kntr.base.jsb.api.hilo.c> f114239a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProducerScope<? super kntr.base.jsb.api.hilo.c> producerScope) {
            super(true);
            this.f114239a = producerScope;
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void handleOnBackPressed() {
            this.f114239a.trySend-JP2dKIU(new kntr.base.jsb.api.hilo.c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2(AtomicBoolean atomicBoolean, UpperCenterLocalDelegate upperCenterLocalDelegate, Continuation<? super UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2> continuation) {
        super(2, continuation);
        this.$collected = atomicBoolean;
        this.this$0 = upperCenterLocalDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(a aVar) throws Exception {
        aVar.setEnabled(false);
        aVar.remove();
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2 upperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2 = new UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2(this.$collected, this.this$0, continuation);
        upperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2.L$0 = obj;
        return upperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2;
    }

    public final Object invoke(ProducerScope<? super kntr.base.jsb.api.hilo.c> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            if (!this.$collected.compareAndSet(false, true)) {
                SendChannel.DefaultImpls.close$default(producerScope, (Throwable) null, 1, (Object) null);
                return Unit.INSTANCE;
            }
            final a aVar = new a(producerScope);
            this.this$0.f114226a.sc(aVar);
            Function0 function0 = new Function0(aVar) { // from class: com.bilibili.upper.module.uppercenterlocal.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2.a f114244a;

                {
                    this.f114244a = aVar;
                }

                public final Object invoke() {
                    return UpperCenterLocalDelegate$hiloContainerServer$1$interceptPopGesture$2.invokeSuspend$lambda$0(this.f114244a);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == coroutine_suspended) {
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
