package com.bilibili.studio.centerplus.network.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/Type.class */
@Keep
public class Type implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<Type> CREATOR = new Object();

    @JSONField(name = "copy_right")
    public long copy_right;

    @JSONField(name = "count")
    public long count;

    @JSONField(name = "desc")
    public String desc;

    @JSONField(name = "id")
    public int id;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "parent")
    public long parent;

    @JSONField(name = "show")
    public boolean show;

    @JSONField(name = "children")
    public List<TypeChild> typeChildren;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/Type$a.class */
    public final class a implements Parcelable.Creator<Type> {
        @Override // android.os.Parcelable.Creator
        public final Type createFromParcel(Parcel parcel) {
            return new Type(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Type[] newArray(int i7) {
            return new Type[i7];
        }
    }

    public Type() {
    }

    public Type(Parcel parcel) {
        this.id = parcel.readInt();
        this.parent = parcel.readLong();
        this.name = parcel.readString();
        this.desc = parcel.readString();
        this.count = parcel.readLong();
        ArrayList arrayList = new ArrayList();
        this.typeChildren = arrayList;
        parcel.readList(arrayList, TypeChild.class.getClassLoader());
        this.show = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.id);
        parcel.writeLong(this.parent);
        parcel.writeString(this.name);
        parcel.writeString(this.desc);
        parcel.writeLong(this.count);
        parcel.writeList(this.typeChildren);
        parcel.writeByte(this.show ? (byte) 1 : (byte) 0);
    }
}
