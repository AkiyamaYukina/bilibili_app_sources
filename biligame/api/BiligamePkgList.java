package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligamePkgList.class */
@Keep
public class BiligamePkgList {
    public List<BiligameSimpleGame> list;

    @JSONField(name = "page_count")
    public int pageCount;

    @JSONField(name = "page_number")
    public int pageNum;

    @JSONField(name = "page_size")
    public int pageSize;
}
