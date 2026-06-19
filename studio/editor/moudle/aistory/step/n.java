package com.bilibili.studio.editor.moudle.aistory.step;

import android.content.Context;
import com.bilibili.studio.editor.moudle.aistory.bean.AIStoryBean;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/step/n.class */
public interface n {
    int a();

    @Nullable
    Object b(@NotNull Context context, @NotNull AIStoryBean aIStoryBean, @NotNull com.bilibili.studio.editor.moudle.aistory.a aVar, @NotNull Continuation continuation);

    void cancel();
}
