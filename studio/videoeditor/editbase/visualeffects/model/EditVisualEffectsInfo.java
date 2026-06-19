package com.bilibili.studio.videoeditor.editbase.visualeffects.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.JSON;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.util.V;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editbase/visualeffects/model/EditVisualEffectsInfo.class */
@Keep
public class EditVisualEffectsInfo implements Serializable {
    public List<EditVisualEffectClip> clips = new ArrayList();

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditVisualEffectsInfo m10443clone() {
        return (EditVisualEffectsInfo) JSON.parseObject(JSON.toJSONString(this), EditVisualEffectsInfo.class);
    }

    public boolean isEdit() {
        List<EditVisualEffectClip> list = this.clips;
        return list != null && list.size() > 0;
    }

    public void split(BClip bClip, long j7) {
        if (V.e(this.clips)) {
            return;
        }
        for (EditVisualEffectClip editVisualEffectClip : this.clips) {
            if (editVisualEffectClip.getInPoint() <= j7 && j7 <= editVisualEffectClip.getOutPoint()) {
                EditVisualEffectClip editVisualEffectClipM10441clone = editVisualEffectClip.m10441clone();
                editVisualEffectClip.setOutPoint(j7);
                editVisualEffectClipM10441clone.setInPoint(j7);
                editVisualEffectClipM10441clone.setAppendClipId(bClip.id);
                this.clips.add(editVisualEffectClipM10441clone);
                Collections.sort(this.clips);
                return;
            }
        }
    }
}
