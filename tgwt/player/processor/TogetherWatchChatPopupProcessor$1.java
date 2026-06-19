package com.bilibili.tgwt.player.processor;

import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.tgwt.player.widget.PlayerChatPopupLayer;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/TogetherWatchChatPopupProcessor$1.class */
final class TogetherWatchChatPopupProcessor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchChatPopupProcessor$1(f fVar, Continuation<? super TogetherWatchChatPopupProcessor$1> continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchChatPopupProcessor$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        f fVar;
        f fVar2;
        PlayerChatPopupLayer playerChatPopupLayer;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            fVar = this.this$0;
            try {
                this.L$0 = fVar;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fVar2 = fVar;
            } catch (Throwable th) {
                th = th;
                if (fVar.f111648i) {
                    playerChatPopupLayer.b();
                }
                fVar.h = null;
                e eVar = fVar.f111649j;
                BangumiPlayerContainerService bangumiPlayerContainerService = fVar.f111641a;
                bangumiPlayerContainerService.removeOnWidgetStateChangeListener(eVar);
                bangumiPlayerContainerService.getPlayerServiceController().y(fVar.f111650k);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar3 = (f) this.L$0;
            fVar = fVar3;
            try {
                ResultKt.throwOnFailure(obj);
                fVar2 = fVar3;
            } catch (Throwable th2) {
                th = th2;
                if (fVar.f111648i && (playerChatPopupLayer = fVar.h) != null) {
                    playerChatPopupLayer.b();
                }
                fVar.h = null;
                e eVar2 = fVar.f111649j;
                BangumiPlayerContainerService bangumiPlayerContainerService2 = fVar.f111641a;
                bangumiPlayerContainerService2.removeOnWidgetStateChangeListener(eVar2);
                bangumiPlayerContainerService2.getPlayerServiceController().y(fVar.f111650k);
                throw th;
            }
        }
        fVar = fVar2;
        throw new KotlinNothingValueException();
    }
}
