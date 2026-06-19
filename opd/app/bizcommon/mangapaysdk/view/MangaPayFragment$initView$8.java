package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initView$8.class */
final class MangaPayFragment$initView$8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MangaPayFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MangaPayFragment$initView$8(MangaPayFragment mangaPayFragment, Continuation<? super MangaPayFragment$initView$8> continuation) {
        super(2, continuation);
        this.this$0 = mangaPayFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MangaPayFragment$initView$8(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r6
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L24
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            goto L89
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment r0 = r0.this$0
            r7 = r0
            r0 = r7
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d r0 = r0.f74087L
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L89
            r0 = r7
            boolean r0 = r0.f74088M
            r9 = r0
            r0 = r12
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h> r0 = r0.f74049c
            kotlinx.coroutines.flow.StateFlow r0 = kotlinx.coroutines.flow.FlowKt.asStateFlow(r0)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L66
            r0 = r7
            java.lang.Object r0 = r0.getValue()
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h r0 = (com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L66
            r0 = r7
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ButtonState r0 = r0.f74072c
            r10 = r0
            r0 = r10
            r7 = r0
            r0 = r10
            if (r0 != 0) goto L6a
        L66:
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ButtonState r0 = com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ButtonState.Unknown
            r7 = r0
        L6a:
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h r0 = new com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h
            r1 = r0
            r2 = r9
            r3 = r7
            r4 = 2
            r1.<init>(r2, r3, r4)
            r7 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r12
            r1 = r7
            r2 = r6
            java.lang.Object r0 = r0.X0(r1, r2)
            r1 = r11
            if (r0 != r1) goto L89
            r0 = r11
            return r0
        L89:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment$initView$8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
