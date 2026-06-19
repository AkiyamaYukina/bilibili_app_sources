package com.bilibili.biligame;

import android.content.Context;
import com.bilibili.biligame.story.IGameStorySection;
import com.bilibili.biligame.story.StoryGameInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/GameCenterBizService.class */
public interface GameCenterBizService {
    @NotNull
    IGameStorySection getGameStorySection(@NotNull Context context, @Nullable StoryGameInfo storyGameInfo);
}
