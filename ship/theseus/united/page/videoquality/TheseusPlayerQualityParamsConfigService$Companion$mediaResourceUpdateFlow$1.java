package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityParamsConfigService$Companion$mediaResourceUpdateFlow$1;
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
import tv.danmaku.biliplayerv2.service.IMediaResourceObserver;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityParamsConfigService$Companion$mediaResourceUpdateFlow$1.class */
final class TheseusPlayerQualityParamsConfigService$Companion$mediaResourceUpdateFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super MediaResource>, Continuation<? super Unit>, Object> {
    final IPlayerCoreService $this_mediaResourceUpdateFlow;
    private Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityParamsConfigService$Companion$mediaResourceUpdateFlow$1$a.class */
    public static final class a implements IMediaResourceObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProducerScope<MediaResource> f103773a;

        public a(ProducerScope<? super MediaResource> producerScope) {
            this.f103773a = producerScope;
        }

        public final void onUpdated(MediaResource mediaResource) {
            ChannelsKt.trySendBlocking(this.f103773a, mediaResource);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerQualityParamsConfigService$Companion$mediaResourceUpdateFlow$1(IPlayerCoreService iPlayerCoreService, Continuation<? super TheseusPlayerQualityParamsConfigService$Companion$mediaResourceUpdateFlow$1> continuation) {
        super(2, continuation);
        this.$this_mediaResourceUpdateFlow = iPlayerCoreService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(IPlayerCoreService iPlayerCoreService, a aVar) {
        iPlayerCoreService.removeMediaResourceObserver(aVar);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusPlayerQualityParamsConfigService$Companion$mediaResourceUpdateFlow$1 theseusPlayerQualityParamsConfigService$Companion$mediaResourceUpdateFlow$1 = new TheseusPlayerQualityParamsConfigService$Companion$mediaResourceUpdateFlow$1(this.$this_mediaResourceUpdateFlow, continuation);
        theseusPlayerQualityParamsConfigService$Companion$mediaResourceUpdateFlow$1.L$0 = obj;
        return theseusPlayerQualityParamsConfigService$Companion$mediaResourceUpdateFlow$1;
    }

    public final Object invoke(ProducerScope<? super MediaResource> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            final a aVar = new a(producerScope);
            this.$this_mediaResourceUpdateFlow.addMediaResourceObserver(aVar);
            final IPlayerCoreService iPlayerCoreService = this.$this_mediaResourceUpdateFlow;
            Function0 function0 = new Function0(iPlayerCoreService, aVar) { // from class: com.bilibili.ship.theseus.united.page.videoquality.W

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final IPlayerCoreService f103842a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TheseusPlayerQualityParamsConfigService$Companion$mediaResourceUpdateFlow$1.a f103843b;

                {
                    this.f103842a = iPlayerCoreService;
                    this.f103843b = aVar;
                }

                public final Object invoke() {
                    return TheseusPlayerQualityParamsConfigService$Companion$mediaResourceUpdateFlow$1.invokeSuspend$lambda$0(this.f103842a, this.f103843b);
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
