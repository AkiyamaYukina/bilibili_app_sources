package com.bilibili.biligame.api;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.utils.NumUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameSimpleGame.class */
@Keep
public class BiligameSimpleGame {

    @JSONField(name = "android_pkg_name")
    public String androidPkgName = "";

    @JSONField(name = "gray_android_pkg_name")
    public String androidPkgNameGray = "";

    @JSONField(name = "android_pkg_ver")
    public String androidPkgVer;

    @JSONField(name = "gray_android_pkg_ver")
    public String androidPkgVerGray;

    @JSONField(name = "expanded_name")
    public String expandedName;

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "game_name")
    public String gameName;

    @JSONField(name = "game_icon")
    public String icon;

    @JSONField(name = "is_gray")
    public boolean isGray;

    @JSONField(name = "purchase_type")
    public int purchaseType;

    public long getPkgVer() {
        return NumUtils.parseLong((this.isGray && this.purchaseType == 0 && TextUtils.equals(this.androidPkgName, this.androidPkgNameGray)) ? this.androidPkgVerGray : this.androidPkgVer);
    }
}
