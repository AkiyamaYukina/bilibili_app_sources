package com.bilibili.ship.theseus.ogv;

import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1$1$1.class */
public final class OgvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final RestrictionLayerVo $qualityLimit;
    int label;
    final OgvAudioEnhancementService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1$1$1(OgvAudioEnhancementService ogvAudioEnhancementService, RestrictionLayerVo restrictionLayerVo, Continuation<? super OgvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = ogvAudioEnhancementService;
        this.$qualityLimit = restrictionLayerVo;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OgvAudioEnhancementService$audioEnhancementDelegate$1$enableOpenAudio$1$1$1(this.this$0, this.$qualityLimit, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.united.page.restrictionlayer.G g7 = this.this$0.f91245d;
            RestrictionLayerVo restrictionLayerVo = this.$qualityLimit;
            this.label = 1;
            if (com.bilibili.ship.theseus.united.page.restrictionlayer.G.c(g7, restrictionLayerVo, false, true, null, true, null, this, 42) == coroutine_suspended) {
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
