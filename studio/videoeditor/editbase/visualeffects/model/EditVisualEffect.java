package com.bilibili.studio.videoeditor.editbase.visualeffects.model;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.JSON;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editbase/visualeffects/model/EditVisualEffect.class */
@Keep
public class EditVisualEffect implements Serializable {
    public String id;
    public float intensity;
    public String property;
    public String type;

    private EditVisualEffect() {
        this.intensity = 0.0f;
        this.type = "undefine";
        this.id = "undefine";
        this.property = "undefine";
    }

    public EditVisualEffect(String str, String str2, String str3, float f7) {
        this.type = str;
        this.id = str2;
        this.property = str3;
        this.intensity = f7;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditVisualEffect m10440clone() {
        return (EditVisualEffect) JSON.parseObject(JSON.toJSONString(this), EditVisualEffect.class);
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditVisualEffect)) {
            return false;
        }
        EditVisualEffect editVisualEffect = (EditVisualEffect) obj;
        if (Float.compare(editVisualEffect.intensity, this.intensity) != 0 || !Objects.equals(this.type, editVisualEffect.type) || !Objects.equals(this.id, editVisualEffect.id) || !Objects.equals(this.property, editVisualEffect.property)) {
            z6 = false;
        }
        return z6;
    }

    @NonNull
    public String toString() {
        return "type: " + this.type + " id: " + this.id + " property: " + this.property;
    }
}
