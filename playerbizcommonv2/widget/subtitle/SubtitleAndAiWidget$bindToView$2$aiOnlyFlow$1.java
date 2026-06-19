package com.bilibili.playerbizcommonv2.widget.subtitle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget$bindToView$2$aiOnlyFlow$1.class */
public final class SubtitleAndAiWidget$bindToView$2$aiOnlyFlow$1 extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
    boolean Z$0;
    boolean Z$1;
    int label;
    final SubtitleAndAiWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubtitleAndAiWidget$bindToView$2$aiOnlyFlow$1(SubtitleAndAiWidget subtitleAndAiWidget, Continuation<? super SubtitleAndAiWidget$bindToView$2$aiOnlyFlow$1> continuation) {
        super(3, continuation);
        this.this$0 = subtitleAndAiWidget;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Boolean>) obj3);
    }

    public final Object invoke(boolean z6, boolean z7, Continuation<? super Boolean> continuation) {
        SubtitleAndAiWidget$bindToView$2$aiOnlyFlow$1 subtitleAndAiWidget$bindToView$2$aiOnlyFlow$1 = new SubtitleAndAiWidget$bindToView$2$aiOnlyFlow$1(this.this$0, continuation);
        subtitleAndAiWidget$bindToView$2$aiOnlyFlow$1.Z$0 = z6;
        subtitleAndAiWidget$bindToView$2$aiOnlyFlow$1.Z$1 = z7;
        return subtitleAndAiWidget$bindToView$2$aiOnlyFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r0 = r4
            int r0 = r0.label
            if (r0 != 0) goto L5a
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            boolean r0 = r0.Z$0
            r6 = r0
            r0 = r4
            boolean r0 = r0.Z$1
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L53
            r0 = r4
            com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget r0 = r0.this$0
            com.bilibili.playerbizcommonv2.service.ai.a r0 = r0.getAiService()
            com.bilibili.lib.media.resource.Languages r0 = r0.e0()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L53
            r0 = r5
            java.util.List r0 = r0.h()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L53
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r8 = r0
            r0 = 1
            r6 = r0
            r0 = r8
            r1 = 1
            r0 = r0 ^ r1
            r1 = 1
            if (r0 != r1) goto L53
            r0 = r7
            if (r0 != 0) goto L53
            goto L55
        L53:
            r0 = 0
            r6 = r0
        L55:
            r0 = r6
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiWidget$bindToView$2$aiOnlyFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
