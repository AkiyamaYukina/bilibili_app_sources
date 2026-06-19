package com.bilibili.upper.module.honour.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/bean/KingHonourTopicBean.class */
@Keep
public class KingHonourTopicBean implements Serializable {
    public static final int SERVER_CONFIGURED = 1;
    public static final int TEMPLATE_BOUND = 0;
    public static final int USER_SEARCHED = 2;
    public int sourceFrom = 1;

    @JSONField(name = "id")
    public long topicId;

    @JSONField(name = "name")
    public String topicName;

    public KingHonourTopicBean() {
    }

    public KingHonourTopicBean(long j7, String str) {
        this.topicId = j7;
        this.topicName = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KingHonourTopicBean) {
            return Objects.equals(this.topicName, ((KingHonourTopicBean) obj).topicName);
        }
        return false;
    }

    public int hashCode() {
        String str = this.topicName;
        return str != null ? str.hashCode() + 527 : 17;
    }

    public boolean isAvailable() {
        return this.topicId > 0 && !TextUtils.isEmpty(this.topicName);
    }
}
