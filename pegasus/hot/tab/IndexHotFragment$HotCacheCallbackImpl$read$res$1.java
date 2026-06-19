package com.bilibili.pegasus.hot.tab;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/hot/tab/IndexHotFragment$HotCacheCallbackImpl$read$res$1.class */
public final class IndexHotFragment$HotCacheCallbackImpl$read$res$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super com.bilibili.common.fallbackcache.c<? extends String>>, Object> {
    private Object L$0;
    int label;
    final IndexHotFragment this$0;
    final IndexHotFragment.HotCacheCallbackImpl this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexHotFragment$HotCacheCallbackImpl$read$res$1(IndexHotFragment indexHotFragment, IndexHotFragment.HotCacheCallbackImpl hotCacheCallbackImpl, Continuation<? super IndexHotFragment$HotCacheCallbackImpl$read$res$1> continuation) {
        super(2, continuation);
        this.this$0 = indexHotFragment;
        this.this$1 = hotCacheCallbackImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndexHotFragment$HotCacheCallbackImpl$read$res$1 indexHotFragment$HotCacheCallbackImpl$read$res$1 = new IndexHotFragment$HotCacheCallbackImpl$read$res$1(this.this$0, this.this$1, continuation);
        indexHotFragment$HotCacheCallbackImpl$read$res$1.L$0 = obj;
        return indexHotFragment$HotCacheCallbackImpl$read$res$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super com.bilibili.common.fallbackcache.c<String>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                IndexHotFragment indexHotFragment = this.this$0;
                IndexHotFragment.HotCacheCallbackImpl hotCacheCallbackImpl = this.this$1;
                Result.Companion companion = Result.Companion;
                com.bilibili.common.fallbackcache.e eVar = indexHotFragment.f78172Z;
                if (eVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fallbackCache");
                    eVar = null;
                }
                hotCacheCallbackImpl.getClass();
                String str = hotCacheCallbackImpl.f78175a;
                this.label = 1;
                Object objC = eVar.c("creation.hot-tab.0.0", "0", str, this);
                obj = objC;
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            obj2 = Result.constructor-impl((com.bilibili.common.fallbackcache.c) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj2 = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.isFailure-impl(obj2)) {
            obj2 = null;
        }
        return obj2;
    }
}
