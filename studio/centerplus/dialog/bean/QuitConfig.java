package com.bilibili.studio.centerplus.dialog.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/dialog/bean/QuitConfig.class */
@Keep
public class QuitConfig {

    @JSONField(name = "ab_key")
    public String abKey;

    @JSONField(name = "ab_key_v2")
    public String abKeyV2;

    @JSONField(name = "intelligence_text")
    public String intelligenceText;
    public int interval;

    @JSONField(name = "is_open")
    public Boolean isOpen = Boolean.TRUE;

    @JSONField(name = "normal_text")
    public String normalText;
}
