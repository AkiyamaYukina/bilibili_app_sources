package com.bilibili.playerbizcommon.input.panels;

import com.bilibili.playerbizcommon.api.DanmakuColorfulPanelInfo;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/InputOptionsPanel$getColorfulPanelInfo$1.class */
final class InputOptionsPanel$getColorfulPanelInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputOptionsPanel$getColorfulPanelInfo$1(i iVar, Continuation<? super InputOptionsPanel$getColorfulPanelInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = iVar;
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
        Object objL;
        i iVar;
        i iVar2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                i iVar3 = this.this$0;
                Result.Companion companion = Result.Companion;
                Cq0.b bVar = iVar3.f80192d;
                Cq0.b bVar2 = bVar;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mInputController");
                    bVar2 = null;
                }
                this.L$0 = iVar3;
                this.L$1 = iVar3;
                this.label = 1;
                objL = bVar2.l(this);
                if (objL == coroutine_suspended) {
                    return coroutine_suspended;
                }
                iVar = iVar3;
                iVar2 = iVar3;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar2 = (i) this.L$1;
                iVar = (i) this.L$0;
                ResultKt.throwOnFailure(obj);
                objL = obj;
            }
            iVar2.f80207t = (DanmakuColorfulPanelInfo) objL;
            iVar.w(iVar.f80207t, true);
            obj2 = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.isFailure-impl(obj2)) {
            this.this$0.f80208u = false;
            BLog.i("InputOptionsPanel", "getColorfulPanelInfo error = " + Result.exceptionOrNull-impl(obj2));
        }
        return Unit.INSTANCE;
    }
}
