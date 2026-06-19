package com.bilibili.ship.theseus.ogv.activity;

import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityApiService;
import com.bilibili.ship.theseus.ogv.activity.invitation.OgvInvitationActivityBottomDialog;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TaskParamVo;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$runOperationTask$1.class */
public final class OgvActivityService$runOperationTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final TaskParamVo $taskParamVo;
    int label;
    final OgvActivityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvActivityService$runOperationTask$1(TaskParamVo taskParamVo, OgvActivityService ogvActivityService, Continuation<? super OgvActivityService$runOperationTask$1> continuation) {
        super(2, continuation);
        this.$taskParamVo = taskParamVo;
        this.this$0 = ogvActivityService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvActivityService$runOperationTask$1(this.$taskParamVo, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TaskParamVo taskParamVo = this.$taskParamVo;
            if (taskParamVo != null) {
                if (taskParamVo.f102701a == 0) {
                    taskParamVo = null;
                }
                if (taskParamVo != null) {
                    OgvActivityApiService.f91342a.getClass();
                    OgvActivityApiService ogvActivityApiService = OgvActivityApiService.a.f91344b;
                    OgvActivityService ogvActivityService = this.this$0;
                    long j7 = ogvActivityService.f91390c.f94449a;
                    OgvEpisode ogvEpisodeC = ogvActivityService.f91391d.c();
                    long j8 = ogvEpisodeC != null ? ogvEpisodeC.f93555a : 0L;
                    Map<String, String> mapA = taskParamVo.a();
                    this.label = 1;
                    Object activityMaterial = ogvActivityApiService.getActivityMaterial(j7, j8, mapA, this);
                    obj = activityMaterial;
                    if (activityMaterial == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        OgvActivityService ogvActivityService2 = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BiliApiException biliApiException = new BiliApiException(businessFailure.getCode(), businessFailure.getMessage());
            BLog.e("OgvActivityService$runOperationTask$1-invokeSuspend", "[theseus-ogv-OgvActivityService$runOperationTask$1-invokeSuspend] " + biliApiException.getMessage(), biliApiException);
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            Exception exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            com.bilibili.biligame.dialogdispatcher.e.a("[theseus-ogv-OgvActivityService$runOperationTask$1-invokeSuspend] ", exception.getMessage(), "OgvActivityService$runOperationTask$1-invokeSuspend", exception);
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            OgvActivityVo ogvActivityVo = (OgvActivityVo) ((BiliApiResponse.Success) biliApiResponse).getData();
            OgvInvitationActivityHostVo ogvInvitationActivityHostVoE = ogvActivityVo.e();
            OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVoA = null;
            if (ogvInvitationActivityHostVoE != null) {
                ogvInvitationActivityBackgroundVoA = ogvInvitationActivityHostVoE.a();
            }
            if (ogvInvitationActivityBackgroundVoA != null) {
                new OgvInvitationActivityBottomDialog(ogvActivityService2.f91389b, ogvActivityVo.e(), ogvActivityVo.a(), ogvActivityService2, ogvActivityService2.f91400n.a(), ogvActivityService2.f91392e).show();
            }
        }
        return Unit.INSTANCE;
    }
}
