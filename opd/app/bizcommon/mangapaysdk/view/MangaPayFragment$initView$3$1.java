package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initView$3$1.class */
final class MangaPayFragment$initView$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    private Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final MangaPayFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MangaPayFragment$initView$3$1(MangaPayFragment mangaPayFragment, Continuation<? super MangaPayFragment$initView$3$1> continuation) {
        super(2, continuation);
        this.this$0 = mangaPayFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MangaPayFragment$initView$3$1 mangaPayFragment$initView$3$1 = new MangaPayFragment$initView$3$1(this.this$0, continuation);
        mangaPayFragment$initView$3$1.L$0 = obj;
        return mangaPayFragment$initView$3$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0189 A[Catch: Exception -> 0x002b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:9:0x0024, B:51:0x01cd, B:58:0x01ea, B:43:0x0171, B:46:0x0189), top: B:62:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ea A[Catch: Exception -> 0x002b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:9:0x0024, B:51:0x01cd, B:58:0x01ea, B:43:0x0171, B:46:0x0189), top: B:62:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment$initView$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
