package com.bilibili.studio.comm.material.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/bean/MaterialUploadBean.class */
@Keep
public class MaterialUploadBean {

    @NonNull
    public HashMap<String, UploadData> uploadDataMap = new HashMap<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/bean/MaterialUploadBean$UploadData.class */
    @Keep
    public static class UploadData {
        public String filePath;
        public String materialId;
        public String taskId;
    }
}
