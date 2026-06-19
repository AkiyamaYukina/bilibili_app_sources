package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.report.ReportExtra;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligamePage.class */
@Keep
public class BiligamePage<T> {

    @JSONField(name = "has_more")
    public boolean hasMore;
    public List<T> list;

    @JSONField(name = "page_count")
    public int pageCount;

    @JSONField(name = "page_number")
    public int pageNumber;

    @JSONField(name = "page_size")
    public int pageSize;

    @JSONField(name = "total_count")
    public int totalCount;

    public ReportExtra getReportExtra() {
        ReportExtra reportExtraPut = ReportExtra.create(6).put("page_number", Integer.valueOf(this.pageNumber)).put("page_size", Integer.valueOf(this.pageSize)).put("page_count", Integer.valueOf(this.pageCount)).put("total_count", Integer.valueOf(this.totalCount)).put("has_more", Boolean.valueOf(this.hasMore));
        List<T> list = this.list;
        return reportExtraPut.put("cur_page_result_size", Integer.valueOf(list == null ? 0 : list.size()));
    }
}
