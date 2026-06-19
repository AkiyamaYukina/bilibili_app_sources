package com.bilibili.search2.result.vertical.live;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static c f88585b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<String> f88586a;

    public c() {
        new ConcurrentHashMap();
        this.f88586a = new CopyOnWriteArrayList<>();
    }

    @Nullable
    public final String a() {
        String str;
        synchronized (this.f88586a) {
            str = this.f88586a.isEmpty() ? "" : this.f88586a.get(0);
        }
        return str;
    }
}
