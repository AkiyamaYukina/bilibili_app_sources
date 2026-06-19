package com.bilibili.studio.centerplus.network.entity;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C3269h;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.studio.centerplus.network.entity.JoinPreviewData;
import com.bilibili.studio.kaleidoscope.sdk.support.SupportCustomFilter;
import com.bilibili.studio.videoeditor.capturev3.data.ModuleShow;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import g.C7207a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData.class */
@Keep
public class PreviewData implements Serializable {

    @JSONField(name = "act_reserve")
    public ActReserve actReserve;

    @JSONField(name = "adorder_auth")
    public boolean adOrderAuth;

    @JSONField(name = "ai_chapter_gray_v2")
    public AIChapterGray aiChapterGray;

    @JSONField(name = "videoup_pic2music_ab")
    @Deprecated
    public String albumTabAB;

    @JSONField(name = "arctip")
    public String arcTip;

    @JSONField(name = "camera_cfg")
    public CameraConfig cameraCfg;

    @JSONField(name = "create_topic")
    public boolean canCreateTopic;

    @JSONField(name = "can_season")
    public int canSeason;

    @JSONField(name = "preview")
    public ChargePayTrySeeItem chargeTrySeeData;

    @JSONField(name = "charging_pay_info")
    public ChargePayInfo chargingPayInfo;

    @JSONField(name = "commercial_declare")
    public String commercialDeclare;

    @JSONField(name = "copyright_gray")
    public int copyRightGray;

    @JSONField(name = "coupon_list")
    public List<CouponData> couponList;

    @JSONField(name = "creation_statement_gray")
    public boolean creationStatementGray;

    @JSONField(name = "cus_tip")
    public CusTip cusTip;

    @JSONField(name = "have_permission_of_p")
    public boolean hasPermissionOfArchiveP;
    public Icon icons;

    @JSONField(name = "industry_list")
    public String industryList;

    @JSONField(name = "videoup_autovideo_ab")
    @Deprecated
    public String intelligenceVideo;

    @JSONField(name = "ai_chapter_gray")
    public boolean isAiChapter;

    @JSONField(name = "dm_trans_grey")
    public boolean isDmTransGrey;

    @JSONField(name = "is_newUp")
    public boolean isNewUp;

    @JSONField(name = "is_oversea")
    public boolean isOversea;

    @JSONField(name = "is_typeid_revision")
    public int isWeakenType;

    @JSONField(name = "common_staff_conf")
    public JoinPreviewData.JoinStaffConf joinStaffConf;

    @JSONField(name = "jump_dynamic_info")
    public JumpDynamicInfo jumpDynamicInfo;

    @JSONField(name = "lottery_conf")
    public transient LotteryConf lotteryConf;

    @JSONField(name = "module_show")
    public ModuleShow moduleShow;

    @JSONField(name = "myinfo")
    public Myinfo myInfo;

    @JSONField(name = "nmark_popup")
    public boolean nMarkPopup;

    @JSONField(name = "neutral_mark")
    public NeutralMark neutralMark;

    @JSONField(name = "only_self_info")
    public OnlySelfInfo onlySelfInfo;

    @JSONField(name = "open_season_count")
    public int openSeasonCount;

    @JSONField(name = "origin_state")
    public OriginState originState;

    @JSONField(name = "videoup_show_type")
    public int partitionShowType;

    @JSONField(name = "videoup_publish_ab")
    public String publishAB;

    @JSONField(name = "rec_friends")
    public ArrayList<FollowFriendInfo> recFriends;
    public boolean recreate;

    @JSONField(name = CaptureSchema.JUMP_PARAMS_RELATION_FROM)
    public RelationFromBean relationFrom;

    @JSONField(name = "season_gray")
    public int seasonGray;

    @JSONField(name = "showtype_list")
    public String showTypeList;

    @JSONField(name = "tag_gray")
    public int tagGrayValue;
    public List<Template> template;
    public Tip tip;
    public String title;

    @JSONField(name = "topic_grey")
    public boolean topicGrey;

    @JSONField(name = "typelist")
    public List<Type> typeList;

    @JSONField(name = "uploadinfo")
    public UploadInfo uploadInfo;

    @JSONField(name = "use_new_season")
    public boolean userNewSeason;

    @JSONField(name = "video_with_goods_auth")
    public int videoGoodsAuth;
    public WaterMark waterMark;

    @JSONField(name = "yellow_tips")
    public YellowTips yellowTips;

    @JSONField(name = "cover43Auth")
    public boolean cover43Auth = false;

    @JSONField(name = "topic_opt")
    public boolean topicOpt = false;

    @JSONField(name = "use_weaken_type")
    public boolean useWeakenType = false;

    @JSONField(name = "type_mode")
    public int typeMode = 2;

    @JSONField(name = "recreate_protocol")
    public boolean isShowCreationDialog = false;

    @JSONField(name = "recreate_state")
    public boolean creationEnable = false;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$AIChapterGray.class */
    @Keep
    public static class AIChapterGray implements Serializable {

        @JSONField(name = "ai_chapter_auth")
        public boolean aiChapterAuth;

        @JSONField(name = "video_time_max")
        public int videoTimeMax;

        @JSONField(name = "video_time_min")
        public int videoTimeMin;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$ChargePayInfo.class */
    @Keep
    public static class ChargePayInfo implements Serializable {

        @JSONField(name = "upower_auth")
        public int auth;

        @JSONField(name = "upower_pay_auth")
        public int chargeSingleAuth;

        @JSONField(name = "editable_before_exp")
        public int editableBeforeExp;

        @JSONField(name = "exp_time_default")
        public int expTimeDefault;

        @JSONField(name = "exp_time_max")
        public int expTimeMax;

        @JSONField(name = "exp_time_min")
        public int expTimeMin;

        @JSONField(name = "upower_level_list")
        public ArrayList<ChargeLevelItem> levelList;

        @JSONField(name = "member_first_auth")
        public int memberFirstAuth;

        @JSONField(name = "upower_price_config")
        public ChargeSinglePriceConfig singlePriceConfig;

        @JSONField(name = "tips")
        public ChargePayInfoTip tips;

        public String toString() {
            StringBuilder sb = new StringBuilder("ChargePayInfo{auth=");
            sb.append(this.auth);
            sb.append(", chargeSingleAuth=");
            sb.append(this.chargeSingleAuth);
            sb.append(", memberFirstAuth=");
            sb.append(this.memberFirstAuth);
            sb.append(", tips=");
            sb.append(this.tips);
            sb.append(", levelList=");
            sb.append(this.levelList);
            sb.append(", singlePriceConfig=");
            sb.append(this.singlePriceConfig);
            sb.append(", expTimeMin=");
            sb.append(this.expTimeMin);
            sb.append(", expTimeMax=");
            sb.append(this.expTimeMax);
            sb.append(", editableBeforeExp=");
            sb.append(this.editableBeforeExp);
            sb.append(", expTimeDefault=");
            return C3269h.a(sb, this.expTimeDefault, '}');
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$ChargePayInfoTip.class */
    @Keep
    public static class ChargePayInfoTip implements Serializable {

        @JSONField(name = "upower_details")
        public ChargePayInfoTipDetail details;

        @JSONField(name = "upower_staff")
        public List<JoinTitleInfo> joinTips;

        @JSONField(name = "upower_tips")
        public ChargePayInfoTipText[] tips;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$ChargePayInfoTipDetail.class */
    @Keep
    public static class ChargePayInfoTipDetail implements Serializable {

        @JSONField(name = "main")
        public String main;

        @JSONField(name = "sub")
        public String[] sub;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$ChargePayInfoTipText.class */
    @Keep
    public static class ChargePayInfoTipText implements Serializable {

        @JSONField(name = SupportCustomFilter.CUSTOM_FILTER_HIGHLIGHT)
        public boolean highLight;

        @Nullable
        @JSONField(name = "link")
        public String link;

        @JSONField(name = "text")
        public String text;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$ChargePayPreviewDuration.class */
    @Keep
    public static class ChargePayPreviewDuration implements Serializable {

        @JSONField(name = "known_duration")
        public List<ChargePreviewDuration> knowDuration;

        @JSONField(name = "unknown_duration")
        public ChargePreviewDuration unknownDuration;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$ChargePayTrySeeItem.class */
    @Keep
    public static class ChargePayTrySeeItem implements Serializable {

        @JSONField(name = "preview_duration")
        public ChargePayPreviewDuration previewDuration;

        @JSONField(name = "suggest_preview_duration")
        public List<SuggestPreViewDuration> suggestPreViewDuration;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$ChargePreviewDuration.class */
    @Keep
    public static class ChargePreviewDuration implements Serializable {

        @JSONField(name = "max_duration")
        public int maxDuration;

        @JSONField(name = "max_preview_duration")
        public int maxPreviewDuration;

        @JSONField(name = "min_duration")
        public int minDuration;

        @JSONField(name = "min_preview_duration")
        public int minPreviewDuration;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$ChargeSinglePriceConfig.class */
    @Keep
    public static class ChargeSinglePriceConfig implements Serializable {
        public static final long DEFAULT_MAX_PRICE = 20000;
        public static final long DEFAULT_MIN_PRICE = 10;

        @JSONField(name = "min_price")
        public long minPrice = 10;

        @JSONField(name = "max_price")
        public long maxPrice = DEFAULT_MAX_PRICE;

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("ChargeSinglePriceConfig{minPrice=");
            sb.append(this.minPrice);
            sb.append(", maxPrice=");
            return C7207a.a(sb, this.maxPrice, '}');
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$JoinTitleInfo.class */
    @Keep
    public static class JoinTitleInfo implements Serializable {

        @JSONField(name = "line")
        public ChargePayInfoTipText[] tips;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$JumpDynamicInfo.class */
    @Keep
    public static class JumpDynamicInfo implements Serializable {

        @JSONField(name = "check_result")
        public boolean checkResult;

        @JSONField(name = "color_transfer")
        public List<String> colorTransfers;

        @JSONField(name = "video_coding")
        public String supportedVideoCodecs;

        @JSONField(name = "video_duration")
        public long videoDuration;

        @JSONField(name = "video_format")
        public String videoFormat;

        @JSONField(name = "video_fps")
        public int videoFps;

        @JSONField(name = "video_resolution_ratio")
        public VideoResolutionRatio videoResolutionRatio;

        @JSONField(name = "video_size")
        public long videoSize;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$LotteryConf.class */
    @Keep
    public static class LotteryConf implements Serializable {

        @JSONField(name = "lottery_link")
        public String lotteryLink;

        @JSONField(name = "lottery_material_ids")
        public List<Integer> lotteryMaterialIds;

        @JSONField(name = "lottery_remain")
        public int lotteryRemain;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$MarkItem.class */
    @Keep
    public static class MarkItem implements Serializable {
        public String content;
        public long id;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$NeutralMark.class */
    @Keep
    public static class NeutralMark implements Serializable {

        @JSONField(name = "mark_list")
        public List<MarkItem> markList;
        public List<String> marks;
        public String tips;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$OnlySelfInfo.class */
    @Keep
    public static class OnlySelfInfo implements Serializable {

        @JSONField(name = "disable")
        public boolean disable;

        @JSONField(name = Constant.IN_KEY_REASON)
        public OnlySelfInfoReason reason;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$OnlySelfInfoReason.class */
    @Keep
    public static class OnlySelfInfoReason implements Serializable {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @JSONField(name = "0")
        public String f105186r0;

        /* JADX INFO: renamed from: r1, reason: collision with root package name */
        @JSONField(name = "1")
        public String f105187r1;

        /* JADX INFO: renamed from: r2, reason: collision with root package name */
        @JSONField(name = "2")
        public String f105188r2;

        /* JADX INFO: renamed from: r3, reason: collision with root package name */
        @JSONField(name = "3")
        public String f105189r3;

        /* JADX INFO: renamed from: r4, reason: collision with root package name */
        @JSONField(name = "4")
        public String f105190r4;

        /* JADX INFO: renamed from: r5, reason: collision with root package name */
        @JSONField(name = "5")
        public String f105191r5;

        /* JADX INFO: renamed from: r6, reason: collision with root package name */
        @JSONField(name = "6")
        public String f105192r6;

        @JSONField(name = "8")
        public String r8;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$RecType.class */
    @Keep
    public static class RecType {

        @JSONField(name = "id")
        public long id;

        @JSONField(name = "name")
        public String name;

        @JSONField(name = "parent_id")
        public long parentId;

        @JSONField(name = "parent_name")
        public String parentName;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$RelationFromBean.class */
    @Keep
    public static class RelationFromBean {

        @JSONField(name = "copy_right")
        public int copyRight;
        public String desc;

        @JSONField(name = CaptureSchema.MISSION_ID)
        public long missionId;

        @JSONField(name = CaptureSchema.MISSION_NAME)
        public String missionName;

        @JSONField(name = "rec_type")
        public RecType recType;

        @JSONField(name = CaptureSchema.JUMP_PARAMS_RELATION_FROM)
        public String relationFrom;

        @JSONField(name = "scheme")
        public String scheme;

        @JSONField(name = "show_name")
        public String showName;

        @JSONField(name = "show_popup")
        public int showPopup;

        @JSONField(name = "show_return")
        public int showReturn;
        public List<String> tags;

        @JSONField(name = "title")
        public String title;

        @JSONField(name = CaptureSchema.TOPIC_ID)
        public long topicId;

        @JSONField(name = CaptureSchema.TOPIC_NAME)
        public String topicName;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$SuggestPreViewDuration.class */
    @Keep
    public static class SuggestPreViewDuration implements Serializable {

        @JSONField(name = "max_duration")
        public int maxDuration;

        @JSONField(name = "min_duration")
        public int minDuration;

        @JSONField(name = "recommend_preview_duration")
        public int recommendDuration;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$VideoResolutionRatio.class */
    @Keep
    public static class VideoResolutionRatio implements Serializable {

        @JSONField(name = "height")
        public int height;

        @JSONField(name = "width")
        public int width;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/PreviewData$YellowTips.class */
    @Keep
    public static class YellowTips {

        @JSONField(name = "all_tab")
        public boolean allTab;
        public String content;

        @JSONField(name = "jump_url")
        public String jumpUrl;

        @JSONField(name = "pic_tab")
        public boolean picTab;

        @JSONField(name = "show_times")
        public int showTimes;
        public int version;

        @JSONField(name = "video_tab")
        public boolean videoTab;
    }
}
