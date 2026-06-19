package com.bilibili.pegasus.hot.tab;

import android.util.Base64;
import com.bapis.bilibili.app.show.popular.v1.PopularReply;
import com.bilibili.pegasus.hot.tab.IndexHotFragment;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/tab/IndexHotFragment$HotCacheCallbackImpl$write$1.class */
public final class IndexHotFragment$HotCacheCallbackImpl$write$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final PopularReply $reply;
    int label;
    final IndexHotFragment this$0;
    final IndexHotFragment.HotCacheCallbackImpl this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexHotFragment$HotCacheCallbackImpl$write$1(PopularReply popularReply, IndexHotFragment indexHotFragment, IndexHotFragment.HotCacheCallbackImpl hotCacheCallbackImpl, Continuation<? super IndexHotFragment$HotCacheCallbackImpl$write$1> continuation) {
        super(2, continuation);
        this.$reply = popularReply;
        this.this$0 = indexHotFragment;
        this.this$1 = hotCacheCallbackImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndexHotFragment$HotCacheCallbackImpl$write$1(this.$reply, this.this$0, this.this$1, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            String strEncodeToString = Base64.encodeToString(this.$reply.toByteArray(), 2);
            com.bilibili.common.fallbackcache.e eVar = this.this$0.f78172Z;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fallbackCache");
                eVar = null;
            }
            IndexHotFragment.HotCacheCallbackImpl hotCacheCallbackImpl = this.this$1;
            hotCacheCallbackImpl.getClass();
            this.label = 1;
            if (eVar.d("creation.hot-tab.0.0", "0", strEncodeToString, hotCacheCallbackImpl.f78175a, (Long) null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((Result) obj).unbox-impl();
        }
        return Unit.INSTANCE;
    }
}
