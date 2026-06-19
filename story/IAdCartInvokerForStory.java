package com.bilibili.story;

import android.view.ViewGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/story/IAdCartInvokerForStory.class */
public interface IAdCartInvokerForStory {
    @NotNull
    String getFromSpmid();

    void onDataChanged(@NotNull ViewGroup viewGroup, @Nullable StoryCartBean storyCartBean, @NotNull IStoryInvokerForAdCart iStoryInvokerForAdCart);

    void onPageDestroy();

    void onScreenModeChanged(@NotNull ScreenMode screenMode);

    void onStart(int i7);

    void onStop(int i7);
}
