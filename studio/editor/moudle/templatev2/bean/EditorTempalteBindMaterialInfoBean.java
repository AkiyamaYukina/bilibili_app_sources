package com.bilibili.studio.editor.moudle.templatev2.bean;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/bean/EditorTempalteBindMaterialInfoBean.class */
@Keep
public class EditorTempalteBindMaterialInfoBean implements Serializable {
    private List<String> audioId;
    private List<String> sticker;
    private List<String> textId;
    private List<String> videoId;

    public List<String> getAudioId() {
        return this.audioId;
    }

    public List<String> getSticker() {
        return this.sticker;
    }

    public List<String> getTextId() {
        return this.textId;
    }

    public List<String> getVideoId() {
        return this.videoId;
    }

    public void setAudioId(List<String> list) {
        this.audioId = list;
    }

    public void setSticker(List<String> list) {
        this.sticker = list;
    }

    public void setTextId(List<String> list) {
        this.textId = list;
    }

    public void setVideoId(List<String> list) {
        this.videoId = list;
    }
}
