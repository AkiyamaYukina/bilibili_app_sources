package com.bilibili.studio.videoeditor.bgm;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.live.streaming.source.TextSource;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/BgmDynamic.class */
@Keep
public class BgmDynamic {

    @JSONField(name = "cdns")
    public List<String> cdns;

    @JSONField(name = "info")
    public String info;

    @JSONField(name = "sid")
    public long sid;

    @JSONField(name = TextSource.CFG_SIZE)
    public long size;

    @JSONField(name = "timeout")
    public long timeout;

    @JSONField(name = "type")
    public int type;
}
