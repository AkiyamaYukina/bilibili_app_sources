package com.bilibili.biligame.booktri.benefit;

import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.bean.GameOfficialInfo;
import com.bilibili.biligame.api.call.BiliGameCall;
import com.bilibili.biligame.utils.BiliCallGameExsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/BookTriBenefitViewModel$bookWithRiskControl$1$wxOfficialInfoDeferred$1.class */
public final class BookTriBenefitViewModel$bookWithRiskControl$1$wxOfficialInfoDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GameOfficialInfo>, Object> {
    final int $gameBaseId;
    private Object L$0;
    int label;
    final h0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookTriBenefitViewModel$bookWithRiskControl$1$wxOfficialInfoDeferred$1(h0 h0Var, int i7, Continuation<? super BookTriBenefitViewModel$bookWithRiskControl$1$wxOfficialInfoDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = h0Var;
        this.$gameBaseId = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BookTriBenefitViewModel$bookWithRiskControl$1$wxOfficialInfoDeferred$1 bookTriBenefitViewModel$bookWithRiskControl$1$wxOfficialInfoDeferred$1 = new BookTriBenefitViewModel$bookWithRiskControl$1$wxOfficialInfoDeferred$1(this.this$0, this.$gameBaseId, continuation);
        bookTriBenefitViewModel$bookWithRiskControl$1$wxOfficialInfoDeferred$1.L$0 = obj;
        return bookTriBenefitViewModel$bookWithRiskControl$1$wxOfficialInfoDeferred$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GameOfficialInfo> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                h0 h0Var = this.this$0;
                int i8 = this.$gameBaseId;
                Result.Companion companion = Result.Companion;
                BiliGameCall<BiligameApiResponse<GameOfficialInfo>> wxOfficialInfo = h0Var.getApiService().getWxOfficialInfo(i8);
                this.label = 1;
                Object objGameAwait = BiliCallGameExsKt.gameAwait(wxOfficialInfo, this);
                obj = objGameAwait;
                if (objGameAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            obj2 = Result.constructor-impl((GameOfficialInfo) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Object obj3 = obj2;
        if (Result.isFailure-impl(obj2)) {
            obj3 = null;
        }
        return obj3;
    }
}
