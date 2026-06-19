package com.bilibili.upper.module.partitionTag.partition.model;

import android.text.TextUtils;
import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partition/model/UpperTagBean.class */
@Keep
public class UpperTagBean implements Serializable {
    public boolean isActivityTag;
    public boolean isPartRcmdTag;
    public boolean isTopicTag;
    public String tagText;

    public UpperTagBean() {
    }

    public UpperTagBean(String str, boolean z6, boolean z7, boolean z8) {
        this.tagText = str;
        this.isPartRcmdTag = z6;
        this.isActivityTag = z7;
        this.isTopicTag = z8;
    }

    public static UpperTagBean createActivityTag(String str) {
        return new UpperTagBean(str, false, true, false);
    }

    public static UpperTagBean createNormalTag(String str) {
        return new UpperTagBean(str, false, false, false);
    }

    public static UpperTagBean createPartRcmdTag(String str) {
        return new UpperTagBean(str, true, false, false);
    }

    public static UpperTagBean createTopicTag(String str) {
        return new UpperTagBean(str, false, false, true);
    }

    public UpperTagBean copy() {
        return new UpperTagBean(this.tagText, this.isPartRcmdTag, this.isActivityTag, this.isTopicTag);
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || TextUtils.isEmpty(this.tagText)) {
            return false;
        }
        UpperTagBean upperTagBean = (UpperTagBean) obj;
        if (!this.tagText.equals(upperTagBean.tagText) || this.isTopicTag != upperTagBean.isTopicTag) {
            z6 = false;
        }
        return z6;
    }
}
