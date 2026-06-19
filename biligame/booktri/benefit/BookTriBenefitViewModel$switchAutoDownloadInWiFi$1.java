package com.bilibili.biligame.booktri.benefit;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.BiligameApiService;
import com.bilibili.biligame.api.book.AutoDownloadStatus;
import com.bilibili.biligame.utils.BiliCallGameExsKt;
import com.bilibili.okretro.call.BiliCall;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/BookTriBenefitViewModel$switchAutoDownloadInWiFi$1.class */
final class BookTriBenefitViewModel$switchAutoDownloadInWiFi$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $enabled;
    final int $gameBaseId;
    int label;
    final h0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookTriBenefitViewModel$switchAutoDownloadInWiFi$1(boolean z6, h0 h0Var, int i7, Continuation<? super BookTriBenefitViewModel$switchAutoDownloadInWiFi$1> continuation) {
        super(2, continuation);
        this.$enabled = z6;
        this.this$0 = h0Var;
        this.$gameBaseId = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BookTriBenefitViewModel$switchAutoDownloadInWiFi$1(this.$enabled, this.this$0, this.$gameBaseId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z6 = this.$enabled;
                BiligameApiService apiService = this.this$0.getApiService();
                AutoDownloadStatus autoDownloadStatus = this.this$0.h;
                BiliCall<BiligameApiResponse<JSONObject>> biliCallSwitchAutoDownloadInWiFi = apiService.switchAutoDownloadInWiFi(autoDownloadStatus != null ? autoDownloadStatus.getGameBaseId() : this.$gameBaseId, z6 ? 1 : 0);
                this.label = 1;
                if (BiliCallGameExsKt.gameAwait(biliCallSwitchAutoDownloadInWiFi, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e7) {
        }
        return Unit.INSTANCE;
    }
}
