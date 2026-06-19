package com.bilibili.playset.widget.favorite;

import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.okretro.call.json.JsonUtilKt;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteApiHelper$getAllFavCatching$2.class */
final class FavoriteApiHelper$getAllFavCatching$2 extends SuspendLambda implements Function1<Continuation<? super PlaySetPageData>, Object> {
    final Map<String, String> $extraInfo;
    final long $mid;
    final long $resourceId;
    final boolean $showSeason;
    final int $type;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteApiHelper$getAllFavCatching$2(long j7, long j8, int i7, boolean z6, Map<String, String> map, Continuation<? super FavoriteApiHelper$getAllFavCatching$2> continuation) {
        super(1, continuation);
        this.$mid = j7;
        this.$resourceId = j8;
        this.$type = i7;
        this.$showSeason = z6;
        this.$extraInfo = map;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FavoriteApiHelper$getAllFavCatching$2(this.$mid, this.$resourceId, this.$type, this.$showSeason, this.$extraInfo, continuation);
    }

    public final Object invoke(Continuation<? super PlaySetPageData> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            String accessKey = BiliAccounts.get(FoundationAlias.getFapp()).getAccessKey();
            long j7 = this.$mid;
            long j8 = this.$resourceId;
            int i8 = this.$type;
            BiliCall<GeneralResponse<PlaySetPageData>> createdPlaySetAll = ((FavoriteService) ServiceGenerator.createService(FavoriteService.class)).getCreatedPlaySetAll(accessKey, j7, String.valueOf(j8), String.valueOf(i8), this.$showSeason, JsonUtilKt.toJson(this.$extraInfo));
            this.label = 1;
            Object data = BiliCallExtKt.getData(createdPlaySetAll, this);
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
