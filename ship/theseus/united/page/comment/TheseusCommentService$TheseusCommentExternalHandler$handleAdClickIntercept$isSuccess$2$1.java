package com.bilibili.ship.theseus.united.page.comment;

import com.bilibili.gripper.api.ad.biz.comment.AdCommentPanelData;
import com.bilibili.gripper.api.ad.biz.videodetail.IAdPanelListener;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelCallback;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelData;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$TheseusCommentExternalHandler$handleAdClickIntercept$isSuccess$2$1.class */
final class TheseusCommentService$TheseusCommentExternalHandler$handleAdClickIntercept$isSuccess$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Pair<Integer, AdCommentPanelData> $it;
    int label;
    final TheseusCommentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusCommentService$TheseusCommentExternalHandler$handleAdClickIntercept$isSuccess$2$1(TheseusCommentService theseusCommentService, Pair<Integer, AdCommentPanelData> pair, Continuation<? super TheseusCommentService$TheseusCommentExternalHandler$handleAdClickIntercept$isSuccess$2$1> continuation) {
        super(2, continuation);
        this.this$0 = theseusCommentService;
        this.$it = pair;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusCommentService$TheseusCommentExternalHandler$handleAdClickIntercept$isSuccess$2$1(this.this$0, this.$it, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        IPanelCallback.showPanel$default(this.this$0.h.b(), ((Number) this.$it.getFirst()).intValue(), (IPanelData) this.$it.getSecond(), (IAdPanelListener) null, 4, (Object) null);
        return Unit.INSTANCE;
    }
}
