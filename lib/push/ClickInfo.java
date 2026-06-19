package com.bilibili.lib.push;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/ClickInfo.class */
public class ClickInfo {

    @Nullable
    public String mContent;

    @Nullable
    public Map<String, String> mExtra;

    @Nullable
    public String mTasId;

    public ClickInfo(@Nullable String str, @Nullable String str2) {
        this.mTasId = str;
        this.mContent = str2;
    }

    public void addExtraInfo(String str, String str2) {
        if (this.mExtra == null) {
            this.mExtra = new HashMap();
        }
        this.mExtra.put(str, str2);
    }
}
