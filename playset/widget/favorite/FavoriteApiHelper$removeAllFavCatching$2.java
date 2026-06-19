package com.bilibili.playset.widget.favorite;

import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.google.gson.JsonObject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteApiHelper$removeAllFavCatching$2.class */
final class FavoriteApiHelper$removeAllFavCatching$2 extends SuspendLambda implements Function1<Continuation<? super JsonObject>, Object> {
    final String $actionId;
    final String $fromSpmid;
    final long $resourceId;
    final int $resourceType;
    final String $spmid;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteApiHelper$removeAllFavCatching$2(long j7, int i7, String str, String str2, String str3, Continuation<? super FavoriteApiHelper$removeAllFavCatching$2> continuation) {
        super(1, continuation);
        this.$resourceId = j7;
        this.$resourceType = i7;
        this.$fromSpmid = str;
        this.$spmid = str2;
        this.$actionId = str3;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FavoriteApiHelper$removeAllFavCatching$2(this.$resourceId, this.$resourceType, this.$fromSpmid, this.$spmid, this.$actionId, continuation);
    }

    public final Object invoke(Continuation<? super JsonObject> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BiliCall<GeneralResponse<JsonObject>> biliCallRemoveFavorite = ((FavoriteService) ServiceGenerator.createService(FavoriteService.class)).removeFavorite(this.$resourceId, this.$resourceType, this.$fromSpmid, this.$spmid, this.$actionId);
            this.label = 1;
            Object data = BiliCallExtKt.getData(biliCallRemoveFavorite, this);
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
