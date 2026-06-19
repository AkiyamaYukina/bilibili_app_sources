package com.bilibili.studio.editor.smarttitle.constans;

import androidx.annotation.Keep;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/constans/SmartTitleFawkesConfig.class */
@Keep
public class SmartTitleFawkesConfig {

    @JSONField(name = "default_title")
    public JSONObject defaultTitle;

    @JSONField(name = "smart_title_config")
    public SmartTitleConfig smartTitleConfig;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/smarttitle/constans/SmartTitleFawkesConfig$SmartTitleConfig.class */
    @Keep
    public static class SmartTitleConfig {

        @JSONField(name = "default_limit_time")
        public long defaultLimitTime = 10000;

        @JSONField(name = "edit_default_count")
        public int editDefaultCount = 1;
    }
}
