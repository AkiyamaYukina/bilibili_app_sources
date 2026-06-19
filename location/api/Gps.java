package com.bilibili.location.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/api/Gps.class */
@Keep
public class Gps {

    @JSONField(name = "lat")
    public double lat;

    @JSONField(name = "lng")
    public double lng;

    public Gps() {
    }

    public Gps(double d7, double d8) {
        this.lng = d8;
        this.lat = d7;
    }

    public double getLat() {
        return this.lat;
    }

    public double getLng() {
        return this.lng;
    }
}
