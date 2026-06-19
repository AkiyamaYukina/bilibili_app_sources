package com.bilibili.search2.interceptor;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/interceptor/d.class */
public interface d {
    default boolean a(@NotNull String str) {
        return true;
    }

    boolean b(@NotNull FragmentActivity fragmentActivity, @NotNull String str, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope);
}
