package com.bilibili.biligame.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameHomeAd.class */
@Keep
public class BiligameHomeAd implements Parcelable {
    public static final Parcelable.Creator<BiligameHomeAd> CREATOR = new Object();

    @JSONField(name = "ad_image")
    public String adImage;

    @JSONField(name = "ad_link")
    public String adLink;

    @JSONField(name = "game_base_id")
    public int baseGameId;

    @JSONField(name = "close_position")
    public int closePosition;

    @JSONField(name = "image")
    public String image;

    @JSONField(name = "link")
    public String link;

    @JSONField(name = "game_name")
    public String name;

    @JSONField(name = "is_show_top")
    public int showTop;

    @JSONField(name = "small_image")
    public String smallImage;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameHomeAd$a.class */
    public final class a implements Parcelable.Creator<BiligameHomeAd> {
        @Override // android.os.Parcelable.Creator
        public final BiligameHomeAd createFromParcel(Parcel parcel) {
            return new BiligameHomeAd(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BiligameHomeAd[] newArray(int i7) {
            return new BiligameHomeAd[i7];
        }
    }

    public BiligameHomeAd() {
    }

    public BiligameHomeAd(Parcel parcel) {
        this.baseGameId = parcel.readInt();
        this.name = parcel.readString();
        this.adImage = parcel.readString();
        this.adLink = parcel.readString();
        this.closePosition = parcel.readInt();
        this.smallImage = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z6 = false;
        if (obj instanceof BiligameHomeAd) {
            z6 = false;
            if (this.baseGameId == ((BiligameHomeAd) obj).baseGameId) {
                z6 = true;
            }
        }
        return z6;
    }

    public boolean isPinnedTop() {
        boolean z6 = true;
        if (this.showTop != 1) {
            z6 = false;
        }
        return z6;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.baseGameId);
        parcel.writeString(this.name);
        parcel.writeString(this.adImage);
        parcel.writeString(this.adLink);
        parcel.writeInt(this.closePosition);
        parcel.writeString(this.smallImage);
    }
}
