package com.bilibili.playerbizcommon.miniplayer;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/miniplayer/IMiniPlayerWindowManager.class */
public interface IMiniPlayerWindowManager {
    void finishMiniPlayer(boolean z6);

    boolean getIgnorePauseEnable();

    @Nullable
    MiniPlayerSize getMiniPlayerSize();

    @Nullable
    Point getPosition();

    int getSmallMiniPlayerPixelWidth(@NotNull Context context, @NotNull WindowManager windowManager);

    boolean isMiniPlayerActive(boolean z6);

    void saveMiniPlayerSize(@NotNull MiniPlayerSize miniPlayerSize);

    void savePosition(@NotNull Point point);

    void setIgnorePauseEnable(boolean z6);
}
