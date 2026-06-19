package com.bilibili.relation.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/api/AttentionGroup.class */
@Keep
public class AttentionGroup implements Parcelable {
    public static final Parcelable.Creator<AttentionGroup> CREATOR = new Object();

    @JSONField(name = "count")
    public int count;

    @Nullable
    @JSONField(name = "tagid")
    public String groupId;

    @Nullable
    @JSONField(name = "name")
    public String groupName;

    @JSONField(name = "tip")
    public String tip;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/api/AttentionGroup$a.class */
    public final class a implements Parcelable.Creator<AttentionGroup> {
        @Override // android.os.Parcelable.Creator
        public final AttentionGroup createFromParcel(Parcel parcel) {
            return new AttentionGroup(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AttentionGroup[] newArray(int i7) {
            return new AttentionGroup[i7];
        }
    }

    public AttentionGroup() {
    }

    private AttentionGroup(Parcel parcel) {
        this.groupId = parcel.readString();
        this.groupName = parcel.readString();
        this.count = parcel.readInt();
        this.tip = parcel.readString();
    }

    public /* synthetic */ AttentionGroup(Parcel parcel, int i7) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean zEquals = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttentionGroup)) {
            return false;
        }
        String str = this.groupId;
        String str2 = ((AttentionGroup) obj).groupId;
        if (str != null) {
            zEquals = str.equals(str2);
        } else if (str2 != null) {
            zEquals = false;
        }
        return zEquals;
    }

    public int hashCode() {
        String str = this.groupId;
        return str != null ? str.hashCode() : 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.groupId);
        parcel.writeString(this.groupName);
        parcel.writeInt(this.count);
        parcel.writeString(this.tip);
    }
}
