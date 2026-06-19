package com.bilibili.studio.editor.moudle.caption.manager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/caption/manager/CaptionDataManager$getCaptionById$1.class */
final class CaptionDataManager$getCaptionById$1 extends ContinuationImpl {
    int I$0;
    int label;
    Object result;
    final CaptionDataManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionDataManager$getCaptionById$1(CaptionDataManager captionDataManager, Continuation<? super CaptionDataManager$getCaptionById$1> continuation) {
        super(continuation);
        this.this$0 = captionDataManager;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CaptionDataManager.b(this.this$0, 0, this);
    }
}
