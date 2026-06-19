package com.bilibili.ship.theseus.united.utils;

import com.bilibili.ship.theseus.united.utils.TheseusPlayContainerXKt$cloudConfigFlow$1;
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
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/TheseusPlayContainerXKt$cloudConfigFlow$1.class */
public final class TheseusPlayContainerXKt$cloudConfigFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super Oi1.d>, Continuation<? super Unit>, Object> {
    final IPlayerSettingService $this_cloudConfigFlow;
    private Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/TheseusPlayContainerXKt$cloudConfigFlow$1$a.class */
    public static final class a implements tv.danmaku.biliplayerv2.service.setting.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProducerScope<Oi1.d> f104840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IPlayerSettingService f104841b;

        public a(ProducerScope<? super Oi1.d> producerScope, IPlayerSettingService iPlayerSettingService) {
            this.f104840a = producerScope;
            this.f104841b = iPlayerSettingService;
        }

        public final void c() {
            ChannelsKt.trySendBlocking(this.f104840a, this.f104841b.getCloudConfig());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayContainerXKt$cloudConfigFlow$1(IPlayerSettingService iPlayerSettingService, Continuation<? super TheseusPlayContainerXKt$cloudConfigFlow$1> continuation) {
        super(2, continuation);
        this.$this_cloudConfigFlow = iPlayerSettingService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(IPlayerSettingService iPlayerSettingService, a aVar) {
        iPlayerSettingService.removeCloudConfigObserver(aVar);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusPlayContainerXKt$cloudConfigFlow$1 theseusPlayContainerXKt$cloudConfigFlow$1 = new TheseusPlayContainerXKt$cloudConfigFlow$1(this.$this_cloudConfigFlow, continuation);
        theseusPlayContainerXKt$cloudConfigFlow$1.L$0 = obj;
        return theseusPlayContainerXKt$cloudConfigFlow$1;
    }

    public final Object invoke(ProducerScope<? super Oi1.d> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            IPlayerSettingService iPlayerSettingService = this.$this_cloudConfigFlow;
            final a aVar = new a(producerScope, iPlayerSettingService);
            ChannelsKt.trySendBlocking(producerScope, iPlayerSettingService.getCloudConfig());
            this.$this_cloudConfigFlow.addCloudConfigObserver(aVar);
            final IPlayerSettingService iPlayerSettingService2 = this.$this_cloudConfigFlow;
            Function0 function0 = new Function0(iPlayerSettingService2, aVar) { // from class: com.bilibili.ship.theseus.united.utils.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final IPlayerSettingService f104870a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TheseusPlayContainerXKt$cloudConfigFlow$1.a f104871b;

                {
                    this.f104870a = iPlayerSettingService2;
                    this.f104871b = aVar;
                }

                public final Object invoke() {
                    return TheseusPlayContainerXKt$cloudConfigFlow$1.invokeSuspend$lambda$0(this.f104870a, this.f104871b);
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
