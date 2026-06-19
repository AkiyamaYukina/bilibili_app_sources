package com.bilibili.studio.editor.moudle.templatev2.vm;

import com.bilibili.studio.editor.moudle.music.manager.musicrec.EditorAIRecResult;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$preInit$1.class */
public final class BiliEditorTemplateRepository$preInit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final EditVideoInfo $editVideoInfo;
    final int $scene;
    final EditorAIRecResult $specifiedLabel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTemplateRepository$preInit$1(EditVideoInfo editVideoInfo, int i7, EditorAIRecResult editorAIRecResult, Continuation<? super BiliEditorTemplateRepository$preInit$1> continuation) {
        super(2, continuation);
        this.$editVideoInfo = editVideoInfo;
        this.$scene = i7;
        this.$specifiedLabel = editorAIRecResult;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorTemplateRepository$preInit$1(this.$editVideoInfo, this.$scene, this.$specifiedLabel, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BiliEditorTemplateRepository biliEditorTemplateRepository = BiliEditorTemplateRepository.f108125a;
            EditVideoInfo editVideoInfo = this.$editVideoInfo;
            int i8 = this.$scene;
            EditorAIRecResult editorAIRecResult = this.$specifiedLabel;
            this.label = 1;
            if (BiliEditorTemplateRepository.h(editVideoInfo, i8, editorAIRecResult, false, this, 8) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliEditorTemplateRepository biliEditorTemplateRepository2 = BiliEditorTemplateRepository.f108125a;
        EditVideoInfo editVideoInfo2 = this.$editVideoInfo;
        this.label = 2;
        if (biliEditorTemplateRepository2.g(editVideoInfo2, false, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
