package com.bilibili.studio.videoeditor.editbase.filter.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.JSON;
import com.bilibili.studio.videoeditor.editbase.filter.net.EditFxFilterBean;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editbase/filter/model/EditFxFilter.class */
@Keep
public class EditFxFilter implements Serializable {
    public int id;
    public int rank;
    public int type;
    public String packageId = "";
    public String path = "";
    public String lic = "";
    public String name = "";
    public String category = "";
    public String downloadUrl = "";
    public float intensity = 1.0f;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditFxFilter m10435clone() {
        return (EditFxFilter) JSON.parseObject(JSON.toJSONString(this), EditFxFilter.class);
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditFxFilter)) {
            return false;
        }
        EditFxFilter editFxFilter = (EditFxFilter) obj;
        if (this.id != editFxFilter.id || Float.compare(editFxFilter.intensity, this.intensity) != 0 || this.type != editFxFilter.type || this.rank != editFxFilter.rank || !Objects.equals(this.packageId, editFxFilter.packageId) || !Objects.equals(this.path, editFxFilter.path) || !Objects.equals(this.lic, editFxFilter.lic) || !Objects.equals(this.name, editFxFilter.name) || !Objects.equals(this.category, editFxFilter.category) || !Objects.equals(this.downloadUrl, editFxFilter.downloadUrl)) {
            z6 = false;
        }
        return z6;
    }

    public void update(EditFxFilterBean.FxDataBean fxDataBean) {
        this.id = fxDataBean.id;
        String str = fxDataBean.name;
        if (str != null) {
            this.name = str;
        }
        int i7 = fxDataBean.filterType;
        this.type = i7;
        this.rank = fxDataBean.rank;
        String str2 = fxDataBean.downloadUrl;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        this.downloadUrl = str3;
        if (i7 == 1) {
            this.packageId = "Lut";
        }
    }

    public void update(String str, String str2, String str3) {
        this.path = str;
        this.lic = str2;
        this.packageId = str3;
    }
}
