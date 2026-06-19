package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.okretro.response.BiliApiResponseKt;
import com.bilibili.playerbizcommonv2.widget.share.ShareLoadingDialog;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyRecordShareService$share$1$shareInfo$1.class */
public final class CheeseStudyRecordShareService$share$1$shareInfo$1 extends SuspendLambda implements Function2<ShareLoadingDialog, Continuation<? super StudyShareInfo>, Object> {
    final long $duration;
    final long $epId;
    int label;
    final B this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseStudyRecordShareService$share$1$shareInfo$1(B b7, long j7, long j8, Continuation<? super CheeseStudyRecordShareService$share$1$shareInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = b7;
        this.$duration = j7;
        this.$epId = j8;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseStudyRecordShareService$share$1$shareInfo$1(this.this$0, this.$duration, this.$epId, continuation);
    }

    public final Object invoke(ShareLoadingDialog shareLoadingDialog, Continuation<? super StudyShareInfo> continuation) {
        return create(shareLoadingDialog, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            C c7 = (C) ServiceGenerator.createService(C.class);
            long j7 = this.this$0.f90137d.f117531a;
            long j8 = this.$duration;
            long j9 = this.$epId;
            this.label = 1;
            Object studyShareInfo = c7.getStudyShareInfo(j7, j8, j9, this);
            obj = studyShareInfo;
            if (studyShareInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Object objAsResult = BiliApiResponseKt.asResult((BiliApiResponse) obj);
        Object obj2 = objAsResult;
        if (Result.isFailure-impl(objAsResult)) {
            obj2 = null;
        }
        return obj2;
    }
}
