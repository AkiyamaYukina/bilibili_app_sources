package com.bilibili.studio.videoeditor.report.bean;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/report/bean/UpperUsedMaterial.class */
@Keep
public class UpperUsedMaterial implements Serializable {
    public String at;
    public Map<String, String> extra = new HashMap();
    public long materialId;
    public int reportId;

    public UpperUsedMaterial() {
    }

    public UpperUsedMaterial(int i7, long j7, String str) {
        this.reportId = i7;
        this.materialId = j7;
        this.at = str;
    }

    public UpperUsedMaterial addExtra(String str, String str2) {
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
        UpperUsedMaterial upperUsedMaterial = (UpperUsedMaterial) obj;
        if (this.reportId == upperUsedMaterial.reportId && this.materialId == upperUsedMaterial.materialId) {
            return Objects.equals(this.at, upperUsedMaterial.at);
        }
        return false;
    }

    public int hashCode() {
        int i7 = this.reportId;
        long j7 = this.materialId;
        int i8 = (int) (j7 ^ (j7 >>> 32));
        String str = this.at;
        return (((i7 * 31) + i8) * 31) + (str != null ? str.hashCode() : 0);
    }
}
