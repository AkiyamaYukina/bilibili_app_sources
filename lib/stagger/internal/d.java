package com.bilibili.lib.stagger.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/stagger/internal/d.class */
public interface d {
    static void c(@NotNull String str, @NotNull String str2, @Nullable Throwable th) {
        c.c().b(str, str2, th);
    }

    default void a(@NotNull String str, @Nullable Throwable th) {
        c.c().d(f(), str, th);
    }

    default void b(@NotNull String str, @Nullable Throwable th) {
        c.c().e(f(), str, th);
    }

    default String f() {
        return "Stagger-".concat(getLogTag());
    }

    @NotNull
    default String getLogTag() {
        return "StaggerManager";
    }
}
