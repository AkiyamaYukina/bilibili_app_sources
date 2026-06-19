package com.bilibili.ship.theseus.united.page.card;

import com.bilibili.biligame.videocard.GameRetUserCard;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/card/VideoGameRetUserService$2$invokeSuspend$$inlined$awaitCancel$1.class */
public final class VideoGameRetUserService$2$invokeSuspend$$inlined$awaitCancel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final VideoGameRetUserService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoGameRetUserService$2$invokeSuspend$$inlined$awaitCancel$1(Continuation continuation, VideoGameRetUserService videoGameRetUserService) {
        super(2, continuation);
        this.this$0 = videoGameRetUserService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoGameRetUserService$2$invokeSuspend$$inlined$awaitCancel$1(continuation, this.this$0);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            VideoGameRetUserService videoGameRetUserService = this.this$0;
            GameRetUserCard gameRetUserCard = videoGameRetUserService.f99084f;
            if (gameRetUserCard != null) {
                gameRetUserCard.detach();
            }
            videoGameRetUserService.f99084f = null;
            throw th;
        }
    }
}
