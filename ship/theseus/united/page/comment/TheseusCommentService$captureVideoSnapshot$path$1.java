package com.bilibili.ship.theseus.united.page.comment;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/comment/TheseusCommentService$captureVideoSnapshot$path$1.class */
final class TheseusCommentService$captureVideoSnapshot$path$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final Bitmap $bitmap;
    final long $positionMs;
    final boolean $withMark;
    int label;
    final TheseusCommentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusCommentService$captureVideoSnapshot$path$1(TheseusCommentService theseusCommentService, boolean z6, long j7, Bitmap bitmap, Continuation<? super TheseusCommentService$captureVideoSnapshot$path$1> continuation) {
        super(2, continuation);
        this.this$0 = theseusCommentService;
        this.$withMark = z6;
        this.$positionMs = j7;
        this.$bitmap = bitmap;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusCommentService$captureVideoSnapshot$path$1(this.this$0, this.$withMark, this.$positionMs, this.$bitmap, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.comment.TheseusCommentService$captureVideoSnapshot$path$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
