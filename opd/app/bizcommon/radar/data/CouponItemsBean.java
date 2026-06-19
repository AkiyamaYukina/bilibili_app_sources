package com.bilibili.opd.app.bizcommon.radar.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.D;
import androidx.room.B;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/CouponItemsBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CouponItemsBean implements Parcelable {

    @Nullable
    private String bgImg;

    @Nullable
    private String img;

    @Nullable
    private String itemDesc;
    private long itemsId;

    @Nullable
    private String jumpUrl;

    @NotNull
    public static final a CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/CouponItemsBean$a.class */
    public static final class a implements Parcelable.Creator<CouponItemsBean> {
        @Override // android.os.Parcelable.Creator
        public final CouponItemsBean createFromParcel(Parcel parcel) {
            return new CouponItemsBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CouponItemsBean[] newArray(int i7) {
            return new CouponItemsBean[i7];
        }
    }

    public CouponItemsBean() {
        this(0L, null, null, null, null, 31, null);
    }

    public CouponItemsBean(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.itemsId = j7;
        this.itemDesc = str;
        this.jumpUrl = str2;
        this.img = str3;
        this.bgImg = str4;
    }

    public /* synthetic */ CouponItemsBean(long j7, String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? null : str4);
    }

    public CouponItemsBean(@NotNull Parcel parcel) {
        this(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    public static /* synthetic */ CouponItemsBean copy$default(CouponItemsBean couponItemsBean, long j7, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = couponItemsBean.itemsId;
        }
        if ((i7 & 2) != 0) {
            str = couponItemsBean.itemDesc;
        }
        if ((i7 & 4) != 0) {
            str2 = couponItemsBean.jumpUrl;
        }
        if ((i7 & 8) != 0) {
            str3 = couponItemsBean.img;
        }
        if ((i7 & 16) != 0) {
            str4 = couponItemsBean.bgImg;
        }
        return couponItemsBean.copy(j7, str, str2, str3, str4);
    }

    public final long component1() {
        return this.itemsId;
    }

    @Nullable
    public final String component2() {
        return this.itemDesc;
    }

    @Nullable
    public final String component3() {
        return this.jumpUrl;
    }

    @Nullable
    public final String component4() {
        return this.img;
    }

    @Nullable
    public final String component5() {
        return this.bgImg;
    }

    @NotNull
    public final CouponItemsBean copy(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new CouponItemsBean(j7, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponItemsBean)) {
            return false;
        }
        CouponItemsBean couponItemsBean = (CouponItemsBean) obj;
        return this.itemsId == couponItemsBean.itemsId && Intrinsics.areEqual(this.itemDesc, couponItemsBean.itemDesc) && Intrinsics.areEqual(this.jumpUrl, couponItemsBean.jumpUrl) && Intrinsics.areEqual(this.img, couponItemsBean.img) && Intrinsics.areEqual(this.bgImg, couponItemsBean.bgImg);
    }

    @Nullable
    public final String getBgImg() {
        return this.bgImg;
    }

    @Nullable
    public final String getImg() {
        return this.img;
    }

    @Nullable
    public final String getItemDesc() {
        return this.itemDesc;
    }

    public final long getItemsId() {
        return this.itemsId;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.itemsId);
        String str = this.itemDesc;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.jumpUrl;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.img;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.bgImg;
        if (str4 != null) {
            iHashCode2 = str4.hashCode();
        }
        return (((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2;
    }

    public final void setBgImg(@Nullable String str) {
        this.bgImg = str;
    }

    public final void setImg(@Nullable String str) {
        this.img = str;
    }

    public final void setItemDesc(@Nullable String str) {
        this.itemDesc = str;
    }

    public final void setItemsId(long j7) {
        this.itemsId = j7;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    @NotNull
    public String toString() {
        long j7 = this.itemsId;
        String str = this.itemDesc;
        String str2 = this.jumpUrl;
        String str3 = this.img;
        String str4 = this.bgImg;
        StringBuilder sbA = n.a(j7, "CouponItemsBean(itemsId=", ", itemDesc=", str);
        B.a(", jumpUrl=", str2, ", img=", str3, sbA);
        return D.a(", bgImg=", str4, ")", sbA);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeLong(this.itemsId);
        parcel.writeString(this.itemDesc);
        parcel.writeString(this.jumpUrl);
        parcel.writeString(this.img);
        parcel.writeString(this.bgImg);
    }
}
