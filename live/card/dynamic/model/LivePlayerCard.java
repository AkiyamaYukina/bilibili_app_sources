package com.bilibili.live.card.dynamic.model;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.live.streaming.source.TextSource;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/card/dynamic/model/LivePlayerCard.class */
@Keep
public class LivePlayerCard {

    @Nullable
    @JSONField(name = "live_play_info")
    public LivePlayInfoBean livePlayInfo;

    @Nullable
    @JSONField(name = "live_record_info")
    public LiveRecordInfoBean liveRecordInfo;

    @JSONField(name = "type")
    public int type;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/card/dynamic/model/LivePlayerCard$LiveCardBase.class */
    @Keep
    public static class LiveCardBase {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/card/dynamic/model/LivePlayerCard$LivePlayInfoBean.class */
    @Keep
    public static class LivePlayInfoBean extends LiveCardBase {

        @JSONField(name = "area_id")
        public long areaId;

        @JSONField(name = "area_name")
        public String areaName;

        @JSONField(name = "cover")
        public String cover;

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

        @JSONField(name = "title")
        public String title;

        @JSONField(name = KeySign.UID)
        public long uid;

        @Nullable
        @JSONField(name = "watched_show")
        public Watched watched;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/card/dynamic/model/LivePlayerCard$LivePlayInfoBean$Watched.class */
        @Keep
        public static class Watched {

            @Nullable
            @JSONField(name = "text_large")
            public String text;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/card/dynamic/model/LivePlayerCard$LiveRecordInfoBean.class */
    @Keep
    public static class LiveRecordInfoBean extends LiveCardBase {

        @JSONField(name = "area_id")
        public long areaId;

        @JSONField(name = "area_name")
        public String areaName;

        @JSONField(name = "cover")
        public String cover;

        @JSONField(name = "live_id")
        public long liveId;

        @JSONField(name = "live_screen_type")
        public int liveScreenType;

        @JSONField(name = "live_start_time")
        public int liveStartTime;

        @JSONField(name = "online")
        public long online;

        @JSONField(name = "parent_area_id")
        public long parentAreaId;

        @JSONField(name = "parent_area_name")
        public String parentAreaName;

        @JSONField(name = "play_list_info")
        public PlayListInfoBean playListInfo;

        @JSONField(name = "rid")
        public String rid;

        @JSONField(name = "room_id")
        public long roomId;

        @JSONField(name = "title")
        public String title;

        @JSONField(name = KeySign.UID)
        public long uid;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/card/dynamic/model/LivePlayerCard$LiveRecordInfoBean$PlayListInfoBean.class */
        @Keep
        public static class PlayListInfoBean {

            @JSONField(name = "length")
            public long length;

            @JSONField(name = "list")
            public List<ListBean> list;

            @JSONField(name = TextSource.CFG_SIZE)
            public long size;

            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/card/dynamic/model/LivePlayerCard$LiveRecordInfoBean$PlayListInfoBean$ListBean.class */
            @Keep
            public static class ListBean {

                @JSONField(name = "backup_url")
                public List<String> backupUrl;

                @JSONField(name = "length")
                public long length;

                @JSONField(name = TextSource.CFG_SIZE)
                public long size;

                @JSONField(name = "url")
                public String url;
            }
        }
    }
}
