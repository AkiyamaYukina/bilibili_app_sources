package com.bilibili.mall;

import androidx.annotation.Keep;
import com.alibaba.fastjson.JSONObject;
import d3.C6781b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/IpDeviceInfo.class */
@Keep
public final class IpDeviceInfo {

    @Nullable
    private String characterUUID;

    @Nullable
    private JSONObject customInfo;

    @Nullable
    private String deviceName;

    @Nullable
    private String firmId;

    @Nullable
    private String firmInfo;

    @Nullable
    private String macAddress;

    @Nullable
    private String productModel;

    @Nullable
    private String productType;

    @Nullable
    private String serviceUUID;

    @Nullable
    public final String getCharacterUUID() {
        return this.characterUUID;
    }

    @Nullable
    public final JSONObject getCustomInfo() {
        return this.customInfo;
    }

    @NotNull
    public final String getDeviceId() {
        return C6781b.a(this.firmInfo, this.firmId, this.productType, this.productModel);
    }

    @Nullable
    public final String getDeviceName() {
        return this.deviceName;
    }

    @Nullable
    public final String getFirmId() {
        return this.firmId;
    }

    @Nullable
    public final String getFirmInfo() {
        return this.firmInfo;
    }

    @Nullable
    public final String getMacAddress() {
        return this.macAddress;
    }

    @Nullable
    public final String getProductModel() {
        return this.productModel;
    }

    @Nullable
    public final String getProductType() {
        return this.productType;
    }

    @Nullable
    public final String getServiceUUID() {
        return this.serviceUUID;
    }

    public final void setCharacterUUID(@Nullable String str) {
        this.characterUUID = str;
    }

    public final void setCustomInfo(@Nullable JSONObject jSONObject) {
        this.customInfo = jSONObject;
    }

    public final void setDeviceName(@Nullable String str) {
        this.deviceName = str;
    }

    public final void setFirmId(@Nullable String str) {
        this.firmId = str;
    }

    public final void setFirmInfo(@Nullable String str) {
        this.firmInfo = str;
    }

    public final void setMacAddress(@Nullable String str) {
        this.macAddress = str;
    }

    public final void setProductModel(@Nullable String str) {
        this.productModel = str;
    }

    public final void setProductType(@Nullable String str) {
        this.productType = str;
    }

    public final void setServiceUUID(@Nullable String str) {
        this.serviceUUID = str;
    }
}
