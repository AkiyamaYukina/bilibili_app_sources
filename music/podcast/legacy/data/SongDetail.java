package com.bilibili.music.podcast.legacy.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/data/SongDetail.class */
@Keep
public class SongDetail {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/data/SongDetail$SongCate.class */
    @Keep
    public static class SongCate extends BaseNetBean {
        public static final SongCate EMPTY = new SongCate();
        public int cateId;
        public String cateInfo = "";
    }
}
