package com.bilibili.playerbizcommon.widget.control.seekbar;

import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/b.class */
public interface b {
    void a(int i7);

    void b();

    default boolean c() {
        return false;
    }

    void d(boolean z6);

    @Nullable
    Object e(@Nullable e eVar, @NotNull Continuation<? super Boolean> continuation);

    void f();

    default void g() {
    }

    void h(@Nullable f fVar);

    void onProgressChanged(int i7);

    void reset();
}
