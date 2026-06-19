package com.bilibili.biligame.api.bean.gamedetail;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameRole.class */
@Keep
public class GameRole implements Parcelable {
    public static final Parcelable.Creator<GameRole> CREATOR = new Parcelable.Creator<GameRole>() { // from class: com.bilibili.biligame.api.bean.gamedetail.GameRole.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GameRole createFromParcel(Parcel parcel) {
            return new GameRole(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GameRole[] newArray(int i7) {
            return new GameRole[i7];
        }
    };
    public String audio;
    public String cv;

    @JSONField(serialize = false)
    public int duration;

    @JSONField(serialize = false)
    public boolean expanded;

    @JSONField(name = "game_base_id")
    public int gameBaseId;
    public String icon;
    public int id;
    public String image;
    public String introduce;
    public String name;

    @JSONField(serialize = false)
    public int position;

    public GameRole() {
    }

    public GameRole(Parcel parcel) {
        this.id = parcel.readInt();
        this.gameBaseId = parcel.readInt();
        this.name = parcel.readString();
        this.cv = parcel.readString();
        this.icon = parcel.readString();
        this.image = parcel.readString();
        this.audio = parcel.readString();
        this.introduce = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.gameBaseId);
        parcel.writeString(this.name);
        parcel.writeString(this.cv);
        parcel.writeString(this.icon);
        parcel.writeString(this.image);
        parcel.writeString(this.audio);
        parcel.writeString(this.introduce);
    }
}
