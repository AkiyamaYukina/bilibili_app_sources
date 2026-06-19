package com.bilibili.biligame.api.user;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.gamedetail.RecommendComment;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/user/BiligameUserInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public class BiligameUserInfo {
    public static final int $stable = 8;

    @JSONField(name = "attestation_display")
    @Nullable
    private RecommendComment.AttestationDisplay attestationDisplay;

    @JSONField(name = "commented_num")
    private int commentCount;

    @JSONField(name = "face")
    @Nullable
    private String face;

    @JSONField(name = "is_followed")
    private boolean followed;

    @JSONField(name = "follower_count")
    private int followerCount;

    @JSONField(name = "following_count")
    private int followingCount;

    @JSONField(name = "level")
    private int level;

    @JSONField(name = EditCustomizeSticker.TAG_MID)
    private long mid;

    @JSONField(name = "is_official_account")
    private boolean officialAccount;

    @JSONField(name = "official_verify")
    @Nullable
    private OfficialVerify officialVerify;

    @JSONField(name = "played_game_num")
    private int playedCount;

    @JSONField(name = "replied_num")
    private int replyCount;

    @JSONField(name = "is_senior_member")
    private int seniorMember;

    @JSONField(name = "sign")
    @Nullable
    private String sign;

    @JSONField(name = "special_identity")
    @Nullable
    private String specialIdentity;

    @JSONField(name = "uname")
    @Nullable
    private String uname;

    @JSONField(name = "vip")
    @Nullable
    private Vip vip;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/user/BiligameUserInfo$OfficialVerify.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class OfficialVerify implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = "desc")
        @Nullable
        private String desc;

        @JSONField(name = "type")
        private int type;

        @Nullable
        public final String getDesc() {
            return this.desc;
        }

        public final int getType() {
            return this.type;
        }

        public final void setDesc(@Nullable String str) {
            this.desc = str;
        }

        public final void setType(int i7) {
            this.type = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/user/BiligameUserInfo$Vip.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Vip implements Serializable {
        public static final int $stable = 8;

        @JSONField(name = "vip_status")
        private int vipStatus;

        @JSONField(name = "vip_theme_type")
        private int vipThemeType;

        @JSONField(name = "vip_type")
        private int vipType;

        public final int getVipStatus() {
            return this.vipStatus;
        }

        public final int getVipThemeType() {
            return this.vipThemeType;
        }

        public final int getVipType() {
            return this.vipType;
        }

        public final void setVipStatus(int i7) {
            this.vipStatus = i7;
        }

        public final void setVipThemeType(int i7) {
            this.vipThemeType = i7;
        }

        public final void setVipType(int i7) {
            this.vipType = i7;
        }
    }

    @Nullable
    public final RecommendComment.AttestationDisplay getAttestationDisplay() {
        return this.attestationDisplay;
    }

    public final int getCommentCount() {
        return this.commentCount;
    }

    @Nullable
    public final String getFace() {
        return this.face;
    }

    public final boolean getFollowed() {
        return this.followed;
    }

    public final int getFollowerCount() {
        return this.followerCount;
    }

    public final int getFollowingCount() {
        return this.followingCount;
    }

    public final int getLevel() {
        return this.level;
    }

    public final long getMid() {
        return this.mid;
    }

    public final boolean getOfficialAccount() {
        return this.officialAccount;
    }

    @Nullable
    public final OfficialVerify getOfficialVerify() {
        return this.officialVerify;
    }

    public final int getPlayedCount() {
        return this.playedCount;
    }

    public final int getReplyCount() {
        return this.replyCount;
    }

    public final int getSeniorMember() {
        return this.seniorMember;
    }

    @Nullable
    public final String getSign() {
        return this.sign;
    }

    @Nullable
    public final String getSpecialIdentity() {
        return this.specialIdentity;
    }

    @Nullable
    public final String getUname() {
        return this.uname;
    }

    @Nullable
    public final Vip getVip() {
        return this.vip;
    }

    public final void setAttestationDisplay(@Nullable RecommendComment.AttestationDisplay attestationDisplay) {
        this.attestationDisplay = attestationDisplay;
    }

    public final void setCommentCount(int i7) {
        this.commentCount = i7;
    }

    public final void setFace(@Nullable String str) {
        this.face = str;
    }

    public final void setFollowed(boolean z6) {
        this.followed = z6;
    }

    public final void setFollowerCount(int i7) {
        this.followerCount = i7;
    }

    public final void setFollowingCount(int i7) {
        this.followingCount = i7;
    }

    public final void setLevel(int i7) {
        this.level = i7;
    }

    public final void setMid(long j7) {
        this.mid = j7;
    }

    public final void setOfficialAccount(boolean z6) {
        this.officialAccount = z6;
    }

    public final void setOfficialVerify(@Nullable OfficialVerify officialVerify) {
        this.officialVerify = officialVerify;
    }

    public final void setPlayedCount(int i7) {
        this.playedCount = i7;
    }

    public final void setReplyCount(int i7) {
        this.replyCount = i7;
    }

    public final void setSeniorMember(int i7) {
        this.seniorMember = i7;
    }

    public final void setSign(@Nullable String str) {
        this.sign = str;
    }

    public final void setSpecialIdentity(@Nullable String str) {
        this.specialIdentity = str;
    }

    public final void setUname(@Nullable String str) {
        this.uname = str;
    }

    public final void setVip(@Nullable Vip vip) {
        this.vip = vip;
    }
}
