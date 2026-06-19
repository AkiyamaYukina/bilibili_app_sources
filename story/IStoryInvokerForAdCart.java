package com.bilibili.story;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/story/IStoryInvokerForAdCart.class */
public interface IStoryInvokerForAdCart {
    @NotNull
    String getFromSpmid();

    int getPlayerCurrentTime();

    int getPlayerVideoDuration();

    @Nullable
    String getSpMid();

    boolean hasCanvasAdjusted();

    boolean hitStoryScreenAdjustDD();

    boolean isPlaying();

    void pause();

    void resume();

    void showCommentPanel(long j7);

    void updateCanvas(int i7, int i8);

    void updateCanvasWithRightOffset(int i7);
}
