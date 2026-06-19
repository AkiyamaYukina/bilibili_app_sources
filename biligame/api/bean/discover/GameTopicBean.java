package com.bilibili.biligame.api.bean.discover;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/discover/GameTopicBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameTopicBean {
    public static final int $stable = 8;

    @JSONField(name = "background_color")
    @Nullable
    private String backgroundColor;

    @JSONField(name = "game_list")
    @Nullable
    private List<GameTopicItem> gameList;

    @JSONField(name = "topic_image")
    @Nullable
    private String topicImage;

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final List<GameTopicItem> getGameList() {
        return this.gameList;
    }

    @Nullable
    public final String getTopicImage() {
        return this.topicImage;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    public final void setGameList(@Nullable List<GameTopicItem> list) {
        this.gameList = list;
    }

    public final void setTopicImage(@Nullable String str) {
        this.topicImage = str;
    }
}
