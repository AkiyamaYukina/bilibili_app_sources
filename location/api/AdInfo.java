package com.bilibili.location.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/api/AdInfo.class */
@Keep
public class AdInfo {

    @JSONField(name = "adcode")
    public String adcode;

    @JSONField(name = "city_code")
    public String cityCode;

    @JSONField(name = "gps")
    public Gps gps;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "nation_code")
    public String nationCode;

    public String getAdcode() {
        return this.adcode;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public Gps getGps() {
        return this.gps;
    }

    public String getName() {
        return this.name;
    }

    public String getNationCode() {
        return this.nationCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdInfo{adcode='");
        sb.append(this.adcode);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', cityCode='");
        sb.append(this.cityCode);
        sb.append("', gps=");
        sb.append(this.gps);
        sb.append(", nationCode='");
        return C8770a.a(sb, this.nationCode, "'}");
    }
}
