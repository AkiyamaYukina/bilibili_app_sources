package com.bilibili.biligame.api.bean.gamedetail;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.BiligameVideoInfo;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/VideoPage.class */
@Keep
public class VideoPage {

    @JSONField(name = "video_list")
    public List<BiligameVideoInfo> list;

    @JSONField(name = "show_more")
    public int showMore;
}
