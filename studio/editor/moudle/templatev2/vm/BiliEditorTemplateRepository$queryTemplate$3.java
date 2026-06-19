package com.bilibili.studio.editor.moudle.templatev2.vm;

import com.bilibili.studio.editor.moudle.music.manager.musicrec.EditorAIRecResult;
import com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$queryTemplate$3.class */
final class BiliEditorTemplateRepository$queryTemplate$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BiliEditorTemplateRepository.d>, Object> {
    final EditVideoInfo $editVideoInfo;
    final boolean $forceUpdate;
    final String $ratio;
    final int $scene;
    final EditorAIRecResult $specifiedLabel;
    final String $tag;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTemplateRepository$queryTemplate$3(String str, String str2, int i7, EditVideoInfo editVideoInfo, EditorAIRecResult editorAIRecResult, boolean z6, Continuation<? super BiliEditorTemplateRepository$queryTemplate$3> continuation) {
        super(2, continuation);
        this.$ratio = str;
        this.$tag = str2;
        this.$scene = i7;
        this.$editVideoInfo = editVideoInfo;
        this.$specifiedLabel = editorAIRecResult;
        this.$forceUpdate = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BiliEditorTemplateRepository$queryTemplate$3 biliEditorTemplateRepository$queryTemplate$3 = new BiliEditorTemplateRepository$queryTemplate$3(this.$ratio, this.$tag, this.$scene, this.$editVideoInfo, this.$specifiedLabel, this.$forceUpdate, continuation);
        biliEditorTemplateRepository$queryTemplate$3.L$0 = obj;
        return biliEditorTemplateRepository$queryTemplate$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BiliEditorTemplateRepository.d> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Deferred deferredAsync$default = BuildersKt.async$default((CoroutineScope) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new BiliEditorTemplateRepository$queryTemplate$3$templateJob$1(this.$ratio, this.$tag, this.$scene, this.$editVideoInfo, this.$specifiedLabel, this.$forceUpdate, null), 3, (Object) null);
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            obj = objAwait;
            if (objAwait == coroutine_suspended) {
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
