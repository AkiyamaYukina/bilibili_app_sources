package com.bilibili.playerbizcommonv2.service.ai;

import com.bilibili.lib.media.resource.LanguageItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/ai/PlayerAiService$switchLanguage$1.class */
public final class PlayerAiService$switchLanguage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final LanguageItem $languageItem;
    int label;
    final PlayerAiService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerAiService$switchLanguage$1(PlayerAiService playerAiService, LanguageItem languageItem, Continuation<? super PlayerAiService$switchLanguage$1> continuation) {
        super(2, continuation);
        this.this$0 = playerAiService;
        this.$languageItem = languageItem;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerAiService$switchLanguage$1(this.this$0, this.$languageItem, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SuspendLambda suspendLambda = this.this$0.f81843j;
            if (suspendLambda != null) {
                LanguageItem languageItem = this.$languageItem;
                this.label = 1;
                if (suspendLambda.invoke(languageItem, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
