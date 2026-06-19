package com.bilibili.search2.result.holder.chatgpt.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.broadcast.message.main.ArticleCard;
import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/api/d.class */
@StabilityInferred(parameters = 0)
public final class d extends BaseSearchItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @JSONField(name = IVideoLikeRouteService.ACTION_LIKE)
    private int f87989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JSONField(name = "reply")
    private int f87990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JSONField(name = "author")
    @Nullable
    private String f87991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @JSONField(name = "pub_time")
    @Nullable
    private String f87992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @JSONField(name = "badge")
    @Nullable
    private String f87993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @JSONField(name = "desc")
    @Nullable
    private String f87994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @JSONField(name = EditCustomizeSticker.TAG_MID)
    @Nullable
    private Long f87995g;

    @JSONField(name = "view")
    @Nullable
    private Integer h;

    public d(@NotNull ArticleCard articleCard) {
        this.f87989a = articleCard.getLike();
        this.f87990b = articleCard.getReply();
        this.f87991c = articleCard.getAuthor();
        setTitle(articleCard.getTitle());
        setCover(articleCard.getCover());
        this.f87994f = articleCard.getDesc();
        this.f87992d = articleCard.getPubTime();
        this.f87993e = articleCard.getBadge();
        this.f87995g = Long.valueOf(articleCard.getMid());
        this.h = Integer.valueOf(articleCard.getView());
    }

    @Nullable
    public final String getAuthor() {
        return this.f87991c;
    }

    @Nullable
    public final String getBadge() {
        return this.f87993e;
    }

    @Nullable
    public final String getDesc() {
        return this.f87994f;
    }

    public final int getLike() {
        return this.f87989a;
    }

    @Nullable
    public final String getPublishTime() {
        return this.f87992d;
    }
}
