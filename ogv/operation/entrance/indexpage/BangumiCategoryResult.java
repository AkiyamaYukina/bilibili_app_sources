package com.bilibili.ogv.operation.entrance.indexpage;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumiCategoryResult.class */
@Keep
public class BangumiCategoryResult {
    public List<ResultBean> list;
    public int size;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/entrance/indexpage/BangumiCategoryResult$ResultBean.class */
    @Keep
    public static class ResultBean {
        public String badge;

        @JSONField(name = "badge_info")
        public BangumiBadgeInfo badgeInfo;
        public String cover;
        public String link;
        public String order;

        @JSONField(name = "order_icon")
        public String orderIcon;
        public String score;

        @JSONField(name = "season_id")
        public long seasonId;
        public String subtitle;
        public String title;

        @JSONField(name = "title_icon")
        public String titleIcon;
    }
}
