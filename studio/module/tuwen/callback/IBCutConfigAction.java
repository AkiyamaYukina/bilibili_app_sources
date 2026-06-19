package com.bilibili.studio.module.tuwen.callback;

import com.bilibili.studio.module.tuwen.model.BCutActionRequest;
import com.bilibili.studio.module.tuwen.model.BCutActionResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/module/tuwen/callback/IBCutConfigAction.class */
public interface IBCutConfigAction {
    boolean ab(@NotNull String str);

    @Nullable
    <T> T getIntentData(@NotNull String str, @NotNull Class<T> cls);

    void onAction(@NotNull BCutActionRequest bCutActionRequest, @NotNull Function1<? super BCutActionResponse, Unit> function1);

    void putIntentData(@NotNull String str, @NotNull Object obj);
}
