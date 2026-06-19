package com.bilibili.upper.module.partitionTag.partition.model;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partition/model/UpperTagBeanV5.class */
@Keep
public class UpperTagBeanV5 implements Serializable {
    public static final int ACTIVITY = 2;
    public static final int NORMAL = 0;
    public static final int RECOMMEND = 1;
    public String tagText;
    public int type;

    public UpperTagBeanV5() {
        this.type = 0;
    }

    public UpperTagBeanV5(String str, int i7) {
        this.tagText = str;
        this.type = i7;
    }
}
