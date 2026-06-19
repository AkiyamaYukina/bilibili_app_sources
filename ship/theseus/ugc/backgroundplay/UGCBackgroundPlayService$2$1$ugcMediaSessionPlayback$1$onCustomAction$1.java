package com.bilibili.ship.theseus.ugc.backgroundplay;

import O4.d;
import com.bilibili.bangumi.logic.page.detail.service.f;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/backgroundplay/UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1$onCustomAction$1.class */
public final class UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1$onCustomAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UGCBackgroundPlayService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1$onCustomAction$1(UGCBackgroundPlayService uGCBackgroundPlayService, Continuation<? super UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1$onCustomAction$1> continuation) {
        super(2, continuation);
        this.this$0 = uGCBackgroundPlayService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1$onCustomAction$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            RelationRepository relationRepository = this.this$0.f96306e;
            this.label = 1;
            Object objD = relationRepository.d(this);
            obj2 = objD;
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        UGCBackgroundPlayService uGCBackgroundPlayService = this.this$0;
        if (Result.isSuccess-impl(obj2)) {
            uGCBackgroundPlayService.f96311k.updatePlaybackState();
        }
        Throwable th = Result.exceptionOrNull-impl(obj2);
        if (th != null) {
            f.a("[theseus-ugc-UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1$onCustomAction$1-invokeSuspend] ", d.a("like video failed, error:", th), "UGCBackgroundPlayService$2$1$ugcMediaSessionPlayback$1$onCustomAction$1-invokeSuspend", (Throwable) null);
        }
        return Unit.INSTANCE;
    }
}
