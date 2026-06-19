package com.bilibili.search2.result.vertical.live.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.WatchedShow;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/data/WatchedInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class WatchedInfo implements Parcelable {

    @JvmField
    @JSONField(name = "icon")
    @Nullable
    public String icon;

    @JvmField
    @JSONField(name = "num")
    public int num;

    @JvmField
    @JSONField(name = "switch")
    public boolean switched;

    @JvmField
    @JSONField(name = "text_large")
    @Nullable
    public String textLarge;

    @JvmField
    @JSONField(name = "text_small")
    @Nullable
    public String textSmall;

    @NotNull
    public static final a CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/data/WatchedInfo$a.class */
    public static final class a implements Parcelable.Creator<WatchedInfo> {
        @Override // android.os.Parcelable.Creator
        public final WatchedInfo createFromParcel(Parcel parcel) {
            return new WatchedInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WatchedInfo[] newArray(int i7) {
            return new WatchedInfo[i7];
        }
    }

    public WatchedInfo() {
    }

    public WatchedInfo(@NotNull Parcel parcel) {
        this();
        this.switched = parcel.readByte() != 0;
        this.num = parcel.readInt();
        this.textSmall = parcel.readString();
        this.textLarge = parcel.readString();
        this.icon = parcel.readString();
    }

    public WatchedInfo(@NotNull WatchedShow watchedShow) {
        this();
        this.switched = watchedShow.getSwitch();
        this.num = (int) watchedShow.getNum();
        this.textSmall = watchedShow.getTextSmall();
        this.textLarge = watchedShow.getTextLarge();
        this.icon = watchedShow.getIcon();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeByte(this.switched ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.num);
        parcel.writeString(this.textSmall);
        parcel.writeString(this.textLarge);
        parcel.writeString(this.icon);
    }
}
