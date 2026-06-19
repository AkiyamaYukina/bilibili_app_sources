package com.bilibili.ogv.pub.payment.pay;

import com.bilibili.droid.ToastHelper;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/BangumiPayResultDialog$usePendant$1.class */
public final class BangumiPayResultDialog$usePendant$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $pid;
    int label;
    final BangumiPayResultDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BangumiPayResultDialog$usePendant$1(String str, BangumiPayResultDialog bangumiPayResultDialog, Continuation<? super BangumiPayResultDialog$usePendant$1> continuation) {
        super(2, continuation);
        this.$pid = str;
        this.this$0 = bangumiPayResultDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BangumiPayResultDialog$usePendant$1(this.$pid, this.this$0, continuation);
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
            d dVar = (d) ServiceGenerator.createService(d.class);
            String str = this.$pid;
            this.label = 1;
            Object objEquipPendant = dVar.equipPendant(str, this);
            obj = objEquipPendant;
            if (objEquipPendant == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        BangumiPayResultDialog bangumiPayResultDialog = this.this$0;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            ToastHelper.showToastShort(bangumiPayResultDialog.getContext(), ((BiliApiResponse.BusinessFailure) biliApiResponse).getMessage());
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            Exception exception = ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException();
            BLog.w("BangumiPayResultDialog$usePendant$1-invokeSuspend", "[ogv-pub-BangumiPayResultDialog$usePendant$1-invokeSuspend] " + exception.getMessage(), exception);
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            ToastHelper.showToastShort(bangumiPayResultDialog.getContext(), 2131835817);
        }
        return Unit.INSTANCE;
    }
}
