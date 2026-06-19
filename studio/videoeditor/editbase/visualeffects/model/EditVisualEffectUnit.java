package com.bilibili.studio.videoeditor.editbase.visualeffects.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.JSON;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editbase/visualeffects/model/EditVisualEffectUnit.class */
@Keep
public class EditVisualEffectUnit implements Serializable {
    private EditVisualEffect mEditVisualEffect;
    private float mIntensity;

    private EditVisualEffectUnit() {
    }

    public EditVisualEffectUnit(EditVisualEffect editVisualEffect) {
        this.mEditVisualEffect = editVisualEffect;
        this.mIntensity = editVisualEffect.intensity;
    }

    public EditVisualEffectUnit(EditVisualEffect editVisualEffect, float f7) {
        this.mEditVisualEffect = editVisualEffect;
        this.mIntensity = f7;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditVisualEffectUnit m10442clone() {
        return (EditVisualEffectUnit) JSON.parseObject(JSON.toJSONString(this), EditVisualEffectUnit.class);
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditVisualEffectUnit)) {
            return false;
        }
        EditVisualEffectUnit editVisualEffectUnit = (EditVisualEffectUnit) obj;
        if (Float.compare(editVisualEffectUnit.mIntensity, this.mIntensity) != 0 || !Objects.equals(this.mEditVisualEffect, editVisualEffectUnit.mEditVisualEffect)) {
            z6 = false;
        }
        return z6;
    }

    public EditVisualEffect getEditVisualEffect() {
        return this.mEditVisualEffect;
    }

    public float getIntensity() {
        return this.mIntensity;
    }

    public void setEditVisualEffect(EditVisualEffect editVisualEffect) {
        this.mEditVisualEffect = editVisualEffect;
    }

    public void setIntensity(float f7) {
        this.mIntensity = f7;
    }
}
