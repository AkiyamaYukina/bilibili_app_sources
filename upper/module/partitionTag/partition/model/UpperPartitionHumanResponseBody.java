package com.bilibili.upper.module.partitionTag.partition.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/partitionTag/partition/model/UpperPartitionHumanResponseBody.class */
@Keep
public class UpperPartitionHumanResponseBody implements Serializable {

    @JSONField(name = "type_list")
    public List<UpperPartitionHuman> list;
}
