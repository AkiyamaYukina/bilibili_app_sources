package com.bilibili.ship.theseus.united.utils;

import com.bilibili.ship.theseus.united.utils.TheseusPlayContainerXKt$screenTypeFlow$1;
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
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/TheseusPlayContainerXKt$screenTypeFlow$1.class */
public final class TheseusPlayContainerXKt$screenTypeFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super ScreenModeType>, Continuation<? super Unit>, Object> {
    final IControlContainerService $this_screenTypeFlow;
    private Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/TheseusPlayContainerXKt$screenTypeFlow$1$a.class */
    public static final class a implements ControlContainerObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProducerScope<ScreenModeType> f104842a;

        public a(ProducerScope<? super ScreenModeType> producerScope) {
            this.f104842a = producerScope;
        }

        public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
            ChannelsKt.trySendBlocking(this.f104842a, screenModeType);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayContainerXKt$screenTypeFlow$1(IControlContainerService iControlContainerService, Continuation<? super TheseusPlayContainerXKt$screenTypeFlow$1> continuation) {
        super(2, continuation);
        this.$this_screenTypeFlow = iControlContainerService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(IControlContainerService iControlContainerService, a aVar) {
        iControlContainerService.unregisterState(aVar);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusPlayContainerXKt$screenTypeFlow$1 theseusPlayContainerXKt$screenTypeFlow$1 = new TheseusPlayContainerXKt$screenTypeFlow$1(this.$this_screenTypeFlow, continuation);
        theseusPlayContainerXKt$screenTypeFlow$1.L$0 = obj;
        return theseusPlayContainerXKt$screenTypeFlow$1;
    }

    public final Object invoke(ProducerScope<? super ScreenModeType> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            final a aVar = new a(producerScope);
            ChannelsKt.trySendBlocking(producerScope, this.$this_screenTypeFlow.getScreenModeType());
            this.$this_screenTypeFlow.registerState(aVar);
            final IControlContainerService iControlContainerService = this.$this_screenTypeFlow;
            Function0 function0 = new Function0(iControlContainerService, aVar) { // from class: com.bilibili.ship.theseus.united.utils.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final IControlContainerService f104872a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TheseusPlayContainerXKt$screenTypeFlow$1.a f104873b;

                {
                    this.f104872a = iControlContainerService;
                    this.f104873b = aVar;
                }

                public final Object invoke() {
                    return TheseusPlayContainerXKt$screenTypeFlow$1.invokeSuspend$lambda$0(this.f104872a, this.f104873b);
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
