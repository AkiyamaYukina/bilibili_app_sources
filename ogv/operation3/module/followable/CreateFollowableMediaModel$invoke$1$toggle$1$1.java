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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/followable/CreateFollowableMediaModel$invoke$1$toggle$1$1.class */
public final class CreateFollowableMediaModel$invoke$1$toggle$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final j $followableMedia;
    final Toaster $toaster;
    int label;
    final f this$0;
    final CreateFollowableMediaModel$invoke$1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFollowableMediaModel$invoke$1$toggle$1$1(f fVar, j jVar, CreateFollowableMediaModel$invoke$1 createFollowableMediaModel$invoke$1, Toaster toaster, Continuation<? super CreateFollowableMediaModel$invoke$1$toggle$1$1> continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$followableMedia = jVar;
        this.this$1 = createFollowableMediaModel$invoke$1;
        this.$toaster = toaster;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateFollowableMediaModel$invoke$1$toggle$1$1(this.this$0, this.$followableMedia, this.this$1, this.$toaster, continuation);
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
            com.bilibili.ogv.operation3.module.community.f fVar = this.this$0.f71343a;
            long jA = this.$followableMedia.a();
            boolean zA = this.this$1.a();
            this.label = 1;
            Object objA = fVar.a(jA, this, zA);
            obj2 = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        CreateFollowableMediaModel$invoke$1 createFollowableMediaModel$invoke$1 = this.this$1;
        Toaster toaster = this.$toaster;
        if (Result.isSuccess-impl(obj2)) {
            createFollowableMediaModel$invoke$1.f71323b.setValue(Boolean.valueOf(!createFollowableMediaModel$invoke$1.a()));
            Toaster.showToast$default(toaster, ((com.bilibili.ogv.operation3.module.community.g) obj2).f71178a, (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
