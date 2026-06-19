package com.bilibili.search2.eastereggs;

import com.bapis.bilibili.app.search.v2.SearchEggInfos;
import com.bapis.bilibili.app.search.v2.SearchEggReply;
import com.bapis.bilibili.app.search.v2.SearchEggReq;
import com.bapis.bilibili.app.search.v2.SearchMoss;
import com.bilibili.lib.blkv.SharedPrefX;
import com.bilibili.lib.moss.api.CallOptions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/SearchLocalDataManager$updateEggResV2$1.class */
public final class SearchLocalDataManager$updateEggResV2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public SearchLocalDataManager$updateEggResV2$1(Continuation<? super SearchLocalDataManager$updateEggResV2$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchLocalDataManager$updateEggResV2$1(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        SearchEggInfos result;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            try {
                SearchEggReply searchEggReplyExecuteSearchEgg = new SearchMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executeSearchEgg(SearchEggReq.newBuilder().build());
                if (searchEggReplyExecuteSearchEgg != null && (result = searchEggReplyExecuteSearchEgg.getResult()) != null) {
                    SearchLocalDataManager.a(result);
                }
            } catch (Exception e7) {
                BLog.e("SearchLocalDataManager", "fetch eggs error", e7);
            }
            return Unit.INSTANCE;
        } finally {
            SharedPrefX sharedPrefX = SearchLocalDataManager.f86501a;
            SearchLocalDataManager.f86502b = null;
        }
    }
}
