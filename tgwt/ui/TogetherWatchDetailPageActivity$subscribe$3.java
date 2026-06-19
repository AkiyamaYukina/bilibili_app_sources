package com.bilibili.tgwt.ui;

import com.bilibili.ogvcommon.play.resolver.ViewInfoExtraVo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$subscribe$3.class */
final class TogetherWatchDetailPageActivity$subscribe$3 extends SuspendLambda implements Function2<ViewInfoExtraVo, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final TogetherWatchDetailPageActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchDetailPageActivity$subscribe$3(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity, Continuation<? super TogetherWatchDetailPageActivity$subscribe$3> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchDetailPageActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TogetherWatchDetailPageActivity$subscribe$3 togetherWatchDetailPageActivity$subscribe$3 = new TogetherWatchDetailPageActivity$subscribe$3(this.this$0, continuation);
        togetherWatchDetailPageActivity$subscribe$3.L$0 = obj;
        return togetherWatchDetailPageActivity$subscribe$3;
    }

    public final Object invoke(ViewInfoExtraVo viewInfoExtraVo, Continuation<? super Unit> continuation) {
        return create(viewInfoExtraVo, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 1744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.ui.TogetherWatchDetailPageActivity$subscribe$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
