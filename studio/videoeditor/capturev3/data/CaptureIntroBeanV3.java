package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureIntroBeanV3.class */
@Keep
public class CaptureIntroBeanV3 {

    @JSONField(name = "cover")
    public String cover;

    @JSONField(name = "ctime")
    public long ctime;

    @JSONField(name = "id")
    public long id;

    @JSONField(name = "mtime")
    public long mtime;

    @JSONField(name = "name")
    public String name;

    @JSONField(name = "sticker")
    public CaptureStickerBeanV3 sticker;

    public String toString() {
        return "CaptureIntroBeanV3{id=" + this.id + ", name='" + this.name + "', cover='" + this.cover + "', mtime=" + this.mtime + ", ctime=" + this.ctime + ", sticker=" + this.sticker + '}';
    }
}
