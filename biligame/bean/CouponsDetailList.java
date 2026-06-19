package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/CouponsDetailList.class */
@Keep
public final class CouponsDetailList implements Serializable {

    @JSONField(name = "coupon_info")
    @Nullable
    private VouchersDetailInfo couponInfo;

    @JSONField(name = "sealed_number")
    private int sealedNumber;

    @JSONField(name = "coupon_source")
    @NotNull
    private String couponSource = "0";

    @JSONField(name = "user_receive_status")
    @NotNull
    private String userReceive = "0";

    @JSONField(name = "show_title")
    @NotNull
    private String showTitle = "";

    @JSONField(name = "coupon_type")
    @NotNull
    private String couponType = "0";

    @JSONField(name = "coupon_id")
    @NotNull
    private String couponId = "";

    @JSONField(name = "coupon_pool_id")
    @NotNull
    private String couponPoolId = "";

    public final boolean canTake() {
        return Intrinsics.areEqual("0", this.userReceive);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String couponItemText() {
        /*
            r4 = this;
            r0 = r4
            boolean r0 = r0.isHideVoucher()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "?"
            r5 = r0
            goto L24
        Ld:
            r0 = r4
            com.bilibili.biligame.bean.VouchersDetailInfo r0 = r0.couponInfo
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L21
            r0 = r5
            java.lang.String r0 = r0.getThresholdAmountString()
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L24
        L21:
            java.lang.String r0 = ""
            r5 = r0
        L24:
            java.lang.String r0 = "满"
            r1 = r5
            java.lang.String r2 = "可用"
            java.lang.String r0 = android.support.v4.media.a.a(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.biligame.bean.CouponsDetailList.couponItemText():java.lang.String");
    }

    @NotNull
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final VouchersDetailInfo getCouponInfo() {
        return this.couponInfo;
    }

    @NotNull
    public final String getCouponPoolId() {
        return this.couponPoolId;
    }

    @NotNull
    public final String getCouponSource() {
        return this.couponSource;
    }

    @NotNull
    public final String getCouponType() {
        return this.couponType;
    }

    public final int getSealedNumber() {
        return this.sealedNumber;
    }

    @NotNull
    public final String getShowTitle() {
        return this.showTitle;
    }

    @NotNull
    public final String getUserReceive() {
        return this.userReceive;
    }

    public final boolean isHideVoucher() {
        return Intrinsics.areEqual(this.couponType, "1");
    }

    public final boolean received() {
        return Intrinsics.areEqual("1", this.userReceive);
    }

    public final void setCouponId(@NotNull String str) {
        this.couponId = str;
    }

    public final void setCouponInfo(@Nullable VouchersDetailInfo vouchersDetailInfo) {
        this.couponInfo = vouchersDetailInfo;
    }

    public final void setCouponPoolId(@NotNull String str) {
        this.couponPoolId = str;
    }

    public final void setCouponSource(@NotNull String str) {
        this.couponSource = str;
    }

    public final void setCouponType(@NotNull String str) {
        this.couponType = str;
    }

    public final void setReceived() {
        this.userReceive = "1";
    }

    public final void setSealedNumber(int i7) {
        this.sealedNumber = i7;
    }

    public final void setShowTitle(@NotNull String str) {
        this.showTitle = str;
    }

    public final void setUserReceive(@NotNull String str) {
        this.userReceive = str;
    }
}
