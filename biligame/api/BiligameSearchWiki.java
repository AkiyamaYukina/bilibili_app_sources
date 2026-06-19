package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.report.ReportExtra;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameSearchWiki.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligameSearchWiki {
    public static final int $stable = 8;

    @JSONField(name = "game_id")
    @Nullable
    private String gameId;

    @JSONField(name = "game_link")
    @Nullable
    private String gameLink;

    @JSONField(name = "game_name")
    @Nullable
    private String gameName;

    @JSONField(name = "page_body_highlight")
    @Nullable
    private String pageBocyHighlight;

    @JSONField(name = "page_body")
    @Nullable
    private String pageBody;

    @JSONField(name = "page_comments")
    private long pageComments;

    @JSONField(name = "page_id")
    @Nullable
    private String pageId;

    @JSONField(name = "page_title")
    @Nullable
    private String pageTitle;

    @JSONField(name = "page_title_highlight")
    @Nullable
    private String pageTitleHighlight;

    @JSONField(name = "page_url")
    @Nullable
    private String pageUrl;

    @Nullable
    private ReportExtra reportExtra;

    @JSONField(name = "wiki_id")
    @Nullable
    private String wikiId;

    @Nullable
    public final String getGameId() {
        return this.gameId;
    }

    @Nullable
    public final String getGameLink() {
        return this.gameLink;
    }

    @Nullable
    public final String getGameName() {
        return this.gameName;
    }

    @Nullable
    public final String getPageBocyHighlight() {
        return this.pageBocyHighlight;
    }

    @Nullable
    public final String getPageBody() {
        return this.pageBody;
    }

    public final long getPageComments() {
        return this.pageComments;
    }

    @Nullable
    public final String getPageId() {
        return this.pageId;
    }

    @Nullable
    public final String getPageTitle() {
        return this.pageTitle;
    }

    @Nullable
    public final String getPageTitleHighlight() {
        return this.pageTitleHighlight;
    }

    @Nullable
    public final String getPageUrl() {
        return this.pageUrl;
    }

    @Nullable
    public final ReportExtra getReportExtra() {
        return this.reportExtra;
    }

    @Nullable
    public final String getWikiId() {
        return this.wikiId;
    }

    public final void setGameId(@Nullable String str) {
        this.gameId = str;
    }

    public final void setGameLink(@Nullable String str) {
        this.gameLink = str;
    }

    public final void setGameName(@Nullable String str) {
        this.gameName = str;
    }

    public final void setPageBocyHighlight(@Nullable String str) {
        this.pageBocyHighlight = str;
    }

    public final void setPageBody(@Nullable String str) {
        this.pageBody = str;
    }

    public final void setPageComments(long j7) {
        this.pageComments = j7;
    }

    public final void setPageId(@Nullable String str) {
        this.pageId = str;
    }

    public final void setPageTitle(@Nullable String str) {
        this.pageTitle = str;
    }

    public final void setPageTitleHighlight(@Nullable String str) {
        this.pageTitleHighlight = str;
    }

    public final void setPageUrl(@Nullable String str) {
        this.pageUrl = str;
    }

    public final void setReportExtra(@Nullable ReportExtra reportExtra) {
        if (reportExtra != null) {
            reportExtra.put("page_id", this.pageId);
        }
        if (reportExtra != null) {
            reportExtra.put("wiki_id", this.wikiId);
        }
        this.reportExtra = reportExtra;
    }

    public final void setWikiId(@Nullable String str) {
        this.wikiId = str;
    }
}
