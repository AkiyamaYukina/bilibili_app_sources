package com.bilibili.biligame.api;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameTag.class */
@Keep
public class BiligameTag implements Serializable {
    public String icon;
    public boolean isSameServerTag;
    public String name;

    @JSONField(name = "tag_name")
    public String tagName;

    @JSONField(name = "tag_id")
    public String tagid;
    public int type;

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiligameTag)) {
            return false;
        }
        BiligameTag biligameTag = (BiligameTag) obj;
        if (this.tagid != biligameTag.tagid || this.type != biligameTag.type || !TextUtils.equals(this.name, biligameTag.name) || !TextUtils.equals(this.icon, biligameTag.icon)) {
            z6 = false;
        }
        return z6;
    }
}
