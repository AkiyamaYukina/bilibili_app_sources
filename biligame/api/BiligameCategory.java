package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameCategory.class */
@Keep
public class BiligameCategory implements Serializable {

    @JSONField(name = "game_count")
    public String gameCount;
    public boolean isSelected;

    @JSONField(name = "tag_icon")
    public String tagIcon;

    @JSONField(name = "tag_id")
    public String tagId = "";

    @JSONField(name = "tag_name")
    public String tagName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.tagId.equals(((BiligameCategory) obj).tagId);
    }
}
