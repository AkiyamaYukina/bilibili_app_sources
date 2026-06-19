package com.bilibili.studio.videoeditor.bgm.bgmlist.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/model/BgmPageQueryResultBean.class */
@Keep
public class BgmPageQueryResultBean {

    @JSONField(name = "list")
    public List<Bgm> bgms;

    @JSONField(name = "pager")
    public Pager pager;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/model/BgmPageQueryResultBean$Pager.class */
    @Keep
    public static class Pager {

        @JSONField(name = "pn")
        public int pageNumber;

        @JSONField(name = "ps")
        public int pageSize;

        @JSONField(name = "total")
        public int total;
    }
}
