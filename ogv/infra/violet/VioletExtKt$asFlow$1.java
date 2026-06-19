package com.bilibili.ogv.infra.violet;

import androidx.lifecycle.Observer;
import com.bilibili.bus.ChannelOperation;
import com.bilibili.bus.IData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/violet/VioletExtKt$asFlow$1.class */
final class VioletExtKt$asFlow$1 extends SuspendLambda implements Function2<ProducerScope<IData>, Continuation<? super Unit>, Object> {
    final ChannelOperation<IData> $this_asFlow;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VioletExtKt$asFlow$1(ChannelOperation<IData> channelOperation, Continuation<? super VioletExtKt$asFlow$1> continuation) {
        super(2, continuation);
        this.$this_asFlow = channelOperation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(ChannelOperation channelOperation, Observer observer) {
        channelOperation.removeObserver(observer);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        VioletExtKt$asFlow$1 violetExtKt$asFlow$1 = new VioletExtKt$asFlow$1(this.$this_asFlow, continuation);
        violetExtKt$asFlow$1.L$0 = obj;
        return violetExtKt$asFlow$1;
    }

    public final Object invoke(ProducerScope<IData> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.Observer, com.bilibili.ogv.infra.violet.a] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final ?? r02 = new Observer(producerScope) { // from class: com.bilibili.ogv.infra.violet.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ProducerScope f67965a;

                {
                    this.f67965a = producerScope;
                }

                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    ChannelsKt.trySendBlocking(this.f67965a, (IData) obj2);
                }
            };
            this.$this_asFlow.observeForever((Observer) r02);
            final ChannelOperation<IData> channelOperation = this.$this_asFlow;
            Function0 function0 = new Function0(channelOperation, r02) { // from class: com.bilibili.ogv.infra.violet.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final ChannelOperation f67966a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a f67967b;

                {
                    this.f67966a = channelOperation;
                    this.f67967b = r02;
                }

                public final Object invoke() {
                    return VioletExtKt$asFlow$1.invokeSuspend$lambda$1(this.f67966a, this.f67967b);
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
