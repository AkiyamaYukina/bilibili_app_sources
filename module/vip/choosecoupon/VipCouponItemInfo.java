package com.bilibili.module.vip.choosecoupon;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/choosecoupon/VipCouponItemInfo.class */
@Keep
public class VipCouponItemInfo implements Parcelable {
    public static final Parcelable.Creator<VipCouponItemInfo> CREATOR = new Object();

    @JSONField(deserialize = false, serialize = false)
    public static int UNLOCK_STATE = 1;

    @JSONField(name = "coupon_amount")
    public String couponAmount;

    @JSONField(name = "coupon_discount_price")
    public String couponDiscountPrice;

    @JSONField(name = "tip_prefix")
    public String couponPart1Tip;

    @JSONField(name = "tip_suffix")
    public String couponPart2Tip;

    @JSONField(name = "coupon_token")
    public String couponToken;

    @JSONField(name = "disables_explains")
    public String disablesExplains;

    @JSONField(name = "expire_time")
    public long expireTime;

    @JSONField(name = "full_amount")
    public String fullAmount;

    @JSONField(name = "full_limit_explain")
    public String fullLimitExplain;
    public String name;

    @JSONField(name = "scope_explain")
    public String scopeExplain;

    @JSONField(name = "selected")
    public int selected;

    @JSONField(name = "start_time")
    public long startTime;
    public int state;

    @JSONField(name = "usable")
    public int usable;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/choosecoupon/VipCouponItemInfo$a.class */
    public final class a implements Parcelable.Creator<VipCouponItemInfo> {
        @Override // android.os.Parcelable.Creator
        public final VipCouponItemInfo createFromParcel(Parcel parcel) {
            return new VipCouponItemInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VipCouponItemInfo[] newArray(int i7) {
            return new VipCouponItemInfo[i7];
        }
    }

    public VipCouponItemInfo() {
    }

    public VipCouponItemInfo(Parcel parcel) {
        this.couponToken = parcel.readString();
        this.couponAmount = parcel.readString();
        this.state = parcel.readInt();
        this.fullLimitExplain = parcel.readString();
        this.scopeExplain = parcel.readString();
        this.fullAmount = parcel.readString();
        this.couponDiscountPrice = parcel.readString();
        this.startTime = parcel.readLong();
        this.expireTime = parcel.readLong();
        this.selected = parcel.readInt();
        this.disablesExplains = parcel.readString();
        this.usable = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isInvalid() {
        return TextUtils.isEmpty(this.couponAmount) || Float.valueOf(this.couponAmount).floatValue() <= 0.0f || TextUtils.isEmpty(this.couponDiscountPrice) || Float.valueOf(this.couponDiscountPrice).floatValue() <= 0.0f;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isSelected() {
        boolean z6 = true;
        if (this.selected != 1) {
            z6 = false;
        }
        return z6;
    }

    @JSONField(deserialize = false, serialize = false)
    public boolean isUsable() {
        boolean z6 = true;
        if (this.usable != 1) {
            z6 = false;
        }
        return z6;
    }

    @JSONField(deserialize = false, serialize = false)
    public void setSelected() {
        this.selected = 1;
    }

    @JSONField(deserialize = false, serialize = false)
    public void setUnselected() {
        this.selected = 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.couponToken);
        parcel.writeString(this.couponAmount);
        parcel.writeInt(this.state);
        parcel.writeString(this.fullLimitExplain);
        parcel.writeString(this.scopeExplain);
        parcel.writeString(this.fullAmount);
        parcel.writeString(this.couponDiscountPrice);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.expireTime);
        parcel.writeInt(this.selected);
        parcel.writeString(this.disablesExplains);
        parcel.writeInt(this.usable);
    }
}
