package com.bilibili.live.streaming.widget;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/widget/IRenderView.class */
public interface IRenderView {
    void addRenderCallback(@NotNull IRenderViewCallback iRenderViewCallback);

    @NotNull
    View getView();

    void removeRenderCallback(@NotNull IRenderViewCallback iRenderViewCallback);
}
