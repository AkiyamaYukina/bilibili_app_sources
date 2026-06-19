package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameGiftIcon.class */
@Keep
public class BiligameGiftIcon implements Serializable {

    @JSONField(name = "icon")
    public String icon;

    @JSONField(name = "icon_desc")
    public String iconDesc;

    @JSONField(name = "icon_num")
    public String iconNum;
}
