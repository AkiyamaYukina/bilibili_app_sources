package com.bilibili.pegasus.channelv2.detail.tab.baike.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.p;
import com.alibaba.fastjson.annotation.JSONField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/model/ChannelBaikeInfo.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class ChannelBaikeInfo implements Parcelable {

    @JSONField(name = "baike_name")
    @Nullable
    private String baikeName;

    @JSONField(name = "desc")
    @Nullable
    private String desc;

    @NotNull
    public static final Parcelable.Creator<ChannelBaikeInfo> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/model/ChannelBaikeInfo$a.class */
    public static final class a implements Parcelable.Creator<ChannelBaikeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ChannelBaikeInfo createFromParcel(Parcel parcel) {
            return new ChannelBaikeInfo(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelBaikeInfo[] newArray(int i7) {
            return new ChannelBaikeInfo[i7];
        }
    }

    public ChannelBaikeInfo() {
        this(null, null, 3, null);
    }

    public ChannelBaikeInfo(@Nullable String str, @Nullable String str2) {
        this.baikeName = str;
        this.desc = str2;
    }

    public /* synthetic */ ChannelBaikeInfo(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ ChannelBaikeInfo copy$default(ChannelBaikeInfo channelBaikeInfo, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = channelBaikeInfo.baikeName;
        }
        if ((i7 & 2) != 0) {
            str2 = channelBaikeInfo.desc;
        }
        return channelBaikeInfo.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.baikeName;
    }

    @Nullable
    public final String component2() {
        return this.desc;
    }

    @NotNull
    public final ChannelBaikeInfo copy(@Nullable String str, @Nullable String str2) {
        return new ChannelBaikeInfo(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelBaikeInfo)) {
            return false;
        }
        ChannelBaikeInfo channelBaikeInfo = (ChannelBaikeInfo) obj;
        return Intrinsics.areEqual(this.baikeName, channelBaikeInfo.baikeName) && Intrinsics.areEqual(this.desc, channelBaikeInfo.desc);
    }

    @Nullable
    public final String getBaikeName() {
        return this.baikeName;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public int hashCode() {
        String str = this.baikeName;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.desc;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final void setBaikeName(@Nullable String str) {
        this.baikeName = str;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    @NotNull
    public String toString() {
        return p.a("ChannelBaikeInfo(baikeName=", this.baikeName, ", desc=", this.desc, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.baikeName);
        parcel.writeString(this.desc);
    }
}
