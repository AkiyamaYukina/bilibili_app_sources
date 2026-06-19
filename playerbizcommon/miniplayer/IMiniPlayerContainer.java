package com.bilibili.playerbizcommon.miniplayer;

import android.graphics.Rect;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/miniplayer/IMiniPlayerContainer.class */
public interface IMiniPlayerContainer {
    @NotNull
    Rect getContainerUnavailableRect();

    @NotNull
    String getMiniPlayerContainerKey();
}
