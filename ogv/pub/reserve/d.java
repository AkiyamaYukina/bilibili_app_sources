package com.bilibili.ogv.pub.reserve;

import M3.C2571d;
import android.content.Context;
import com.bilibili.base.BiliContext;
import com.bilibili.base.Bootstrap;
import com.bilibili.base.MainThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/reserve/d.class */
public final class d extends Bootstrap.Launch {
    public final void bootInProcess(@NotNull Context context, @Nullable String str) {
    }

    public final void launchWithUI(@NotNull Context context, @Nullable String str) {
    }

    public final void launchWithWorker(@NotNull Context context, @Nullable String str) {
        if (BiliContext.isMainProcess()) {
            MainThread.postOnMainThread(new C2571d(5));
        }
    }
}
