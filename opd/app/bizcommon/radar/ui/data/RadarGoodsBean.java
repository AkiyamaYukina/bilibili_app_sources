package com.bilibili.opd.app.bizcommon.radar.ui.data;

import G0.b;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.A;
import androidx.room.B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/data/RadarGoodsBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RadarGoodsBean {
    public static final int $stable = 8;

    @Nullable
    private String goodsName;

    @Nullable
    private String goodsTag;

    @Nullable
    private String imgUrl;

    @Nullable
    private String jumpUrl;

    @Nullable
    private String priceString;

    @Nullable
    private String priceSymbol;

    public RadarGoodsBean() {
        this(null, null, null, null, null, null, 63, null);
    }

    public RadarGoodsBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.imgUrl = str;
        this.goodsTag = str2;
        this.goodsName = str3;
        this.priceString = str4;
        this.priceSymbol = str5;
        this.jumpUrl = str6;
    }

    public /* synthetic */ RadarGoodsBean(String str, String str2, String str3, String str4, String str5, String str6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5, (i7 & 32) != 0 ? null : str6);
    }

    public static /* synthetic */ RadarGoodsBean copy$default(RadarGoodsBean radarGoodsBean, String str, String str2, String str3, String str4, String str5, String str6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = radarGoodsBean.imgUrl;
        }
        if ((i7 & 2) != 0) {
            str2 = radarGoodsBean.goodsTag;
        }
        if ((i7 & 4) != 0) {
            str3 = radarGoodsBean.goodsName;
        }
        if ((i7 & 8) != 0) {
            str4 = radarGoodsBean.priceString;
        }
        if ((i7 & 16) != 0) {
            str5 = radarGoodsBean.priceSymbol;
        }
        if ((i7 & 32) != 0) {
            str6 = radarGoodsBean.jumpUrl;
        }
        return radarGoodsBean.copy(str, str2, str3, str4, str5, str6);
    }

    @Nullable
    public final String component1() {
        return this.imgUrl;
    }

    @Nullable
    public final String component2() {
        return this.goodsTag;
    }

    @Nullable
    public final String component3() {
        return this.goodsName;
    }

    @Nullable
    public final String component4() {
        return this.priceString;
    }

    @Nullable
    public final String component5() {
        return this.priceSymbol;
    }

    @Nullable
    public final String component6() {
        return this.jumpUrl;
    }

    @NotNull
    public final RadarGoodsBean copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new RadarGoodsBean(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadarGoodsBean)) {
            return false;
        }
        RadarGoodsBean radarGoodsBean = (RadarGoodsBean) obj;
        return Intrinsics.areEqual(this.imgUrl, radarGoodsBean.imgUrl) && Intrinsics.areEqual(this.goodsTag, radarGoodsBean.goodsTag) && Intrinsics.areEqual(this.goodsName, radarGoodsBean.goodsName) && Intrinsics.areEqual(this.priceString, radarGoodsBean.priceString) && Intrinsics.areEqual(this.priceSymbol, radarGoodsBean.priceSymbol) && Intrinsics.areEqual(this.jumpUrl, radarGoodsBean.jumpUrl);
    }

    @Nullable
    public final String getGoodsName() {
        return this.goodsName;
    }

    @Nullable
    public final String getGoodsTag() {
        return this.goodsTag;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getPriceString() {
        return this.priceString;
    }

    @Nullable
    public final String getPriceSymbol() {
        return this.priceSymbol;
    }

    public int hashCode() {
        String str = this.imgUrl;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.goodsTag;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.goodsName;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.priceString;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.priceSymbol;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.jumpUrl;
        if (str6 != null) {
            iHashCode = str6.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode;
    }

    public final void setGoodsName(@Nullable String str) {
        this.goodsName = str;
    }

    public final void setGoodsTag(@Nullable String str) {
        this.goodsTag = str;
    }

    public final void setImgUrl(@Nullable String str) {
        this.imgUrl = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setPriceString(@Nullable String str) {
        this.priceString = str;
    }

    public final void setPriceSymbol(@Nullable String str) {
        this.priceSymbol = str;
    }

    @NotNull
    public String toString() {
        String str = this.imgUrl;
        String str2 = this.goodsTag;
        String str3 = this.goodsName;
        String str4 = this.priceString;
        String str5 = this.priceSymbol;
        String str6 = this.jumpUrl;
        StringBuilder sbA = b.a("RadarGoodsBean(imgUrl=", str, ", goodsTag=", str2, ", goodsName=");
        B.a(str3, ", priceString=", str4, ", priceSymbol=", sbA);
        return A.a(str5, ", jumpUrl=", str6, ")", sbA);
    }
}
