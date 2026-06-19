package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/BiliEditorCaptionTtsViewModel$smoothUpdateProgress$1.class */
final class BiliEditorCaptionTtsViewModel$smoothUpdateProgress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $interval;
    final float $processGap;
    final Ref.FloatRef $start;
    float F$0;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final BiliEditorCaptionTtsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorCaptionTtsViewModel$smoothUpdateProgress$1(long j7, Ref.FloatRef floatRef, float f7, BiliEditorCaptionTtsViewModel biliEditorCaptionTtsViewModel, Continuation<? super BiliEditorCaptionTtsViewModel$smoothUpdateProgress$1> continuation) {
        super(2, continuation);
        this.$interval = j7;
        this.$start = floatRef;
        this.$processGap = f7;
        this.this$0 = biliEditorCaptionTtsViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorCaptionTtsViewModel$smoothUpdateProgress$1(this.$interval, this.$start, this.$processGap, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0150 -> B:32:0x01ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x016d -> B:32:0x01ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x01b4 -> B:32:0x01ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.BiliEditorCaptionTtsViewModel$smoothUpdateProgress$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
