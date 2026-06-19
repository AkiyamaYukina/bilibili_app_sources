package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameHotGame;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/WikiInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class WikiInfo {
    public static final int $stable = 8;

    @JSONField(name = "articles")
    @Nullable
    private List<WikiArticle> articles;

    @JSONField(name = "game")
    @Nullable
    private BiligameHotGame game;

    @JSONField(name = "game_base_id")
    @Nullable
    private Integer gameBaseId;

    @JSONField(name = "game_name")
    @Nullable
    private String gameName;

    @JSONField(name = "game_icon")
    @Nullable
    private String icon;

    @JSONField(name = "new_flag")
    private int newFlag;

    @JSONField(name = "wiki_link")
    @Nullable
    private String wikiLink;

    @JSONField(name = "term_num")
    private int wikiNum;

    @JSONField(name = "wiki_title")
    @Nullable
    private String wikiTitle;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WikiInfo) {
            return Intrinsics.areEqual(getGameBaseId(), ((WikiInfo) obj).getGameBaseId());
        }
        return false;
    }

    @Nullable
    public final List<WikiArticle> getArticles() {
        return this.articles;
    }

    @Nullable
    public final BiligameHotGame getGame() {
        return this.game;
    }

    @Nullable
    public final Integer getGameBaseId() {
        Integer numValueOf = this.gameBaseId;
        if (numValueOf == null) {
            BiligameHotGame biligameHotGame = this.game;
            numValueOf = (biligameHotGame == null || biligameHotGame == null) ? null : Integer.valueOf(biligameHotGame.gameBaseId);
        }
        return numValueOf;
    }

    @Nullable
    public final String getGameName() {
        return this.gameName;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getNewFlag() {
        return this.newFlag;
    }

    @Nullable
    public final String getWikiLink() {
        return this.wikiLink;
    }

    public final int getWikiNum() {
        return this.wikiNum;
    }

    @Nullable
    public final String getWikiTitle() {
        return this.wikiTitle;
    }

    public final boolean isNew() {
        boolean z6 = true;
        if (this.newFlag != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void setArticles(@Nullable List<WikiArticle> list) {
        this.articles = list;
    }

    public final void setGame(@Nullable BiligameHotGame biligameHotGame) {
        this.game = biligameHotGame;
    }

    public final void setGameBaseId(@Nullable Integer num) {
        this.gameBaseId = num;
    }

    public final void setGameName(@Nullable String str) {
        this.gameName = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setNewFlag(int i7) {
        this.newFlag = i7;
    }

    public final void setWikiLink(@Nullable String str) {
        this.wikiLink = str;
    }

    public final void setWikiNum(int i7) {
        this.wikiNum = i7;
    }

    public final void setWikiTitle(@Nullable String str) {
        this.wikiTitle = str;
    }
}
