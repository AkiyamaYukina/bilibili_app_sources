package com.bilibili.ship.theseus.ogv.videocard;

import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.response.BiliApiResponse;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$reportOperationCardShown$1.class */
final class OgvVideoCardService$reportOperationCardShown$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $bizType;
    final int $cardType;
    final long $epId;
    final long $seasonId;
    final String $winId;
    int label;
    final OgvVideoCardService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVideoCardService$reportOperationCardShown$1(OgvVideoCardService ogvVideoCardService, long j7, long j8, int i7, int i8, String str, Continuation<? super OgvVideoCardService$reportOperationCardShown$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvVideoCardService;
        this.$seasonId = j7;
        this.$epId = j8;
        this.$cardType = i7;
        this.$bizType = i8;
        this.$winId = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvVideoCardService$reportOperationCardShown$1(this.this$0, this.$seasonId, this.$epId, this.$cardType, this.$bizType, this.$winId, continuation);
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
            OgvVideoCardApiService ogvVideoCardApiService = this.this$0.f94643n;
            long j7 = this.$seasonId;
            long j8 = this.$epId;
            int i8 = this.$cardType;
            int i9 = this.$bizType;
            String str = this.$winId;
            this.label = 1;
            Object objReportOperationCardShown = ogvVideoCardApiService.reportOperationCardShown(j7, j8, i8, i9, str, this);
            obj = objReportOperationCardShown;
            if (objReportOperationCardShown == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        OgvVideoCardService ogvVideoCardService = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BLog.e("OgvVideoCardService$reportOperationCardShown$1-invokeSuspend", "[theseus-ogv-OgvVideoCardService$reportOperationCardShown$1-invokeSuspend] report operation card shown error", new BiliApiException(businessFailure.getCode(), businessFailure.getMessage()));
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            BLog.e("OgvVideoCardService$reportOperationCardShown$1-invokeSuspend", "[theseus-ogv-OgvVideoCardService$reportOperationCardShown$1-invokeSuspend] report operation card shown error", ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException());
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ogvVideoCardService.f94651v = (Map) ((BiliApiResponse.Success) biliApiResponse).getData();
        }
        return Unit.INSTANCE;
    }
}
