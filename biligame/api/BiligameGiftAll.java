package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGiftAll.class */
@Keep
public class BiligameGiftAll {

    @JSONField(name = "android_pkg_name")
    public String androidPkgName;

    @JSONField(name = "android_pkg_size")
    public String androidPkgSize;

    @JSONField(name = "android_pkg_ver")
    public String androidPkgVer;

    @JSONField(name = "expanded_name")
    public String expandedName;

    @JSONField(name = "game_base_id")
    public String gameBaseId;

    @JSONField(name = "game_icon")
    public String gameIcon;

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "gift_count")
    public int giftCount;

    @JSONField(name = "gift_list")
    public List<BiligameGiftDetail> giftList;

    @JSONField(name = "is_show")
    public String isShow = "true";

    public boolean isShow() {
        return this.isShow.equals("true");
    }
}
