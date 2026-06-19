package com.bilibili.playset.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailContent;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/Upper.class */
@Keep
public class Upper implements Parcelable {
    public static final Parcelable.Creator<Upper> CREATOR = new Object();
    public String face;
    public long fans;
    public int followed;

    @JSONField(name = GameDetailContent.DetailInfo.UI_TYPE_JUMP_LINK)
    public String jumpLink;
    public long mid;
    public String name;

    @JSONField(name = "official_desc")
    public String officialDesc;

    @JSONField(name = "official_role")
    public int officialRole;

    @JSONField(name = "official_title")
    public String officialTitle;

    @JSONField(name = "vip_due_date")
    public long vipDueDate;

    @JSONField(name = "vip_pay_type")
    public int vipPayType;

    @JSONField(name = "vip_statue")
    public int vipStatue;

    @JSONField(name = "vip_type")
    public int vipType;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/Upper$a.class */
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
        this.face = parcel.readString();
        this.followed = parcel.readInt();
        this.mid = parcel.readLong();
        this.name = parcel.readString();
        this.vipType = parcel.readInt();
        this.vipStatue = parcel.readInt();
        this.vipDueDate = parcel.readLong();
        this.vipPayType = parcel.readInt();
        this.fans = parcel.readLong();
        this.officialRole = parcel.readInt();
        this.officialTitle = parcel.readString();
        this.officialDesc = parcel.readString();
        this.jumpLink = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isFollowed() {
        boolean z6 = true;
        if (this.followed != 1) {
            z6 = false;
        }
        return z6;
    }

    public void setFollowed(boolean z6) {
        this.followed = z6 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.face);
        parcel.writeInt(this.followed);
        parcel.writeLong(this.mid);
        parcel.writeString(this.name);
        parcel.writeInt(this.vipType);
        parcel.writeInt(this.vipStatue);
        parcel.writeLong(this.vipDueDate);
        parcel.writeInt(this.vipPayType);
        parcel.writeLong(this.fans);
        parcel.writeInt(this.officialRole);
        parcel.writeString(this.officialTitle);
        parcel.writeString(this.officialDesc);
        parcel.writeString(this.jumpLink);
    }
}
