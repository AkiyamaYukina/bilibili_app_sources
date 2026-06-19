package com.bilibili.studio.editor.repository.data;

import P50.r;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/repository/data/BiliEditorTimelineVideoFx.class */
@Keep
public class BiliEditorTimelineVideoFx implements Serializable, Cloneable {
    public long duration;
    public float filterIntensity;
    public int fxType;

    @JSONField(serialize = false)
    public transient r iTimelineVideoFx;
    public String id;
    public long inPoint;
    public String licPath;
    public int materialType;
    public String name;
    public long outPoint;
    public String packageId;
    public String packagePath;

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BiliEditorTimelineVideoFx m10167clone() {
        try {
            BiliEditorTimelineVideoFx biliEditorTimelineVideoFx = (BiliEditorTimelineVideoFx) super.clone();
            biliEditorTimelineVideoFx.iTimelineVideoFx = this.iTimelineVideoFx;
            return biliEditorTimelineVideoFx;
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public boolean equals(@Nullable Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiliEditorTimelineVideoFx)) {
            return false;
        }
        BiliEditorTimelineVideoFx biliEditorTimelineVideoFx = (BiliEditorTimelineVideoFx) obj;
        if (!Objects.equals(biliEditorTimelineVideoFx.id, this.id) || !Objects.equals(biliEditorTimelineVideoFx.name, this.name) || biliEditorTimelineVideoFx.inPoint != this.inPoint || biliEditorTimelineVideoFx.outPoint != this.outPoint || biliEditorTimelineVideoFx.duration != this.duration || biliEditorTimelineVideoFx.fxType != this.fxType || !Objects.equals(biliEditorTimelineVideoFx.packagePath, this.packagePath) || !Objects.equals(biliEditorTimelineVideoFx.licPath, this.licPath) || !Float.valueOf(biliEditorTimelineVideoFx.filterIntensity).equals(Float.valueOf(this.filterIntensity)) || biliEditorTimelineVideoFx.materialType != this.materialType) {
            z6 = false;
        }
        return z6;
    }
}
