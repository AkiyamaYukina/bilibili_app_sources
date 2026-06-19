package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiliGamePatchInfo;
import com.bilibili.biligame.api.BiligameAbExpInfo;
import com.bilibili.biligame.api.BiligameCopyWriting;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.api.GameVideoInfo;
import com.bilibili.biligame.api.bean.BiligameTestInfo;
import com.bilibili.biligame.theme.BiligameDetailTheme;
import com.bilibili.biligame.utils.GameUtils;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailInfo.class */
@Keep
public class GameDetailInfo extends BiligameMainGame implements Serializable {

    @JSONField(name = "asset_gift_info")
    public AssetGiftInfo assetGiftInfo;

    @JSONField(name = "bili_rank")
    public long bRank;

    @JSONField(name = "button_content")
    public String buttonContent;

    @JSONField(name = "comment_number")
    public int commentCount;

    @JSONField(name = "customer_service_url")
    public String customerServiceUrl;

    @JSONField(name = "bullet_screen_switch")
    public int danmakuEnable;

    @JSONField(name = "bullet_screen_default_status")
    public int danmakuOn;

    @JSONField(name = "description")
    public String description;

    @JSONField(name = "desktop_component_enable")
    public int desktopComponentEnable;

    @JSONField(name = "detail_tab_info")
    public BiligameDetailInfo detailTabInfo;

    @JSONField(name = "download_count")
    public int downloadCount;

    @JSONField(name = "download_lead_max_count")
    public int downloadLeadMaxCount;

    @JSONField(name = "download_lead_time")
    public int downloadLeadTime;

    @JSONField(name = "download_wait_time")
    public int downloadWaitTime;

    @JSONField(name = "establisher_name")
    public String establisherName;

    @JSONField(name = "follower_num")
    public long followNum;

    @JSONField(name = "game_module_info")
    public List<ExtraInfo> gameModuleInfo;

    @JSONField(name = "game_incr_pkg")
    public BiliGamePatchInfo gamePatchInfo;

    @JSONField(name = "test_recruit")
    public GameTestRecruitInfo gameTestRecruitInfo;

    @JSONField(name = "h5_game_link")
    public String h5GameLink;

    @JSONField(name = "developer_input_name")
    public String inputDeveloperName;

    @JSONField(name = "main_game_base_id")
    public int mainGameBaseId;

    @JSONField(name = "main_game_detail")
    public MainGameDetail mainGameDetail;

    @JSONField(name = "main_game_name")
    public String mainGameName;

    @JSONField(name = "online_time")
    public String onlineTime;

    @JSONField(name = "operator_id")
    public String operatorId;

    @JSONField(name = "operator_name")
    public String operatorName;

    @JSONField(name = "pc_btn_toast")
    public String pcBtnToast;

    @JSONField(name = "pc_detail_link")
    public String pcDetailLink;

    @JSONField(name = "platform")
    public String platform;

    @JSONField(name = "platform_str")
    public String platformStr;

    @JSONField(name = "enable_image_share")
    public boolean posterShareEnable;

    @JSONField(name = "presale_start_test_time")
    public String presaleStartTestTime;

    @JSONField(name = "presale_start_test_time_text")
    public String presaleStartTextTimeText;

    @JSONField(name = "privacy_policy_link")
    public String privacyPolicyLink;

    @JSONField(name = "related_mobile_game")
    public RelatedMobileGame relatedMobileGame;

    @JSONField(name = "related_pc_game")
    public RelatedPcGame relatedPCGame;

    @JSONField(name = "same_server_description")
    public String sameServerDesc;

    @JSONField(name = "same_server_ui")
    public int sameServerUI;

    @JSONField(name = "share_comment")
    public String shareComment;

    @JSONField(name = "is_show_book_auto_download_guide_window")
    public int showAutoDownloadGuideDialog;

    @JSONField(name = "is_show_book_auto_download_guide_module")
    public int showAutoDownloadGuideModule;

    @JSONField(name = "show_general")
    public boolean showGeneral;

    @JSONField(name = "show_recruit")
    public boolean showRecruit;

    @JSONField(name = "show_strategy")
    public boolean showStrategy;

    @JSONField(name = "show_strategy_tab_v3")
    public boolean showStrategyTabV2;

    @JSONField(name = "show_topic")
    public boolean showTopic;

    @JSONField(name = "show_video")
    public boolean showVideo;

    @JSONField(name = "sub_game_detail")
    public SubGameDetail subGameDetail;

    @JSONField(name = "start_test")
    public BiligameTestInfo testInfo;

    @JSONField(name = CaptureSchema.TOPIC_NAME)
    public String topicName;

    @JSONField(name = "video_url")
    public String videoAvId;

    @JSONField(name = "video_info")
    public GameVideoInfo videoInfo;

    @JSONField(name = "bwiki_tab_switch")
    public int wikiTabSwitch;

    @JSONField(name = "is_online")
    public boolean onLine = true;

    @JSONField(name = "forum_heat")
    public long forumHeat = 0;

    @JSONField(name = "is_hidden_follower_num")
    public boolean isHideFollowNum = false;

    @JSONField(name = "is_open_test_white_list")
    public boolean testWhiteListOpen = false;

    @JSONField(name = "abinfo")
    public List<BiligameAbExpInfo> abInfo = null;
    public boolean fromMainGame = false;
    public boolean fromSubGame = false;

    @JSONField(name = "version_switch")
    public int versionSwitch = 0;

    @JSONField(name = "is_show_version_switch")
    public int showVersionSwitch = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailInfo$AssetGiftInfo.class */
    @Keep
    public static class AssetGiftInfo implements Serializable {

        @JSONField(name = "has_gift")
        public boolean hasGift;

        @JSONField(name = "has_unread_gift")
        public boolean hasUnreadGift;

        @JSONField(name = "has_unsend_gift")
        public boolean hasUnsendGift;

        @JSONField(name = "is_receiver")
        public boolean isReceiver;

        @JSONField(name = "is_sender")
        public boolean isSender;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailInfo$BiligameDetailInfo.class */
    @Keep
    public static class BiligameDetailInfo implements Serializable {

        @JSONField(name = "default_selected_tab")
        public int defaultSelectedTab;

        @JSONField(name = "tab_info")
        public List<BiligameDetailTab> tabList;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailInfo$BiligameDetailTab.class */
    @Keep
    public static class BiligameDetailTab implements Serializable {

        @JSONField(name = "default_selected")
        public int defaultSelected;

        @JSONField(name = "icon")
        public String icon;

        @JSONField(name = "id")
        public String id;

        @JSONField(name = "tab_name")
        public String tabName;

        @JSONField(name = "tab_type")
        public int tabType;

        @JSONField(name = "theme")
        public BiligameDetailTheme theme;

        @JSONField(name = "url")
        public String url;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailInfo$ExtraInfo.class */
    @Keep
    public class ExtraInfo implements Serializable {
        public static final String TYPE_COMMENT = "2";
        public static final String TYPE_FORUM = "3";
        public static final String TYPE_HOT_VIDEO = "4";
        public static final String TYPE_OTHER = "7";
        public static final String TYPE_STRATEGY = "5";
        public static final String TYPE_TOPIC = "6";
        public static final String TYPE_WIKI = "1";
        public int id;

        @JSONField(name = "link")
        public String link;

        @JSONField(name = "module")
        public String module;
        public String name;
        final GameDetailInfo this$0;

        @JSONField(name = "type")
        public String type;

        public ExtraInfo(GameDetailInfo gameDetailInfo) {
            this.this$0 = gameDetailInfo;
            this.id = gameDetailInfo.gameBaseId;
            this.name = GameUtils.formatGameName(gameDetailInfo.gameName, gameDetailInfo.expandedName);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailInfo$MainGameDetail.class */
    @Keep
    public static class MainGameDetail implements Serializable {

        @JSONField(name = "android_book_link")
        public String androidBookLink;

        @JSONField(name = "android_game_status")
        public int androidGameStatus;

        @JSONField(name = "reserve_module_title")
        public String bookGuideTips;

        @JSONField(name = "is_book")
        public boolean booked;

        @JSONField(name = "game_base_id")
        public int gameBaseId;

        @JSONField(name = "show_reserve_module")
        public boolean showBookGuideModule;

        @JSONField(name = "title")
        public String title;

        public boolean isBookGame() {
            int i7 = this.androidGameStatus;
            boolean z6 = true;
            if (i7 != 1) {
                z6 = i7 == 2;
            }
            return z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailInfo$RelatedMobileGame.class */
    public static class RelatedMobileGame implements Serializable {

        @JSONField(name = BiligameCopyWriting.KEY_BOOK)
        public boolean book;

        @JSONField(name = "game_base_id")
        public int gameBaseId;

        @JSONField(name = "game_name")
        public String gameName;

        @JSONField(name = "online")
        public boolean online;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailInfo$RelatedPcGame.class */
    @Keep
    public static class RelatedPcGame implements Serializable {

        @JSONField(name = "is_allow_jump_to_pc_game")
        public boolean allowPcJump;

        @JSONField(name = "game_base_id")
        public int gameBaseId;

        @JSONField(name = "pc_detail_link")
        public String pcDetailLink;

        @JSONField(name = "pc_game_show_text")
        public String pcJumpTips;

        @JSONField(name = "pc_link_title")
        public String pcLinkTitle;

        @JSONField(name = "pc_link_toast")
        public String toast;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailInfo$SubGameDetail.class */
    @Keep
    public static class SubGameDetail extends GameDetailInfo implements Serializable {

        @JSONField(name = "link_display_text")
        public String linkDisplayText;

        @JSONField(name = "show_sub_game_link")
        public boolean showSubGameLink;
    }

    public boolean canDesktopComponentEnable() {
        boolean z6 = true;
        if (this.desktopComponentEnable != 1) {
            z6 = false;
        }
        return z6;
    }

    @Nullable
    public GameTestRecruitInfo getRecruitInfo() {
        if (this.showRecruit) {
            return this.gameTestRecruitInfo;
        }
        SubGameDetail subGameDetail = this.subGameDetail;
        if (subGameDetail == null || !subGameDetail.showRecruit) {
            return null;
        }
        GameTestRecruitInfo gameTestRecruitInfo = subGameDetail.gameTestRecruitInfo;
        if (gameTestRecruitInfo != null) {
            gameTestRecruitInfo.setCurrentMainGame(true);
        }
        return this.subGameDetail.gameTestRecruitInfo;
    }
}
