package com.bilibili.upper.module.datacollect.bean;

import androidx.annotation.Keep;
import androidx.compose.ui.graphics.f0;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/datacollect/bean/MaterialUploadConfig.class */
@Keep
public class MaterialUploadConfig implements Serializable {

    @JSONField(name = "file_paths")
    public List<String> filePaths;

    public String toString() {
        return f0.a(new StringBuilder("MaterialUploadConfig{, filePaths="), this.filePaths, '}');
    }
}
