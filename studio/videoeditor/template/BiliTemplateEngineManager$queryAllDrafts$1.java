package com.bilibili.studio.videoeditor.template;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/BiliTemplateEngineManager$queryAllDrafts$1.class */
final class BiliTemplateEngineManager$queryAllDrafts$1 extends ContinuationImpl {
    int I$0;
    int label;
    Object result;
    final BiliTemplateEngineManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliTemplateEngineManager$queryAllDrafts$1(BiliTemplateEngineManager biliTemplateEngineManager, Continuation<? super BiliTemplateEngineManager$queryAllDrafts$1> continuation) {
        super(continuation);
        this.this$0 = biliTemplateEngineManager;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.j(this);
    }
}
