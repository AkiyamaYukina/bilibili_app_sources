package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$favOrCancel$1.class */
final class KingPositionService$favOrCancel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $actionId;
    final String $fromSpmid;
    final String $spmid;
    int label;
    final KingPositionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingPositionService$favOrCancel$1(KingPositionService kingPositionService, String str, String str2, String str3, Continuation<? super KingPositionService$favOrCancel$1> continuation) {
        super(2, continuation);
        this.this$0 = kingPositionService;
        this.$fromSpmid = str;
        this.$spmid = str2;
        this.$actionId = str3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KingPositionService$favOrCancel$1(this.this$0, this.$fromSpmid, this.$spmid, this.$actionId, continuation);
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
            com.bilibili.playset.widget.favorite.f fVar = com.bilibili.playset.widget.favorite.f.f85754a;
            long jA = this.this$0.f100377g.a();
            int iIntValue = ((Number) this.this$0.f100367Q.getValue()).intValue();
            String str = this.$fromSpmid;
            String str2 = this.$spmid;
            String str3 = this.$actionId;
            this.label = 1;
            Object objF = fVar.f(jA, iIntValue, str, str2, str3, this);
            obj2 = objF;
            if (objF == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        KingPositionService kingPositionService = this.this$0;
        if (Result.isSuccess-impl(obj2)) {
            kingPositionService.h.n(false);
            com.bilibili.ship.theseus.united.utils.q.b(2131845692);
        }
        if (Result.exceptionOrNull-impl(obj2) != null) {
            com.bilibili.ship.theseus.united.utils.q.b(2131846937);
        }
        return Unit.INSTANCE;
    }
}
