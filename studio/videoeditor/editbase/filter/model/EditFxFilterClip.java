package com.bilibili.studio.videoeditor.editbase.filter.model;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.bean.BClip;
import com.bilibili.studio.videoeditor.nvsstreaming.EditClip;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/editbase/filter/model/EditFxFilterClip.class */
@Keep
public class EditFxFilterClip extends EditClip implements Comparable<EditFxFilterClip>, Serializable {
    private String mAppendClipId = "";

    @Nullable
    private EditFxFilter mEditFilterFx;
    private float mIntensity;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditFxFilterClip m10436clone() {
        return (EditFxFilterClip) JSON.parseObject(JSON.toJSONString(this), EditFxFilterClip.class);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull EditFxFilterClip editFxFilterClip) {
        return Long.compare(getInPoint(), editFxFilterClip.getInPoint());
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditFxFilterClip)) {
            return false;
        }
        EditFxFilterClip editFxFilterClip = (EditFxFilterClip) obj;
        if (Float.compare(editFxFilterClip.mIntensity, this.mIntensity) != 0 || !Objects.equals(this.mEditFilterFx, editFxFilterClip.mEditFilterFx) || !Objects.equals(this.mAppendClipId, editFxFilterClip.mAppendClipId)) {
            z6 = false;
        }
        return z6;
    }

    public String getAppendClipId() {
        return this.mAppendClipId;
    }

    @Nullable
    public EditFxFilter getEditFilter() {
        return this.mEditFilterFx;
    }

    @Nullable
    @JSONField(serialize = false)
    public EditFxFilter getEditFilterClone() {
        EditFxFilter editFxFilter = this.mEditFilterFx;
        if (editFxFilter != null) {
            return editFxFilter.m10435clone();
        }
        return null;
    }

    public float getIntensity() {
        return this.mIntensity;
    }

    public void setAppendClipId(String str) {
        this.mAppendClipId = str;
    }

    public void setEditFilter(@Nullable EditFxFilter editFxFilter) {
        this.mEditFilterFx = editFxFilter;
    }

    public void setIntensity(float f7) {
        this.mIntensity = f7;
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
}
