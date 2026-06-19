package com.bilibili.playset.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.app.comm.list.common.utils.share.IListShare;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.opd.app.bizcommon.hybridruntime.KFCHybridV2;
import com.bilibili.playset.collection.enums.CollectionCoverEnum;
import com.bilibili.playset.collection.enums.CollectionTypeEnum;
import cs0.InterfaceC6755a;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/MultitypeMedia.class */
@Keep
public class MultitypeMedia implements IListShare, Parcelable, Cloneable, InterfaceC6755a {
    public static final Parcelable.Creator<MultitypeMedia> CREATOR = new Object();
    public int attr;

    @JSONField(name = "bv_id")
    public String bvid;

    @Nullable
    public CoinExtra coin;

    @NonNull
    public String cover;
    public long ctime;
    public long duration;

    @JSONField(name = "fav_state")
    public int favoState;
    public long id;
    public int index;

    @Nullable
    public String intro;

    @JSONField(name = "like_state")
    public int likeState;

    @NonNull
    public String link;
    public long offset;

    @Nullable
    @JSONField(name = "ogv")
    public OGV ogv;

    @Nullable
    public List<Page> pages;
    public long pubtime;

    @Nullable
    @JSONField(name = "rights")
    public Rights rights;

    @Nullable
    public MultitypeMedia season;
    public boolean selected;

    @JSONField(name = "short_link")
    public String shortLink;

    @Nullable
    @JSONField(name = "cnt_info")
    public SocializeInfo socializeInfo;
    public long tid;

    @Nullable
    public String title;

    @JSONField(name = MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE)
    public int totalPage;
    public int type;

    @Nullable
    @JSONField(name = "ugc")
    public UGC ugc;

    @Nullable
    public Upper upper;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/MultitypeMedia$OGV.class */
    @Keep
    public static class OGV {

        @JSONField(name = "season_id")
        public long seasonId;

        @JSONField(name = "type_id")
        public int seasonType;

        @Nullable
        @JSONField(name = "type_name")
        public String typeName;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/MultitypeMedia$Rights.class */
    @Keep
    public static class Rights implements Parcelable {
        public static final Parcelable.Creator<Rights> CREATOR = new Object();

        @JSONField(name = "no_background")
        public int disableBackgroundMusic;

        @JSONField(name = "ugc_pay_preview")
        public boolean isPreview;

        @JSONField(name = "bp")
        public boolean mCanBp;

        @JSONField(name = "elec")
        public boolean mCanCharge;

        @JSONField(name = KFCHybridV2.Configuration.MALL_DOWNLOAD_DOMAIN)
        public boolean mCanDownload;

        @JSONField(name = "movie")
        public boolean mCanMovie;

        @JSONField(name = "no_reprint")
        public boolean noReprint;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/MultitypeMedia$Rights$a.class */
        public final class a implements Parcelable.Creator<Rights> {
            @Override // android.os.Parcelable.Creator
            public final Rights createFromParcel(Parcel parcel) {
                return new Rights(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Rights[] newArray(int i7) {
                return new Rights[i7];
            }
        }

        public Rights() {
        }

        public Rights(Parcel parcel) {
            this.mCanBp = parcel.readByte() != 0;
            this.mCanCharge = parcel.readByte() != 0;
            this.mCanDownload = parcel.readByte() != 0;
            this.mCanMovie = parcel.readByte() != 0;
            this.isPreview = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeByte(this.mCanBp ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.mCanCharge ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.mCanDownload ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.mCanMovie ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.isPreview ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/MultitypeMedia$UGC.class */
    @Keep
    public static class UGC {

        @JSONField(name = "first_cid")
        public long cid;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/MultitypeMedia$a.class */
    public final class a implements Parcelable.Creator<MultitypeMedia> {
        @Override // android.os.Parcelable.Creator
        public final MultitypeMedia createFromParcel(Parcel parcel) {
            return new MultitypeMedia(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MultitypeMedia[] newArray(int i7) {
            return new MultitypeMedia[i7];
        }
    }

    public MultitypeMedia() {
        this.selected = false;
    }

    public MultitypeMedia(Parcel parcel) {
        boolean z6 = false;
        this.selected = false;
        this.attr = parcel.readInt();
        this.socializeInfo = (SocializeInfo) parcel.readParcelable(SocializeInfo.class.getClassLoader());
        this.cover = parcel.readString();
        this.duration = parcel.readLong();
        this.id = parcel.readLong();
        this.likeState = parcel.readInt();
        this.totalPage = parcel.readInt();
        this.pages = parcel.createTypedArrayList(Page.CREATOR);
        this.title = parcel.readString();
        this.type = parcel.readInt();
        this.upper = (Upper) parcel.readParcelable(Upper.class.getClassLoader());
        this.link = parcel.readString();
        this.bvid = parcel.readString();
        this.shortLink = parcel.readString();
        this.rights = (Rights) parcel.readParcelable(Rights.class.getClassLoader());
        this.favoState = parcel.readInt();
        this.intro = parcel.readString();
        this.coin = (CoinExtra) parcel.readParcelable(CoinExtra.class.getClassLoader());
        this.ctime = parcel.readLong();
        this.tid = parcel.readLong();
        this.pubtime = parcel.readLong();
        this.selected = parcel.readByte() != 0 ? true : z6;
        this.season = (MultitypeMedia) parcel.readParcelable(MultitypeMedia.class.getClassLoader());
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void downDislike() {
        if (this.socializeInfo != null && isDislike()) {
            setDislike(false);
            SocializeInfo socializeInfo = this.socializeInfo;
            socializeInfo.thumb_down = Math.max(0, socializeInfo.thumb_down - 1);
        }
    }

    public void downLike() {
        if (this.socializeInfo != null && isLike()) {
            setLike(false);
            this.socializeInfo.thumb_up--;
        }
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.id != ((MultitypeMedia) obj).id) {
            z6 = false;
        }
        return z6;
    }

    @Override // cs0.InterfaceC6755a
    @Nullable
    public InterfaceC6755a getAttached() {
        return this.season;
    }

    @Nullable
    public String getAuthor() {
        return getCreatorName();
    }

    @Nullable
    public String getAuthorFace() {
        Upper upper = this.upper;
        return upper == null ? "" : upper.face;
    }

    public long getAvId() {
        return this.id;
    }

    @Nullable
    public String getBvid() {
        return this.bvid;
    }

    @Override // cs0.InterfaceC6755a
    @NonNull
    public CollectionTypeEnum getCardType() {
        int i7 = this.type;
        return i7 != 2 ? i7 != 12 ? i7 != 21 ? i7 != 24 ? i7 != 42 ? i7 != 1000 ? CollectionTypeEnum.UNKNOWN : CollectionTypeEnum.PAY_SEASON : CollectionTypeEnum.OGV_V2 : CollectionTypeEnum.OGV : CollectionTypeEnum.SEASON : CollectionTypeEnum.AUDIO : this.season != null ? CollectionTypeEnum.UGC_SEASON : CollectionTypeEnum.UGC;
    }

    @Override // cs0.InterfaceC6755a
    public long getCommentCounts() {
        SocializeInfo socializeInfo = this.socializeInfo;
        return socializeInfo == null ? 0L : socializeInfo.danmaku;
    }

    @Override // cs0.InterfaceC6755a
    public int getContentCounts() {
        return 1;
    }

    @Nullable
    public String getCover() {
        return this.cover;
    }

    @Override // cs0.InterfaceC6755a
    @NonNull
    public CollectionCoverEnum getCoverType() {
        CollectionCoverEnum.a aVar = CollectionCoverEnum.Companion;
        int i7 = this.type;
        aVar.getClass();
        return CollectionCoverEnum.a.a(i7);
    }

    @Override // cs0.InterfaceC6755a
    @Nullable
    public String getCoverUrl() {
        return this.cover;
    }

    @Override // cs0.InterfaceC6755a
    public long getCreatorId() {
        Upper upper = this.upper;
        return upper == null ? -1L : upper.mid;
    }

    @Override // cs0.InterfaceC6755a
    @Nullable
    public String getCreatorName() {
        Upper upper = this.upper;
        return upper == null ? null : upper.name;
    }

    @Nullable
    public String getDescription() {
        return this.intro;
    }

    @Override // cs0.InterfaceC6755a
    public long getDuration() {
        return this.duration;
    }

    public long getEpId() {
        return getCardType() == CollectionTypeEnum.OGV ? this.id : 0L;
    }

    @Override // cs0.InterfaceC6755a
    public long getId() {
        return this.id;
    }

    @Override // cs0.InterfaceC6755a
    @Nullable
    public String getIntro() {
        return this.intro;
    }

    @Override // cs0.InterfaceC6755a
    @Nullable
    public String getJumpLink() {
        return this.link;
    }

    @Override // cs0.InterfaceC6755a
    @NonNull
    public String getKey() {
        String string;
        if (this.season == null) {
            string = Long.toString(this.id);
        } else {
            string = this.id + "-" + this.season.id;
        }
        return string;
    }

    public long getMid() {
        return getCreatorId();
    }

    @Override // cs0.InterfaceC6755a
    @Nullable
    public String getOgvTag() {
        OGV ogv = this.ogv;
        return ogv != null ? ogv.typeName : "";
    }

    @Override // cs0.InterfaceC6755a
    public long getPlayCounts() {
        SocializeInfo socializeInfo = this.socializeInfo;
        return socializeInfo == null ? 0L : socializeInfo.play;
    }

    @Nullable
    public String getPlayNumber() {
        return Long.toString(getPlayCounts());
    }

    @Override // cs0.InterfaceC6755a
    public int getPlaySwitch() {
        return this.socializeInfo.play_switch;
    }

    @Override // cs0.InterfaceC6755a
    public long getReplayCounts() {
        return this.socializeInfo == null ? 0L : r0.reply;
    }

    public long getRoomId() {
        return 0L;
    }

    @Nullable
    public String getSeasonTitle() {
        return null;
    }

    @Nullable
    public String getShareShortLink() {
        return this.shortLink;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long getShareSid() {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.playset.collection.enums.CollectionTypeEnum r0 = r0.getCardType()
            r8 = r0
            com.bilibili.playset.collection.enums.CollectionTypeEnum r0 = com.bilibili.playset.collection.enums.CollectionTypeEnum.UGC
            r9 = r0
            r0 = 0
            r6 = r0
            r0 = r8
            r1 = r9
            if (r0 != r1) goto L2d
            r0 = r3
            com.bilibili.playset.api.MultitypeMedia$UGC r0 = r0.ugc
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L24
            r0 = r6
            r4 = r0
            goto L55
        L24:
            r0 = r8
            long r0 = r0.cid
            r4 = r0
            goto L55
        L2d:
            r0 = r8
            com.bilibili.playset.collection.enums.CollectionTypeEnum r1 = com.bilibili.playset.collection.enums.CollectionTypeEnum.OGV
            if (r0 == r1) goto L3f
            r0 = r6
            r4 = r0
            r0 = r8
            com.bilibili.playset.collection.enums.CollectionTypeEnum r1 = com.bilibili.playset.collection.enums.CollectionTypeEnum.OGV_V2
            if (r0 != r1) goto L55
        L3f:
            r0 = r3
            com.bilibili.playset.api.MultitypeMedia$OGV r0 = r0.ogv
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L4f
            r0 = r6
            r4 = r0
            goto L55
        L4f:
            r0 = r8
            long r0 = r0.seasonId
            r4 = r0
        L55:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.api.MultitypeMedia.getShareSid():long");
    }

    @Nullable
    public String getShareSubtitle() {
        return "";
    }

    @Override // cs0.InterfaceC6755a
    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Override // cs0.InterfaceC6755a
    public int getTotalPage() {
        return this.totalPage;
    }

    @Override // cs0.InterfaceC6755a
    @Nullable
    public String getViewText1() {
        return this.socializeInfo.view_text_1;
    }

    @Override // cs0.InterfaceC6755a
    public long getVt() {
        return this.socializeInfo.vt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean hasMultiPage() {
        /*
            r3 = this;
            r0 = r3
            java.util.List<com.bilibili.playset.api.Page> r0 = r0.pages
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1a
            r0 = r6
            int r0 = r0.size()
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 <= r1) goto L1a
            goto L1c
        L1a:
            r0 = 0
            r5 = r0
        L1c:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.api.MultitypeMedia.hasMultiPage():boolean");
    }

    public int hashCode() {
        long j7 = this.id;
        int i7 = (int) (j7 ^ (j7 >> 30));
        String str = this.title;
        int iHashCode = i7;
        if (str != null) {
            iHashCode = i7 + str.hashCode();
        }
        return iHashCode;
    }

    public boolean isAudio() {
        return this.type == 12;
    }

    public boolean isAudioNeedPay() {
        boolean z6 = true;
        if (((this.attr >> 1) & 1) != 1) {
            z6 = false;
        }
        return z6;
    }

    public boolean isChannelSharable(String str) {
        return false;
    }

    public boolean isCoined() {
        CoinExtra coinExtra = this.coin;
        return (coinExtra == null || coinExtra.f84037b == 0) ? false : true;
    }

    public boolean isCover16_9() {
        return !(this.type == 12);
    }

    public boolean isDefaultAttr() {
        return false;
    }

    public boolean isDislike() {
        return this.likeState == MultitypePlaylist.STATE_DISLIKE;
    }

    public boolean isFavorited() {
        boolean z6 = true;
        if (this.favoState != 1) {
            z6 = false;
        }
        return z6;
    }

    @Override // cs0.InterfaceC6755a
    public boolean isInvalid() {
        return isInvalidData();
    }

    public boolean isInvalidData() {
        boolean z6 = true;
        if ((this.attr & 1) != 1) {
            z6 = false;
        }
        return z6;
    }

    public boolean isLike() {
        return this.likeState == MultitypePlaylist.STATE_LIKE;
    }

    @Override // cs0.InterfaceC6755a
    public boolean isPublicAttr() {
        return true;
    }

    @Override // cs0.InterfaceC6755a
    public boolean isUPDelete() {
        boolean z6 = true;
        if (((this.attr >> 3) & 1) != 1) {
            z6 = false;
        }
        return z6;
    }

    public boolean isValidSeason() {
        MultitypeMedia multitypeMedia = this.season;
        return (multitypeMedia == null || multitypeMedia.id <= 0 || TextUtils.isEmpty(multitypeMedia.title)) ? false : true;
    }

    public boolean isVideo() {
        return this.type == 2;
    }

    @Override // cs0.InterfaceC6755a
    public boolean needToPay() {
        return (this.attr & 2) != 0;
    }

    public void setCoinCount(int i7) {
        SocializeInfo socializeInfo = this.socializeInfo;
        if (socializeInfo != null) {
            socializeInfo.coin = i7;
        }
    }

    public void setCoined(boolean z6) {
        CoinExtra coinExtra = this.coin;
        if (coinExtra != null) {
            coinExtra.f84037b = z6 ? 1 : 0;
        }
    }

    public void setDislike(boolean z6) {
        this.likeState = z6 ? MultitypePlaylist.STATE_DISLIKE : MultitypePlaylist.STATE_NONE;
    }

    public void setFavorite(boolean z6) {
        if (this.favoState == z6) {
            return;
        }
        this.favoState = z6 ? 1 : 0;
        if (z6) {
            this.socializeInfo.collect++;
        } else {
            SocializeInfo socializeInfo = this.socializeInfo;
            socializeInfo.collect = Math.max(0, socializeInfo.collect - 1);
        }
    }

    public void setLike(boolean z6) {
        this.likeState = z6 ? MultitypePlaylist.STATE_LIKE : MultitypePlaylist.STATE_NONE;
    }

    public void upDislike() {
        if (this.socializeInfo == null || isDislike()) {
            return;
        }
        if (isLike()) {
            downLike();
        }
        setDislike(true);
        this.socializeInfo.thumb_down++;
    }

    public void upLike() {
        if (this.socializeInfo == null || isLike()) {
            return;
        }
        if (isDislike()) {
            downDislike();
        }
        setLike(true);
        this.socializeInfo.thumb_up++;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.attr);
        parcel.writeParcelable(this.socializeInfo, i7);
        parcel.writeString(this.cover);
        parcel.writeLong(this.duration);
        parcel.writeLong(this.id);
        parcel.writeInt(this.likeState);
        parcel.writeInt(this.totalPage);
        parcel.writeTypedList(this.pages);
        parcel.writeString(this.title);
        parcel.writeInt(this.type);
        parcel.writeParcelable(this.upper, i7);
        parcel.writeString(this.link);
        parcel.writeString(this.bvid);
        parcel.writeString(this.shortLink);
        parcel.writeParcelable(this.rights, i7);
        parcel.writeInt(this.favoState);
        parcel.writeString(this.intro);
        parcel.writeParcelable(this.coin, i7);
        parcel.writeLong(this.ctime);
        parcel.writeLong(this.tid);
        parcel.writeLong(this.pubtime);
        parcel.writeByte(this.selected ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.season, i7);
    }
}
