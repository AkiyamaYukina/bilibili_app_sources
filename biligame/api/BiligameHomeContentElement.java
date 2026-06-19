package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.BiligameRankInfo;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.biligame.utils.GameUtils;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameHomeContentElement.class */
@Keep
public class BiligameHomeContentElement {
    public static final int TYPE_COLLECTION = 8;
    public static final int TYPE_CONTENT = 9;
    public static final int TYPE_GAME = 0;
    public static final int TYPE_PROMOTION = 3;
    public static final int TYPE_STRATEGY = 5;
    public static final int TYPE_TOPIC = 7;
    public BiligameAbExpInfo abInfo;

    @JSONField(name = "activity_first_image")
    public String activityFirstImage;

    @JSONField(name = "activity_image_type")
    public int activityImageType;

    @JSONField(name = "activity_immersion_image")
    public String activityImmersionImage;

    @JSONField(name = "activity_marker")
    public String activityMarker;

    @JSONField(name = "activity_url")
    public String activityUrl;

    @JSONField(name = "android_sign")
    public String androidSign;

    @JSONField(name = "article_title")
    public String articleTitle;

    @JSONField(name = "article_id")
    public String articleid;

    @JSONField(name = "av_id")
    public String avid;

    @JSONField(name = "b_index")
    public int bIndex;

    @JSONField(name = "background_color")
    public String backgroundColor;

    @JSONField(name = "is_book")
    public boolean booked;

    @JSONField(name = "breath_image")
    public String breathImage;

    @JSONField(name = "bv_id")
    public String bvid;

    @JSONField(name = "clip_cover_image")
    public String clipCoverImage;

    @JSONField(name = "cloud_game_config_v2")
    public CloudGameInfo cloudGameInfoV2;

    @JSONField(name = "content_title")
    public String contentTitle;

    @JSONField(name = "content_type")
    public int contentType;

    @JSONField(name = "corner_marker")
    public String cornerMarker;

    @JSONField(name = "cover_image")
    public String coverImage;

    @JSONField(name = "data_source")
    public int dataSource;

    @JSONField(name = "databox")
    public String databox;

    @JSONField(name = "description")
    public String description;

    @JSONField(name = "discount")
    public int discount;

    @JSONField(name = "discount_price")
    public double discountPrice;

    @JSONField(name = "download_link")
    public String downloadLink;

    @JSONField(name = "download_link2")
    public String downloadLink2;

    @JSONField(name = "download_status")
    public int downloadStatus;

    @JSONField(name = "expanded_name")
    public String expandedName;

    @JSONField(name = "feed_ext_info")
    public List<ExtraInfo> extraInfo;

    @JSONField(name = "home_feed_type")
    public int feedType;

    @JSONField(name = "first_image")
    public String firstImage;

    @JSONField(name = "font_color")
    public String fontColor;
    public boolean fromCache = false;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "content_collection")
    public BiligameCollection gameCollection;

    @JSONField(deserialize = false, serialize = false)
    private BiligameMainGame gameInfo;

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "game_rank_info")
    public BiligameRankInfo gameRankInfo;

    @JSONField(name = "game_status")
    public int gameStatus;

    @JSONField(name = "game_type")
    public String gameType;

    @JSONField(name = "game_list")
    public List<BiligameTopicGame> games;
    public double grade;

    @JSONField(name = "icon")
    public String icon;
    public int id;

    @JSONField(name = "image")
    public String image;

    @JSONField(name = "immersion_image")
    public String immersionImage;

    @JSONField(name = "immersion_title")
    public String immersionTitle;

    @JSONField(name = "introduction")
    public String introduction;

    @JSONField(name = "is_show_test")
    public boolean isShowTest;

    @JSONField(name = "is_top")
    public int isTop;

    @JSONField(name = "android_pkg_name")
    public String pkgName;

    @JSONField(name = "android_pkg_size")
    public long pkgSize;

    @JSONField(name = "android_pkg_ver")
    public String pkgVersion;

    @JSONField(name = "platform_score")
    public double platformGrade;

    @JSONField(name = "played_num")
    public int playedNum;

    @JSONField(name = "price")
    public double price;

    @JSONField(name = "android_skip_detail_link")
    public String protocolLink;

    @JSONField(name = "publish_time")
    public String publishTime;

    @JSONField(name = "purchase_type")
    public int purchaseType;

    @JSONField(name = "is_purchased")
    public boolean purchased;

    @JSONField(name = "recommend_desc")
    public String recommendDesc;

    @JSONField(name = "recommend_reason")
    public String recommendReason;

    @JSONField(name = "small_game_link")
    public String smallGameLink;

    @JSONField(name = GameCardButton.extraParamSource)
    public int source;

    @JSONField(name = "steam_link")
    public String steamLink;

    @JSONField(name = "strategy_category_name")
    public String strategyCategoryName;

    @JSONField(deserialize = false, serialize = false)
    private BiligameStrategyPage strategyInfo;

    @JSONField(name = "strategy_summary")
    public String strategySummary;

    @JSONField(name = "strategy_id")
    public String strategyid;

    @JSONField(name = "subtitle")
    public String subtitle;

    @JSONField(name = "tag_list")
    public List<BiligameTag> tags;

    @JSONField(name = "test_hint_content")
    public String testHintContent;

    @JSONField(name = "test_title")
    public String testTitle;
    public String title;

    @JSONField(name = CaptureSchema.TOPIC_ID)
    public String topicId;

    @JSONField(name = "topic_image")
    public String topicImage;
    public int type;

    @JSONField(name = "up_count")
    public int upCount;

    @JSONField(name = "url")
    public String url;

    @JSONField(name = "url_path")
    public String urlPath;

    @JSONField(name = "user_avatar")
    public String userAvatar;

    @JSONField(name = "user_group_id")
    public String userGroupId;

    @JSONField(name = "user_name")
    public String userName;

    @JSONField(name = "user_id")
    public String userid;

    @JSONField(name = "valid_comment_number")
    public int validCommentCount;

    @JSONField(name = "video_feed_image")
    public String videoImage;

    @JSONField(name = "feed_video_info")
    public GameVideoInfo videoInfo;

    @JSONField(name = "view_count")
    public int viewCount;

    @JSONField(name = "wiki_link")
    public String wikiLink;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameHomeContentElement$ExtraInfo.class */
    @Keep
    public class ExtraInfo {
        public static final String TYPE_FORUM = "5";
        public static final String TYPE_GIFT = "2";
        public static final String TYPE_HOT_VIDEO = "3";
        public static final String TYPE_LIVE = "7";
        public static final String TYPE_OTHER = "8";
        public static final String TYPE_STRATEGY = "4";
        public static final String TYPE_TOPIC = "6";
        public static final String TYPE_WIKI = "1";

        @JSONField(name = "desc")
        public String desc;
        public int id;

        @JSONField(name = "link")
        public String link;

        @JSONField(name = "module")
        public String module;
        public String name;
        final BiligameHomeContentElement this$0;

        @JSONField(name = "type")
        public String type;

        public ExtraInfo(BiligameHomeContentElement biligameHomeContentElement) {
            this.this$0 = biligameHomeContentElement;
            this.id = biligameHomeContentElement.gameBaseId;
            this.name = GameUtils.formatGameName(biligameHomeContentElement.gameName, biligameHomeContentElement.expandedName);
        }

        public int getInfoIcon() {
            String str = this.type;
            str.getClass();
            switch (str) {
                case "1":
                    return 2131233081;
                case "2":
                    return 2131233075;
                case "3":
                    return 2131233080;
                case "4":
                    return 2131233078;
                case "5":
                    return 2131233074;
                case "6":
                    return 2131233079;
                case "7":
                    return 2131233076;
                case "8":
                    return 2131233077;
                default:
                    return 0;
            }
        }
    }

    public boolean equals(Object obj) {
        boolean z6 = false;
        if (obj instanceof BiligameHomeContentElement) {
            if (this == obj) {
                return true;
            }
            BiligameHomeContentElement biligameHomeContentElement = (BiligameHomeContentElement) obj;
            z6 = false;
            if (this.id == biligameHomeContentElement.id) {
                z6 = false;
                if (this.feedType == biligameHomeContentElement.feedType) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    @NonNull
    public BiligameMainGame getGameInfo() {
        if (this.gameInfo == null) {
            BiligameMainGame biligameMainGame = new BiligameMainGame();
            this.gameInfo = biligameMainGame;
            biligameMainGame.gameBaseId = this.gameBaseId;
            biligameMainGame.androidBookLink = this.url;
            biligameMainGame.androidGameStatus = this.gameStatus;
            biligameMainGame.androidPkgName = this.pkgName;
            biligameMainGame.androidPkgVer = this.pkgVersion;
            biligameMainGame.androidPkgSize = this.pkgSize;
            biligameMainGame.icon = this.icon;
            biligameMainGame.title = this.gameName;
            biligameMainGame.expandedName = this.expandedName;
            biligameMainGame.booked = this.booked;
            biligameMainGame.source = this.source;
            biligameMainGame.downloadStatus = this.downloadStatus;
            biligameMainGame.purchased = this.purchased;
            biligameMainGame.purchaseType = this.purchaseType;
            biligameMainGame.downloadLink = this.downloadLink;
            biligameMainGame.downloadLink2 = this.downloadLink2;
            biligameMainGame.price = this.price;
            biligameMainGame.discount = this.discount;
            biligameMainGame.discountPrice = this.discountPrice;
            biligameMainGame.androidSign = this.androidSign;
            biligameMainGame.protocolLink = this.protocolLink;
            biligameMainGame.smallGameLink = this.smallGameLink;
            biligameMainGame.playedNum = this.playedNum;
            biligameMainGame.steamLink = this.steamLink;
            biligameMainGame.isShowTest = this.isShowTest;
            biligameMainGame.testHintContent = this.testHintContent;
        }
        return this.gameInfo;
    }

    @NonNull
    public BiligameStrategyPage getStrategyInfo() {
        if (this.strategyInfo == null) {
            BiligameStrategyPage biligameStrategyPage = new BiligameStrategyPage();
            this.strategyInfo = biligameStrategyPage;
            biligameStrategyPage.articleId = this.articleid;
            biligameStrategyPage.articleTitle = this.articleTitle;
            biligameStrategyPage.contentType = this.contentType;
            biligameStrategyPage.userId = this.userid;
            biligameStrategyPage.userName = this.userName;
            biligameStrategyPage.userAvatar = this.userAvatar;
            biligameStrategyPage.strategyId = this.strategyid;
            biligameStrategyPage.strategySummary = this.strategySummary;
            biligameStrategyPage.gameName = this.gameName;
            biligameStrategyPage.viewCount = this.viewCount;
            biligameStrategyPage.upCount = this.upCount;
            biligameStrategyPage.coverImage = this.coverImage;
            biligameStrategyPage.avId = this.avid;
            biligameStrategyPage.gameBaseId = this.gameBaseId;
            biligameStrategyPage.strategyCategoryName = this.strategyCategoryName;
            biligameStrategyPage.bvId = this.bvid;
        }
        return this.strategyInfo;
    }

    public int hashCode() {
        return (this.id * 3) + this.feedType;
    }
}
