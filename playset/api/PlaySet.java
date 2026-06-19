package com.bilibili.playset.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.playset.collection.enums.CollectionCoverEnum;
import com.bilibili.playset.collection.enums.CollectionTypeEnum;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import cs0.InterfaceC6755a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySet.class */
@Keep
public class PlaySet implements InterfaceC6755a, Parcelable {
    private static final int ATTR_CHECKED_NO = 4;
    private static final int ATTR_COVER_UPDATE_YES = 64;
    private static final int ATTR_DEFAULT_NO = 2;
    private static final int ATTR_DESC_UPDATE_YES = 32;
    private static final int ATTR_PUBLIC_NO = 1;
    private static final int ATTR_TITLE_UPDATE_YES = 16;
    private static final int ATTR_VALIDE_NO = 8;
    public static final int COVER_TYPE_AUDIO = 12;
    public static final int COVER_TYPE_CUSTOM = 0;
    public static final int COVER_TYPE_OGV = 24;
    public static final int COVER_TYPE_OGV_AVID = 42;
    public static final int COVER_TYPE_SEASON = 21;
    public static final int COVER_TYPE_VIDEO = 2;
    public static final Parcelable.Creator<PlaySet> CREATOR = new Object();

    @JSONField(name = "attr")
    public int attr;

    @JSONField(name = "media_count")
    public int count;
    public String cover;

    @JSONField(name = "cover_type")
    public int coverType;

    @JSONField(name = "fav_state")
    public int favorite;
    public long id;
    public String intro;

    @JSONField(name = "is_kid_playlist")
    public boolean isKidPlaylist;

    @Nullable
    @JSONField(name = "kid_playlist_desc")
    public String kidPlaylistDesc;

    @Nullable
    @JSONField(name = "link")
    public String link;

    @Nullable
    @JSONField(name = "ogv")
    public OGV ogv;

    @JSONField(name = "view_count")
    public long playCount;

    @JSONField(name = "play_switch")
    public int playSwitch;
    public String title;

    @JSONField(name = "type")
    public int type;

    @Nullable
    @JSONField(name = "upper")
    public Upper upper;

    @JSONField(name = "state")
    public int valid;

    @Nullable
    @JSONField(name = "view_text_1")
    public String viewText1;

    @JSONField(name = "vt")
    public long vt;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySet$OGV.class */
    @Keep
    public static class OGV implements Parcelable {
        public static final Parcelable.Creator<OGV> CREATOR = new Object();

        @Nullable
        @JSONField(name = "type_name")
        public String typeName;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySet$OGV$a.class */
        public final class a implements Parcelable.Creator<OGV> {
            @Override // android.os.Parcelable.Creator
            public final OGV createFromParcel(Parcel parcel) {
                return new OGV(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final OGV[] newArray(int i7) {
                return new OGV[i7];
            }
        }

        public OGV() {
        }

        public OGV(Parcel parcel) {
            this.typeName = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.typeName);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySet$Upper.class */
    @Keep
    public static class Upper implements Parcelable {
        public static final Parcelable.Creator<Upper> CREATOR = new Object();

        @JSONField(name = EditCustomizeSticker.TAG_MID)
        public long mid;

        @Nullable
        @JSONField(name = "name")
        public String name;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySet$Upper$a.class */
        public final class a implements Parcelable.Creator<Upper> {
            @Override // android.os.Parcelable.Creator
            public final Upper createFromParcel(Parcel parcel) {
                return new Upper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Upper[] newArray(int i7) {
                return new Upper[i7];
            }
        }

        public Upper() {
        }

        public Upper(Parcel parcel) {
            this.mid = parcel.readLong();
            this.name = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeLong(this.mid);
            parcel.writeString(this.name);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySet$a.class */
    public final class a implements Parcelable.Creator<PlaySet> {
        @Override // android.os.Parcelable.Creator
        public final PlaySet createFromParcel(Parcel parcel) {
            return new PlaySet(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaySet[] newArray(int i7) {
            return new PlaySet[i7];
        }
    }

    public PlaySet() {
    }

    public PlaySet(Parcel parcel) {
        this.id = parcel.readLong();
        this.title = parcel.readString();
        this.cover = parcel.readString();
        this.intro = parcel.readString();
        this.coverType = parcel.readInt();
        this.valid = parcel.readInt();
        this.count = parcel.readInt();
        this.favorite = parcel.readInt();
        this.upper = (Upper) parcel.readParcelable(Upper.class.getClassLoader());
        this.ogv = (OGV) parcel.readParcelable(OGV.class.getClassLoader());
        this.attr = parcel.readInt();
        this.playCount = parcel.readLong();
        this.vt = parcel.readLong();
        this.playSwitch = parcel.readInt();
        this.type = parcel.readInt();
        this.link = parcel.readString();
        this.viewText1 = parcel.readString();
        this.isKidPlaylist = parcel.readInt() != 1 ? false : true;
        this.kidPlaylistDesc = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // cs0.InterfaceC6755a
    @Nullable
    public InterfaceC6755a getAttached() {
        return null;
    }

    @JSONField(deserialize = false, serialize = false)
    public long getAuthorId() {
        Upper upper = this.upper;
        if (upper == null) {
            return 0L;
        }
        return upper.mid;
    }

    @NonNull
    @JSONField(deserialize = false, serialize = false)
    public String getAuthorName() {
        String str;
        Upper upper = this.upper;
        return (upper == null || (str = upper.name) == null) ? "" : str;
    }

    @Override // cs0.InterfaceC6755a
    @NonNull
    public CollectionTypeEnum getCardType() {
        int i7 = this.type;
        return i7 != 21 ? i7 != 1000 ? CollectionTypeEnum.FOLDER : CollectionTypeEnum.PAY_SEASON : CollectionTypeEnum.SEASON;
    }

    @Override // cs0.InterfaceC6755a
    public long getCommentCounts() {
        return 0L;
    }

    @Override // cs0.InterfaceC6755a
    public int getContentCounts() {
        return this.count;
    }

    @Override // cs0.InterfaceC6755a
    @NonNull
    public CollectionCoverEnum getCoverType() {
        CollectionCoverEnum.a aVar = CollectionCoverEnum.Companion;
        int i7 = this.coverType;
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
        return getAuthorId();
    }

    @Override // cs0.InterfaceC6755a
    @Nullable
    public String getCreatorName() {
        return getAuthorName();
    }

    @Override // cs0.InterfaceC6755a
    public long getDuration() {
        return 0L;
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
        return Long.toString(this.id);
    }

    @Override // cs0.InterfaceC6755a
    @Nullable
    public String getOgvTag() {
        OGV ogv = this.ogv;
        return ogv != null ? ogv.typeName : "";
    }

    @Override // cs0.InterfaceC6755a
    public long getPlayCounts() {
        return this.playCount;
    }

    @Override // cs0.InterfaceC6755a
    public int getPlaySwitch() {
        return this.playSwitch;
    }

    @Override // cs0.InterfaceC6755a
    public long getReplayCounts() {
        return 0L;
    }

    @Override // cs0.InterfaceC6755a
    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Override // cs0.InterfaceC6755a
    public int getTotalPage() {
        return 0;
    }

    @Override // cs0.InterfaceC6755a
    @Nullable
    public String getViewText1() {
        return this.viewText1;
    }

    @Override // cs0.InterfaceC6755a
    public long getVt() {
        return this.vt;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean hasCurrentVideo() {
        boolean z6 = true;
        if (this.favorite != 1) {
            z6 = false;
        }
        return z6;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isDefault() {
        return (this.attr & 2) == 0;
    }

    public boolean isDefaultAttr() {
        return isDefault();
    }

    @Override // cs0.InterfaceC6755a
    public boolean isInvalid() {
        return !isValid();
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isPublic() {
        boolean z6 = true;
        if ((this.attr & 1) != 0) {
            z6 = false;
        }
        return z6;
    }

    @Override // cs0.InterfaceC6755a
    public boolean isPublicAttr() {
        return isPublic();
    }

    @Override // cs0.InterfaceC6755a
    public boolean isUPDelete() {
        boolean z6 = true;
        if (((this.attr >> 3) & 1) != 1) {
            z6 = false;
        }
        return z6;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isValid() {
        return this.valid == 0;
    }

    @Override // cs0.InterfaceC6755a
    public boolean needToPay() {
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.cover);
        parcel.writeString(this.intro);
        parcel.writeInt(this.coverType);
        parcel.writeInt(this.valid);
        parcel.writeInt(this.count);
        parcel.writeInt(this.favorite);
        parcel.writeParcelable(this.upper, i7);
        parcel.writeParcelable(this.ogv, i7);
        parcel.writeInt(this.attr);
        parcel.writeLong(this.playCount);
        parcel.writeLong(this.vt);
        parcel.writeInt(this.playSwitch);
        parcel.writeInt(this.type);
        parcel.writeString(this.link);
        parcel.writeString(this.viewText1);
        parcel.writeInt(this.isKidPlaylist ? 1 : 0);
        parcel.writeString(this.kidPlaylistDesc);
    }
}
