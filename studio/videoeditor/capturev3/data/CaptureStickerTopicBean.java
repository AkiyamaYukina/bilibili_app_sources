package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureStickerTopicBean.class */
@Keep
public class CaptureStickerTopicBean implements Serializable {

    @JSONField(name = CaptureSchema.MISSION_ID)
    public int missionId;

    @JSONField(name = "id")
    public int topicId;

    @JSONField(name = "name")
    public String topicName;

    @NotNull
    public String toString() {
        return "topic =" + this.topicId + ", topicName =" + this.topicName + ", missionId = " + this.missionId;
    }
}
