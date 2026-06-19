package com.bilibili.opd.app.bizcommon.radar.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/RecommendGoodsBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RecommendGoodsBean implements Parcelable {

    @Nullable
    private String cover;

    @Nullable
    private String eventName;
    private long itemId;

    @Nullable
    private String url;

    @NotNull
    public static final a CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/RecommendGoodsBean$a.class */
    public static final class a implements Parcelable.Creator<RecommendGoodsBean> {
        @Override // android.os.Parcelable.Creator
        public final RecommendGoodsBean createFromParcel(Parcel parcel) {
            return new RecommendGoodsBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendGoodsBean[] newArray(int i7) {
            return new RecommendGoodsBean[i7];
        }
    }

    public RecommendGoodsBean() {
        this(0L, null, null, null, 15, null);
    }

    public RecommendGoodsBean(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.itemId = j7;
        this.cover = str;
        this.url = str2;
        this.eventName = str3;
    }

    public /* synthetic */ RecommendGoodsBean(long j7, String str, String str2, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RecommendGoodsBean(@NotNull Parcel parcel) {
        long j7 = parcel.readLong();
        String string = parcel.readString();
        this(j7, string == null ? "" : string, parcel.readString(), parcel.readString());
    }

    public static /* synthetic */ RecommendGoodsBean copy$default(RecommendGoodsBean recommendGoodsBean, long j7, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = recommendGoodsBean.itemId;
        }
        if ((i7 & 2) != 0) {
            str = recommendGoodsBean.cover;
        }
        if ((i7 & 4) != 0) {
            str2 = recommendGoodsBean.url;
        }
        if ((i7 & 8) != 0) {
            str3 = recommendGoodsBean.eventName;
        }
        return recommendGoodsBean.copy(j7, str, str2, str3);
    }

    public final long component1() {
        return this.itemId;
    }

    @Nullable
    public final String component2() {
        return this.cover;
    }

    @Nullable
    public final String component3() {
        return this.url;
    }

    @Nullable
    public final String component4() {
        return this.eventName;
    }

    @NotNull
    public final RecommendGoodsBean copy(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new RecommendGoodsBean(j7, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendGoodsBean)) {
            return false;
        }
        RecommendGoodsBean recommendGoodsBean = (RecommendGoodsBean) obj;
        return this.itemId == recommendGoodsBean.itemId && Intrinsics.areEqual(this.cover, recommendGoodsBean.cover) && Intrinsics.areEqual(this.url, recommendGoodsBean.url) && Intrinsics.areEqual(this.eventName, recommendGoodsBean.eventName);
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    public final String getEventName() {
        return this.eventName;
    }

    public final long getItemId() {
        return this.itemId;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.itemId);
        String str = this.cover;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.url;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.eventName;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setEventName(@Nullable String str) {
        this.eventName = str;
    }

    public final void setItemId(long j7) {
        this.itemId = j7;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    @NotNull
    public String toString() {
        long j7 = this.itemId;
        String str = this.cover;
        String str2 = this.url;
        String str3 = this.eventName;
        StringBuilder sbA = n.a(j7, "RecommendGoodsBean(itemId=", ", cover=", str);
        B.a(", url=", str2, ", eventName=", str3, sbA);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.itemId);
        parcel.writeString(this.cover);
        parcel.writeString(this.url);
        parcel.writeString(this.eventName);
    }
}
