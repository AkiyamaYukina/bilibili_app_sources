package com.bilibili.studio.videoeditor.bgm.bgmlist.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.bgm.BgmTab;
import com.bilibili.studio.videoeditor.bgm.bgmsearch.BgmSearchHotWordBean;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/model/BgmListQueryResultBean.class */
@Keep
public class BgmListQueryResultBean {

    @JSONField(name = "bgm_abtest")
    public AbTest abTest;

    @JSONField(name = "typelist")
    public List<BgmTab> bgmTabs;

    @JSONField(name = "fav")
    public List<Bgm> fabBgms;

    @JSONField(name = "hotbgm")
    public BgmTab hotBgms;

    @JSONField(name = "hotword")
    public List<BgmSearchHotWordBean.HotWord> hotWords;

    @JSONField(name = "version")
    public long version;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/model/BgmListQueryResultBean$AbTest.class */
    @Keep
    public static class AbTest {
        public int layout;
    }
}
