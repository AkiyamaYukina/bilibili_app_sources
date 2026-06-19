package com.bilibili.topix.center;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/center/TopixCenterSearchViewModel$load$1.class */
public final class TopixCenterSearchViewModel$load$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $keywords;
    final boolean $toSearch;
    int label;
    final TopixCenterSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopixCenterSearchViewModel$load$1(String str, TopixCenterSearchViewModel topixCenterSearchViewModel, boolean z6, Continuation<? super TopixCenterSearchViewModel$load$1> continuation) {
        super(2, continuation);
        this.$keywords = str;
        this.this$0 = topixCenterSearchViewModel;
        this.$toSearch = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopixCenterSearchViewModel$load$1(this.$keywords, this.this$0, this.$toSearch, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1 A[Catch: Exception -> 0x0170, TRY_ENTER, TryCatch #0 {Exception -> 0x0170, blocks: (B:6:0x0013, B:15:0x0073, B:17:0x007e, B:19:0x008a, B:21:0x00ad, B:24:0x00ba, B:22:0x00b4, B:26:0x00bf, B:28:0x00d0, B:33:0x00ea, B:35:0x00f0, B:38:0x00fb, B:42:0x010d, B:44:0x011d, B:46:0x012a, B:48:0x0130, B:50:0x0142, B:53:0x0153, B:51:0x014b, B:55:0x0159, B:31:0x00e1, B:10:0x0028), top: B:63:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.topix.center.TopixCenterSearchViewModel$load$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
