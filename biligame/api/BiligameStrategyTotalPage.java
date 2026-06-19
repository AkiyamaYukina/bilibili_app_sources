package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.ui.graphics.f0;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameStrategyTotalPage.class */
@Keep
public class BiligameStrategyTotalPage {
    public List<BiligameStrategyPage> list;

    @JSONField(name = "page_number")
    public int pageNumber;

    @JSONField(name = "page_size")
    public int pageSize;

    public String toString() {
        StringBuilder sb = new StringBuilder("BiligameStrategyTotalPage{pageNumber=");
        sb.append(this.pageNumber);
        sb.append(", pageSize=");
        sb.append(this.pageSize);
        sb.append(", list=");
        return f0.a(sb, this.list, '}');
    }
}
