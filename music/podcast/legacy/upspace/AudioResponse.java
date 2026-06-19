package com.bilibili.music.podcast.legacy.upspace;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/upspace/AudioResponse.class */
@Keep
public class AudioResponse {
    public boolean hasNextPage;
    public List<Audio> list = new ArrayList();
    public int pages;
    public int total;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/upspace/AudioResponse$Audio.class */
    @Keep
    public static class Audio {
        public String aid;
        public String author;

        @JSONField(name = "is_cooper")
        public int contributor;
        public String cover;
        public long ctime;
        public String ctimeFmt;
        public long duration;
        public long id;
        public boolean isOff;
        public long play;
        public long reply;
        public String schema;
        public String title;
        public long uid;
        public int authType = 0;

        @JSONField(name = "limit")
        public int limitation = 0;

        @JSONField(name = "limitdesc")
        public String limitDesc = "";

        public boolean isContributor() {
            boolean z6 = true;
            if (this.contributor != 1) {
                z6 = false;
            }
            return z6;
        }
    }
}
