package com.bilibili.sistersplayer.p2p;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/FragmentDownloadP2PRequestFactory2$startDownload$3$1$1.class */
public final class FragmentDownloadP2PRequestFactory2$startDownload$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final FragmentDownloadP2PRequestFactory2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentDownloadP2PRequestFactory2$startDownload$3$1$1(FragmentDownloadP2PRequestFactory2 fragmentDownloadP2PRequestFactory2, Continuation<? super FragmentDownloadP2PRequestFactory2$startDownload$3$1$1> continuation) {
        super(2, continuation);
        this.this$0 = fragmentDownloadP2PRequestFactory2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FragmentDownloadP2PRequestFactory2$startDownload$3$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FragmentDownloader dataFetch = this.this$0.getP2pContext().getDataFetch();
            String fragmentName = this.this$0.frag.getFragmentName();
            this.label = 1;
            if (dataFetch.stopDownload(fragmentName, this) == coroutine_suspended) {
                return coroutine_suspended;
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
