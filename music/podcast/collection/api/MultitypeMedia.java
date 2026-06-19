package com.bilibili.music.podcast.collection.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.app.listener.v1.EventTracking;
import com.bilibili.music.podcast.collection.enums.CollectionCoverEnum;
import com.bilibili.music.podcast.collection.enums.CollectionTypeEnum;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.opd.app.bizcommon.hybridruntime.KFCHybridV2;
import java.util.List;
import li0.InterfaceC7859b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/MultitypeMedia.class */
@Keep
public class MultitypeMedia implements Parcelable, Cloneable, InterfaceC7859b {
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

    @Nullable
    public EventTracking eventTracking;

    @JSONField(name = "fav_state")
    public int favoState;
    public long folderId;
    public int folderType;
    public long id;
    public int index;

    @Nullable
    public String intro;
    private boolean isReported;
    public int itemType;

    @JSONField(name = "like_state")
    public int likeState;

    @NonNull
    public String link;
    public String message;
    public long offset;

    @Nullable
    @JSONField(name = "ogv")
    public OGV ogv;

    @Nullable
    public List<Page> pages;
    public long pubtime;
    public int reportPosition;

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
    public int state;
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/MultitypeMedia$OGV.class */
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/MultitypeMedia$Rights.class */
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

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/MultitypeMedia$Rights$a.class */
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/MultitypeMedia$UGC.class */
    @Keep
    public static class UGC {

        @JSONField(name = "first_cid")
        public long cid;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/MultitypeMedia$a.class */
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
        this.isReported = false;
        this.reportPosition = 0;
    }

    public MultitypeMedia(Parcel parcel) {
        boolean z6 = false;
        this.selected = false;
        this.isReported = false;
        this.reportPosition = 0;
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
        this.folderId = parcel.readLong();
        this.folderType = parcel.readInt();
        this.state = parcel.readInt();
        this.itemType = parcel.readInt();
        this.message = parcel.readString();
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

    @Override // li0.InterfaceC7859b
    @Nullable
    public InterfaceC7859b getAttached() {
        return this.season;
    }

    @Override // li0.InterfaceC7859b
    @NonNull
    public CollectionTypeEnum getCardType() {
        int i7 = this.type;
        return i7 != 2 ? i7 != 12 ? i7 != 21 ? i7 != 24 ? CollectionTypeEnum.UNKNOWN : CollectionTypeEnum.OGV : CollectionTypeEnum.SEASON : CollectionTypeEnum.AUDIO : this.season != null ? CollectionTypeEnum.UGC_SEASON : CollectionTypeEnum.UGC;
    }

    @Override // li0.InterfaceC7859b
    public long getCommentCounts() {
        return this.socializeInfo == null ? 0L : r0.reply;
    }

    @Override // li0.InterfaceC7859b
    public int getContentCounts() {
        return 1;
    }

    @Override // li0.InterfaceC7859b
    @NonNull
    public CollectionCoverEnum getCoverType() {
        CollectionCoverEnum.a aVar = CollectionCoverEnum.Companion;
        int i7 = this.type;
        aVar.getClass();
        return CollectionCoverEnum.a.a(i7);
    }

    @Override // li0.InterfaceC7859b
    @Nullable
    public String getCoverUrl() {
        return this.cover;
    }

    @Override // li0.InterfaceC7859b
    public long getCreatorId() {
        Upper upper = this.upper;
        return upper == null ? -1L : upper.mid;
    }

    @Override // li0.InterfaceC7859b
    @Nullable
    public String getCreatorName() {
        Upper upper = this.upper;
        return upper == null ? null : upper.name;
    }

    @Override // li0.InterfaceC7859b
    public long getDuration() {
        return this.duration;
    }

    @Override // li0.InterfaceC7859b
    @org.jetbrains.annotations.Nullable
    public EventTracking getEventTracking() {
        return this.eventTracking;
    }

    @Override // li0.InterfaceC7859b
    public long getFolderId() {
        return this.folderId;
    }

    @Override // li0.InterfaceC7859b
    public int getFolderType() {
        return this.folderType;
    }

    @Override // li0.InterfaceC7859b
    public long getId() {
        return this.id;
    }

    @Nullable
    public String getIntro() {
        return this.intro;
    }

    @Override // li0.InterfaceC7859b
    public int getItemState() {
        return this.state;
    }

    @Override // li0.InterfaceC7859b
    public int getItemType() {
        return this.itemType;
    }

    @Nullable
    public String getJumpLink() {
        return this.link;
    }

    @Override // li0.InterfaceC7859b
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

    @Override // li0.InterfaceC7859b
    @Nullable
    public String getMessage() {
        return this.message;
    }

    @Override // li0.InterfaceC7859b
    @Nullable
    public String getOgvTag() {
        OGV ogv = this.ogv;
        return ogv != null ? ogv.typeName : "";
    }

    @Override // li0.InterfaceC7859b
    public long getPlayCounts() {
        SocializeInfo socializeInfo = this.socializeInfo;
        return socializeInfo == null ? 0L : socializeInfo.play;
    }

    @Override // li0.InterfaceC7859b
    public int getReportPosition() {
        return this.reportPosition;
    }

    public long getShareSid() {
        long j7;
        CollectionTypeEnum cardType = getCardType();
        if (cardType == CollectionTypeEnum.UGC) {
            UGC ugc = this.ugc;
            j7 = ugc == null ? 0L : ugc.cid;
        } else {
            j7 = 0;
            if (cardType == CollectionTypeEnum.OGV) {
                OGV ogv = this.ogv;
                j7 = ogv == null ? 0L : ogv.seasonId;
            }
        }
        return j7;
    }

    @Override // li0.InterfaceC7859b
    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Override // li0.InterfaceC7859b
    public int getTotalPage() {
        return this.totalPage;
    }

    @Override // li0.InterfaceC7859b
    @Nullable
    public String getViewContent() {
        SocializeInfo socializeInfo = this.socializeInfo;
        return socializeInfo == null ? null : socializeInfo.viewContent;
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
            java.util.List<com.bilibili.music.podcast.collection.api.Page> r0 = r0.pages
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.collection.api.MultitypeMedia.hasMultiPage():boolean");
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

    public boolean isCoined() {
        CoinExtra coinExtra = this.coin;
        return (coinExtra == null || coinExtra.f66412b == 0) ? false : true;
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

    @Override // li0.InterfaceC7859b
    public boolean isInvalid() {
        return this.state == -1;
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

    @Override // li0.InterfaceC7859b
    public boolean isPublicAttr() {
        return true;
    }

    @Override // com.bilibili.music.podcast.utils.InterfaceC5425e
    public boolean isReported() {
        return this.isReported;
    }

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

    @Override // li0.InterfaceC7859b
    public boolean needToPay() {
        if (this.type == 12) {
            return isAudioNeedPay();
        }
        int i7 = this.attr;
        return (i7 & 2) != 0 && i7 == 12;
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
            coinExtra.f66412b = z6 ? 1 : 0;
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

    @Override // li0.InterfaceC7859b
    public void setReportPosition(int i7) {
        this.reportPosition = i7;
    }

    @Override // com.bilibili.music.podcast.utils.InterfaceC5425e
    public void setReported(boolean z6) {
        this.isReported = z6;
    }

    public void setState(int i7) {
        this.state = i7;
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

    @Override // li0.InterfaceC7859b
    public boolean useVt() {
        SocializeInfo socializeInfo = this.socializeInfo;
        return socializeInfo != null && socializeInfo.isVt;
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
        parcel.writeLong(this.folderId);
        parcel.writeInt(this.folderType);
        parcel.writeInt(this.state);
        parcel.writeInt(this.itemType);
        parcel.writeString(this.message);
    }
}
