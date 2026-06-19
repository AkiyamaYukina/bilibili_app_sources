package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/GameActivitiesInfo.class */
@Keep
public class GameActivitiesInfo implements Serializable {

    @JSONField(name = "activity_list")
    public List<GameActInfo> activityList;

    @JSONField(name = "has_activity")
    public boolean hasActivity;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/GameActivitiesInfo$GameActInfo.class */
    @Keep
    public static class GameActInfo implements Serializable {

        @JSONField(name = "activity_id")
        public String activityId;

        @JSONField(name = "activity_type")
        public int activityType;

        @JSONField(name = "jump_url")
        public String jumpUrl;
    }
}
