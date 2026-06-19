package com.bilibili.search2.result.holder.aichat;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchAIChatCard;
import com.bilibili.search2.api.BaseSearchItem;
import kntr.app.search.aicard.container.LikeState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/aichat/SearchAIChatItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchAIChatItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "auto_expand")
    private boolean autoExpand;

    @Nullable
    private String business;

    @Nullable
    private Boolean collapsed;
    private boolean hasReportedTerminalPhase;

    @NotNull
    private LikeState likeState;
    private long messageId;

    @JSONField(name = "negative_feedback")
    @Nullable
    private BaseSearchItem.Feedback negativeFeedback;

    @JSONField(name = "session_id")
    @Nullable
    private String sessionId;

    public SearchAIChatItem() {
        this.likeState = LikeState.DEFAULT;
    }

    public SearchAIChatItem(@NotNull SearchAIChatCard searchAIChatCard) {
        this();
        this.sessionId = searchAIChatCard.getSessionId();
        setTitle(searchAIChatCard.getTitle());
        this.autoExpand = searchAIChatCard.getAutoExpand();
        this.negativeFeedback = searchAIChatCard.hasFeedback() ? new BaseSearchItem.Feedback(searchAIChatCard.getFeedback()) : null;
    }

    public final boolean getAutoExpand() {
        return this.autoExpand;
    }

    @Nullable
    public final String getBusiness() {
        return this.business;
    }

    @Nullable
    public final Boolean getCollapsed() {
        return this.collapsed;
    }

    public final boolean getHasReportedTerminalPhase() {
        return this.hasReportedTerminalPhase;
    }

    @NotNull
    public final LikeState getLikeState() {
        return this.likeState;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    @Nullable
    public final BaseSearchItem.Feedback getNegativeFeedback() {
        return this.negativeFeedback;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    public final void setAutoExpand(boolean z6) {
        this.autoExpand = z6;
    }

    public final void setBusiness(@Nullable String str) {
        this.business = str;
    }

    public final void setCollapsed(@Nullable Boolean bool) {
        this.collapsed = bool;
    }

    public final void setHasReportedTerminalPhase(boolean z6) {
        this.hasReportedTerminalPhase = z6;
    }

    public final void setLikeState(@NotNull LikeState likeState) {
        this.likeState = likeState;
    }

    public final void setMessageId(long j7) {
        this.messageId = j7;
    }

    public final void setNegativeFeedback(@Nullable BaseSearchItem.Feedback feedback) {
        this.negativeFeedback = feedback;
    }

    public final void setSessionId(@Nullable String str) {
        this.sessionId = str;
    }
}
