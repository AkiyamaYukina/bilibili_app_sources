package com.bilibili.studio.centerplus.network.entity;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/ChargeLevelItem.class */
@Keep
public class ChargeLevelItem implements Serializable {
    public String id;

    @JSONField(name = "publish_info")
    public Info info;

    @JSONField(name = "upower_intro")
    public String intro;

    @JSONField(name = "upower_level_str")
    public String levelStr;

    @JSONField(name = "level_price")
    public int price;

    @JSONField(name = "upower_title")
    public String title;

    @JSONField(name = "privilege_type")
    public int type;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/ChargeLevelItem$Info.class */
    @Keep
    public static class Info implements Serializable {

        @JSONField(name = "level_sub_title_prefix")
        public String subTitlePrefix;

        @JSONField(name = "level_sub_title_suffix")
        public String subTitleSuffix;

        @JSONField(name = "level_title_str")
        public String titleStr;
    }
}
