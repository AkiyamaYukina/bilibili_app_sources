package com.bilibili.studio.editor.moudle.templatev2.vm;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/vm/BiliEditorTemplateRepository$getRecMusicList$1.class */
final class BiliEditorTemplateRepository$getRecMusicList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final BiliEditorTemplateRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorTemplateRepository$getRecMusicList$1(BiliEditorTemplateRepository biliEditorTemplateRepository, Continuation<? super BiliEditorTemplateRepository$getRecMusicList$1> continuation) {
        super(continuation);
        this.this$0 = biliEditorTemplateRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BiliEditorTemplateRepository.a(this.this$0, null, this);
    }
}
