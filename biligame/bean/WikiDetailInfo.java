package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/WikiDetailInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class WikiDetailInfo {
    public static final int $stable = 8;

    @JSONField(name = "announcement")
    @Nullable
    private WikiAnnouncement announcement;

    @JSONField(name = "fast_retrieval")
    @Nullable
    private List<WikiFastRetrievalInfo> fastRetrieval;

    @JSONField(name = NotificationCompat.CATEGORY_NAVIGATION)
    @Nullable
    private List<NavigationInfo> navigationList;

    @JSONField(name = "navigation_logo")
    @Nullable
    private String navigationLogo;

    @JSONField(name = "recent_changes")
    @Nullable
    private WikiRecentChanges recentChanges;

    @JSONField(name = "search_url")
    @Nullable
    private String searchUrl;

    @JSONField(name = "slideshow")
    @Nullable
    private List<WikiSlideshowInfo> slideshow;

    @JSONField(name = "strategy")
    @Nullable
    private List<WikiStrategyInfo> strategy;

    @JSONField(name = "wiki_about")
    @Nullable
    private WikiAboutInfo wikiAbout;

    @JSONField(name = "home_url")
    @Nullable
    private String wikiHomeUrl;

    @Nullable
    public final WikiAnnouncement getAnnouncement() {
        return this.announcement;
    }

    @Nullable
    public final List<WikiFastRetrievalInfo> getFastRetrieval() {
        return this.fastRetrieval;
    }

    @Nullable
    public final List<NavigationInfo> getNavigationList() {
        return this.navigationList;
    }

    @Nullable
    public final String getNavigationLogo() {
        return this.navigationLogo;
    }

    @Nullable
    public final WikiRecentChanges getRecentChanges() {
        return this.recentChanges;
    }

    @Nullable
    public final String getSearchUrl() {
        return this.searchUrl;
    }

    @Nullable
    public final List<WikiSlideshowInfo> getSlideshow() {
        return this.slideshow;
    }

    @Nullable
    public final List<WikiStrategyInfo> getStrategy() {
        return this.strategy;
    }

    @Nullable
    public final WikiAboutInfo getWikiAbout() {
        return this.wikiAbout;
    }

    @Nullable
    public final String getWikiHomeUrl() {
        return this.wikiHomeUrl;
    }

    public final void setAnnouncement(@Nullable WikiAnnouncement wikiAnnouncement) {
        this.announcement = wikiAnnouncement;
    }

    public final void setFastRetrieval(@Nullable List<WikiFastRetrievalInfo> list) {
        this.fastRetrieval = list;
    }

    public final void setNavigationList(@Nullable List<NavigationInfo> list) {
        this.navigationList = list;
    }

    public final void setNavigationLogo(@Nullable String str) {
        this.navigationLogo = str;
    }

    public final void setRecentChanges(@Nullable WikiRecentChanges wikiRecentChanges) {
        this.recentChanges = wikiRecentChanges;
    }

    public final void setSearchUrl(@Nullable String str) {
        this.searchUrl = str;
    }

    public final void setSlideshow(@Nullable List<WikiSlideshowInfo> list) {
        this.slideshow = list;
    }

    public final void setStrategy(@Nullable List<WikiStrategyInfo> list) {
        this.strategy = list;
    }

    public final void setWikiAbout(@Nullable WikiAboutInfo wikiAboutInfo) {
        this.wikiAbout = wikiAboutInfo;
    }

    public final void setWikiHomeUrl(@Nullable String str) {
        this.wikiHomeUrl = str;
    }
}
