package com.bilibili.studio.videoeditor.bgm;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/BgmTab.class */
@Keep
public class BgmTab extends Bgm {

    @Nullable
    @JSONField(name = "children")
    public ArrayList<Bgm> children;

    @JSONField(name = "child_cnt")
    public int count;

    @Nullable
    @JSONField(name = "icon")
    public String coverUrl;
    public int currentPage;
    public boolean hasDisplayed;

    @JSONField(name = "id")
    public long id;

    @JSONField(name = "index")
    public long index;

    @Nullable
    @JSONField(name = "name")
    public String name;

    @JSONField(name = "pid")
    public long pid;
}
