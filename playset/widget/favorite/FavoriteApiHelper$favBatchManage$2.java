package com.bilibili.playset.widget.favorite;

import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteApiHelper$favBatchManage$2.class */
final class FavoriteApiHelper$favBatchManage$2 extends SuspendLambda implements Function1<Continuation<? super FavoriteChangeResponse>, Object> {
    final String $action;
    final Long $mediaId;
    final String $resources;
    final String $targetMediaIds;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteApiHelper$favBatchManage$2(String str, String str2, String str3, Long l7, Continuation<? super FavoriteApiHelper$favBatchManage$2> continuation) {
        super(1, continuation);
        this.$resources = str;
        this.$targetMediaIds = str2;
        this.$action = str3;
        this.$mediaId = l7;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FavoriteApiHelper$favBatchManage$2(this.$resources, this.$targetMediaIds, this.$action, this.$mediaId, continuation);
    }

    public final Object invoke(Continuation<? super FavoriteChangeResponse> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BiliCall<GeneralResponse<FavoriteChangeResponse>> biliCallFavBatchManage = ((FavoriteService) ServiceGenerator.createService(FavoriteService.class)).favBatchManage(this.$resources, this.$targetMediaIds, this.$action, this.$mediaId);
            this.label = 1;
            Object data = BiliCallExtKt.getData(biliCallFavBatchManage, this);
            obj = data;
            if (data == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
