package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.report.ReportExtra;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameStrategyPage.class */
@Keep
public class BiligameStrategyPage {
    public static final int CONTENT_TYPE_IMAGE_TEXT = 1;
    public static final int CONTENT_TYPE_VIDEO = 2;
    public String aid;

    @JSONField(name = "article_id")
    public String articleId;

    @JSONField(name = "article_title")
    public String articleTitle;

    @JSONField(name = "article_title_highlight")
    public String articleTitleHighlight;

    @JSONField(name = "article_type")
    public int articleType;

    @JSONField(name = "av_id")
    public String avId;

    @JSONField(name = "bv_id")
    public String bvId;

    @JSONField(name = "clip_cover_image")
    public String clipCoverImage;

    @JSONField(name = "content_type")
    public int contentType;

    @JSONField(name = "cover_image")
    public String coverImage;

    @JSONField(name = "expanded_name")
    public String expandedName;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "game_name")
    public String gameName;
    private ReportExtra reportExtra;
    public int source;

    @JSONField(name = "strategy_category_name")
    public String strategyCategoryName;

    @JSONField(name = "strategy_id")
    public String strategyId;

    @JSONField(name = "strategy_summary")
    public String strategySummary;

    @JSONField(name = "strategy_summary_highlight")
    public String strategySummaryHighlight;

    @JSONField(name = "up_count")
    public int upCount;

    @JSONField(name = "user_avatar")
    public String userAvatar;

    @JSONField(name = "user_id")
    public String userId;

    @JSONField(name = "user_name")
    public String userName;

    @JSONField(name = "view_count")
    public int viewCount;

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BiligameStrategyPage)) {
            return false;
        }
        String str = this.articleId;
        if (str == null || !str.equals(((BiligameStrategyPage) obj).articleId)) {
            z6 = false;
        }
        return z6;
    }

    public ReportExtra getReportExtra() {
        return this.reportExtra;
    }

    public int hashCode() {
        String str = this.articleId;
        return str != null ? str.hashCode() : super.hashCode();
    }

    public void setReportExtra(ReportExtra reportExtra) {
        if (reportExtra != null) {
            reportExtra.put("article_id", this.articleId);
        }
        this.reportExtra = reportExtra;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BiligameStrategyPage{articleId='");
        sb.append(this.articleId);
        sb.append("', articleType=");
        sb.append(this.articleType);
        sb.append(", articleTitle='");
        sb.append(this.articleTitle);
        sb.append("', contentType=");
        sb.append(this.contentType);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", userName='");
        sb.append(this.userName);
        sb.append("', userAvatar='");
        sb.append(this.userAvatar);
        sb.append("', strategyId='");
        sb.append(this.strategyId);
        sb.append("', strategySummary='");
        sb.append(this.strategySummary);
        sb.append("', gameName='");
        sb.append(this.gameName);
        sb.append("', viewCount=");
        sb.append(this.viewCount);
        sb.append(", upCount=");
        sb.append(this.upCount);
        sb.append(", coverImage='");
        sb.append(this.coverImage);
        sb.append("', clipCoverImage='");
        sb.append(this.clipCoverImage);
        sb.append("', avId='");
        sb.append(this.avId);
        sb.append("', gameBaseId=");
        sb.append(this.gameBaseId);
        sb.append(", aid=");
        sb.append(this.aid);
        sb.append(", strategyCategoryName='");
        return C8770a.a(sb, this.strategyCategoryName, "'}");
    }
}
