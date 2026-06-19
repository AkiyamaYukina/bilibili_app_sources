package com.bilibili.search2.result.holder.special;

import Ps0.C2794o;
import com.bapis.bilibili.polymer.app.search.v1.SearchMoss;
import com.bapis.bilibili.polymer.app.search.v1.SearchMossKtxKt;
import com.bapis.bilibili.polymer.app.search.v1.SearchReserveRequest;
import com.bapis.bilibili.polymer.app.search.v1.SearchReserveResponse;
import com.bilibili.api.BiliApiException;
import com.bilibili.lib.moss.api.BusinessException;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.okretro.BiliApiDataCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/special/SpecialSOrderHelper$doOrder$1.class */
final class SpecialSOrderHelper$doOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final BiliApiDataCallback<C2794o> $callback;
    final String $oid;
    final long $sid;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialSOrderHelper$doOrder$1(long j7, String str, BiliApiDataCallback<C2794o> biliApiDataCallback, Continuation<? super SpecialSOrderHelper$doOrder$1> continuation) {
        super(2, continuation);
        this.$sid = j7;
        this.$oid = str;
        this.$callback = biliApiDataCallback;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpecialSOrderHelper$doOrder$1(this.$sid, this.$oid, this.$callback, continuation);
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
                SearchReserveRequest searchReserveRequestBuild = SearchReserveRequest.newBuilder().setSid(this.$sid).setOid(this.$oid).build();
                SearchMoss searchMoss = new SearchMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
                this.label = 1;
                Object objSuspendSearchReserve = SearchMossKtxKt.suspendSearchReserve(searchMoss, searchReserveRequestBuild, this);
                obj = objSuspendSearchReserve;
                if (objSuspendSearchReserve == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SearchReserveResponse searchReserveResponse = (SearchReserveResponse) obj;
            if (!this.$callback.isCancel()) {
                if (searchReserveResponse == null || searchReserveResponse.getReserveInfo() == null) {
                    this.$callback.onError(new BiliApiException(-500, "Response is null"));
                } else {
                    this.$callback.onDataSuccess(new C2794o(searchReserveResponse.getReserveInfo()));
                }
            }
        } catch (BusinessException e7) {
            if (!this.$callback.isCancel()) {
                this.$callback.onError(e7);
            }
        } catch (MossException e8) {
            if (!this.$callback.isCancel()) {
                this.$callback.onError(e8);
            }
        }
        return Unit.INSTANCE;
    }
}
