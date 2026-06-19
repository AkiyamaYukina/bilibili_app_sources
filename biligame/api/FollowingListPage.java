package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.ui.graphics.f0;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/FollowingListPage.class */
@Keep
public class FollowingListPage {
    public List<FollowingUserInfo> list;

    @JSONField(name = "page_number")
    public int pageNumber;

    @JSONField(name = "total_count")
    public int totalCount;

    public String toString() {
        StringBuilder sb = new StringBuilder("FollowingListPage{pageNumber=");
        sb.append(this.pageNumber);
        sb.append(", totalCount=");
        sb.append(this.totalCount);
        sb.append(", list=");
        return f0.a(sb, this.list, '}');
    }
}
