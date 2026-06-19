package com.bilibili.location.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/api/MapInfo.class */
@Keep
public class MapInfo {

    @JSONField(name = "ad_info")
    public AdInfo adInfo;

    @JSONField(name = "address")
    public String address;

    @JSONField(name = "address_component")
    public AddressComponent addressComponent;
    public long generateTime = -1;
    public Gps localGps;

    public AdInfo getAdInfo() {
        return this.adInfo;
    }

    public String getAddress() {
        return this.address;
    }

    public AddressComponent getAddressComponent() {
        return this.addressComponent;
    }

    public String toString() {
        return "MapInfo{address='" + this.address + "', adInfo=" + this.adInfo + ", addressComponent=" + this.addressComponent + '}';
    }
}
