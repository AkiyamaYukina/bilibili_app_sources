package com.bilibili.biligame.api.bean.gamedetail;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import bq.d;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.GameVideoInfo;
import com.bilibili.biligame.api.user.BiligameUserInfo;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kntr.app.game.gamebind.bean.RoleItem;
import kntr.app.game.gamebind.bean.UnbindRoleItem;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/RecommendComment.class */
@Keep
public class RecommendComment implements Serializable {

    @JSONField(name = "attestation_display")
    public AttestationDisplay attestationDisplay;

    @JSONField(name = "bind_role")
    public String bindRole;

    @JSONField(name = "comment_no")
    public String commentNo;

    @JSONField(name = "comment_type")
    public int commentType;
    public String content;

    @JSONField(name = "device_name")
    public String deviceName;

    @JSONField(name = "device_type")
    public String deviceType;

    @JSONField(name = "dim_grade_list")
    public List<Integer> dimGradeList;

    @JSONField(name = "down_count")
    public int downCount;

    @Nullable
    @JSONField(name = "emotes")
    public HashMap<String, CommentEmote> emotes;

    @JSONField(name = "evaluate_status")
    public int evaluateStatus;

    @JSONField(name = "expanded_name")
    public String expandedName;

    @JSONField(name = "expect_status")
    public int expectStatus;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "game_icon")
    public String gameIcon;

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "game_name_v2")
    public String gameNameV2;

    @JSONField(name = "grade")
    public int grade;

    @JSONField(name = "growth_level")
    public CommentGrowthLevel growPlanLevel;

    @JSONField(name = "hide_status")
    public int hideStatus;

    @JSONField(name = "icon")
    public String icon;
    public boolean isFollowed;

    @JSONField(name = "is_game_played")
    public boolean isGamePlayed;
    public int is_current_phase;

    @JSONField(name = "jump_urls")
    public HashMap<String, CommentJumpUrl> jumpUrls;

    @JSONField(name = "mark_hot_detail_list")
    public List<MarkHotDetail> markHotDetailList;
    public boolean modified;

    @JSONField(name = "modify_status")
    public int modifyStatus;

    @JSONField(name = "need_mark_hot_filter")
    public int needHotFilter;

    @JSONField(name = "need_mark_hot_report")
    public int needHotReport;

    @JSONField(name = "official_like")
    public boolean officialLike;

    @JSONField(name = "official_like_tooltip")
    public String officialLikeTip;

    @JSONField(name = "official_reply")
    public CommentReply officialReply;

    @JSONField(name = "play_duration")
    public int playDuration;

    @JSONField(name = "play_duration_text")
    public String playDurationText;

    @JSONField(name = "play_duration_text_v2")
    public String playDurationTextV2;
    public String playtime;

    @JSONField(name = "postfix_list")
    public ArrayList<String> postfixList;

    @JSONField(name = "publish_time")
    public String publishTime;

    @JSONField(name = "is_purchased")
    public boolean purchased;

    @JSONField(name = "relation_status_text")
    public String relationStatusText;

    @JSONField(name = "reply_count")
    public int replyCount;

    @JSONField(name = "reply_list")
    public List<CommentReply> replyList;

    @JSONField(name = "report_status")
    public int reportStatus;
    public transient RoleItem roleItem;

    @JSONField(name = "rule_entrance_link")
    public String ruleEntranceLink;

    @JSONField(name = "special_identity")
    public String specialIdentity;
    public String title;
    public long uid;

    @JSONField(name = "unbind_role")
    public String unbindRole;
    public transient UnbindRoleItem unbindRoleItem;

    @JSONField(name = "up_count")
    public int upCount;

    @JSONField(name = "user_face")
    public String userFace;

    @JSONField(name = "user_level")
    public int userLevel;

    @JSONField(name = "user_name")
    public String userName;

    @JSONField(name = "user_official_verify_desc")
    public String verifyDesc;

    @JSONField(name = "video_list")
    public List<GameVideoInfo> videoList;

    @JSONField(name = "user_official_verify_type")
    public int verifyType = -1;

    @JSONField(name = "vip_type")
    public int vipType = 0;

    @JSONField(name = "vip_status")
    public int vipStatus = 0;

    @JSONField(name = "vip_theme_type")
    public int vipThemeType = 0;

    @JSONField(name = "is_senior_member")
    public int seniorMember = 0;
    public boolean showDelta = false;
    public int upCountDelta = 0;
    public int downCountDelta = 0;
    public int replyCountDelta = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/RecommendComment$AttestationDisplay.class */
    @Keep
    public static class AttestationDisplay implements Serializable {

        @JSONField(name = "desc")
        public String desc;

        @JSONField(name = "type")
        public int type;

        public int hashCode() {
            int i7 = this.type;
            String str = this.desc;
            return (i7 * 31) + (str != null ? str.hashCode() : 0);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/RecommendComment$CommentEmote.class */
    @Keep
    public static class CommentEmote implements Serializable {

        @JSONField(name = "id")
        public long id;

        @Nullable
        @JSONField(name = "jump_title")
        public String jumpTitle;

        @JSONField(name = "text")
        public String name = "";

        @JSONField(name = "package_id")
        public long packageId;

        @JSONField(name = TextSource.CFG_SIZE)
        public int size;

        @Nullable
        @JSONField(name = "url")
        public String url;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/RecommendComment$CommentGrowthLevel.class */
    @Keep
    public static class CommentGrowthLevel implements Serializable {

        @JSONField(name = "icon_url")
        public String iconUrl;

        @JSONField(name = "landing_page_url")
        public String landingPageUrl;

        @JSONField(name = "user_level_index")
        public int userLevel;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/RecommendComment$CommentJumpUrl.class */
    @Keep
    public static class CommentJumpUrl implements Serializable {

        @JSONField(name = "link_text")
        public String linkText;

        @JSONField(name = "link_type")
        public String linkType;

        @Nullable
        @JSONField(name = "resource_icon")
        public String resourceIcon;

        @JSONField(name = "resource_id")
        public String resourceId;

        @Nullable
        @JSONField(name = "resource_name")
        public String resourceName;

        @JSONField(name = "resource_type")
        public String resourceType;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/RecommendComment$CommentReply.class */
    @Keep
    public static class CommentReply implements Serializable {
        public static final int REPLY_TYPE_TO_COMMENT = 1;
        public static final int REPLY_TYPE_TO_REPLY = 2;

        @JSONField(name = "attestation_display")
        public AttestationDisplay attestationDisplay;

        @JSONField(name = "comment_no")
        public String commentNo;
        public String content;

        @Nullable
        @JSONField(name = "emotes")
        public HashMap<String, CommentEmote> emotes;

        @JSONField(name = "evaluate_status")
        public int evaluateStatus;

        @JSONField(name = "growth_level")
        public CommentGrowthLevel growPlanLevel;

        @Nullable
        @JSONField(name = "jump_urls")
        public HashMap<String, CommentJumpUrl> jumpUrls;

        @JSONField(name = "is_official_reply")
        public boolean official;

        @JSONField(name = "official_like")
        public boolean officialLike;

        @JSONField(name = "official_like_tooltip")
        public String officialLikeTip;

        @JSONField(name = "publish_time")
        public String publishTime;

        @JSONField(name = "is_purchased")
        public boolean purchased;

        @JSONField(name = "relation_status_text")
        public String relationStatusText;

        @JSONField(name = "reply_no")
        public String replyNo;

        @JSONField(name = "reply_type")
        public int replyType;

        @JSONField(name = "report_status")
        public int reportStatus;

        @JSONField(name = "special_identity")
        public String specialIdentity;

        @JSONField(name = "to_uid")
        public String toUid;

        @JSONField(name = "to_user_name")
        public String toUserName;
        public long uid;

        @JSONField(name = "up_count")
        public int upCount;

        @JSONField(name = "user_face")
        public String userFace;

        @JSONField(name = "user_level")
        public int userLevel;

        @JSONField(name = "user_name")
        public String userName;

        @JSONField(name = "user_official_verify_desc")
        public String verifyDesc;

        @JSONField(name = "user_official_verify_type")
        public int verifyType;

        @JSONField(name = "vip_type")
        public int vipType = 0;

        @JSONField(name = "vip_status")
        public int vipStatus = 0;

        @JSONField(name = "vip_theme_type")
        public int vipThemeType = 0;

        @JSONField(name = "is_senior_member")
        public int seniorMember = 0;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/RecommendComment$MarkHotDetail.class */
    @Keep
    public static class MarkHotDetail implements Serializable {

        @JSONField(name = "img_list")
        public List<String> imgList;
        public int type;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof com.bilibili.biligame.api.bean.gamedetail.RecommendComment
            r7 = r0
            r0 = 0
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            if (r0 == 0) goto L29
            r0 = r4
            r1 = r3
            if (r0 == r1) goto L27
            r0 = r6
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.commentNo
            r1 = r4
            com.bilibili.biligame.api.bean.gamedetail.RecommendComment r1 = (com.bilibili.biligame.api.bean.gamedetail.RecommendComment) r1
            java.lang.String r1 = r1.commentNo
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L29
        L27:
            r0 = 1
            r5 = r0
        L29:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.api.bean.gamedetail.RecommendComment.equals(java.lang.Object):boolean");
    }

    public String getDeviceShow() {
        return TextUtils.isEmpty(this.deviceName) ? this.deviceType : this.deviceName;
    }

    public String getGameNameV2() {
        return !TextUtils.isEmpty(this.gameNameV2) ? this.gameNameV2 : this.gameName;
    }

    public BiligameUserInfo.Vip getVip() {
        BiligameUserInfo.Vip vip = new BiligameUserInfo.Vip();
        vip.setVipStatus(this.vipStatus);
        vip.setVipType(this.vipType);
        vip.setVipThemeType(this.vipThemeType);
        return vip;
    }

    public int hashCode() {
        String str = this.commentNo;
        return str != null ? str.hashCode() : super.hashCode();
    }

    public boolean isCurrentPhase() {
        boolean z6 = true;
        if (this.is_current_phase != 1) {
            z6 = false;
        }
        return z6;
    }

    public boolean isFolding() {
        boolean z6 = true;
        if (this.hideStatus != 1) {
            z6 = false;
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isVip() {
        /*
            r3 = this;
            r0 = r3
            int r0 = r0.vipType
            if (r0 == 0) goto L16
            r0 = r3
            int r0 = r0.vipStatus
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L16
            goto L18
        L16:
            r0 = 0
            r5 = r0
        L18:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.api.bean.gamedetail.RecommendComment.isVip():boolean");
    }

    public boolean needHotFilter() {
        boolean z6 = true;
        if (this.needHotFilter != 1) {
            z6 = false;
        }
        return z6;
    }

    public boolean needHotReport() {
        boolean z6 = true;
        if (this.needHotReport != 1) {
            z6 = false;
        }
        return z6;
    }

    public Map<String, String> reportExtend() {
        HashMap map = new HashMap();
        map.put("game_base_id", String.valueOf(this.gameBaseId));
        map.put("commentno", this.commentNo);
        map.put(EditCustomizeSticker.TAG_MID, String.valueOf(this.uid));
        map.put("grade", String.valueOf(this.grade));
        return map;
    }

    public void setBindRole(String str) {
        this.bindRole = str;
        RoleItem.Companion.getClass();
        this.roleItem = RoleItem.b.a(str);
    }

    public void setUnbindRole(String str) {
        this.unbindRole = str;
        Json json = d.a;
        json.getSerializersModule();
        this.unbindRoleItem = (UnbindRoleItem) json.decodeFromString(UnbindRoleItem.Companion.serializer(), str);
    }
}
