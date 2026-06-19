package com.bilibili.studio.editor.moudle.intelligence.media.strategy;

import com.bilibili.studio.editor.moudle.intelligence.media.strategy.bean.MediaStrategyItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/media/strategy/a.class */
public abstract class a {
    public abstract void a(@NotNull MediaStrategyItem mediaStrategyItem);

    public abstract void b(@Nullable Function0<Unit> function0);

    @Nullable
    public abstract Object c(boolean z6, @NotNull Continuation continuation);

    public abstract void d();
}
