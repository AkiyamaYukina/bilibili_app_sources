package com.bilibili.relation.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/relation/api/AttentionList.class */
@Keep
public class AttentionList {

    @JSONField(name = "re_version")
    public String hashVersion;
    public List<Attention> list;
}
