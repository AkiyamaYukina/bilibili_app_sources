package com.bilibili.search2.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchArticleCard;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.search2.api.BaseSearchItem;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/c.class */
@StabilityInferred(parameters = 0)
public final class c extends BaseSearchItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @JSONField(name = "play")
    private int f86302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JSONField(name = IVideoLikeRouteService.ACTION_LIKE)
    private int f86303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JSONField(name = "reply")
    private int f86304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @JSONField(name = "image_urls")
    @Nullable
    private List<String> f86305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @JSONField(name = "author")
    @Nullable
    private String f86306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @JSONField(name = "pub_time")
    @Nullable
    private String f86307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @JSONField(name = "badge")
    @Nullable
    private String f86308g;

    @JSONField(name = "desc")
    @Nullable
    private String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @JSONField(name = "name")
    @Nullable
    private String f86309i;

    public c() {
    }

    public c(@NotNull SearchArticleCard searchArticleCard) {
        this.f86302a = searchArticleCard.getPlay();
        this.f86303b = searchArticleCard.getLike();
        this.f86304c = searchArticleCard.getReply();
        this.f86305d = searchArticleCard.getImageUrlsList();
        this.f86306e = searchArticleCard.getAuthor();
        setTitle(searchArticleCard.getTitle());
        setCover(searchArticleCard.getCover());
        this.h = searchArticleCard.getDesc();
        this.f86307f = searchArticleCard.getPubTime();
        this.f86308g = searchArticleCard.getBadge();
        this.f86309i = searchArticleCard.getName();
        if (searchArticleCard.hasFeedback()) {
            setFeedback(new BaseSearchItem.Feedback(searchArticleCard.getFeedback()));
        }
    }

    @Nullable
    public final String getAuthor() {
        return this.f86306e;
    }

    @Nullable
    public final String getBadge() {
        return this.f86308g;
    }

    @Nullable
    public final String getDesc() {
        return this.h;
    }

    @Nullable
    public final List<String> getImageUrls() {
        return this.f86305d;
    }

    public final int getLike() {
        return this.f86303b;
    }

    @Nullable
    public final String getName() {
        return this.f86309i;
    }

    @Nullable
    public final String getPublishTime() {
        return this.f86307f;
    }
}
