package com.bilibili.pegasus.common.inline;

import com.bilibili.pegasus.data.base.BasePegasusData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/PegasusInlineLikeButtonHelperV2$requestLike$1.class */
final class PegasusInlineLikeButtonHelperV2$requestLike$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $from;
    final BasePegasusData $item;
    final jp0.c $likeButton;
    Object L$0;
    Object L$1;
    int label;
    final z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PegasusInlineLikeButtonHelperV2$requestLike$1(z zVar, jp0.c cVar, BasePegasusData basePegasusData, String str, Continuation<? super PegasusInlineLikeButtonHelperV2$requestLike$1> continuation) {
        super(2, continuation);
        this.this$0 = zVar;
        this.$likeButton = cVar;
        this.$item = basePegasusData;
        this.$from = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PegasusInlineLikeButtonHelperV2$requestLike$1(this.this$0, this.$likeButton, this.$item, this.$from, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.common.inline.PegasusInlineLikeButtonHelperV2$requestLike$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
