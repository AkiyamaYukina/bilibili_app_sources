package com.bilibili.location.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/location/api/AddressComponent.class */
@Keep
public class AddressComponent {

    @JSONField(name = "city")
    public String city;

    @JSONField(name = "district")
    public String district;

    @JSONField(name = "nation")
    public String nation;

    @JSONField(name = "province")
    public String province;

    @JSONField(name = "street")
    public String street;

    @JSONField(name = "street_number")
    public String streetNumber;

    public String getCity() {
        return this.city;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getNation() {
        return this.nation;
    }

    public String getProvince() {
        return this.province;
    }

    public String getStreet() {
        return this.street;
    }

    public String getStreetNumber() {
        return this.streetNumber;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AddressComponent{province='");
        sb.append(this.province);
        sb.append("', nation='");
        sb.append(this.nation);
        sb.append("', city='");
        sb.append(this.city);
        sb.append("', street='");
        sb.append(this.street);
        sb.append("', district='");
        sb.append(this.district);
        sb.append("', streetNumber='");
        return C8770a.a(sb, this.streetNumber, "'}");
    }
}
