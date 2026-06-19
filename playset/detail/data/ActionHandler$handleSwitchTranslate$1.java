package com.bilibili.playset.detail.data;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import q4.M;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/ActionHandler$handleSwitchTranslate$1.class */
final class ActionHandler$handleSwitchTranslate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.playset.api.c $item;
    int label;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionHandler$handleSwitchTranslate$1(b bVar, com.bilibili.playset.api.c cVar, Continuation<? super ActionHandler$handleSwitchTranslate$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$item = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActionHandler$handleSwitchTranslate$1(this.this$0, this.$item, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                b bVar = this.this$0;
                com.bilibili.playset.api.c cVar = this.$item;
                bVar.getClass();
                cVar.q(10);
                com.bilibili.playset.api.c cVar2 = this.$item;
                this.label = 1;
                Object objB = com.bilibili.playset.api.e.b(cVar2, this);
                obj = objB;
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            str = (String) obj;
        } catch (Exception e7) {
            M.b("translate error: ", e7.getMessage(), "ActionHandler");
            b bVar2 = this.this$0;
            com.bilibili.playset.api.c cVar3 = this.$item;
            bVar2.getClass();
            cVar3.q(1);
        }
        if (str == null || StringsKt.isBlank(str)) {
            throw new IllegalStateException("Check failed.");
        }
        b bVar3 = this.this$0;
        com.bilibili.playset.api.c cVar4 = this.$item;
        bVar3.getClass();
        if (str != null && !StringsKt.isBlank(str)) {
            cVar4.h(str);
        }
        cVar4.q(2);
        return Unit.INSTANCE;
    }
}
