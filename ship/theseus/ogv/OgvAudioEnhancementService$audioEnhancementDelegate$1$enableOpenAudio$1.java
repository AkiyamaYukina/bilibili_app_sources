package com.bilibili.ship.theseus.ogv;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1.class */
public final class OgvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final RestrictionLayerVo $qualityLimit;
    private Object L$0;
    Object L$1;
    int label;
    final OgvAudioEnhancementService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1(OgvAudioEnhancementService ogvAudioEnhancementService, RestrictionLayerVo restrictionLayerVo, Continuation<? super OgvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvAudioEnhancementService;
        this.$qualityLimit = restrictionLayerVo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1 ogvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1 = new OgvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1(this.this$0, this.$qualityLimit, continuation);
        ogvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1.L$0 = obj;
        return ogvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        com.bilibili.ship.theseus.keel.player.h hVar;
        CoroutineScope coroutineScope3;
        com.bilibili.player.tangram.basic.d dVar;
        com.bilibili.player.tangram.basic.d dVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
            OgvAudioEnhancementService ogvAudioEnhancementService = this.this$0;
            com.bilibili.ship.theseus.keel.player.h hVar2 = ogvAudioEnhancementService.f91242a;
            RestrictionLayerVo restrictionLayerVo = this.$qualityLimit;
            hVar2.h(coroutineScope4);
            try {
                BackActionRepository backActionRepository = ogvAudioEnhancementService.f91246e;
                OgvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1$1$1 ogvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1$1$1 = new OgvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1$1$1(ogvAudioEnhancementService, restrictionLayerVo, null);
                this.L$0 = hVar2;
                this.L$1 = coroutineScope4;
                this.label = 1;
                if (backActionRepository.a(ogvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope2 = coroutineScope4;
                dVar2 = hVar2;
            } catch (Throwable th) {
                th = th;
                coroutineScope = coroutineScope4;
                hVar = hVar2;
                hVar.i(coroutineScope);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope2 = (CoroutineScope) this.L$1;
            com.bilibili.player.tangram.basic.d dVar3 = (com.bilibili.player.tangram.basic.d) this.L$0;
            coroutineScope3 = coroutineScope2;
            dVar = dVar3;
            try {
                ResultKt.throwOnFailure(obj);
                dVar2 = dVar3;
            } catch (Throwable th2) {
                coroutineScope = coroutineScope3;
                hVar = dVar == true ? 1 : 0;
                th = th2;
                hVar.i(coroutineScope);
                throw th;
            }
        }
        coroutineScope3 = coroutineScope2;
        dVar = dVar2 == true ? 1 : 0;
        Unit unit = Unit.INSTANCE;
        dVar2.i(coroutineScope2);
        return Unit.INSTANCE;
    }
}
