package com.bilibili.studio.comm.manager;

import com.bilibili.studio.kaleidoscope.adapter.KaleidoscopeFactory;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/manager/v.class */
public final class v {
    public static final void a(@NotNull Map<String, String> map) {
        Xz0.j.c("sdk_type", KaleidoscopeFactory.SDK_MON);
        Xz0.j.c("router_topic_id", Xz0.g.f28463b);
        map.putAll(Xz0.j.b(Xz0.k.f28475b));
        Xz0.g.c(map);
    }
}
