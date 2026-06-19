package com.bilibili.search2.api;

import android.util.SparseBooleanArray;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.OGVShare;
import com.bapis.bilibili.polymer.app.search.v1.RcmdReason;
import com.bapis.bilibili.polymer.app.search.v1.ThreePoint;
import com.bapis.bilibili.polymer.app.search.v1.Video;
import com.bilibili.app.comm.list.common.data.StoryCardIcon;
import com.bilibili.commons.StringUtils;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchItem.class */
@StabilityInferred(parameters = 0)
@Keep
public class BaseSearchItem extends K90.c {
    public static final int $stable = 8;

    @Nullable
    private String alienationId;

    @JSONField(name = "card_business_badge")
    @Nullable
    private CardBusinessBadge businessBadge;

    @JSONField(name = "card_type")
    @Nullable
    private String cardType;

    @JSONField(name = "cover")
    @Nullable
    private String cover;

    @Nullable
    private String expStr;

    @JSONField(name = "feedback")
    @Nullable
    private Feedback feedback;

    @JSONField(name = "goto")
    @Nullable
    private String goTo;
    private boolean hasWideAutoFill;
    private boolean isExposed;

    @Nullable
    private Boolean isFolded;
    private boolean isInAlienationArea;

    @Nullable
    private String keyword;
    private boolean lastAlienationAreaCard;

    @JSONField(name = "linktype")
    @Nullable
    private String linkType;
    private int localPagePos;

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private SparseBooleanArray mClickArray;

    @Nullable
    private String moduleId;

    @JSONField(name = "new_rec_tags")
    @Nullable
    private List<? extends Tag> newRecTags;
    private long pageNum;

    @JSONField(name = "param")
    @Nullable
    private String param;

    @Nullable
    private String qvId;

    @JSONField(name = "rcmd_reason")
    @Nullable
    private RecommendReason recommendReason;
    private int refreshCount;

    @Nullable
    private Xs0.a reportExtra;

    @JSONField(deserialize = false, serialize = false)
    private boolean reportInit;

    @JSONField(name = "position")
    private int serverPagePos;

    @JSONField(name = "share")
    @Nullable
    private Share share;

    @JSONField(name = "spread_id")
    private long spreadId;

    @Nullable
    private String subGoto;

    @JSONField(name = "three_point")
    @Nullable
    private List<ThreePointItem> threePoints;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "trackid")
    @Nullable
    private String trackId;

    @JSONField(name = "translated_status")
    private long translatedStatus;

    @JSONField(name = "translated_title")
    @Nullable
    private String translatedTitle;

    @JSONField(name = EditCustomizeSticker.TAG_URI)
    @Nullable
    private String uri;

    @JSONField(name = "user_act")
    @Nullable
    private String userAct;

    @Nullable
    private com.bilibili.search2.main.data.c userActQuery;
    private boolean enableFeedbackRemoveItem = true;

    @JSONField(deserialize = false, serialize = false)
    @NotNull
    private final HashMap<String, String> reportMap = new HashMap<>();
    private boolean isAtFirstScreen = true;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchItem$Colors.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Colors {
        public static final int $stable = 8;

        @JSONField(name = "day")
        @Nullable
        private String day;

        @JSONField(name = "night")
        @Nullable
        private String night;

        public Colors() {
        }

        public Colors(@NotNull com.bapis.bilibili.polymer.app.search.v1.Colors colors) {
            this.day = colors.getDay();
            this.night = colors.getNight();
        }

        @Nullable
        public final String getDay() {
            return this.day;
        }

        @Nullable
        public final String getNight() {
            return this.night;
        }

        public final void setDay(@Nullable String str) {
            this.day = str;
        }

        public final void setNight(@Nullable String str) {
            this.night = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchItem$Feedback.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Feedback {
        public static final int $stable = 8;

        @JSONField(name = "sections")
        @Nullable
        private List<FeedbackSection> sections;

        public Feedback() {
        }

        public Feedback(@NotNull com.bapis.bilibili.polymer.app.search.v1.Feedback feedback) {
            if (feedback.getSectionsCount() > 0) {
                this.sections = new ArrayList();
                for (com.bapis.bilibili.polymer.app.search.v1.FeedbackSection feedbackSection : feedback.getSectionsList()) {
                    List<FeedbackSection> list = this.sections;
                    if (list != null) {
                        list.add(new FeedbackSection(feedbackSection));
                    }
                }
            }
        }

        @Nullable
        public final List<FeedbackSection> getSections() {
            return this.sections;
        }

        public final void setSections(@Nullable List<FeedbackSection> list) {
            this.sections = list;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchItem$FeedbackItem.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class FeedbackItem {
        public static final int $stable = 8;

        @JSONField(name = "id")
        private int id;

        @JSONField(name = "text")
        @Nullable
        private String text;

        public FeedbackItem() {
        }

        public FeedbackItem(@NotNull com.bapis.bilibili.polymer.app.search.v1.FeedbackItem feedbackItem) {
            this.text = feedbackItem.getText();
            this.id = feedbackItem.getId();
        }

        public final int getId() {
            return this.id;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        public final void setId(int i7) {
            this.id = i7;
        }

        public final void setText(@Nullable String str) {
            this.text = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchItem$FeedbackSection.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class FeedbackSection {
        public static final int $stable = 8;

        @JSONField(name = "items")
        @Nullable
        private List<FeedbackItem> items;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @JSONField(name = "type")
        @Nullable
        private String type;

        public FeedbackSection() {
        }

        public FeedbackSection(@NotNull com.bapis.bilibili.polymer.app.search.v1.FeedbackSection feedbackSection) {
            this.title = feedbackSection.getTitle();
            this.type = feedbackSection.getType();
            if (feedbackSection.getItemsCount() > 0) {
                this.items = new ArrayList();
                for (com.bapis.bilibili.polymer.app.search.v1.FeedbackItem feedbackItem : feedbackSection.getItemsList()) {
                    List<FeedbackItem> list = this.items;
                    if (list != null) {
                        list.add(new FeedbackItem(feedbackItem));
                    }
                }
            }
        }

        @Nullable
        public final List<FeedbackItem> getItems() {
            return this.items;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public final void setItems(@Nullable List<FeedbackItem> list) {
            this.items = list;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchItem$H5Share.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class H5Share {
        public static final int $stable = 8;

        @JSONField(name = "oid")
        @Nullable
        private String oid;

        @JSONField(name = "share_id")
        @Nullable
        private String shareId;

        public H5Share(@NotNull com.bapis.bilibili.polymer.app.search.v1.H5Share h5Share) {
            this.oid = h5Share.getOid();
            this.shareId = h5Share.getShareId();
        }

        @Nullable
        public final String getOid() {
            return this.oid;
        }

        @Nullable
        public final String getShareId() {
            return this.shareId;
        }

        public final void setOid(@Nullable String str) {
            this.oid = str;
        }

        public final void setShareId(@Nullable String str) {
            this.shareId = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchItem$OgvShare.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class OgvShare {
        public static final int $stable = 8;

        @JSONField(name = "aid")
        private long aid;

        @JSONField(name = "cid")
        private long cid;

        @JSONField(name = "epid")
        private long epId;

        @JSONField(name = "season_id")
        private long seasonId;

        @JSONField(name = "season_type")
        private long seasonType;

        @JSONField(name = "share_id")
        @Nullable
        private String shareId;

        @JSONField(name = "share_origin")
        @Nullable
        private String shareOrigin;

        public OgvShare(@NotNull OGVShare oGVShare) {
            this.aid = oGVShare.getAid();
            this.cid = oGVShare.getCid();
            this.seasonId = oGVShare.getSeasonId();
            this.seasonType = oGVShare.getSeasonType();
            this.epId = oGVShare.getEpid();
            this.shareId = oGVShare.getShareId();
            this.shareOrigin = oGVShare.getShareOrigin();
        }

        public final long getAid() {
            return this.aid;
        }

        public final long getCid() {
            return this.cid;
        }

        public final long getEpId() {
            return this.epId;
        }

        public final long getSeasonId() {
            return this.seasonId;
        }

        public final long getSeasonType() {
            return this.seasonType;
        }

        @Nullable
        public final String getShareId() {
            return this.shareId;
        }

        @Nullable
        public final String getShareOrigin() {
            return this.shareOrigin;
        }

        public final void setAid(long j7) {
            this.aid = j7;
        }

        public final void setCid(long j7) {
            this.cid = j7;
        }

        public final void setEpId(long j7) {
            this.epId = j7;
        }

        public final void setSeasonId(long j7) {
            this.seasonId = j7;
        }

        public final void setSeasonType(long j7) {
            this.seasonType = j7;
        }

        public final void setShareId(@Nullable String str) {
            this.shareId = str;
        }

        public final void setShareOrigin(@Nullable String str) {
            this.shareOrigin = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchItem$RecommendReason.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class RecommendReason {
        public static final int $stable = 8;

        @JSONField(name = TextSource.CFG_CONTENT)
        @Nullable
        private String content;

        public RecommendReason() {
        }

        public RecommendReason(@NotNull RcmdReason rcmdReason) {
            this.content = rcmdReason.getContent();
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchItem$Relation.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Relation {
        public static final int $stable = 8;

        @NotNull
        public static final a Companion = new Object();
        public static final int EACH_FOLLOW = 4;
        public static final int IS_FOLLOW = 2;
        public static final int IS_FOLLOWED = 3;
        public static final int NOT_FOLLOW = 1;

        @JSONField(name = NotificationCompat.CATEGORY_STATUS)
        private int status;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchItem$Relation$a.class */
        public static final class a {
        }

        public Relation() {
        }

        public Relation(@NotNull com.bapis.bilibili.polymer.app.search.v1.Relation relation) {
            this.status = relation.getStatus();
        }

        public final int getStatus() {
            return this.status;
        }

        public final boolean isUpFollowUser() {
            int i7 = this.status;
            return i7 == 3 || i7 == 4;
        }

        public final boolean isUserFollowUp() {
            int i7 = this.status;
            return i7 == 2 || i7 == 4;
        }

        public final void setStatus(int i7) {
            this.status = i7;
        }

        public final void setStatusWithFollow(boolean z6) {
            if (z6) {
                int i7 = this.status;
                if (i7 == 1) {
                    this.status = 2;
                    return;
                } else {
                    if (i7 == 3) {
                        this.status = 4;
                        return;
                    }
                    return;
                }
            }
            int i8 = this.status;
            if (i8 == 2) {
                this.status = 1;
            } else if (i8 == 4) {
                this.status = 3;
            }
        }

        public final void updateRelation(boolean z6, boolean z7) {
            if (z7) {
                this.status = z6 ? 4 : 3;
            } else {
                this.status = z6 ? 2 : 1;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchItem$Share.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Share {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: h5, reason: collision with root package name */
        @JSONField(name = "h5")
        @Nullable
        private H5Share f86274h5;

        @JSONField(name = "ogv")
        @Nullable
        private OgvShare ogvShare;

        @JSONField(name = "type")
        @Nullable
        private String type;

        @JSONField(name = "video")
        @Nullable
        private ShareVideo video;

        public Share() {
        }

        public Share(@NotNull com.bapis.bilibili.polymer.app.search.v1.Share share) {
            this.type = share.getType();
            if (share.hasVideo()) {
                this.video = new ShareVideo(share.getVideo());
            }
            if (share.hasOgv()) {
                this.ogvShare = new OgvShare(share.getOgv());
            }
            if (share.hasH5()) {
                this.f86274h5 = new H5Share(share.getH5());
            }
        }

        @Nullable
        public final H5Share getH5() {
            return this.f86274h5;
        }

        @Nullable
        public final OgvShare getOgvShare() {
            return this.ogvShare;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final ShareVideo getVideo() {
            return this.video;
        }

        public final void setH5(@Nullable H5Share h5Share) {
            this.f86274h5 = h5Share;
        }

        public final void setOgvShare(@Nullable OgvShare ogvShare) {
            this.ogvShare = ogvShare;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        public final void setVideo(@Nullable ShareVideo shareVideo) {
            this.video = shareVideo;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchItem$ShareVideo.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class ShareVideo {
        public static final int $stable = 8;

        @JSONField(name = "bvid")
        @Nullable
        private String bvid;

        @JSONField(name = "cid")
        private long cid;

        @JSONField(name = "is_hot_label")
        private boolean isHotLabel;

        @JSONField(name = MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE)
        private int page;

        @JSONField(name = "page_count")
        private int pageCount;

        @JSONField(name = "share_subtitle")
        @Nullable
        private String shareSubtitle;

        @JSONField(name = "short_link")
        @Nullable
        private String shortLink;

        public ShareVideo() {
        }

        public ShareVideo(@NotNull Video video) {
            this.bvid = video.getBvid();
            this.cid = video.getCid();
            this.shareSubtitle = video.getShareSubtitle();
            this.isHotLabel = video.getIsHotLabel();
            this.pageCount = video.getPageCount();
            this.page = video.getPage();
            this.shortLink = video.getShortLink();
        }

        @Nullable
        public final String getBvid() {
            return this.bvid;
        }

        public final long getCid() {
            return this.cid;
        }

        public final int getPage() {
            return this.page;
        }

        public final int getPageCount() {
            return this.pageCount;
        }

        @Nullable
        public final String getShareSubtitle() {
            return this.shareSubtitle;
        }

        @Nullable
        public final String getShortLink() {
            return this.shortLink;
        }

        public final boolean isHotLabel() {
            return this.isHotLabel;
        }

        public final void setBvid(@Nullable String str) {
            this.bvid = str;
        }

        public final void setCid(long j7) {
            this.cid = j7;
        }

        public final void setHotLabel(boolean z6) {
            this.isHotLabel = z6;
        }

        public final void setPage(int i7) {
            this.page = i7;
        }

        public final void setPageCount(int i7) {
            this.pageCount = i7;
        }

        public final void setShareSubtitle(@Nullable String str) {
            this.shareSubtitle = str;
        }

        public final void setShortLink(@Nullable String str) {
            this.shortLink = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/BaseSearchItem$ThreePointItem.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class ThreePointItem {
        public static final int $stable = 8;

        @JSONField(name = "alternate_icon")
        @Nullable
        private String alternateIcon;

        @JSONField(name = "alternate_title")
        @Nullable
        private String alternateTitle;

        @JSONField(name = "icon")
        @Nullable
        private String icon;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @JSONField(name = "type")
        @Nullable
        private String type;

        public ThreePointItem() {
        }

        public ThreePointItem(@NotNull ThreePoint threePoint) {
            this.type = threePoint.getType();
            this.icon = threePoint.getIcon();
            this.title = threePoint.getTitle();
            this.alternateTitle = threePoint.getAlternateTitle();
            this.alternateIcon = threePoint.getAlternateIcon();
        }

        @Nullable
        public final String getAlternateIcon() {
            return this.alternateIcon;
        }

        @Nullable
        public final String getAlternateTitle() {
            return this.alternateTitle;
        }

        @Nullable
        public final String getIcon() {
            return this.icon;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @JSONField(serialize = false)
        public final boolean itemCheckValid() {
            return (StringUtils.isEmpty(this.type) || StringUtils.isBlank(this.title)) ? false : true;
        }

        public final void setAlternateIcon(@Nullable String str) {
            this.alternateIcon = str;
        }

        public final void setAlternateTitle(@Nullable String str) {
            this.alternateTitle = str;
        }

        public final void setIcon(@Nullable String str) {
            this.icon = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }
    }

    public void afterInit() {
    }

    @NotNull
    public BaseSearchItem cloneFatherParam(@NotNull BaseSearchItem baseSearchItem) {
        setSpreadId(getSpreadId() != 0 ? getSpreadId() : baseSearchItem.getSpreadId());
        String linkType = getLinkType();
        String linkType2 = linkType;
        if (linkType == null) {
            linkType2 = baseSearchItem.getLinkType();
        }
        setLinkType(linkType2);
        String keyword = getKeyword();
        String keyword2 = keyword;
        if (keyword == null) {
            keyword2 = baseSearchItem.getKeyword();
        }
        setKeyword(keyword2);
        String trackId = getTrackId();
        String trackId2 = trackId;
        if (trackId == null) {
            trackId2 = baseSearchItem.getTrackId();
        }
        setTrackId(trackId2);
        String str = this.moduleId;
        String str2 = str;
        if (str == null) {
            str2 = baseSearchItem.moduleId;
        }
        this.moduleId = str2;
        String param = getParam();
        String param2 = param;
        if (param == null) {
            param2 = baseSearchItem.getParam();
        }
        setParam(param2);
        setPageNum(getPageNum() != 0 ? getPageNum() : baseSearchItem.getPageNum());
        setLocalPagePos(getLocalPagePos() != 0 ? getLocalPagePos() : baseSearchItem.getLocalPagePos());
        setServerPagePos(getServerPagePos() != 0 ? getServerPagePos() : baseSearchItem.getServerPagePos());
        String str3 = this.expStr;
        String str4 = str3;
        if (str3 == null) {
            str4 = baseSearchItem.expStr;
        }
        this.expStr = str4;
        String goTo = getGoTo();
        String goTo2 = goTo;
        if (goTo == null) {
            goTo2 = baseSearchItem.getGoTo();
        }
        setGoTo(goTo2);
        String qvId = getQvId();
        String qvId2 = qvId;
        if (qvId == null) {
            qvId2 = baseSearchItem.getQvId();
        }
        setQvId(qvId2);
        Xs0.a reportExtra = getReportExtra();
        Xs0.a reportExtra2 = reportExtra;
        if (reportExtra == null) {
            reportExtra2 = baseSearchItem.getReportExtra();
        }
        setReportExtra(reportExtra2);
        int i7 = this.refreshCount;
        if (i7 == 0) {
            i7 = baseSearchItem.refreshCount;
        }
        this.refreshCount = i7;
        Boolean bool = this.isFolded;
        Boolean bool2 = bool;
        if (bool == null) {
            bool2 = baseSearchItem.isFolded;
        }
        this.isFolded = bool2;
        afterInit();
        return this;
    }

    @Nullable
    public final String getAlienationId() {
        return this.alienationId;
    }

    @Nullable
    public final StoryCardIcon getBadgeIcon() {
        CardBusinessBadge cardBusinessBadge = this.businessBadge;
        return cardBusinessBadge != null ? cardBusinessBadge.getGotoIcon() : null;
    }

    @Nullable
    public final Tag getBadgeTag() {
        CardBusinessBadge cardBusinessBadge = this.businessBadge;
        return cardBusinessBadge != null ? cardBusinessBadge.getBadgeStyle() : null;
    }

    @Nullable
    public final CardBusinessBadge getBusinessBadge() {
        return this.businessBadge;
    }

    @Nullable
    public final String getCardType() {
        return this.cardType;
    }

    public final long getContentId() {
        String trackId = getTrackId();
        return (trackId != null ? ((long) trackId.hashCode()) << 32 : 0L) + ((long) hashCode());
    }

    @Nullable
    public String getCover() {
        return this.cover;
    }

    public boolean getEnableFeedbackRemoveItem() {
        return this.enableFeedbackRemoveItem;
    }

    @Nullable
    public final String getExpStr() {
        return this.expStr;
    }

    @Nullable
    public final Feedback getFeedback() {
        return this.feedback;
    }

    @Nullable
    public String getGoTo() {
        return this.goTo;
    }

    public final boolean getHasWideAutoFill() {
        return this.hasWideAutoFill;
    }

    @Nullable
    public String getKeyword() {
        return this.keyword;
    }

    public final boolean getLastAlienationAreaCard() {
        return this.lastAlienationAreaCard;
    }

    @Nullable
    public String getLinkType() {
        return this.linkType;
    }

    public int getLocalPagePos() {
        return this.localPagePos;
    }

    @Nullable
    public final String getModuleId() {
        return this.moduleId;
    }

    @Nullable
    public final List<Tag> getNewRecTags() {
        return this.newRecTags;
    }

    public long getPageNum() {
        return this.pageNum;
    }

    @Nullable
    public String getParam() {
        return this.param;
    }

    @Nullable
    public String getQvId() {
        return this.qvId;
    }

    @Nullable
    public final RecommendReason getRecommendReason() {
        return this.recommendReason;
    }

    public final int getRefreshCount() {
        return this.refreshCount;
    }

    @Nullable
    public Xs0.a getReportExtra() {
        return this.reportExtra;
    }

    @NotNull
    public final HashMap<String, String> getReportMap() {
        if (!this.reportInit) {
            this.reportInit = true;
            initReportParams(this.reportMap);
        }
        return this.reportMap;
    }

    public int getServerPagePos() {
        return this.serverPagePos;
    }

    @Nullable
    public Share getShare() {
        return this.share;
    }

    public long getSpreadId() {
        return this.spreadId;
    }

    @Nullable
    public final String getSubGoto() {
        return this.subGoto;
    }

    @Nullable
    public final List<ThreePointItem> getThreePoints() {
        return this.threePoints;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Nullable
    public String getTrackId() {
        return this.trackId;
    }

    public long getTranslatedStatus() {
        return this.translatedStatus;
    }

    @Nullable
    public String getTranslatedTitle() {
        return this.translatedTitle;
    }

    @Nullable
    public String getUri() {
        return this.uri;
    }

    @Nullable
    public final String getUserAct() {
        return this.userAct;
    }

    @Nullable
    public final com.bilibili.search2.main.data.c getUserActQuery() {
        return this.userActQuery;
    }

    public void initReportParams(@NotNull HashMap<String, String> map) {
    }

    public final boolean isAtFirstScreen() {
        return this.isAtFirstScreen;
    }

    public boolean isExposed() {
        return this.isExposed;
    }

    @Nullable
    public final Boolean isFolded() {
        return this.isFolded;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isHasClicked(int r4) {
        /*
            r3 = this;
            r0 = r3
            android.util.SparseBooleanArray r0 = r0.mClickArray
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L1c
            r0 = r7
            r1 = r4
            boolean r0 = r0.get(r1)
            r6 = r0
            r0 = 1
            r5 = r0
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L1c
            goto L1e
        L1c:
            r0 = 0
            r5 = r0
        L1e:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.api.BaseSearchItem.isHasClicked(int):boolean");
    }

    public final boolean isInAlienationArea() {
        return this.isInAlienationArea;
    }

    public final void setAlienationId(@Nullable String str) {
        this.alienationId = str;
    }

    public final void setAtFirstScreen(boolean z6) {
        this.isAtFirstScreen = z6;
    }

    public final void setBusinessBadge(@Nullable CardBusinessBadge cardBusinessBadge) {
        this.businessBadge = cardBusinessBadge;
    }

    public final void setCardType(@Nullable String str) {
        this.cardType = str;
    }

    public void setClicked(int i7, boolean z6) {
        if (this.mClickArray == null) {
            this.mClickArray = new SparseBooleanArray();
        }
        this.mClickArray.put(i7, z6);
    }

    public void setCover(@Nullable String str) {
        this.cover = str;
    }

    public void setEnableFeedbackRemoveItem(boolean z6) {
        this.enableFeedbackRemoveItem = z6;
    }

    public final void setExpStr(@Nullable String str) {
        this.expStr = str;
    }

    public void setExposed(boolean z6) {
        this.isExposed = z6;
    }

    public final void setFeedback(@Nullable Feedback feedback) {
        this.feedback = feedback;
    }

    public final void setFolded(@Nullable Boolean bool) {
        this.isFolded = bool;
    }

    public void setGoTo(@Nullable String str) {
        this.goTo = str;
    }

    public final void setHasWideAutoFill(boolean z6) {
        this.hasWideAutoFill = z6;
    }

    public final void setInAlienationArea(boolean z6) {
        this.isInAlienationArea = z6;
    }

    public void setKeyword(@Nullable String str) {
        this.keyword = str;
    }

    public final void setLastAlienationAreaCard(boolean z6) {
        this.lastAlienationAreaCard = z6;
    }

    public void setLinkType(@Nullable String str) {
        this.linkType = str;
    }

    public void setLocalPagePos(int i7) {
        this.localPagePos = i7;
    }

    public final void setModuleId(@Nullable String str) {
        this.moduleId = str;
    }

    public final void setNewRecTags(@Nullable List<? extends Tag> list) {
        this.newRecTags = list;
    }

    public void setPageNum(long j7) {
        this.pageNum = j7;
    }

    public void setParam(@Nullable String str) {
        this.param = str;
    }

    public void setQvId(@Nullable String str) {
        this.qvId = str;
    }

    public final void setRecommendReason(@Nullable RecommendReason recommendReason) {
        this.recommendReason = recommendReason;
    }

    public final void setRefreshCount(int i7) {
        this.refreshCount = i7;
    }

    public void setReportExtra(@Nullable Xs0.a aVar) {
        this.reportExtra = aVar;
    }

    public void setServerPagePos(int i7) {
        this.serverPagePos = i7;
    }

    public void setShare(@Nullable Share share) {
        this.share = share;
    }

    public void setSpreadId(long j7) {
        this.spreadId = j7;
    }

    public final void setSubGoto(@Nullable String str) {
        this.subGoto = str;
    }

    public final void setThreePoints(@Nullable List<ThreePointItem> list) {
        this.threePoints = list;
    }

    public void setTitle(@Nullable String str) {
        this.title = str;
    }

    public void setTrackId(@Nullable String str) {
        this.trackId = str;
    }

    public void setTranslatedStatus(long j7) {
        this.translatedStatus = j7;
    }

    public void setTranslatedTitle(@Nullable String str) {
        this.translatedTitle = str;
    }

    public void setUri(@Nullable String str) {
        this.uri = str;
    }

    public final void setUserAct(@Nullable String str) {
        this.userAct = str;
    }

    public final void setUserActQuery(@Nullable com.bilibili.search2.main.data.c cVar) {
        this.userActQuery = cVar;
    }
}
