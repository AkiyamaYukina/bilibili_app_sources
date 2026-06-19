package com.bilibili.pegasus.promo.setting;

import com.bilibili.app.comm.list.common.feed.PegasusStyleEnum;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/promo/setting/RecommendColumnSettingFragment$onCreateView$1$1$1$1$1$3$1$1.class */
final class RecommendColumnSettingFragment$onCreateView$1$1$1$1$1$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final RecommendColumnSettingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendColumnSettingFragment$onCreateView$1$1$1$1$1$3$1$1(RecommendColumnSettingFragment recommendColumnSettingFragment, Continuation<? super RecommendColumnSettingFragment$onCreateView$1$1$1$1$1$3$1$1> continuation) {
        super(2, continuation);
        this.this$0 = recommendColumnSettingFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecommendColumnSettingFragment$onCreateView$1$1$1$1$1$3$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        RecommendColumnSettingFragment.kf(this.this$0, PegasusStyleEnum.USER_DOUBLE_COLUMN);
        return Unit.INSTANCE;
    }
}
