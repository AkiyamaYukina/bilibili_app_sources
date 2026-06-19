package com.bilibili.studio.videoeditor.capturev3.followtogether;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureStickerBeanV3;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/followtogether/FtMaterialAidCidBeanV3.class */
@Keep
public class FtMaterialAidCidBeanV3 {

    @JSONField(name = "material_aid")
    public long aid;

    @JSONField(name = "material_cid")
    public long cid;

    @JSONField(name = "download_url")
    public String downloadUrl;

    @JSONField(name = "position")
    public int position;

    @JSONField(name = "sticker")
    public CaptureStickerBeanV3 sticker;

    @JSONField(name = "style")
    public int style;

    @JSONField(name = CaptureSchema.TOPIC_ID)
    public long topicId;
}
