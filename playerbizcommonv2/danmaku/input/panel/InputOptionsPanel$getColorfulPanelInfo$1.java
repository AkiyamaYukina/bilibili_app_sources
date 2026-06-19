package com.bilibili.playerbizcommonv2.danmaku.input.panel;

import com.bilibili.playerbizcommonv2.api.DanmakuColorfulPanelInfo;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/panel/InputOptionsPanel$getColorfulPanelInfo$1.class */
final class InputOptionsPanel$getColorfulPanelInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputOptionsPanel$getColorfulPanelInfo$1(l lVar, Continuation<? super InputOptionsPanel$getColorfulPanelInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InputOptionsPanel$getColorfulPanelInfo$1 inputOptionsPanel$getColorfulPanelInfo$1 = new InputOptionsPanel$getColorfulPanelInfo$1(this.this$0, continuation);
        inputOptionsPanel$getColorfulPanelInfo$1.L$0 = obj;
        return inputOptionsPanel$getColorfulPanelInfo$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        l lVar;
        l lVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                l lVar3 = this.this$0;
                Result.Companion companion = Result.Companion;
                com.bilibili.playerbizcommonv2.danmaku.input.a aVar = lVar3.f81139d;
                com.bilibili.playerbizcommonv2.danmaku.input.a aVar2 = aVar;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                    aVar2 = null;
                }
                this.L$0 = lVar3;
                this.L$1 = lVar3;
                this.label = 1;
                Object objL = aVar2.l(this);
                if (objL == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj3 = objL;
                lVar = lVar3;
                lVar2 = lVar3;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar2 = (l) this.L$1;
                lVar = (l) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj3 = obj;
            }
            lVar2.f81153s = (DanmakuColorfulPanelInfo) obj3;
            lVar.v(lVar.f81153s, true);
            obj2 = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.isFailure-impl(obj2)) {
            this.this$0.f81154t = false;
            BLog.i("InputOptionsPanelV2", "getColorfulPanelInfo error = " + Result.exceptionOrNull-impl(obj2));
        }
        return Unit.INSTANCE;
    }
}
