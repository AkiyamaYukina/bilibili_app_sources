package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.SearchUpperCard;
import com.bapis.bilibili.polymer.app.search.v1.VipInfo;
import com.bapis.bilibili.polymer.app.search.v1.VipLabel;
import com.bilibili.commons.StringUtils;
import com.bilibili.droid.StringUtil;
import com.bilibili.search2.api.BaseSearchItem;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchUpperItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SearchUpperItem extends BaseSearchItem {
    public static final int $stable = 8;

    @Nullable
    private String abtestId;

    @JSONField(name = "archives")
    private int archives;

    @JSONField(name = "attentions")
    private int attentions;

    @JSONField(name = "av_items")
    @Nullable
    private List<Video> avItems;

    @JSONField(name = "avatar_item")
    @Nullable
    private o10.a avatarItem;

    @JSONField(name = "face_nft_new")
    private int faceNftNew;

    @JSONField(name = "fans")
    private int fans;

    @JSONField(name = "handle")
    @Nullable
    private String handle;

    @JSONField(name = "is_senior_member")
    private int isSeniorMember;

    @JSONField(name = "is_up")
    private boolean isUpUser;

    @JSONField(name = "level")
    private int level;

    @JSONField(name = "live_link")
    @Nullable
    private String liveLink;

    @JSONField(name = "live_status")
    private int liveStatus;

    @JSONField(name = "nft_face_icon")
    @Nullable
    private SearchNftIconItem nftIconItem;

    @JSONField(name = "notice")
    @Nullable
    private PrInfo notice;

    @JSONField(name = "official_verify")
    @Nullable
    private SearchOfficialVerify officialVerify;

    @JSONField(name = "relation")
    @Nullable
    private BaseSearchItem.Relation relation;

    @JSONField(name = "roomid")
    private int roomId;

    @JSONField(name = "sign")
    @Nullable
    private String sign;

    @JSONField(name = "user_card_desc")
    @Nullable
    private String userCardDesc;

    @JSONField(name = "vip")
    @Nullable
    private Vip vip;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchUpperItem$Label.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Label {
        public static final int $stable = 8;

        @JSONField(name = "path")
        @Nullable
        private String path;

        public Label() {
        }

        public Label(@NotNull VipLabel vipLabel) {
            this.path = vipLabel.getPath();
        }

        @Nullable
        public final String getPath() {
            return this.path;
        }

        public final void setPath(@Nullable String str) {
            this.path = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchUpperItem$Video.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Video {
        public static final int $stable = 8;

        @Nullable
        private String author;

        @JSONField(name = "badges")
        @Nullable
        private List<? extends Tag> badges;

        @Nullable
        private String cover;

        @Nullable
        private String ctime;

        @JSONField(name = "ctime_label")
        @Nullable
        private String ctimeLabel;

        @Nullable
        private String danmaku;

        @Nullable
        private String desc;

        @Nullable
        private String duration;

        @JSONField(name = "is_pay")
        private int isPay;

        @Nullable
        private String param;

        @Nullable
        private String play;

        @Nullable
        private String title;

        @Nullable
        private String trackId;

        @Nullable
        private String uri;

        @Nullable
        public final String getAuthor() {
            return this.author;
        }

        @Nullable
        public final List<Tag> getBadges() {
            return this.badges;
        }

        @Nullable
        public final String getCover() {
            return this.cover;
        }

        @Nullable
        public final String getCtime() {
            return this.ctime;
        }

        @Nullable
        public final String getCtimeLabel() {
            return this.ctimeLabel;
        }

        @Nullable
        public final String getDanmaku() {
            return this.danmaku;
        }

        @Nullable
        public final String getDesc() {
            return this.desc;
        }

        @Nullable
        public final String getDuration() {
            return this.duration;
        }

        @Nullable
        public final String getParam() {
            return this.param;
        }

        @Nullable
        public final String getPlay() {
            return this.play;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getTrackId() {
            return this.trackId;
        }

        @Nullable
        public final String getUri() {
            return this.uri;
        }

        public final int isPay() {
            return this.isPay;
        }

        public final void setAuthor(@Nullable String str) {
            this.author = str;
        }

        public final void setBadges(@Nullable List<? extends Tag> list) {
            this.badges = list;
        }

        public final void setCover(@Nullable String str) {
            this.cover = str;
        }

        public final void setCtime(@Nullable String str) {
            this.ctime = str;
        }

        public final void setCtimeLabel(@Nullable String str) {
            this.ctimeLabel = str;
        }

        public final void setDanmaku(@Nullable String str) {
            this.danmaku = str;
        }

        public final void setDesc(@Nullable String str) {
            this.desc = str;
        }

        public final void setDuration(@Nullable String str) {
            this.duration = str;
        }

        public final void setParam(@Nullable String str) {
            this.param = str;
        }

        public final void setPay(int i7) {
            this.isPay = i7;
        }

        public final void setPlay(@Nullable String str) {
            this.play = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setTrackId(@Nullable String str) {
            this.trackId = str;
        }

        public final void setUri(@Nullable String str) {
            this.uri = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchUpperItem$Vip.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class Vip {
        public static final int $stable = 8;

        @JSONField(name = "due_date")
        private long dueDate;

        @JSONField(name = "label")
        @Nullable
        private Label label;

        @JSONField(name = NotificationCompat.CATEGORY_STATUS)
        private int status;

        @JSONField(name = "theme_type")
        private int themeType;

        @JSONField(name = "type")
        private int type;

        @JSONField(name = "vip_pay_type")
        private int vipPayType;

        public Vip() {
        }

        public Vip(@NotNull VipInfo vipInfo) {
            this.type = vipInfo.getType();
            this.status = vipInfo.getStatus();
            this.themeType = vipInfo.getThemeType();
            if (vipInfo.hasLabel()) {
                this.label = new Label(vipInfo.getLabel());
            }
            this.dueDate = vipInfo.getDueDate();
            this.vipPayType = vipInfo.getVipPayType();
        }

        public final long getDueDate() {
            return this.dueDate;
        }

        @Nullable
        public final Label getLabel() {
            return this.label;
        }

        public final int getStatus() {
            return this.status;
        }

        public final int getThemeType() {
            return this.themeType;
        }

        public final int getType() {
            return this.type;
        }

        public final int getVipPayType() {
            return this.vipPayType;
        }

        public final void setDueDate(long j7) {
            this.dueDate = j7;
        }

        public final void setLabel(@Nullable Label label) {
            this.label = label;
        }

        public final void setStatus(int i7) {
            this.status = i7;
        }

        public final void setThemeType(int i7) {
            this.themeType = i7;
        }

        public final void setType(int i7) {
            this.type = i7;
        }

        public final void setVipPayType(int i7) {
            this.vipPayType = i7;
        }
    }

    public SearchUpperItem() {
    }

    public SearchUpperItem(@NotNull SearchUpperCard searchUpperCard) {
        this.sign = searchUpperCard.getSign();
        this.fans = searchUpperCard.getFans();
        this.archives = searchUpperCard.getArchives();
        this.liveStatus = searchUpperCard.getLiveStatus();
        this.roomId = searchUpperCard.getRoomid();
        if (searchUpperCard.hasOfficialVerify()) {
            this.officialVerify = new SearchOfficialVerify(searchUpperCard.getOfficialVerify());
        }
        this.faceNftNew = searchUpperCard.getFaceNftNew();
        if (searchUpperCard.hasNftFaceIcon()) {
            this.nftIconItem = new SearchNftIconItem(searchUpperCard.getNftFaceIcon());
        }
        this.isUpUser = searchUpperCard.getIsUp();
        this.attentions = searchUpperCard.getAttentions();
        this.level = searchUpperCard.getLevel();
        this.isSeniorMember = searchUpperCard.getIsSeniorMember();
        if (searchUpperCard.hasVip()) {
            this.vip = new Vip(searchUpperCard.getVip());
        }
        if (searchUpperCard.hasRelation()) {
            this.relation = new BaseSearchItem.Relation(searchUpperCard.getRelation());
        }
        this.liveLink = searchUpperCard.getLiveLink();
        if (searchUpperCard.hasNotice()) {
            this.notice = new PrInfo(searchUpperCard.getNotice());
        }
        setTitle(searchUpperCard.getTitle());
        setCover(searchUpperCard.getCover());
        this.handle = searchUpperCard.getHandle();
        if (searchUpperCard.hasAvatarInfo()) {
            this.avatarItem = r10.a.a(searchUpperCard.getAvatarInfo());
        }
        this.userCardDesc = searchUpperCard.getUserCardDesc();
    }

    @Nullable
    public final String getAbtestId() {
        return this.abtestId;
    }

    public final int getArchives() {
        return this.archives;
    }

    public final int getAttentions() {
        return this.attentions;
    }

    @Nullable
    public final List<Video> getAvItems() {
        return this.avItems;
    }

    @Nullable
    public final o10.a getAvatarItem() {
        return this.avatarItem;
    }

    public final int getFaceNftNew() {
        return this.faceNftNew;
    }

    public final int getFans() {
        return this.fans;
    }

    @Nullable
    public final String getHandle() {
        return this.handle;
    }

    @Nullable
    public final String getJumpUri() {
        return StringUtil.isNotBlank(this.liveLink) ? this.liveLink : getUri();
    }

    public final int getLevel() {
        return this.level;
    }

    @Nullable
    public final String getLiveLink() {
        return this.liveLink;
    }

    public final int getLiveStatus() {
        return this.liveStatus;
    }

    @Nullable
    public final SearchNftIconItem getNftIconItem() {
        return this.nftIconItem;
    }

    @Nullable
    public final PrInfo getNotice() {
        return this.notice;
    }

    @Nullable
    public final SearchOfficialVerify getOfficialVerify() {
        return this.officialVerify;
    }

    @Nullable
    public final BaseSearchItem.Relation getRelation() {
        return this.relation;
    }

    public final int getRoomId() {
        return this.roomId;
    }

    @Nullable
    public final String getSign() {
        return this.sign;
    }

    @Nullable
    public final String getUserCardDesc() {
        return this.userCardDesc;
    }

    @Nullable
    public final Vip getVip() {
        return this.vip;
    }

    @Nullable
    public final String getVipLabel() {
        Vip vip = this.vip;
        return (vip == null || vip.getLabel() == null || StringUtils.isEmpty(this.vip.getLabel().getPath())) ? "" : this.vip.getLabel().getPath();
    }

    public final boolean isAttention() {
        boolean z6 = true;
        if (this.attentions != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isBigVipYear() {
        Vip vip = this.vip;
        boolean z6 = false;
        if (vip != null && vip.getType() == 2) {
            z6 = true;
        }
        return z6;
    }

    public final int isSeniorMember() {
        return this.isSeniorMember;
    }

    public final boolean isUpFollowUser() {
        BaseSearchItem.Relation relation = this.relation;
        return relation != null && relation.isUpFollowUser();
    }

    public final boolean isUpUser() {
        return this.isUpUser;
    }

    public final boolean isUserFollowUp() {
        BaseSearchItem.Relation relation = this.relation;
        return relation != null && relation.isUserFollowUp();
    }

    public final void setAbtestId(@Nullable String str) {
        this.abtestId = str;
    }

    public final void setArchives(int i7) {
        this.archives = i7;
    }

    public final void setAttentions(int i7) {
        this.attentions = i7;
    }

    public final void setAvItems(@Nullable List<Video> list) {
        this.avItems = list;
    }

    public final void setAvatarItem(@Nullable o10.a aVar) {
        this.avatarItem = aVar;
    }

    public final void setFaceNftNew(int i7) {
        this.faceNftNew = i7;
    }

    public final void setFans(int i7) {
        this.fans = i7;
    }

    public final void setHandle(@Nullable String str) {
        this.handle = str;
    }

    public final void setLevel(int i7) {
        this.level = i7;
    }

    public final void setLiveLink(@Nullable String str) {
        this.liveLink = str;
    }

    public final void setLiveStatus(int i7) {
        this.liveStatus = i7;
    }

    public final void setNftIconItem(@Nullable SearchNftIconItem searchNftIconItem) {
        this.nftIconItem = searchNftIconItem;
    }

    public final void setNotice(@Nullable PrInfo prInfo) {
        this.notice = prInfo;
    }

    public final void setOfficialVerify(@Nullable SearchOfficialVerify searchOfficialVerify) {
        this.officialVerify = searchOfficialVerify;
    }

    public final void setRelation(@Nullable BaseSearchItem.Relation relation) {
        this.relation = relation;
    }

    public final void setRoomId(int i7) {
        this.roomId = i7;
    }

    public final void setSeniorMember(int i7) {
        this.isSeniorMember = i7;
    }

    public final void setSign(@Nullable String str) {
        this.sign = str;
    }

    public final void setUpUser(boolean z6) {
        this.isUpUser = z6;
    }

    public final void setUserCardDesc(@Nullable String str) {
        this.userCardDesc = str;
    }

    public final void setVip(@Nullable Vip vip) {
        this.vip = vip;
    }

    public final boolean toggleAttention() {
        this.attentions = 1 - this.attentions;
        return isAttention();
    }

    public final void updateRelation(boolean z6, boolean z7) {
        BaseSearchItem.Relation relation = this.relation;
        if (relation != null) {
            relation.updateRelation(z6, z7);
        }
    }
}
