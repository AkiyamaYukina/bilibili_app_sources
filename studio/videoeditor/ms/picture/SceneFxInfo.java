package com.bilibili.studio.videoeditor.ms.picture;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/picture/SceneFxInfo.class */
@Keep
public class SceneFxInfo implements Serializable, Cloneable {
    public String bClipId;
    public long duration;
    public long start;
    public int type;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/picture/SceneFxInfo$TypeScene.class */
    @Retention(RetentionPolicy.SOURCE)
    @Keep
    public @interface TypeScene {
        public static final int TYPE_NULL = 0;
        public static final int TYPE_PULL_OUT = 2;
        public static final int TYPE_PUSH_IN = 1;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SceneFxInfo m10480clone() {
        try {
            return (SceneFxInfo) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SceneFxInfo)) {
            return false;
        }
        SceneFxInfo sceneFxInfo = (SceneFxInfo) obj;
        if (this.type != sceneFxInfo.type || this.start != sceneFxInfo.start || this.duration != sceneFxInfo.duration || !Objects.equals(this.bClipId, sceneFxInfo.bClipId)) {
            z6 = false;
        }
        return z6;
    }
}
