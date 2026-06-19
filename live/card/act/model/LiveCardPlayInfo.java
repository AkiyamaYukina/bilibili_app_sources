package com.bilibili.live.card.act.model;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.call.KeySign;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/card/act/model/LiveCardPlayInfo.class */
@Keep
public class LiveCardPlayInfo {

    @JSONField(name = "area_id")
    public long areaId;

    @JSONField(name = "area_name")
    public String areaName;

    @Nullable
    @JSONField(name = "color")
    public Color color;

    @JSONField(name = "cover")
    public String cover;

    @Nullable
    @JSONField(name = "has_live")
    public boolean hasLive;

    @JSONField(name = "link")
    public String link;

    @JSONField(name = "live_id")
    public long liveId;

    @JSONField(name = "live_screen_type")
    public int liveScreenType;

    @JSONField(name = "live_start_time")
    public long liveStartTime;

    @JSONField(name = "live_status")
    public int liveStatus;

    @JSONField(name = "online")
    public long online;

    @JSONField(name = "parent_area_id")
    public long parentAreaId;

    @JSONField(name = "parent_area_name")
    public String parentAreaName;

    @JSONField(name = "play_type")
    public int playType;

    @JSONField(name = "room_id")
    public long roomId;

    @JSONField(name = "room_type")
    public int roomType;

    @Nullable
    @JSONField(name = "setting")
    public Setting setting;

    @JSONField(name = "title")
    public String title;

    @JSONField(name = KeySign.UID)
    public long uid;

    @Nullable
    @JSONField(name = "watched_show")
    public Watched watched;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/card/act/model/LiveCardPlayInfo$Color.class */
    @Keep
    public static class Color {

        @Nullable
        @JSONField(name = "font_color")
        public String fontColor;

        @Nullable
        @JSONField(name = "not_night")
        public Boolean notNight;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/card/act/model/LiveCardPlayInfo$Setting.class */
    @Keep
    public static class Setting {

        @JSONField(name = "display_title")
        public boolean displayTitle;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/card/act/model/LiveCardPlayInfo$Watched.class */
    @Keep
    public static class Watched {

        @Nullable
        @JSONField(name = "text_large")
        public String text;
    }
}
