package com.bilibili.studio.comm.api.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/api/bean/ABExtraItem.class */
@Keep
public class ABExtraItem {
    public String key;
    public String type;
    public String value;

    public ABExtraItem() {
    }

    public ABExtraItem(String str, String str2, String str3) {
        this.key = str;
        this.value = str2;
        this.type = str3;
    }
}
