package com.bilibili.studio.centerplus.network.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/TypeChild.class */
@Keep
public class TypeChild implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<TypeChild> CREATOR = new Object();

    @JSONField(name = "copy_right")
    public int copy_right;

    @JSONField(name = "count")
    public long count;

    @JSONField(name = "desc")
    public String desc;

    @JSONField(name = "id")
    public long id;

    @JSONField(name = "intro_copy")
    public String introCopy;

    @JSONField(name = "intro_original")
    public String introOriginal;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "notice")
    public String notice;

    @JSONField(name = "parent")
    public long parent;

    @JSONField(name = "show")
    public boolean show;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/TypeChild$a.class */
    public final class a implements Parcelable.Creator<TypeChild> {
        @Override // android.os.Parcelable.Creator
        public final TypeChild createFromParcel(Parcel parcel) {
            return new TypeChild(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TypeChild[] newArray(int i7) {
            return new TypeChild[i7];
        }
    }

    public TypeChild() {
    }

    public TypeChild(Parcel parcel) {
        this.id = parcel.readLong();
        this.name = parcel.readString();
        this.desc = parcel.readString();
        this.introOriginal = parcel.readString();
        this.introCopy = parcel.readString();
        this.notice = parcel.readString();
        this.parent = parcel.readLong();
        this.count = parcel.readLong();
        this.copy_right = parcel.readInt();
        this.show = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.desc);
        parcel.writeString(this.introOriginal);
        parcel.writeString(this.introCopy);
        parcel.writeString(this.notice);
        parcel.writeLong(this.parent);
        parcel.writeLong(this.count);
        parcel.writeInt(this.copy_right);
        parcel.writeByte(this.show ? (byte) 1 : (byte) 0);
    }
}
