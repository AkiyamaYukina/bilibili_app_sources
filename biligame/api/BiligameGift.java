package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGift.class */
@Keep
public class BiligameGift {

    @JSONField(name = "android_pkg_name")
    public String androidPkgName;

    @JSONField(name = "expanded_name")
    public String expandedName;

    @JSONField(name = "game_base_id")
    public String gameBaseId;

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "gift_list")
    public List<BiligameGiftDetail> giftList;

    @JSONField(name = "gift_num")
    public String giftNum;

    @JSONField(name = "icon")
    public String icon;

    @JSONField(name = "is_show")
    public String isShow = "true";

    public boolean isShowGift() {
        return "true".equals(this.isShow);
    }
}
