package com.bilibili.studio.editor.moudle.musicv3.logic;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/musicv3/logic/BiliEditorMusicBaseLogicV2$downloadMarkPoint$1.class */
final class BiliEditorMusicBaseLogicV2$downloadMarkPoint$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    Object result;
    final BiliEditorMusicBaseLogicV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliEditorMusicBaseLogicV2$downloadMarkPoint$1(BiliEditorMusicBaseLogicV2 biliEditorMusicBaseLogicV2, Continuation<? super BiliEditorMusicBaseLogicV2$downloadMarkPoint$1> continuation) {
        super(continuation);
        this.this$0 = biliEditorMusicBaseLogicV2;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BiliEditorMusicBaseLogicV2.b(this.this$0, null, null, this);
    }
}
