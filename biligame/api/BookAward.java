package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.live.streaming.source.TextSource;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BookAward.class */
@Keep
public class BookAward implements Serializable {

    @JSONField(name = "order_immediate_reward")
    public BookAwardInfo bookReward;

    @JSONField(name = "order_count")
    public int currentCount;

    @JSONField(name = "reward")
    public List<BookAwardInfo> rewardList;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BookAward$BookAwardInfo.class */
    @Keep
    public static class BookAwardInfo implements Serializable {

        @JSONField(name = TextSource.CFG_CONTENT)
        public String content;

        @JSONField(name = "count")
        public float count;

        @JSONField(name = "level")
        public int level;

        @JSONField(name = "pic")
        public String pic;
    }
}
