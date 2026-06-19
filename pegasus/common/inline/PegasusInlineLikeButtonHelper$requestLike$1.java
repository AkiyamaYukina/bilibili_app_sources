package com.bilibili.pegasus.common.inline;

import com.bilibili.app.comm.list.common.data.LikeButtonItemV2;
import com.bilibili.pegasus.data.base.BasePegasusData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/PegasusInlineLikeButtonHelper$requestLike$1.class */
final class PegasusInlineLikeButtonHelper$requestLike$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $from;
    final BasePegasusData $item;
    final LikeButtonItemV2 $likeButton;
    Object L$0;
    Object L$1;
    int label;
    final v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PegasusInlineLikeButtonHelper$requestLike$1(v vVar, LikeButtonItemV2 likeButtonItemV2, BasePegasusData basePegasusData, String str, Continuation<? super PegasusInlineLikeButtonHelper$requestLike$1> continuation) {
        super(2, continuation);
        this.this$0 = vVar;
        this.$likeButton = likeButtonItemV2;
        this.$item = basePegasusData;
        this.$from = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PegasusInlineLikeButtonHelper$requestLike$1(this.this$0, this.$likeButton, this.$item, this.$from, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.common.inline.PegasusInlineLikeButtonHelper$requestLike$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
