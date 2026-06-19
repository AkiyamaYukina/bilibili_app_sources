package com.bilibili.upper.module.partitionTag.partition.model;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partition/model/UpperManuscriptData.class */
@Keep
public class UpperManuscriptData implements Serializable {
    public String desc;
    public String fileName;

    @Nullable
    public String title;
    public String uploadId;

    private UpperManuscriptData() {
    }

    public static UpperManuscriptData createManuscript(String str, String str2, String str3, String str4) {
        UpperManuscriptData upperManuscriptData = new UpperManuscriptData();
        upperManuscriptData.title = str;
        upperManuscriptData.fileName = str2;
        upperManuscriptData.desc = str3;
        upperManuscriptData.uploadId = str4;
        return upperManuscriptData;
    }
}
