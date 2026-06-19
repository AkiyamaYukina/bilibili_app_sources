package com.bilibili.music.podcast.collection.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/api/PlaySeason.class */
@Keep
public class PlaySeason {
    public static final long INVALID_SEASON_ID = -1;

    @JSONField(name = "id")
    public long id;

    @JSONField(name = "name")
    public String name;
}
