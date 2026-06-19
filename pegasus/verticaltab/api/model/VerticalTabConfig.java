package com.bilibili.pegasus.verticaltab.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/api/model/VerticalTabConfig.class */
@Keep
public class VerticalTabConfig {

    @JSONField(name = "autoplay_card")
    public int autoplayCard;

    @JSONField(name = "column")
    public int column;

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VerticalTabConfig verticalTabConfig = (VerticalTabConfig) obj;
        if (this.column != verticalTabConfig.column || this.autoplayCard != verticalTabConfig.autoplayCard) {
            z6 = false;
        }
        return z6;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.column), Integer.valueOf(this.autoplayCard));
    }
}
