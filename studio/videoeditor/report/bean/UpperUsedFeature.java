package com.bilibili.studio.videoeditor.report.bean;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/report/bean/UpperUsedFeature.class */
@Keep
public class UpperUsedFeature implements Serializable {
    public String at;
    public Map<String, String> extra = new HashMap();
    public int reportId;

    public UpperUsedFeature() {
    }

    public UpperUsedFeature(int i7, String str) {
        this.reportId = i7;
        this.at = str;
    }

    public UpperUsedFeature addExtra(String str, String str2) {
        if (str != null && str2 != null) {
            this.extra.put(str, str2);
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpperUsedFeature upperUsedFeature = (UpperUsedFeature) obj;
        if (this.reportId != upperUsedFeature.reportId) {
            return false;
        }
        return Objects.equals(this.at, upperUsedFeature.at);
    }

    public int hashCode() {
        int i7 = this.reportId;
        String str = this.at;
        return (i7 * 31) + (str != null ? str.hashCode() : 0);
    }
}
