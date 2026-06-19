package com.bilibili.playerbizcommonv2.utils;

import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.playerbizcommonv2.delegate.DelegateStoreKey;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/r.class */
public interface r {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/r$a.class */
    public static final class a implements DelegateStoreKey<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f81944a = new Object();
    }

    @NotNull
    StateFlow<WindowSizeClass> getWindowSizeFlow();
}
