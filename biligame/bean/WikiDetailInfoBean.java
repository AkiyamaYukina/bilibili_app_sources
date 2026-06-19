package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/WikiDetailInfoBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class WikiDetailInfoBean {
    public static final int $stable = 8;

    @JSONField(name = "is_favourite_wiki")
    private int collected;

    @JSONField(name = "game_base_id")
    @Nullable
    private String gameBaseId;

    @JSONField(name = "icon")
    @Nullable
    private String gameIcon;

    @JSONField(name = "game_name")
    @Nullable
    private String gameName;

    @JSONField(name = "home_page_info")
    @Nullable
    private WikiDetailInfo wikiDetail;

    @JSONField(name = "wiki_image")
    @Nullable
    private String wikiImage;

    public final int getCollected() {
        return this.collected;
    }

    @Nullable
    public final String getGameBaseId() {
        return this.gameBaseId;
    }

    @Nullable
    public final String getGameIcon() {
        return this.gameIcon;
    }

    @Nullable
    public final String getGameName() {
        return this.gameName;
    }

    @Nullable
    public final WikiDetailInfo getWikiDetail() {
        return this.wikiDetail;
    }

    @Nullable
    public final String getWikiImage() {
        return this.wikiImage;
    }

    public final void setCollected(int i7) {
        this.collected = i7;
    }

    public final void setGameBaseId(@Nullable String str) {
        this.gameBaseId = str;
    }

    public final void setGameIcon(@Nullable String str) {
        this.gameIcon = str;
    }

    public final void setGameName(@Nullable String str) {
        this.gameName = str;
    }

    public final void setWikiDetail(@Nullable WikiDetailInfo wikiDetailInfo) {
        this.wikiDetail = wikiDetailInfo;
    }

    public final void setWikiImage(@Nullable String str) {
        this.wikiImage = str;
    }
}
