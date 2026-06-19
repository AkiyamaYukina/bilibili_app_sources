package com.bilibili.playerbizcommon.features.subtitle;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.VideoDirectorObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/subtitle/a.class */
public interface a {
    void a(Object obj, @NotNull String str);

    void addVideoDirectorObserver(@NotNull VideoDirectorObserver videoDirectorObserver);

    Object c(@NotNull String str);

    void d(@NotNull NeuronsEvents.NormalEvent normalEvent);

    @Nullable
    IInteractLayerService getInteractLayerService();

    void removeVideoDirectorObserver(@NotNull VideoDirectorObserver videoDirectorObserver);
}
