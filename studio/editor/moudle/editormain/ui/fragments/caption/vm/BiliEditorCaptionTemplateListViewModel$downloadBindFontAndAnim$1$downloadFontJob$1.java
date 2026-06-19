package com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.vm;

import com.bilibili.studio.editor.moudle.caption.v1.CaptionListItem;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/ui/fragments/caption/vm/BiliEditorCaptionTemplateListViewModel$downloadBindFontAndAnim$1$downloadFontJob$1.class */
public final class BiliEditorCaptionTemplateListViewModel$downloadBindFontAndAnim$1$downloadFontJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final Integer $fontId;
    int label;
    final D this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorCaptionTemplateListViewModel$downloadBindFontAndAnim$1$downloadFontJob$1(D d7, Integer num, Continuation<? super BiliEditorCaptionTemplateListViewModel$downloadBindFontAndAnim$1$downloadFontJob$1> continuation) {
        super(2, continuation);
        this.this$0 = d7;
        this.$fontId = num;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorCaptionTemplateListViewModel$downloadBindFontAndAnim$1$downloadFontJob$1(this.this$0, this.$fontId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            D d7 = this.this$0;
            Integer num = this.$fontId;
            int iIntValue = num != null ? num.intValue() : 0;
            this.label = 1;
            d7.getClass();
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            if (iIntValue <= 0) {
                Result.Companion companion = Result.Companion;
                androidx.core.content.c.c(cancellableContinuationImpl, false);
            } else {
                B b7 = new B(cancellableContinuationImpl);
                Ny0.d dVar = d7.f106659d;
                CaptionListItem captionListItemJ = Ny0.d.j(Integer.valueOf(iIntValue), dVar.f17487b);
                if (captionListItemJ != null) {
                    dVar.f17486a.e(captionListItemJ, b7);
                } else {
                    b7.onCancel();
                }
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            obj = result;
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
