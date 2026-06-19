package com.bilibili.studio.videoeditor.editbase.visualeffects.model;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.nvsstreaming.EditClip;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editbase/visualeffects/model/EditVisualEffectClip.class */
@Keep
public class EditVisualEffectClip extends EditClip implements Comparable<EditVisualEffectClip>, Serializable {
    private List<EditVisualEffectUnit> mVisualEffectsUnits = new ArrayList();
    private String mAppendClipId = "";

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditVisualEffectClip m10441clone() {
        return (EditVisualEffectClip) JSON.parseObject(JSON.toJSONString(this), EditVisualEffectClip.class);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull EditVisualEffectClip editVisualEffectClip) {
        return Long.compare(getInPoint(), editVisualEffectClip.getInPoint());
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditVisualEffectClip)) {
            return false;
        }
        EditVisualEffectClip editVisualEffectClip = (EditVisualEffectClip) obj;
        if (!Objects.equals(this.mVisualEffectsUnits, editVisualEffectClip.mVisualEffectsUnits) || !Objects.equals(this.mAppendClipId, editVisualEffectClip.mAppendClipId)) {
            z6 = false;
        }
        return z6;
    }

    @Nullable
    public EditVisualEffectUnit get(EditVisualEffect editVisualEffect) {
        if (editVisualEffect == null) {
            return null;
        }
        for (EditVisualEffectUnit editVisualEffectUnit : this.mVisualEffectsUnits) {
            EditVisualEffect editVisualEffect2 = editVisualEffectUnit.getEditVisualEffect();
            if (editVisualEffect2 != null && TextUtils.equals(editVisualEffect2.id, editVisualEffect.id) && TextUtils.equals(editVisualEffect2.property, editVisualEffect.property)) {
                return editVisualEffectUnit;
            }
        }
        return null;
    }

    public String getAppendClipId() {
        return this.mAppendClipId;
    }

    public List<EditVisualEffectUnit> getApply() {
        return this.mVisualEffectsUnits;
    }

    public List<EditVisualEffectUnit> getVisualEffectsUnits() {
        return this.mVisualEffectsUnits;
    }

    public void reset() {
        for (EditVisualEffectUnit editVisualEffectUnit : this.mVisualEffectsUnits) {
            editVisualEffectUnit.setIntensity(editVisualEffectUnit.getEditVisualEffect().intensity);
        }
    }

    public void setAppendClipId(String str) {
        this.mAppendClipId = str;
    }

    public void setVisualEffectsUnits(List<EditVisualEffectUnit> list) {
        this.mVisualEffectsUnits = list;
    }

    public void update(BClip bClip) {
        if (bClip == null) {
            return;
        }
        setInPoint(bClip.getInPoint());
        setOutPoint(bClip.getOutPoint());
        setTrimIn(bClip.getTrimIn());
        setTrimOut(bClip.getTrimOut());
        this.mAppendClipId = bClip.id;
    }

    public void update(EditVisualEffect editVisualEffect, float f7) {
        EditVisualEffectUnit editVisualEffectUnit = get(editVisualEffect);
        if (editVisualEffectUnit != null) {
            editVisualEffectUnit.setIntensity(f7);
        } else {
            this.mVisualEffectsUnits.add(new EditVisualEffectUnit(editVisualEffect, f7));
        }
    }
}
