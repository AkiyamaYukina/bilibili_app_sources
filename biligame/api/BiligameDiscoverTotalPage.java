package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameDiscoverTotalPage.class */
@Keep
public class BiligameDiscoverTotalPage {
    public List<BiligameDiscoverPage> list;

    @JSONField(name = "page_number")
    public int pageNumber;

    @JSONField(name = "page_size")
    public int pageSize;

    public String toString() {
        return "pageNumber:" + this.pageNumber + ",pageSize:" + this.pageSize + ",list:" + this.list.toString();
    }
}
