package com.bilibili.search2.result;

import android.content.Context;
import com.bilibili.search2.result.base.u;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/BiliMainSearchResultFragment$sendSearchIntent$1.class */
public final class BiliMainSearchResultFragment$sendSearchIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Map<String, String> $filterMap;
    int label;
    final BiliMainSearchResultFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliMainSearchResultFragment$sendSearchIntent$1(BiliMainSearchResultFragment biliMainSearchResultFragment, Map<String, String> map, Continuation<? super BiliMainSearchResultFragment$sendSearchIntent$1> continuation) {
        super(2, continuation);
        this.this$0 = biliMainSearchResultFragment;
        this.$filterMap = map;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliMainSearchResultFragment$sendSearchIntent$1(this.this$0, this.$filterMap, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BiliMainSearchResultFragment biliMainSearchResultFragment = this.this$0;
            com.bilibili.search2.result.base.t tVar = biliMainSearchResultFragment.f87083S;
            if (tVar != null) {
                Map<String, String> map = this.$filterMap;
                MutableSharedFlow<com.bilibili.search2.result.base.u> mutableSharedFlow = biliMainSearchResultFragment.f87067C;
                boolean zG = false;
                if (map == null) {
                    map = null;
                }
                com.bilibili.search2.result.base.t tVarA = com.bilibili.search2.result.base.t.a(tVar, 0, map, 65535);
                Context context = biliMainSearchResultFragment.getContext();
                if (context != null) {
                    zG = com.bilibili.search2.component.e.g(context);
                }
                u.c cVar = new u.c(tVarA, zG);
                this.label = 1;
                if (mutableSharedFlow.emit(cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
