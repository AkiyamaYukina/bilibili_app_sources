package com.bilibili.studio.editor.moudle.templatev2.vm;

import com.bilibili.studio.editor.moudle.music.manager.musicrec.EditorAIRecResult;
import com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository;
import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$queryTemplate$3$templateJob$1.class */
public final class BiliEditorTemplateRepository$queryTemplate$3$templateJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BiliEditorTemplateRepository.d>, Object> {
    final EditVideoInfo $editVideoInfo;
    final boolean $forceUpdate;
    final String $ratio;
    final int $scene;
    final EditorAIRecResult $specifiedLabel;
    final String $tag;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTemplateRepository$queryTemplate$3$templateJob$1(String str, String str2, int i7, EditVideoInfo editVideoInfo, EditorAIRecResult editorAIRecResult, boolean z6, Continuation<? super BiliEditorTemplateRepository$queryTemplate$3$templateJob$1> continuation) {
        super(2, continuation);
        this.$ratio = str;
        this.$tag = str2;
        this.$scene = i7;
        this.$editVideoInfo = editVideoInfo;
        this.$specifiedLabel = editorAIRecResult;
        this.$forceUpdate = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliEditorTemplateRepository$queryTemplate$3$templateJob$1(this.$ratio, this.$tag, this.$scene, this.$editVideoInfo, this.$specifiedLabel, this.$forceUpdate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BiliEditorTemplateRepository.d> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.templatev2.vm.BiliEditorTemplateRepository$queryTemplate$3$templateJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
