package com.bilibili.search2.result.ogv.aggregate;

import com.bapis.bilibili.app.search.v2.FollowTypeEnum;
import com.bapis.bilibili.app.search.v2.SearchDelFollowRequest;
import com.bapis.bilibili.app.search.v2.SearchDelFollowResponse;
import com.bapis.bilibili.app.search.v2.SearchMoss;
import com.bapis.bilibili.app.search.v2.SearchMossKtxKt;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.moss.api.BusinessException;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.search2.api.SearchComicItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/ogv/aggregate/OgvAggregateBigComicHolder$onFollowClick$1.class */
final class OgvAggregateBigComicHolder$onFollowClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $cid;
    int label;
    final OgvAggregateBigComicHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvAggregateBigComicHolder$onFollowClick$1(long j7, OgvAggregateBigComicHolder ogvAggregateBigComicHolder, Continuation<? super OgvAggregateBigComicHolder$onFollowClick$1> continuation) {
        super(2, continuation);
        this.$cid = j7;
        this.this$0 = ogvAggregateBigComicHolder;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvAggregateBigComicHolder$onFollowClick$1(this.$cid, this.this$0, continuation);
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
                SearchDelFollowRequest searchDelFollowRequestBuild = SearchDelFollowRequest.newBuilder().setCid(this.$cid).setFollowType(FollowTypeEnum.COMIC).build();
                SearchMoss searchMoss = new SearchMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
                this.label = 1;
                Object objSuspendSearchDelFollow = SearchMossKtxKt.suspendSearchDelFollow(searchMoss, searchDelFollowRequestBuild, this);
                obj = objSuspendSearchDelFollow;
                if (objSuspendSearchDelFollow == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SearchDelFollowResponse searchDelFollowResponse = (SearchDelFollowResponse) obj;
            ((SearchComicItem) this.this$0.getData()).setAttend(0);
            this.this$0.s0();
            ToastHelper.showToastShort(this.this$0.f88309a.a.getContext(), searchDelFollowResponse != null ? searchDelFollowResponse.getToast() : null);
        } catch (MossException e7) {
            ToastHelper.showToastShort(this.this$0.f88309a.a.getContext(), 2131841343);
        } catch (BusinessException e8) {
            ToastHelper.showToastShort(this.this$0.f88309a.a.getContext(), 2131841343);
        }
        return Unit.INSTANCE;
    }
}
