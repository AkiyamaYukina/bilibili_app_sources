package com.bilibili.studio.videoeditor.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/VideoEditorTabInfo.class */
@Keep
public class VideoEditorTabInfo {

    @JSONField(name = "tab")
    public List<VideoEditorTabItemInfo> tab;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/VideoEditorTabInfo$VideoEditorTabItemInfo.class */
    @Keep
    public static class VideoEditorTabItemInfo {

        @JSONField(name = "icon")
        public String icon;

        @JSONField(name = "name")
        public String name;

        @JSONField(name = "type")
        public int type;
    }
}
