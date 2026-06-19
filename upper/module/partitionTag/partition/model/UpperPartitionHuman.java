package com.bilibili.upper.module.partitionTag.partition.model;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partition/model/UpperPartitionHuman.class */
@Keep
public class UpperPartitionHuman implements Serializable {
    public long id;
    public String name;

    public UpperPartitionHuman() {
    }

    public UpperPartitionHuman(String str, int i7) {
        this.name = str;
        this.id = i7;
    }
}
