package com.bilibili.upper.module.manuscript.vm;

import com.bilibili.upper.module.manuscript.bean.ManuscriptOpenEntity;
import com.bilibili.upper.module.manuscript.repository.e;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ManuscriptProgressDetailsViewModel$requestAllData$1$openTaskResult$1.class */
public final class ManuscriptProgressDetailsViewModel$requestAllData$1$openTaskResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ManuscriptOpenEntity>>, Object> {
    final long $aid;
    int label;
    final ManuscriptProgressDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManuscriptProgressDetailsViewModel$requestAllData$1$openTaskResult$1(long j7, ManuscriptProgressDetailsViewModel manuscriptProgressDetailsViewModel, Continuation<? super ManuscriptProgressDetailsViewModel$requestAllData$1$openTaskResult$1> continuation) {
        super(2, continuation);
        this.$aid = j7;
        this.this$0 = manuscriptProgressDetailsViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ManuscriptProgressDetailsViewModel$requestAllData$1$openTaskResult$1(this.$aid, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ManuscriptOpenEntity>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$aid <= 0) {
                Result.Companion companion = Result.Companion;
                ManuscriptOpenEntity manuscriptOpenEntity = new ManuscriptOpenEntity();
                manuscriptOpenEntity.open_state = 0;
                obj2 = Result.constructor-impl(manuscriptOpenEntity);
            } else {
                e eVarI0 = ManuscriptProgressDetailsViewModel.I0(this.this$0);
                long j7 = this.$aid;
                this.label = 1;
                Object objB = eVarI0.b(j7, this);
                obj2 = objB;
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        return Result.box-impl(obj2);
    }
}
