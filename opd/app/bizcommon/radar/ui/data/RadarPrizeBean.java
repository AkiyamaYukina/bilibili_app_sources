package com.bilibili.opd.app.bizcommon.radar.ui.data;

import G0.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.A;
import androidx.room.B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/data/RadarPrizeBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RadarPrizeBean implements Parcelable {

    @Nullable
    private String discount;

    @Nullable
    private String discountCondition;

    @Nullable
    private String discountDesc;

    @Nullable
    private String prizeName;

    @Nullable
    private String prizeNum;

    @Nullable
    private String prizeNumRgb;

    @Nullable
    private String unit;

    @Nullable
    private String unitIcon;

    @NotNull
    public static final a CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/data/RadarPrizeBean$a.class */
    public static final class a implements Parcelable.Creator<RadarPrizeBean> {
        @Override // android.os.Parcelable.Creator
        public final RadarPrizeBean createFromParcel(Parcel parcel) {
            return new RadarPrizeBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RadarPrizeBean[] newArray(int i7) {
            return new RadarPrizeBean[i7];
        }
    }

    public RadarPrizeBean() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RadarPrizeBean(@NotNull Parcel parcel) {
        String string = parcel.readString();
        string = string == null ? "" : string;
        String string2 = parcel.readString();
        string2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        string3 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        string4 = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        string5 = string5 == null ? "" : string5;
        String string6 = parcel.readString();
        string6 = string6 == null ? "" : string6;
        String string7 = parcel.readString();
        string7 = string7 == null ? "" : string7;
        String string8 = parcel.readString();
        this(string, string2, string3, string4, string5, string6, string7, string8 == null ? "" : string8);
    }

    public RadarPrizeBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.prizeName = str;
        this.unit = str2;
        this.prizeNum = str3;
        this.prizeNumRgb = str4;
        this.unitIcon = str5;
        this.discountDesc = str6;
        this.discountCondition = str7;
        this.discount = str8;
    }

    public /* synthetic */ RadarPrizeBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? "" : str4, (i7 & 16) != 0 ? "" : str5, (i7 & 32) != 0 ? "" : str6, (i7 & 64) != 0 ? "" : str7, (i7 & 128) != 0 ? "" : str8);
    }

    public static /* synthetic */ RadarPrizeBean copy$default(RadarPrizeBean radarPrizeBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = radarPrizeBean.prizeName;
        }
        if ((i7 & 2) != 0) {
            str2 = radarPrizeBean.unit;
        }
        if ((i7 & 4) != 0) {
            str3 = radarPrizeBean.prizeNum;
        }
        if ((i7 & 8) != 0) {
            str4 = radarPrizeBean.prizeNumRgb;
        }
        if ((i7 & 16) != 0) {
            str5 = radarPrizeBean.unitIcon;
        }
        if ((i7 & 32) != 0) {
            str6 = radarPrizeBean.discountDesc;
        }
        if ((i7 & 64) != 0) {
            str7 = radarPrizeBean.discountCondition;
        }
        if ((i7 & 128) != 0) {
            str8 = radarPrizeBean.discount;
        }
        return radarPrizeBean.copy(str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Nullable
    public final String component1() {
        return this.prizeName;
    }

    @Nullable
    public final String component2() {
        return this.unit;
    }

    @Nullable
    public final String component3() {
        return this.prizeNum;
    }

    @Nullable
    public final String component4() {
        return this.prizeNumRgb;
    }

    @Nullable
    public final String component5() {
        return this.unitIcon;
    }

    @Nullable
    public final String component6() {
        return this.discountDesc;
    }

    @Nullable
    public final String component7() {
        return this.discountCondition;
    }

    @Nullable
    public final String component8() {
        return this.discount;
    }

    @NotNull
    public final RadarPrizeBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        return new RadarPrizeBean(str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadarPrizeBean)) {
            return false;
        }
        RadarPrizeBean radarPrizeBean = (RadarPrizeBean) obj;
        return Intrinsics.areEqual(this.prizeName, radarPrizeBean.prizeName) && Intrinsics.areEqual(this.unit, radarPrizeBean.unit) && Intrinsics.areEqual(this.prizeNum, radarPrizeBean.prizeNum) && Intrinsics.areEqual(this.prizeNumRgb, radarPrizeBean.prizeNumRgb) && Intrinsics.areEqual(this.unitIcon, radarPrizeBean.unitIcon) && Intrinsics.areEqual(this.discountDesc, radarPrizeBean.discountDesc) && Intrinsics.areEqual(this.discountCondition, radarPrizeBean.discountCondition) && Intrinsics.areEqual(this.discount, radarPrizeBean.discount);
    }

    @Nullable
    public final String getDiscount() {
        return this.discount;
    }

    @Nullable
    public final String getDiscountCondition() {
        return this.discountCondition;
    }

    @Nullable
    public final String getDiscountDesc() {
        return this.discountDesc;
    }

    @Nullable
    public final String getPrizeName() {
        return this.prizeName;
    }

    @Nullable
    public final String getPrizeNum() {
        return this.prizeNum;
    }

    @Nullable
    public final String getPrizeNumRgb() {
        return this.prizeNumRgb;
    }

    @Nullable
    public final String getUnit() {
        return this.unit;
    }

    @Nullable
    public final String getUnitIcon() {
        return this.unitIcon;
    }

    public int hashCode() {
        String str = this.prizeName;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.unit;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.prizeNum;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.prizeNumRgb;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.unitIcon;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.discountDesc;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.discountCondition;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.discount;
        if (str8 != null) {
            iHashCode = str8.hashCode();
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode;
    }

    public final void setDiscount(@Nullable String str) {
        this.discount = str;
    }

    public final void setDiscountCondition(@Nullable String str) {
        this.discountCondition = str;
    }

    public final void setDiscountDesc(@Nullable String str) {
        this.discountDesc = str;
    }

    public final void setPrizeName(@Nullable String str) {
        this.prizeName = str;
    }

    public final void setPrizeNum(@Nullable String str) {
        this.prizeNum = str;
    }

    public final void setPrizeNumRgb(@Nullable String str) {
        this.prizeNumRgb = str;
    }

    public final void setUnit(@Nullable String str) {
        this.unit = str;
    }

    public final void setUnitIcon(@Nullable String str) {
        this.unitIcon = str;
    }

    @NotNull
    public String toString() {
        String str = this.prizeName;
        String str2 = this.unit;
        String str3 = this.prizeNum;
        String str4 = this.prizeNumRgb;
        String str5 = this.unitIcon;
        String str6 = this.discountDesc;
        String str7 = this.discountCondition;
        String str8 = this.discount;
        StringBuilder sbA = b.a("RadarPrizeBean(prizeName=", str, ", unit=", str2, ", prizeNum=");
        B.a(str3, ", prizeNumRgb=", str4, ", unitIcon=", sbA);
        B.a(str5, ", discountDesc=", str6, ", discountCondition=", sbA);
        return A.a(str7, ", discount=", str8, ")", sbA);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.prizeName);
        parcel.writeString(this.unit);
        parcel.writeString(this.prizeNum);
        parcel.writeString(this.prizeNumRgb);
        parcel.writeString(this.unitIcon);
        parcel.writeString(this.discountDesc);
        parcel.writeString(this.discountCondition);
        parcel.writeString(this.discount);
    }
}
