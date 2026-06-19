package com.bilibili.studio.videoeditor.bgm.bgmsearch;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmsearch/BgmSearchHotWordBean.class */
@Keep
public class BgmSearchHotWordBean {

    @JSONField(name = "hotword")
    public List<HotWord> hotWordList;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmsearch/BgmSearchHotWordBean$HotWord.class */
    @Keep
    public static class HotWord {
        public long id;
        public String name;
        public int rank;
    }
}
