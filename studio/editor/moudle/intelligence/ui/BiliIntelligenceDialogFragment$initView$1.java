package com.bilibili.studio.editor.moudle.intelligence.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/ui/BiliIntelligenceDialogFragment$initView$1.class */
final class BiliIntelligenceDialogFragment$initView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BiliIntelligenceDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliIntelligenceDialogFragment$initView$1(BiliIntelligenceDialogFragment biliIntelligenceDialogFragment, Continuation<? super BiliIntelligenceDialogFragment$initView$1> continuation) {
        super(2, continuation);
        this.this$0 = biliIntelligenceDialogFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliIntelligenceDialogFragment$initView$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:31:0x00ac
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r5
            int r0 = r0.label
            r7 = r0
            r0 = 0
            r10 = r0
            r0 = r7
            if (r0 == 0) goto L27
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L1d
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            goto L8c
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L27:
            r0 = r6
            kotlin.ResultKt.throwOnFailure(r0)
            org.json.JSONObject r0 = com.bilibili.studio.editor.moudle.intelligence.logic.b.f107348c
            if (r0 != 0) goto L56
            java.lang.String r0 = zw0.b.s()
            r12 = r0
            r0 = r12
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L50
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4b
            r6 = r0
            r0 = r6
            r1 = r12
            r0.<init>(r1)     // Catch: java.lang.Exception -> L4b
            goto L52
        L4b:
            r6 = move-exception
            r0 = r6
            r0.printStackTrace()
        L50:
            r0 = 0
            r6 = r0
        L52:
            r0 = r6
            com.bilibili.studio.editor.moudle.intelligence.logic.b.f107348c = r0
        L56:
            org.json.JSONObject r0 = com.bilibili.studio.editor.moudle.intelligence.logic.b.f107348c
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L6d
            r0 = r6
            java.lang.String r1 = "show_original_entrance_time"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> Lac
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> Lac
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> Lac
            com.bilibili.studio.editor.moudle.intelligence.logic.b.f107347b = r0     // Catch: java.lang.Exception -> Lac
        L6d:
            int r0 = com.bilibili.studio.editor.moudle.intelligence.logic.b.f107347b     // Catch: java.lang.Exception -> Lac
            r1 = 1
            int r0 = kotlin.ranges.RangesKt.coerceAtLeast(r0, r1)
            long r0 = (long) r0
            r8 = r0
            r0 = r5
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r1
            r1 = r5
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
            r1 = r11
            if (r0 != r1) goto L8c
            r0 = r11
            return r0
        L8c:
            r0 = r5
            com.bilibili.studio.editor.moudle.intelligence.ui.BiliIntelligenceDialogFragment r0 = r0.this$0
            android.widget.TextView r0 = r0.f107568d
            r6 = r0
            r0 = r6
            if (r0 != 0) goto La3
            java.lang.String r0 = "mButtonExit"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r10
            r6 = r0
            goto La3
        La3:
            r0 = r6
            r1 = 0
            r0.setVisibility(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lac:
            r6 = move-exception
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.ui.BiliIntelligenceDialogFragment$initView$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
