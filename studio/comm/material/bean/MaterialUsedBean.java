package com.bilibili.studio.comm.material.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.collection.C3269h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/bean/MaterialUsedBean.class */
@Keep
public class MaterialUsedBean {
    public static int MATERIAL_ADD = 0;
    public static int MATERIAL_DELETE = 1;
    public String filePath;
    public int usedType;

    public MaterialUsedBean() {
    }

    public MaterialUsedBean(String str) {
        this.filePath = str;
        this.usedType = MATERIAL_ADD;
    }

    public MaterialUsedBean(String str, int i7) {
        this.filePath = str;
        this.usedType = i7;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaterialUsedBean{filePath='");
        sb.append(this.filePath);
        sb.append("', usedType=");
        return C3269h.a(sb, this.usedType, '}');
    }
}
