package com.bilibili.search2.api;

import G.p;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchGameCard;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchGameItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchGameItem extends BaseSearchItem {
    public static final int $stable = 8;

    @JSONField(name = "cloud_game_params")
    @Nullable
    private CloudGameParams cloudGameParams;

    @JSONField(name = "gift_content")
    @Nullable
    private String giftContent;

    @JSONField(name = "gift_url")
    @Nullable
    private String giftUrl;
    private boolean isEmphasize;

    @JSONField(name = "notice_content")
    @Nullable
    private String noticeContent;

    @JSONField(name = "notice_content_name")
    @Nullable
    private String noticeContentName;

    @JSONField(name = "notice_name")
    @Nullable
    private String noticeName;

    @JSONField(name = "rank_info")
    @Nullable
    private RankInfo rankInfo;

    @JSONField(name = "rating")
    private float rating;

    @JSONField(name = "new_rec_tag")
    @Nullable
    private Tag recTag;

    @JSONField(name = "reserve")
    @Nullable
    private String reserve;

    @JSONField(name = "reserve_status")
    private int reserveStatus;

    @JSONField(name = "show_cloud_game_entry")
    private boolean showCloudGameEntry;

    @JSONField(name = "special_bg_color")
    @Nullable
    private String special_bg_color;

    @JSONField(name = "tags")
    @Nullable
    private String tags;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchGameItem$CloudGameParams.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class CloudGameParams {
        public static final int $stable = 8;

        @Nullable
        private String scene;

        @JSONField(name = "source_from")
        @Nullable
        private String sourceFrom;

        public CloudGameParams() {
        }

        public CloudGameParams(@NotNull com.bapis.bilibili.polymer.app.search.v1.CloudGameParams cloudGameParams) {
            this.sourceFrom = String.valueOf(cloudGameParams.getSourceFrom());
            this.scene = cloudGameParams.getScene();
        }

        @Nullable
        public final String getScene() {
            return this.scene;
        }

        @Nullable
        public final String getSourceFrom() {
            return this.sourceFrom;
        }

        public final void setScene(@Nullable String str) {
            this.scene = str;
        }

        public final void setSourceFrom(@Nullable String str) {
            this.sourceFrom = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchGameItem$RankInfo.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class RankInfo {
        public static final int $stable = 8;

        @JSONField(name = "search_bkg_day_color")
        @Nullable
        private String bgDayColor;

        @JSONField(name = "search_bkg_night_color")
        @Nullable
        private String bgNightColor;

        @JSONField(name = "search_day_icon_url")
        @Nullable
        private String dayIconUrl;

        @JSONField(name = "search_font_day_color")
        @Nullable
        private String fontDayColor;

        @JSONField(name = "search_font_night_color")
        @Nullable
        private String fontNightColor;

        @JSONField(name = "search_night_icon_url")
        @Nullable
        private String nightIconUrl;

        @JSONField(name = "rank_content")
        @Nullable
        private String rankContent;

        @JSONField(name = "rank_link")
        @Nullable
        private String rankLink;

        public RankInfo() {
        }

        public RankInfo(@NotNull com.bapis.bilibili.polymer.app.search.v1.RankInfo rankInfo) {
            this.nightIconUrl = rankInfo.getSearchNightIconUrl();
            this.dayIconUrl = rankInfo.getSearchDayIconUrl();
            this.bgNightColor = rankInfo.getSearchBkgNightColor();
            this.bgDayColor = rankInfo.getSearchBkgDayColor();
            this.fontNightColor = rankInfo.getSearchFontNightColor();
            this.fontDayColor = rankInfo.getSearchFontDayColor();
            this.rankContent = rankInfo.getRankContent();
            this.rankLink = rankInfo.getRankLink();
        }

        @Nullable
        public final String getBgColor(boolean z6) {
            return z6 ? this.bgNightColor : this.bgDayColor;
        }

        @Nullable
        public final String getBgDayColor() {
            return this.bgDayColor;
        }

        @Nullable
        public final String getBgNightColor() {
            return this.bgNightColor;
        }

        @Nullable
        public final String getDayIconUrl() {
            return this.dayIconUrl;
        }

        @Nullable
        public final String getFontColor(boolean z6) {
            return z6 ? this.fontNightColor : this.fontDayColor;
        }

        @Nullable
        public final String getFontDayColor() {
            return this.fontDayColor;
        }

        @Nullable
        public final String getFontNightColor() {
            return this.fontNightColor;
        }

        @Nullable
        public final String getIconUrl(boolean z6) {
            return z6 ? this.nightIconUrl : this.dayIconUrl;
        }

        @Nullable
        public final String getNightIconUrl() {
            return this.nightIconUrl;
        }

        @Nullable
        public final String getRankContent() {
            return this.rankContent;
        }

        @Nullable
        public final String getRankLink() {
            return this.rankLink;
        }

        public final void setBgDayColor(@Nullable String str) {
            this.bgDayColor = str;
        }

        public final void setBgNightColor(@Nullable String str) {
            this.bgNightColor = str;
        }

        public final void setDayIconUrl(@Nullable String str) {
            this.dayIconUrl = str;
        }

        public final void setFontDayColor(@Nullable String str) {
            this.fontDayColor = str;
        }

        public final void setFontNightColor(@Nullable String str) {
            this.fontNightColor = str;
        }

        public final void setNightIconUrl(@Nullable String str) {
            this.nightIconUrl = str;
        }

        public final void setRankContent(@Nullable String str) {
            this.rankContent = str;
        }

        public final void setRankLink(@Nullable String str) {
            this.rankLink = str;
        }
    }

    public SearchGameItem() {
    }

    public SearchGameItem(@NotNull SearchGameCard searchGameCard) {
        Tag tag;
        this.reserve = searchGameCard.getReserve();
        this.rating = searchGameCard.getRating();
        this.tags = searchGameCard.getTags();
        this.noticeName = searchGameCard.getNoticeName();
        this.noticeContent = searchGameCard.getNoticeContent();
        this.noticeContentName = searchGameCard.getNoticeContentName();
        this.giftContent = searchGameCard.getGiftContent();
        this.giftUrl = searchGameCard.getGiftUrl();
        this.reserveStatus = searchGameCard.getReserveStatus();
        this.isEmphasize = searchGameCard.getGameStyle() == 2;
        if (searchGameCard.hasRankInfo()) {
            this.rankInfo = new RankInfo(searchGameCard.getRankInfo());
        }
        this.special_bg_color = searchGameCard.getSpecialBgColor();
        if (searchGameCard.hasCloudGameParams()) {
            this.cloudGameParams = new CloudGameParams(searchGameCard.getCloudGameParams());
        }
        this.showCloudGameEntry = searchGameCard.getShowCloudGameEntry();
        setTitle(searchGameCard.getTitle());
        setCover(searchGameCard.getCover());
        if (searchGameCard.hasNewRecTag()) {
            Tag tag2 = new Tag(searchGameCard.getNewRecTag());
            this.recTag = tag2;
            String text = tag2.getText();
            if (text == null || (tag = this.recTag) == null) {
                return;
            }
            tag.setText(text.length() > 10 ? p.a(StringsKt.take(text, 10), "...") : text);
        }
    }

    @NotNull
    public final String getClickActionType(@Nullable Integer num) {
        String str;
        if (num == null) {
            str = "jump_game_detail";
        } else {
            int iIntValue = num.intValue();
            str = iIntValue != 1 ? iIntValue != 2 ? "interaction_button_click" : "interaction_download" : "interaction_reserve";
        }
        return str;
    }

    @Nullable
    public final CloudGameParams getCloudGameParams() {
        return this.cloudGameParams;
    }

    @Nullable
    public final String getGiftContent() {
        return this.giftContent;
    }

    @Nullable
    public final String getGiftUrl() {
        return this.giftUrl;
    }

    @Nullable
    public final String getNoticeContent() {
        return this.noticeContent;
    }

    @Nullable
    public final String getNoticeContentName() {
        return this.noticeContentName;
    }

    @Nullable
    public final String getNoticeName() {
        return this.noticeName;
    }

    @Nullable
    public final RankInfo getRankInfo() {
        return this.rankInfo;
    }

    public final float getRating() {
        return this.rating;
    }

    @Nullable
    public final Tag getRecTag() {
        return this.recTag;
    }

    @Nullable
    public final String getReserve() {
        return this.reserve;
    }

    public final int getReserveStatus() {
        return this.reserveStatus;
    }

    public final boolean getShowCloudGameEntry() {
        return this.showCloudGameEntry;
    }

    @Nullable
    public final String getSpecial_bg_color() {
        return this.special_bg_color;
    }

    @Nullable
    public final String getTags() {
        return this.tags;
    }

    public final boolean isEmphasize() {
        return this.isEmphasize;
    }

    public final void setCloudGameParams(@Nullable CloudGameParams cloudGameParams) {
        this.cloudGameParams = cloudGameParams;
    }

    public final void setEmphasize(boolean z6) {
        this.isEmphasize = z6;
    }

    public final void setGiftContent(@Nullable String str) {
        this.giftContent = str;
    }

    public final void setGiftUrl(@Nullable String str) {
        this.giftUrl = str;
    }

    public final void setNoticeContent(@Nullable String str) {
        this.noticeContent = str;
    }

    public final void setNoticeContentName(@Nullable String str) {
        this.noticeContentName = str;
    }

    public final void setNoticeName(@Nullable String str) {
        this.noticeName = str;
    }

    public final void setRankInfo(@Nullable RankInfo rankInfo) {
        this.rankInfo = rankInfo;
    }

    public final void setRating(float f7) {
        this.rating = f7;
    }

    public final void setRecTag(@Nullable Tag tag) {
        this.recTag = tag;
    }

    public final void setReserve(@Nullable String str) {
        this.reserve = str;
    }

    public final void setReserveStatus(int i7) {
        this.reserveStatus = i7;
    }

    public final void setShowCloudGameEntry(boolean z6) {
        this.showCloudGameEntry = z6;
    }

    public final void setSpecial_bg_color(@Nullable String str) {
        this.special_bg_color = str;
    }

    public final void setTags(@Nullable String str) {
        this.tags = str;
    }
}
