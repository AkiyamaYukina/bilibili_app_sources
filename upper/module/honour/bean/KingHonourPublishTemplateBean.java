package com.bilibili.upper.module.honour.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/bean/KingHonourPublishTemplateBean.class */
@Keep
public class KingHonourPublishTemplateBean implements Serializable {
    public String cover;

    @JSONField(name = "desc")
    public String desc;

    @JSONField(name = "download_url")
    public String downloadUrl;
    public long id;
    public String name;

    @JSONField(name = CaptureSchema.TOPIC_ID)
    public long topicId;

    @JSONField(name = CaptureSchema.TOPIC_NAME)
    public String topicName;
}
