package com.bilibili.mediastreaming.flashpoint;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/h.class */
public interface h {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/flashpoint/h$a.class */
    public interface a {
        long create(@NotNull String str);

        void destroy();
    }

    @Nullable
    a createFlashpoint(@NotNull String str, @NotNull String str2);
}
