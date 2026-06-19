package com.bilibili.search2.stardust.expose;

import android.view.View;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/b.class */
public interface b {
    @Nullable
    default List<c> getExposeChildren() {
        return null;
    }

    default void onNestedChildExpose(int i7, int i8, @NotNull View view) {
    }
}
