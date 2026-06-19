package com.bilibili.biligame.api.bean.discover;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.api.GameVideoInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/discover/BiligameBetaGame.class */
@Keep
public class BiligameBetaGame extends BiligameMainGame {

    @JSONField(name = "book_num")
    public String bookNum;

    @JSONField(name = "download_count")
    public String downloadCount;

    @JSONField(name = "first_image")
    public String firstImage;

    @JSONField(name = "rank_info")
    public RankInfo rankInfo;

    @JSONField(name = "video_image")
    public String videoImage;

    @JSONField(name = "video_info")
    public GameVideoInfo videoInfo;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/discover/BiligameBetaGame$RankInfo.class */
    @Keep
    public static class RankInfo {
        public int index;
        public String name;
        public int type;
    }
}
