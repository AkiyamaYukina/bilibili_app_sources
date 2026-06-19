package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/BiliEditorCaptionTtsViewModel$initProgressUI$1.class */
public final class BiliEditorCaptionTtsViewModel$initProgressUI$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final BiliEditorCaptionTtsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorCaptionTtsViewModel$initProgressUI$1(BiliEditorCaptionTtsViewModel biliEditorCaptionTtsViewModel, Continuation<? super BiliEditorCaptionTtsViewModel$initProgressUI$1> continuation) {
        super(2, continuation);
        this.this$0 = biliEditorCaptionTtsViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorCaptionTtsViewModel$initProgressUI$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010d  */
    /* JADX WARN: Type inference failed for: r1v22, types: [androidx.lifecycle.ViewModel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0101 -> B:24:0x0107). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm.BiliEditorCaptionTtsViewModel$initProgressUI$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
