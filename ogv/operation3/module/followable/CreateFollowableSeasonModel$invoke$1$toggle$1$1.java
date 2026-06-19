package com.bilibili.ogv.operation3.module.followable;

import kntr.common.trio.toast.ToastDuration;
import kntr.common.trio.toast.ToastGravity;
import kntr.common.trio.toast.Toaster;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/followable/CreateFollowableSeasonModel$invoke$1$toggle$1$1.class */
public final class CreateFollowableSeasonModel$invoke$1$toggle$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final l $followableSeason;
    final Toaster $toaster;
    int label;
    final h this$0;
    final CreateFollowableSeasonModel$invoke$1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFollowableSeasonModel$invoke$1$toggle$1$1(h hVar, CreateFollowableSeasonModel$invoke$1 createFollowableSeasonModel$invoke$1, l lVar, Toaster toaster, Continuation<? super CreateFollowableSeasonModel$invoke$1$toggle$1$1> continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.this$1 = createFollowableSeasonModel$invoke$1;
        this.$followableSeason = lVar;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateFollowableSeasonModel$invoke$1$toggle$1$1(this.this$0, this.this$1, this.$followableSeason, this.$toaster, continuation);
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
            com.bilibili.ogv.operation3.module.community.h hVar = this.this$0.f71350a;
            com.bilibili.ogv.operation3.module.community.i iVar = new com.bilibili.ogv.operation3.module.community.i(this.this$1.a(), this.$followableSeason.c());
            this.label = 1;
            Object objC = hVar.c(iVar, this);
            obj2 = objC;
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        Toaster toaster = this.$toaster;
        if (Result.isSuccess-impl(obj2)) {
            Toaster.showToast$default(toaster, ((com.bilibili.ogv.operation3.module.community.j) obj2).f71189a, (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
