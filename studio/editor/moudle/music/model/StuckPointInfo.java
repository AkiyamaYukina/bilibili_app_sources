package com.bilibili.studio.editor.moudle.music.model;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/model/StuckPointInfo.class */
@Keep
public class StuckPointInfo implements Serializable, Cloneable {
    public String comment;
    public long point;
    public int recommend;

    public StuckPointInfo() {
    }

    public StuckPointInfo(long j7) {
        this.point = j7;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public StuckPointInfo m10125clone() {
        try {
            return (StuckPointInfo) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            return null;
        }
    }
}
