package com.bilibili.studio.comm.api.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/api/bean/ABData.class */
@Keep
public class ABData {

    @JSONField(name = "ab_test_map")
    public HashMap<String, String> map;
    public String msg;
}
