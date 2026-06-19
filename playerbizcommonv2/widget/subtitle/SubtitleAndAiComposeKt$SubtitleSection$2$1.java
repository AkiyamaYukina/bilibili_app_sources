package com.bilibili.playerbizcommonv2.widget.subtitle;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiComposeKt$SubtitleSection$2$1.class */
public final class SubtitleAndAiComposeKt$SubtitleSection$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<String> $currentViceSubtitleKey$delegate;
    final IInteractLayerService $interactLayerService;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubtitleAndAiComposeKt$SubtitleSection$2$1(IInteractLayerService iInteractLayerService, MutableState<String> mutableState, Continuation<? super SubtitleAndAiComposeKt$SubtitleSection$2$1> continuation) {
        super(2, continuation);
        this.$interactLayerService = iInteractLayerService;
        this.$currentViceSubtitleKey$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubtitleAndAiComposeKt$SubtitleSection$2$1(this.$interactLayerService, this.$currentViceSubtitleKey$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
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
            if (r0 != 0) goto L47
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            androidx.compose.runtime.MutableState<java.lang.String> r0 = r0.$currentViceSubtitleKey$delegate
            r7 = r0
            r0 = r4
            tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService r0 = r0.$interactLayerService
            com.bapis.bilibili.community.service.dm.v1.SubtitleItem r0 = r0.getViceSubtitle()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L2a
            r0 = r5
            java.lang.String r0 = r0.getLan()
            r5 = r0
            goto L2c
        L2a:
            r0 = 0
            r5 = r0
        L2c:
            r0 = r5
            if (r0 == 0) goto L39
            r0 = r5
            r6 = r0
            r0 = r5
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L3c
        L39:
            java.lang.String r0 = "nodisplay"
            r6 = r0
        L3c:
            r0 = r7
            r1 = r6
            r0.setValue(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L47:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.subtitle.SubtitleAndAiComposeKt$SubtitleSection$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
