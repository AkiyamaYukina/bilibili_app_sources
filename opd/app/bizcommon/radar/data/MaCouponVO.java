package com.bilibili.opd.app.bizcommon.radar.data;

import G0.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.G;
import androidx.room.B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/MaCouponVO.class */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
public final class MaCouponVO implements Parcelable {

    @Nullable
    private String couponAmount;
    private int couponFloatStatus;

    @Nullable
    private String couponId;

    @Nullable
    private String couponName;

    @Nullable
    private String couponSubTitle;
    private long couponValidTime;

    @Nullable
    private String rightsId;

    @Nullable
    private String unit;

    @NotNull
    public static final Parcelable.Creator<MaCouponVO> CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/MaCouponVO$a.class */
    public static final class a implements Parcelable.Creator<MaCouponVO> {
        @Override // android.os.Parcelable.Creator
        public final MaCouponVO createFromParcel(Parcel parcel) {
            return new MaCouponVO(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MaCouponVO[] newArray(int i7) {
            return new MaCouponVO[i7];
        }
    }

    public MaCouponVO() {
        this(null, null, null, null, null, null, 0L, 0, 255, null);
    }

    public MaCouponVO(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j7, int i7) {
        this.rightsId = str;
        this.couponId = str2;
        this.couponName = str3;
        this.couponSubTitle = str4;
        this.couponAmount = str5;
        this.unit = str6;
        this.couponValidTime = j7;
        this.couponFloatStatus = i7;
    }

    public /* synthetic */ MaCouponVO(String str, String str2, String str3, String str4, String str5, String str6, long j7, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? "" : str4, (i8 & 16) != 0 ? "" : str5, (i8 & 32) != 0 ? "" : str6, (i8 & 64) != 0 ? 0L : j7, (i8 & 128) != 0 ? 0 : i7);
    }

    public static /* synthetic */ MaCouponVO copy$default(MaCouponVO maCouponVO, String str, String str2, String str3, String str4, String str5, String str6, long j7, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = maCouponVO.rightsId;
        }
        if ((i8 & 2) != 0) {
            str2 = maCouponVO.couponId;
        }
        if ((i8 & 4) != 0) {
            str3 = maCouponVO.couponName;
        }
        if ((i8 & 8) != 0) {
            str4 = maCouponVO.couponSubTitle;
        }
        if ((i8 & 16) != 0) {
            str5 = maCouponVO.couponAmount;
        }
        if ((i8 & 32) != 0) {
            str6 = maCouponVO.unit;
        }
        if ((i8 & 64) != 0) {
            j7 = maCouponVO.couponValidTime;
        }
        if ((i8 & 128) != 0) {
            i7 = maCouponVO.couponFloatStatus;
        }
        return maCouponVO.copy(str, str2, str3, str4, str5, str6, j7, i7);
    }

    @Nullable
    public final String component1() {
        return this.rightsId;
    }

    @Nullable
    public final String component2() {
        return this.couponId;
    }

    @Nullable
    public final String component3() {
        return this.couponName;
    }

    @Nullable
    public final String component4() {
        return this.couponSubTitle;
    }

    @Nullable
    public final String component5() {
        return this.couponAmount;
    }

    @Nullable
    public final String component6() {
        return this.unit;
    }

    public final long component7() {
        return this.couponValidTime;
    }

    public final int component8() {
        return this.couponFloatStatus;
    }

    @NotNull
    public final MaCouponVO copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j7, int i7) {
        return new MaCouponVO(str, str2, str3, str4, str5, str6, j7, i7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaCouponVO)) {
            return false;
        }
        MaCouponVO maCouponVO = (MaCouponVO) obj;
        return Intrinsics.areEqual(this.rightsId, maCouponVO.rightsId) && Intrinsics.areEqual(this.couponId, maCouponVO.couponId) && Intrinsics.areEqual(this.couponName, maCouponVO.couponName) && Intrinsics.areEqual(this.couponSubTitle, maCouponVO.couponSubTitle) && Intrinsics.areEqual(this.couponAmount, maCouponVO.couponAmount) && Intrinsics.areEqual(this.unit, maCouponVO.unit) && this.couponValidTime == maCouponVO.couponValidTime && this.couponFloatStatus == maCouponVO.couponFloatStatus;
    }

    @Nullable
    public final String getCouponAmount() {
        return this.couponAmount;
    }

    public final int getCouponFloatStatus() {
        return this.couponFloatStatus;
    }

    @Nullable
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final String getCouponName() {
        return this.couponName;
    }

    @Nullable
    public final String getCouponSubTitle() {
        return this.couponSubTitle;
    }

    public final long getCouponValidTime() {
        return this.couponValidTime;
    }

    @Nullable
    public final String getRightsId() {
        return this.rightsId;
    }

    @Nullable
    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        String str = this.rightsId;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.couponId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.couponName;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.couponSubTitle;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.couponAmount;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.unit;
        if (str6 != null) {
            iHashCode = str6.hashCode();
        }
        return Integer.hashCode(this.couponFloatStatus) + C3554n0.a(((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31, 31, this.couponValidTime);
    }

    public final void setCouponAmount(@Nullable String str) {
        this.couponAmount = str;
    }

    public final void setCouponFloatStatus(int i7) {
        this.couponFloatStatus = i7;
    }

    public final void setCouponId(@Nullable String str) {
        this.couponId = str;
    }

    public final void setCouponName(@Nullable String str) {
        this.couponName = str;
    }

    public final void setCouponSubTitle(@Nullable String str) {
        this.couponSubTitle = str;
    }

    public final void setCouponValidTime(long j7) {
        this.couponValidTime = j7;
    }

    public final void setRightsId(@Nullable String str) {
        this.rightsId = str;
    }

    public final void setUnit(@Nullable String str) {
        this.unit = str;
    }

    @NotNull
    public String toString() {
        String str = this.rightsId;
        String str2 = this.couponId;
        String str3 = this.couponName;
        String str4 = this.couponSubTitle;
        String str5 = this.couponAmount;
        String str6 = this.unit;
        long j7 = this.couponValidTime;
        int i7 = this.couponFloatStatus;
        StringBuilder sbA = b.a("MaCouponVO(rightsId=", str, ", couponId=", str2, ", couponName=");
        B.a(str3, ", couponSubTitle=", str4, ", couponAmount=", sbA);
        B.a(str5, ", unit=", str6, ", couponValidTime=", sbA);
        G.a(i7, j7, ", couponFloatStatus=", sbA);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.rightsId);
        parcel.writeString(this.couponId);
        parcel.writeString(this.couponName);
        parcel.writeString(this.couponSubTitle);
        parcel.writeString(this.couponAmount);
        parcel.writeString(this.unit);
        parcel.writeLong(this.couponValidTime);
        parcel.writeInt(this.couponFloatStatus);
    }
}
