package com.bilibili.search2.api;

import Ps0.X;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.ReasonStyle;
import com.bapis.bilibili.polymer.app.search.v1.SearchBangumiCard;
import com.bapis.bilibili.polymer.app.search.v1.ThreePoint;
import com.bilibili.commons.StringUtils;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchBangumiItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchBangumiItem extends BaseSearchItem {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();
    public static final int TYPE_BANGUMI = 1;
    public static final int TYPE_DOCUMENTARY = 3;
    public static final int TYPE_DOMESTIC_BANGUMI = 4;
    public static final int TYPE_FULLNET_BANGUMI = 127;
    public static final int TYPE_FULLNET_DOCUMENTARY = 125;
    public static final int TYPE_FULLNET_MOVIE = 126;
    public static final int TYPE_FULLNET_TV = 123;
    public static final int TYPE_FULLNET_VARIETY = 124;
    public static final int TYPE_MOVIE = 2;
    public static final int TYPE_TV = 5;

    @JSONField(name = "area")
    @Nullable
    private String area;

    @JSONField(name = "badges")
    @Nullable
    private List<? extends Tag> badges;

    @JSONField(name = "badges_v2")
    @Nullable
    private List<? extends Tag> badgesV2;

    @JSONField(name = "check_more")
    @Nullable
    private CheckMore checkMore;

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private final ArrayList<String> clickEpisode = new ArrayList<>();

    @JSONField(name = "cv")
    @Nullable
    private String cv;

    @JSONField(name = "episodes")
    @Nullable
    private List<Episode> episodes;

    @JSONField(name = "episodes_new")
    @Nullable
    private List<EpisodeNew> episodesNew;

    @JSONField(name = "follow_button")
    @Nullable
    private FollowButton followButton;
    private int iconType;

    @JSONField(name = "is_atten")
    private int isAtten;

    @JSONField(name = "is_out")
    private int isOut;

    @JSONField(name = "is_selection")
    private int isSelection;
    private int itemOffset;

    @JSONField(name = "label")
    @Nullable
    private String label;

    @JSONField(name = "media_type")
    private int mediaType;

    @Nullable
    private String ogvAggregateTitle;

    @JSONField(name = "out_icon")
    @Nullable
    private String outIcon;

    @JSONField(name = "out_name")
    @Nullable
    private String outName;

    @JSONField(name = "out_url")
    @Nullable
    private String outUrl;

    @JSONField(name = "play_state")
    private int playState;

    @JSONField(name = "prompt")
    @Nullable
    private String prompt;

    @JSONField(name = "ptime")
    private long ptime;

    @JSONField(name = "rating")
    private double rating;

    @JSONField(name = "sale_info")
    @Nullable
    private b saleInfo;
    private int scrollPosition;

    @JSONField(name = "season_id")
    private long seasonId;

    @JSONField(name = "season_type_name")
    @Nullable
    private String seasonTypeName;

    @JSONField(name = "selection_style")
    @Nullable
    private String selectionStyle;

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private String shareTitle;

    @JSONField(name = "staff")
    @Nullable
    private String staff;

    @JSONField(name = "style")
    @Nullable
    private String style;

    @JSONField(name = "style_label")
    @Nullable
    private Tag styleLabel;

    @JSONField(name = "styles")
    @Nullable
    private String styles;

    @JSONField(name = "styles_v2")
    @Nullable
    private String stylesV2;

    @JSONField(name = "target")
    @Nullable
    private String target;

    @Nullable
    private String viewContent;

    @JSONField(name = "vote")
    private int vote;

    @JSONField(name = "watch_button")
    @Nullable
    private X watchButton;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchBangumiItem$CheckMore.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class CheckMore {
        public static final int $stable = 8;

        @JSONField(name = TextSource.CFG_CONTENT)
        @Nullable
        private String content;

        @JSONField(name = EditCustomizeSticker.TAG_URI)
        @Nullable
        private String uri;

        public CheckMore() {
        }

        public CheckMore(@NotNull com.bapis.bilibili.polymer.app.search.v1.CheckMore checkMore) {
            this.content = checkMore.getContent();
            this.uri = checkMore.getUri();
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final String getUri() {
            return this.uri;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setUri(@Nullable String str) {
            this.uri = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchBangumiItem$FollowButton.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class FollowButton {
        public static final int $stable = 8;

        @JSONField(name = "icon")
        @Nullable
        private String icon;

        @JSONField(name = "status_report")
        @Nullable
        private String statusReport;

        @JSONField(name = "texts")
        @Nullable
        private FollowButtonTexts texts;

        public FollowButton() {
        }

        public FollowButton(@NotNull com.bapis.bilibili.polymer.app.search.v1.FollowButton followButton) {
            this.icon = followButton.getIcon();
            this.statusReport = followButton.getStatusReport();
            this.texts = new FollowButtonTexts(followButton.getTextsMap());
        }

        @Nullable
        public final String getIcon() {
            return this.icon;
        }

        @Nullable
        public final String getStatusReport() {
            return this.statusReport;
        }

        @Nullable
        public final FollowButtonTexts getTexts() {
            return this.texts;
        }

        public final void setIcon(@Nullable String str) {
            this.icon = str;
        }

        public final void setStatusReport(@Nullable String str) {
            this.statusReport = str;
        }

        public final void setTexts(@Nullable FollowButtonTexts followButtonTexts) {
            this.texts = followButtonTexts;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchBangumiItem$FollowButtonTexts.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class FollowButtonTexts {
        public static final int $stable = 8;

        @JSONField(name = "1")
        @Nullable
        private String selected;

        @JSONField(name = "0")
        @Nullable
        private String unselect;

        public FollowButtonTexts() {
        }

        public FollowButtonTexts(@NotNull Map<String, String> map) {
            this.unselect = map.get("0");
            this.selected = map.get("1");
        }

        @Nullable
        public final String getSelected() {
            return this.selected;
        }

        @Nullable
        public final String getUnselect() {
            return this.unselect;
        }

        public final void setSelected(@Nullable String str) {
            this.selected = str;
        }

        public final void setUnselect(@Nullable String str) {
            this.unselect = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchBangumiItem$PurchaseButton.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class PurchaseButton {
        public static final int $stable = 8;

        @JSONField(name = "jump_url")
        @Nullable
        private String jumpUrl;

        @JSONField(name = "text")
        @Nullable
        private String text;

        public PurchaseButton() {
        }

        public PurchaseButton(@NotNull com.bapis.bilibili.polymer.app.search.v1.PurchaseButton purchaseButton) {
            this.jumpUrl = purchaseButton.getJumpUrl();
            this.text = purchaseButton.getText();
        }

        @Nullable
        public final String getJumpUrl() {
            return this.jumpUrl;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        public final void setJumpUrl(@Nullable String str) {
            this.jumpUrl = str;
        }

        public final void setText(@Nullable String str) {
            this.text = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchBangumiItem$a.class */
    public static final class a {
        public static boolean a(int i7) {
            boolean z6 = true;
            if (i7 != 1) {
                z6 = i7 == 4;
            }
            return z6;
        }
    }

    public SearchBangumiItem() {
    }

    public SearchBangumiItem(@NotNull SearchBangumiCard searchBangumiCard) {
        this.mediaType = searchBangumiCard.getMediaType();
        this.playState = searchBangumiCard.getPlayState();
        this.area = searchBangumiCard.getArea();
        this.style = searchBangumiCard.getStyle();
        this.styles = searchBangumiCard.getStyles();
        this.cv = searchBangumiCard.getCv();
        this.rating = searchBangumiCard.getRating();
        this.vote = searchBangumiCard.getVote();
        this.target = searchBangumiCard.getTarget();
        this.staff = searchBangumiCard.getStaff();
        this.prompt = searchBangumiCard.getPrompt();
        this.ptime = searchBangumiCard.getPtime();
        this.seasonTypeName = searchBangumiCard.getSeasonTypeName();
        ArrayList arrayList = new ArrayList();
        Iterator it = searchBangumiCard.getEpisodesList().iterator();
        while (it.hasNext()) {
            arrayList.add(new Episode((com.bapis.bilibili.polymer.app.search.v1.Episode) it.next()));
        }
        if (!arrayList.isEmpty()) {
            this.episodes = arrayList;
        }
        this.isSelection = searchBangumiCard.getIsSelection();
        this.isAtten = searchBangumiCard.getIsAtten();
        this.label = searchBangumiCard.getLabel();
        this.seasonId = searchBangumiCard.getSeasonId();
        this.outName = searchBangumiCard.getOutName();
        this.outIcon = searchBangumiCard.getOutIcon();
        this.outUrl = searchBangumiCard.getOutUrl();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = searchBangumiCard.getBadgesList().iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Tag((ReasonStyle) it2.next()));
        }
        if (!arrayList2.isEmpty()) {
            this.badges = arrayList2;
        }
        this.isOut = searchBangumiCard.getIsOut();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = searchBangumiCard.getEpisodesNewList().iterator();
        while (it3.hasNext()) {
            arrayList3.add(new EpisodeNew((com.bapis.bilibili.polymer.app.search.v1.EpisodeNew) it3.next()));
        }
        if (!arrayList3.isEmpty()) {
            this.episodesNew = arrayList3;
        }
        if (searchBangumiCard.hasWatchButton()) {
            this.watchButton = new X(searchBangumiCard.getWatchButton());
        }
        this.selectionStyle = searchBangumiCard.getSelectionStyle();
        if (searchBangumiCard.hasCheckMore()) {
            this.checkMore = new CheckMore(searchBangumiCard.getCheckMore());
        }
        if (searchBangumiCard.hasFollowButton()) {
            this.followButton = new FollowButton(searchBangumiCard.getFollowButton());
        }
        setTitle(searchBangumiCard.getTitle());
        setCover(searchBangumiCard.getCover());
        if (searchBangumiCard.hasStyleLabel()) {
            this.styleLabel = new Tag(searchBangumiCard.getStyleLabel());
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = searchBangumiCard.getBadgesV2List().iterator();
        while (it4.hasNext()) {
            arrayList4.add(new Tag((ReasonStyle) it4.next()));
        }
        if (!arrayList4.isEmpty()) {
            this.badgesV2 = arrayList4;
        }
        this.stylesV2 = searchBangumiCard.getStylesV2();
        if (searchBangumiCard.hasSaleInfo()) {
            this.saleInfo = new b(searchBangumiCard.getSaleInfo());
        }
        this.viewContent = searchBangumiCard.getViewContent();
        this.iconType = searchBangumiCard.getIconType();
        if (searchBangumiCard.hasShare()) {
            setShare(new BaseSearchItem.Share(searchBangumiCard.getShare()));
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = searchBangumiCard.getThreePointList().iterator();
        while (it5.hasNext()) {
            arrayList5.add(new BaseSearchItem.ThreePointItem((ThreePoint) it5.next()));
        }
        if (arrayList5.isEmpty()) {
            return;
        }
        setThreePoints(arrayList5);
    }

    public final void clickEpisode(@Nullable String str) {
        ArrayList<String> arrayList = this.clickEpisode;
        if (arrayList != null) {
            arrayList.add(str);
        }
    }

    @Nullable
    public final String getArea() {
        return this.area;
    }

    @Nullable
    public final List<Tag> getBadges() {
        return this.badges;
    }

    @Nullable
    public final List<Tag> getBadgesV2() {
        return this.badgesV2;
    }

    @Nullable
    public final CheckMore getCheckMore() {
        return this.checkMore;
    }

    @Nullable
    public final ArrayList<String> getClickEpisode() {
        return this.clickEpisode;
    }

    @Nullable
    public final String getCv() {
        return this.cv;
    }

    @Nullable
    public final List<Episode> getEpisodes() {
        return this.episodes;
    }

    @Nullable
    public final List<EpisodeNew> getEpisodesNew() {
        return this.episodesNew;
    }

    @Nullable
    public final FollowButton getFollowButton() {
        return this.followButton;
    }

    public final int getIconType() {
        return this.iconType;
    }

    public final int getItemOffset() {
        return this.itemOffset;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    @Nullable
    public final String getOgvAggregateTitle() {
        return this.ogvAggregateTitle;
    }

    @Nullable
    public final String getOutIcon() {
        return this.outIcon;
    }

    @Nullable
    public final String getOutName() {
        return this.outName;
    }

    @Nullable
    public final String getOutUrl() {
        return this.outUrl;
    }

    public final int getPlayState() {
        return this.playState;
    }

    @Nullable
    public final String getPrompt() {
        return this.prompt;
    }

    public final long getPtime() {
        return this.ptime;
    }

    public final double getRating() {
        return this.rating;
    }

    @Nullable
    public final b getSaleInfo() {
        return this.saleInfo;
    }

    public final int getScrollPosition() {
        return this.scrollPosition;
    }

    public final long getSeasonId() {
        return this.seasonId;
    }

    @Nullable
    public final String getSeasonTypeName() {
        return this.seasonTypeName;
    }

    @Nullable
    public final String getSelectionStyle() {
        return this.selectionStyle;
    }

    @Nullable
    public final String getShareTitle() {
        return this.shareTitle;
    }

    @Nullable
    public final String getStaff() {
        return this.staff;
    }

    @Nullable
    public final String getStyle() {
        return this.style;
    }

    @Nullable
    public final Tag getStyleLabel() {
        return this.styleLabel;
    }

    @Nullable
    public final String getStyles() {
        return this.styles;
    }

    @Nullable
    public final String getStylesV2() {
        return this.stylesV2;
    }

    @Nullable
    public final String getTarget() {
        return this.target;
    }

    @Nullable
    public final String getViewContent() {
        return this.viewContent;
    }

    public final int getVote() {
        return this.vote;
    }

    @Nullable
    public final X getWatchButton() {
        return this.watchButton;
    }

    public final boolean hasFollowTextFromNetwork() {
        FollowButton followButton = this.followButton;
        return (followButton == null || followButton.getTexts() == null || StringUtils.isEmpty(this.followButton.getTexts().getSelected()) || StringUtils.isEmpty(this.followButton.getTexts().getUnselect())) ? false : true;
    }

    public final int isAtten() {
        return this.isAtten;
    }

    public final int isOut() {
        return this.isOut;
    }

    public final int isSelection() {
        return this.isSelection;
    }

    public final boolean isShowEpisodesSelectLayout() {
        boolean z6 = true;
        if (this.isSelection != 1) {
            z6 = false;
        }
        return z6;
    }

    public final void setArea(@Nullable String str) {
        this.area = str;
    }

    public final void setAtten(int i7) {
        this.isAtten = i7;
    }

    public final void setBadges(@Nullable List<? extends Tag> list) {
        this.badges = list;
    }

    public final void setBadgesV2(@Nullable List<? extends Tag> list) {
        this.badgesV2 = list;
    }

    public final void setCheckMore(@Nullable CheckMore checkMore) {
        this.checkMore = checkMore;
    }

    public final void setCv(@Nullable String str) {
        this.cv = str;
    }

    public final void setEpisodes(@Nullable List<Episode> list) {
        this.episodes = list;
    }

    public final void setEpisodesNew(@Nullable List<EpisodeNew> list) {
        this.episodesNew = list;
    }

    public final void setFollowButton(@Nullable FollowButton followButton) {
        this.followButton = followButton;
    }

    public final void setIconType(int i7) {
        this.iconType = i7;
    }

    public final void setItemOffset(int i7) {
        this.itemOffset = i7;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }

    public final void setMediaType(int i7) {
        this.mediaType = i7;
    }

    public final void setOgvAggregateTitle(@Nullable String str) {
        this.ogvAggregateTitle = str;
    }

    public final void setOut(int i7) {
        this.isOut = i7;
    }

    public final void setOutIcon(@Nullable String str) {
        this.outIcon = str;
    }

    public final void setOutName(@Nullable String str) {
        this.outName = str;
    }

    public final void setOutUrl(@Nullable String str) {
        this.outUrl = str;
    }

    public final void setPlayState(int i7) {
        this.playState = i7;
    }

    public final void setPrompt(@Nullable String str) {
        this.prompt = str;
    }

    public final void setPtime(long j7) {
        this.ptime = j7;
    }

    public final void setRating(double d7) {
        this.rating = d7;
    }

    public final void setSaleInfo(@Nullable b bVar) {
        this.saleInfo = bVar;
    }

    public final void setScrollPosition(int i7) {
        this.scrollPosition = i7;
    }

    public final void setSeasonId(long j7) {
        this.seasonId = j7;
    }

    public final void setSeasonTypeName(@Nullable String str) {
        this.seasonTypeName = str;
    }

    public final void setSelection(int i7) {
        this.isSelection = i7;
    }

    public final void setSelectionStyle(@Nullable String str) {
        this.selectionStyle = str;
    }

    public final void setShareTitle(@Nullable String str) {
        this.shareTitle = str;
    }

    public final void setStaff(@Nullable String str) {
        this.staff = str;
    }

    public final void setStyle(@Nullable String str) {
        this.style = str;
    }

    public final void setStyleLabel(@Nullable Tag tag) {
        this.styleLabel = tag;
    }

    public final void setStyles(@Nullable String str) {
        this.styles = str;
    }

    public final void setStylesV2(@Nullable String str) {
        this.stylesV2 = str;
    }

    public final void setTarget(@Nullable String str) {
        this.target = str;
    }

    public final void setViewContent(@Nullable String str) {
        this.viewContent = str;
    }

    public final void setVote(int i7) {
        this.vote = i7;
    }

    public final void setWatchButton(@Nullable X x6) {
        this.watchButton = x6;
    }

    public final boolean showFooterMore() {
        CheckMore checkMore = this.checkMore;
        return (checkMore == null || StringUtils.isEmpty(checkMore.getContent()) || StringUtils.isEmpty(this.checkMore.getUri())) ? false : true;
    }
}
